/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.symphony.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.examples.antenna.PTUDishAntenna;
import org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData;
import org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.antenna.symphony.SymphonyExampleAntennaFactory;
import org.eclipse.symphony.examples.antenna.symphony.SymphonyExampleAntennaPackage;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type;
import ca.gc.asc_csa.symphony.core.SymphonySystem;
import ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl;
import ca.gc.asc_csa.symphony.environment.EnvironmentFacade;
import ca.gc.space.math.Tuple3d;
import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import ca.gc.space.mrt.sensors.fov.FOVFacade;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PTU Dish Antenna Symphony System Api Adapter</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PTUDishAntennaSymphonySystemApiAdapterImpl extends SymphonySystemApiAdapterImpl
														implements
														PTUDishAntennaSymphonySystemApiAdapter
{
	/**
	 * This is the environment in which the Symphony system operates
	 */
	protected Environment environment;
	
	/**
	 * This is the core Symphony system and the utilities it provides.
	 */
	protected SymphonySystem symphonySystem;
	
	/**
	 * This is the sun tracker job, which may be available, depending
	 * on the instance's exact type.
	 */
	protected Job sunTrackerJob = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUDishAntennaSymphonySystemApiAdapterImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SymphonyExampleAntennaPackage.Literals.PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER;
	}

	/**
	 * This is the callback method that is called by the API adapter
	 * when the PTU dish antenna instance is being initialized by Symphony.
	 * @param environment The environment in which Symphony and its components are operating.
	 * @param elementType The type (e.g. class) of the given instance.
	 * @param instance The instance which is being handled by this API adapter.
	 */
	@Override
	public void init(Environment environment, Type elementType, EObject instance)
	{
		// Call the superclass's version of this method
		super.init(environment, elementType, instance);

		// Create the sun tracker job
		this.sunTrackerJob = new SunTrackerJob(this, "PTU Dish Antenna Sun Tracker");
			
		// Schedule it to be run
		this.sunTrackerJob.schedule();
	}

	/**
	 * This is the callback method that is called by the API adapter
	 * when the PTU dish antenna instance is being disposed (i.e. shutdown /
	 * destroyed) by Symphony
	 */
	@Override
	public void dispose()
	{
		// If there is a sun tracker job
		// (it may not be appropriate for all
		// implementations of the antenna instance)
		if (this.sunTrackerJob != null)
		{
			// Cancel the job
			this.sunTrackerJob.cancel();
		}
		
		// Call the superclass's version of this method
		super.dispose();
	}

	/**
	 * This is used to retrieve the API adapter's PTU dish
	 * antenna instance.
	 * @return The PTU dish antenna instance associated with this API adapter
	 */
	protected PTUDishAntenna getPTUDishAntenna()
	{
		// Just return the casted instance reference
		return (PTUDishAntenna) getInstance();
	}

	/**
	 * This is a factory method which can be called by the API
	 * adapter in order to create an initialization data instance
	 * of the appropriate type.
	 */
	@Override
	public AbstractInitializationData createInitializationData()
	{
		// Use the relevant factory method to create the desired
		// initialization data object, which, in this case, is
		// an instance of PTUDishAntennaData
		return SymphonyExampleAntennaFactory.eINSTANCE.createPTUDishAntennaData();
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
		
		// If this is an initialization data object which is
		// relevant to the PTU dish antenna adapter
		if (initializationData instanceof PTUDishAntennaData)
		{
			// Cast it appropriately
			PTUDishAntennaData ptuDishAntennaData = (PTUDishAntennaData) initializationData;
			
			// If the PTU dish antenna is supposed to be initialized
			if (ptuDishAntennaData.isInitialized() == true)
			{
				// If the PTU dish isn't already initialized
				if (this.getPTUDishAntenna().isInitialized() == false)
				{
					// Just initialize it
					this.getPTUDishAntenna().init();
				}
				
				// Move dish antenna to the given pan and tilt angle
				this.getPTUDishAntenna().moveTo(ptuDishAntennaData.getPanAngle(),
												ptuDishAntennaData.getTiltAngle());
				
				// Indicate whether the sun should be tracked
				this.getPTUDishAntenna().trackSun(ptuDishAntennaData.isTrackingSun());
				
				// If the initialization data has a field of view in it
				if (ptuDishAntennaData.getFov() != null)
				{
					// Create a copy of that field of view object
					ConicalFieldOfView fov = FOVFacade.INSTANCE.createConicalFieldOfView(ptuDishAntennaData.getFov());
					
					// Update the FOV accordingly
					this.getPTUDishAntenna().setFov(fov);
				}
				// Otherwise,
				else
				{
					// Just set it to null
					this.getPTUDishAntenna().setFov(null);
				}
			}
			// Otherwise, it's not supposed to be initialized
			else
			{
				// If the PTU dish is already initialized (Bad Case)
				if (this.getPTUDishAntenna().isInitialized() == true)
				{
					// Generate the error message
					String message = "The given initialization data cannot be applied " +
									 "to this PTU antenna; the given init data says that " +
									 "the antenna should not be initialized, when " +
									 "it already is in that state.";
					
					// Throw an exception to indicate that the apply() has failed; this will
					// be caught and logged by Symphony
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
		
		// If this is an initialization data object which is
		// relevant to the PTU dish antenna adapter
		if (initializationData instanceof PTUDishAntennaData)
		{
			// Cast it accordingly 
			PTUDishAntennaData ptuDishAntennaData = (PTUDishAntennaData) initializationData;
			
			// If the antenna had a field of view
			if (this.getPTUDishAntenna().getFov() != null)
			{
				// Store a copy of it in the initialization data object
				ptuDishAntennaData.setFov(FOVFacade.INSTANCE.createConicalFieldOfView(this.getPTUDishAntenna().getFov()));
			}
			// Otherwise
			else
			{
				// Just set it to null
				ptuDishAntennaData.setFov(null);
			}
			
			// Just store the other values
			ptuDishAntennaData.setInitialized(this.getPTUDishAntenna().isInitialized());
			ptuDishAntennaData.setPanAngle(this.getPTUDishAntenna().getPanAngle());
			ptuDishAntennaData.setTiltAngle(this.getPTUDishAntenna().getTiltAngle());
			ptuDishAntennaData.setTrackingSun(this.getPTUDishAntenna().isTrackingSun());
		}
	}
} // PTUDishAntennaSymphonySystemApiAdapterImpl

/**
 * This class is used to implement the sun tracking
 * functionality for the PTU dish antenna.
 */
class SunTrackerJob extends Job
{
	/**
	 * This is the length of time (in milliseconds) between
	 * subsequent updates of the antenna's position.
	 */
	private static final int SUN_TRACK_UPDATE_PERIOD = 200;
	
	/**
	 * This is used to keep track of the relevant API adapter
	 */
	private PTUDishAntennaSymphonySystemApiAdapterImpl apiAdapter; 
	
	/**
	 * This is the constructor for the SunTrackerJob class
	 * and as such, performs the required initialization
	 * and creation operations.
	 */
	protected SunTrackerJob(PTUDishAntennaSymphonySystemApiAdapterImpl apiAdapter,
						    String jobName)
	{
		// Just call the constructor for the superclass
		super(jobName);
		
		// Keep track of the API adapter
		this.apiAdapter = apiAdapter;
	}
	
	/**
	 * This is the workhorse of the SunTrackerJob class,
	 * actually performing the updates required to keep
	 * tracking the sun.
	 * @param monitor This is used to keep track of the job's progress and status
	 * @return The status of the job when it finished running
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor)
	{
		// While the job hasn't been cancelled yet
		while (monitor.isCanceled() == false)
		{
			// If there actually is an instance and tracking of the sun is enabled
			if ((this.apiAdapter.getPTUDishAntenna() != null) &&
				(this.apiAdapter.getPTUDishAntenna().isTrackingSun() == true))
			{
				// Get a vector pointing to the sun
				Tuple3d sunVector = EnvironmentFacade.INSTANCE.getSunVector(this.apiAdapter.getSymphonySystem(),
																	    	"PTU_DISH_ANTENNA_SYM_SYS_ROOT",
																	    	this.apiAdapter.getEnvironment());
			
				// If the sun vector was available
				if (sunVector != null) 
				{
					// Get the length of the sun vector hypotenuse
					double l = Math.sqrt((sunVector.getX() * sunVector.getX()) +
										 (sunVector.getY() * sunVector.getY()));
				
					// Extract the required pan angle (e.g. azimuth) for the antenna   
					double panAngle = Math.atan2(sunVector.getY(), sunVector.getX());
			
					// Extract the required tilt angle (e.g. elevation) for the antenna
					double tiltAngle = Math.atan2(sunVector.getZ(), l);

					// Set the PTU dish's pan and tilt angles accordingly
					apiAdapter.getPTUDishAntenna().setPanAngle(panAngle);
					apiAdapter.getPTUDishAntenna().setTiltAngle(tiltAngle);
				}
			}
			
			try
			{
				// Sleep for a period of time
				Thread.sleep(SUN_TRACK_UPDATE_PERIOD);
			}
			catch (InterruptedException ex)
			{
				// Print out the stack trace
				ex.printStackTrace();
			}
		}
		
		// Just indicate that the sun tracker job completed successfully
		return Status.OK_STATUS;
	}
}
