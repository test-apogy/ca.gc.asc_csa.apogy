package ca.gc.space.mrt.geometry.data3d.ui;

import java.util.Iterator;
import java.util.List;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.topology.ContentNode;

/**
 * <p>
 * <b>Description:</b> the {@link Topology} is the graphical representation of a
 * topology containing different nodes and transformation. The problem is to
 * retrieve a {@link CartesianCoordinatesSet} from these nodes contained in the
 * topology. To solve this problem, the {@link ContentNode}, through the
 * {@link #adapt(ContentNode)} method, is passed to this factory, which find the
 * appropriate provider of {@link CartesianCoordinatesSet} and returns it.
 * </p>
 * Creation date: 2008-07-23
 * 
 * @author sgemme
 * 
 */
public class CartesianCoordinatesSetAdapterFactory {

	/**
	 * The providers registered in this factory.
	 */
	private List<ICartesianCoordinatesSetProvider> providers;

	public CartesianCoordinatesSetAdapterFactory(
			List<ICartesianCoordinatesSetProvider> providers) {
		this.providers = providers;
	}

	/**
	 * We go through the providers and find the one who is suitable for the
	 * object.
	 * 
	 * @param object
	 *            the content node for which we want to find the appropriate
	 *            adapter.
	 * @return the appropriate {@link ICartesianCoordinatesSetProvider} and
	 *         <code>null</code> if no {@link ICartesianCoordinatesSetProvider}
	 *         is found.
	 */
	public CartesianCoordinatesSet adapt(ContentNode<?> object) {

		Iterator<ICartesianCoordinatesSetProvider> iterator = providers
				.iterator();

		CartesianCoordinatesSet content = null;

		while (iterator.hasNext() && content == null) {
			ICartesianCoordinatesSetProvider currentProvider = iterator.next();

			if (currentProvider.getDataSet(object) != null) {
				content = currentProvider.getDataSet(object);
			}
		}

		return content;
	}

}
