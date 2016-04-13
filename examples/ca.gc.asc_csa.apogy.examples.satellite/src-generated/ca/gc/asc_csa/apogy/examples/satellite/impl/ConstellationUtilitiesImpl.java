package ca.gc.asc_csa.apogy.examples.satellite.impl;
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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstellationUtilitiesImpl extends MinimalEObjectImpl.Container implements ConstellationUtilities {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.CONSTELLATION_UTILITIES;
	}
	
	private static ConstellationUtilities instance = null;

	public static ConstellationUtilities getInstance() {
		if (instance == null) {
			instance = new ConstellationUtilitiesImpl();
		}
		return instance;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void addAllRequests(ConstellationRequestsList container, List<AbstractConstellationRequest> requests) {
		container.getConstellationRequests().addAll(requests);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void addRequest(ConstellationRequestsList container, AbstractConstellationRequest request) {
		container.getConstellationRequests().add(request);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void removeRequest(ConstellationRequestsList container, AbstractConstellationRequest request) {
		container.getConstellationRequests().remove(request);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void removeAllRequests(ConstellationRequestsList container, List<AbstractConstellationRequest> requests) {
		container.getConstellationRequests().removeAll(requests);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_UTILITIES___ADD_ALL_REQUESTS__CONSTELLATIONREQUESTSLIST_LIST:
				addAllRequests((ConstellationRequestsList)arguments.get(0), (List<AbstractConstellationRequest>)arguments.get(1));
				return null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_UTILITIES___ADD_REQUEST__CONSTELLATIONREQUESTSLIST_ABSTRACTCONSTELLATIONREQUEST:
				addRequest((ConstellationRequestsList)arguments.get(0), (AbstractConstellationRequest)arguments.get(1));
				return null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_UTILITIES___REMOVE_REQUEST__CONSTELLATIONREQUESTSLIST_ABSTRACTCONSTELLATIONREQUEST:
				removeRequest((ConstellationRequestsList)arguments.get(0), (AbstractConstellationRequest)arguments.get(1));
				return null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_UTILITIES___REMOVE_ALL_REQUESTS__CONSTELLATIONREQUESTSLIST_LIST:
				removeAllRequests((ConstellationRequestsList)arguments.get(0), (List<AbstractConstellationRequest>)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConstellationUtilitiesImpl
