/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.AbstractToolsListContainerImpl;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft Visibility Pass View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationListImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpacecraftVisibilityPassViewConfigurationListImpl extends AbstractToolsListContainerImpl implements SpacecraftVisibilityPassViewConfigurationList {
	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpacecraftVisibilityPassViewConfiguration> configurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftVisibilityPassViewConfigurationListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentUIPackage.Literals.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpacecraftVisibilityPassViewConfiguration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentWithInverseEList<SpacecraftVisibilityPassViewConfiguration>(SpacecraftVisibilityPassViewConfiguration.class, this, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS, SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST);
		}
		return configurations;
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfigurations()).basicAdd(otherEnd, msgs);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS:
				return getConfigurations();
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends SpacecraftVisibilityPassViewConfiguration>)newValue);
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS:
				getConfigurations().clear();
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
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpacecraftVisibilityPassViewConfigurationListImpl
