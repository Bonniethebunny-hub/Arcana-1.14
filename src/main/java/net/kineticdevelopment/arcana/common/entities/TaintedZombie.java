package net.kineticdevelopment.arcana.common.entities;


import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

import javax.annotation.Nullable;

import net.kineticdevelopment.arcana.common.init.ModEntities;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTDynamicOps;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.GroundPathNavigator;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;


public class TaintedZombie extends ZombieEntity {
	   private static final UUID BABY_SPEED_BOOST_ID = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
	   private static final AttributeModifier BABY_SPEED_BOOST = new AttributeModifier(BABY_SPEED_BOOST_ID, "Baby speed boost", 0.5D, AttributeModifier.Operation.MULTIPLY_BASE);
	   private static final DataParameter<Boolean> IS_CHILD = EntityDataManager.createKey(TaintedZombie.class, DataSerializers.BOOLEAN);
	   private static final DataParameter<Integer> VILLAGER_TYPE = EntityDataManager.createKey(TaintedZombie.class, DataSerializers.VARINT);
	   private static final DataParameter<Boolean> DROWNING = EntityDataManager.createKey(TaintedZombie.class, DataSerializers.BOOLEAN);
	   private static final Predicate<Difficulty> field_213699_bC = (p_213697_0_) -> {
	      return p_213697_0_ == Difficulty.HARD;
	   };
	   private final BreakDoorGoal breakDoor = new BreakDoorGoal(this, field_213699_bC);
	   private boolean isBreakDoorsTaskSet;
	   private int inWaterTime;
	   private int drownedConversionTime;

		public TaintedZombie(EntityType<? extends ZombieEntity> type, World worldIn) {
		   super((EntityType<? extends ZombieEntity>) ModEntities.ARCANA_TAINTED_ZOMBIE, worldIn);
	   }


	   protected void registerGoals() {
	      this.goalSelector.addGoal(4, new TaintedZombie.AttackTurtleEggGoal(this, 1.0D, 3));
	      this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
	      this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
	      this.applyEntityAI();
	   }

