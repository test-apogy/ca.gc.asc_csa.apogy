/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraintSimulationProperties;
import org.eclipse.symphony.common.topology.addons.dynamics.ConstraintAttachmentPoint;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.AbstractConstraintImpl#getAttachmentPoints <em>Attachment Points</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.AbstractConstraintImpl#getSimulationProperties <em>Simulation Properties</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.AbstractConstraintImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.AbstractConstraintImpl#getConstaintId <em>Constaint Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.AbstractConstraintImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractConstraintImpl extends MinimalEObjectImpl.Container implements AbstractConstraint {
	/**
	 * The cached value of the '{@link #getAttachmentPoints() <em>Attachment Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintAttachmentPoint> attachmentPoints;

	/**
	 * The cached value of the '{@link #getSimulationProperties() <em>Simulation Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstraintSimulationProperties> simulationProperties;

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
	 * The default value of the '{@link #getConstaintId() <em>Constaint Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstaintId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTAINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstaintId() <em>Constaint Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstaintId()
	 * @generated
	 * @ordered
	 */
	protected String constaintId = CONSTAINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyDynamicsPackage.Literals.ABSTRACT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintAttachmentPoint> getAttachmentPoints() {
		if (attachmentPoints == null) {
			attachmentPoints = new EObjectContainmentWithInverseEList<ConstraintAttachmentPoint>(ConstraintAttachmentPoint.class, this, TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT);
		}
		return attachmentPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstraintSimulationProperties> getSimulationProperties() {
		if (simulationProperties == null) {
			simulationProperties = new EObjectResolvingEList<AbstractConstraintSimulationProperties>(AbstractConstraintSimulationProperties.class, this, TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES);
		}
		return simulationProperties;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstaintId() {
		return constaintId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstaintId(String newConstaintId) {
		String oldConstaintId = constaintId;
		constaintId = newConstaintId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__CONSTAINT_ID, oldConstaintId, constaintId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ENABLED, oldEnabled, enabled));
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
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttachmentPoints()).basicAdd(otherEnd, msgs);
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
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS:
				return ((InternalEList<?>)getAttachmentPoints()).basicRemove(otherEnd, msgs);
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
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS:
				return getAttachmentPoints();
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES:
				return getSimulationProperties();
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__DESCRIPTION:
				return getDescription();
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__CONSTAINT_ID:
				return getConstaintId();
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ENABLED:
				return isEnabled();
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
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS:
				getAttachmentPoints().clear();
				getAttachmentPoints().addAll((Collection<? extends ConstraintAttachmentPoint>)newValue);
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES:
				getSimulationProperties().clear();
				getSimulationProperties().addAll((Collection<? extends AbstractConstraintSimulationProperties>)newValue);
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__CONSTAINT_ID:
				setConstaintId((String)newValue);
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ENABLED:
				setEnabled((Boolean)newValue);
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
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS:
				getAttachmentPoints().clear();
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES:
				getSimulationProperties().clear();
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__CONSTAINT_ID:
				setConstaintId(CONSTAINT_ID_EDEFAULT);
				return;
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS:
				return attachmentPoints != null && !attachmentPoints.isEmpty();
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES:
				return simulationProperties != null && !simulationProperties.isEmpty();
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__CONSTAINT_ID:
				return CONSTAINT_ID_EDEFAULT == null ? constaintId != null : !CONSTAINT_ID_EDEFAULT.equals(constaintId);
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ENABLED:
				return enabled != ENABLED_EDEFAULT;
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
		result.append(", constaintId: ");
		result.append(constaintId);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //AbstractConstraintImpl
