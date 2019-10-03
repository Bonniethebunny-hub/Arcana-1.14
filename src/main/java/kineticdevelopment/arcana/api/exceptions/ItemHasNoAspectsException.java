package kineticdevelopment.arcana.api.exceptions;

/**
 * A Throw for when a block has no aspects
 * @author Atlas
 *
 */
public class ItemHasNoAspectsException extends Exception {
	private static final long serialVersionUID = -4818776999625524184L;
	
	public ItemHasNoAspectsException() {
		
	}
	
	public ItemHasNoAspectsException(String message) {
		super(message);
	}
}
