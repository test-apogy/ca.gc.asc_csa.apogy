package ca.gc.asc_csa.apogy.common.geometry.data3d.ui;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;

/**
 * 
 * <p>
 * Description: this interface provides a coordinates set. It is used in
 * {@link CartesianCoordinatesSetAdapterFactory}. This is interface returned by
 * the method {@link CartesianCoordinatesSetAdapterFactory#adapt(Object)}.
 * </p>
 * Creation date: 23-07-2008
 * 
 * @author sgemme
 * 
 * 
 */
public interface ICartesianCoordinatesSetProvider {

	public CartesianCoordinatesSet getDataSet(ContentNode<?> contentNode);

}
