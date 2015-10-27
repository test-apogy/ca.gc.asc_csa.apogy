/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation#getAxisLenght <em>Axis Lenght</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getRotationNodePresentation()
 * @model
 * @generated
 */
public interface RotationNodePresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Axis Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Visible</em>' attribute.
	 * @see #setAxisVisible(boolean)
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getRotationNodePresentation_AxisVisible()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	boolean isAxisVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation#isAxisVisible <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Visible</em>' attribute.
	 * @see #isAxisVisible()
	 * @generated
	 */
	void setAxisVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Axis Lenght</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Lenght</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Lenght</em>' attribute.
	 * @see #setAxisLenght(double)
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getRotationNodePresentation_AxisLenght()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	double getAxisLenght();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.RotationNodePresentation#getAxisLenght <em>Axis Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Lenght</em>' attribute.
	 * @see #getAxisLenght()
	 * @generated
	 */
	void setAxisLenght(double value);

} // RotationNodePresentation
