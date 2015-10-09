package ca.gc.space.mrt.geometry.data3d.ui.pif.adapters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Point3f;

import org.eclipse.core.resources.IFile;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;

import ca.gc.asc_csa.io.pif.PifReader;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TopologyFactory;
import ca.gc.space.topology.ui.GraphicsContext;
import ca.gc.space.topology.ui.GraphicsContextAdapter;
import ca.gc.space.topology.ui.TopologyUIFactory;

/**
 * 
 * <dl>
 * <dt>Description:</dt>
 * <dd>description</dd>
 * <dt>Version:</dt>
 * <dd>$Revision: 1.2.4.2 $</dd>
 * <dt>Creation date:</dt>
 * <dd>Aug 16, 2011</dd>
 * </dl>
 * 
 * @author sgemme
 * 
 *         <pre>
 * 'History: 
 *  $Log: GraphicsContextPifAdapter.java,v $
 *  Revision 1.2.4.2  2015/05/21 15:50:04  pallard
 *  Updated to MRT_0_5 due to update to TOPOLOGY_0_5.
 *
 *  Revision 1.2.2.2  2015/02/05 21:07:56  rlarcheveque
 *  *** empty log message ***
 *
 *  Revision 1.1  2013/02/18 19:17:21  pallard
 *  Moved from topology.
 *
 *  Revision 1.2  2011/08/17 17:29:16  sgemme
 *  *** empty log message ***
 *
 *  Revision 1.1  2011/08/17 17:15:16  sgemme
 *  *** empty log message ***
 *
 * </pre>
 * 
 */
public class GraphicsContextPifAdapter implements GraphicsContextAdapter {

	public static final String SUPPORTED_EXTENSION = "pf";

	public GraphicsContextPifAdapter() {
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

	@SuppressWarnings("deprecation")
	@Override
	public GraphicsContext getAdapter(Object obj, Object context) {

		GraphicsContext grContext = null;

		if (isAdapterFor(obj)) {
			IFile file = (IFile) obj;

			// We import the file
			try {
				PifReader reader = new PifReader(file.getLocation()
						.toOSString());

				List<Point3f> points = reader.getPoints();

				// We convert the points into a cartesian coordinates set
				CartesianCoordinatesSet pts = Data3dFactory.eINSTANCE
						.createCartesianCoordinatesSet();

				List<CartesianPositionCoordinates> pointList = new ArrayList<CartesianPositionCoordinates>(
						points.size());

				for (Point3f p : points) {
					CartesianPositionCoordinates point = Data3dFacade.INSTANCE
							.createCartesianPositionCoordinates(p.getX(),
									p.getY(), p.getZ());
					pointList.add(point);
				}

				pts.getPoints().addAll(pointList);

				// We create a topology
				GroupNode root = TopologyFactory.eINSTANCE.createGroupNode();

				ContentNode<CartesianCoordinatesSet> pointNode = TopologyFacade.INSTANCE
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
