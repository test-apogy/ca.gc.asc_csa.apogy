package ca.gc.asc_csa.eclipse.emf.ecore.ui;

import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.AbstractTimeSourceComposite;

public interface TimeSourceCompositeProvider<T extends TimeSource> 
{
	/**
	 * @return whether the object 'obj' is supported by this adapter.
	 */
	boolean isAdapterFor(T obj);

	/**
	 * Context is the context, may be null.
	 * 
	 * @return the adapter associated with object 'obj' of class 'T'.
	 */
	AbstractTimeSourceComposite getComposite(Composite parent, int style,T obj);

	/**
	 * @return the class that is adapted by this adapter.
	 */
	Class<?> getAdaptedClass();		
}
