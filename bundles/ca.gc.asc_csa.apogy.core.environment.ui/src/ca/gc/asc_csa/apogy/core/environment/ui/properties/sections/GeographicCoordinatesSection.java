package ca.gc.asc_csa.apogy.core.environment.ui.properties.sections;
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
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ui.composites.GeographicCoordinatesComposite;

public class GeographicCoordinatesSection extends AbstractExtendedPropertySection implements IFilter
{
	@Override
	public boolean select(Object toTest)
	{
		return (ApogyCommonConvertersFacade.INSTANCE.convert(toTest, GeographicCoordinates.class) != null);
	}

	@Override
	protected void render(EObject eObject) 
	{
		GeographicCoordinates geographicCoordinates = (GeographicCoordinates) ApogyCommonConvertersFacade.INSTANCE.convert(eObject, GeographicCoordinates.class);
		if (geographicCoordinates != null) 
		{
			((GeographicCoordinatesComposite) getComposite()).setGeographicCoordinates(geographicCoordinates);
		}
	}

	@Override
	public boolean shouldUseExtraSpace()
	{
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) 
	{
		GeographicCoordinatesComposite composite = new GeographicCoordinatesComposite(parent, SWT.NONE);
		composite.setEnableEditing(true);
		
		return composite;
	}
}