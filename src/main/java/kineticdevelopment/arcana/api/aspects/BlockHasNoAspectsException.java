package kineticdevelopment.arcana.api.aspects;

/**
 * A Throw for when a block has no aspects
 * @author Atlas
 *
 */
public class BlockHasNoAspectsException extends Exception {
	private static final long serialVersionUID = -4818776999625524184L;
	
	public BlockHasNoAspectsException() {
		
	}
	
	public BlockHasNoAspectsException(String message) {
		super(message);
	}
}
