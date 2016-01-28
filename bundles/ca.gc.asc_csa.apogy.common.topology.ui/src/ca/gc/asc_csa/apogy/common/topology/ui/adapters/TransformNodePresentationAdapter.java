package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIFactory;

public class TransformNodePresentationAdapter implements
		NodePresentationAdapter {

	public TransformNodePresentationAdapter() {

	}

	@Override
	public Class<?> getAdaptedClass() {
		return TransformNode.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) {

		NodePresentation nodePresentation = null;

		if (isAdapterFor(obj)) 
		{
			nodePresentation = Symphony__CommonTopologyUIFactory.eINSTANCE.createTransformNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof TransformNode;
	}

}
