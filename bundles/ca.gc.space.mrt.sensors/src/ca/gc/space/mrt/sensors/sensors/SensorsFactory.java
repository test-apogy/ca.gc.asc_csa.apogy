/**
 * Canadian Space Agency 2007.
 *
 * $Id: SensorsFactory.java,v 1.2.4.2 2015/05/21 15:49:36 pallard Exp $
 */
package ca.gc.space.mrt.sensors.sensors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.sensors.SensorsPackage
 * @generated
 */
public interface SensorsFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorsFactory eINSTANCE = ca.gc.space.mrt.sensors.sensors.impl.SensorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Referenceable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenceable</em>'.
	 * @generated
	 */
	Referenceable createReferenceable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SensorsPackage getSensorsPackage();

} //SensorsFactory
