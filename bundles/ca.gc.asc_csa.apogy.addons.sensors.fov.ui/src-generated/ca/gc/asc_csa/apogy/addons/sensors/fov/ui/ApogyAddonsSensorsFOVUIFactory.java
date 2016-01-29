/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage
 * @generated
 */
public interface ApogyAddonsSensorsFOVUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsSensorsFOVUIFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Of View Presentation</em>'.
	 * @generated
	 */
	FieldOfViewPresentation createFieldOfViewPresentation();

	/**
	 * Returns a new object of class '<em>Circular Sector Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular Sector Field Of View Presentation</em>'.
	 * @generated
	 */
	CircularSectorFieldOfViewPresentation createCircularSectorFieldOfViewPresentation();

	/**
	 * Returns a new object of class '<em>Conical Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conical Field Of View Presentation</em>'.
	 * @generated
	 */
	ConicalFieldOfViewPresentation createConicalFieldOfViewPresentation();

	/**
	 * Returns a new object of class '<em>Rectangular Frustrum Field Of View Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Frustrum Field Of View Presentation</em>'.
	 * @generated
	 */
	RectangularFrustrumFieldOfViewPresentation createRectangularFrustrumFieldOfViewPresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsSensorsFOVUIPackage getApogyAddonsSensorsFOVUIPackage();

} //ApogyAddonsSensorsFOVUIFactory