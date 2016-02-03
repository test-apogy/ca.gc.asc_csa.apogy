package ca.gc.asc_csa.apogy.addons.vehicle.ui.adapters;
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



import ca.gc.asc_csa.apogy.addons.vehicle.Thruster;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIFactory;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class ThrusterPresentationAdapter implements NodePresentationAdapter
{

	public ThrusterPresentationAdapter()
	{
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return Thruster.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context)
	{		
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		Thruster thruster = (Thruster) obj;
		
		ThrusterPresentation presentationNode = ApogyAddonsVehicleUIFactory.eINSTANCE.createThrusterPresentation();
		presentationNode.setNode(thruster);			
						
		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		return obj instanceof Thruster;
	}
}
