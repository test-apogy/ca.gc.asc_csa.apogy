/**
 * Canadian Space Agency 2008.
 *
 * $Id: DigitalElevationMap.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Elevation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDigitalElevationMap()
 * @model
 * @generated
 */
public interface DigitalElevationMap extends CartesianCoordinatesSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDimension</em>' attribute.
	 * @see #setXDimension(int)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDigitalElevationMap_XDimension()
	 * @model
	 * @generated
	 */
	int getXDimension();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDimension</em>' attribute.
	 * @see #getXDimension()
	 * @generated
	 */
	void setXDimension(int value);

	/**
	 * Returns the value of the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDimension</em>' attribute.
	 * @see #setYDimension(int)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDigitalElevationMap_YDimension()
	 * @model
	 * @generated
	 */
	int getYDimension();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDimension</em>' attribute.
	 * @see #getYDimension()
	 * @generated
	 */
	void setYDimension(int value);

} // DigitalElevationMap
