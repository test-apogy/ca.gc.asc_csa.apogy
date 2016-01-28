package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.adapters;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

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

		CartesianCoordinatesSetPresentation presentationNode = ApogyCommonGeometryData3DUIFactory.eINSTANCE
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
