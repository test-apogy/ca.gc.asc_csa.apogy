package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFactory;

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
			nodePresentation = Symphony__CommonTopologyUIFactory.eINSTANCE
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
