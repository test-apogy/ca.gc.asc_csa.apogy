/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import java.util.Collection;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Discrete Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl#getSlopeRanges <em>Slope Ranges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl extends CartesianTriangularMeshSlopeImageMapLayerImpl implements CartesianTriangularMeshDiscreteSlopeImageMapLayer {
	/**
	 * The cached value of the '{@link #getSlopeRanges() <em>Slope Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<SlopeRange> slopeRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlopeRange> getSlopeRanges() {
		if (slopeRanges == null) {
			slopeRanges = new EObjectContainmentEList<SlopeRange>(SlopeRange.class, this, ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES);
		}
		return slopeRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES:
				return ((InternalEList<?>)getSlopeRanges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES:
				return getSlopeRanges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES:
				getSlopeRanges().clear();
				getSlopeRanges().addAll((Collection<? extends SlopeRange>)newValue);
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES:
				getSlopeRanges().clear();
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
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES:
				return slopeRanges != null && !slopeRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	protected int getColor(double meshMinimumSlope, double meshMaximumSlope, double slope) 
	{
		if(getSlopeRanges().isEmpty())
		{
			return super.getColor(meshMinimumSlope, meshMaximumSlope, slope);
		}
		else
		{			
			// Finds in which Slope Range the slope falls.
			SlopeRange slopeRange = getSlopeRange(slope);
			
			if(slopeRange != null)
			{
				Color3f color3f = slopeRange.getColor();
				return convertColor(color3f);
			}
			
			return TRANSPARENT_COLOR;
		}
	}
	
	/**
	 * Given a slope value, return the SlopeRange in which the slope falls.
	 * @param slope The slope, in radians.
	 * @return The SlopeRange in which the slope falls, null if none is found.
	 */
	protected SlopeRange getSlopeRange(double slope)
	{
		double slopeInDegrees = Math.toDegrees(slope);
		
		for(SlopeRange slopeRange : getSlopeRanges())
		{
			if((slopeRange.getSlopeLowerBound() <= slopeInDegrees) &&
			   (slopeInDegrees < slopeRange.getSlopeUpperBound()))
			{
				return slopeRange;
			}
		}
		return null;
	}
} //CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl
