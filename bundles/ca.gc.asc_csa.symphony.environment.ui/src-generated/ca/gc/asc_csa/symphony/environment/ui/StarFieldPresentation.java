/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui;

import ca.gc.space.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star Field Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.StarFieldPresentation#getCutOffMagnitude <em>Cut Off Magnitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getStarFieldPresentation()
 * @model
 * @generated
 */
public interface StarFieldPresentation extends NodePresentation
{
  /**
	 * Returns the value of the '<em><b>Cut Off Magnitude</b></em>' attribute.
	 * The default value is <code>"6.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cut Off Magnitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Off Magnitude</em>' attribute.
	 * @see #setCutOffMagnitude(float)
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getStarFieldPresentation_CutOffMagnitude()
	 * @model default="6.0" unique="false"
	 * @generated
	 */
  float getCutOffMagnitude();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.ui.StarFieldPresentation#getCutOffMagnitude <em>Cut Off Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Off Magnitude</em>' attribute.
	 * @see #getCutOffMagnitude()
	 * @generated
	 */
  void setCutOffMagnitude(float value);

} // StarFieldPresentation
