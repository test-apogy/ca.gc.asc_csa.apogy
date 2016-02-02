package ca.gc.asc_csa.apogy.core.ui.properties.sections;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.TimeSourcesList;
import ca.gc.asc_csa.apogy.core.ui.composites.TimeSourcesListComposite2;

public class TimeSourcesListSection extends AbstractExtendedPropertySection implements IFilter {

	@Override
	protected void render(EObject eObject) {
		TimeSourcesList timeSourcesList = (TimeSourcesList) ApogyCommonConvertersFacade.INSTANCE.convert(eObject,
				TimeSourcesList.class);
		if (timeSourcesList != null) {
			((TimeSourcesListComposite2) getComposite()).setTimeSourcesList(timeSourcesList);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new TimeSourcesListComposite2(parent, SWT.NONE);
	}

	@Override
	public boolean select(Object toTest) {
		return (ApogyCommonConvertersFacade.INSTANCE.convert(toTest, TimeSourcesList.class) != null);
	}
}