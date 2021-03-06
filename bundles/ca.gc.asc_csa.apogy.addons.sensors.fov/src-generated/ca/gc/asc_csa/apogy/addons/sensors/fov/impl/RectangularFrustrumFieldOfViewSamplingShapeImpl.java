package ca.gc.asc_csa.apogy.addons.sensors.fov.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangular Frustrum Field Of View Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewSamplingShapeImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewSamplingShapeImpl#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangularFrustrumFieldOfViewSamplingShapeImpl<PolygonType extends CartesianPolygon> extends MinimalEObjectImpl.Container implements RectangularFrustrumFieldOfViewSamplingShape<PolygonType> {

	private static Point3d origin = new Point3d();
	
	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 transform;

	/**
	 * The cached value of the '{@link #getRectangularFrustrumFieldOfView() <em>Rectangular Frustrum Field Of View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 * @ordered
	 */
	protected RectangularFrustrumFieldOfView rectangularFrustrumFieldOfView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangularFrustrumFieldOfViewSamplingShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsFOVPackage.Literals.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getTransform() {
		if (transform != null && transform.eIsProxy()) {
			InternalEObject oldTransform = (InternalEObject)transform;
			transform = (Matrix4x4)eResolveProxy(oldTransform);
			if (transform != oldTransform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM, oldTransform, transform));
			}
		}
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 basicGetTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Matrix4x4 newTransform) {
		Matrix4x4 oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView getRectangularFrustrumFieldOfView() {
		if (rectangularFrustrumFieldOfView != null && rectangularFrustrumFieldOfView.eIsProxy()) {
			InternalEObject oldRectangularFrustrumFieldOfView = (InternalEObject)rectangularFrustrumFieldOfView;
			rectangularFrustrumFieldOfView = (RectangularFrustrumFieldOfView)eResolveProxy(oldRectangularFrustrumFieldOfView);
			if (rectangularFrustrumFieldOfView != oldRectangularFrustrumFieldOfView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW, oldRectangularFrustrumFieldOfView, rectangularFrustrumFieldOfView));
			}
		}
		return rectangularFrustrumFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView basicGetRectangularFrustrumFieldOfView() {
		return rectangularFrustrumFieldOfView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView newRectangularFrustrumFieldOfView) {
		RectangularFrustrumFieldOfView oldRectangularFrustrumFieldOfView = rectangularFrustrumFieldOfView;
		rectangularFrustrumFieldOfView = newRectangularFrustrumFieldOfView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW, oldRectangularFrustrumFieldOfView, rectangularFrustrumFieldOfView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isPolygonInside(PolygonType polygon) 
	{
		// Checks if the centroide of the polygon falls within the FOV.
		if(isInside(polygon.getCentroid())) return true;
				
		// Checks that at least one vertex of the polygon falls inside.
		for(CartesianPositionCoordinates point : polygon.getVertices())
		{
			if(isInside(point))
			{
				return true;
			}
		}
		
		// Checks whether any of the FOV edges intersects with the polygon.
		Matrix4d matrix = new Matrix4d(getTransform().asMatrix4d());
		matrix.invert();
		
		// Creates a version of the polygon that is expressed in the FOV frame.
		PolygonType transformedPolygon = createPolygonInFOVFrame(polygon);
		
		Vector3d[][] edges = getFOVEdges();
		for(int i = 0; i <  edges.length; i++)
		{
			Vector3d u = edges[i][0];
			Vector3d v = edges[i][1];									
			
			if(Geometry3DUtilities.getLineAndPolygonIntersectionPoint(u, v, (CartesianPolygon) transformedPolygon) != null)
			{
				return true;
			}
		}
				
		return false;
	}
	
	private PolygonType createPolygonInFOVFrame(PolygonType polygon)
	{
		PolygonType newPolygon = EcoreUtil.copy(polygon);
		newPolygon.getVertices().clear();
		
		Matrix4d matrix = new Matrix4d(getTransform().asMatrix4d());
		matrix.invert();
		
		for(CartesianPositionCoordinates p : polygon.getVertices())
		{
			Point3d point3d = new Point3d();
			matrix.transform(p.asPoint3d(), point3d);
			CartesianPositionCoordinates transformedP = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point3d.x, point3d.y, point3d.z);
			newPolygon.getVertices().add(transformedP);
		}
				
		return newPolygon;		
	}
	
	private Vector3d[][] getFOVEdges()
	{
		Vector3d[][] edges = new Vector3d[4][2];
			
		double azimuth = getRectangularFrustrumFieldOfView().getHorizontalFieldOfViewAngle() / 2.0;
		double elevation = getRectangularFrustrumFieldOfView().getVerticalFieldOfViewAngle() / 2.0;
		
		double x = Math.sin(elevation);
		double y = Math.cos(elevation) * Math.sin(azimuth);
		double z = Math.cos(elevation) * Math.cos(azimuth);
		
		double xShort = x * getRectangularFrustrumFieldOfView().getRange().getMinimumDistance();
		double yShort = y * getRectangularFrustrumFieldOfView().getRange().getMinimumDistance();
		double zShort = z * getRectangularFrustrumFieldOfView().getRange().getMinimumDistance();

		double xLong = x * getRectangularFrustrumFieldOfView().getRange().getMaximumDistance();
		double yLong = y * getRectangularFrustrumFieldOfView().getRange().getMaximumDistance();
		double zLong = z * getRectangularFrustrumFieldOfView().getRange().getMaximumDistance();

		
		edges[0][0] = new Vector3d(xShort, yShort, zShort);
		edges[0][1] = new Vector3d(xLong, yLong, zLong);

		edges[1][0] = new Vector3d(-xShort, yShort, zShort);
		edges[1][1] = new Vector3d(-xLong, yLong, zLong);

		edges[2][0] = new Vector3d(-xShort, -yShort, zShort);
		edges[2][1] = new Vector3d(-xLong, -yLong, zLong);

		edges[3][0] = new Vector3d(xShort, -yShort, zShort);
		edges[3][1] = new Vector3d(xLong, -yLong, zLong);
				
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isInside(CartesianPositionCoordinates point) 
	{
		boolean isInside = false;
		
		// Transform the point into the FOV coordinates system.
		Matrix4d matrix = new Matrix4d(getTransform().asMatrix4d());
		matrix.invert();
		
		
		Point3d p = new Point3d();
		matrix.transform(point.asPoint3d(), p);
				
		double distance = p.distance(origin);
		if(getRectangularFrustrumFieldOfView().getRange().isWithinRange(distance))
		{
			// Point is within range, check whether it is within the horizontal field of view.
			double azimuth = Math.abs(Math.atan2(p.y, p.z));
			if(azimuth <= (getRectangularFrustrumFieldOfView().getHorizontalFieldOfViewAngle()/ 2.0))
			{
				// Checks whether is is with the vertical field of view.
				double elevation = Math.abs(Math.atan2(p.x, p.z));
				if(elevation <= (getRectangularFrustrumFieldOfView().getVerticalFieldOfViewAngle() / 2.0))
				{
					isInside = true;
				}
			}			
		}
		return isInside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM:
				if (resolve) return getTransform();
				return basicGetTransform();
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW:
				if (resolve) return getRectangularFrustrumFieldOfView();
				return basicGetRectangularFrustrumFieldOfView();
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM:
				setTransform((Matrix4x4)newValue);
				return;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW:
				setRectangularFrustrumFieldOfView((RectangularFrustrumFieldOfView)newValue);
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM:
				setTransform((Matrix4x4)null);
				return;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW:
				setRectangularFrustrumFieldOfView((RectangularFrustrumFieldOfView)null);
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__TRANSFORM:
				return transform != null;
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE__RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW:
				return rectangularFrustrumFieldOfView != null;
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
		if (baseClass == PolygonSamplingShape.class) {
			switch (baseOperationID) {
				case ApogyCommonGeometryDataPackage.POLYGON_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON: return ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON;
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
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON:
				return isPolygonInside((PolygonType)arguments.get(0));
			case ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_SAMPLING_SHAPE___IS_INSIDE__COORDINATES:
				return isInside((CartesianPositionCoordinates)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RectangularFrustrumFieldOfViewSamplingShapeImpl
