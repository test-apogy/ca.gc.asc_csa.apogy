package ca.gc.asc_csa.apogy.common.geometry.data25d.ui.adapters;
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

import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.ApogyCommonGeometryData25DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class VolumetricCoordinatesSet25DPresentationAdapter implements NodePresentationAdapter
{
	public VolumetricCoordinatesSet25DPresentationAdapter()
	{
	}

	@Override
	public boolean isAdapterFor(Node node)
	{
		boolean suitable = false;
		if (node instanceof ContentNode)
		{
			ContentNode<?> cNode = (ContentNode<?>) node;

			suitable = cNode.getContent() instanceof VolumetricCoordinatesSet25D;
		}
		return suitable;
	}

	@Override
	public Class<?> getAdaptedClass()
	{
		return VolumetricCoordinatesSet25D.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodePresentation getAdapter(Node obj, Object context) 
	{
		if (!isAdapterFor(obj))
		{
			throw new IllegalArgumentException();
		}

		ContentNode<VolumetricCoordinatesSet25D> cNode = (ContentNode<VolumetricCoordinatesSet25D>) obj;

		VolumetricCoordinatesSet25DPresentation presentationNode = ApogyCommonGeometryData25DUIFactory.eINSTANCE.createVolumetricCoordinatesSet25DPresentation();
		presentationNode.setNode(cNode);
		
		presentationNode.setPointsCloud(cNode.getContent());

		return presentationNode;
	}
}
