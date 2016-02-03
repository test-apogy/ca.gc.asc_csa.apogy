package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.adapters;
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

import ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class CircularSectorFieldOfViewPresentationAdapter implements NodePresentationAdapter
{

	public CircularSectorFieldOfViewPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return CircularSectorFieldOfView.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof CircularSectorFieldOfView;
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		CircularSectorFieldOfView circularSectorFieldOfView = (CircularSectorFieldOfView) obj;
		
		CircularSectorFieldOfViewPresentation presentationNode = ApogyAddonsSensorsFOVUIFactory.eINSTANCE.createCircularSectorFieldOfViewPresentation();
		presentationNode.setNode(circularSectorFieldOfView);			
						
		return presentationNode;
	}

}
