/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.impl;

import java.text.DecimalFormat;

import javax.vecmath.GVector;
import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.math.GeometricUtils;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Activator;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderSimulated;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Position;
import ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehicleFactory;
import ca.gc.asc_csa.symphony.tools.vehicle.Thruster;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander Simulated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LanderSimulatedImpl extends LanderImpl implements LanderSimulated
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
	/**
	 * This constant defines the period of time (in milliseconds) to wait
	 * between sub-steps in the leg extension / retraction process.
	 * @see #extendLegs(GVector, GVector)
	 */
	protected static final int LEG_EXTEND_WAIT_PERIOD = 50;
	
	/**
	 * This constant defines the linear speed (in m/s) at which the
	 * leg extension / retraction process takes place.
	 * @see #extendLegs(GVector, GVector)
	 */
	protected static final double LEG_EXTEND_LINEAR_SPEED = 0.05;

	/**
	 * This constant defines the scale factor used when converting
	 * the values of LanderLegExtension into actual final leg positions
	 * @see #extendLegs(GVector, GVector) 
	 */
	protected static final double LEG_EXTEND_SCALE_FACTOR = 0.001;

	/**
	 * This constant defines the period of time (in milliseconds) to wait
	 * between sub-steps in the lander movement process.
	 * @see #move(GVector, GVector)
	 */
	protected static final int MOVE_TO_WAIT_PERIOD = 50;
	
	/**
	 * This constant defines the linear speed (in m/s) at which the
	 * lander movement takes place.
	 * @see #move(double, double, double)
	 */
	protected static final double MOVE_TO_LINEAR_SPEED = 5.0;
	// TODO FIXME: Is this actually a reasonable value?
	
	/**
	 * This constant defines the period of time (in milliseconds) to wait
	 * between sub-steps in the attitude adjustment process.
	 * @see #attitude(double, double, double, String)
	 * @see #alterAttitude(GVector, GVector)
	 */
	protected static final int CHANGE_ATTITUDE_WAIT_PERIOD = 50;
	
	/**
	 * This constant defines the angular velocity (in radians / second)
	 * at which the lander's attitude adjustments take place
	 * @see #attitude(double, double, double, String)
	 * @see #alterAttitude(GVector, GVector)
	 */
	protected static final double CHANGE_ATTITUDE_ANGULAR_SPEED = 5.0;
	
	/**
	 * This constant defines the mass (in kg) of the lander
	 * @see #startFlying(boolean)
	 * @see #getMass()
	 */
	protected static final double LANDER_MASS = 200.0;
	
	/**
	 * This constant defines the maximum thrust (in N) that
	 * the lander can generate.
	 * @see #startFlying(boolean)
	 * @see #getMaximumThrustLevel()
	 */
	protected static final double LANDER_MAX_THRUST = 3000.0;
	
	/**
	 * This constant defines an approximation of the gravitational
	 * pull of the Earth.
	 * @see #startFlying(boolean)
	 */
	protected static final double EARTH_GRAVITY = -9.81;
	
	/**
	 * This is the job which actually performs the flying simulation
	 * for the lander
	 * @see #LanderSimulatedFlyingJob
	 * @see #startFlying(boolean)
	 * @see #stopFlying()
	 */
	protected LanderSimulatedFlyingJob flyingSim;
	
	/**
	 * This is used to keep track of whether or not the lander is
	 * landing
	 */
	private boolean isLanding;
	
	/**
	 * This is the constructor for the LanderSimulatedImpl class
	 * and as such, it performs the required creation and
	 * initialization operations
	 * @generated_NOT
	 */
	protected LanderSimulatedImpl()
	{
		// Call the superclass's constructor
		super();
		
		// Create a job that can handle the flying simulation
		this.flyingSim = new LanderSimulatedFlyingJob(this, "Flying Simulator");
		
		// Initially, the lander is not landing
		this.isLanding = false;
	}
	
	/**
	 * This is the amount of force (in N) of gravity that is being
	 * imposed upon the lander.
	 * <p>
	 * Recall that that the gravitational force impose on an object
	 * (like a lander) in relation to a celestial body is affected by:
	 * <ul>
	 * 	 <li>the mass of the lander</li>
	 *   <li>the mass of the celestial body the lander is on / above</li>
	 *   <li>the distance between the lander and the body</li>
	 * </ul>
	 * @see #commandThrustLevel(double)
	 * @see #canFly()
	 * @return The amount of force (in N) subjected to the lander due to gravity
	 * @generated_NOT
	 */
	@Override
	public double getGravitationalPull()
	{
		// Determine how much gravitational pull is subjected to the lander 
		return LANDER_MASS * EARTH_GRAVITY;
	}

	/**
	 * This represents the mass of the lander (in kg).
	 * @return The mass of the lander (in kg).
	 * @generated_NOT
	 */
	@Override
	public double getMass()
	{
		// Just return the mass
		return LANDER_MASS;
	}
	
	/**
	 * This is a slightly different implementation of getPosition();
	 * what makes it different is that if the lander currently has no
	 * position associated with it, one will be created and assigned.
	 * 
	 * @return The position associated with the lander
	 * @generated_NOT
	 */
	@Override
	public Position getPosition()
	{
		// Call the superclass's version of the method
		Position position = super.getPosition();
		
		// If there is no position associated with the lander
		if (position == null)
		{
			// Create one
			position = EMFEcoreExampleLanderFactory.eINSTANCE.createPosition();
			
			// Create an attitude matrix for it
			Matrix3d newAttitude = new Matrix3d();
			newAttitude.setIdentity();
			
			// Assign it
			position.setAttitude(newAttitude);
			
			// Assign it to the lander
			this.setPosition(position);
		}

		// Return the lander's position
		return position;
	}
	
	/**
	 * This is a slightly different implementation of getThruster();
	 * what makes it different is that if the lander currently has no
	 * thruster associated with it, one will be created and assigned.
	 * 
	 * @return The thruster associated with the lander
	 * @generated_NOT 
	 */
	@Override
	public Thruster getThruster()
	{
		// Call the superclass's version of the method
		Thruster thruster = super.getThruster();
		
		// If there is no thruster associated with the lander
		if (thruster == null)
		{
			// Create one
			thruster = SymphonyToolsVehicleFactory.eINSTANCE.createThruster();
			
			// Initialize it accordingly
			thruster.setMinimumThrust(0);
			thruster.setCurrentThrust(0);
			thruster.setMaximumThrust(LANDER_MAX_THRUST);
			
			// Assign it to the lander
			this.setThruster(thruster);
		}
		
		// Return the lander's thruster
		return thruster;
	}
	
	/**
	 * This operation performs the steps required in order to
	 * initialize the lander.
	 * 
	 * @return Whether or not the lander was successfully initialized
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".init(): ";
		
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// Indicate it was unsuccessful
			return false;
		}
		// Else if the lander has already been initialized
		else if (this.isInitialized() == true)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Ignored; init() has already been successfully called.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			
			// Indicate that it was already successfully initialized
			return true;
		}
		// Otherwise, the lander hasn't been disposed and it hasn't been initialized yet
		else
		{
			// Perform the required initialization
			
			// Log this event
			String message = LOG_PREFIX +
								"The lander has been initialized.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate that it was successful initialized
			this.setInitialized(true);
			
			// Just return true
			return true;
		}
	}

	/**
	 * This operation is used to perform operations to cleanup the lander
	 * when it is no longer needed.
	 * @generated_NOT
	 */
	@Override
	public void dispose()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".dispose(): ";
		
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; dispose() has already been successfully called.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and handled by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, it hasn't been disposed of yet
		else
		{
			// Perform the necessary disposal actions
			
			// If the lander is currently flying
			if (this.isFlyingEnabled() == true)
			{
				// Disallow flying and terminate the flying simulation
				this.stopFlying();
			}
			
			// Indicate that the lander is now disposed and
			// hence, can no longer be used
			this.setDisposed(true);
			
			// Log this event
			String message = LOG_PREFIX +
								"The lander has been disposed and can no longer be used.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
	}

	/**
	 * This operation is used to update the lander's thrust level
	 * (which is given in newtons.)
	 * <p>
	 * Note: The thrust level is always bounded by
	 * 		 [thruster.getMinimumThrust(), thruster.getMaximumThrust()]
	 * 
	 * @param thrustLevel The lander's new thrust level (given in N)
	 * @generated_NOT
	 */
	@Override
	public void commandThrust(double thrustLevel)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".commandThrust(" + thrustLevel + "): ";
		
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Else if the lander hasn't been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Else if the lander currently isn't flying
		else if (this.isFlyingEnabled() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is currently not " +
								"permitted to fly - need to call startFlying() first.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Else if the thrust level is already at that given value
		else if (thrustLevel == this.getThruster().getCurrentThrust())
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the lander's current thrust level " +
								"matches the requested thrust.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander was initialized, hasn't been disposed
		// and it is different than before.
		else
		{
			// If the thrust level is less than the minimum thrust level
			if (thrustLevel < this.getThruster().getMinimumThrust())
			{
				// Log this event
				String message = LOG_PREFIX +
									"The thrust level (in N) cannot be greater than " +
									"the lander's minumum allowed thrust level (" +
									this.getThruster().getMinimumThrust() +
									") - using the minimum thrust level instead.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
				
				// Update the thrust level accordingly
				thrustLevel = this.getThruster().getMinimumThrust(); 
			}
			// Else if the thrust level is greater than the maximum thrust level
			else if (thrustLevel > this.getThruster().getMaximumThrust())
			{
				// Log this event
				String message = LOG_PREFIX + 
									"The thrust level (in N) cannot be greater than " +
									"the lander's maximum allowed thrust level (" +
									this.getThruster().getMaximumThrust() +
									") - using the maximum thrust level instead.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
				
				// Update the thrust level accordingly
				thrustLevel = this.getThruster().getMaximumThrust();
			}
			
			// Set the thrust level accordingly
			this.getThruster().setCurrentThrust(thrustLevel);
		}
	}
	
	/**
	 * This operation is used to change the lander's current thrust
	 * level by the specified (absolute) offset (which is given in
	 * newtons.)
	 * <p> 
	 * Note: The thrust level is always bounded by
	 * 		 [thruster.getMinimumThrust(), thruster.getMaximumThrust()]
	 * 
	 * @param thrustOffset The amount (in N) that the thrust level should be increased / decreased by.
	 * @generated_NOT 
	 */
	@Override
	public void changeThrustBy(double thrustOffset)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".changeThrustBy(" + thrustOffset + "): ";
				
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the lander hasn't been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander isn't permitted to fly
		else if (this.isFlyingEnabled() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is currently not " +
								"permitted to fly - need to call startFlying() first.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the thrust offset is zero
		else if (thrustOffset == 0.0)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the lander's thrust level will not changed by this offset.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander was initialized, it hadn't been disposed
		// and the offset will actually cause the thrust value to change
		else
		{
			// Calculate the effective thrust level
			// after applying the offset
			double newThrustLevel = this.getThruster().getCurrentThrust() + thrustOffset;
			
			// If the offset causes the thrust level to go below the minimum
			// thrust level
			if (newThrustLevel < this.getThruster().getMinimumThrust())
			{
				// Log this event
				String message = LOG_PREFIX + 
									"The given offset would cause the thrust to " +
									"go below the minimum allowed thrust level (" +
									this.getThruster().getMinimumThrust() +
									") - using the minimum thrust level instead.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
				
				// Update the thrust level accordingly
				newThrustLevel = this.getThruster().getMinimumThrust();
			}
			// Otherwise, if the offset causes the thrust level to above the
			// maximum allowed thrust level
			else if (newThrustLevel > this.getThruster().getMaximumThrust())
			{
				// Log this event
				String message = LOG_PREFIX +
									"The given offset would cause the thrust to " +
									"go above the maximum allowed thrust level (" +
									this.getThruster().getMaximumThrust() +
									") - using the maximum thrust level instead.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
				
				// Update the thrust level accordingly
				newThrustLevel = this.getThruster().getMaximumThrust();
			}
			
			// Set the thrust level accordingly
			this.getThruster().setCurrentThrust(newThrustLevel);
		}
	}

	/** 
	 * This operation is used to change the extension positions
	 * for each of the legs of the lander.  Note that extending or
	 * retracting the legs is a non-instantaneous process and it's
	 * likely it will take some period of time to move the lander's
	 * legs to the target positions.
	 * 
	 * @param legAExtension The new leg extension position for leg A.
	 * @param legBExtension The new leg extension position for leg B.
	 * @param legCExtension The new leg extension position for leg C.
	 * @generated_NOT
	 */
	@Override
	public void commandLegPosition(LanderLegExtension legAExtension,
								   LanderLegExtension legBExtension, 
								   LanderLegExtension legCExtension) 
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".commandLegPosition(LanderLegExtension." +
									legAExtension.getName() + ", LanderLegExtension." +
									legBExtension.getName() + ", LanderLegExtension." +
									legCExtension.getName() + "): ";
		
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and handled by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the lander hasn't been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and handled by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the lander's legs are already moving
		else if (this.isChangingLegs() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander's legs are currently in the " +
								"process of extending / retracting from a " +
								"previous commandLegPosition() call.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and handled by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the provided extension levels match the lander's
		// legs current extension levels
		else if ((this.getLegAExtension() == legAExtension) &&
				 (this.getLegBExtension() == legBExtension) &&
				 (this.getLegCExtension() == legCExtension))
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the lander's legs are already at the " +
								"given leg extension levels.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and handled by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander's legs are available to be reconfigured
		else
		{
			// Get a vector consisting of the current leg positions
			final GVector initialPosition = new GVector(new double[]{getLegAPosition(),
																	 getLegBPosition(),
																	 getLegCPosition()});
			
			// Get a vector defining the desired final leg extension positions
			final GVector finalPosition = new GVector(new double[]{legAExtension.getValue()*LEG_EXTEND_SCALE_FACTOR,
																   legBExtension.getValue()*LEG_EXTEND_SCALE_FACTOR,
																   legCExtension.getValue()*LEG_EXTEND_SCALE_FACTOR});
			
			// Indicate that the legs are moving
			this.setChangingLegs(true);
			
			// Log the start of the leg extension / retraction
			String message = LOG_PREFIX +
								"Lander leg extension / retraction started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Actually perform the leg extension / retraction
			this.extendLegs(initialPosition, finalPosition);

			// Due to numerical precision issues, the final positions
			// of the legs will be quite close to, but not exactly,
			// their actual position.  As the difference will be quite
			// small, just set them to their targeted values
			this.setLegAPosition(finalPosition.getElement(0));
			this.setLegBPosition(finalPosition.getElement(1));
			this.setLegCPosition(finalPosition.getElement(2));
			
			// Indicate that the legs have reached the target extension levels
			this.setLegAExtension(legAExtension);
			this.setLegBExtension(legBExtension);
			this.setLegCExtension(legCExtension);
			
			// Log the end of the leg extension / retraction
			message = LOG_PREFIX +
						"Lander leg extension / retraction complete.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate that the legs are no longer moving
			this.setChangingLegs(false);
		}
	}

	/**
	 * This operation is used to move the lander to the specified X, Y and
	 * Z coordinates.
	 * <p>
	 * Note 1: If the lander is not flying, the Z coordinate will be ignored;
	 * 		   the Z value will be determined by the lander's X and Y position.
	 * <p>
	 * Note 2: If the lander is flying, the Z coordinate will be used and the
	 * 		   typical flying behaviour will be disabled while the movement
	 * 		   is taking place.
	 *  
	 * @param x The lander's new desired X coordinate
	 * @param y The lander's new desired Y coordinate
	 * @param z The lander's new desired Z coordinate
	 * @generated_NOT
	 */
	@Override
	public void moveTo(double x, double y, double z)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveTo(" + x + ", " + y + ", " + z + "): ";
		
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander hasn't been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is already moving
		else if (this.isChangingLocation() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is currently in the process " +
								"of moving from a previous moveTo() call.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is currently landing
		else if (this.isLanding == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the landing is currently landing.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is already at the target coordinates
		else if ((this.getPosition().getX() == x) &&
				 (this.getPosition().getY() == y) &&
				 (this.getPosition().getZ() == z))
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the lander is already at the target coordinates.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander is ready to move to the given coordinates
		else
		{
			// Get the initial coordinates of the lander
			final GVector initialPosition = new GVector(new double[]{this.getPosition().getX(),
													   				 this.getPosition().getY(),
													   				 this.getPosition().getZ()});
			final GVector finalPosition;
			
			// If the lander is allowed to fly
			if (this.isFlyingEnabled() == true)
			{
				// As it can fly, use the Z coordinate.
				
				// Get the final coordinates of the lander
				finalPosition = new GVector(new double[]{x, y, z});
			}
			// Otherwise, the lander is not permitted to fly
			else
			{
				// It can't fly, so just ignore the Z coordinate.
				
				// Get the final coordinates of the lander, using current value for Z
				finalPosition = new GVector(new double[]{x, y, this.getPosition().getZ()});
				
				// Log that the Z coordinate is being ignored here
				String message = LOG_PREFIX +
									"Z coordinate ignored; the lander is not allowed to fly " + 
									"so cannot explicitly change Z coordinate.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			}
			
			// Indicate that the lander's movement to new coordinates is starting
			this.setChangingLocation(true);
			
			// Log that the lander is moving to the specified coordinates
			String message = LOG_PREFIX + "Lander move started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Actually trigger the move
			this.move(initialPosition, finalPosition);
			
			// Log that the lander has completed the move to the given coordinates
			message = LOG_PREFIX + "Lander move completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate that the lander's movement is complete
			this.setChangingLocation(false);
		}
	}

	/**
	 * This operation is used to change the lander's attitude /
	 * orientation to the specified angles.
	 * 
	 * @param xAngle The lander's new angle of rotation (in radians) around the X axis
	 * @param yAngle The lander's new angle of rotation (in radians) around the Y axis
	 * @param zAngle The lander's new angle of rotation (in radians) around the Z axis
	 * @generated_NOT
	 */
	@Override
	public void changeAttitude(double xAngle, double yAngle, double zAngle)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".changeAttitude(" + Math.toDegrees(xAngle) +
									DEGREE_SYM + ", " +	Math.toDegrees(yAngle) +
									DEGREE_SYM +", " + Math.toDegrees(zAngle) +
									DEGREE_SYM + "): ";
		
		// Just call the helper function to implement this, passing in
		// the given target angles
		this.attitude(xAngle, yAngle, zAngle, LOG_PREFIX);
	}

	/**
	 * This operation is used to reset the lander's attitude /
	 * position to its initial state, namely where there is no
	 * rotation from any of the primary axes (X, Y, Z).
	 * @generated_NOT
	 */
	@Override
	public void resetAttitude()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".resetAttitude(): ";
		
		// Just call the helper function (with a rotation of 0 on all
		// primary axes) to facilitate the attitude adjustment
		this.attitude(0.0, 0.0, 0.0, LOG_PREFIX);
	}
	
	/**
	 * This operation is used to update the both the lander's
	 * X and Y angular velocities (in radians per second.)
	 * <p>
	 * Note 1: These velocities are only used while the lander
	 * 		   is flying; while not flying, changing these values
	 *         will have no effect.
	 * <p>
	 * Note 2: Unlike the traditional definition of angular velocity
	 *         as a vector, this is simply a signed scalar; a positive
	 *         value is the rotation in the counter-clockwise direction
	 *         while a negative value implies the rotation is in the
	 *         clockwise direction.  Zero means there is no rotation.
	 *         
	 * @param xAngularVelocity The new X angular velocity for the lander (given in radians / second)
	 * @param yAngularVelocity The new Y angular velocity for the lander (given in radians / second)
	 * @generated_NOT
	 */
	@Override
	public void commandAngularVelocities(double xAngularVelocity,
										 double yAngularVelocity) 
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".commandAngularVelocities(" +
									xAngularVelocity + " (" + DEGREE_SYM +
									"/s), " + yAngularVelocity + " (" +
									DEGREE_SYM + "/s)): ";
		
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise if the lander hasn't been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the given angles match the lander's current angular
		// velocities.
		else if ((xAngularVelocity == this.getXAngularVelocity()) &&
				 (yAngularVelocity == this.getYAngularVelocity()))
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the lander's current angular velocities " +
								" match the velocities given.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander is setup, still usable and the velocities are different
		else
		{				
			// Just set the angular velocity for both the X and Y directions accordingly
			this.setXAngularVelocity(xAngularVelocity);
			this.setYAngularVelocity(yAngularVelocity);
		}
	}
	
	/**
	 * This operation is used to permit the lander to start flying.
	 * <p>
	 * Whether or not the lander is able to actually fly is dependent on
	 * the mass of the lander, the lander's current thrust and the gravity
	 * being used (e.g. the Earth's gravity, g ~= -9.81); there may
	 * potentially be other factors as well.
	 * 
	 * @param logStateChanges Whether or not to log the state changes that occur because it has started flying
	 * @see #canFly()
	 * @see #stopFlying()
	 * @generated_NOT
	 */
	@Override
	public void startFlying(boolean logStateChanges)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".startFlying(" + logStateChanges + "): "; 
		
		// If the lander was already disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX + 
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is not initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is landing
		else if (this.isLanding == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the landing is currently landing.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is already flying
		else if (this.isFlyingEnabled() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the lander is already permitted to fly / flying.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander is ready to start flying
		else
		{
			// Log this event
			String message = LOG_PREFIX +
								"The lander is now allowed to fly " +
								"and depending on the thrust, will do so.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Update whether or not the simulation should be logging events
			this.flyingSim.shouldLog(logStateChanges);
		
			// Schedule the flying simulation to start running
			this.flyingSim.schedule();
			
			// Indicate that the lander can now fly
			this.setFlyingEnabled(true);
		}
	}

	/**
	 * This operation is used to indicate that the lander is no longer
	 * allowed to fly and should stop doing so; it may need to perform
	 * actions to land the lander.
	 * 
	 * @see #canFly() 
	 * @see #startFlying(boolean)
	 * @generated_NOT
	 */
	@Override
	public void stopFlying()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".stopFlying(): ";
		
		// If the lander was already disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is not initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is landing
		else if (this.isLanding == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is currently landing.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is not flying
		else if (this.isFlyingEnabled() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; the lander is currently not flying.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander is ready to stop flying
		else
		{
			// Log this event
			String message = LOG_PREFIX +
								"The lander is no longer permitted to fly and " +
								"if it actually is flying, it will need to land.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate that the lander is landing (e.g. falling)
			this.isLanding = true;
			
			// Set the thrust level to 0
			this.getThruster().setCurrentThrust(0);
			
			// Cancel the flying simulation
			this.flyingSim.cancel();
			
			// Indicate that flying is no longer allowed to fly
			this.setFlyingEnabled(false);
			
			// While the lander hasn't hit the ground
			while (this.getPosition().getZ() > LanderSimulatedFlyingJob.GROUND_Z)
			{
				// If a movement is already taking place
				while (this.isChangingLocation() == true)
				{
					try
					{
						// Wait a short period of time
						Thread.sleep(MOVE_TO_WAIT_PERIOD);
					}
					catch (InterruptedException ex)
					{
						// Just print the stack trace
						ex.printStackTrace();
					}
				}
			}
			
			// Indicate that the lander is landed
			this.isLanding = false;
			
			// Log this event
			message = LOG_PREFIX +
						"The lander has successfully landed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
	}

	/**
	 * This helper function is used to actually perform the extension /
	 * retraction of the lander's legs; in the end, each of the leg's
	 * extension position should match its specified final position.
	 * 
	 * @param initialPosition The initial positions for the lander's legs
	 * @param finalPosition The final / desired positions for the lander's legs
	 * @see #commandLegPosition(LanderLegExtension, LanderLegExtension, LanderLegExtension, LanderLegExtension)
	 * @see #computeLegExtendDeltaTime(GVector, GVector)
	 */
	private void extendLegs(final GVector initialPosition, final GVector finalPosition)
	{
		// Used to keep track of the current leg positions during the interpolation
		GVector interpolatedLegPositions = new GVector(initialPosition);

		// Calculate the delta t, the amount to change the interpolation every
		// leg extension / retraction sub-step
		double deltaT = computeDeltaTime(initialPosition,
									     finalPosition,
										 LEG_EXTEND_LINEAR_SPEED,
										 LEG_EXTEND_WAIT_PERIOD);
		
		// Keep track of the current interpolation process
		double t = -deltaT;			

		// While not at the final leg position
		// and the lander hasn't been disposed
		while ((t <= 1.0) &&
			   (this.isDisposed() == false))
		{
			// Advanced the interpolation by one step
			t += deltaT;

			// Interpolates the current leg position (Recall that t=0 is the initial
			// leg position vector while t=1 is the final / desired leg position vector
			interpolatedLegPositions.interpolate(initialPosition, finalPosition, t);					

			// Updates the position for all of the legs
			this.setLegAPosition(interpolatedLegPositions.getElement(0));
			this.setLegBPosition(interpolatedLegPositions.getElement(1));
			this.setLegCPosition(interpolatedLegPositions.getElement(2));

			// Need a bit of a hack here in order to keep the position
			// updated; this is required in order to trigger the
			// pose corrector.  This will allow the position to
			// be adjusted appropriately (if it needs to be)
			Position newPosition = EMFEcoreExampleLanderFactory.eINSTANCE.createPosition();
			newPosition.setAttitude(this.getPosition().getAttitude());
			newPosition.setX(this.getPosition().getX());
			newPosition.setY(this.getPosition().getY());
			newPosition.setZ(this.getPosition().getZ());
			this.setPosition(newPosition);

			try 
			{
				// Sleep for a short period of time; this makes it far
				// easier to visualize and follow the extension / retraction
				// of the lander's legs
				Thread.sleep(LEG_EXTEND_WAIT_PERIOD);
			} 
			catch (InterruptedException e) 
			{
				// Print out the stack trace
				e.printStackTrace();
			}
		}	
	}
	
	
	/**
	 * This helper function is used to actually perform the
	 * movement of the lander from the lander's current location
	 * to the desired coordinates.
	 * 
	 * @param initialPosition The initial coordinates of the lander
	 * @param finalPosition The desired final coordinates for the lander
	 */
	private void move(final GVector initialPosition, final GVector finalPosition)
	{
		// Used to keep track of the lander's position during the interpolation
		GVector interpolatedPosition = new GVector(initialPosition);

		// Calculate the delta t, the amount to change the interpolation
		// every movement sub-step
		double deltaT = computeMoveDeltaTime(initialPosition,
										 	 finalPosition,
										 	 MOVE_TO_LINEAR_SPEED,
										 	 MOVE_TO_WAIT_PERIOD);
		
		// Keep track of the current interpolation process
		double t = -deltaT;

		// While not at the final position and
		// the lander hasn't been disposed
		while ((t <= 1.0) &&
			   (this.isDisposed() == false))
		{
			// Advance the interpolation by one step
			t += deltaT;

			// Interpolates the current position of the lander (Recall that t=0
			// is the initial lander coordinates while t=1 is the desired (i.e.
			// final) lander coordinates
			interpolatedPosition.interpolate(initialPosition, finalPosition, t);					

			// Create a new position object and update its values accordingly
			// Note: This triggers the pose corrector, which if enabled, may
			//       cause the position to be further refined and updated.
			Position newPosition = EMFEcoreExampleLanderFactory.eINSTANCE.createPosition();
			newPosition.setAttitude(this.getPosition().getAttitude());
			newPosition.setX(interpolatedPosition.getElement(0));
			newPosition.setY(interpolatedPosition.getElement(1));
			newPosition.setZ(interpolatedPosition.getElement(2));
			this.setPosition(newPosition);					

			try 
			{
				// Sleep for a short period of time; this makes it far
				// easier to visualize and follow the movement of the
				// lander
				Thread.sleep(MOVE_TO_WAIT_PERIOD);
			} 
			catch (InterruptedException e) 
			{
				// Print out the stack trace
				e.printStackTrace();
			}
		}				
	} 

	/**
	 * This private helper function is used to actually implement the change in
	 * attitude from the current orientation to the orientation described by the
	 * provided angles.
	 * @param finalXAngle The lander's desired final rotation about the X axis (in radians) 
	 * @param finalYAngle The lander's desired final rotation about the Y axis (in radians)
	 * @param finalZAngle The lander's desired final rotation about the Z axis (in radians)
	 * @param LOG_PREFIX A string used to facilitate and generalize logging
	 */
	private void attitude(double finalXAngle,
						  double finalYAngle,
						  double finalZAngle,
						  final String LOG_PREFIX)
	{
		// If the lander has already been disposed
		if (this.isDisposed() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander has already been disposed (with dispose()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander hasn't been initialized
		else if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is not initialized (with init()).";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is currently landing
		else if (this.isLanding == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is currently landing.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the lander is already changing its attitude
		else if (this.isChangingAttitude() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the lander is currently in the " +
								"process of moving from a previous changeAttitde() " +
								"or resetAttitude() call.";
			
			// Throw an exception to indicate the failure of the operation; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the lander is ready to have its attitude adjusted
		else
		{
			// Get the lander's current attitude matrix
			Matrix3d currAttitude = this.getPosition().getAttitude();
			
			// Extract the Euler angles from the attitude matrix
			// Note: The returned angles are NOT unique solutions
			Vector3d currAngles = GeometricUtils.extractRotationFromXYZRotMatrix(currAttitude);
		
			// Generate the initial and target vectors
			GVector initialAttitude = new GVector(new double[]{currAngles.getX(),
															   currAngles.getY(),
															   currAngles.getZ()});
		
			GVector finalAttitude = new GVector(new double[]{finalXAngle,
															 finalYAngle,
															 finalZAngle});
		
			// Indicate that the attitude is being adjusted
			this.setChangingAttitude(true);
		
			// Log the start of the lander's attitude adjustment
			String message = LOG_PREFIX + "Lander attitude change started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
			// Trigger the change in attitude
			this.alterAttitude(initialAttitude, finalAttitude);
			
			// If the goal is to reset the attitude
			if ((finalXAngle == 0.0) &&
				(finalYAngle == 0.0) &&
				(finalZAngle == 0.0))
			{
				// The angles should be sufficiently close to 0 but they probably
				// aren't zero (due to numerical issues), so set all of the angles
				// to zero
				this.getPosition().getAttitude().setIdentity();
			}
			
			// Log the end of the lander's attitude adjustment
			message = LOG_PREFIX + "Lander attitude change complete.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Indicate that the attitude is not longer being adjusted
			this.setChangingAttitude(false);
		} 
	}
	
	/**
	 * This helper function is used to actual perform the
	 * rotations required to change the lander's attitude /
	 * orientation to the desired state.
	 * @param initialAttitude The initial attitude of the lander
	 * @param finalAttitude The desired final attitude of the lander
	 */
	private void alterAttitude(final GVector initialAttitude,
							   final GVector finalAttitude)
	{
		// Used to keep track of the lander's attitude during
		// the interpolation
		GVector interpolatedAttitude = new GVector(initialAttitude);
		
		// Calculate the delta t, the amount to change the interpolation
		// every attitude adjustment sub-step
		double deltaT = computeDeltaTime(initialAttitude,
										 finalAttitude,
										 CHANGE_ATTITUDE_ANGULAR_SPEED,
										 CHANGE_ATTITUDE_WAIT_PERIOD);	
		
		// Used to keep track of the current interpolation process
		double t = -deltaT;
		
		// While not at the final position and
		// the lander hasn't been disposed
		while ((t <= 1.0) &&
			   (this.isDisposed() == false))
		{
			// Advance the interpolation by one step
			t += deltaT;

			// Interpolates the current attitude of the lander (Recall that t=0
			// is the initial lander attitude while t=1 is the desired (i.e.
			// final) lander attitude
			interpolatedAttitude.interpolate(initialAttitude, finalAttitude, t);					
			
			// Create the require single rotation matrices
			Matrix3d xRot = new Matrix3d();
			xRot.setIdentity();
			xRot.rotX(interpolatedAttitude.getElement(0));
			
			Matrix3d yRot = new Matrix3d();
			yRot.setIdentity();
			yRot.rotY(interpolatedAttitude.getElement(1));
			
			Matrix3d zRot = new Matrix3d();
			yRot.setIdentity();
			zRot.rotZ(interpolatedAttitude.getElement(2));
			
			// Create the attitude (i.e. rotation) matrix
			Matrix3d newAttitude = new Matrix3d();
			newAttitude.setIdentity();
			newAttitude.mul(zRot);
			newAttitude.mul(yRot);
			newAttitude.mul(xRot);
			
			// Create a new position object and update its values accordingly
			// Note: This triggers the pose corrector, which if enabled, may
			//       cause the position to be further refined and updated.
			Position newPosition = EMFEcoreExampleLanderFactory.eINSTANCE.createPosition();
			newPosition.setAttitude(newAttitude);
			newPosition.setX(this.getPosition().getX());
			newPosition.setY(this.getPosition().getY());
			newPosition.setZ(this.getPosition().getZ());
			this.setPosition(newPosition);			

			try 
			{
				// Sleep for a short period of time; this makes it far
				// easier to visualize and follow the lander's
				// attitude adjustment.
				Thread.sleep(CHANGE_ATTITUDE_WAIT_PERIOD);
			} 
			catch (InterruptedException e) 
			{
				// Print out the stack trace
				e.printStackTrace();
			}
		}	
	}
	
	/**
	 * This helper function is used to determine the change in time (delta t) for each step
	 * when determining the current interpolation from the initial position vector to the
	 * final (i.e. desired) position vector.
	 *  
	 * @param initialPosition A vector with the initial position
	 * @param finalPosition A vector with the final (i.e. desired) position
	 * @param moveSpeed A speed (either linear or angular) detailing how much movement occurs in a second.
	 * @param delayPerStep The amount of time (in milliseconds) between each of the interpolation steps 
	 * @return The change in time (delta t) required for each time step of the lander movement process.
	 * @see #extendLegs(GVector, GVector)
	 */
	private static double computeDeltaTime(GVector initialPosition,
										   GVector finalPosition,
										   double moveSpeed,
										   int delayPerStep)
	{
		// Used to keep track of the largest difference in position
		double largestMove = 0.0;
		
		// Go through all of the pairs of coordinate values
		for (int i = 0; i < initialPosition.getSize(); i++)
		{
			// Determine the difference between the start and the final coordinate
			double move = Math.abs(finalPosition.getElement(i) -
								   initialPosition.getElement(i));
			
			// If this difference is larger than the current max 
			if(move > largestMove)
			{
				// Update it accordingly
				largestMove = move;
			}
		}

		// Determine the time (in seconds) it will take
		// to extend / retract all of the legs
		double extensionTime = largestMove / moveSpeed;
		
		// Calculate the delta t; that is, how much to change the interpolation
		// by for each sub-step of the leg extension / retraction process.
		double deltaTime = (delayPerStep * 0.001) / extensionTime;
		
		// Return the delta t
		return deltaTime;
	}
	
	/**
	 * This helper function is used to determine the change in time (delta t) for each step
	 * when determining the current movement interpolation from the initial position vector to
	 * to the final (i.e. desired) position vector.  As the coordinates are not independent
	 * of each other, the calculation involved is slightly different.
	 * 
	 * @param initialPosition A vector with the initial position
	 * @param finalPosition A vector with the final (i.e. desired) position
	 * @param moveSpeed A speed detailing how much movement occurs in a second.
	 * @param delayPerStep The amount of time (in milliseconds) between each of the interpolated steps
	 * @return The change in time (delta t) required for each time step of the interpolation process.
	 * @see #move(GVector, GVector)
	 */
	private static double computeMoveDeltaTime(GVector initialPosition,
											   GVector finalPosition,
											   double moveSpeed,
											   int delayPerStep)
	{
		// The Euclidean distance between the starting and ending position
		double euclideanDist = 0.0;
		
		// Go through all of the pairs of coordinate values
		for (int i = 0; i < initialPosition.getSize(); i++)
		{
			// Take the difference of those coordinates and square it
			euclideanDist += Math.pow((finalPosition.getElement(i) -
								   	   initialPosition.getElement(i)), 2);
		}
		
		// Finish off the Euclidean calculation
		euclideanDist = Math.sqrt(euclideanDist);

		// Determine the time (in seconds) it will take
		// to extend / retract all of the legs
		double extensionTime = euclideanDist / moveSpeed;
		
		// Calculate the delta t; that is, how much to change the interpolation
		// by for each sub-step of the leg extension / retraction process.
		double deltaTime = (delayPerStep * 0.001) / extensionTime;
		
		// Return the delta t
		return deltaTime;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleLanderPackage.Literals.LANDER_SIMULATED;
	}

} //LanderSimulatedImpl

/**
 * This class is used to implement a simulation of what
 * would happen when the lander is allowed to fly; the
 * critical factor is whether the thrust level is sufficient
 * to overcome the pull of gravity.
 * @see #getHoveringThrust()
 */
final class LanderSimulatedFlyingJob extends Job
{
	/**
	 * This is the output format for numbers
	 */
	private static final DecimalFormat decimalFormat = new DecimalFormat("#####0.000"); 
	
	/**
	 * This is the amount of time to wait (in milliseconds) between
	 * simulation updates
	 * @see #run(IProgressMonitor)
	 */
	private static final int SIMULATION_WAIT_PERIOD = 50;
	
	/**
	 * This is the total lowest that the lander will be allowed to fly;
	 * this prevents the lander from simply falling forever through the ground.
	 */
	static final double GROUND_Z = 0.0;
	
	/**
	 * This is the lander, upon which, the flying simulation
	 * is being carried out.
	 */
	private LanderSimulatedImpl lander;
	
	/**
	 * This controls whether the simulation should output logging
	 * information about the changes to the lander's state and other
	 * useful information. 
	 */
	private boolean shouldLog;
	
	/**
	 * This is the constructor for the LanderSimulatedFlyingJob class
	 * and as such, it performs the required initialization and
	 * creation actions.
	 * @param lander The lander upon which the simulation is being run
	 * @param jobName The name of this job
	 */
	public LanderSimulatedFlyingJob(LanderSimulatedImpl lander, String jobName)
	{
		// Call the superclass's constructor
		super(jobName);
		
		// Keep track of the lander
		this.lander = lander;
		
		// Initially, indicate that logging shouldn't be taking place
		this.shouldLog = false;
	}
	
	/**
	 * This is used to indicate that the flying simulation should
	 * turn logging on or off.
	 */
	public void shouldLog(boolean logStateChanges)
	{
		// Indicate that the simulation should be logged accordingly
		this.shouldLog = logStateChanges;
	}
	
	/**
	 * This is the main workhorse of the flying simulation job,
	 * actually performing the simulation
	 * @param monitor Used to keep track of the state of the job
	 * @return The status of the job when it stopped running.
	 */
	@Override
	protected IStatus run(final IProgressMonitor monitor) 
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".run(): ";
		
		// Keep track of the last time that the simulation was updated
		long lastTime = -1;
		
		// Keep track of the lander's previous velocities
		Vector3d previousVelocity = new Vector3d();
		
		// If the simulation should be logged
		if (this.shouldLog == true)
		{
			// Log the start of the simulation
			String message = LOG_PREFIX +
								"The lander's flying simulation has started";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
		
		// While the flight simulation hasn't been cancelled
		while ((monitor.isCanceled() == false) ||
			   (lander.getPosition().getZ() > GROUND_Z))
		{
			// If this is the first time through the simulation
			if (lastTime < 0)
			{
				// Just get the current time
				lastTime = System.currentTimeMillis();
			}
			// Otherwise, the simulation's looped at least once
			// and the lander is not explicitly moving or rotating
			else if ((lander.isChangingAttitude() == false) &&
					 (lander.isChangingLocation() == false))
			{
				// Get the current time
				long currentTime = System.currentTimeMillis();

				// Determine the change in time (in seconds)
				// between the current simulation loop and the last
				double deltaT = ((double)(currentTime - lastTime)) * 0.001;

				// Get a copy of the current lander coordinates and attitude
				Vector3d newCoords = new Vector3d(lander.getPosition().getX(),
												  lander.getPosition().getY(),
												  lander.getPosition().getZ());
				Matrix3d newAttitude = new Matrix3d(lander.getPosition().getAttitude());

				// Calculate the net forces on the lander
				Vector3d thrust = new Vector3d(0, 0, lander.getThruster().getCurrentThrust());
				newAttitude.transform(thrust);					  
				Vector3d gravity = new Vector3d(0, 0, lander.getGravitationalPull());

				// Calculate the acceleration
				Vector3d acceleration = new Vector3d(thrust);					  
				acceleration.add(gravity);
				acceleration.scale(1.0 / lander.getMass());

				Vector3d deltaV = new Vector3d(acceleration);
				deltaV.scale(deltaT);					 				  

				// Calculate the new velocity
				Vector3d newVelocity = new Vector3d(previousVelocity);
				newVelocity.add(deltaV);

				// Update previous velocity
				previousVelocity = newVelocity;

				// Calculate the new displacement and lander's position
				Vector3d displacement = new Vector3d(newVelocity);
				displacement.scale(0.5 * deltaT);

				newCoords.add(displacement);
				
				// If the new position would go below the ground's Z value
				// Note: this prevents the lander from simply falling endlessly
				//       through the terrain
				if (newCoords.getZ() < GROUND_Z)
				{
					// If the lander should be logging
					if (this.shouldLog == true)
					{
						// Log this event
						String message = LOG_PREFIX +
											"The calculated Z value (" +
											decimalFormat.format(newCoords.getZ()) + 
											") is less than the minimum allowed Z value (" +
											decimalFormat.format(GROUND_Z) + "); using the " +
											"minimum allowed Z value instead.";
						Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
					}
					
					// Set it to the ground's Z value instead
					newCoords.setZ(GROUND_Z);
					
					// Set the Z Velocity to 0
					newVelocity.setZ(0.0);
				}
				
				// Determine the rotation (in radians) in the X axis 
				Matrix3d xRot = new Matrix3d();
				xRot.setIdentity();
				xRot.rotX(lander.getXAngularVelocity() * deltaT);

				// Determine the rotation (in radians) in the Y axis
				Matrix3d yRot = new Matrix3d();
				yRot.setIdentity();
				yRot.rotY(lander.getYAngularVelocity() * deltaT);
				
				// Apply the X and Y rotations to the lander
				newAttitude.mul(xRot);
				newAttitude.mul(yRot);		  

				// Update the lander's coordinates and attitude
				Position newPosition = EMFEcoreExampleLanderFactory.eINSTANCE.createPosition();
				newPosition.setX(newCoords.getX());
				newPosition.setY(newCoords.getY());
				newPosition.setZ(newCoords.getZ());
				newPosition.setAttitude(newAttitude);
				lander.setPosition(newPosition);
				
				// Update the last time through the simulation
				lastTime = currentTime;
				
				// If the lander should be logging
				if (this.shouldLog == true)
				{
					// Log the lander's current state
					// including its acceleration, velocity and position
					String message = LOG_PREFIX +
										"Lander State Update";
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
					
					message = LOG_PREFIX +
								"Current Acceleration (in m/s^2): X=" +
								decimalFormat.format(acceleration.getX()) + ", Y=" +
								decimalFormat.format(acceleration.getY()) + ", Z=" +
								decimalFormat.format(acceleration.getZ());
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
					
					message = LOG_PREFIX +
								"Current Velocity (in m/s): X=" +
								 decimalFormat.format(newVelocity.getX()) + ", Y=" +
								 decimalFormat.format(newVelocity.getY()) + ", Z=" +
								 decimalFormat.format(newVelocity.getZ());
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
					
					message = LOG_PREFIX +
								"Current Position (in m): X=" +
								decimalFormat.format(newPosition.getX()) + ", Y=" +
								decimalFormat.format(newPosition.getY()) + ", Z=" +
								decimalFormat.format(newPosition.getZ());
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
				}
			}
			
			try 
			{
				// Sleep for a short period of time;
				// this makes it easier to visualize the
				// changes in the lander's position
				Thread.sleep(SIMULATION_WAIT_PERIOD);
			} 
			catch (InterruptedException ex) 
			{
				// Print out the stack trace
				ex.printStackTrace();
			}
		}

		// If the simulation should be logged
		if (this.shouldLog == true)
		{
			// Log the end of the simulation
			String message = LOG_PREFIX +
								"The lander's flying simulation has completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
		
		// Indicate that the job ran successfully
		return Status.OK_STATUS;
	}
}