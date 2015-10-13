package org.eclipse.symphony.addons.sensors.fov.ui.adapters;

import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.ui.FovUIFactory;
import org.eclipse.symphony.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
