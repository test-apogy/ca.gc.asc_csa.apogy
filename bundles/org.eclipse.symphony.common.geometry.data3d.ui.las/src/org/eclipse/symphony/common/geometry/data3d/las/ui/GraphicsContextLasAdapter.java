package org.eclipse.symphony.common.geometry.data3d.las.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;

import ca.gc.asc_csa.io.las.LASHeader;
import ca.gc.asc_csa.io.las.LASPoint;
import ca.gc.asc_csa.io.las.LASReader;
import ca.gc.asc_csa.io.las.LasFactory;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.TopologyFactory;
import ca.gc.space.topology.ui.GraphicsContext;
import ca.gc.space.topology.ui.GraphicsContextAdapter;
import ca.gc.space.topology.ui.TopologyUIFactory;

public class GraphicsContextLasAdapter implements GraphicsContextAdapter {
	public static final String SUPPORTED_EXTENSION = "las";

	public GraphicsContextLasAdapter() {
	}

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

	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {

		System.out.println("GraphicsContextLasAdapter.getAdapter()");

		GraphicsContext grContext = null;

		if (isAdapterFor(obj)) {
			IFile file = (IFile) obj;

			// We import the file
			try {
				LASReader reader = LasFactory.eINSTANCE.createLASReader();
				reader.setFile(file.getLocation().toOSString());

				if (context instanceof IProgressMonitor) {
					System.out
							.println("GraphicsContextLasAdapter.getAdapter() setting progress monitor");
					reader.setProgressMonitor((IProgressMonitor) context);
				}

				System.out
						.println("GraphicsContextLasAdapter.getAdapter() reading file "
								+ reader.getFile());
				reader.read();

				List<LASPoint> points = reader.getPoints();

				LASHeader header = reader.getHeader();

				double xOffset = header.getXOffset();
				double xScale = header.getXScaleFactor();

				double yOffset = header.getYOffset();
				double yScale = header.getYScaleFactor();

				double zOffset = header.getZOffset();
				double zScale = header.getZScaleFactor();

				// We convert the points into a cartesian coordinates set
				CartesianCoordinatesSet pts = Data3dFactory.eINSTANCE
						.createCartesianCoordinatesSet();

				List<CartesianPositionCoordinates> pointList = new ArrayList<CartesianPositionCoordinates>(
						points.size());

				for (LASPoint p : points) {

					double x = (p.getX() * xScale) + xOffset;
					double y = (p.getY() * yScale) + yOffset;
					double z = (p.getZ() * zScale) + zOffset;															

					CartesianPositionCoordinates point = Data3dFacade.INSTANCE
							.createCartesianPositionCoordinates(x, y, z);
					pointList.add(point);
				}

				pts.getPoints().addAll(pointList);

				// We create a topology
				GroupNode root = TopologyFactory.eINSTANCE
						.createAggregateGroupNode();

				ContentNode<CartesianCoordinatesSet> pointNode = ca.gc.space.topology.TopologyFacade.INSTANCE
						.createContentNode(pts);

				root.getChildren().add(pointNode);

				// We create a graphics context
				grContext = TopologyUIFactory.eINSTANCE.createGraphicsContext();
				grContext.setTopology(root);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return grContext;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return IFile.class;
	}

}
