package ca.gc.space.mrt.sensors.fov.ui.adapters;

import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.mrt.sensors.fov.ui.FovUIFactory;
import ca.gc.space.mrt.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

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

		RectangularFrustrumFieldOfViewPresentation presentationNode = FovUIFactory.eINSTANCE
				.createRectangularFrustrumFieldOfViewPresentation();		
		presentationNode.setNode(rectangularFrustrumFieldOfView);

		return presentationNode;
	}

}
