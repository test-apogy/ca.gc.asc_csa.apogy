/**
 * Canadian Space Agency 2007.
 *
 * $Id: FOVFacade.java,v 1.2.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.sensors.fov.impl.FOVFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOV Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getFOVFacade()
 * @model
 * @generated
 */
public interface FOVFacade extends EObject
{
	public static final FOVFacade INSTANCE = FOVFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DistanceRange createDistanceRange(double minimumDistance, double maximumDistance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DistanceRange createDistanceRange(DistanceRange distanceRange);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AngularSpan createAngularSpan(double minimumAngle, double maximumAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AngularSpan createAngularSpan(AngularSpan angularSpan);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView(double minimumDistance, double maximumDistance, double horizontalFieldOfViewAngle, double verticalFieldOfViewAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ConicalFieldOfView createConicalFieldOfView(double minimumDistance, double maximumDistance, double fieldOfViewAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ConicalFieldOfView createConicalFieldOfView(ConicalFieldOfView conicalFieldOfView);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CircularSectorFieldOfView createCircularSectorFieldOfView(double minimumAngle, double maximumAngle, double minimumDistance, double maximumDistance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CircularSectorFieldOfView createCircularSectorFieldOfView(CircularSectorFieldOfView circularSectorFieldOfView);

} // FOVFacade
