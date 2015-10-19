/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.invocator.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class used for MapAnnotation representing a variable on a Map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariableInstance <em>Variable Instance</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getAbstractVariableAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractVariableAnnotation extends MapAnnotation
{
  /**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The Symphony System being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getAbstractVariableAnnotation_Variable()
	 * @model required="true"
	 * @generated
	 */
  Variable getVariable();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(Variable value);

  /**
	 * Returns the value of the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The instance of the object adapted by the Symphony System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Instance</em>' reference.
	 * @see #setVariableInstance(EObject)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getAbstractVariableAnnotation_VariableInstance()
	 * @model transient="true"
	 * @generated
	 */
  EObject getVariableInstance();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariableInstance <em>Variable Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Instance</em>' reference.
	 * @see #getVariableInstance()
	 * @generated
	 */
  void setVariableInstance(EObject value);

  /**
	 * Returns the value of the '<em><b>Symphony System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symphony System Api Adapter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The current instance of  SymphonySystemApiAdapter handling the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symphony System Api Adapter</em>' reference.
	 * @see #setSymphonySystemApiAdapter(SymphonySystemApiAdapter)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getAbstractVariableAnnotation_SymphonySystemApiAdapter()
	 * @model transient="true"
	 * @generated
	 */
  SymphonySystemApiAdapter getSymphonySystemApiAdapter();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symphony System Api Adapter</em>' reference.
	 * @see #getSymphonySystemApiAdapter()
	 * @generated
	 */
  void setSymphonySystemApiAdapter(SymphonySystemApiAdapter value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Method called when the pose of the variable changes.
	 * @param newPose The new pose matrix.
	 * <!-- end-model-doc -->
	 * @model newPoseUnique="false"
	 * @generated
	 */
	void updatePose(Matrix4x4 newPose);

} // AbstractVariableAnnotation
