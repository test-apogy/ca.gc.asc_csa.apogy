/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.SurfaceEnvironment#getAtmosphere <em>Atmosphere</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.SurfaceEnvironment#getGravity <em>Gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSurfaceEnvironment()
 * @model
 * @generated
 */
public interface SurfaceEnvironment extends Environment
{

  /**
	 * Returns the value of the '<em><b>Atmosphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atmosphere</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Atmosphere</em>' containment reference.
	 * @see #setAtmosphere(Atmosphere)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSurfaceEnvironment_Atmosphere()
	 * @model containment="true"
	 * @generated
	 */
  Atmosphere getAtmosphere();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SurfaceEnvironment#getAtmosphere <em>Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmosphere</em>' containment reference.
	 * @see #getAtmosphere()
	 * @generated
	 */
  void setAtmosphere(Atmosphere value);

  /**
	 * Returns the value of the '<em><b>Gravity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gravity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' containment reference.
	 * @see #setGravity(Tuple3d)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSurfaceEnvironment_Gravity()
	 * @model containment="true"
	 * @generated
	 */
  Tuple3d getGravity();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SurfaceEnvironment#getGravity <em>Gravity</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' containment reference.
	 * @see #getGravity()
	 * @generated
	 */
  void setGravity(Tuple3d value);
} // SurfaceEnvironment
