package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.adapters;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ICartesianCoordinatesSetProvider;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;

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
