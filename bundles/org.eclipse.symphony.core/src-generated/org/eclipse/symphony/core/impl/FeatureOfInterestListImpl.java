/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.FeatureOfInterestList;
import org.eclipse.symphony.core.Symphony__CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Of Interest List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.FeatureOfInterestListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.FeatureOfInterestListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.FeatureOfInterestListImpl#getFeaturesOfInterest <em>Features Of Interest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureOfInterestListImpl extends MinimalEObjectImpl.Container implements FeatureOfInterestList {
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
	 * The cached value of the '{@link #getFeaturesOfInterest() <em>Features Of Interest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesOfInterest()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureOfInterest> featuresOfInterest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CorePackage.Literals.FEATURE_OF_INTEREST_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureOfInterest> getFeaturesOfInterest() {
		if (featuresOfInterest == null) {
			featuresOfInterest = new EObjectContainmentEList<FeatureOfInterest>(FeatureOfInterest.class, this, Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST);
		}
		return featuresOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST:
				return ((InternalEList<?>)getFeaturesOfInterest()).basicRemove(otherEnd, msgs);
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
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__NAME:
				return getName();
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__DESCRIPTION:
				return getDescription();
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST:
				return getFeaturesOfInterest();
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
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__NAME:
				setName((String)newValue);
				return;
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST:
				getFeaturesOfInterest().clear();
				getFeaturesOfInterest().addAll((Collection<? extends FeatureOfInterest>)newValue);
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
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST:
				getFeaturesOfInterest().clear();
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
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST:
				return featuresOfInterest != null && !featuresOfInterest.isEmpty();
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
				case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return Symphony__CorePackage.FEATURE_OF_INTEREST_LIST__DESCRIPTION;
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

} //FeatureOfInterestListImpl
