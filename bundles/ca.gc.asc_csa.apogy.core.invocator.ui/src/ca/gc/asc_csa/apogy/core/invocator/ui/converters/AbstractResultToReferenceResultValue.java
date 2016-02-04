package ca.gc.asc_csa.apogy.core.invocator.ui.converters;
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

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;

public class AbstractResultToReferenceResultValue implements IConverter {

	public boolean canConvert(Object arg0) 
	{		
		if(arg0 instanceof AbstractResult)
		{
			return (((AbstractResult) arg0).getResultValue() != null && ((AbstractResult) arg0).getResultValue() instanceof ReferenceResultValue);
		}
		return false;
	}

	public Object convert(Object arg0) throws Exception 
	{		
		return ((AbstractResult) arg0).getResultValue();
	}

	public Class<?> getInputType() {
		return AbstractResult.class;
	}

	public Class<?> getOutputType() { 
		return ReferenceResultValue.class;
	}
}