/**
 * Canadian Space Agency 2007.
 *
 * $Id: MinimumDistanceFilterImpl.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.space.mrt.geometry.paths.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.space.mrt.common.processors.impl.ProcessorImpl;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Geometry3dUtilities;
import ca.gc.space.mrt.geometry.paths.MinimumDistanceFilter;
import ca.gc.space.mrt.geometry.paths.PathsFactory;
import ca.gc.space.mrt.geometry.paths.PathsPackage;
import ca.gc.space.mrt.geometry.paths.WayPointPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minimum Distance Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.paths.impl.MinimumDistanceFilterImpl#getMinimumDistance <em>Minimum Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MinimumDistanceFilterImpl extends ProcessorImpl<WayPointPath, WayPointPath> implements MinimumDistanceFilter {

	protected static Data3dFacade data3dFacade = Data3dFactory.eINSTANCE.createData3dFacade();
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The default value of the '{@link #getMinimumDistance() <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_DISTANCE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getMinimumDistance() <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistance()
	 * @generated
	 * @ordered
	 */
	protected double minimumDistance = MINIMUM_DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinimumDistanceFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathsPackage.Literals.MINIMUM_DISTANCE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(WayPointPath newInput) {
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
	public double getMinimumDistance() {
		return minimumDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumDistance(double newMinimumDistance) {
		double oldMinimumDistance = minimumDistance;
		minimumDistance = newMinimumDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE, oldMinimumDistance, minimumDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				return getMinimumDistance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				setMinimumDistance((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				setMinimumDistance(MINIMUM_DISTANCE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PathsPackage.MINIMUM_DISTANCE_FILTER__MINIMUM_DISTANCE:
				return minimumDistance != MINIMUM_DISTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minimumDistance: ");
		result.append(minimumDistance);
		result.append(')');
		return result.toString();
	}

	@Override
	public WayPointPath process(WayPointPath input) throws Exception {

		if(input == null)
		{
			throw(new IllegalArgumentException("Cannot pass null WayPointPath as input."));
		}
		
		// If there are enough points to allow for filtering.
		if(input.getPoints().size() > 2)
		{
			WayPointPath filtered = PathsFactory.eINSTANCE.createWayPointPath();
			
			if(getProgressMonitor() != null) getProgressMonitor().beginTask("Filtering WayPointPath.", input.getPoints().size());
			
			// The first way point is always kept.
			filtered.getPoints().add(data3dFacade.createCartesianPositionCoordinates(input.getPoints().get(0)));
			if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			
			// Goes through the list of points and adds to the filtered list only those that are further apart then the specified minimum distance.
			CartesianPositionCoordinates previousPoint = input.getPoints().get(0);
			for(int i = 1; i < input.getPoints().size(); i++)
			{
				CartesianPositionCoordinates nextPoint = input.getPoints().get(i);
				double distance = Geometry3dUtilities.getDistance(previousPoint, nextPoint);								
				
				if(distance > getMinimumDistance())
				{
					filtered.getPoints().add(data3dFacade.createCartesianPositionCoordinates(nextPoint));
					previousPoint = nextPoint;
				}
				
				if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			}
						
			// Adds the last point from the original list if required.
			if(!input.getEndPoint().equals(filtered.getEndPoint()))
			{				
				filtered.getPoints().add(input.getEndPoint());			
			}			
			if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			
			// Done.
			if(getProgressMonitor() != null) getProgressMonitor().done();
			return filtered;
		}
		else
		{
			if(getProgressMonitor() != null) getProgressMonitor().done();
			return input;
		}
	}
} //MinimumDistanceFilterImpl
