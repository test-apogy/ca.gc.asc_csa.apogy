/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollisionGeometryImpl.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ca.gc.asc_csa.topology.dynamics.AbstractCollisionGeometrySimulationProperties;
import ca.gc.asc_csa.topology.dynamics.AbstractMaterial;
import ca.gc.asc_csa.topology.dynamics.CollisionGeometry;
import ca.gc.asc_csa.topology.dynamics.Geometry;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage;
import ca.gc.space.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collision Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.CollisionGeometryImpl#getSimulationProperties <em>Simulation Properties</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.CollisionGeometryImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.CollisionGeometryImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.CollisionGeometryImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.CollisionGeometryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.CollisionGeometryImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollisionGeometryImpl extends EObjectImpl implements CollisionGeometry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * The cached value of the '{@link #getSimulationProperties() <em>Simulation Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCollisionGeometrySimulationProperties> simulationProperties;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Geometry geometry;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 transform;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected AbstractMaterial material;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollisionGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyDynamicsPackage.Literals.COLLISION_GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCollisionGeometrySimulationProperties> getSimulationProperties() {
		if (simulationProperties == null) {
			simulationProperties = new EObjectResolvingEList<AbstractCollisionGeometrySimulationProperties>(AbstractCollisionGeometrySimulationProperties.class, this, TopologyDynamicsPackage.COLLISION_GEOMETRY__SIMULATION_PROPERTIES);
		}
		return simulationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(Geometry newGeometry, NotificationChain msgs) {
		Geometry oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY, oldGeometry, newGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(Geometry newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(Matrix4x4 newTransform, NotificationChain msgs) {
		Matrix4x4 oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Matrix4x4 newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMaterial getMaterial() {
		if (material != null && material.eIsProxy()) {
			InternalEObject oldMaterial = (InternalEObject)material;
			material = (AbstractMaterial)eResolveProxy(oldMaterial);
			if (material != oldMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyDynamicsPackage.COLLISION_GEOMETRY__MATERIAL, oldMaterial, material));
			}
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMaterial basicGetMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(AbstractMaterial newMaterial) {
		AbstractMaterial oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.COLLISION_GEOMETRY__MATERIAL, oldMaterial, material));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.COLLISION_GEOMETRY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.COLLISION_GEOMETRY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM:
				return basicSetTransform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__SIMULATION_PROPERTIES:
				return getSimulationProperties();
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY:
				return getGeometry();
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM:
				return getTransform();
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__MATERIAL:
				if (resolve) return getMaterial();
				return basicGetMaterial();
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__DESCRIPTION:
				return getDescription();
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__SIMULATION_PROPERTIES:
				getSimulationProperties().clear();
				getSimulationProperties().addAll((Collection<? extends AbstractCollisionGeometrySimulationProperties>)newValue);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY:
				setGeometry((Geometry)newValue);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM:
				setTransform((Matrix4x4)newValue);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__MATERIAL:
				setMaterial((AbstractMaterial)newValue);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__SIMULATION_PROPERTIES:
				getSimulationProperties().clear();
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY:
				setGeometry((Geometry)null);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM:
				setTransform((Matrix4x4)null);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__MATERIAL:
				setMaterial((AbstractMaterial)null);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__SIMULATION_PROPERTIES:
				return simulationProperties != null && !simulationProperties.isEmpty();
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__GEOMETRY:
				return geometry != null;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__TRANSFORM:
				return transform != null;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__MATERIAL:
				return material != null;
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TopologyDynamicsPackage.COLLISION_GEOMETRY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CollisionGeometryImpl
