package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl#getPhysicalProperties <em>Physical Properties</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl#getConstraintAttachmentPoints <em>Constraint Attachment Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl#getSimulationProperties <em>Simulation Properties</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl#getCenterOfMassKinematicState <em>Center Of Mass Kinematic State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl#getPointsOfInterest <em>Points Of Interest</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl#getCollisionGeometry <em>Collision Geometry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalBodyImpl extends AggregateGroupNodeImpl implements PhysicalBody {
	/**
	 * The cached value of the '{@link #getPhysicalProperties() <em>Physical Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalProperties()
	 * @generated
	 * @ordered
	 */
	protected PhysicalProperties physicalProperties;

	/**
	 * The cached value of the '{@link #getConstraintAttachmentPoints() <em>Constraint Attachment Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintAttachmentPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintAttachmentPoint> constraintAttachmentPoints;

	/**
	 * The cached value of the '{@link #getSimulationProperties() <em>Simulation Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPhysicalBodySimulationProperties> simulationProperties;

	/**
	 * The cached value of the '{@link #getCenterOfMassKinematicState() <em>Center Of Mass Kinematic State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterOfMassKinematicState()
	 * @generated
	 * @ordered
	 */
	protected KinematicState centerOfMassKinematicState;

	/**
	 * The cached value of the '{@link #getPointsOfInterest() <em>Points Of Interest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsOfInterest()
	 * @generated
	 * @ordered
	 */
	protected EList<PointOfInterest> pointsOfInterest;

	/**
	 * The cached value of the '{@link #getCollisionGeometry() <em>Collision Geometry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollisionGeometry()
	 * @generated
	 * @ordered
	 */
	protected EList<CollisionGeometry> collisionGeometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsDynamicsPackage.Literals.PHYSICAL_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalProperties getPhysicalProperties() {
		return physicalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalProperties(PhysicalProperties newPhysicalProperties, NotificationChain msgs) {
		PhysicalProperties oldPhysicalProperties = physicalProperties;
		physicalProperties = newPhysicalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES, oldPhysicalProperties, newPhysicalProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalProperties(PhysicalProperties newPhysicalProperties) {
		if (newPhysicalProperties != physicalProperties) {
			NotificationChain msgs = null;
			if (physicalProperties != null)
				msgs = ((InternalEObject)physicalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES, null, msgs);
			if (newPhysicalProperties != null)
				msgs = ((InternalEObject)newPhysicalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES, null, msgs);
			msgs = basicSetPhysicalProperties(newPhysicalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES, newPhysicalProperties, newPhysicalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintAttachmentPoint> getConstraintAttachmentPoints() {
		if (constraintAttachmentPoints == null) {
			constraintAttachmentPoints = new EObjectWithInverseResolvingEList<ConstraintAttachmentPoint>(ConstraintAttachmentPoint.class, this, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS, ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY);
		}
		return constraintAttachmentPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPhysicalBodySimulationProperties> getSimulationProperties() {
		if (simulationProperties == null) {
			simulationProperties = new EObjectContainmentEList<AbstractPhysicalBodySimulationProperties>(AbstractPhysicalBodySimulationProperties.class, this, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES);
		}
		return simulationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicState getCenterOfMassKinematicState() {
		return centerOfMassKinematicState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterOfMassKinematicState(KinematicState newCenterOfMassKinematicState, NotificationChain msgs) {
		KinematicState oldCenterOfMassKinematicState = centerOfMassKinematicState;
		centerOfMassKinematicState = newCenterOfMassKinematicState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE, oldCenterOfMassKinematicState, newCenterOfMassKinematicState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterOfMassKinematicState(KinematicState newCenterOfMassKinematicState) {
		if (newCenterOfMassKinematicState != centerOfMassKinematicState) {
			NotificationChain msgs = null;
			if (centerOfMassKinematicState != null)
				msgs = ((InternalEObject)centerOfMassKinematicState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE, null, msgs);
			if (newCenterOfMassKinematicState != null)
				msgs = ((InternalEObject)newCenterOfMassKinematicState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE, null, msgs);
			msgs = basicSetCenterOfMassKinematicState(newCenterOfMassKinematicState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE, newCenterOfMassKinematicState, newCenterOfMassKinematicState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointOfInterest> getPointsOfInterest() {
		if (pointsOfInterest == null) {
			pointsOfInterest = new EObjectContainmentEList<PointOfInterest>(PointOfInterest.class, this, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST);
		}
		return pointsOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollisionGeometry> getCollisionGeometry() {
		if (collisionGeometry == null) {
			collisionGeometry = new EObjectContainmentEList<CollisionGeometry>(CollisionGeometry.class, this, ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY);
		}
		return collisionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstraintAttachmentPoints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES:
				return basicSetPhysicalProperties(null, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS:
				return ((InternalEList<?>)getConstraintAttachmentPoints()).basicRemove(otherEnd, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES:
				return ((InternalEList<?>)getSimulationProperties()).basicRemove(otherEnd, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE:
				return basicSetCenterOfMassKinematicState(null, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST:
				return ((InternalEList<?>)getPointsOfInterest()).basicRemove(otherEnd, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY:
				return ((InternalEList<?>)getCollisionGeometry()).basicRemove(otherEnd, msgs);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES:
				return getPhysicalProperties();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS:
				return getConstraintAttachmentPoints();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES:
				return getSimulationProperties();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE:
				return getCenterOfMassKinematicState();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST:
				return getPointsOfInterest();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY:
				return getCollisionGeometry();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES:
				setPhysicalProperties((PhysicalProperties)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS:
				getConstraintAttachmentPoints().clear();
				getConstraintAttachmentPoints().addAll((Collection<? extends ConstraintAttachmentPoint>)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES:
				getSimulationProperties().clear();
				getSimulationProperties().addAll((Collection<? extends AbstractPhysicalBodySimulationProperties>)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE:
				setCenterOfMassKinematicState((KinematicState)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST:
				getPointsOfInterest().clear();
				getPointsOfInterest().addAll((Collection<? extends PointOfInterest>)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY:
				getCollisionGeometry().clear();
				getCollisionGeometry().addAll((Collection<? extends CollisionGeometry>)newValue);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES:
				setPhysicalProperties((PhysicalProperties)null);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS:
				getConstraintAttachmentPoints().clear();
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES:
				getSimulationProperties().clear();
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE:
				setCenterOfMassKinematicState((KinematicState)null);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST:
				getPointsOfInterest().clear();
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY:
				getCollisionGeometry().clear();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES:
				return physicalProperties != null;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS:
				return constraintAttachmentPoints != null && !constraintAttachmentPoints.isEmpty();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES:
				return simulationProperties != null && !simulationProperties.isEmpty();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE:
				return centerOfMassKinematicState != null;
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST:
				return pointsOfInterest != null && !pointsOfInterest.isEmpty();
			case ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY:
				return collisionGeometry != null && !collisionGeometry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalBodyImpl
