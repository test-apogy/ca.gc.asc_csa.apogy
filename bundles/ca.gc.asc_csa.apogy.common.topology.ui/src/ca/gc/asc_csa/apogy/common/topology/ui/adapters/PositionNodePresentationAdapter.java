package ca.gc.asc_csa.apogy.common.topology.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;

public class PositionNodePresentationAdapter implements NodePresentationAdapter {

	public PositionNodePresentationAdapter() {
	}

	public Class<?> getAdaptedClass() {
		return PositionNode.class;
	}

	public NodePresentation getAdapter(Node obj, Object context) {
		NodePresentation nodePresentation = null;

		if (isAdapterFor(obj)) {
			nodePresentation = ApogyCommonTopologyUIFactory.eINSTANCE
					.createPositionNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	public boolean isAdapterFor(Node obj) {
		return obj instanceof PositionNode;
	}

}
