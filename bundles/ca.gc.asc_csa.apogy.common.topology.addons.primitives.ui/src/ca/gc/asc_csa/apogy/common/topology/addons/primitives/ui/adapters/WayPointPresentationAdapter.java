package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.WayPoint;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.ApogyCommonTopologyAddonsPrimitivesUIFactory;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.WayPointPresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class WayPointPresentationAdapter implements NodePresentationAdapter {

	public WayPointPresentationAdapter() {
	}

	@Override
	public Class<?> getAdaptedClass() {
		return WayPoint.class;
	}

	@Override
	public NodePresentation getAdapter(Node obj, Object context) {
		if (!isAdapterFor(obj)) {
			throw new IllegalArgumentException();
		}

		WayPoint WayPoint = (WayPoint) obj;

		WayPointPresentation presentationNode = ApogyCommonTopologyAddonsPrimitivesUIFactory.eINSTANCE
				.createWayPointPresentation();
		presentationNode.setNode(WayPoint);

		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof WayPoint;
	}
}
