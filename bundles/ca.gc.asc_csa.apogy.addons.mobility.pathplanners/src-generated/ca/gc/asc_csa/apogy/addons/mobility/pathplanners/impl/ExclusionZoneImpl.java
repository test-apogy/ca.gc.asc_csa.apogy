package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl;
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusion Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExclusionZoneImpl extends NodeImpl implements ExclusionZone {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersPackage.Literals.EXCLUSION_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInside(CartesianPositionCoordinates point) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean intersects(CartesianPositionCoordinates from, CartesianPositionCoordinates to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsMobilityPathplannersPackage.EXCLUSION_ZONE___IS_INSIDE__CARTESIANPOSITIONCOORDINATES:
				return isInside((CartesianPositionCoordinates)arguments.get(0));
			case ApogyAddonsMobilityPathplannersPackage.EXCLUSION_ZONE___INTERSECTS__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES:
				return intersects((CartesianPositionCoordinates)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExclusionZoneImpl
