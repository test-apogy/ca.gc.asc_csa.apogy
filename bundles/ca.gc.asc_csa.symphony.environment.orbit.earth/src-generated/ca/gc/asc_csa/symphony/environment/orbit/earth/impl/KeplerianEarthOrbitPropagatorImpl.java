/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.orekit.errors.PropagationException;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.analytical.KeplerianPropagator;

import ca.gc.asc_csa.symphony.environment.orbit.earth.EarthOrbit;
import ca.gc.asc_csa.symphony.environment.orbit.earth.KeplerianEarthOrbitPropagator;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keplerian Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class KeplerianEarthOrbitPropagatorImpl extends EarthOrbitPropagatorImpl implements KeplerianEarthOrbitPropagator {
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
		return SymphonyEarthOrbitEnvironmentPackage.Literals.KEPLERIAN_EARTH_ORBIT_PROPAGATOR;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyEarthOrbitEnvironmentPackage.KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_KEPLERIAN_PROPAGATOR:
				return getOreKitKeplerianPropagator();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Propagator getOreKitPropagator() 
	{
		return getOreKitKeplerianPropagator();
	}
	
} //KeplerianEarthOrbitPropagatorImpl
