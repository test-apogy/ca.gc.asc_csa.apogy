package ca.gc.asc_csa.apogy.common.images.converters;

import org.eclipse.swt.graphics.ImageData;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;

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