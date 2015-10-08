/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data.Mesh#getPolygons <em>Polygons</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMesh()
 * @model
 * @generated
 */
public interface Mesh<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends CoordinatesSet<CoordinatesType> {
	/**
	 * Returns the value of the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygons</em>' containment reference list.
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMesh_Polygons()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolygonType> getPolygons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model polygonUnique="false"
	 * @generated
	 */
	EList<PolygonType> getPolygonNeighbours(PolygonType polygon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pointUnique="false"
	 * @generated
	 */
	EList<CoordinatesType> getPointNeighbours(CoordinatesType point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pointUnique="false"
	 * @generated
	 */
	EList<PolygonType> getPolygonsSharingPoint(CoordinatesType point);

} // Mesh
