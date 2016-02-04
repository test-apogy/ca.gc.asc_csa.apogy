package ca.gc.asc_csa.apogy.addons.geometry.paths;
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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.geometry.paths.impl.ApogyAddonsGeometryPathsFacadeImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getApogyAddonsGeometryPathsFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsGeometryPathsFacade extends EObject {

	public static ApogyAddonsGeometryPathsFacade INSTANCE = ApogyAddonsGeometryPathsFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a WayPointPath from a WayPointPath. The WayPointPath created
	 * contains copies of all the points found in the specified WayPointPath.
	 * <!-- end-model-doc -->
	 * @model unique="false" wayPointPathUnique="false"
	 * @generated
	 */
	WayPointPath createWayPointPath(WayPointPath wayPointPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a WayPointPath using a list of CartesianPositionCoordinates.
	 * The WayPointPath created contains copies of all the points found in
	 * the specified list.
	 * <!-- end-model-doc -->
	 * @model unique="false" pointsDataType="ca.gc.asc_csa.apogy.addons.geometry.paths.List<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	WayPointPath createWayPointPath(List<CartesianPositionCoordinates> points);

} // ApogyAddonsGeometryPathsFacade
