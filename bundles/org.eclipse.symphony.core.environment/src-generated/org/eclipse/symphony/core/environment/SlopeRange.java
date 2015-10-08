/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import javax.vecmath.Color3f;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slope Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class defining a slope range and its associated color.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.SlopeRange#getSlopeLowerBound <em>Slope Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.SlopeRange#getSlopeUpperBound <em>Slope Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.SlopeRange#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSlopeRange()
 * @model
 * @generated
 */
public interface SlopeRange extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Slope Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lower bound of the slope range. Always positive
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slope Lower Bound</em>' attribute.
	 * @see #setSlopeLowerBound(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSlopeRange_SlopeLowerBound()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' csa_units='deg'"
	 * @generated
	 */
	double getSlopeLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SlopeRange#getSlopeLowerBound <em>Slope Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Lower Bound</em>' attribute.
	 * @see #getSlopeLowerBound()
	 * @generated
	 */
	void setSlopeLowerBound(double value);

	/**
	 * Returns the value of the '<em><b>Slope Upper Bound</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper bound of the slope range. Always positive, and should be larger than slopeLower.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slope Upper Bound</em>' attribute.
	 * @see #setSlopeUpperBound(double)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSlopeRange_SlopeUpperBound()
	 * @model default="10" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' csa_units='deg'"
	 * @generated
	 */
	double getSlopeUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SlopeRange#getSlopeUpperBound <em>Slope Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Upper Bound</em>' attribute.
	 * @see #getSlopeUpperBound()
	 * @generated
	 */
	void setSlopeUpperBound(double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"1.0,1.0,1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The color to use for this slope range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color3f)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSlopeRange_Color()
	 * @model default="1.0,1.0,1.0" unique="false" dataType="org.eclipse.symphony.core.environment.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable'"
	 * @generated
	 */
	Color3f getColor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SlopeRange#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color3f value);

} // SlopeRange
