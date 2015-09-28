/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographic Coordinates Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolygonShapeImageMapLayer defined by a list of Geographic Coordinates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.GeographicCoordinatesPolygonShapeImageMapLayer#getPolygonVerticesGeographicCoordinates <em>Polygon Vertices Geographic Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getGeographicCoordinatesPolygonShapeImageMapLayer()
 * @model
 * @generated
 */
public interface GeographicCoordinatesPolygonShapeImageMapLayer extends PolygonShapeImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Polygon Vertices Geographic Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.GeographicCoordinates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Vertices Geographic Coordinates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Vertices Geographic Coordinates</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getGeographicCoordinatesPolygonShapeImageMapLayer_PolygonVerticesGeographicCoordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeographicCoordinates> getPolygonVerticesGeographicCoordinates();

} // GeographicCoordinatesPolygonShapeImageMapLayer
