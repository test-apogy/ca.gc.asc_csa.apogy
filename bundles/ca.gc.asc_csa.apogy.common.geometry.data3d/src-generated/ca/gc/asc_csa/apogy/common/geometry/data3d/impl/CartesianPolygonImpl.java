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

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.PolygonImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPolygonImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPolygonImpl#getNormal <em>Normal</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.impl.CartesianPolygonImpl#getCentroid <em>Centroid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianPolygonImpl extends PolygonImpl<CartesianPositionCoordinates> implements CartesianPolygon {
	/**
	 * The default value of the '{@link #getSurface() <em>Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurface()
	 * @generated
	 * @ordered
	 */
	protected static final double SURFACE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getNormal() <em>Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3d NORMAL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPolygonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_POLYGON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CartesianPositionCoordinates> getVertices() {
		if (vertices == null) {
			vertices = new EObjectEList<CartesianPositionCoordinates>(CartesianPositionCoordinates.class, this, ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON__VERTICES);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getSurface() {
		return Geometry3DUtilities.getPolygonSurface(this.getVertices());		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Vector3d getNormal() {
		return Geometry3DUtilities.getPolygonNormal(this.getVertices());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CartesianPositionCoordinates getCentroid() {
		CartesianPositionCoordinates centroid = basicGetCentroid();
		return centroid != null && centroid.eIsProxy() ? (CartesianPositionCoordinates)eResolveProxy((InternalEObject)centroid) : centroid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CartesianPositionCoordinates basicGetCentroid() {
		return Geometry3DUtilities.getCentroid(this.getVertices());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON__SURFACE:
				return getSurface();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON__NORMAL:
				return getNormal();
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON__CENTROID:
				if (resolve) return getCentroid();
				return basicGetCentroid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON__SURFACE:
				return getSurface() != SURFACE_EDEFAULT;
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON__NORMAL:
				return NORMAL_EDEFAULT == null ? getNormal() != null : !NORMAL_EDEFAULT.equals(getNormal());
			case ApogyCommonGeometryData3DPackage.CARTESIAN_POLYGON__CENTROID:
				return basicGetCentroid() != null;
		}
		return super.eIsSet(featureID);
	}

} //CartesianPolygonImpl
