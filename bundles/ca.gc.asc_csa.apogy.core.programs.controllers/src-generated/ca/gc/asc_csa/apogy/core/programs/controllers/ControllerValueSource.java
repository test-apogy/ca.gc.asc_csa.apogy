/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;

import org.eclipse.symphony.common.io.jinput.EComponent;
import org.eclipse.symphony.common.io.jinput.EComponentQualifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Value Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getEComponentQualifier <em>EComponent Qualifier</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getConditioning <em>Conditioning</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getLastValue <em>Last Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getControllerValueSource()
 * @model
 * @generated
 */
public interface ControllerValueSource extends ValueSource
{
  /**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(EComponent)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getControllerValueSource_Component()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' notify='true' resolveProxies='false'"
	 * @generated
	 */
  EComponent getComponent();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
  void setComponent(EComponent value);

  /**
	 * Returns the value of the '<em><b>EComponent Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EComponent Qualifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EComponent Qualifier</em>' containment reference.
	 * @see #setEComponentQualifier(EComponentQualifier)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getControllerValueSource_EComponentQualifier()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EComponentQualifier getEComponentQualifier();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getEComponentQualifier <em>EComponent Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EComponent Qualifier</em>' containment reference.
	 * @see #getEComponentQualifier()
	 * @generated
	 */
  void setEComponentQualifier(EComponentQualifier value);

  /**
	 * Returns the value of the '<em><b>Conditioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditioning</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditioning</em>' containment reference.
	 * @see #setConditioning(AbstractInputConditioning)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getControllerValueSource_Conditioning()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
  AbstractInputConditioning getConditioning();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getConditioning <em>Conditioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditioning</em>' containment reference.
	 * @see #getConditioning()
	 * @generated
	 */
	void setConditioning(AbstractInputConditioning value);

		/**
	 * Returns the value of the '<em><b>Last Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Value</em>' attribute.
	 * @see #setLastValue(Object)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getControllerValueSource_LastValue()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  Object getLastValue();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ControllerValueSource#getLastValue <em>Last Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Value</em>' attribute.
	 * @see #getLastValue()
	 * @generated
	 */
  void setLastValue(Object value);

} // ControllerValueSource
