package ca.gc.asc_csa.apogy.common.emf.ui.adapters;
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
import ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.SelectionBasedTimeSourceComposite;

public class SelectionBasedTimeSourceTimeSourceCompositeProvider implements TimeSourceCompositeProvider<SelectionBasedTimeSource> 
{
	@Override
	public boolean isAdapterFor(SelectionBasedTimeSource obj) 
	{
		return obj instanceof SelectionBasedTimeSource;
	}

	@Override
	public AbstractTimeSourceComposite getComposite(Composite parent, int style, SelectionBasedTimeSource obj) 
	{
		if(isAdapterFor(obj))
		{
			return new SelectionBasedTimeSourceComposite(parent, style, obj);
		}
		else
		{
			return null;
		}
	}

	@Override
	public Class<?> getAdaptedClass() 
	{
		return SelectionBasedTimeSource.class;
	}
}
