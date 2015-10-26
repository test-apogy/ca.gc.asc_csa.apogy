/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.environment.orbit.OrbitFacade;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl;
import org.eclipse.symphony.examples.satellite.Activator;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatelliteFactory;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.ImageOrder;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.SatelliteConstellation;
import org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData;
import org.eclipse.symphony.examples.satellite.SatelliteConstellationTypeApiAdapter;
import org.eclipse.symphony.examples.satellite.SatelliteInitializationData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Constellation Type Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SatelliteConstellationTypeApiAdapterImpl extends TypeApiAdapterImpl implements SatelliteConstellationTypeApiAdapter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteConstellationTypeApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_TYPE_API_ADAPTER;
	}

	@Override
	public AbstractInitializationData createInitializationData() 
	{
		return EMFEcoreExampleSatelliteFactory.eINSTANCE.createSatelliteConstellationInitializationData();
	}
	
	@Override
	public void collect(AbstractInitializationData data) 
	{									
		if(data instanceof SatelliteConstellationInitializationData)
		{
			SatelliteConstellationInitializationData constellationData = (SatelliteConstellationInitializationData) data;
						
			for(Satellite sat : getSatelliteConstellation().getSatellites())
			{
				Logger.INSTANCE.log(Activator.ID, this, "Collecting data from Satellite <" + sat.getName() + ">...", EventSeverity.INFO);
				SatelliteInitializationData satData = createSatelliteInitializationData(sat);
				constellationData.getSatelliteData().add(satData);
			}
			
			for(GroundStation gs : getSatelliteConstellation().getGroundStations())
			{
				Logger.INSTANCE.log(Activator.ID, this, "Collecting data from Ground Stations <" + gs.getName() + ">...", EventSeverity.INFO);
				GroundStation gsCopy = EcoreUtil.copy(gs);
				constellationData.getGroundStations().add(gsCopy);
			}
			
			for(ImageOrder io : getSatelliteConstellation().getPendingImageOrders())
			{
				ImageOrder ioCopy = EcoreUtil.copy(io);
				constellationData.getPendingImageOrders().add(ioCopy);
			}
		}
		
		super.collect(data);
	}
	
	@Override
	public void apply(AbstractInitializationData initializationData) 
	{	
		super.apply(initializationData);
		
		if(initializationData instanceof SatelliteConstellationInitializationData)
		{
			SatelliteConstellationInitializationData constellationData = (SatelliteConstellationInitializationData) initializationData;
			
			// Initialize the list of satellites.
			getSatelliteConstellation().getSatellites().clear();
			
			for(SatelliteInitializationData satData : constellationData.getSatelliteData())
			{
				applySatelliteInitializationData(satData);
			}
			
			// Initialize the list of GroundStations
			getSatelliteConstellation().getGroundStations().clear();
			for(GroundStation gs : constellationData.getGroundStations())
			{
				GroundStation gsCopy = EcoreUtil.copy(gs);
				getSatelliteConstellation().getGroundStations().add(gsCopy);
			}
			
			// Initialize the list of pending Image orders.
			getSatelliteConstellation().getPendingImageOrders().clear();
			for(ImageOrder io : constellationData.getPendingImageOrders())
			{
				ImageOrder ioCopy = EcoreUtil.copy(io);
				getSatelliteConstellation().getPendingImageOrders().add(ioCopy);
			}
		}
	}
	
	private SatelliteConstellation getSatelliteConstellation()
	{
		if(getInstance() instanceof SatelliteConstellation)
		{
			return (SatelliteConstellation) getInstance();
		}
		else
		{
			return null;
		}
	}
	
	private void applySatelliteInitializationData(SatelliteInitializationData satelliteInitializationData)
	{
		Satellite satCopy = EcoreUtil.copy(satelliteInitializationData.getSatellite());		
		OrbitModel orbitModelCopy = OrbitFacade.INSTANCE.createOrbitModelCopy(satelliteInitializationData.getOrbitModel());				
		
		// Sets the satellite orbit model top the orbit model copied from the data.
		satCopy.setOrbitModel(orbitModelCopy);
		
		getSatelliteConstellation().getSatellites().add(satCopy);
	}
	
	private SatelliteInitializationData createSatelliteInitializationData(Satellite satellite)
	{
		SatelliteInitializationData data = EMFEcoreExampleSatelliteFactory.eINSTANCE.createSatelliteInitializationData();
		
		// Sets the satellite.
		Satellite satCopy = EcoreUtil.copy(satellite);		
		data.setSatellite(satCopy);
		
		// Makes a copy of the OrbitModel and save it to the SatelliteInitializationData.
		OrbitModel orbitModelCopy = OrbitFacade.INSTANCE.createOrbitModelCopy(satellite.getOrbitModel());
		data.setOrbitModel(orbitModelCopy);
		
		return data;
	}
} //SatelliteConstellationTypeApiAdapterImpl
