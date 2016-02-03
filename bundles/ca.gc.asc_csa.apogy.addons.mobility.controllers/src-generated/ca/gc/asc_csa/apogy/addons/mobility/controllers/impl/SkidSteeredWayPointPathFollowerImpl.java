package ca.gc.asc_csa.apogy.addons.mobility.controllers.impl;
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

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.SkidSteeredWayPointPathFollower;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skid Steered Way Point Path Follower</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SkidSteeredWayPointPathFollowerImpl extends SkidSteeredPlatformPathFollowerImpl<SkidSteeredMobilePlatform, WayPointPath> implements SkidSteeredWayPointPathFollower {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkidSteeredWayPointPathFollowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityControllersPackage.Literals.SKID_STEERED_WAY_POINT_PATH_FOLLOWER;
	}

} //SkidSteeredWayPointPathFollowerImpl
