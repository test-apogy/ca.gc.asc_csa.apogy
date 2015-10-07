/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.AbstractWorksite;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.WorksitesList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstract Worksite</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.AbstractWorksiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.AbstractWorksiteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.AbstractWorksiteImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.AbstractWorksiteImpl#getWorksitesList <em>Worksites List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractWorksiteImpl extends MinimalEObjectImpl.Container
		implements AbstractWorksite {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractWorksiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.ABSTRACT_WORKSITE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ABSTRACT_WORKSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ABSTRACT_WORKSITE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WorksitesList getWorksitesList() {
		if (eContainerFeatureID() != SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST) return null;
		return (WorksitesList)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WorksitesList basicGetWorksitesList() {
		if (eContainerFeatureID() != SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST) return null;
		return (WorksitesList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorksitesList(
			WorksitesList newWorksitesList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorksitesList, SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorksitesList(WorksitesList newWorksitesList) {
		if (newWorksitesList != eInternalContainer() || (eContainerFeatureID() != SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST && newWorksitesList != null)) {
			if (EcoreUtil.isAncestor(this, newWorksitesList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorksitesList != null)
				msgs = ((InternalEObject)newWorksitesList).eInverseAdd(this, SymphonyCorePackage.WORKSITES_LIST__WORKSITES, WorksitesList.class, msgs);
			msgs = basicSetWorksitesList(newWorksitesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST, newWorksitesList, newWorksitesList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorksitesList((WorksitesList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST:
				return basicSetWorksitesList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST:
				return eInternalContainer().eInverseRemove(this, SymphonyCorePackage.WORKSITES_LIST__WORKSITES, WorksitesList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCorePackage.ABSTRACT_WORKSITE__NAME:
				return getName();
			case SymphonyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION:
				return getDescription();
			case SymphonyCorePackage.ABSTRACT_WORKSITE__TIME:
				return getTime();
			case SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST:
				if (resolve) return getWorksitesList();
				return basicGetWorksitesList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyCorePackage.ABSTRACT_WORKSITE__NAME:
				setName((String)newValue);
				return;
			case SymphonyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyCorePackage.ABSTRACT_WORKSITE__TIME:
				setTime((Date)newValue);
				return;
			case SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST:
				setWorksitesList((WorksitesList)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymphonyCorePackage.ABSTRACT_WORKSITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyCorePackage.ABSTRACT_WORKSITE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST:
				setWorksitesList((WorksitesList)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymphonyCorePackage.ABSTRACT_WORKSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyCorePackage.ABSTRACT_WORKSITE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case SymphonyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST:
				return basicGetWorksitesList() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case SymphonyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case SymphonyCorePackage.ABSTRACT_WORKSITE__TIME: return EMFEcorePackage.TIMED__TIME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.TIMED__TIME: return SymphonyCorePackage.ABSTRACT_WORKSITE__TIME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} // AbstractWorksiteImpl
