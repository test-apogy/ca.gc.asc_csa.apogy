/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Of Interest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class defining a location in space relative to a Physical Body.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest#getKinematicState <em>Kinematic State</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsPackage#getPointOfInterest()
 * @model
 * @generated
 */
public interface PointOfInterest extends EObject {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Tuple3d)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsPackage#getPointOfInterest_Offset()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Kinematic State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinematic State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinematic State</em>' containment reference.
	 * @see #setKinematicState(KinematicState)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsPackage#getPointOfInterest_KinematicState()
	 * @model containment="true"
	 * @generated
	 */
	KinematicState getKinematicState();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.PointOfInterest#getKinematicState <em>Kinematic State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematic State</em>' containment reference.
	 * @see #getKinematicState()
	 * @generated
	 */
	void setKinematicState(KinematicState value);

} // PointOfInterest
