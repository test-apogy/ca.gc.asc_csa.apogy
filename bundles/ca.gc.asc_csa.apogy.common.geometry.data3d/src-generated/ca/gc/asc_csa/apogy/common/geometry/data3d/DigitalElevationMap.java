/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Elevation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDigitalElevationMap()
 * @model
 * @generated
 */
public interface DigitalElevationMap extends CartesianCoordinatesSet {
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDigitalElevationMap_XDimension()
	 * @model unique="false"
	 * @generated
	 */
	int getXDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getDigitalElevationMap_YDimension()
	 * @model unique="false"
	 * @generated
	 */
	int getYDimension();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDimension</em>' attribute.
	 * @see #getYDimension()
	 * @generated
	 */
	void setYDimension(int value);

} // DigitalElevationMap
