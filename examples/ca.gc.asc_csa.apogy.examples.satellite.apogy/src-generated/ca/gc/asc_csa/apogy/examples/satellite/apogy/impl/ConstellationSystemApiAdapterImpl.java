/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package ca.gc.asc_csa.apogy.examples.satellite.apogy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationSystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyFactory;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage;

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
