package ca.gc.asc_csa.apogy.common.emf.ui;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AbstractTimeSourceComposite;

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
