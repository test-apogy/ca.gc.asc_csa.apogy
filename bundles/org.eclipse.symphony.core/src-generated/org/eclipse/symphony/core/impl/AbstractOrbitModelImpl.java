/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.AbstractOrbitModel;
import org.eclipse.symphony.core.OrbitModelsList;
import org.eclipse.symphony.core.Symphony__CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.AbstractOrbitModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.AbstractOrbitModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.AbstractOrbitModelImpl#getOrbitModelsList <em>Orbit Models List</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractOrbitModelImpl extends MinimalEObjectImpl.Container implements AbstractOrbitModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractOrbitModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CorePackage.Literals.ABSTRACT_ORBIT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModelsList getOrbitModelsList() {
		if (eContainerFeatureID() != Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST) return null;
		return (OrbitModelsList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModelsList basicGetOrbitModelsList() {
		if (eContainerFeatureID() != Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST) return null;
		return (OrbitModelsList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrbitModelsList(OrbitModelsList newOrbitModelsList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrbitModelsList, Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModelsList(OrbitModelsList newOrbitModelsList) {
		if (newOrbitModelsList != eInternalContainer() || (eContainerFeatureID() != Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST && newOrbitModelsList != null)) {
			if (EcoreUtil.isAncestor(this, newOrbitModelsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrbitModelsList != null)
				msgs = ((InternalEObject)newOrbitModelsList).eInverseAdd(this, Symphony__CorePackage.ORBIT_MODELS_LIST__ORBIT_MODELS, OrbitModelsList.class, msgs);
			msgs = basicSetOrbitModelsList(newOrbitModelsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST, newOrbitModelsList, newOrbitModelsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrbitModelsList((OrbitModelsList)otherEnd, msgs);
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
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST:
				return basicSetOrbitModelsList(null, msgs);
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
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST:
				return eInternalContainer().eInverseRemove(this, Symphony__CorePackage.ORBIT_MODELS_LIST__ORBIT_MODELS, OrbitModelsList.class, msgs);
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
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__NAME:
				return getName();
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION:
				return getDescription();
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST:
				if (resolve) return getOrbitModelsList();
				return basicGetOrbitModelsList();
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
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__NAME:
				setName((String)newValue);
				return;
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST:
				setOrbitModelsList((OrbitModelsList)newValue);
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
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST:
				setOrbitModelsList((OrbitModelsList)null);
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
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST:
				return basicGetOrbitModelsList() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AbstractOrbitModelImpl
