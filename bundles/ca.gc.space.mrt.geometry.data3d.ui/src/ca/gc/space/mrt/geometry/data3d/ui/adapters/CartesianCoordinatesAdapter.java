package ca.gc.space.mrt.geometry.data3d.ui.adapters;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.ui.ICartesianCoordinatesSetProvider;
import ca.gc.space.topology.ContentNode;

public class CartesianCoordinatesAdapter implements
		ICartesianCoordinatesSetProvider {

	@Override
	public CartesianCoordinatesSet getDataSet(ContentNode<?> contentNode) {
		if (contentNode.getContent() instanceof CartesianCoordinatesSet) {
			CartesianCoordinatesSet content = (CartesianCoordinatesSet) contentNode
					.getContent();
			return content;
		} else {
			return null;
		}
	}

}
