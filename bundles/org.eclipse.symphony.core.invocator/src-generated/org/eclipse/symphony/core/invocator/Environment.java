/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Environment.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Environment#getTypesList <em>Types List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Environment#getVariablesList <em>Variables List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Environment#getContextsList <em>Contexts List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Environment#getActiveContext <em>Active Context</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' container reference.
	 * @see #setInvocatorSession(InvocatorSession)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getEnvironment_InvocatorSession()
	 * @see org.eclipse.symphony.core.invocator.InvocatorSession#getEnvironment
	 * @model opposite="environment" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocator Session</em>' container reference.
	 * @see #getInvocatorSession()
	 * @generated
	 */
  void setInvocatorSession(InvocatorSession value);

  /**
	 * Returns the value of the '<em><b>Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Types List</em>' containment reference.
	 * @see #setTypesList(TypesList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getEnvironment_TypesList()
	 * @model containment="true"
	 * @generated
	 */
  TypesList getTypesList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Environment#getTypesList <em>Types List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types List</em>' containment reference.
	 * @see #getTypesList()
	 * @generated
	 */
  void setTypesList(TypesList value);

  /**
	 * Returns the value of the '<em><b>Variables List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.VariablesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables List</em>' containment reference.
	 * @see #setVariablesList(VariablesList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getEnvironment_VariablesList()
	 * @see org.eclipse.symphony.core.invocator.VariablesList#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
  VariablesList getVariablesList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Environment#getVariablesList <em>Variables List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables List</em>' containment reference.
	 * @see #getVariablesList()
	 * @generated
	 */
  void setVariablesList(VariablesList value);

  /**
	 * Returns the value of the '<em><b>Contexts List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.ContextsList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts List</em>' containment reference.
	 * @see #setContextsList(ContextsList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getEnvironment_ContextsList()
	 * @see org.eclipse.symphony.core.invocator.ContextsList#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
  ContextsList getContextsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Environment#getContextsList <em>Contexts List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contexts List</em>' containment reference.
	 * @see #getContextsList()
	 * @generated
	 */
  void setContextsList(ContextsList value);

  /**
	 * Returns the value of the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Context</em>' reference.
	 * @see #setActiveContext(Context)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getEnvironment_ActiveContext()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  Context getActiveContext();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Environment#getActiveContext <em>Active Context</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Context</em>' reference.
	 * @see #getActiveContext()
	 * @generated
	 */
  void setActiveContext(Context value);

} // Environment
