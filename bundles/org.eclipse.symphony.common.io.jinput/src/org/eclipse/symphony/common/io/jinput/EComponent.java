/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package org.eclipse.symphony.common.io.jinput;

import net.java.games.input.Component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#getDeadZone <em>Dead Zone</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#isAnalog <em>Analog</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#getPojoComponent <em>Pojo Component</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#getPollData <em>Poll Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponent#getEComponents <em>EComponents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent()
 * @model
 * @generated
 */
public interface EComponent extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Dead Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dead Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Zone</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_DeadZone()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getDeadZone();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_Identifier()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_Relative()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRelative();

	/**
	 * Returns the value of the '<em><b>Analog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_Analog()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isAnalog();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Pojo Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pojo Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pojo Component</em>' attribute.
	 * @see #setPojoComponent(Component)
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_PojoComponent()
	 * @model dataType="org.eclipse.symphony.common.io.jinput.Component"
	 * @generated
	 */
	Component getPojoComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EComponent#getPojoComponent <em>Pojo Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pojo Component</em>' attribute.
	 * @see #getPojoComponent()
	 * @generated
	 */
	void setPojoComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Poll Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poll Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poll Data</em>' attribute.
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_PollData()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getPollData();

	/**
	 * Returns the value of the '<em><b>EComponents</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.io.jinput.EComponents#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EComponents</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EComponents</em>' container reference.
	 * @see #setEComponents(EComponents)
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponent_EComponents()
	 * @see org.eclipse.symphony.common.io.jinput.EComponents#getComponents
	 * @model opposite="components" resolveProxies="false"
	 * @generated
	 */
	EComponents getEComponents();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EComponent#getEComponents <em>EComponents</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EComponents</em>' container reference.
	 * @see #getEComponents()
	 * @generated
	 */
	void setEComponents(EComponents value);

} // EComponent
