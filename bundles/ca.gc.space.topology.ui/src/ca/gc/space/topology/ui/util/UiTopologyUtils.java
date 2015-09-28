package ca.gc.space.topology.ui.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ca.gc.space.topology.ui.NodePresentation;

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
