/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage
 * @generated
 */
public interface Symphony__CoreEnvironmentOrbitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CoreEnvironmentOrbitFactory eINSTANCE = org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PVA Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PVA Coordinates</em>'.
	 * @generated
	 */
	PVACoordinates createPVACoordinates();

	/**
	 * Returns a new object of class '<em>Timed Stamped PVA Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Stamped PVA Coordinates</em>'.
	 * @generated
	 */
	TimedStampedPVACoordinates createTimedStampedPVACoordinates();

	/**
	 * Returns a new object of class '<em>Angular Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angular Coordinates</em>'.
	 * @generated
	 */
	AngularCoordinates createAngularCoordinates();

	/**
	 * Returns a new object of class '<em>Timed Stamped Angular Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Stamped Angular Coordinates</em>'.
	 * @generated
	 */
	TimedStampedAngularCoordinates createTimedStampedAngularCoordinates();

	/**
	 * Returns a new object of class '<em>Spacecraft Attitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Attitude</em>'.
	 * @generated
	 */
	SpacecraftAttitude createSpacecraftAttitude();

	/**
	 * Returns a new object of class '<em>Spacecraft State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft State</em>'.
	 * @generated
	 */
	SpacecraftState createSpacecraftState();

	/**
	 * Returns a new object of class '<em>Orbit Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbit Model</em>'.
	 * @generated
	 */
	OrbitModel createOrbitModel();

	/**
	 * Returns a new object of class '<em>Orbit Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbit Facade</em>'.
	 * @generated
	 */
	OrbitFacade createOrbitFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CoreEnvironmentOrbitPackage getSymphony__CoreEnvironmentOrbitPackage();

} //Symphony__CoreEnvironmentOrbitFactory
