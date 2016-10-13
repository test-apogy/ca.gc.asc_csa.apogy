package ca.gc.asc_csa.apogy.examples.satellite.apogy.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;

public class ConstellationDataToConstellationStateConverter implements IConverter {

	@Override
	public boolean canConvert(Object arg0) {
		return ((ConstellationData)arg0).getConstellationState() != null;
	}

	@Override
	public Object convert(Object arg0) throws Exception {
		return ((ConstellationData)arg0).getConstellationState();
	}

	@Override
	public Class<?> getInputType() {		
		return ConstellationData.class;
	}

	@Override
	public Class<?> getOutputType() {
		return ConstellationState.class;
	}
}