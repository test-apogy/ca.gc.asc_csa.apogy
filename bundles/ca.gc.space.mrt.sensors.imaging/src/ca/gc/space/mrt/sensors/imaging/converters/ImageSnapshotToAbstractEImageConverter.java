package ca.gc.space.mrt.sensors.imaging.converters;

import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.images.AbstractEImage;

import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;

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
