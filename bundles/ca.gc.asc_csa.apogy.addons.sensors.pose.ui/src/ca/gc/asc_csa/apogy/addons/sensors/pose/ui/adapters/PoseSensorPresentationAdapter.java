package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.adapters;
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

import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.PoseSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class PoseSensorPresentationAdapter implements NodePresentationAdapter
{

	public PoseSensorPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return PoseSensor.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof PoseSensor;
	}

	
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		PoseSensor poseSensor = (PoseSensor) obj;
		
		PoseSensorPresentation presentationNode = ApogyAddonsSensorsPoseUIFactory.eINSTANCE.createPoseSensorPresentation();
		presentationNode.setNode(poseSensor);			
						
		return presentationNode;
	}
}
