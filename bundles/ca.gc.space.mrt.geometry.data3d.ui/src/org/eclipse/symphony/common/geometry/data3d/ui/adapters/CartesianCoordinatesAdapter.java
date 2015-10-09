package org.eclipse.symphony.common.geometry.data3d.ui.adapters;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.ui.ICartesianCoordinatesSetProvider;

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
