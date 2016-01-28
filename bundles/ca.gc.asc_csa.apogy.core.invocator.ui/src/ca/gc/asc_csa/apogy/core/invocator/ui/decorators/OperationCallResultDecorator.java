package org.eclipse.symphony.core.invocator.ui.decorators;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.symphony.core.invocator.OperationCallResult;
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
