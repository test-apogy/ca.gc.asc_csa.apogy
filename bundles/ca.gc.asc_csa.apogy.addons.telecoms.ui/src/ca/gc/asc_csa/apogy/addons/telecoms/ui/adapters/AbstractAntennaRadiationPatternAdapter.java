package ca.gc.asc_csa.apogy.addons.telecoms.ui.adapters;
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

import ca.gc.asc_csa.apogy.addons.telecoms.AbstractAntennaRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.ui.AbstractAntennaRadiationPatternPresentation;
import ca.gc.asc_csa.apogy.addons.telecoms.ui.ApogyAddonsTelecomsUIFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class AbstractAntennaRadiationPatternAdapter implements NodePresentationAdapter
{
	public AbstractAntennaRadiationPatternAdapter()
	{		
	}

	@Override
	public Class<?> getAdaptedClass()
	{		
		return AbstractAntennaRadiationPattern.class;
	}

	@Override
	public boolean isAdapterFor(Node obj)
	{
		boolean isAdapter = obj instanceof AbstractAntennaRadiationPattern;	
		return isAdapter;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}

		AbstractAntennaRadiationPatternPresentation presentationNode = ApogyAddonsTelecomsUIFactory.eINSTANCE.createAbstractAntennaRadiationPatternPresentation();
		presentationNode.setNode(obj);			
						
		return presentationNode;
	}
}
