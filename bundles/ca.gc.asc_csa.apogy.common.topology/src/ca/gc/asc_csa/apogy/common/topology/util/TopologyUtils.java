package ca.gc.asc_csa.apogy.common.topology.util;
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

import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;

public class TopologyUtils {

	
	private TopologyUtils() {}
	
	@SuppressWarnings("unchecked") 
	public static <T> List<T> getChildren(Node node, Class<T> type) {
		ArrayList<T> lstNode = new ArrayList<T>();
		
		if (node instanceof GroupNode) {
			GroupNode grp = (GroupNode)node;
			Iterator<Node> iterator = grp.getChildren().iterator();
			while (iterator.hasNext()) {
				Node currentNode = iterator.next();
				if (type.isInstance(currentNode)) {
					lstNode.add((T) currentNode);
				}
				if (currentNode instanceof GroupNode)
					getChildren(currentNode, type,lstNode);
			}
			
		}
		
		return lstNode;
	}
	@SuppressWarnings("unchecked") 
	public static <T> void getChildren(Node node, Class<T> type, ArrayList<T> lstNode) {
		if (node instanceof GroupNode) {
			GroupNode grp = (GroupNode)node;
			Iterator<Node> iterator = grp.getChildren().iterator();
			while (iterator.hasNext()) {
				Node currentNode = iterator.next();
				if (type.isInstance(currentNode)) {
					lstNode.add((T) currentNode);
				}
				if (currentNode instanceof GroupNode)
					getChildren(currentNode, type,lstNode);
			}
			
		}
	}
}
