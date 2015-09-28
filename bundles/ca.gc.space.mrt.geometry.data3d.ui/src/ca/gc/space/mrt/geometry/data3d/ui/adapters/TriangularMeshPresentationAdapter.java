package ca.gc.space.mrt.geometry.data3d.ui.adapters;

import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.ui.Data3DUIFactory;
import ca.gc.space.mrt.geometry.data3d.ui.TriangularMeshPresentation;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.NodePresentationAdapter;

public class TriangularMeshPresentationAdapter implements
		NodePresentationAdapter {

	public TriangularMeshPresentationAdapter() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public NodePresentation getAdapter(Node node, Object context) {

		if (!isAdapterFor(node)) {
			throw new IllegalArgumentException();
		}

		TriangularMeshPresentation presentation = Data3DUIFactory.eINSTANCE.createTriangularMeshPresentation();

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
