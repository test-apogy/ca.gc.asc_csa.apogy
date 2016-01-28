/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.pose.ui.Symphony__AddonsSensorsPoseUIPackage
 * @generated
 */
public interface Symphony__AddonsSensorsPoseUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsPoseUIFactory eINSTANCE = org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Position Sensor Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Sensor Presentation</em>'.
	 * @generated
	 */
	PositionSensorPresentation createPositionSensorPresentation();

	/**
	 * Returns a new object of class '<em>Orientation Sensor Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orientation Sensor Presentation</em>'.
	 * @generated
	 */
	OrientationSensorPresentation createOrientationSensorPresentation();

	/**
	 * Returns a new object of class '<em>Pose Sensor Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pose Sensor Presentation</em>'.
	 * @generated
	 */
	PoseSensorPresentation createPoseSensorPresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsSensorsPoseUIPackage getSymphony__AddonsSensorsPoseUIPackage();

} //Symphony__AddonsSensorsPoseUIFactory
