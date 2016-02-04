package ca.gc.asc_csa.apogy.common.topology.ui.adapters;
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

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;

public class PositionNodePresentationAdapter implements NodePresentationAdapter {

	public PositionNodePresentationAdapter() {
	}

	public Class<?> getAdaptedClass() {
		return PositionNode.class;
	}

	public NodePresentation getAdapter(Node obj, Object context) {
		NodePresentation nodePresentation = null;

		if (isAdapterFor(obj)) {
			nodePresentation = ApogyCommonTopologyUIFactory.eINSTANCE
					.createPositionNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	public boolean isAdapterFor(Node obj) {
		return obj instanceof PositionNode;
	}

}
