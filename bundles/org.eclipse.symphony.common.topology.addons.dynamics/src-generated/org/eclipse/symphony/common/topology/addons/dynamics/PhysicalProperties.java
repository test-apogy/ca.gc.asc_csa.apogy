/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class defining the physical properties of a body.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties#getMass <em>Mass</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties#getInertiaMatrix <em>Inertia Matrix</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties#getCenterOfMassLocation <em>Center Of Mass Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getPhysicalProperties()
 * @model
 * @generated
 */
public interface PhysicalProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the mass of the physical body, in kilograms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(double)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getPhysicalProperties_Mass()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='kg'"
	 * @generated
	 */
	double getMass();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(double value);

	/**
	 * Returns the value of the '<em><b>Inertia Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The matrix of inertia of the body defined for the specified location of the center of mass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inertia Matrix</em>' containment reference.
	 * @see #setInertiaMatrix(Matrix3x3)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getPhysicalProperties_InertiaMatrix()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Matrix3x3 getInertiaMatrix();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties#getInertiaMatrix <em>Inertia Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertia Matrix</em>' containment reference.
	 * @see #getInertiaMatrix()
	 * @generated
	 */
	void setInertiaMatrix(Matrix3x3 value);

	/**
	 * Returns the value of the '<em><b>Center Of Mass Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the center of mass of the body expressed in the body frame of reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Center Of Mass Location</em>' containment reference.
	 * @see #setCenterOfMassLocation(Tuple3d)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getPhysicalProperties_CenterOfMassLocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tuple3d getCenterOfMassLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.PhysicalProperties#getCenterOfMassLocation <em>Center Of Mass Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Of Mass Location</em>' containment reference.
	 * @see #getCenterOfMassLocation()
	 * @generated
	 */
	void setCenterOfMassLocation(Tuple3d value);

} // PhysicalProperties
