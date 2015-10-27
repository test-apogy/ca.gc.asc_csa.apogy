/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList;
import org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft Visibility Pass View Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl#getConfigurationsList <em>Configurations List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl#getVisibilitySet <em>Visibility Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpacecraftVisibilityPassViewConfigurationImpl extends MinimalEObjectImpl.Container implements SpacecraftVisibilityPassViewConfiguration {
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
	 * The cached value of the '{@link #getVisibilitySet() <em>Visibility Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilitySet()
	 * @generated
	 * @ordered
	 */
	protected SpacecraftsVisibilitySet visibilitySet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftVisibilityPassViewConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftVisibilityPassViewConfigurationList getConfigurationsList() {
		if (eContainerFeatureID() != Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST) return null;
		return (SpacecraftVisibilityPassViewConfigurationList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftVisibilityPassViewConfigurationList basicGetConfigurationsList() {
		if (eContainerFeatureID() != Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST) return null;
		return (SpacecraftVisibilityPassViewConfigurationList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationsList(SpacecraftVisibilityPassViewConfigurationList newConfigurationsList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConfigurationsList, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationsList(SpacecraftVisibilityPassViewConfigurationList newConfigurationsList) {
		if (newConfigurationsList != eInternalContainer() || (eContainerFeatureID() != Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST && newConfigurationsList != null)) {
			if (EcoreUtil.isAncestor(this, newConfigurationsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConfigurationsList != null)
				msgs = ((InternalEObject)newConfigurationsList).eInverseAdd(this, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS, SpacecraftVisibilityPassViewConfigurationList.class, msgs);
			msgs = basicSetConfigurationsList(newConfigurationsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST, newConfigurationsList, newConfigurationsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftsVisibilitySet getVisibilitySet() {
		return visibilitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibilitySet(SpacecraftsVisibilitySet newVisibilitySet, NotificationChain msgs) {
		SpacecraftsVisibilitySet oldVisibilitySet = visibilitySet;
		visibilitySet = newVisibilitySet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET, oldVisibilitySet, newVisibilitySet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilitySet(SpacecraftsVisibilitySet newVisibilitySet) {
		if (newVisibilitySet != visibilitySet) {
			NotificationChain msgs = null;
			if (visibilitySet != null)
				msgs = ((InternalEObject)visibilitySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET, null, msgs);
			if (newVisibilitySet != null)
				msgs = ((InternalEObject)newVisibilitySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET, null, msgs);
			msgs = basicSetVisibilitySet(newVisibilitySet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET, newVisibilitySet, newVisibilitySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConfigurationsList((SpacecraftVisibilityPassViewConfigurationList)otherEnd, msgs);
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST:
				return basicSetConfigurationsList(null, msgs);
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET:
				return basicSetVisibilitySet(null, msgs);
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST:
				return eInternalContainer().eInverseRemove(this, Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS, SpacecraftVisibilityPassViewConfigurationList.class, msgs);
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__NAME:
				return getName();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION:
				return getDescription();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST:
				if (resolve) return getConfigurationsList();
				return basicGetConfigurationsList();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET:
				return getVisibilitySet();
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST:
				setConfigurationsList((SpacecraftVisibilityPassViewConfigurationList)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET:
				setVisibilitySet((SpacecraftsVisibilitySet)newValue);
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST:
				setConfigurationsList((SpacecraftVisibilityPassViewConfigurationList)null);
				return;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET:
				setVisibilitySet((SpacecraftsVisibilitySet)null);
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST:
				return basicGetConfigurationsList() != null;
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET:
				return visibilitySet != null;
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
				case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION;
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

} //SpacecraftVisibilityPassViewConfigurationImpl
