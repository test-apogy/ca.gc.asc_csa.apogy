package ca.gc.space.topology.ui.adapters;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.TransformNode;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;
import ca.gc.space.topology.ui.TopologyUIFactory;

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
			nodePresentation = TopologyUIFactory.eINSTANCE.createTransformNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof TransformNode;
	}

}
