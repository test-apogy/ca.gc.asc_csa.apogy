package org.eclipse.symphony.common.topology.addons.primitives.ui.adapters;

import org.eclipse.symphony.common.topology.addons.primitives.WayPoint;
import org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesFactory;
import org.eclipse.symphony.common.topology.addons.primitives.ui.WayPointPresentation;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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

		WayPointPresentation presentationNode = TopologyUIPrimitivesFactory.eINSTANCE
				.createWayPointPresentation();
		presentationNode.setNode(WayPoint);

		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof WayPoint;
	}
}
