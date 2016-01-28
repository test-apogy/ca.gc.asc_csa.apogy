/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnumLiteral <em>EEnum Literal</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnum <em>EEnum</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEEnumArgument()
 * @model
 * @generated
 */
public interface EEnumArgument extends Argument
{
  /**
	 * Returns the value of the '<em><b>EEnum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EEnum Literal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum Literal</em>' reference.
	 * @see #setEEnumLiteral(EEnumLiteral)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEEnumArgument_EEnumLiteral()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable'"
	 * @generated
	 */
  EEnumLiteral getEEnumLiteral();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnumLiteral <em>EEnum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEnum Literal</em>' reference.
	 * @see #getEEnumLiteral()
	 * @generated
	 */
  void setEEnumLiteral(EEnumLiteral value);

  /**
	 * Returns the value of the '<em><b>EEnum</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EEnum</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' reference.
	 * @see #setEEnum(EEnum)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEEnumArgument_EEnum()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel property='None' notify='true'"
	 * @generated
	 */
  EEnum getEEnum();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument#getEEnum <em>EEnum</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEnum</em>' reference.
	 * @see #getEEnum()
	 * @generated
	 */
  void setEEnum(EEnum value);

} // EEnumArgument
