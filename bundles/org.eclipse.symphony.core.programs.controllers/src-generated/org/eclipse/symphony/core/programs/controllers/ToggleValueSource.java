/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toggle Value Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getToggleValueSource()
 * @model
 * @generated
 */
public interface ToggleValueSource extends ValueSource
{
  /**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(boolean)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getToggleValueSource_InitialValue()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore notify='true'"
	 * @generated
	 */
  boolean isInitialValue();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #isInitialValue()
	 * @generated
	 */
  void setInitialValue(boolean value);

  /**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(boolean)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getToggleValueSource_CurrentValue()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
  boolean isCurrentValue();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.ToggleValueSource#isCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #isCurrentValue()
	 * @generated
	 */
  void setCurrentValue(boolean value);

} // ToggleValueSource
