package org.eclipse.symphony.core.converters;

import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.TimeSourcesList;

public class SymphonyEnvironmentToTimeSourcesListConverter implements IConverter {

	public SymphonyEnvironmentToTimeSourcesListConverter() {
	}

	@Override
	public Class<?> getOutputType() {
		return TimeSourcesList.class;
	}

	@Override
	public Class<?> getInputType() {
		return SymphonyEnvironment.class;
	}

	@Override
	public boolean canConvert(Object input) {
		return input instanceof SymphonyEnvironment;
	}

	@Override
	public Object convert(Object input) throws Exception {
		return ((SymphonyEnvironment)input).getTimeSourcesList() ;
	}
}