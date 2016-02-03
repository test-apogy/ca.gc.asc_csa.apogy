package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
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
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CubeSamplingShapeImpl#getCorner1 <em>Corner1</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CubeSamplingShapeImpl#getCorner2 <em>Corner2</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CubeSamplingShapeImpl#isIncludeJustTouching <em>Include Just Touching</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeSamplingShapeImpl<PolygonType extends CartesianPolygon> extends MinimalEObjectImpl.Container implements CubeSamplingShape<PolygonType> 
{
	private double minX = Double.NaN;
	private double minY = Double.NaN;
	private double minZ = Double.NaN;
	
	private double maxX = Double.NaN;
	private double maxY = Double.NaN;
	private double maxZ = Double.NaN;
	
	/**
	 * The cached value of the '{@link #getCorner1() <em>Corner1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner1()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates corner1;

	/**
	 * The cached value of the '{@link #getCorner2() <em>Corner2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner2()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates corner2;
	/**
	 * The default value of the '{@link #isIncludeJustTouching() <em>Include Just Touching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeJustTouching()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_JUST_TOUCHING_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isIncludeJustTouching() <em>Include Just Touching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeJustTouching()
	 * @generated
	 * @ordered
	 */
	protected boolean includeJustTouching = INCLUDE_JUST_TOUCHING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeSamplingShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CUBE_SAMPLING_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeJustTouching() {
		return includeJustTouching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeJustTouching(boolean newIncludeJustTouching) {
		boolean oldIncludeJustTouching = includeJustTouching;
		includeJustTouching = newIncludeJustTouching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING, oldIncludeJustTouching, includeJustTouching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCorner1() {
		if (corner1 != null && corner1.eIsProxy()) {
			InternalEObject oldCorner1 = (InternalEObject)corner1;
			corner1 = (CartesianPositionCoordinates)eResolveProxy(oldCorner1);
			if (corner1 != oldCorner1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER1, oldCorner1, corner1));
			}
		}
		return corner1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCorner1() {
		return corner1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setCorner1(CartesianPositionCoordinates newCorner1) 
	{
		// Set all limits to dirty.
		minX = Double.NaN;
		minY = Double.NaN;
		minZ = Double.NaN;
		
		maxX = Double.NaN;
		maxY = Double.NaN;
		maxZ = Double.NaN;
		
		setCorner1Gen(newCorner1);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorner1Gen(CartesianPositionCoordinates newCorner1) {
		CartesianPositionCoordinates oldCorner1 = corner1;
		corner1 = newCorner1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER1, oldCorner1, corner1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCorner2() {
		if (corner2 != null && corner2.eIsProxy()) {
			InternalEObject oldCorner2 = (InternalEObject)corner2;
			corner2 = (CartesianPositionCoordinates)eResolveProxy(oldCorner2);
			if (corner2 != oldCorner2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER2, oldCorner2, corner2));
			}
		}
		return corner2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCorner2() {
		return corner2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setCorner2(CartesianPositionCoordinates newCorner2)
	{
		// Set all limits to dirty.
		minX = Double.NaN;
		minY = Double.NaN;
		minZ = Double.NaN;
		
		maxX = Double.NaN;
		maxY = Double.NaN;
		maxZ = Double.NaN;
		
		setCorner2Gen(newCorner2);		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorner2Gen(CartesianPositionCoordinates newCorner2) {
		CartesianPositionCoordinates oldCorner2 = corner2;
		corner2 = newCorner2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER2, oldCorner2, corner2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isPolygonInside(PolygonType polygon) 
	{				
		if(isIncludeJustTouching())
		{
			// Checks to see if the polygon centroid is inside the cube.
			CartesianPositionCoordinates center = polygon.getCentroid();
			
			if(isInside(center))
			{
				return true;
			}
			else
			{
				boolean inside = false;
				
				Iterator<CartesianPositionCoordinates> it = polygon.getVertices().iterator();
				while(it.hasNext() && !inside)
				{					
					inside = isInside(it.next());
				}
				
				return inside;
			}
		}
		else
		{
			// Check to see that ALL vertices are inside.
			boolean inside = true;
			
			Iterator<CartesianPositionCoordinates> it = polygon.getVertices().iterator();
			while(it.hasNext() && inside)
			{					
				inside = isInside(it.next());
			}
			
			return inside;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean isInside(CartesianPositionCoordinates point) 
	{		
		if(isIncludeJustTouching())
		{										
			return (getMinX() <= point.getX() && point.getX() <= getMaxX()) &&
				   (getMinY() <= point.getY() && point.getY() <= getMaxY()) &&
				   (getMinZ() <= point.getZ() && point.getZ() <= getMaxZ());
		}
		else
		{
			return (getMinX() < point.getX() && point.getX() < getMaxX()) &&
				   (getMinY() < point.getY() && point.getY() < getMaxY()) &&
				   (getMinZ() < point.getZ() && point.getZ() < getMaxZ());
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
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER1:
				if (resolve) return getCorner1();
				return basicGetCorner1();
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER2:
				if (resolve) return getCorner2();
				return basicGetCorner2();
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				return isIncludeJustTouching();
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
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER1:
				setCorner1((CartesianPositionCoordinates)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER2:
				setCorner2((CartesianPositionCoordinates)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				setIncludeJustTouching((Boolean)newValue);
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
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER1:
				setCorner1((CartesianPositionCoordinates)null);
				return;
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER2:
				setCorner2((CartesianPositionCoordinates)null);
				return;
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				setIncludeJustTouching(INCLUDE_JUST_TOUCHING_EDEFAULT);
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
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER1:
				return corner1 != null;
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__CORNER2:
				return corner2 != null;
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING:
				return includeJustTouching != INCLUDE_JUST_TOUCHING_EDEFAULT;
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
				case ApogyCommonGeometryDataPackage.POLYGON_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON: return ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON;
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
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE___IS_POLYGON_INSIDE__POLYGON:
				return isPolygonInside((PolygonType)arguments.get(0));
			case ApogyCommonGeometryData3DPackage.CUBE_SAMPLING_SHAPE___IS_INSIDE__COORDINATES:
				return isInside((CartesianPositionCoordinates)arguments.get(0));
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
		result.append(" (includeJustTouching: ");
		result.append(includeJustTouching);
		result.append(')');
		return result.toString();
	}

	private double getMinX()
	{
		if(Double.isNaN(minX))
		{
			if(getCorner1() != null && getCorner2() != null)
			{
				if(getCorner1().getX() < getCorner2().getX())
				{
					minX = getCorner1().getX();
				}
				else
				{
					minX = getCorner2().getX();
				}
			}
		}
		
		return minX;
	}
	
	private double getMinY()
	{
		if(Double.isNaN(minY))
		{
			if(getCorner1() != null && getCorner2() != null)
			{
				if(getCorner1().getY() < getCorner2().getY())
				{
					minY = getCorner1().getY();
				}
				else
				{
					minY = getCorner2().getY();
				}
			}
		}
		
		return minY;
	}
	
	private double getMinZ()
	{
		if(Double.isNaN(minZ))
		{
			if(getCorner1() != null && getCorner2() != null)
			{
				if(getCorner1().getZ() < getCorner2().getZ())
				{
					minZ = getCorner1().getZ();
				}
				else
				{
					minZ = getCorner2().getZ();
				}
			}
		}
		
		return minZ;
	}
	
	private double getMaxX()
	{
		if(Double.isNaN(maxX))
		{
			if(getCorner1() != null && getCorner2() != null)
			{
				if(getCorner1().getX() > getCorner2().getX())
				{
					maxX = getCorner1().getX();
				}
				else
				{
					maxX = getCorner2().getX();
				}
			}
		}
		
		return maxX;
	}
	
	private double getMaxY()
	{
		if(Double.isNaN(maxY))
		{
			if(getCorner1() != null && getCorner2() != null)
			{
				if(getCorner1().getY() > getCorner2().getY())
				{
					maxY = getCorner1().getY();
				}
				else
				{
					maxY = getCorner2().getY();
				}
			}
		}
		
		return maxY;
	}
	
	private double getMaxZ()
	{
		if(Double.isNaN(maxZ))
		{
			if(getCorner1() != null && getCorner2() != null)
			{
				if(getCorner1().getZ() > getCorner2().getZ())
				{
					maxZ = getCorner1().getZ();
				}
				else
				{
					maxZ = getCorner2().getZ();
				}
			}
		}
		
		return maxZ;
	}
} //CubeSamplingShapeImpl
