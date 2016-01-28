/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.lidar.apogy.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFacade;
import ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.examples.lidar.Lidar;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.LidarData;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.LidarApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.ApogyExamplesLidarApogyFactory;
import ca.gc.asc_csa.apogy.examples.lidar.apogy.ApogyExamplesLidarApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lidar Apogy System Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LidarApogySystemApiAdapterImpl extends ApogySystemApiAdapterImpl
											   implements LidarApogySystemApiAdapter
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LidarApogySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesLidarApogyPackage.Literals.LIDAR_APOGY_SYSTEM_API_ADAPTER;
	}
	
	/**
	 * This is used to get the Lidar unit instance associated with this API
	 * adapter
	 * @return The associated Lidar instance
	 */
	public Lidar getLidar()
	{
		// Simply get a casted reference to the internal instance
		return (Lidar) this.getInstance();
	}
	
	/**
	 * This is used to create an initialization data object, which is
	 * relevant to this API adapter.
	 * @return An initialization data object which can be used by this adapter
	 * @generated_NOT
	 */
	@Override
	public AbstractInitializationData createInitializationData()
	{
		// Create a Lidar unit initialization data object and return it
		return ApogyExamplesLidarApogyFactory.eINSTANCE.createLidarData();
	}
	
	/**
	 * This is a method which is used to apply the given
	 * initialization data object to the API adapter's instance;
	 * this is particularly useful in conjunction with collect()
	 * as it can be used to save state and then load it back later.
	 * 
	 * @param initializationData The initialization data that is to be applied to the adapter's instance.
	 * @see #collect(AbstractInitializationData)
	 */
	@Override
	public void apply(AbstractInitializationData initializationData)
	{
		// Call the superclass's version of this method
		super.apply(initializationData);
		
		// If the instance data object is of the appropriate type
		if (initializationData instanceof LidarData)
		{
			// Cast down appropriately
			LidarData lidarData = (LidarData) initializationData;
			
			// If the Lidar unit is supposed to be initialized
			if (lidarData.isInitialized() == true)
			{
				// If the Lidar unit currently isn't initialized
				if (this.getLidar().isInitialized() == false)
				{
					// Just initialize it
					this.getLidar().init();
				}
				
				// If there is a field of view in the Lidar data
				if (lidarData.getFov() != null)
				{
					// Get a copy of that FOV and set it accordingly
					this.getLidar().setFov(ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(lidarData.getFov()));
				}
				// Otherwise
				else
				{
					// Just set it to null
					this.getLidar().setFov(null);
				}
			}
			// Otherwise, the Lidar unit is not supposed to be initialized
			else
			{
				// If the Lidar is currently initialized
				if (this.getLidar().isInitialized() == true)
				{
					// Generate the error message
					String message = "The given initialization data cannot be applied " +
									 "to this lidar unit; the given init data says that " +
									 "the lidar should not be initialized, when " +
									 "it already is in that state.";
					
					// Throw an exception to indicate that the apply() has failed; this will
					// be caught and logged by Apogy
					throw new RuntimeException(message);
				}
			}
		}
	}
	
	/**
	 * This is a method which is used to collect and fill the given
	 * initialization data object with relevant data from the API
	 * adapter's instance; this is particularly useful in conjunction
	 * with apply() as it can be used to save data, which can then be
	 * loaded back later.
	 * 
	 * @param initializationData The initialization data that is to store the state of the adapter's instance.
	 * @see #apply(AbstractInitializationData)
	 */
	@Override
	public void collect(AbstractInitializationData initializationData)
	{
		// Call the superclass's version of this method
		super.collect(initializationData);
		
		// If the instance data object is of the appropriate type
		if (initializationData instanceof LidarData)
		{
			// Cast down appropriately
			LidarData lidarData = (LidarData) initializationData;
			
			// If there is a field of view in the Lidar instance
			if (this.getLidar().getFov() == null)
			{
				// Get a copy of the FOV and set it accordingly
				lidarData.setFov(ApogyAddonsSensorsFOVFacade.INSTANCE.createRectangularFrustrumFieldOfView(this.getLidar().getFov()));
			}
			// Otherwise,
			else
			{
				// Just set it to null
				lidarData.setFov(null);
			}
		}
	}

} //LidarApogySystemApiAdapterImpl
