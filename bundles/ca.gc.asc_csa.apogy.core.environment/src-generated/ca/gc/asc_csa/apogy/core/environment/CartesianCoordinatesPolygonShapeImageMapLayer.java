/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Coordinates Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolygonShapeImageMapLayer defined by a list of cartesian coordinates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer#getPolygonVertices <em>Polygon Vertices</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianCoordinatesPolygonShapeImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianCoordinatesPolygonShapeImageMapLayer extends PolygonShapeImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Polygon Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.math.Tuple3d}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Vertices</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tuple3d> getPolygonVertices();

} // CartesianCoordinatesPolygonShapeImageMapLayer
