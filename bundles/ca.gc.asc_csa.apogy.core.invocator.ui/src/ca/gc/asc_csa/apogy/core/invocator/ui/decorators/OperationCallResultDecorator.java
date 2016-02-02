package ca.gc.asc_csa.apogy.core.invocator.ui.decorators;
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

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class OperationCallResultDecorator extends LabelProvider implements ILightweightLabelDecorator 
{	
	@Override
	public void decorate(Object element, IDecoration decoration) 
	{
		if(element instanceof OperationCallResult)
		{
			OperationCallResult operationCallResult = (OperationCallResult) element;
			
			if(operationCallResult != null)
			{			
				if(operationCallResult.getExceptionContainer() != null &&
				   operationCallResult.getExceptionContainer().getException() != null)
				{
					decoration.addOverlay(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_DEC_FIELD_ERROR));
				}
			}
		}
	}
}
