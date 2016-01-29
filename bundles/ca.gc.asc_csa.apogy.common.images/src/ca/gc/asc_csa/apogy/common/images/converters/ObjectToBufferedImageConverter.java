package ca.gc.asc_csa.apogy.common.images.converters;

import java.awt.image.BufferedImage;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.images.EImage;

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
