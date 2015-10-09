package org.eclipse.symphony.common.emf.ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.ui.composites.AbstractTimeSourceComposite;

import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;

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
