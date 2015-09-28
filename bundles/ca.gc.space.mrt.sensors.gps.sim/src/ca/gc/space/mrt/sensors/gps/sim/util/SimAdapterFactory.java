/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimAdapterFactory.java,v 1.2.4.3 2015/09/22 19:39:35 rlarcheveque Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.sensors.gps.GPSConnection;
import ca.gc.space.mrt.sensors.gps.GPSDataInterpreter;
import ca.gc.space.mrt.sensors.gps.sim.SimFacade;
import ca.gc.space.mrt.sensors.gps.sim.SimPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage
 * @generated
 */
public class SimAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public SimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SimSwitch<Adapter> modelSwitch = new SimSwitch<Adapter>() {
			@Override
			public Adapter caseSimulatedConnection(SimulatedConnection object) {
				return createSimulatedConnectionAdapter();
			}
			@Override
			public Adapter caseSimulatedDataInterpreter(SimulatedDataInterpreter object) {
				return createSimulatedDataInterpreterAdapter();
			}
			@Override
			public Adapter caseSimFacade(SimFacade object) {
				return createSimFacadeAdapter();
			}
			@Override
			public Adapter caseGPSConnection(GPSConnection object) {
				return createGPSConnectionAdapter();
			}
			@Override
			public Adapter caseGPSDataInterpreter(GPSDataInterpreter object) {
				return createGPSDataInterpreterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection <em>Simulated Connection</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection
	 * @generated
	 */
	public Adapter createSimulatedConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter <em>Simulated Data Interpreter</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter
	 * @generated
	 */
	public Adapter createSimulatedDataInterpreterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link ca.gc.space.mrt.sensors.gps.sim.SimFacade <em>Facade</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.gps.sim.SimFacade
	 * @generated
	 */
	public Adapter createSimFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.gps.GPSConnection <em>GPS Connection</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.gps.GPSConnection
	 * @generated
	 */
	public Adapter createGPSConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.gps.GPSDataInterpreter <em>GPS Data Interpreter</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.gps.GPSDataInterpreter
	 * @generated
	 */
	public Adapter createGPSDataInterpreterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // SimAdapterFactory
