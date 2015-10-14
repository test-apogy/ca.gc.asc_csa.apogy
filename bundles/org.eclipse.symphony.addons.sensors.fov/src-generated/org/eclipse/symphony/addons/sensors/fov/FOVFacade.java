/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.fov.impl.FOVFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOV Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getFOVFacade()
 * @model
 * @generated
 */
public interface FOVFacade extends EObject {
	
	public static final FOVFacade INSTANCE = FOVFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" minimumDistanceUnique="false" maximumDistanceUnique="false"
	 * @generated
	 */
	DistanceRange createDistanceRange(double minimumDistance, double maximumDistance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" distanceRangeUnique="false"
	 * @generated
	 */
	DistanceRange createDistanceRange(DistanceRange distanceRange);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" minimumAngleUnique="false" maximumAngleUnique="false"
	 * @generated
	 */
	AngularSpan createAngularSpan(double minimumAngle, double maximumAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" angularSpanUnique="false"
	 * @generated
	 */
	AngularSpan createAngularSpan(AngularSpan angularSpan);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" minimumDistanceUnique="false" maximumDistanceUnique="false" horizontalFieldOfViewAngleUnique="false" verticalFieldOfViewAngleUnique="false"
	 * @generated
	 */
	RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView(double minimumDistance, double maximumDistance, double horizontalFieldOfViewAngle, double verticalFieldOfViewAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rectangularFrustrumFieldOfViewUnique="false"
	 * @generated
	 */
	RectangularFrustrumFieldOfView createRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" minimumDistanceUnique="false" maximumDistanceUnique="false" fieldOfViewAngleUnique="false"
	 * @generated
	 */
	ConicalFieldOfView createConicalFieldOfView(double minimumDistance, double maximumDistance, double fieldOfViewAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" conicalFieldOfViewUnique="false"
	 * @generated
	 */
	ConicalFieldOfView createConicalFieldOfView(ConicalFieldOfView conicalFieldOfView);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" minimumAngleUnique="false" maximumAngleUnique="false" minimumDistanceUnique="false" maximumDistanceUnique="false"
	 * @generated
	 */
	CircularSectorFieldOfView createCircularSectorFieldOfView(double minimumAngle, double maximumAngle, double minimumDistance, double maximumDistance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" circularSectorFieldOfViewUnique="false"
	 * @generated
	 */
	CircularSectorFieldOfView createCircularSectorFieldOfView(CircularSectorFieldOfView circularSectorFieldOfView);

} // FOVFacade
