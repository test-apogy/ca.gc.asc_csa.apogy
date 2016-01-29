/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov;

import org.eclipse.emf.ecore.EFactory;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage
 * @generated
 */
public interface ApogyAddonsSensorsFOVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsSensorsFOVFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.fov.impl.ApogyAddonsSensorsFOVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Of View</em>'.
	 * @generated
	 */
	FieldOfView createFieldOfView();

	/**
	 * Returns a new object of class '<em>Distance Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Range</em>'.
	 * @generated
	 */
	DistanceRange createDistanceRange();

	/**
	 * Returns a new object of class '<em>Angular Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angular Span</em>'.
	 * @generated
	 */
	AngularSpan createAngularSpan();

	/**
	 * Returns a new object of class '<em>Rectangular Frustrum Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Frustrum Field Of View</em>'.
	 * @generated
	 */
	RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView();

	/**
	 * Returns a new object of class '<em>Conical Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conical Field Of View</em>'.
	 * @generated
	 */
	ConicalFieldOfView createConicalFieldOfView();

	/**
	 * Returns a new object of class '<em>Circular Sector Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular Sector Field Of View</em>'.
	 * @generated
	 */
	CircularSectorFieldOfView createCircularSectorFieldOfView();

	/**
	 * Returns a new object of class '<em>Rectangular Frustrum Field Of View Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Frustrum Field Of View Sampling Shape</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> RectangularFrustrumFieldOfViewSamplingShape<PolygonType> createRectangularFrustrumFieldOfViewSamplingShape();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyAddonsSensorsFOVFacade createApogyAddonsSensorsFOVFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsSensorsFOVPackage getApogyAddonsSensorsFOVPackage();

} //ApogyAddonsSensorsFOVFactory