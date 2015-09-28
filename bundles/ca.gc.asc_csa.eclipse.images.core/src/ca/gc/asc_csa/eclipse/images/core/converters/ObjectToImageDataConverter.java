package ca.gc.asc_csa.eclipse.images.core.converters;

import org.eclipse.swt.graphics.ImageData;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.images.core.EImage;
import ca.gc.asc_csa.eclipse.images.core.EImagesUtilities;

public class ObjectToImageDataConverter implements IConverter {

	public ObjectToImageDataConverter() {
	}

	@Override
	public Class<?> getOutputType() {
		return ImageData.class;
	}

	@Override
	public Class<?> getInputType() {
		return EImage.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{
		if(input instanceof EImage)
		{
			EImage img = (EImage) input;
			return img.getImageContent() != null;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Object convert(Object input) throws Exception 
	{		
		EImage img = (EImage) input;
		return EImagesUtilities.INSTANCE.convertToImageData(img.getImageContent());
	}
}
