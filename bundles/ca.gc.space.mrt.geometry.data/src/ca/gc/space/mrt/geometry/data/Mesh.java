/**
 * Canadian Space Agency 2008
 *
 * $Id: Mesh.java,v 1.4.4.2 2015/05/21 15:50:05 pallard Exp $
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
public interface Mesh<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends CoordinatesSet<CoordinatesType>
{

	/**
	 * Returns the value of the '<em><b>Polygons</b></em>' containment reference list.
	 * The list contents are of type {@link PolygonType}.
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
	 * @model
	 * @generated
	 */
	EList<PolygonType> getPolygonNeighbours(PolygonType polygon);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<CoordinatesType> getPointNeighbours(CoordinatesType point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<PolygonType> getPolygonsSharingPoint(CoordinatesType point);
} // Mesh
