package ca.gc.asc_csa.apogy.core.converters;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.TimeSourcesList;

public class ApogyEnvironmentToTimeSourcesListConverter implements IConverter {

	public ApogyEnvironmentToTimeSourcesListConverter() {
	}

	@Override
	public Class<?> getOutputType() {
		return TimeSourcesList.class;
	}

	@Override
	public Class<?> getInputType() {
		return ApogyEnvironment.class;
	}

	@Override
	public boolean canConvert(Object input) {
		return input instanceof ApogyEnvironment;
	}

	@Override
	public Object convert(Object input) throws Exception {
		return ((ApogyEnvironment)input).getTimeSourcesList() ;
	}
}