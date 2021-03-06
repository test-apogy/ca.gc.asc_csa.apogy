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
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;
import ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triangle Edge Length Triangular Mesh Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl#getMinimumRange <em>Minimum Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl#getMaximumRange <em>Maximum Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.TriangleEdgeLengthTriangularMeshFilterImpl#getMaximumEdgeLength <em>Maximum Edge Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriangleEdgeLengthTriangularMeshFilterImpl extends MinimalEObjectImpl.Container implements TriangleEdgeLengthTriangularMeshFilter {
	/**
	 * The default value of the '{@link #getMinimumRange() <em>Minimum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumRange()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_RANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumRange() <em>Minimum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumRange()
	 * @generated
	 * @ordered
	 */
	protected double minimumRange = MINIMUM_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRange() <em>Maximum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRange()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_RANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumRange() <em>Maximum Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRange()
	 * @generated
	 * @ordered
	 */
	protected double maximumRange = MAXIMUM_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumEdgeLength() <em>Maximum Edge Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEdgeLength()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDGE_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumEdgeLength() <em>Maximum Edge Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEdgeLength()
	 * @generated
	 * @ordered
	 */
	protected double maximumEdgeLength = MAXIMUM_EDGE_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangleEdgeLengthTriangularMeshFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumRange() {
		return minimumRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumRange(double newMinimumRange) {
		double oldMinimumRange = minimumRange;
		minimumRange = newMinimumRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE, oldMinimumRange, minimumRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumRange() {
		return maximumRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRange(double newMaximumRange) {
		double oldMaximumRange = maximumRange;
		maximumRange = newMaximumRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE, oldMaximumRange, maximumRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumEdgeLength() {
		return maximumEdgeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumEdgeLength(double newMaximumEdgeLength) {
		double oldMaximumEdgeLength = maximumEdgeLength;
		maximumEdgeLength = newMaximumEdgeLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH, oldMaximumEdgeLength, maximumEdgeLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMesh filter(CartesianTriangularMesh input) 
	{
		Matrix4d identity = new Matrix4d();
		identity.setIdentity();
		
		// Makes a copy of the input mesh.
		CartesianTriangularMesh output = Geometry3DUtilities.createTransformedCartesianTriangularMesh(identity, input);
		
		// Go through the list of triangles.
		List<CartesianTriangle> trianglesToRemove = new ArrayList<CartesianTriangle>();
		for(CartesianTriangle triangle : output.getPolygons())
		{
			// First check if the triangle center is with the filter range.
			Point3d center = triangle.getCentroid().asPoint3d();			
			double range = Math.sqrt(center.x * center.x + center.y * center.y);				
			if(getMinimumRange() <= range && range <= getMaximumRange())
			{
				// Check each edge to see if anyone is above the edge length limit (in 2D).
				for(int i = 0; i < 2; i++)
				{
					Point3d p0 =  triangle.getVertices().get(i).asPoint3d();
					p0.z = 0;
					
					Point3d p1 =  triangle.getVertices().get(i+1).asPoint3d();	
					p1.z = 0;
					
					double edgeLength = p0.distance(p1);
					if(edgeLength > getMaximumEdgeLength())
					{
						trianglesToRemove.add(triangle);
					}										
				}				
			}			
		}
	
		// Removes the filtered triangles.
		output.getPolygons().removeAll(trianglesToRemove);
		
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE:
				return getMinimumRange();
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE:
				return getMaximumRange();
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH:
				return getMaximumEdgeLength();
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
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE:
				setMinimumRange((Double)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE:
				setMaximumRange((Double)newValue);
				return;
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH:
				setMaximumEdgeLength((Double)newValue);
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
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE:
				setMinimumRange(MINIMUM_RANGE_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE:
				setMaximumRange(MAXIMUM_RANGE_EDEFAULT);
				return;
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH:
				setMaximumEdgeLength(MAXIMUM_EDGE_LENGTH_EDEFAULT);
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
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE:
				return minimumRange != MINIMUM_RANGE_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE:
				return maximumRange != MAXIMUM_RANGE_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH:
				return maximumEdgeLength != MAXIMUM_EDGE_LENGTH_EDEFAULT;
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
			case ApogyCommonGeometryData3DPackage.TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER___FILTER__CARTESIANTRIANGULARMESH:
				return filter((CartesianTriangularMesh)arguments.get(0));
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
		result.append(" (minimumRange: ");
		result.append(minimumRange);
		result.append(", maximumRange: ");
		result.append(maximumRange);
		result.append(", maximumEdgeLength: ");
		result.append(maximumEdgeLength);
		result.append(')');
		return result.toString();
	}

} //TriangleEdgeLengthTriangularMeshFilterImpl
