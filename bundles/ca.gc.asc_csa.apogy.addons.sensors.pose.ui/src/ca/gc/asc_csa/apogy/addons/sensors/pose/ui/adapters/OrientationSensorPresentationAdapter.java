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

import ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.OrientationSensorPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.ApogyAddonsSensorsPoseUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class OrientationSensorPresentationAdapter implements NodePresentationAdapter
{

	public OrientationSensorPresentationAdapter()
	{
	}


	public Class<?> getAdaptedClass()
	{		
		return OrientationSensor.class;
	}


	public boolean isAdapterFor(Node obj)
	{
		return (obj instanceof OrientationSensor) && !(obj instanceof PoseSensor);
	}


	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		OrientationSensor orientationSensor = (OrientationSensor) obj;
		
		OrientationSensorPresentation presentationNode = ApogyAddonsSensorsPoseUIFactory.eINSTANCE.createOrientationSensorPresentation();
		presentationNode.setNode(orientationSensor);			
						
		return presentationNode;
	}
}
