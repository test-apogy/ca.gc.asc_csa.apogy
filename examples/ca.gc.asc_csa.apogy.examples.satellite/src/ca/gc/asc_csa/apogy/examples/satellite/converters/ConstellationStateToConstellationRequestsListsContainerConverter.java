package ca.gc.asc_csa.apogy.examples.satellite.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;

public class ConstellationStateToConstellationRequestsListsContainerConverter implements IConverter {

	@Override
	public boolean canConvert(Object arg0) {
		return ((ConstellationState)arg0).getConstellationRequestsListsContainer() != null;
	}

	@Override
	public Object convert(Object arg0) throws Exception {
		return ((ConstellationState)arg0).getConstellationRequestsListsContainer();
	}

	@Override
	public Class<?> getInputType() {
		return ConstellationState.class;
	}

	@Override
	public Class<?> getOutputType() {
		return ConstellationRequestsListsContainer.class;
	}	
}