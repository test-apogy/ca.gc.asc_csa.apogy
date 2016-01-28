/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage;
import org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl;
import org.orekit.orbits.Orbit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EarthOrbitImpl extends OrbitImpl implements EarthOrbit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentOrbitEarthPackage.Literals.EARTH_ORBIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getOreKitOrbit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CoreEnvironmentOrbitEarthPackage.EARTH_ORBIT___GET_ORE_KIT_ORBIT:
				return getOreKitOrbit();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EarthOrbitImpl
