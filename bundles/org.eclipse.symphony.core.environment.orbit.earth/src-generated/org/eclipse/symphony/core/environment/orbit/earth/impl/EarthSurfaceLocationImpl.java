/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation;
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getGeographicalCoordinates <em>Geographical Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthSurfaceLocationImpl extends MinimalEObjectImpl.Container implements EarthSurfaceLocation {
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
	 * The cached value of the '{@link #getGeographicalCoordinates() <em>Geographical Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicalCoordinates()
	 * @generated
	 * @ordered
	 */
	protected GeographicCoordinates geographicalCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthSurfaceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentOrbitEarthPackage.Literals.EARTH_SURFACE_LOCATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public GeographicCoordinates getGeographicalCoordinates() 
	{
		GeographicCoordinates tmp = getGeographicalCoordinatesGen();
		
		if(tmp == null)
		{
			tmp = Symphony__CoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
			setGeographicalCoordinates(tmp);
		}
		
		return tmp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinates getGeographicalCoordinatesGen() {
		return geographicalCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicalCoordinates(GeographicCoordinates newGeographicalCoordinates, NotificationChain msgs) {
		GeographicCoordinates oldGeographicalCoordinates = geographicalCoordinates;
		geographicalCoordinates = newGeographicalCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES, oldGeographicalCoordinates, newGeographicalCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicalCoordinates(GeographicCoordinates newGeographicalCoordinates) {
		if (newGeographicalCoordinates != geographicalCoordinates) {
			NotificationChain msgs = null;
			if (geographicalCoordinates != null)
				msgs = ((InternalEObject)geographicalCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES, null, msgs);
			if (newGeographicalCoordinates != null)
				msgs = ((InternalEObject)newGeographicalCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES, null, msgs);
			msgs = basicSetGeographicalCoordinates(newGeographicalCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES, newGeographicalCoordinates, newGeographicalCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES:
				return basicSetGeographicalCoordinates(null, msgs);
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				return getName();
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				return getDescription();
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES:
				return getGeographicalCoordinates();
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				setName((String)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES:
				setGeographicalCoordinates((GeographicCoordinates)newValue);
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES:
				setGeographicalCoordinates((GeographicCoordinates)null);
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES:
				return geographicalCoordinates != null;
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
				case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION;
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

} //EarthSurfaceLocationImpl
