/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.examples.rover.Activator;
import org.eclipse.symphony.examples.rover.EMFEcoreExampleRoverPackage;
import org.eclipse.symphony.examples.rover.RoverSimulated;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover Simulated</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoverSimulatedImpl extends RoverImpl implements RoverSimulated
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverSimulatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleRoverPackage.Literals.ROVER_SIMULATED;
	}

	/**
	 * This operation is used to perform the required initialization functions
	 * on the rover assembly; this may involve bootstrapping the components
	 * of the rover (e.g. mobile platform, cameras, etc.)
	 * @return Whether or not the rover was successfully initialized
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".init(): "; 
		
		// If the rover has already been disposed
		if (this.isDisposed() == true)
		{
			// Log that the rover's already been disposed
			String message = LOG_PREFIX +
								"Rejected; the rover has already been " +
								"disposed (with dispose()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// It was already disposed
			return false;
		}
		// Else if it was already successfully initialized
		else if (this.isInitialized() == true)
		{
			// Log that the initialization has already successfully taken place
			// and as such, this call will be ignored.
			String message = LOG_PREFIX +
								"Ignored; init() has already been successfully called.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			
			// It was already successfully initialized
			return true;
		}
		// Else if there is no mobile platform (i.e. it's null)
		else if (this.getMobilePlatform() == null)
		{
			// Log that the initialization can't take place as there isn't a mobile platform
			String message = LOG_PREFIX +
								"Rejected; there is no mobile platform so " +
								"rover initialization cannot proceed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// Indicate that initialization was not successful
			return false;
		}
		// Else if there is no robotic arm (i.e. it's null)
		else if (this.getRoboticArm() == null)
		{
			// Log that the initialization can't take place as there isn't a robotic arm
			String message = LOG_PREFIX +
							   "Rejected; there is no robotic arm so " +
							   "rover initialization cannot proceed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// Indicate that initialization was not successful
			return false;
		}
		
		// Else if there is no arm-mounted camera (i.e. it's null)
		else if (this.getArmCamera() == null)
		{
			// Log that the initialization can't take place as there isn't an arm-mounted camera
			String message = LOG_PREFIX +
								"Rejected; there is no arm-mounted camera so " +
								"rover initialization cannot proceed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// Indicate that initialization was not successful
			return false;
		}
		// Else if there is no side-mounted camera (i.e. it's null)
		else if (this.getCenterCamera() == null)
		{
			// Log that the initialization can't take place as there isn't a side-mounted camera
			String message = LOG_PREFIX +
								"Rejected; there is no side-mounted camera so " +
								"rover initialization cannot proceed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// Indicate that initialization was not successful
			return false;
		}
		// Otherwise, the rover hasn't been initialized successfully yet and all components
		// are present (not null)
		else
		{
			// Log the start of the initialization
			String message = LOG_PREFIX + "Rover initialization started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Attempt to initialize the mobile platform
			boolean platformInit = this.getMobilePlatform().init();
			
			// If the mobile platform didn't initialize properly
			if (platformInit == false)
			{
				// Log this fact
				message = LOG_PREFIX +
								"Rejected; Mobile platform subcomponent did " +
								"not init() properly so rover initialization " +
								"cannot proceed.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
				
				// Abort the rest of the initialization
				return false;
			}
			
			// Attempt to initialize the robotic arm
			boolean armInit = this.getRoboticArm().init();
			
			// If the robotic arm didn't initialize properly
			if (armInit == false)
			{
				// Log this fact
				message = LOG_PREFIX +
								"Rejected; Robotic arm subcomponent did " +
								"not init() properly so rover initialization " +
								"cannot proceed.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
				
				// Abort the rest of the initialization
				return false;
			}
			
			// Attempt to initialize the arm-mounted camera
			boolean armCamInit = this.getArmCamera().init();
			
			// If the arm-mounted camera didn't initialize properly
			if (armCamInit == false)
			{
				// Log this fact
				message = LOG_PREFIX +
							"Rejected; Arm-mounted camera subcomponent did " +
							"not init() properly so rover initialization " +
							"cannot proceed.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
				
				// Abort the rest of the initialization
				return false;
			}
			
			// Attempt to initialize the side-mounted camera
			boolean sideCamInit = this.getCenterCamera().init();
			
			// If the side-mounted camera didn't initialize properly
			if (sideCamInit == false)
			{
				// Log this fact
				message = LOG_PREFIX +
							"Rejected; Side-mounted camera subcomponent did " +
							"not init() properly so rover initialization " +
							"cannot proceed.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
				
				// Abort the rest of the initialization
				return false;
			}	
			
			// All components were successfully initialized
			
			// Log the end of the initialization
			message = LOG_PREFIX + "Rover initialization completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate the success of the initialization
			this.setInitialized(true);
			
			// Return true
			return true;
		}
	}

	/**
 	 * This operation is used to dispose of the given rover, shutting down
	 * and releasing the rover's resources; this implicitly means that the
	 * rover will not be available after calling this method.
	 * @see #successfulDispose
	 * @generated_NOT
	 */
	@Override
	public void dispose()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".dispose(): ";
		
		// If the rover's already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the rover has already " +
								"been disposed.";
			
			// Throw an exception to indicate the operation has failed; it will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Else the rover hasn't been disposed yet
		else
		{
			// Log the start of the rover's disposal actions
			String message = LOG_PREFIX +
								"Rover disposal started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Perform the required disposal actions
			
			// If there is a mobile platform
			if (this.getMobilePlatform() != null)
			{
				// Dispose of it
				this.getMobilePlatform().dispose();
			}
			
			// Indicate that the rover has been disposed
			this.setDisposed(true);
			
			// Log this fact
			message = LOG_PREFIX +
						"Rover disposal completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
		
	}
	
	/**
	 * This operation is used to change the linear velocity of the rover
	 * assembly to the provided value (given in m/s); internally, this is
	 * likely to cause a change to the mobile platform, as it is this component
	 * which actually moves the rover.
	 * <p>
	 * Note: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * 
	 * @param linearVelocity The rover assembly's new linear velocity (in m/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	@Override
	public void cmdLinearVelocity(double linearVelocity)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".cmdLinearVelocity(" + linearVelocity + "): ";
		
		// If the rover has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the rover has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate the operation has failed; it will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the rover has not been successfully initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the rover has not been " +
								"successfully initialized (with init()).";
			
			// Throw an exception to indicate the operation has failed; it will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, it's been initialized and not disposed
		else
		{
			// Set the linear velocity of the rover's platform
			this.getMobilePlatform().cmdLinearVelocity(linearVelocity);
		}
	}

	/**
	 * This operation is used to change the angular velocity of the rover
	 * assembly to the provided value (given in radians / second); internally,
	 * this is likely to cause a change to the mobile platform, as it is this
	 * component which actually moves the rover.
	 * <p>
	 * Note: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param angularVelocity The rover assembly's new angular velocity (in rad/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	@Override
	public void cmdAngularVelocity(double angularVelocity)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".cmdAngularVelocity(" + 
									Math.toDegrees(angularVelocity) +
									" (" + DEGREE_SYM + "/s)): ";
		
		// If the rover has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the rover has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate the operation has failed; it will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Else if the rover has not been successfully initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message 
			String message = LOG_PREFIX +
								"Rejected; the rover has not been " +
								"successfully initialized (with init()).";
			
			// Throw an exception to indicate the operation has failed; it will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, it's been initialized and not disposed
		else
		{
			// Set the angular velocity of the rover's platform
			this.getMobilePlatform().cmdAngularVelocity(angularVelocity);
		}
	}

	/**
	 * This operation is used to change both the linear velocity (given in m/s)
	 * and angular velocity (given in rad/s) of the rover assembly to the
	 * provided values; internally, this is likely to cause a change to the
	 * mobile platform, as it is this component which actually moves the rover.
	 * <p>
	 * Note 1: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * <p>
	 * Note 2: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param linearVelocity The rover assembly's new linear velocity (in m/s)
	 * @param angularVelocity The rover assembly's new angular velocity (in rad/s)
	 * @see #cmdLinearVelocity(double)
	 * @see #cmdAngularVelocity(double)
	 * @generated_NOT
	 */
	@Override
	public void cmdVelocities(double linearVelocity, double angularVelocity)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".cmdVelocities(" +	linearVelocity + " , " +
									Math.toDegrees(angularVelocity) +
									" (" + DEGREE_SYM + "/s)): "; 
		
		// If the rover has already been disposed (with dispose()).
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the rover has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate the operation has failed; it will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// If the rover has not been successfully initialized (with init())
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the rover has not been successfully initialized (with init()).";
			
			// Throw an exception to indicate the operation has failed; it will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, it's been initialized
		else
		{
			// Set the linear and angular velocities of the rover's platform
			this.getMobilePlatform().cmdVelocities(linearVelocity, angularVelocity);
		}
	}
} //RoverSimulatedImpl
