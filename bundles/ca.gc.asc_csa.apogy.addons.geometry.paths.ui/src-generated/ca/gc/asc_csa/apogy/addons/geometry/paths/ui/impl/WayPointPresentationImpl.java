package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.impl;
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

import javax.vecmath.Point3d;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.ApogyAddonsGeometryPathsUIPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.WayPointPresentation;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WayPointPresentationImpl extends NodePresentationImpl implements WayPointPresentation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointPresentationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsGeometryPathsUIPackage.Literals.WAY_POINT_PRESENTATION;
	}
	
	@Override
	public Tuple3d getCentroid()
	{
		Point3d point3d = new Point3d();
		
		if(sceneObject != null)
		{
			point3d = sceneObject.getCentroid();
		}
		
		return ApogyCommonMathFacade.INSTANCE.createTuple3d(point3d);
	}
	
} //WayPointPresentationImpl
