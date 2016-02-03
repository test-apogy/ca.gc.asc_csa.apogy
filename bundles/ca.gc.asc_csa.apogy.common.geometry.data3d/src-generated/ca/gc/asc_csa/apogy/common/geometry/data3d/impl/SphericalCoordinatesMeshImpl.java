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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinatesMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sperical Coordinates Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SphericalCoordinatesMeshImpl extends MeshImpl<SphericalCoordinates, SphericalPolygon> implements SphericalCoordinatesMesh {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalCoordinatesMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.SPHERICAL_COORDINATES_MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<SphericalPolygon> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<SphericalPolygon>(SphericalPolygon.class, this, ApogyCommonGeometryData3DPackage.SPHERICAL_COORDINATES_MESH__POLYGONS);
		}
		return polygons;
	}

} //SphericalCoordinatesMeshImpl
