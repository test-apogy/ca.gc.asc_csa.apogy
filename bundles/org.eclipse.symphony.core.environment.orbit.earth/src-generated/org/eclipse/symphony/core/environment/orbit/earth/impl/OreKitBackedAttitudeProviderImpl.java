/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import ca.gc.asc_csa.symphony.environment.orbit.AbstractFrame;
import ca.gc.asc_csa.symphony.environment.orbit.PVCoordinatesProviderProvider;
import ca.gc.asc_csa.symphony.environment.orbit.SpacecraftAttitude;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedAttitudeProvider;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.orekit.attitudes.AttitudeProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ore Kit Backed Attitude Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class OreKitBackedAttitudeProviderImpl extends MinimalEObjectImpl.Container implements OreKitBackedAttitudeProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OreKitBackedAttitudeProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.ORE_KIT_BACKED_ATTITUDE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttitudeProvider getOreKitAttitudeProvider() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftAttitude getAttitude(PVCoordinatesProviderProvider pvProvider, Date date, AbstractFrame frame) {
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
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ORE_KIT_ATTITUDE_PROVIDER:
				return getOreKitAttitudeProvider();
			case SymphonyEarthOrbitEnvironmentPackage.ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME:
				return getAttitude((PVCoordinatesProviderProvider)arguments.get(0), (Date)arguments.get(1), (AbstractFrame)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OreKitBackedAttitudeProviderImpl
