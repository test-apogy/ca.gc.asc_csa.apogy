package ca.gc.space.topology.ui.adapters;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.URLNode;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;
import ca.gc.space.topology.ui.TopologyUIFactory;

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
