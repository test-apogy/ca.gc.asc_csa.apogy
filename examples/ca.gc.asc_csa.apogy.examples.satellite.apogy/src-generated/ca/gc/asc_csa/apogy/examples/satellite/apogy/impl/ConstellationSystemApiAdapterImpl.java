/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.examples.satellite.AbstractConstellation;
import org.eclipse.symphony.examples.satellite.symphony.ConstellationData;
import org.eclipse.symphony.examples.satellite.symphony.ConstellationSystemApiAdapter;
import org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyFactory;
import org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConstellationSystemApiAdapterImpl extends SymphonySystemApiAdapterImpl implements ConstellationSystemApiAdapter {
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
		return Symphony__ExamplesSatelliteSymphonyPackage.Literals.CONSTELLATION_SYSTEM_API_ADAPTER;
	}

	@Override
	public AbstractInitializationData createInitializationData() {
		return Symphony__ExamplesSatelliteSymphonyFactory.eINSTANCE.createConstellationData();
	}
	
	@Override
	public void collect(AbstractInitializationData initializationData) {
		super.collect(initializationData);
		
		ConstellationData data = (ConstellationData) initializationData;						
		AbstractConstellation constellation = (AbstractConstellation) getInstance();
				
		data.setConstellationRequestsList(EcoreUtil.copy(constellation.getConstellationRequestsList()));
		data.setDownlinksLists(EcoreUtil.copy(constellation.getDownlinksLists()));
		data.setGroundStationsReferencesList(EcoreUtil.copy(constellation.getGroundStationsReferencesList()));
		data.setSatellitesList(EcoreUtil.copy(constellation.getSatellitesList()));		
	}
	
	@Override
	public void apply(AbstractInitializationData initializationData) {
		super.apply(initializationData);
		
		ConstellationData data = (ConstellationData) initializationData;
		AbstractConstellation constellation = (AbstractConstellation) getInstance();
		
		constellation.setConstellationRequestsList(EcoreUtil.copy(data.getConstellationRequestsList()));
		constellation.setDownlinksLists(EcoreUtil.copy(data.getDownlinksLists()));
		constellation.setGroundStationsReferencesList(EcoreUtil.copy(data.getGroundStationsReferencesList()));
		constellation.setSatellitesList(EcoreUtil.copy(data.getSatellitesList()));		
	}
	
} //ConstellationSystemApiAdapterImpl
