/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.impl;

import javax.vecmath.GVector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.FOVFacade;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.examples.antenna.Activator;
import org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaSimulated;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Dish Antenna Simulated</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PTUDishAntennaSimulatedImpl extends PTUDishAntennaImpl implements PTUDishAntennaSimulated
{
	/**
	 * This constant specified the default minimum range for the camera's
	 * field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a conical FOV ONLY if there
	 * is no other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov()
	 */
	protected static final double FOV_DEF_MINIMUM_RANGE = 0.0;
	
	/**
	 * This constant specified the default maximum range for the camera's
	 * field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a conical FOV ONLY if there
	 * is no other field of view provided (i.e. it's null) and
	 * getFov() is called.
	 * @see #getFov()
	 */
	protected static final double FOV_DEF_MAXIMUM_RANGE = 10.0;
	
	/**
	 * This constant specifies the default angle (in radians) for the camera's
	 * field of view (FOV).
	 * <p>
	 * Note: This will be used to construct a conical FOV ONLY if there
	 * is no other field of view provided (i.e. it's null) and
	 * getFov() is called
	 * @see #getFov() 
	 */
	protected static final double FOV_DEF_ANGLE = Math.toRadians(10);
	
	/**
	 * This constant specifies the angular speed (in °/s) of the joints
	 * of the dish antenna's PTU
	 * @see #computeDeltaTime(GVector, GVector)
	 */
	protected static final double MOVE_TO_ANGULAR_SPEED = 40.0;

	/**
	 * This constant specifies the time period (in milliseconds) to wait
	 * between the intermediate move steps.
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	protected static final int MOVE_TO_WAIT_PERIOD = 50;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUDishAntennaSimulatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleAntennaPackage.Literals.PTU_DISH_ANTENNA_SIMULATED;
	}

	/**
	 * This is a slightly different implementation of getFov();
	 * in this version, if the field of view (FOV) is not present
	 * (i.e. it's null), one will automatically be created.
	 * If it is present, then this will just return it.
	 * @return The camera's conical FOV
	 * @generated_NOT
	 */
	public ConicalFieldOfView getFov()
	{
		// Get the current field of view (using the superclass's implementation)
		ConicalFieldOfView tmp = super.getFov();

		// If one doesn't exist
		if(tmp == null)
		{
			// Create a conical field of view using the defaults
			tmp = FOVFacade.INSTANCE.createConicalFieldOfView(FOV_DEF_MINIMUM_RANGE,
															  FOV_DEF_MAXIMUM_RANGE,
															  FOV_DEF_ANGLE);

			// Set it accordingly
			this.setFov(tmp);
		}

		// Return the FOV
		return tmp;
	}
	
	/**
	 * This operation is used to perform the operations
	 * (if any) required to initialize the antenna
	 * @return Whether or not the antenna was successfully initialized
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".init(): ";

		// If the antenna has already been initialized
		if (this.isInitialized() == true)
		{
			// Log this fact
			String message = LOG_PREFIX +
								"Ignored; init() has already been successfully called.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);

			// Indicate that it was already successfully initialized
			return true;
		}
		// Otherwise, the antenna hasn't been initialized yet
		else
		{
			// Perform whatever initialization operations are required
			// In this case, there's nothing that really needs to be done here

			// Log this fact
			String message = LOG_PREFIX +
								"The PTU dish antenna has been initialized.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate that the antenna has now been initialized
			this.setInitialized(true);

			// Return true
			return true;
		}
	}

	/**
	 * This is used to toggle whether the PTU (and implicitly the
	 * antenna mounted on it) should be following the sun.  If
	 * true, then the antenna will continue tracking the sun until
	 * it is told otherwise.
	 *
	 * @param track Whether or not the PTU antenna should be following the sun.
	 * @generated_NOT
	 */
	@Override
	public void trackSun(boolean track)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".trackSun(" + track + "): ";
		
		// If the PTU antenna has not been initialized
		if (this.isInitialized() == false)
		{
			// Throw an exception to indicate this fact; will be
			// logged by Symphony
			String message = LOG_PREFIX +
								"Rejected; the PTU dish antenna "
								+ "is not initialized (with init()).";			
			throw new RuntimeException(message);
		}
		// Else if the given track value matches
		// the current tracking status
		else if (track == this.isTrackingSun())
		{
			// Throw an exception to indicate this fact; will be
			// logged by Symphony
			String message = LOG_PREFIX +
								"Ignored; the given tracking status is " +
								"the same as the PTU antenna's current "
								+ "tracking status.";
			throw new RuntimeException(message);
		}
		// Otherwise, the PTU dish antenna is initialized and
		// the given tracking status is different that the current
		// sun tracking status
		else
		{
			// Log this fact
			String message = LOG_PREFIX +
								"The PTU dish antenna is now " +
								(track == true ? "" : "no longer") +
								" tracking the sun.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Update the tracking sun value accordingly
			this.setTrackingSun(track);
			
			/**
			 * NOTE: The actual implementation of the sun tracker does
			 *       not take place here as it requires Symphony; as
			 *       such, the actual implementation is in the PTU dish
			 *       antenna's Symphony API Adapter.  For more details,
			 *       please see
			 *       {@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaSymphonySystemApiAdapterImpl}
			 */
		}
		
	}
	
	/**
	 * Command the PTU (and implicitly the antenna) to move to the
	 * specified pan and tilt angles.
	 * @param panAngle The target pan angle for the PTU (given in radians.)
	 * @param tiltAngle The target tilt angle for the PTU (given in radians.)
	 * @see #moveToConfiguration(GVector, GVector)
	 * @generated_NOT
	 */
	@Override
	public void moveTo(double panAngle, double tiltAngle) 
	{
		/**
		 * This is the degree symbol, as expressed in unicode
		 */
		final String DEGREE_SYM = "\u00b0";
		
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveTo(" + Math.toDegrees(panAngle) +
									DEGREE_SYM + ", " +	Math.toDegrees(tiltAngle) +
									DEGREE_SYM + "): ";		

		// If the antenna has not been initialized
		if (this.isInitialized() == false)
		{
			// Throw an exception to indicate the failure; this will
			// be logged by Symphony
			String message = LOG_PREFIX +
								"Rejected; the PTU antenna is " +
								"not initialized (with init()).";
			throw new RuntimeException(message);
		}
		// Else if the antenna is currently tracking the sun
		else if (this.isTrackingSun() == true)
		{
			// Throw an exception to indicate the failure; this will
			// be logged by Symphony
			String message = LOG_PREFIX +
								"Rejected; the PTU antenna is " +
								"currently tracking the sun and " +
								"as such, the joints cannot " +
								"currently be moved manually.";
			throw new RuntimeException(message);
		}
		// Else if the provided angles match the PTU's current angles
		else if ((this.getPanAngle() == panAngle) &&
				(this.getTiltAngle() == tiltAngle))
		{
			// Throw an exception to indicate the failure; this will
			// be logged by Symphony
			String message = LOG_PREFIX +
								"Ignored; No move required as antenna's " +
								"current angles match those provided.";
			throw new RuntimeException(message);
		}
		// Otherwise, the antenna has been initialized successfully
		// and the antenna will need to move.
		else
		{
			// Indicate that the move of the antenna is beginning
			String message = LOG_PREFIX + "PTU dish antenna move started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Generate vectors with the initial and target angles for the antenna's PTU
			final GVector initialJointAngles = new GVector(new double[]{getPanAngle(),
																		getTiltAngle()});
			final GVector finalJointAngles = new GVector(new double[]{panAngle,
																	  tiltAngle});

			// Move to the target pan and tilt angles
			moveToConfiguration(initialJointAngles, finalJointAngles);

			// Indicate that the move of the antenna is now complete
			message = LOG_PREFIX + "PTU dish antenna move completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
	}

	/**
	 * This private helper method is used to move the antenna's current pan
	 * and tilt angles to the desired target angles (where both sets of
	 * angles here are represented as vectors.)
	 * 
	 * @param initialAngles The initial (i.e. current) set of angles (pan and tilt) for the antenna's PTU  
	 * @param finalAngles The desired final set of angles (pan and tilt) for the PTU
	 * @see #moveTo(double, double, String)
	 * @see #computeDeltaTime(GVector, GVector)
	 */
	private void moveToConfiguration(final GVector initialJointAngles, final GVector finalJointAngles)
	{
		// Get a copy of the initial pan and tilt angles
		GVector interpolatedJointsValues = new GVector(initialJointAngles);

		// Determine how much to change the angles at each intermediate move step
		// Used to facilitate the vector interpolation process.
		double deltaT = computeDeltaTime(initialJointAngles, finalJointAngles);

		// Keep track of the current position in the movement (i.e. interpolation) process 
		double t = -deltaT;			

		// While not at the final pan and tilt angles yet
		while (t <= 1.0)
		{
			// Update the movement progress
			t += deltaT;

			// Interpolate the angles (Recall that t=0 refers to the initial angles
			// while t=1 refers to the final angles.)
			interpolatedJointsValues.interpolate(initialJointAngles, finalJointAngles, t);					

			// Update the current joint values accordingly
			setPanAngle(interpolatedJointsValues.getElement(0));
			setTiltAngle(interpolatedJointsValues.getElement(1));				

			try 
			{
				// Sleep for a short period of time (this makes it far
				// easier to visualize and follow the movement of the PTU dish antenna)
				Thread.sleep(MOVE_TO_WAIT_PERIOD);
			}
			catch (InterruptedException e)
			{
				// Print the stack trace
				e.printStackTrace();
			}
		}
	}	

	/**
	 * This helper function is used to determine the change in time (delta t) for each step
	 * when determining the current interpolation from the initial angle vector to the
	 * final (i.e. desired) angle vector.
	 * 
	 * Note 1: This is dependent on the fixed angular speed (in degrees / second) of the joint
	 * 
	 * Note 2: There's an implicit assumption that the pan and tilt joints both have the same
	 * 		   speed, which may or may not be true.
	 * 
	 * @param initialJointAngles The initial joint configuration (in degrees) of the PTU dish antenna
	 * @param finalJointAngles The desired final joint configuration (in degrees) of the antenna
	 * @return The change in time (delta t) required for each time step.
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	private double computeDeltaTime(final GVector initialJointAngles, final GVector finalJointAngles)
	{
		// Determine the joint which requires the most reconfiguration (in radians)
		double largestMove = 0;

		// Go through all of the joints
		for(int i = 0; i < initialJointAngles.getSize(); i++)
		{
			// Determine the difference between the initial joint angle and the final angle
			double deltaAngle = Math.abs(finalJointAngles.getElement(i) -
					initialJointAngles.getElement(i));

			// If this is larger than the current max
			if(deltaAngle > largestMove)
			{
				// Update the max accordingly
				largestMove = deltaAngle;
			}
		}

		// Figure out how many seconds it will take to move all the joints, given
		// the fixed angular speed.
		double travelTime = largestMove / Math.toRadians(MOVE_TO_ANGULAR_SPEED);

		// Divide the time per step (in seconds) by the travel time
		// This is the amount of progress that should be made by each move step
		double deltaTime = (0.001 * MOVE_TO_WAIT_PERIOD) / travelTime;

		// Return the delta t
		return deltaTime;
	}
} //PTUDishAntennaSimulatedImpl
