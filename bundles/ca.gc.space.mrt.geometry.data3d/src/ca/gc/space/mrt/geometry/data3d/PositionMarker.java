/**
 * Canadian Space Agency 2008.
 *
 * $Id: PositionMarker.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PositionMarker#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPositionMarker()
 * @model
 * @generated
 */
public interface PositionMarker extends CartesianPositionCoordinates {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPositionMarker_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PositionMarker#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

} // PositionMarker
