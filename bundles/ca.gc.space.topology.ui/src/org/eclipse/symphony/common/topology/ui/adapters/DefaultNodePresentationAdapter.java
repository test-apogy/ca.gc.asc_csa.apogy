package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;

public class DefaultNodePresentationAdapter implements NodePresentationAdapter {

	public DefaultNodePresentationAdapter() {

	}

	@Override
	public Class<?> getAdaptedClass() {
		return Node.class;
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
		return true;
	}

}
