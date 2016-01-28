/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.io.jinput;

import net.java.games.input.Component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getDeadZone <em>Dead Zone</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#isRelative <em>Relative</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#isAnalog <em>Analog</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getPojoComponent <em>Pojo Component</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getPollData <em>Poll Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getEComponents <em>EComponents</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent()
 * @model
 * @generated
 */
public interface EComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Dead Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dead Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Zone</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_DeadZone()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_Identifier()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_Relative()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_Analog()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_PojoComponent()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.io.jinput.Component"
	 * @generated
	 */
	Component getPojoComponent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getPojoComponent <em>Pojo Component</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_PollData()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getPollData();

	/**
	 * Returns the value of the '<em><b>EComponents</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponents#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EComponents</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EComponents</em>' container reference.
	 * @see #setEComponents(EComponents)
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponent_EComponents()
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.EComponents#getComponents
	 * @model opposite="components"
	 * @generated
	 */
	EComponents getEComponents();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getEComponents <em>EComponents</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EComponents</em>' container reference.
	 * @see #getEComponents()
	 * @generated
	 */
	void setEComponents(EComponents value);

} // EComponent
