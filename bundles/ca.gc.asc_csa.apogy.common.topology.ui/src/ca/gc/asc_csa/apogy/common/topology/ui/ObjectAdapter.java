package ca.gc.asc_csa.apogy.common.topology.ui;

/**
 * 
 * Creation date: 2008-08-18
 * 
 * @author sgemme
 * 
 * @param <S>
 *            the class produced by this adapter.
 * @param <T>
 *            the type supported by this adapter.
 */
public interface ObjectAdapter<S, T, U> {

	/**
	 * @return whether the object 'obj' is supported by this adapter.
	 */
	boolean isAdapterFor(T obj);

	/**
	 * Context is the context, may be null.
	 * 
	 * @return the adapter associated with object 'obj' of class 'T'.
	 */
	S getAdapter(T obj, U context);

	/**
	 * @return the class that is adapted by this adapter.
	 */
	Class<?> getAdaptedClass();

}
