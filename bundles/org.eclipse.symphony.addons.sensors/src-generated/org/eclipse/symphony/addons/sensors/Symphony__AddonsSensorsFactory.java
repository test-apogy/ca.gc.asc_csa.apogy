/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.Symphony__AddonsSensorsPackage
 * @generated
 */
public interface Symphony__AddonsSensorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsFactory eINSTANCE = org.eclipse.symphony.addons.sensors.impl.Symphony__AddonsSensorsFactoryImpl.init();

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
	Symphony__AddonsSensorsPackage getSymphony__AddonsSensorsPackage();

} //SensorsFactory
