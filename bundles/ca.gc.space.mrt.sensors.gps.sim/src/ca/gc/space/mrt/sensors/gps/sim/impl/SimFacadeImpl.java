/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimFacadeImpl.java,v 1.2.4.2 2015/05/21 15:50:11 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data3d.PositionMarker;
import ca.gc.space.mrt.sensors.gps.GPSFacade;
import ca.gc.space.mrt.sensors.gps.MarkedGPS;
import ca.gc.space.mrt.sensors.gps.sim.SimFacade;
import ca.gc.space.mrt.sensors.gps.sim.SimFactory;
import ca.gc.space.mrt.sensors.gps.sim.SimPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SimFacadeImpl extends EObjectImpl implements SimFacade {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SimFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimPackage.Literals.SIM_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public MarkedGPS createSimulatedGPS(double initialLatitude,
			double initialLongitude, PositionMarker marker) {
		MarkedGPS gps = GPSFacade.INSTANCE.createMarkedGPS(marker);

		SimulatedConnection connection = SimFactory.eINSTANCE
				.createSimulatedConnection();
		SimulatedDataInterpreter interpreter = SimFactory.eINSTANCE
				.createSimulatedDataInterpreter();
		interpreter.setStartLatitude(initialLatitude);
		interpreter.setStartLongitude(initialLongitude);

		gps.setConnection(connection);
		gps.setDataInterpreter(interpreter);

		return gps;
	}

} // SimFacadeImpl
