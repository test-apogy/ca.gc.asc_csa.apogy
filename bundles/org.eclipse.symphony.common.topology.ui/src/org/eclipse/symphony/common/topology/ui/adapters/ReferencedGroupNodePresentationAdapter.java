package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ReferencedGroupNode;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFactory;

public class ReferencedGroupNodePresentationAdapter implements
		NodePresentationAdapter {

	public ReferencedGroupNodePresentationAdapter() {	
	}

	@Override
	public Class<?> getAdaptedClass() {
		return ReferencedGroupNode.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) {
		NodePresentation nodePresentation = null;
		if (isAdapterFor(obj)) {
			nodePresentation = Symphony__CommonTopologyUIFactory.eINSTANCE.createNodePresentation();
			nodePresentation.setNode((Node) obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof ReferencedGroupNode;
	}

}
