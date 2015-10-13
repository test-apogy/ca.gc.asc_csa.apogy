package org.eclipse.symphony.common.geometry.data3d.ui.adapters;

import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.ui.Data3DUIFactory;
import org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentationAdapter;

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
