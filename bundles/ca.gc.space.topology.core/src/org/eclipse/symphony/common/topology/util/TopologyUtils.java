package org.eclipse.symphony.common.topology.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;

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
