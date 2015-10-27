/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * The Earth.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Earth#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getEarth()
 * @model
 * @generated
 */
public interface Earth extends GroupNode {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * The default value is <code>"6371000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Earth mean radius, in meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getEarth_Radius()
	 * @model default="6371000" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.Earth#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // Earth
