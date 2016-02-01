/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;

import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitContainer;
import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import org.orekit.errors.PropagationException;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.analytical.KeplerianPropagator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keplerian Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitPropagatorImpl#getStartOrbit <em>Start Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitPropagatorImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitPropagatorImpl#getValidToDate <em>Valid To Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeplerianEarthOrbitPropagatorImpl extends EarthOrbitPropagatorImpl implements KeplerianEarthOrbitPropagator {
	/**
	 * The cached value of the '{@link #getStartOrbit() <em>Start Orbit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOrbit()
	 * @generated
	 * @ordered
	 */
	protected Orbit startOrbit;
	/**
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date validFromDate = VALID_FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_TO_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected Date validToDate = VALID_TO_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeplerianEarthOrbitPropagatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.KEPLERIAN_EARTH_ORBIT_PROPAGATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getStartOrbit() {
		if (startOrbit != null && startOrbit.eIsProxy()) {
			InternalEObject oldStartOrbit = (InternalEObject)startOrbit;
			startOrbit = (Orbit)eResolveProxy(oldStartOrbit);
			if (startOrbit != oldStartOrbit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT, oldStartOrbit, startOrbit));
			}
		}
		return startOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit basicGetStartOrbit() {
		return startOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOrbit(Orbit newStartOrbit) {
		Orbit oldStartOrbit = startOrbit;
		startOrbit = newStartOrbit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT, oldStartOrbit, startOrbit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFromDate(Date newValidFromDate) {
		Date oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidToDate() {
		return validToDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidToDate(Date newValidToDate) {
		Date oldValidToDate = validToDate;
		validToDate = newValidToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE, oldValidToDate, validToDate));
	}

	@Override
	public Orbit getInitialOrbit() 
	{
		return getStartOrbit();
	}
	
	@Override
	public Date getFromValidDate() 
	{
		return getValidFromDate();
	}
	
	@Override
	public Date getToValidDate() 
	{		
		return getValidToDate();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public KeplerianPropagator getOreKitKeplerianPropagator() 
	{						
		KeplerianPropagator kepler = null;
		if(getInitialOrbit() instanceof EarthOrbit)
		{
			EarthOrbit eo = (EarthOrbit) getInitialOrbit();						
			try 
			{
				kepler = new KeplerianPropagator(eo.getOreKitOrbit());
			} 
			catch (PropagationException e) 
			{			
				e.printStackTrace();				
			}				
		}
		return kepler;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT:
				if (resolve) return getStartOrbit();
				return basicGetStartOrbit();
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return getValidFromDate();
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return getValidToDate();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT:
				setStartOrbit((Orbit)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				setValidFromDate((Date)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				setValidToDate((Date)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT:
				setStartOrbit((Orbit)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				setValidToDate(VALID_TO_DATE_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT:
				return startOrbit != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return VALID_TO_DATE_EDEFAULT == null ? validToDate != null : !VALID_TO_DATE_EDEFAULT.equals(validToDate);
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
		if (baseClass == InitialOrbitContainer.class) {
			switch (derivedFeatureID) {
				case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT: return ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT;
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
		if (baseClass == InitialOrbitContainer.class) {
			switch (baseFeatureID) {
				case ApogyCoreEnvironmentOrbitPackage.INITIAL_ORBIT_CONTAINER__START_ORBIT: return ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR__START_ORBIT;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_KEPLERIAN_PROPAGATOR:
				return getOreKitKeplerianPropagator();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (validFromDate: ");
		result.append(validFromDate);
		result.append(", validToDate: ");
		result.append(validToDate);
		result.append(')');
		return result.toString();
	}

	@Override
	public Propagator getOreKitPropagator() 
	{
		return getOreKitKeplerianPropagator();
	}
	
} //KeplerianEarthOrbitPropagatorImpl
