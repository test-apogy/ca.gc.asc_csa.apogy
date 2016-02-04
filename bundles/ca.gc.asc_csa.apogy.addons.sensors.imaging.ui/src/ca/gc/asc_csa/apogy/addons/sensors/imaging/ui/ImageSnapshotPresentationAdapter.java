package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui;
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

import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class ImageSnapshotPresentationAdapter implements NodePresentationAdapter
{


	public Class<?> getAdaptedClass()
	{		
		return ImageSnapshot.class;
	}


	public boolean isAdapterFor(Node node)
	{		
		return (node instanceof ImageSnapshot);
	}

	
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj)) 
		{
			throw new IllegalArgumentException();
		}
		
		ImageSnapshot imageSnapshot = (ImageSnapshot) obj;
		ImageSnapshotPresentation presentationNode = ApogyAddonsSensorsImagingUIFactory.eINSTANCE.createImageSnapshotPresentation();
		presentationNode.setNode(imageSnapshot);
		return presentationNode;
	}

}
