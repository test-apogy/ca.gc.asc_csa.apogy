/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.pose.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIPackage
 * @generated
 */
public interface SensorsPoseUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SensorsPoseUIFactory eINSTANCE = ca.gc.space.mrt.sensors.pose.ui.impl.SensorsPoseUIFactoryImpl.init();

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
	SensorsPoseUIPackage getSensorsPoseUIPackage();

} //SensorsPoseUIFactory
