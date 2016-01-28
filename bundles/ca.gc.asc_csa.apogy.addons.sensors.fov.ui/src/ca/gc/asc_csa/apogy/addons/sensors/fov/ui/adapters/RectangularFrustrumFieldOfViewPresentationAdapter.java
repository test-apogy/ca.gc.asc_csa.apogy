package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.adapters;

import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class RectangularFrustrumFieldOfViewPresentationAdapter implements
		NodePresentationAdapter {
	public RectangularFrustrumFieldOfViewPresentationAdapter() {
	}


	public Class<?> getAdaptedClass() {
		return RectangularFrustrumFieldOfView.class;
	}


	public boolean isAdapterFor(Node obj) {
		return obj instanceof RectangularFrustrumFieldOfView;
	}


	public NodePresentation getAdapter(Node obj, Object context) {
		if (!isAdapterFor(obj)) {
			throw new IllegalArgumentException();
		}

		RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView = (RectangularFrustrumFieldOfView) obj;

		RectangularFrustrumFieldOfViewPresentation presentationNode = ApogyAddonsSensorsFOVUIFactory.eINSTANCE
				.createRectangularFrustrumFieldOfViewPresentation();		
		presentationNode.setNode(rectangularFrustrumFieldOfView);

		return presentationNode;
	}

}
