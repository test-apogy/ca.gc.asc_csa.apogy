/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimFactoryImpl.java,v 1.2.4.3 2015/09/22 19:39:35 rlarcheveque Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.sensors.gps.sim.SimFacade;
import ca.gc.space.mrt.sensors.gps.sim.SimFactory;
import ca.gc.space.mrt.sensors.gps.sim.SimPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedConnection;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimFactoryImpl extends EFactoryImpl implements SimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimFactory init() {
		try {
			SimFactory theSimFactory = (SimFactory)EPackage.Registry.INSTANCE.getEFactory(SimPackage.eNS_URI);
			if (theSimFactory != null) {
				return theSimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimPackage.SIMULATED_CONNECTION: return createSimulatedConnection();
			case SimPackage.SIMULATED_DATA_INTERPRETER: return createSimulatedDataInterpreter();
			case SimPackage.SIM_FACADE: return createSimFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedConnection createSimulatedConnection() {
		SimulatedConnectionImpl simulatedConnection = new SimulatedConnectionImpl();
		return simulatedConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedDataInterpreter createSimulatedDataInterpreter() {
		SimulatedDataInterpreterImpl simulatedDataInterpreter = new SimulatedDataInterpreterImpl();
		return simulatedDataInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimFacade createSimFacade() {
		SimFacadeImpl simFacade = new SimFacadeImpl();
		return simFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimPackage getSimPackage() {
		return (SimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimPackage getPackage() {
		return SimPackage.eINSTANCE;
	}

} //SimFactoryImpl
