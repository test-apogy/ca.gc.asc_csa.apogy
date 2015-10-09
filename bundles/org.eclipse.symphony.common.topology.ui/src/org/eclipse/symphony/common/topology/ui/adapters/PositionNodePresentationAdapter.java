package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;

public class PositionNodePresentationAdapter implements NodePresentationAdapter {

	public PositionNodePresentationAdapter() {
	}

	public Class<?> getAdaptedClass() {
		return PositionNode.class;
	}

	public NodePresentation getAdapter(Node obj, Object context) {
		NodePresentation nodePresentation = null;

		if (isAdapterFor(obj)) {
			nodePresentation = TopologyUIFactory.eINSTANCE
					.createPositionNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	public boolean isAdapterFor(Node obj) {
		return obj instanceof PositionNode;
	}

}
