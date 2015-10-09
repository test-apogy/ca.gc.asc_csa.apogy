package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.URLNode;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;

public class URLNodePresentationAdapter implements
		NodePresentationAdapter {

	public URLNodePresentationAdapter() {

	}

	@Override
	public Class<?> getAdaptedClass() {
		return URLNode.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) {

		NodePresentation nodePresentation = null;

		if (isAdapterFor(obj)) {
			nodePresentation = TopologyUIFactory.eINSTANCE.createURLNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof URLNode;
	}

}
