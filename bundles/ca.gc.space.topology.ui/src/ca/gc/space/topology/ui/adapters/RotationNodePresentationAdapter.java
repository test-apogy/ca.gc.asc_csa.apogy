package ca.gc.space.topology.ui.adapters;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.RotationNode;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;
import ca.gc.space.topology.ui.TopologyUIFactory;

public class RotationNodePresentationAdapter implements NodePresentationAdapter {

	public RotationNodePresentationAdapter() {
	}

	@Override
	public Class<?> getAdaptedClass() {
		return RotationNode.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) {
		NodePresentation nodePresentation = null;

		if (isAdapterFor(obj)) {
			nodePresentation = TopologyUIFactory.eINSTANCE
					.createRotationNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof RotationNode;
	}

}
