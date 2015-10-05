/**
 * <copyright>
 * </copyright>
 *
 * $Id: PointOfInterest.java,v 1.5.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

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
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PointOfInterest#getOffset <em>Offset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PointOfInterest#getKinematicState <em>Kinematic State</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPointOfInterest()
 * @model
 * @generated
 */
public interface PointOfInterest extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

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
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPointOfInterest_Offset()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.PointOfInterest#getOffset <em>Offset</em>}' containment reference.
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
	 * If the meaning of the '<em>Kinematic State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinematic State</em>' containment reference.
	 * @see #setKinematicState(KinematicState)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPointOfInterest_KinematicState()
	 * @model containment="true"
	 * @generated
	 */
	KinematicState getKinematicState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.PointOfInterest#getKinematicState <em>Kinematic State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematic State</em>' containment reference.
	 * @see #getKinematicState()
	 * @generated
	 */
	void setKinematicState(KinematicState value);

} // PointOfInterest
