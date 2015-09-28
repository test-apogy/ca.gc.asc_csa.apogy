/**
 * Canadian Space Agency 2008
 *
 * $Id: Polygon.java,v 1.4.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data.Polygon#getVertices <em>Vertices</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon<T extends Coordinates> extends EObject
{
	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' reference list.
	 * The list contents are of type {@link T}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' reference list.
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getPolygon_Vertices()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<T> getVertices();

} // Polygon
