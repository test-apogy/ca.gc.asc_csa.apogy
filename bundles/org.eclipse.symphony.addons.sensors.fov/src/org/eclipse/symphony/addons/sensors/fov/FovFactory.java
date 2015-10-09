/**
 * Canadian Space Agency 2007.
 *
 * $Id: FovFactory.java,v 1.3.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.fov;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage
 * @generated
 */
public interface FovFactory extends EFactory {
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
	FovFactory eINSTANCE = org.eclipse.symphony.addons.sensors.fov.impl.FovFactoryImpl.init();

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
	 * Returns a new object of class '<em>FOV Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FOV Facade</em>'.
	 * @generated
	 */
	FOVFacade createFOVFacade();

	/**
	 * Returns a new object of class '<em>Rectangular Frustrum Field Of View Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Frustrum Field Of View Sampling Shape</em>'.
	 * @generated
	 */
	<PolygonType extends CartesianPolygon> RectangularFrustrumFieldOfViewSamplingShape<PolygonType> createRectangularFrustrumFieldOfViewSamplingShape();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FovPackage getFovPackage();

} //FovFactory
