package ca.gc.asc_csa.apogy.common.emf.databinding;
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

import org.eclipse.core.databinding.observable.value.ValueDiff;

public class DefaultValueDiff extends ValueDiff 
{
	private Object oldValue;
	private Object newValue;
	
	public DefaultValueDiff(Object oldValue, Object newValue)
	{
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	
	@Override
	public Object getOldValue() 
	{	
		return oldValue;
	}
	@Override
	public Object getNewValue() 
	{	
		return newValue;
	}
}
