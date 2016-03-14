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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class TriangularMeshPresentationAdapter implements
		NodePresentationAdapter {

	public TriangularMeshPresentationAdapter() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodePresentation getAdapter(Node node, Object context) {

		if (!isAdapterFor(node)) {
			throw new IllegalArgumentException();
		}

		TriangularMeshPresentation presentation = ApogyCommonGeometryData3DUIFactory.eINSTANCE.createTriangularMeshPresentation();

		ContentNode<CartesianTriangularMesh> cNode = (ContentNode<CartesianTriangularMesh>) node;

		presentation.setNode(cNode);

		return presentation;
	}

	@Override
	public boolean isAdapterFor(Node node) {

		boolean adapterFor = false;

		if (node instanceof ContentNode) {
			ContentNode<?> contentNode = (ContentNode<?>) node;

			if (contentNode.getContent() instanceof CartesianTriangularMesh) {
				adapterFor = true;
			}
		}
		return adapterFor;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return CartesianTriangularMesh.class;
	}

}
