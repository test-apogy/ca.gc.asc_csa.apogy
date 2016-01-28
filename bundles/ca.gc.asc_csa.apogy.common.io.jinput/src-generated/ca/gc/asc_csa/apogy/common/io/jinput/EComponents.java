/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.io.jinput;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComponents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponents#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponents#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponents#getEController <em>EController</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEComponents()
 * @model
 * @generated
 */
public interface EComponents extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.io.jinput.EComponent}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.io.jinput.EComponent#getEComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEComponents_Components()
	 * @see org.eclipse.symphony.common.io.jinput.EComponent#getEComponents
	 * @model opposite="eComponents" containment="true" transient="true" changeable="false"
	 * @generated
	 */
	EList<EComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEComponents_Name()
	 * @model default="" unique="false" transient="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EComponents#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EController</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.io.jinput.EController#getEComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EController</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EController</em>' container reference.
	 * @see #setEController(EController)
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEComponents_EController()
	 * @see org.eclipse.symphony.common.io.jinput.EController#getEComponents
	 * @model opposite="eComponents"
	 * @generated
	 */
	EController getEController();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EComponents#getEController <em>EController</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EController</em>' container reference.
	 * @see #getEController()
	 * @generated
	 */
	void setEController(EController value);

} // EComponents
