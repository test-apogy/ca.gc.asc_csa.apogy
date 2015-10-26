/**
 */
package org.eclipse.symphony.common.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Root Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an AbstractFeatureNode that is a root.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.AbstractRootNode#getSourceClass <em>Source Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getAbstractRootNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRootNode extends EObject
{
  /**
	 * Returns the value of the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Class</em>' reference.
	 * @see #setSourceClass(EClass)
	 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getAbstractRootNode_SourceClass()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EClass getSourceClass();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.AbstractRootNode#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
  void setSourceClass(EClass value);

} // AbstractRootNode
