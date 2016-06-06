package ca.gc.asc_csa.apogy.addons.ui.properties.sections;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.addons.ui.composites.GeometryPlacementAtFeatureOfInterestToolPoseComposite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class GeometryPlacementAtFeatureOfInterestToolPropertySection extends AbstractExtendedPropertySection {

	@Override
	protected void render(EObject eObject) 
	{
		GeometryPlacementAtFeatureOfInterestTool tool = (GeometryPlacementAtFeatureOfInterestTool) eObject; 
		
		GeometryPlacementAtFeatureOfInterestToolPoseComposite composite = (GeometryPlacementAtFeatureOfInterestToolPoseComposite) getComposite();
		composite.setGeometryPlacementAtFeatureOfInterestTool(tool);			
	}

	@Override
	protected Composite createComposite(Composite parent) 
	{
		return new GeometryPlacementAtFeatureOfInterestToolPoseComposite(parent, SWT.NONE, getEditingDomain());
	}
}