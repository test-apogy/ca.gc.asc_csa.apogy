/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintAttachmentPointImpl.java,v 1.7.2.3 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.math.Matrix4x4;

import ca.gc.asc_csa.topology.dynamics.AbstractConstraint;
import ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint;
import ca.gc.asc_csa.topology.dynamics.PhysicalBody;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Attachment Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.ConstraintAttachmentPointImpl#getPhysicalBody <em>Physical Body</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.ConstraintAttachmentPointImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.ConstraintAttachmentPointImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.ConstraintAttachmentPointImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.impl.ConstraintAttachmentPointImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintAttachmentPointImpl extends EObjectImpl implements ConstraintAttachmentPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * The cached value of the '{@link #getPhysicalBody() <em>Physical Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalBody()
	 * @generated
	 * @ordered
	 */
	protected PhysicalBody physicalBody;

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
	protected ConstraintAttachmentPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyDynamicsPackage.Literals.CONSTRAINT_ATTACHMENT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBody getPhysicalBody() {
		if (physicalBody != null && physicalBody.eIsProxy()) {
			InternalEObject oldPhysicalBody = (InternalEObject)physicalBody;
			physicalBody = (PhysicalBody)eResolveProxy(oldPhysicalBody);
			if (physicalBody != oldPhysicalBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY, oldPhysicalBody, physicalBody));
			}
		}
		return physicalBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBody basicGetPhysicalBody() {
		return physicalBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalBody(PhysicalBody newPhysicalBody, NotificationChain msgs) {
		PhysicalBody oldPhysicalBody = physicalBody;
		physicalBody = newPhysicalBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY, oldPhysicalBody, newPhysicalBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalBody(PhysicalBody newPhysicalBody) {
		if (newPhysicalBody != physicalBody) {
			NotificationChain msgs = null;
			if (physicalBody != null)
				msgs = ((InternalEObject)physicalBody).eInverseRemove(this, TopologyDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS, PhysicalBody.class, msgs);
			if (newPhysicalBody != null)
				msgs = ((InternalEObject)newPhysicalBody).eInverseAdd(this, TopologyDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS, PhysicalBody.class, msgs);
			msgs = basicSetPhysicalBody(newPhysicalBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY, newPhysicalBody, newPhysicalBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstraint getConstraint() {
		if (eContainerFeatureID() != TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT) return null;
		return (AbstractConstraint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(AbstractConstraint newConstraint, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstraint, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(AbstractConstraint newConstraint) {
		if (newConstraint != eInternalContainer() || (eContainerFeatureID() != TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT && newConstraint != null)) {
			if (EcoreUtil.isAncestor(this, newConstraint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS, AbstractConstraint.class, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT, newConstraint, newConstraint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM, oldTransform, newTransform);
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
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM, newTransform, newTransform));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY:
				if (physicalBody != null)
					msgs = ((InternalEObject)physicalBody).eInverseRemove(this, TopologyDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS, PhysicalBody.class, msgs);
				return basicSetPhysicalBody((PhysicalBody)otherEnd, msgs);
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstraint((AbstractConstraint)otherEnd, msgs);
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
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY:
				return basicSetPhysicalBody(null, msgs);
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT:
				return eInternalContainer().eInverseRemove(this, TopologyDynamicsPackage.ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS, AbstractConstraint.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY:
				if (resolve) return getPhysicalBody();
				return basicGetPhysicalBody();
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT:
				return getConstraint();
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM:
				return getTransform();
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION:
				return getDescription();
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY:
				setPhysicalBody((PhysicalBody)newValue);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT:
				setConstraint((AbstractConstraint)newValue);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM:
				setTransform((Matrix4x4)newValue);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__ID:
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
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY:
				setPhysicalBody((PhysicalBody)null);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT:
				setConstraint((AbstractConstraint)null);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM:
				setTransform((Matrix4x4)null);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__ID:
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
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY:
				return physicalBody != null;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT:
				return getConstraint() != null;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__TRANSFORM:
				return transform != null;
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT__ID:
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

} //ConstraintAttachmentPointImpl
