package org.eclipse.symphony.common.geometry.data3d.ui.adapters;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation;
import org.eclipse.symphony.common.geometry.data3d.ui.Data3DUIFactory;

import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class CartesianCoordinatMeshNodePresentationAdapter implements
		NodePresentationAdapter {

	public CartesianCoordinatMeshNodePresentationAdapter() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodePresentation getAdapter(Node node, Object context) {
		if (!isAdapterFor(node)) {
			throw new IllegalArgumentException();
		}

		ContentNode<CartesianCoordinatesSet> cNode = (ContentNode<CartesianCoordinatesSet>) node;

		CartesianCoordinatesSetPresentation presentationNode = Data3DUIFactory.eINSTANCE
				.createCartesianCoordinatesSetPresentation();
		presentationNode.setNode(cNode);

		presentationNode.setPointCloud(cNode.getContent());

		return presentationNode;
	}

	@Override
	public boolean isAdapterFor(Node node) {
		boolean suitable = false;
		if (node instanceof ContentNode) {
			ContentNode<?> cNode = (ContentNode<?>) node;

			suitable = cNode.getContent() instanceof CartesianCoordinatesSet;
		}
		return suitable;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return CartesianCoordinatesSet.class;
	}
}
