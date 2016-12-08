package ca.gc.asc_csa.apogy.core.environment.converters;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.TimeSourcesList;

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