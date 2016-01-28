package ca.gc.asc_csa.apogy.addons.sensors.imaging.converters;

import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

public class ImageSnapshotToAbstractEImageConverter implements IConverter {

	public boolean canConvert(Object arg0) 
	{		
		if(arg0 instanceof ImageSnapshot)
		{
			return (((ImageSnapshot) arg0).getImage() != null);
		}
		return false;
	}

	public Object convert(Object arg0) throws Exception 
	{		
		return ((ImageSnapshot) arg0).getImage();
	}

	public Class<?> getInputType() {
		return ImageSnapshot.class;
	}

	public Class<?> getOutputType() { 
		return AbstractEImage.class;
	}
}
