/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfiguration;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfigurationList;
import org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage;
import org.eclipse.symphony.core.invocator.impl.AbstractToolsListContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.impl.EarthViewConfigurationListImpl#getEarthViewConfigurations <em>Earth View Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthViewConfigurationListImpl extends AbstractToolsListContainerImpl implements EarthViewConfigurationList {
	/**
	 * The cached value of the '{@link #getEarthViewConfigurations() <em>Earth View Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarthViewConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<EarthViewConfiguration> earthViewConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthViewConfigurationListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentOrbitEarthUIPackage.Literals.EARTH_VIEW_CONFIGURATION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EarthViewConfiguration> getEarthViewConfigurations() {
		if (earthViewConfigurations == null) {
			earthViewConfigurations = new EObjectContainmentEList<EarthViewConfiguration>(EarthViewConfiguration.class, this, Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS);
		}
		return earthViewConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				return ((InternalEList<?>)getEarthViewConfigurations()).basicRemove(otherEnd, msgs);
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				return getEarthViewConfigurations();
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				getEarthViewConfigurations().clear();
				getEarthViewConfigurations().addAll((Collection<? extends EarthViewConfiguration>)newValue);
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				getEarthViewConfigurations().clear();
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
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				return earthViewConfigurations != null && !earthViewConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EarthViewConfigurationListImpl
