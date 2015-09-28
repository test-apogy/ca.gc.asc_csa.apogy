package ca.gc.asc_csa.eclipse.images.core.converters;

import java.awt.image.BufferedImage;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.asc_csa.eclipse.images.core.EImage;

public class ObjectToBufferedImageConverter implements IConverter {

	public ObjectToBufferedImageConverter() {
	}

	@Override
	public Class<?> getOutputType() {
		return BufferedImage.class;
	}

	@Override
	public Class<?> getInputType() {
		return EImage.class;
	}

	@Override
	public boolean canConvert(Object input) {
		return input instanceof EImage;
	}

	@Override
	public Object convert(Object input) throws Exception {
		return ((EImage)input).getImageContent();
	}

}
