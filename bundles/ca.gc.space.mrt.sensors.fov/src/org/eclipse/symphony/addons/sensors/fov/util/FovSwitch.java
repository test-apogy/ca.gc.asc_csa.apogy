/**
 * Canadian Space Agency 2007.
 *
 * $Id: FovSwitch.java,v 1.7.4.3 2015/09/22 19:39:40 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.sensors.fov.util;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.addons.sensors.fov.AngularSpan;
import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.FOVFacade;
import org.eclipse.symphony.addons.sensors.fov.FieldOfView;
import org.eclipse.symphony.addons.sensors.fov.FovPackage;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape;
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.Polygon;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;
import org.eclipse.symphony.common.geometry.data.SamplingShape;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage
 * @generated
 */
public class FovSwitch<T1> extends Switch<T1> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FovPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FovSwitch() {
		if (modelPackage == null) {
			modelPackage = FovPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FovPackage.FIELD_OF_VIEW: {
				FieldOfView fieldOfView = (FieldOfView)theEObject;
				T1 result = caseFieldOfView(fieldOfView);
				if (result == null) result = caseNode(fieldOfView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FovPackage.DISTANCE_RANGE: {
				DistanceRange distanceRange = (DistanceRange)theEObject;
				T1 result = caseDistanceRange(distanceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FovPackage.ANGULAR_SPAN: {
				AngularSpan angularSpan = (AngularSpan)theEObject;
				T1 result = caseAngularSpan(angularSpan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW: {
				RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView = (RectangularFrustrumFieldOfView)theEObject;
				T1 result = caseRectangularFrustrumFieldOfView(rectangularFrustrumFieldOfView);
				if (result == null) result = caseFieldOfView(rectangularFrustrumFieldOfView);
				if (result == null) result = caseNode(rectangularFrustrumFieldOfView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FovPackage.CONICAL_FIELD_OF_VIEW: {
				ConicalFieldOfView conicalFieldOfView = (ConicalFieldOfView)theEObject;
				T1 result = caseConicalFieldOfView(conicalFieldOfView);
				if (result == null) result = caseFieldOfView(conicalFieldOfView);
				if (result == null) result = caseNode(conicalFieldOfView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FovPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW: {
				CircularSectorFieldOfView circularSectorFieldOfView = (CircularSectorFieldOfView)theEObject;
				T1 result = caseCircularSectorFieldOfView(circularSectorFieldOfView);
				if (result == null) result = caseFieldOfView(circularSectorFieldOfView);
				if (result == null) result = caseNode(circularSectorFieldOfView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FovPackage.FOV_FACADE: {
				FOVFacade fovFacade = (FOVFacade)theEObject;
				T1 result = caseFOVFacade(fovFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE: {
				RectangularFrustrumFieldOfViewSamplingShape<?> rectangularFrustrumFieldOfViewSamplingShape = (RectangularFrustrumFieldOfViewSamplingShape<?>)theEObject;
				T1 result = caseRectangularFrustrumFieldOfViewSamplingShape(rectangularFrustrumFieldOfViewSamplingShape);
				if (result == null) result = caseCoordinatesSamplingShape(rectangularFrustrumFieldOfViewSamplingShape);
				if (result == null) result = casePolygonSamplingShape(rectangularFrustrumFieldOfViewSamplingShape);
				if (result == null) result = caseSamplingShape(rectangularFrustrumFieldOfViewSamplingShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Of View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFieldOfView(FieldOfView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDistanceRange(DistanceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angular Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angular Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAngularSpan(AngularSpan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conical Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conical Field Of View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConicalFieldOfView(ConicalFieldOfView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circular Sector Field Of View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circular Sector Field Of View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCircularSectorFieldOfView(CircularSectorFieldOfView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FOV Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FOV Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFOVFacade(FOVFacade object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PolygonType extends CartesianPolygon> T1 caseRectangularFrustrumFieldOfViewSamplingShape(RectangularFrustrumFieldOfViewSamplingShape<PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNode(Node object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSamplingShape(SamplingShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSamplingShape(CoordinatesSamplingShape<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 casePolygonSamplingShape(PolygonSamplingShape<CoordinatesType, PolygonType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //FovSwitch
