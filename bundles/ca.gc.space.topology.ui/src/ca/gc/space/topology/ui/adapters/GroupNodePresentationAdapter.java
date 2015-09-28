package ca.gc.space.topology.ui.adapters;

import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;
import ca.gc.space.topology.ui.TopologyUIFactory;

public class GroupNodePresentationAdapter implements NodePresentationAdapter {

	public GroupNodePresentationAdapter() {
	}

	@Override
	public Class<?> getAdaptedClass() {
		return GroupNode.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) {
		NodePresentation nodePresentation = null;
		if (isAdapterFor(obj)) {
			nodePresentation = TopologyUIFactory.eINSTANCE.createNodePresentation();
			nodePresentation.setNode((Node) obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof GroupNode;
	}

}
