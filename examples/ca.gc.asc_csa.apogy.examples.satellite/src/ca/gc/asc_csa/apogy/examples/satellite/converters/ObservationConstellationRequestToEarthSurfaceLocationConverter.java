package ca.gc.asc_csa.apogy.examples.satellite.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest;

public class ObservationConstellationRequestToEarthSurfaceLocationConverter implements IConverter {

	@Override
	public boolean canConvert(Object arg0) {
		return ((ObservationConstellationRequest)arg0).getLocation()!=null;
	}

	@Override
	public Object convert(Object arg0) throws Exception {
		return ((ObservationConstellationRequest)arg0).getLocation();
	}

	@Override
	public Class<?> getInputType() {
		return ObservationConstellationRequest.class;
	}

	@Override
	public Class<?> getOutputType() {
		return EarthSurfaceLocation.class;
	}
}