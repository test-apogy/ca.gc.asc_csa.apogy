package ca.gc.asc_csa.apogy.common.geometry.data25d.impl;
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
import ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Mesh25D;
import ca.gc.asc_csa.apogy.common.geometry.data25d.Polygon25D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Mesh25DImpl extends MeshImpl<Coordinates25D, Polygon25D> implements Mesh25D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mesh25DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData25DPackage.Literals.MESH25_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Polygon25D> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<Polygon25D>(Polygon25D.class, this, ApogyCommonGeometryData25DPackage.MESH25_D__POLYGONS);
		}
		return polygons;
	}

} //Mesh25DImpl
