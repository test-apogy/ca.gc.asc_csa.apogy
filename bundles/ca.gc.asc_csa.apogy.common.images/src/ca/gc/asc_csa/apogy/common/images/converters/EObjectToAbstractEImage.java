package ca.gc.asc_csa.apogy.common.images.converters;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

public class EObjectToAbstractEImage implements IConverter {

	@Override
	public Class<?> getOutputType() { 
		return AbstractEImage.class;
	}

	@Override
	public Class<?> getInputType() {		
		return EObject.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{		
		return input instanceof AbstractEImage;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{		
		return (AbstractEImage) input;
	}

}
