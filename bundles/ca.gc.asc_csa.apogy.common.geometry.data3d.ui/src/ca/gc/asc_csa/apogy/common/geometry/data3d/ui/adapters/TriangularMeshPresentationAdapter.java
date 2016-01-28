package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.adapters;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.TriangularMeshPresentation;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentationAdapter;

public class TriangularMeshPresentationAdapter implements
		NodePresentationAdapter {

	public TriangularMeshPresentationAdapter() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodePresentation getAdapter(Node node, Object context) {

		if (!isAdapterFor(node)) {
			throw new IllegalArgumentException();
		}

		TriangularMeshPresentation presentation = ApogyCommonGeometryData3DUIFactory.eINSTANCE.createTriangularMeshPresentation();

		ContentNode<CartesianTriangularMesh> cNode = (ContentNode<CartesianTriangularMesh>) node;

		presentation.setNode(cNode);

		return presentation;
	}

	@Override
	public boolean isAdapterFor(Node node) {

		boolean adapterFor = false;

		if (node instanceof ContentNode) {
			ContentNode<?> contentNode = (ContentNode<?>) node;

			if (contentNode.getContent() instanceof CartesianTriangularMesh) {
				adapterFor = true;
			}
		}
		return adapterFor;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return CartesianTriangularMesh.class;
	}

}
