/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#getAxisLenght <em>Axis Lenght</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#getPresentationMode <em>Presentation Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getURLNodePresentation()
 * @model
 * @generated
 */
public interface URLNodePresentation extends NodePresentation {
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
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getURLNodePresentation_AxisVisible()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	boolean isAxisVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#isAxisVisible <em>Axis Visible</em>}' attribute.
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
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getURLNodePresentation_AxisLenght()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	double getAxisLenght();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#getAxisLenght <em>Axis Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Lenght</em>' attribute.
	 * @see #getAxisLenght()
	 * @generated
	 */
	void setAxisLenght(double value);

	/**
	 * Returns the value of the '<em><b>Presentation Mode</b></em>' attribute.
	 * The default value is <code>"SURFACE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
	 * @see #setPresentationMode(MeshPresentationMode)
	 * @see org.eclipse.symphony.common.topology.ui.TopologyUIPackage#getURLNodePresentation_PresentationMode()
	 * @model default="SURFACE" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	MeshPresentationMode getPresentationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.URLNodePresentation#getPresentationMode <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
	 * @see #getPresentationMode()
	 * @generated
	 */
	void setPresentationMode(MeshPresentationMode value);

} // URLNodePresentation