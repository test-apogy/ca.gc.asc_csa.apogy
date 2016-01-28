/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Cartesian Position Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A specialization of CartesianPositionCoordinates that assigns a color to the position.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ColoredCartesianPositionCoordinates#getRed <em>Red</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ColoredCartesianPositionCoordinates#getGreen <em>Green</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ColoredCartesianPositionCoordinates#getBlue <em>Blue</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getColoredCartesianPositionCoordinates()
 * @model
 * @generated
 */
public interface ColoredCartesianPositionCoordinates extends CartesianPositionCoordinates {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The red component, between 0 and 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(byte)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getColoredCartesianPositionCoordinates_Red()
	 * @model unique="false"
	 * @generated
	 */
	byte getRed();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.ColoredCartesianPositionCoordinates#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(byte value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The green component, between 0 and 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(byte)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getColoredCartesianPositionCoordinates_Green()
	 * @model unique="false"
	 * @generated
	 */
	byte getGreen();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.ColoredCartesianPositionCoordinates#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(byte value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The blue component, between 0 and 255.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(byte)
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getColoredCartesianPositionCoordinates_Blue()
	 * @model unique="false"
	 * @generated
	 */
	byte getBlue();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.ColoredCartesianPositionCoordinates#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(byte value);

} // ColoredCartesianPositionCoordinates
