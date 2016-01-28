/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getValueSource()
 * @model abstract="true"
 * @generated
 */
public interface ValueSource extends EObject
{
  /**
	 * Returns the value of the '<em><b>Binded EData Type Argument</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument#getValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binded EData Type Argument</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Binded EData Type Argument</em>' container reference.
	 * @see #setBindedEDataTypeArgument(BindedEDataTypeArgument)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getValueSource_BindedEDataTypeArgument()
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument#getValueSource
	 * @model opposite="valueSource" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  BindedEDataTypeArgument getBindedEDataTypeArgument();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binded EData Type Argument</em>' container reference.
	 * @see #getBindedEDataTypeArgument()
	 * @generated
	 */
  void setBindedEDataTypeArgument(BindedEDataTypeArgument value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  Object getSourceValue();

} // ValueSource
