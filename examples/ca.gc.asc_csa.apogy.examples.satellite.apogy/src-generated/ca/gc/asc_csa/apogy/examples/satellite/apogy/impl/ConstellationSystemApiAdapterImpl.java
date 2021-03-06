package ca.gc.asc_csa.apogy.examples.satellite.apogy.impl;
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
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyFactory;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationSystemApiAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstellationSystemApiAdapterImpl extends ApogySystemApiAdapterImpl implements ConstellationSystemApiAdapter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationSystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_SYSTEM_API_ADAPTER;
	}

	@Override
	public AbstractInitializationData createInitializationData() {
		return ApogyExamplesSatelliteApogyFactory.eINSTANCE.createConstellationData();
	}
	
	@Override
	public void collect(AbstractInitializationData initializationData) {
		super.collect(initializationData);
		
		ConstellationData data = (ConstellationData) initializationData;		
		data.setConstellationState(ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationState());
		AbstractConstellation constellation = (AbstractConstellation) getInstance();						
		ConstellationState constellationState = EcoreUtil.copy(constellation.getConstellationState());
		
		data.getConstellationState().setConstellationRequestsListsContainer(constellationState.getConstellationRequestsListsContainer());
		data.getConstellationState().setConstellationCommandPlansList(constellationState.getConstellationCommandPlansList());
		data.getConstellationState().setDownlinksLists(constellationState.getDownlinksLists());
		data.getConstellationState().setGroundStationsReferencesList(constellationState.getGroundStationsReferencesList());
		data.getConstellationState().setSatellitesList(constellationState.getSatellitesList());
		data.getConstellationState().setConstellationPlannersContainer(constellationState.getConstellationPlannersContainer());
	}
	
	@Override
	public void apply(AbstractInitializationData initializationData) {
		super.apply(initializationData);		
		ConstellationData data = EcoreUtil.copy((ConstellationData) initializationData);
		AbstractConstellation constellation = (AbstractConstellation) getInstance();
		
		constellation.setConstellationState(ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationState());
		
		if (data.getConstellationState() != null){
			constellation.getConstellationState().setConstellationCommandPlansList(data.getConstellationState().getConstellationCommandPlansList());
			constellation.getConstellationState().setConstellationRequestsListsContainer(data.getConstellationState().getConstellationRequestsListsContainer());
			constellation.getConstellationState().setDownlinksLists(data.getConstellationState().getDownlinksLists());
			constellation.getConstellationState().setGroundStationsReferencesList(data.getConstellationState().getGroundStationsReferencesList());
			constellation.getConstellationState().setSatellitesList(data.getConstellationState().getSatellitesList());
			constellation.getConstellationState().setConstellationPlannersContainer(data.getConstellationState().getConstellationPlannersContainer());
		}
	}
	
} //ConstellationSystemApiAdapterImpl