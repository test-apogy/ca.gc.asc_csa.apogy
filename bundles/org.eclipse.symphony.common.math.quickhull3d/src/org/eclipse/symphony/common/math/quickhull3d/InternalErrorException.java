package org.eclipse.symphony.common.math.quickhull3d;

/**
 * Exception thrown when QuickHull3D encounters an internal error.
 */
public class InternalErrorException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4210707535613852035L;

	public InternalErrorException(String msg) {
		super(msg);
	}
}
