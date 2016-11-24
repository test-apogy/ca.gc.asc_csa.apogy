package ca.gc.asc_csa.apogy.core.ui.converters;
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

import java.util.Iterator;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.PositionedResult;
import ca.gc.asc_csa.apogy.core.ResultNode;

public class PositionedResultToNodeConverter implements IConverter {

	@Override
	public boolean canConvert(Object arg0) {
		return getNode((PositionedResult) arg0) != null;
	}

	@Override
	public Object convert(Object arg0) throws Exception {
		return getNode((PositionedResult) arg0);
	}

	@Override
	public Class<?> getInputType() {
		return PositionedResult.class;
	}

	@Override
	public Class<?> getOutputType() {
		return Node.class;
	}

	/**
	 * Searches the {@link Node} associated to the {@link PositionedResult}
	 * 
	 * @param positionedResult
	 *            Reference to the {@link PositionedResult}
	 * @return Reference to the {@link Node} or null if not found.
	 */
	protected Node getNode(PositionedResult positionedResult) {
		Node node = null;

		ApogyTopology apogyTopology = ApogyCoreFacade.INSTANCE.getApogyTopology();
		if (apogyTopology != null) {
			GroupNode groupNode = apogyTopology.getRootNode();

			if (groupNode != null) {
				Iterator<Node> resultNodes = ApogyCommonTopologyFacade.INSTANCE
						.findNodesByType(ApogyCorePackage.Literals.RESULT_NODE, groupNode).iterator();
				ResultNode resultNode = null;

				while (resultNodes.hasNext() && resultNode == null) {
					ResultNode current = (ResultNode) resultNodes.next();
					if (current.getResult() == positionedResult) {
						resultNode = current;
					}
				}

				if (resultNode != null) {
					if (!resultNode.getAggregatedChildren().isEmpty()) {
						node = resultNode.getAggregatedChildren().get(0);
					}
				}
			}
		}

		return node;
	}
}