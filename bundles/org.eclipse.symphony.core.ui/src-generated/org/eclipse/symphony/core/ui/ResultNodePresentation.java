/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui;

import org.eclipse.symphony.common.topology.ui.TransformNodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.ResultNodePresentation#getPoleHeight <em>Pole Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.ResultNodePresentation#isFlagVisible <em>Flag Visible</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getResultNodePresentation()
 * @model
 * @generated
 */
public interface ResultNodePresentation extends TransformNodePresentation
{
  /**
	 * Returns the value of the '<em><b>Pole Height</b></em>' attribute.
	 * The default value is <code>"1.0f"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pole Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pole Height</em>' attribute.
	 * @see #setPoleHeight(float)
	 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getResultNodePresentation_PoleHeight()
	 * @model default="1.0f" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Flag Visuals'"
	 * @generated
	 */
  float getPoleHeight();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.ResultNodePresentation#getPoleHeight <em>Pole Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pole Height</em>' attribute.
	 * @see #getPoleHeight()
	 * @generated
	 */
	void setPoleHeight(float value);

		/**
	 * Returns the value of the '<em><b>Flag Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flag Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag Visible</em>' attribute.
	 * @see #setFlagVisible(boolean)
	 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getResultNodePresentation_FlagVisible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Flag Visuals'"
	 * @generated
	 */
  boolean isFlagVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.ResultNodePresentation#isFlagVisible <em>Flag Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag Visible</em>' attribute.
	 * @see #isFlagVisible()
	 * @generated
	 */
  void setFlagVisible(boolean value);

} // ResultNodePresentation
