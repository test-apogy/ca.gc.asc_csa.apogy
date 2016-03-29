package ca.gc.asc_csa.apogy.examples.satellite;
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

import ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FIXME Remove this class.  Not used.
 * Utilities class for the satellite example.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationUtilities()
 * @model
 * @generated
 */
public interface ConstellationUtilities extends EObject {
	
	/*
	 * Returns the reference to the Utilities class (Singleton). 
	 */
	public ConstellationUtilities INSTANCE = ConstellationUtilitiesImpl.getInstance();

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds all the specified requests into the specified container.
	 * @param container Refers to the destination list.
	 * @param requests List of {@link AbstractConstellationRequest} to be imported.
	 * <!-- end-model-doc -->
	 * @model containerUnique="false" requestsDataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" requestsUnique="false" requestsMany="false"
	 * @generated
	 */
	void addAllRequests(ConstellationRequestsList container, List<AbstractConstellationRequest> requests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds the specified {@link AbstractConstellationRequest} to the list of {@link ConstellationRequestsList}.
	 * @param container Refers to the destination list.
	 * @param request Specifies the request to add to the list.
	 * <!-- end-model-doc -->
	 * @model containerUnique="false" requestUnique="false"
	 * @generated
	 */
	void addRequest(ConstellationRequestsList container, AbstractConstellationRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes the specified {@link AbstractConstellationRequest} from the specified {@link ConstellationRequestsList}.
	 * @param container Refers to the {@link ConstellationRequestsList}.
	 * @param request Specifies the request to remove from the list.
	 * <!-- end-model-doc -->
	 * @model containerUnique="false" requestUnique="false"
	 * @generated
	 */
	void removeRequest(ConstellationRequestsList container, AbstractConstellationRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes all the {@link AbstractConstellationRequest} specified from the list from the specified {@link ConstellationRequestsList}.
	 * @param container Refers to the {@link ConstellationRequestsList}.
	 * @param request Specifies the requests to remove from the {@link AbstractConstellation}.
	 * <!-- end-model-doc -->
	 * @model containerUnique="false" requestsDataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" requestsUnique="false" requestsMany="false"
	 * @generated
	 */
	void removeAllRequests(ConstellationRequestsList container, List<AbstractConstellationRequest> requests);

} // ConstellationUtilities
