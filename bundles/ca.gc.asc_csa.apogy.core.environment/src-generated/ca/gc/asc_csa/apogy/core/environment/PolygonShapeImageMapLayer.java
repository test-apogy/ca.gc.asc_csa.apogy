/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import java.util.List;

import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class of Image Map Layer that are defined by a series of vertices.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getPolygonShapeImageMapLayer()
 * @model abstract="true"
 * @generated
 */
public interface PolygonShapeImageMapLayer extends AbstractShapeImageLayer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the list of vertices required to draw the polygon.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.List<ca.gc.asc_csa.apogy.common.math.Tuple3d>" unique="false" many="false"
	 * @generated
	 */
	List<Tuple3d> getVertices();

} // PolygonShapeImageMapLayer