	   protected void applyEntityAI() {
	      this.goalSelector.addGoal(6, new MoveThroughVillageGoal(this, 1.0D, true, 4, this::isBreakDoorsTaskSet));
	      this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
	      this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setCallsForHelp(ZombiePigmanEntity.class));
	      this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
	      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
	      this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, TurtleEntity.class, 10, true, false, TurtleEntity.TARGET_DRY_BABY));
	   }

	   protected void registerAttributes() {
	      super.registerAttributes();
	      this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
	      this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double)0.23F);
	      this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
	      this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	   }

	   protected void registerData() {
	      super.registerData();
	      this.getDataManager().register(IS_CHILD, false);
	      this.getDataManager().register(VILLAGER_TYPE, 0);
	      this.getDataManager().register(DROWNING, false);
	   }

	   public boolean isDrowning() {
	      return this.getDataManager().get(DROWNING);
	   }

	   public boolean isBreakDoorsTaskSet() {
	      return this.isBreakDoorsTaskSet;
	   }

	   /**
	    * Sets or removes EntityAIBreakDoor task
	    */
	   public void setBreakDoorsAItask(boolean enabled) {
	      if (this.canBreakDoors()) {
	         if (this.isBreakDoorsTaskSet != enabled) {
	            this.isBreakDoorsTaskSet = enabled;
	            ((GroundPathNavigator)this.getNavigator()).setBreakDoors(enabled);
	            if (enabled) {
	               this.goalSelector.addGoal(1, this.breakDoor);
	            } else {
	               this.goalSelector.removeGoal(this.breakDoor);
	            }
	         }
	      } else if (this.isBreakDoorsTaskSet) {
	         this.goalSelector.removeGoal(this.breakDoor);
	         this.isBreakDoorsTaskSet = false;
	      }

	   }

	   protected boolean canBreakDoors() {
	      return true;
	   }

	   /**
	    * If Animal, checks if the age timer is negative
	    */
	   public boolean isChild() {
	      return this.getDataManager().get(IS_CHILD);
	   }

	   /**
	    * Get the experience points the entity currently has.
	    */
	   protected int getExperiencePoints(PlayerEntity player) {
	      if (this.isChild()) {
	         this.experienceValue = (int)((float)this.experienceValue * 2.5F);
	      }

	      return super.getExperiencePoints(player);
	   }

	   /**
	    * Set whether this zombie is a child.
	    */
	   public void setChild(boolean childZombie) {
	      this.getDataManager().set(IS_CHILD, childZombie);
	      if (this.world != null && !this.world.isRemote) {
	         IAttributeInstance iattributeinstance = this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
	         iattributeinstance.removeModifier(BABY_SPEED_BOOST);
	         if (childZombie) {
	            iattributeinstance.applyModifier(BABY_SPEED_BOOST);
	         }
	      }

	   }

	   public void notifyDataManagerChange(DataParameter<?> key) {
	      if (IS_CHILD.equals(key)) {
	         this.recalculateSize();
	      }

	      super.notifyDataManagerChange(key);
	   }

	   protected boolean shouldDrown() {
	      return true;
	   }

	   /**
	    * Called to update the entity's position/logic.
	    */
	   public void tick() {
	      super.tick();
	   }

	   /**
	    * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	    * use this to react to sunlight and start to burn.
	    */
	   public void livingTick() {
	      if (this.isAlive()) {
	         boolean flag = this.shouldBurnInDay() && this.isInDaylight();
	         if (flag) {
	            ItemStack itemstack = this.getItemStackFromSlot(EquipmentSlotType.HEAD);
	            if (!itemstack.isEmpty()) {
	               if (itemstack.isDamageable()) {
	                  itemstack.setDamage(itemstack.getDamage() + this.rand.nextInt(2));
	                  if (itemstack.getDamage() >= itemstack.getMaxDamage()) {
	                     this.sendBreakAnimation(EquipmentSlotType.HEAD);
	                     this.setItemStackToSlot(EquipmentSlotType.HEAD, ItemStack.EMPTY);
	                  }
	               }

	               flag = false;
	            }

	            if (flag) {
	               this.setFire(8);
	            }
	         }
	      }

	      super.livingTick();
	   }

	   private void startDrowning(int p_204704_1_) {
	      this.drownedConversionTime = p_204704_1_;
	      this.getDataManager().set(DROWNING, true);
	   }

	   @SuppressWarnings("deprecation")
	protected void func_213698_b(EntityType<? extends ZombieEntity> p_213698_1_) {
	      if (!this.removed) {
	         TaintedZombie zombieentity = (TaintedZombie) p_213698_1_.create(this.world);
			  assert zombieentity != null;
			  zombieentity.copyLocationAndAnglesFrom(this);
	         zombieentity.setCanPickUpLoot(this.canPickUpLoot());
	         zombieentity.setBreakDoorsAItask(zombieentity.canBreakDoors() && this.isBreakDoorsTaskSet());
	         zombieentity.applyAttributeBonuses(zombieentity.world.getDifficultyForLocation(new BlockPos(zombieentity)).getClampedAdditionalDifficulty());
	         zombieentity.setChild(this.isChild());
	         zombieentity.setNoAI(this.isAIDisabled());

	         for(EquipmentSlotType equipmentslottype : EquipmentSlotType.values()) {
	            ItemStack itemstack = this.getItemStackFromSlot(equipmentslottype);
	            if (!itemstack.isEmpty()) {
	               zombieentity.setItemStackToSlot(equipmentslottype, itemstack.copy());
	               zombieentity.setDropChance(equipmentslottype, this.getDropChance(equipmentslottype));
	               itemstack.setCount(0);
	            }
	         }

	         if (this.hasCustomName()) {
	            zombieentity.setCustomName(this.getCustomName());
	            zombieentity.setCustomNameVisible(this.isCustomNameVisible());
	         }

	         this.world.addEntity(zombieentity);
	         this.remove();
	      }
	   }

	   protected boolean shouldBurnInDay() {
	      return true;
	   }

	   /**
	    * Called when the entity is attacked.
	    */
	   public boolean attackEntityFrom(DamageSource source, float amount) {
	      if (super.attackEntityFrom(source, amount)) {
	         LivingEntity livingentity = this.getAttackTarget();
	         if (livingentity == null && source.getTrueSource() instanceof LivingEntity) {
	            livingentity = (LivingEntity)source.getTrueSource();
	         }

	         return true;
	      } else {
	         return false;
	      }
	   }

	   public boolean attackEntityAsMob(Entity entityIn) {
	      boolean flag = super.attackEntityAsMob(entityIn);
	      if (flag) {
	         float f = this.world.getDifficultyForLocation(new BlockPos(this)).getAdditionalDifficulty();
	         if (this.getHeldItemMainhand().isEmpty() && this.isBurning() && this.rand.nextFloat() < f * 0.3F) {
	            entityIn.setFire(2 * (int)f);
	         }
	      }

	      return flag;
	   }

	   protected SoundEvent getAmbientSound() {
	      return SoundEvents.ENTITY_ZOMBIE_AMBIENT;
	   }

	   protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
	      return SoundEvents.ENTITY_ZOMBIE_HURT;
	   }

	   protected SoundEvent getDeathSound() {
	      return SoundEvents.ENTITY_ZOMBIE_DEATH;
	   }

	   protected SoundEvent getStepSound() {
	      return SoundEvents.ENTITY_ZOMBIE_STEP;
	   }

	   protected void playStepSound(BlockPos pos, BlockState blockIn) {
	      this.playSound(this.getStepSound(), 0.15F, 1.0F);
	   }

	   public CreatureAttribute getCreatureAttribute() {
	      return CreatureAttribute.UNDEAD;
	   }

	   /**
	    * Gives armor or weapon for entity based on given DifficultyInstance
	    */
	   protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
	      super.setEquipmentBasedOnDifficulty(difficulty);
	      if (this.rand.nextFloat() < (this.world.getDifficulty() == Difficulty.HARD ? 0.05F : 0.01F)) {
	         int i = this.rand.nextInt(3);
	         if (i == 0) {
	            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
	         } else {
	            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SHOVEL));
	         }
	      }

	   }

	   public void writeAdditional(CompoundNBT compound) {
	      super.writeAdditional(compound);
	      if (this.isChild()) {
	         compound.putBoolean("IsBaby", true);
	      }

	      compound.putBoolean("CanBreakDoors", this.isBreakDoorsTaskSet());
	      compound.putInt("InWaterTime", this.isInWater() ? this.inWaterTime : -1);
	      compound.putInt("DrownedConversionTime", this.isDrowning() ? this.drownedConversionTime : -1);
	   }

	   /**
	    * (abstract) Protected helper method to read subclass entity data from NBT.
	    */
	   public void readAdditional(CompoundNBT compound) {
	      super.readAdditional(compound);
	      if (compound.getBoolean("IsBaby")) {
	         this.setChild(true);
	      }

	      this.setBreakDoorsAItask(compound.getBoolean("CanBreakDoors"));
	      this.inWaterTime = compound.getInt("InWaterTime");
	      if (compound.contains("DrownedConversionTime", 99) && compound.getInt("DrownedConversionTime") > -1) {
	         this.startDrowning(compound.getInt("DrownedConversionTime"));
	      }

	   }

	   /**
	    * This method gets called when the entity kills another one.
	    */
	   public void onKillEntity(LivingEntity entityLivingIn) {
	      super.onKillEntity(entityLivingIn);
	      if ((this.world.getDifficulty() == Difficulty.NORMAL || this.world.getDifficulty() == Difficulty.HARD) && entityLivingIn instanceof VillagerEntity) {
	         if (this.world.getDifficulty() != Difficulty.HARD && this.rand.nextBoolean()) {
	            return;
	         }

	         VillagerEntity villagerentity = (VillagerEntity)entityLivingIn;
	         ZombieVillagerEntity zombievillagerentity = EntityType.ZOMBIE_VILLAGER.create(this.world);
	         zombievillagerentity.copyLocationAndAnglesFrom(villagerentity);
	         villagerentity.remove();
	         zombievillagerentity.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(zombievillagerentity)), SpawnReason.CONVERSION, new TaintedZombie.GroupData(false), (CompoundNBT)null);
	         zombievillagerentity.func_213792_a(villagerentity.getVillagerData());
	         zombievillagerentity.func_223727_a(villagerentity.func_223722_es().func_220914_a(NBTDynamicOps.INSTANCE).getValue());
	         zombievillagerentity.func_213790_g(villagerentity.getOffers().func_222199_a());
	         zombievillagerentity.func_213789_a(villagerentity.getXp());
	         zombievillagerentity.setChild(villagerentity.isChild());
	         zombievillagerentity.setNoAI(villagerentity.isAIDisabled());
	         if (villagerentity.hasCustomName()) {
	            zombievillagerentity.setCustomName(villagerentity.getCustomName());
	            zombievillagerentity.setCustomNameVisible(villagerentity.isCustomNameVisible());
	         }

	         this.world.addEntity(zombievillagerentity);
	         this.world.playEvent((PlayerEntity)null, 1026, new BlockPos(this), 0);
	      }

	   }

	   protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
	      return this.isChild() ? 0.93F : 1.74F;
	   }

	   protected boolean canEquipItem(ItemStack stack) {
	      return stack.getItem() == Items.EGG && this.isChild() && this.isPassenger() ? false : super.canEquipItem(stack);
	   }

	   @Nullable
	   public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
	      spawnDataIn = super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
	      float f = difficultyIn.getClampedAdditionalDifficulty();
	      this.setCanPickUpLoot(this.rand.nextFloat() < 0.55F * f);
	      if (spawnDataIn == null) {
	         spawnDataIn = new TaintedZombie.GroupData(worldIn.getRandom().nextFloat() < net.minecraftforge.common.ForgeConfig.SERVER.zombieBabyChance.get());
	      }

	      if (spawnDataIn instanceof TaintedZombie.GroupData) {
	         TaintedZombie.GroupData zombieentity$groupdata = (TaintedZombie.GroupData)spawnDataIn;
	         if (zombieentity$groupdata.isChild) {
	            this.setChild(true);
	            if ((double)worldIn.getRandom().nextFloat() < 0.05D) {
	               List<ChickenEntity> list = worldIn.getEntitiesWithinAABB(ChickenEntity.class, this.getBoundingBox().grow(5.0D, 3.0D, 5.0D), EntityPredicates.IS_STANDALONE);
	               if (!list.isEmpty()) {
	                  ChickenEntity chickenentity = list.get(0);
	                  chickenentity.setChickenJockey(true);
	                  this.startRiding(chickenentity);
	               }
	            } else if ((double)worldIn.getRandom().nextFloat() < 0.05D) {
	               ChickenEntity chickenentity1 = EntityType.CHICKEN.create(this.world);
	               chickenentity1.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
	               chickenentity1.onInitialSpawn(worldIn, difficultyIn, SpawnReason.JOCKEY, (ILivingEntityData)null, (CompoundNBT)null);
	               chickenentity1.setChickenJockey(true);
	               worldIn.addEntity(chickenentity1);
	               this.startRiding(chickenentity1);
	            }
	         }

	         this.setBreakDoorsAItask(this.canBreakDoors() && this.rand.nextFloat() < f * 0.1F);
	         this.setEquipmentBasedOnDifficulty(difficultyIn);
	         this.setEnchantmentBasedOnDifficulty(difficultyIn);
	      }

	      if (this.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty()) {
	         LocalDate localdate = LocalDate.now();
	         int i = localdate.get(ChronoField.DAY_OF_MONTH);
	         int j = localdate.get(ChronoField.MONTH_OF_YEAR);
	         if (j == 10 && i == 31 && this.rand.nextFloat() < 0.25F) {
	            this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(this.rand.nextFloat() < 0.1F ? Blocks.JACK_O_LANTERN : Blocks.CARVED_PUMPKIN));
	            this.inventoryArmorDropChances[EquipmentSlotType.HEAD.getIndex()] = 0.0F;
	         }
	      }

	      this.applyAttributeBonuses(f);
	      return spawnDataIn;
	   }

	   protected void applyAttributeBonuses(float difficulty) {
	      this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).applyModifier(new AttributeModifier("Random spawn bonus", this.rand.nextDouble() * (double)0.05F, AttributeModifier.Operation.ADDITION));
	      double d0 = this.rand.nextDouble() * 1.5D * (double)difficulty;
	      if (d0 > 1.0D) {
	         this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).applyModifier(new AttributeModifier("Random zombie-spawn bonus", d0, AttributeModifier.Operation.MULTIPLY_TOTAL));
	      }

	      if (this.rand.nextFloat() < difficulty * 0.05F) {
	         this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(new AttributeModifier("Leader zombie bonus", this.rand.nextDouble() * 3.0D + 1.0D, AttributeModifier.Operation.MULTIPLY_TOTAL));
	         this.setBreakDoorsAItask(this.canBreakDoors());
	      }

	   }

	   /**
	    * Returns the Y Offset of this entity.
	    */
	   public double getYOffset() {
	      return this.isChild() ? 0.0D : -0.45D;
	   }

	   protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
	      super.dropSpecialItems(source, looting, recentlyHitIn);
	      Entity entity = source.getTrueSource();
	      if (entity instanceof CreeperEntity) {
	         CreeperEntity creeperentity = (CreeperEntity)entity;
	         if (creeperentity.ableToCauseSkullDrop()) {
	            creeperentity.incrementDroppedSkulls();
	            ItemStack itemstack = this.getSkullDrop();
	            if (!itemstack.isEmpty()) {
	               this.entityDropItem(itemstack);
	            }
	         }
	      }

	   }

	   protected ItemStack getSkullDrop() {
	      return new ItemStack(Items.ZOMBIE_HEAD);
	   }

	   class AttackTurtleEggGoal extends BreakBlockGoal {
	      AttackTurtleEggGoal(CreatureEntity p_i50465_2_, double p_i50465_3_, int p_i50465_5_) {
	         super(Blocks.TURTLE_EGG, p_i50465_2_, p_i50465_3_, p_i50465_5_);
	      }

	      public void playBreakingSound(IWorld p_203114_1_, BlockPos p_203114_2_) {
	         p_203114_1_.playSound((PlayerEntity)null, p_203114_2_, SoundEvents.ENTITY_ZOMBIE_DESTROY_EGG, SoundCategory.HOSTILE, 0.5F, 0.9F + TaintedZombie.this.rand.nextFloat() * 0.2F);
	      }

	      public void playBrokenSound(World p_203116_1_, BlockPos p_203116_2_) {
	         p_203116_1_.playSound((PlayerEntity)null, p_203116_2_, SoundEvents.ENTITY_TURTLE_EGG_BREAK, SoundCategory.BLOCKS, 0.7F, 0.9F + p_203116_1_.rand.nextFloat() * 0.2F);
	      }

	      public double getTargetDistanceSq() {
	         return 1.14D;
	      }
	   }

	   public class GroupData implements ILivingEntityData {
	      public final boolean isChild;

	      private GroupData(boolean p_i47328_2_) {
	         this.isChild = p_i47328_2_;
	      }
	   }
	}

