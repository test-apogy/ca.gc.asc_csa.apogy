package ca.gc.asc_csa.apogy.common.topology.ui.util;
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

public class UiTopologyUtils {

	private UiTopologyUtils() {
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> getChildren(List<NodePresentation> lstNodes,
			Class<T> type) {
		ArrayList<T> lstNode = new ArrayList<T>();

		Iterator<NodePresentation> iterator = lstNodes.iterator();
		while (iterator.hasNext()) {
			NodePresentation currentNode = iterator.next();
			if (type.isInstance(currentNode)) {
				lstNode.add((T) currentNode);
			}
		}

		return lstNode;
	}
}
