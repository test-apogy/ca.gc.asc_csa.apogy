package ca.gc.asc_csa.apogy.common.topology.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;

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
			nodePresentation = ApogyCommonTopologyUIFactory.eINSTANCE.createTransformNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof TransformNode;
	}

}
