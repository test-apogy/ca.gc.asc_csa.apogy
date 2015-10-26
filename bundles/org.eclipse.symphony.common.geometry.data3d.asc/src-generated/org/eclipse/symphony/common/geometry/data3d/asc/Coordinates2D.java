/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class representing a 2D location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.Coordinates2D#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.asc.Coordinates2D#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getCoordinates2D()
 * @model
 * @generated
 */
public interface Coordinates2D extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getCoordinates2D_X()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.Coordinates2D#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage#getCoordinates2D_Y()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.asc.Coordinates2D#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

} // Coordinates2D
