/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter EComponent Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.EParameterEComponentPair#getEParameter <em>EParameter</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.EParameterEComponentPair#getValueSource <em>Value Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getEParameterEComponentPair()
 * @model
 * @generated
 */
public interface EParameterEComponentPair extends EObject
{
  /**
   * Returns the value of the '<em><b>EParameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EParameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EParameter</em>' reference.
   * @see #setEParameter(EParameter)
   * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getEParameterEComponentPair_EParameter()
   * @model required="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
   * @generated
   */
  EParameter getEParameter();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.EParameterEComponentPair#getEParameter <em>EParameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EParameter</em>' reference.
   * @see #getEParameter()
   * @generated
   */
  void setEParameter(EParameter value);

  /**
   * Returns the value of the '<em><b>Value Source</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.programs.controllers.ValueSource#getPair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Source</em>' containment reference.
   * @see #setValueSource(ValueSource)
   * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getEParameterEComponentPair_ValueSource()
   * @see org.eclipse.symphony.core.programs.controllers.ValueSource#getPair
   * @model opposite="pair" containment="true" required="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
   * @generated
   */
  ValueSource getValueSource();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.EParameterEComponentPair#getValueSource <em>Value Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Source</em>' containment reference.
   * @see #getValueSource()
   * @generated
   */
  void setValueSource(ValueSource value);

} // EParameterEComponentPair
