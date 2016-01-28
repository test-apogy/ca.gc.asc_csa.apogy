/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.sensors.fov.impl.ApogyAddonsSensorsFOVFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOV Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getApogyAddonsSensorsFOVFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsSensorsFOVFacade extends EObject {
	
	public static final ApogyAddonsSensorsFOVFacade INSTANCE = ApogyAddonsSensorsFOVFacadeImpl.getInstance();
	
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

} // ApogyAddonsSensorsFOVFacade
