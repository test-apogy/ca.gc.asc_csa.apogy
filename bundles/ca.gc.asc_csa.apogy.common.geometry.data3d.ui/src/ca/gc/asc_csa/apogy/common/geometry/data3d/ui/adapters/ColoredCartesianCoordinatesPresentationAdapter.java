package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.adapters;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class ColoredCartesianCoordinatesPresentationAdapter implements
		NodePresentationAdapter {

	public ColoredCartesianCoordinatesPresentationAdapter() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodePresentation getAdapter(Node node, Object context) {
		if (!isAdapterFor(node)) {
			throw new IllegalArgumentException();
		}

		ContentNode<ColoredCartesianCoordinatesSet> cNode = (ContentNode<ColoredCartesianCoordinatesSet>) node;

		ColoredCartesianCoordinatesSetPresentation presentationNode = ApogyCommonGeometryData3DUIFactory.eINSTANCE.createColoredCartesianCoordinatesSetPresentation();
		presentationNode.setNode(cNode);

		presentationNode.setColoredPointCloud(cNode.getContent());

		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node node) {
		boolean suitable = false;
		if (node instanceof ContentNode) {
			ContentNode<?> cNode = (ContentNode<?>) node;

			suitable = cNode.getContent() instanceof ColoredCartesianCoordinatesSet;
		}
		return suitable;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return ColoredCartesianCoordinatesSet.class;
	}
}
