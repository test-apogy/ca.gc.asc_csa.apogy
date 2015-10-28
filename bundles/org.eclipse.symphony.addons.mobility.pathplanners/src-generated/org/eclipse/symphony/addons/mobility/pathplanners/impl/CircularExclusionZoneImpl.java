/**
 * Canadian Space Agency 2007.
 *
 * $Id: CircularExclusionZoneImpl.java,v 1.4.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage;
import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;
import org.eclipse.symphony.common.geometry.data.SamplingShape;
import org.eclipse.symphony.common.geometry.data3d.CartesianPlane;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Geometry3DUtilities;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circular Exclusion Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.impl.CircularExclusionZoneImpl#isInvertSamplingShape <em>Invert Sampling Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircularExclusionZoneImpl extends ExclusionZoneImpl implements CircularExclusionZone {

	private static CartesianPositionCoordinates center = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates();
	
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isInvertSamplingShape() <em>Invert Sampling Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertSamplingShape()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERT_SAMPLING_SHAPE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInvertSamplingShape() <em>Invert Sampling Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvertSamplingShape()
	 * @generated
	 * @ordered
	 */
	protected boolean invertSamplingShape = INVERT_SAMPLING_SHAPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircularExclusionZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsMobilityPathplannersPackage.Literals.CIRCULAR_EXCLUSION_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvertSamplingShape() {
		return invertSamplingShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvertSamplingShape(boolean newInvertSamplingShape) {
		boolean oldInvertSamplingShape = invertSamplingShape;
		invertSamplingShape = newInvertSamplingShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE, oldInvertSamplingShape, invertSamplingShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isPolygonInside(CartesianTriangle polygon) 
	{
		return isPolygonInside((CartesianPolygon) polygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isPolygonInside(CartesianPolygon polygon) 
	{
		boolean inside = false;		
		
		// First checks if the center of the exclusion zones falls onto the polygon.
		Matrix4d centerTransform = Symphony__CommonTopologyFacade.INSTANCE.expressNodeInRootFrame(this);
		Vector3d centerPosition = new Vector3d();
		centerTransform.get(centerPosition);						
		
		CartesianPositionCoordinates point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(centerPosition.x, centerPosition.y, centerPosition.z);		
		inside = Geometry3DUtilities.isInsidePolygon(point, polygon);

		if(!inside)
		{
			// Check each of the edge to see if it falls within the cylinder.
			int index = 0;
			CartesianPositionCoordinates from = null;
			CartesianPositionCoordinates to = null;
			while(index < polygon.getVertices().size() && !inside)
			{
				from = polygon.getVertices().get(index);
				
				if((index + 1) >= polygon.getVertices().size())
				{
					to =  polygon.getVertices().get(0);
				}
				else
				{
					to =  polygon.getVertices().get(index + 1);
				}
				
				inside = intersects(from, to);
				index++;
			}
		}
		
		if(isInvertSamplingShape())
		{
			return !inside;
		}
		else
		{
			return inside;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__RADIUS:
				return getRadius();
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE:
				return isInvertSamplingShape();
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
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__RADIUS:
				setRadius((Double)newValue);
				return;
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE:
				setInvertSamplingShape((Boolean)newValue);
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
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE:
				setInvertSamplingShape(INVERT_SAMPLING_SHAPE_EDEFAULT);
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
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__INVERT_SAMPLING_SHAPE:
				return invertSamplingShape != INVERT_SAMPLING_SHAPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SamplingShape.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == CoordinatesSamplingShape.class) {
			switch (baseOperationID) {
				case Symphony__CommonGeometryDataPackage.COORDINATES_SAMPLING_SHAPE___IS_INSIDE__COORDINATES: return Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE___IS_INSIDE__COORDINATES;
				default: return -1;
			}
		}
		if (baseClass == PolygonSamplingShape.class) {
			switch (baseOperationID) {
				case Symphony__CommonGeometryDataPackage.POLYGON_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON: return Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE___IS_POLYGON_INSIDE__POLYGON;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE___IS_POLYGON_INSIDE__POLYGON:
				return isPolygonInside((CartesianTriangle)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(", invertSamplingShape: ");
		result.append(invertSamplingShape);
		result.append(')');
		return result.toString();
	}

	/**
	 * Returns the centre of the circular exclusion zone relative to the tolopology root node.
	 * @return The centre of the exclusion zone.
	 */
	private CartesianPositionCoordinates projectOntoExclusionZone(CartesianPositionCoordinates point)
	{				
		Matrix4d matrix = Symphony__CommonTopologyFacade.INSTANCE.expressRootInNodeFrame(this);							
		Point3d projected = new Point3d();
		matrix.transform(point.asPoint3d(), projected);		
		CartesianPositionCoordinates projectedPoint = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(projected.x, projected.y, projected.z);
		
		return Geometry3DUtilities.getFlattenCoordinate(CartesianPlane.XY, projectedPoint);		
	}
	
	@Override
	public boolean isInside(CartesianPositionCoordinates point) {
									
		// Gets the point's flattened coordinates.
		CartesianPositionCoordinates projectedPoint = projectOntoExclusionZone(point);
		
		boolean inside = (Geometry3DUtilities.getDistance(projectedPoint, center) < getRadius());
		
		if(isInvertSamplingShape())
		{
			return !inside;
		}
		else
		{
			return inside;
		}
	}
	
	@Override
	public boolean intersects(CartesianPositionCoordinates from, CartesianPositionCoordinates to) {
		
		// Check if from or to is inside the zone.
		if(isInside(from) || isInside(to))
		{			
			return true;
		}
		else
		{
			// Gets the centre's flattened coordinates.
			CartesianPositionCoordinates flattenedCenter = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates();
			
			// Gets the point's flattened coordinates of the line.
			CartesianPositionCoordinates flattenedFrom = projectOntoExclusionZone(from);
			CartesianPositionCoordinates flattenedTo = projectOntoExclusionZone(to);
			
			// Gets the centre projection on the from->to line.
			CartesianPositionCoordinates intersect = Geometry3DUtilities.getProjection(flattenedCenter, flattenedFrom, flattenedTo);
						
			// Check if the distance between the projection and the centre is less than the radius
			if(Geometry3DUtilities.getDistance(flattenedCenter, intersect) < getRadius())
			{				
				double u1u2Distance = Geometry3DUtilities.getDistance(flattenedFrom, flattenedTo);
				
				// Check if the projection falls between u1 and u2. This is to account for the case
				// where the projection of the line passes through the circle.
				if( (Geometry3DUtilities.getDistance(intersect,flattenedFrom) < u1u2Distance) && 
						(Geometry3DUtilities.getDistance(intersect,flattenedTo) < u1u2Distance))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
	}
} //CircularExclusionZoneImpl