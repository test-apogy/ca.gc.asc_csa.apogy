package ca.gc.asc_csa.apogy.common.topology.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.URLNode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;

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
			nodePresentation = ApogyCommonTopologyUIFactory.eINSTANCE.createURLNodePresentation();
			nodePresentation.setNode(obj);
		}
		return nodePresentation;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof URLNode;
	}

}
