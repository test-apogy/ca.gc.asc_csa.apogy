package org.eclipse.symphony.addons.sensors.imaging.ui.converters;

import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.core.invocator.ReferenceResultValue;

public class ReferenceResultValueToImageSnapshotConverter implements IConverter {

	public boolean canConvert(Object arg0) 
	{		
		if(arg0 instanceof ReferenceResultValue)
		{
			return (((ReferenceResultValue) arg0).getValue() != null && ((ReferenceResultValue) arg0).getValue() instanceof ImageSnapshot);
		}
		return false;
	}

	public Object convert(Object arg0) throws Exception 
	{		
		return ((ReferenceResultValue) arg0).getValue();
	}

	public Class<?> getInputType() {
		return ReferenceResultValue.class;
	}

	public Class<?> getOutputType() { 
		return ImageSnapshot.class;
	}
}