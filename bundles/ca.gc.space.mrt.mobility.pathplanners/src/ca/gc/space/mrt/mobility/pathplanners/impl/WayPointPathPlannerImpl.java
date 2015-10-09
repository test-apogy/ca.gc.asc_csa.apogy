/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointPathPlannerImpl.java,v 1.5.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.space.mrt.common.processors.impl.ProcessorImpl;
import ca.gc.space.mrt.geometry.paths.WayPointPath;
import ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage;
import ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point Path Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.impl.WayPointPathPlannerImpl#getCurrentDestination <em>Current Destination</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.impl.WayPointPathPlannerImpl#getCurrentPosition <em>Current Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WayPointPathPlannerImpl extends ProcessorImpl<CartesianCoordinatesSet, WayPointPath> implements WayPointPathPlanner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The cached value of the '{@link #getCurrentDestination() <em>Current Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDestination()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates currentDestination;
	/**
	 * The cached value of the '{@link #getCurrentPosition() <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPosition()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates currentPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointPathPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathplannersPackage.Literals.WAY_POINT_PATH_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianCoordinatesSet newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(WayPointPath newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCurrentDestination()
	{
		if (currentDestination != null && currentDestination.eIsProxy()) {
			InternalEObject oldCurrentDestination = (InternalEObject)currentDestination;
			currentDestination = (CartesianPositionCoordinates)eResolveProxy(oldCurrentDestination);
			if (currentDestination != oldCurrentDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION, oldCurrentDestination, currentDestination));
			}
		}
		return currentDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCurrentDestination()
	{
		return currentDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDestination(CartesianPositionCoordinates newCurrentDestination)
	{
		CartesianPositionCoordinates oldCurrentDestination = currentDestination;
		currentDestination = newCurrentDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION, oldCurrentDestination, currentDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCurrentPosition()
	{
		if (currentPosition != null && currentPosition.eIsProxy()) {
			InternalEObject oldCurrentPosition = (InternalEObject)currentPosition;
			currentPosition = (CartesianPositionCoordinates)eResolveProxy(oldCurrentPosition);
			if (currentPosition != oldCurrentPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION, oldCurrentPosition, currentPosition));
			}
		}
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCurrentPosition()
	{
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPosition(CartesianPositionCoordinates newCurrentPosition)
	{
		CartesianPositionCoordinates oldCurrentPosition = currentPosition;
		currentPosition = newCurrentPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION, oldCurrentPosition, currentPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPath plan(CartesianPositionCoordinates currentPosition, CartesianPositionCoordinates destinationPosition) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				if (resolve) return getCurrentDestination();
				return basicGetCurrentDestination();
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				if (resolve) return getCurrentPosition();
				return basicGetCurrentPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				setCurrentDestination((CartesianPositionCoordinates)newValue);
				return;
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				setCurrentPosition((CartesianPositionCoordinates)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				setCurrentDestination((CartesianPositionCoordinates)null);
				return;
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				setCurrentPosition((CartesianPositionCoordinates)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_DESTINATION:
				return currentDestination != null;
			case PathplannersPackage.WAY_POINT_PATH_PLANNER__CURRENT_POSITION:
				return currentPosition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PathplannersPackage.WAY_POINT_PATH_PLANNER___PLAN__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES:
				try {
					return plan((CartesianPositionCoordinates)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
} //WayPointPathPlannerImpl
