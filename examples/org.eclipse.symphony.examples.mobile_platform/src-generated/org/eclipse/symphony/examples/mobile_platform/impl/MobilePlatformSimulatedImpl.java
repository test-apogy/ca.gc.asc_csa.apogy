/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.impl;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.vecmath.GVector;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.examples.mobile_platform.Activator;
import org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformFactory;
import org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage;
import org.eclipse.symphony.examples.mobile_platform.MobilePlatformSimulated;
import org.eclipse.symphony.examples.mobile_platform.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Platform Simulated</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MobilePlatformSimulatedImpl extends MobilePlatformImpl implements MobilePlatformSimulated
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
	/**
	 * This is the radius (in m) of the mobile platform's wheels
	 */
	protected static final double WHEEL_RADIUS = 0.25;
	
	/**
	 * This is the length (in m) of the mobile platform's track 
	 */
	protected static final double WHEEL_TRACK = 0.64;

	/**
	 * This is the time (in milliseconds) between subsequent movement
	 * steps of the mobile platform.
	 */
	protected static final int MOVE_WAIT_PERIOD = 75;
	
	/**
	 * This is the minimum linear velocity (in metres / second) that a
	 * moveTo() operates at.
	 */
	protected static final double MOVE_TO_MIN_LIN_SPEED = 1.5; 
	
	/**
	 * This is the amount of  error is taking place per metre
	 * of distance traveled by the mobile platform.
	 */
	protected static final double ERROR_PER_METER = 0.05; 
	
	/**
	 * This is the job used to handle moving the mobile platform
	 */
	private Job moveJob;
	
	/**
	 * This is used to stop concurrent R/W access to the platform's
	 * relevant fields
	 */
	final Lock lock;
	
	/**
	 * This is used to keep track of whether or not the
	 * mobile platform in the midst of a moveTo()
	 */
	boolean doingMoveTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected MobilePlatformSimulatedImpl()
	{
		// Call the superclass's constructor
		super();
		
		// Initialize the lock
		this.lock = new ReentrantLock();
		
		// Initialize the move job
		this.moveJob = null;
		
		// Initialize whether or not the mobile platform is doing an explicit move
		this.doingMoveTo = false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return EMFEcoreExampleMobilePlatformPackage.Literals.MOBILE_PLATFORM_SIMULATED;
	}
	
	/**
	 * This operation is used to initialize the mobile platform
	 * and as such, it will perform the required creation and
	 * initialization steps.
	 * 
	 * @return Whether or not the mobile platform was successfully initialized
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".init(): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has " +
								"already been disposed (with dispose()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// Indicate that it wasn't initialized
			return false;
		}
		// Otherwise, if the mobile platform has already been initialized
		else if (this.isInitialized() == true)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Ignored; the mobile platform has " +
								"already been initialized (with init()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			
			// Indicate that it was already initialized
			return true;
		}
		else
		{
			// Log the start of the initialization process
			String message = LOG_PREFIX +
								"Mobile platform initialization started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Perform the required initialization
						
			// All of the subcomponents were initialized
			
			// Perform whatever initialization needs to be done for the mobile platform
			
			// Create and schedule the mobile platform's move job
			this.moveJob = new MobilePlatformSimulatedMoveJob(this, "Mobile Platform Move Job");
			this.moveJob.schedule();
			
			// Indicate the success of the initialization
			this.setInitialized(true);
			
			// Log this successful completion of the initialization process
			message = LOG_PREFIX +
						"Mobile platform initialization complete.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Just return true
			return true;
		}
	}

	/**
	 * This operation is used to dispose of the mobile platform
	 * and as such, it will perform the steps required to
	 * shutdown the platform and any resources it uses.  Note
	 * that implicitly, this means that the mobile platform won't
	 * be available after it has been disposed.
	 * 
	 * @generated_NOT
	 */
	@Override
	public void dispose()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".dispose(): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation failed; this will
			// be caught and handled by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the platform hasn't been disposed yet 
		else
		{
			// Perform the necessary disposal actions
			
			// Cancel the movement job
			if (moveJob != null){
				this.moveJob.cancel();
			}
			
			// Indicate that the mobile platform is now disposed
			this.setDisposed(true);
			
			// Log this event
			String message = LOG_PREFIX +
								"Mobile platform has been successfully disposed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
	}
	
	/**
	 * This operation is used to change the mobile platform to
	 * have the coordinates and pose matching the given position.
	 * That new position will be considered the new starting place
	 * for the mobile platform and as such, the accumulated error will
	 * be cleared; all error will be relative to that new position.
	 * 
	 * @param position The mobile platform's new desired position
	 * @generated_NOT
	 */
	@Override
	public void clearPositionError()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + 
									".clearPositionError(): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX + 
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " + 
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the error in position can be cleared
		else
		{
			// Log this event
			String message = LOG_PREFIX +
								"The mobile platform's position error " +
								"has been cleared.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Acquire the internal lock
			this.lock.lock();
			
			// Clear the platform's position error
			this.setPositionError(0.0);
			
			// Release the value lock
			this.lock.unlock();
		}	
	}

	/**
	 * This operation is used to clear the mobile platform's positional
	 * error; this could be used to indicate that all error should now
	 * be taken in respect to the robot's current position.
	 * 
	 * @generated_NOT
	 */
	@Override
	public void stop()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".stop(): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the platform should stop
		else
		{
			// Log this event
			String message = LOG_PREFIX +
								"The mobile platform is stopping.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Acquire the internal lock
			this.lock.lock();
			
			// Change both the linear and angular velocities to 0
			this.setAngularVelocity(0.0);
			this.setLinearVelocity(0.0);
			
			// Release the internal lock
			this.lock.unlock();
		}
	}

	/**
	 * This operation is used move the mobile platform to the
	 * specified coordinates.
	 * <p>
	 * Note: In general, the platform moves at the current linear
	 *       speed; the only exception is if the speed is less than
	 *       MOVE_TO_MIN_LIN_SPEED, the platform will move at a speed
	 *       of MOVE_TO_MIN_LIN_SPEED instead.
	 * 
	 * @param x This is the mobile platform's desired X coordinate (in metres).
	 * @param y This is the mobile platform's desired Y coordinate (in metres).
	 * @see #MOVE_TO_MIN_LIN_SPEED
	 * @generated_NOT
	 */
	@Override
	public void moveTo(double x, double y)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveTo(" + x + ", " + y + "): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()),";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the platform is initialized and not disposed
		else
		{
			// Acquire the internal lock
			this.lock.lock();
						
			// If there already is another moveTo() executing
			if (this.doingMoveTo == true)
			{
				// Just release the lock
				this.lock.unlock();
				
				// Generate the error message
				String message = LOG_PREFIX +
									"Ignored; the mobile platform is currently " +
									"in the midst of another moveTo() operation.";
				
				// Throw an exception to indicate that the operation has failed; this will
				// be caught and logged by Symphony
				throw new RuntimeException(message);
			}
			// Otherwise, there is no other moveTo() operation executing
			else
			{
				// Indicate that one is taking place
				this.doingMoveTo = true;

				// Get the platform's current position
				GVector initialLocation = new GVector(new double[]{this.getPosition().getX(),
															       this.getPosition().getY()});
				
				// Get the current linear velocity
				double currentSpeed = this.getLinearVelocity();
				
				// Release the internal lock
				this.lock.unlock();
				
				// Log the beginning of the move
				String message = LOG_PREFIX +
									"Mobile platform move started.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
								
				// Get the desired final position for the platform
				GVector finalLocation = new GVector(new double[]{x, y});
				
				// Actually trigger the move to the target location
				this.move(initialLocation, finalLocation, currentSpeed);
				
				// Acquire the internal lock
				this.lock.lock();
				
				// Indicate that a move is no longer taking place
				this.doingMoveTo = false;
				
				// Release the internal lock
				this.lock.unlock();
				
				// Log the end of the move
				message = LOG_PREFIX +
								"Mobile platform move completed.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			}
		}
	}

	/**
	 * This operation is used to change the mobile platform's linear
	 * velocity (in metres per second) to the specified value.
	 * <p>
	 * Note: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * 
	 * @param linearVelocity The mobile platform's new linear velocity (in m/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	@Override
	public void cmdLinearVelocity(double linearVelocity)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".cmdLinearVelocity(" + linearVelocity +
									"): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the mobile platform hasn't been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the platform is initialized and not yet disposed
		else
		{
			// Acquire the internal lock
			this.lock.lock();
			
			// Update the linear velocity accordingly
			this.setLinearVelocity(linearVelocity);
			
			// Release the internal lock
			this.lock.unlock();
		}
	}

	/**
	 * This operation is used to change the mobile platform's angular
	 * velocity (in radians per second) to the specified value.
	 * <p>
	 * Note: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param angularVelocity The mobile platform's new angular velocity (in rad/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	@Override
	public void cmdAngularVelocity(double angularVelocity)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".cmdAngularVelocity(" +
									Math.toDegrees(angularVelocity) +
									"(" + DEGREE_SYM + "/s)): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the platform is initialized and not yet disposed
		else
		{
			// Acquire the internal lock
			this.lock.lock();
			
			// Update the angular velocity accordingly
			this.setAngularVelocity(angularVelocity);
			
			// Release the internal lock
			this.lock.unlock();
		}
	}

	/**
	 * The operation is used to change the mobile platform's linear and
	 * angular velocities, which are in metres / second and radians / second,
	 * respectively.
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
	 * @param linearVelocity The commanded linear velocity.
	 * @param angularVelocity The commanded angular velocity.
	 * @see #cmdLinearVelocity(double)
	 * @see #cmdAngularVelocity(double)
	 * @generated_NOT
	 */
	@Override
	public void cmdVelocities(double linearVelocity,
							  double angularVelocity)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".cmdVelocities(" + linearVelocity + ", " +
									Math.toDegrees(angularVelocity) +
									"(" + DEGREE_SYM + "/s)): ";
		
		// If the mobile platform has been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the platform is initialized and not yet disposed
		else
		{
			// Acquire the internal lock
			this.lock.lock();
			
			// Update the linear and angular velocities accordingly
			this.setLinearVelocity(linearVelocity);
			this.setAngularVelocity(angularVelocity);
			
			// Release the internal lock
			this.lock.unlock();
		}
	}

	/**
	 * This operation is used to change the mobile platform to
	 * have the coordinates and pose matching the given position.
	 * That new position will be considered the new starting place
	 * for the mobile platform and as such, the accumulated error will
	 * be cleared; all error will be relative to that new position.
	 * 
	 * @param position The mobile platform's new desired position
	 * @generated_NOT
	 */
	@Override
	public void resetPosition(Position position)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".resetPosition(Position(X=" + 
									position.getX() + ", Y=" + 
									position.getY() + ", Theta=" +
									Math.toDegrees(position.getTheta()) +
									DEGREE_SYM + ")): ";
		
		// If the mobile platform has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform has already " +
								"been disposed (with dispose()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the mobile platform has not been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the mobile platform is not " +
								"initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the platform is initialized and not yet disposed
		else
		{
			// Acquire the internal lock
			this.lock.lock();
			
			// If there is currently a moveTo() taking place
			if (this.doingMoveTo == true)
			{
				// Just release the internal lock
				this.lock.unlock();
				
				// Generate the error message
				String message = LOG_PREFIX +
									"Rejected; the mobile platform is currently " +
									"in the midst of a moveTo() operation.";
				
				// Throw an exception to indicate that the operation has failed; this will
				// be caught and logged by Symphony
				throw new RuntimeException(message);
			}
			// Otherwise, there is no move operation in progress
			else
			{
				// Update the position
				this.setPosition(position);
				
				// Reset the position error
				this.setPositionError(0.0);
				
				// Release the internal lock
				this.lock.unlock();
				
				// Log that the position has been update and the error reset
				String message = LOG_PREFIX +
									"The mobile platform's position has been changed " +
									"accordingly and its position error has been reset.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			}
		}
	}
	
	/**
	 * This private helper function is used to actually implement the movement of
	 * the mobile platform.
	 * 
	 * @param initialLocation The initial location (in coordinates) of the mobile platform
	 * @param finalLocation The desired final location (in coordinates) of the mobile platform
	 * @param speed The platform's current speed (when called)
	 * @see #moveTo(double, double)
	 * @see #computeMoveDeltaTime(GVector, GVector, double, double)
	 */
	private void move(GVector initialLocation,
					  GVector finalLocation,
					  double speed)
	{
		// Make a copy of the initial position
		GVector interpolatedLocation = new GVector(initialLocation);

		// Ensure that the current speed follows the formula
		double currSpeed = calculateMoveToSpeed(speed);
		
		// Keep track of the current interpolation process.
		double t = 0.0;
		
		// Keep track of the current delta t
		double deltaT = computeMoveDeltaTime(initialLocation,
				 							 finalLocation,
				 							 t,
				 							 currSpeed);
		
		// While not at the final (i.e. target) location
		while (t <= 1.0) 
		{
			// Acquire the internal lock
			this.lock.lock();
			
			// If the speed has changed
			if (currSpeed != calculateMoveToSpeed(this.getLinearVelocity()))
			{
				// Update the speed
				currSpeed = calculateMoveToSpeed(this.getLinearVelocity());
				
				// Calculate a new delta t
				deltaT = computeMoveDeltaTime(initialLocation,
											  finalLocation,
											  t,
											  currSpeed);		
			}
						
			// Interpolates the location (Recall that t=0 is the initial
			// coordinate vector with t=1 is the final coordinate vector)
			interpolatedLocation.interpolate(initialLocation, finalLocation, t);
					
			// Update the platform's location with the currently interpolated coordinates
			this.getPosition().setX(interpolatedLocation.getElement(0));
			this.getPosition().setY(interpolatedLocation.getElement(1));
					
			// Release the internal lock
			this.lock.unlock();
			
			// Progress the interpolation by delta t
			t += deltaT;
			
			try 
			{
				// Sleep for a short period of time (this makes it far easier
				// to visualize and follow the movement of the mobile platform)
				Thread.sleep(MOVE_WAIT_PERIOD);
			} 
			catch (InterruptedException e) 
			{
				// Print the stack trace
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * This private helper function is used to actually compute the
	 * change in interpolation per intermediate step.  Note that this
	 * takes into account both the current speed as well as any progress
	 * that has already been made.
	 *  
	 * @param initialLocation The initial location (in coordinates) of the mobile platform
	 * @param finalLocation The desired final location (in coordinates) of the mobile platform
	 * @param currT The current interpolation progress
	 * @param speed The mobile platform's current speed
	 * @return The computed delta t, given all of the inputs
	 */
	private static double computeMoveDeltaTime(GVector initialLocation,
											   GVector finalLocation,
											   double currT,
											   double speed)
	{	
		// Determine the Euclidean distance between the start
		// and end points
		double euclideanDist = 0;
		
		// Go through all of the coordinates
		for (int i = 0; i < initialLocation.getSize(); i++)
		{
			// Determine the different between the initial and the final degree angle
			euclideanDist += Math.pow((finalLocation.getElement(i)
									   - initialLocation.getElement(i)), 2);
		}
		
		// Finish calculating the distance
		euclideanDist = Math.sqrt(euclideanDist);
		
		// Determine how much distance remains (as the speed, 
		// and hence the delta t, could change during movement)
		double remainingDist = Math.abs(1.0 - currT) * euclideanDist;
		
		// Figure out how many seconds it will take to travel the 
		// remaining distance, given the current speed
		double travelTime = remainingDist / speed;
		
		// Divide the time per step (in seconds) by the travel time
		// This is the amount of progress that should be made by each move step
		double deltaTime = (0.001 * MOVE_WAIT_PERIOD) / travelTime;
		
		// Return the delta t
		return deltaTime;
	}
	
	/**
	 * This private helper function is used to convert the given speed
	 * into one used by moveTo() (and its various helper functions.)
	 * @param currentSpeed The mobile platform's current speed
	 * @return The speed at which the platform is to move at.
	 */
	private static double calculateMoveToSpeed(double currentSpeed)
	{
		// Return the largest of either the linear speed or MOVE_TO_MIN_LIN_SPEED
		return Math.max(Math.abs(currentSpeed), MOVE_TO_MIN_LIN_SPEED);
	}
	
} //MobilePlatformSimulatedImpl

/**
 * This class is used to facilitate the movement of the
 * mobile platform, in cases other than moveTo().  In
 * particular, while there is a linear and velocity are
 * both not zero, it will move the platform, updating its
 * location and pose accordingly to reflect the movement. 
 */
class MobilePlatformSimulatedMoveJob extends Job
{
	/**
	 * This is the change in time (in seconds)
	 * between subsequent movement steps of the job
	 */
	private final static double DELTA_T = (((double)MobilePlatformSimulatedImpl.MOVE_WAIT_PERIOD) / 1000.0);

	/**
	 * This is the platform upon which the movement
	 * job is being performed.
	 */
	private MobilePlatformSimulatedImpl platform;
	
	/**
	 * This is the constructor for the MobilePlatformSimulatedMoveJob class
	 * and as such, it performs the required initialization operations.
	 * @param platform The platform which is to be moved
	 * @param name The name of the job (used by superclass)
	 */
	protected MobilePlatformSimulatedMoveJob(MobilePlatformSimulatedImpl platform,
											 String name)
	{
		// Call the superclass's constructor
		super(name);
		
		// Keep track of the appropriate platform
		this.platform = platform;
	}
	
	/**
	 * This is where the actually movement of the mobile platform
	 * takes place.  As long as one of the platform's linear or
	 * angular velocity is non-zero, the platform will move, updating
	 * its position and various other values accordingly.
	 * 
	 * @param monitor This has many uses but here it is primarily used to check for cancellation..
	 * @return The status of the job when it returned.
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor)
	{
		// While the job has not been cancelled.
		while (monitor.isCanceled() == false)
		{
			// Acquire the internal lock
			this.platform.lock.lock();
			
			// If there isn't a moveTo() command running
			// and either the platform's linear or angular
			// velocity is non-zero
			if ((this.platform.doingMoveTo == false) &&
				 ((this.platform.getLinearVelocity() != 0.0) ||
				  (this.platform.getAngularVelocity() != 0.0)))
			{
				// Perform the move

				// Extract the velocities
				double linVel = this.platform.getLinearVelocity();
				double angVel = this.platform.getAngularVelocity();
				
				// Get all the values which need to be updated
				double newX = this.platform.getPosition().getX();
				double newY = this.platform.getPosition().getY();
				double newTheta = this.platform.getPosition().getTheta();
				double newLeftWheelPos = this.platform.getLeftWheelPosition();
				double newRightWheelPos = this.platform.getRightWheelPosition();
				double newPosError = this.platform.getPositionError();

				// Computes distance traveled during time interval,
				// which is based on the linear velocity and DELTA_T
				double displacement = linVel * DELTA_T;

				// Add an offset to the positional error,
				// which is dependent on the displacement (m) and
				// ERROR_PER_METER
				newPosError = newPosError + (Math.abs(displacement) *
											 MobilePlatformSimulatedImpl.ERROR_PER_METER);
				
				// Add a rotation angle to the theta,
				// which is based on the angular velocity and DELTA_T
				newTheta = newTheta + (angVel * DELTA_T);

				// Calculate offsets for the X and Y coordinates,
				// which are based on the displacement and angle.
				// Add the offsets to the current coords.
				newX = newX + (displacement * Math.cos(newTheta));
				newY = newY + (displacement * Math.sin(newTheta));
				
				// Extract the linear velocities of the wheels
				double rightWheelVel = (angVel *
										 (MobilePlatformSimulatedImpl.WHEEL_TRACK / 2.0)) + linVel;
				double leftWheelVel = (2 * linVel) - rightWheelVel;

				// Get the wheels' angular velocities
				double rightWheelAngVel = (rightWheelVel / MobilePlatformSimulatedImpl.WHEEL_RADIUS);
				double leftWheelAngVel = (leftWheelVel / MobilePlatformSimulatedImpl.WHEEL_RADIUS);

				// Add a offset to the wheel positions,
				// which is dependent on the wheels' angular
				// velocities and DELTA_T 
				newLeftWheelPos = newLeftWheelPos + (DELTA_T * leftWheelAngVel);
				newRightWheelPos = newRightWheelPos + (DELTA_T * rightWheelAngVel);

				// Create a new position and populate it with new values
				Position newPosition = EMFEcoreExampleMobilePlatformFactory.eINSTANCE
						.createPosition();
				newPosition.setX(newX);
				newPosition.setY(newY);
				newPosition.setTheta(newTheta);
				
				// Update the platform with the new values 
				this.platform.setPosition(newPosition);
				this.platform.setPositionError(newPosError);
				this.platform.setLeftWheelPosition(newLeftWheelPos);
				this.platform.setRightWheelPosition(newRightWheelPos);
			}
			
			// Release the internal lock
			this.platform.lock.unlock();
			
			try
			{
				// Sleep for a short period of time (this makes it far easier
				// to visualize and follow the movement of the mobile platform)
				Thread.sleep(MobilePlatformSimulatedImpl.MOVE_WAIT_PERIOD);
			}
			catch (InterruptedException e)
			{
				// Print the stack trace
				e.printStackTrace();
			}
		}
		
		// Indicate that the job finished successfully
		return Status.OK_STATUS;
	}
}