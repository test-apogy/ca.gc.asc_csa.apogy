package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;

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