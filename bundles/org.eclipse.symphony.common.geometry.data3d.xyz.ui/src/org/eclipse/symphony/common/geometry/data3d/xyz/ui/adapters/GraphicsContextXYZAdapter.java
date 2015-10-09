package org.eclipse.symphony.common.geometry.data3d.xyz.ui.adapters;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.Data3DIO;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.GraphicsContextAdapter;
import org.eclipse.symphony.common.topology.ui.TopologyUIFactory;

public class GraphicsContextXYZAdapter implements GraphicsContextAdapter {

	public static final String SUPPORTED_EXTENSION = "xyz";

	@Override
	public boolean isAdapterFor(Object obj) {

		boolean ok = false;

		// We respond to IFile selection ending with SUPPORTED_EXTENSION
		if (obj instanceof IFile) {
			IFile file = (IFile) obj;

			ok = file.getName().endsWith("." + SUPPORTED_EXTENSION);
		}

		return ok;
	}

	public GraphicsContextXYZAdapter() {

	}

	@SuppressWarnings("unused")
	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {

		GraphicsContext ctx = null;

		if (isAdapterFor(obj)) {
			IProgressMonitor monitor = new NullProgressMonitor();

			if (context instanceof IProgressMonitor) {
				monitor = (IProgressMonitor) context;
			}

			IFile file = (IFile) obj;

			try {
				CartesianCoordinatesSet points = Data3DIO.INSTANCE.loadXYZ(file
						.getLocation().toOSString());

				GroupNode root = TopologyFactory.eINSTANCE
						.createAggregateGroupNode();

				ContentNode<CartesianCoordinatesSet> content = TopologyFacade.INSTANCE
						.createContentNode(points);

				root.getChildren().add(content);

				ctx = TopologyUIFactory.eINSTANCE.createGraphicsContext();
				ctx.setTopology(root);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return ctx;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return IFile.class;
	}

}