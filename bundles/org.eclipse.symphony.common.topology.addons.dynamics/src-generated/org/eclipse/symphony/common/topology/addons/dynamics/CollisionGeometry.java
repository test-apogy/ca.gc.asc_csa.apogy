/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class defining the bounding volume used in collision detection and handling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getSimulationProperties <em>Simulation Properties</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getGeometryId <em>Geometry Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCollisionGeometry()
 * @model
 * @generated
 */
public interface CollisionGeometry extends EObject {
	/**
	 * Returns the value of the '<em><b>Simulation Properties</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractCollisionGeometrySimulationProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simulation specific collision geometry properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simulation Properties</em>' reference list.
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCollisionGeometry_SimulationProperties()
	 * @model
	 * @generated
	 */
	EList<AbstractCollisionGeometrySimulationProperties> getSimulationProperties();

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collision geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(Geometry)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCollisionGeometry_Geometry()
	 * @model containment="true"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transform matrix locating the geometry relative to the AbstractCollisionGeometry owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Matrix4x4)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCollisionGeometry_Transform()
	 * @model containment="true"
	 * @generated
	 */
	Matrix4x4 getTransform();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Matrix4x4 value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the material associated with this collision geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(AbstractMaterial)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCollisionGeometry_Material()
	 * @model
	 * @generated
	 */
	AbstractMaterial getMaterial();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(AbstractMaterial value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual description of this collision geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCollisionGeometry_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Geometry Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the collision geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Id</em>' attribute.
	 * @see #setGeometryId(String)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getCollisionGeometry_GeometryId()
	 * @model unique="false"
	 * @generated
	 */
	String getGeometryId();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.CollisionGeometry#getGeometryId <em>Geometry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Id</em>' attribute.
	 * @see #getGeometryId()
	 * @generated
	 */
	void setGeometryId(String value);

} // CollisionGeometry
