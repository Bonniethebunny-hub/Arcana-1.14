package kineticdevelopment.arcana.api.exceptions;

/**
 * A Throw for when a block has no aspects
 * @author Atlas
 *
 */
public class MobHasNoAspectsException extends Exception {
	private static final long serialVersionUID = -4818776999625524184L;
	
	public MobHasNoAspectsException() {
		
	}
	
	public MobHasNoAspectsException(String message) {
		super(message);
	}
}
