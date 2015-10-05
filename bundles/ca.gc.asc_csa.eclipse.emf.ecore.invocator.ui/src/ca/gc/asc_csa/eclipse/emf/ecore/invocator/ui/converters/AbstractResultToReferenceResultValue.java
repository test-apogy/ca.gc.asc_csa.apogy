package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.converters;

import org.eclipse.symphony.common.converters.IConverter;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue;

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