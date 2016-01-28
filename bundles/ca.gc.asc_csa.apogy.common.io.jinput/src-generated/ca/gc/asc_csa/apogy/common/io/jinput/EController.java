/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.io.jinput;

import net.java.games.input.Controller;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EController</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#isLastPollResult <em>Last Poll Result</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#getPojoController <em>Pojo Controller</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#getEComponents <em>EComponents</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EController#getControllerCount <em>Controller Count</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController()
 * @model
 * @generated
 */
public interface EController extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Poll Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Poll Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Poll Result</em>' attribute.
	 * @see #setLastPollResult(boolean)
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_LastPollResult()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	boolean isLastPollResult();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EController#isLastPollResult <em>Last Poll Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Poll Result</em>' attribute.
	 * @see #isLastPollResult()
	 * @generated
	 */
	void setLastPollResult(boolean value);

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
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_Name()
	 * @model default="" unique="false" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_PortNumber()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_Type()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_PortType()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPortType();

	/**
	 * Returns the value of the '<em><b>Pojo Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pojo Controller</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pojo Controller</em>' attribute.
	 * @see #setPojoController(Controller)
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_PojoController()
	 * @model unique="false" dataType="org.eclipse.symphony.common.io.jinput.Controller"
	 * @generated
	 */
	Controller getPojoController();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EController#getPojoController <em>Pojo Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pojo Controller</em>' attribute.
	 * @see #getPojoController()
	 * @generated
	 */
	void setPojoController(Controller value);

	/**
	 * Returns the value of the '<em><b>EComponents</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.io.jinput.EComponents#getEController <em>EController</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EComponents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EComponents</em>' containment reference.
	 * @see #setEComponents(EComponents)
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_EComponents()
	 * @see org.eclipse.symphony.common.io.jinput.EComponents#getEController
	 * @model opposite="eController" containment="true" required="true" transient="true"
	 * @generated
	 */
	EComponents getEComponents();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EController#getEComponents <em>EComponents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EComponents</em>' containment reference.
	 * @see #getEComponents()
	 * @generated
	 */
	void setEComponents(EComponents value);

	/**
	 * Returns the value of the '<em><b>Controller Count</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Count</em>' attribute.
	 * @see #setControllerCount(int)
	 * @see org.eclipse.symphony.common.io.jinput.Symphony__CommonIOJInputPackage#getEController_ControllerCount()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getControllerCount();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EController#getControllerCount <em>Controller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Count</em>' attribute.
	 * @see #getControllerCount()
	 * @generated
	 */
	void setControllerCount(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean poll();

} // EController
