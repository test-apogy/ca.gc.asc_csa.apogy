package ca.gc.asc_csa.apogy.addons.geometry.paths.impl;
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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFacade;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsGeometryPathsFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsGeometryPathsFacade {
	
	private static ApogyAddonsGeometryPathsFacade instance = null;
	
	public static ApogyAddonsGeometryPathsFacade getInstance()
	{
		if (instance == null)
		{
			instance = new ApogyAddonsGeometryPathsFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsGeometryPathsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsGeometryPathsPackage.Literals.APOGY_ADDONS_GEOMETRY_PATHS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public WayPointPath createWayPointPath(WayPointPath wayPointPath) {
		
		WayPointPath path = createWayPointPath(wayPointPath.getPoints());	
		
		// Copies the description.		
		path.setDescription(wayPointPath.getDescription());		
		
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public WayPointPath createWayPointPath(List<CartesianPositionCoordinates> points)
	{
		WayPointPath path = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
				
		// Copies all of the points.
		Iterator <CartesianPositionCoordinates> it = points.iterator();
		while(it.hasNext())
		{
			CartesianPositionCoordinates wayPointCopy = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(it.next());
			path.getPoints().add(wayPointCopy);
		}				
					
		return path;
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
			case ApogyAddonsGeometryPathsPackage.APOGY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__WAYPOINTPATH:
				return createWayPointPath((WayPointPath)arguments.get(0));
			case ApogyAddonsGeometryPathsPackage.APOGY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__LIST:
				return createWayPointPath((List<CartesianPositionCoordinates>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
} //ApogyAddonsGeometryPathsFacadeImpl
