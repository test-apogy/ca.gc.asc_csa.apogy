/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer#getPolygonVerticesGeographicCoordinates <em>Polygon Vertices Geographic Coordinates</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getGeographicCoordinatesPolygonShapeImageMapLayer()
 * @model
 * @generated
 */
public interface GeographicCoordinatesPolygonShapeImageMapLayer extends PolygonShapeImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Polygon Vertices Geographic Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.GeographicCoordinates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Vertices Geographic Coordinates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Vertices Geographic Coordinates</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getGeographicCoordinatesPolygonShapeImageMapLayer_PolygonVerticesGeographicCoordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeographicCoordinates> getPolygonVerticesGeographicCoordinates();

} // GeographicCoordinatesPolygonShapeImageMapLayer
