package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.converters;

import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;

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
