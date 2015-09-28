package ca.gc.space.topology.ui.adapters;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.PositionNode;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;
import ca.gc.space.topology.ui.TopologyUIFactory;

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
