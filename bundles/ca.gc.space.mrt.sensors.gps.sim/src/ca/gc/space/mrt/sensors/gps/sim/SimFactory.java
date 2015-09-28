/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimFactory.java,v 1.2.4.2 2015/05/21 15:50:11 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.gps.sim.SimPackage
 * @generated
 */
public interface SimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimFactory eINSTANCE = ca.gc.space.mrt.sensors.gps.sim.impl.SimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simulated Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulated Connection</em>'.
	 * @generated
	 */
	SimulatedConnection createSimulatedConnection();

	/**
	 * Returns a new object of class '<em>Simulated Data Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulated Data Interpreter</em>'.
	 * @generated
	 */
	SimulatedDataInterpreter createSimulatedDataInterpreter();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	SimFacade createSimFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimPackage getSimPackage();

} //SimFactory
