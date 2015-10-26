/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View Item Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Presentation properties for an item displayed
 * on the MapView.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewItemPresentation#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewItemPresentation()
 * @model abstract="true"
 * @generated
 */
public interface MapViewItemPresentation extends EObject
{
  /**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Visibility
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewItemPresentation_Visible()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.MapViewItemPresentation#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
  void setVisible(boolean value);

} // MapViewItemPresentation
