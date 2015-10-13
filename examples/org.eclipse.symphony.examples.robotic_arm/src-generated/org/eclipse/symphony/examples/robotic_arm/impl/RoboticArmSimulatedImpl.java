/**
   * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.impl;

import javax.vecmath.GVector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.examples.robotic_arm.Activator;
import org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel;
import org.eclipse.symphony.examples.robotic_arm.RoboticArmSimulated;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Robotic Arm Simulated</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class RoboticArmSimulatedImpl extends RoboticArmImpl
									 implements RoboticArmSimulated
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
	/**
	 * Defines the angular speed (in °/s) at which the joints
	 * of the robotic arm move.
	 * <p>
	 * Note: The final angular move speed is also affected by
	 * the current MoveSpeedLevel
	 * @see #cmdMoveSpeedLevel(MoveSpeedLevel)
	 * @see #computeDeltaTime(GVector, GVector)
	 */
	private static final double MOVE_TO_ANGULAR_SPEED = 10.0;
	
	/**
	 * Defines the time period (in milliseconds) that this
	 * thread sleeps between subsequent intermediate move steps.
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	private static final int MOVE_TO_WAIT_PERIOD = 50;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RoboticArmSimulatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM_SIMULATED;
	}

	/**
	 * Performs the required operations required in order to initialize
	 * the robotic arm.
	 * @return Whether or not the robotic arm was successfully initialized.
	 */
	@Override
	public boolean init()
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".init(): ";
		
		// If the arm was initialized already
		if (this.isInitialized() == true)
		{
			// Log this fact
			String message = LOG_PREFIX +
								"Ignored; init() has already been successfully called.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			
			// It was already successfully initialized
			return true;
		}
		// Otherwise, the arm wasn't initialized
		else
		{
			// Indicate that the initialization of the arm is taking place
			String message = LOG_PREFIX + "The robotic arm has been initialized.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
			
			// Indicate that the simulated robotic arm is now initialized
			this.setInitialized(true);
			
			// No real initialization needs to be done here; just return true
			return true;
		}
	}
	
	/** 
	 * Changes the level of speed at which the robotic arm should move; this
	 * is likely to be used by both moveTo() and stow() as they both involve
	 * moving the arm.
	 * @param speedLevel The new move speed level, indicating how fast the arm should move.
	 */
	public void cmdMoveSpeedLevel(MoveSpeedLevel speedLevel)
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
							 		".cmdMoveSpeedLevel(MoveSpeedLevel." + 
							 		speedLevel.getName() + "): ";
		
		//  If the arm wasn't successfully initialized
		if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected: the robotic arm has not been initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, it was initialized correctly
		else
		{
			// Indicate that the movement speed level is being changed
			String message = LOG_PREFIX + "Updating the robotic arm's move speed level.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
			// Call the appropriate set method
			setSpeed(speedLevel);
			
			// If the arm is already moving
			if (this.isArmMoving() == true)
			{
				// Log that it's already moving
				message = LOG_PREFIX +
							"Note that the updated move speed level applies to " +
							"all future move requests, NOT the current one.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			}
		}
	}
	
	/**
	 * Initiates the motion of the arm and move the arm to the specified configuration.
	 * @param turretAngle The expected angle (in radians) of the turret joint (joint 1) after moving
	 * @param shoulderAngle The expected angle (in radians) of the shoulder joint (joint 2) after moving.
	 * @param elbowAngle The expected angle (in radians) of the elbow joint (joint 3) after moving.
	 * @param wristAngle The expected angle (in radians) of the wrist joint (joint 4) after moving.
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	@Override
	public void moveTo(double turretAngle, double shoulderAngle, double elbowAngle, double wristAngle) 
	{
		// Convert the angles to degrees
		turretAngle = Math.toDegrees(turretAngle);
		shoulderAngle = Math.toDegrees(shoulderAngle);
		elbowAngle = Math.toDegrees(elbowAngle);
		wristAngle = Math.toDegrees(wristAngle);
		
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveTo(" + turretAngle + DEGREE_SYM + ", " +
									shoulderAngle + DEGREE_SYM + ", " +
									elbowAngle + DEGREE_SYM + ", " +
									wristAngle + DEGREE_SYM + "): ";
				
		// If the robotic arm wasn't initialized
		if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the robotic arm has not been initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the robotic arm is already in the midst of
		// another move request
		else if (this.isArmMoving() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the robotic arm is currently " +
								"in the midst of another move request.";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the robotic arm's current joint angles are the same as
		// those that the robotic arm is supposed to move to
		else if ((this.getTurretAngle() == turretAngle) &&
				 (this.getShoulderAngle() == shoulderAngle) &&
				 (this.getElbowAngle() == elbowAngle) &&
				 (this.getWristAngle() == wristAngle))
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Ignored; no move required as given angles match " +
								"arm's current joint configuration.";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the arm was both initialized, enabled and needs to move
		else
		{
			// Indicate that the moving of the robotic arm to a new configuration is starting
			String message = LOG_PREFIX + "Robotic arm move started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Indicate that the arm is moving
			this.setArmMoving(true);
			
			// Get the current joint configuration
			final GVector initialJointsValues = new GVector(new double[] {getTurretAngle(),
																		  getShoulderAngle(),
																		  getElbowAngle(),
																		  getWristAngle()});
			
			// Get the target joint configuration (note the conversion to degrees)
			final GVector finalJointsValues = new GVector(new double[] {turretAngle,
																	    shoulderAngle,
																	    elbowAngle,
																	    wristAngle});
			
			// Move the arm to the target configuration
			moveToConfiguration(initialJointsValues, finalJointsValues);
			
			// Indicate that the arm has completed moving
			this.setArmMoving(false);
			
			// Indicate that the moving of the arm is now complete
			message = LOG_PREFIX + "Robotic arm move completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
	}

	/**
	 * Initiates the motion of the arm and moves the arm to the stow configuration.
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	@Override
	public void stow() 
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() + ".stow(): ";
		
		// If the robotic arm wasn't initialized
		if (this.isInitialized() == false)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the robotic arm has not been initialized (with init()).";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the robotic arm is already moving
		else if (this.isArmMoving() == true)
		{
			// Generate the error message
			String message = LOG_PREFIX +
								"Rejected; the robotic arm is currently " +
								"in the midst of another move request.";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, if the robotic arm's current joint angles are the same as
		// the stow configuration angles
		else if ((this.getTurretAngle() == TURRET_ANGLE_EDEFAULT) &&
				 (this.getShoulderAngle() == SHOULDER_ANGLE_EDEFAULT) &&
				 (this.getElbowAngle() == ELBOW_ANGLE_EDEFAULT) &&
				 (this.getWristAngle() == WRIST_ANGLE_EDEFAULT))
		{
			// Generate the error message
			String message = LOG_PREFIX +
							 	"Ignored; no move required as arm is already " +
							 	"in the stow joint configuration.";
			
			// Throw an exception to indicate that the operation has failed; this will
			// be caught and logged by Symphony
			throw new RuntimeException(message);
		}
		// Otherwise, the arm is initialized, enabled and needs to move
		else
		{
			// Indicate that the stowing of the robotic arm is starting
			String message = LOG_PREFIX + "Robotic arm stow started.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
			// Indicate that the arm is now moving
			this.setArmMoving(true);
			
			// Get the current joint configuration
			final GVector initialJointsValues = new GVector(new double[] {getTurretAngle(),
																		  getShoulderAngle(),
																		  getElbowAngle(),
																		  getWristAngle()});
		
			// Get the stow joint configuration (which happens to be the starting configuration)
			final GVector finalJointsValues = new GVector(new double[] {TURRET_ANGLE_EDEFAULT,
																		SHOULDER_ANGLE_EDEFAULT,
																		ELBOW_ANGLE_EDEFAULT,
																		WRIST_ANGLE_EDEFAULT});

			// Move to the arm to the stow configuration
			moveToConfiguration(initialJointsValues, finalJointsValues);
		
			// Indicate that the arm has completed moving
			this.setArmMoving(false);
			
			// Indicate that the stowing process is complete
			message = LOG_PREFIX + "Robotic arm stow completed.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		}
	}
	
	/**
	 * This helper function is used to move the robotic arm to the target configuration;
	 * recall that as this is a simulation, the robotic arm needs to simulate the amount
	 * of time it would take to move it in real life.  In order to facilitate that, the
	 * method divides the reconfiguration into a number of steps and performs the move
	 * incrementally.
	 * @param initialJointAngles The initial joint configuration (in degrees) of the robotic arm
	 * @param finalJointAngles The desired final joint configuration (in degrees) of the robotic arm
	 * @see #computeDeltaTime(GVector, GVector)
	 */
	private void moveToConfiguration(final GVector initialJointAngles,
									 final GVector finalJointAngles) 
	{
		// Make a copy of the initial joint angle vector
		GVector interpolatedJointAngles = new GVector(initialJointAngles);

		// Determine how much to change the interpolation at each time step
		double deltaT = this.computeDeltaTime(initialJointAngles, finalJointAngles);
		
		// Keep track of the current interpolation process.
		double t = -deltaT;

		// While not at the final joint angles
		while (t <= 1.0) 
		{
			// Advance the interpolation by one move step.
			t += deltaT;

			// Interpolates the joint position (Recall that t=0 is the initial
			// joint angle vector with t=1 is the final joint angle vector)
			interpolatedJointAngles.interpolate(initialJointAngles, finalJointAngles, t);

			// Update the joints with the currently interpolated joint angles
			this.setTurretAngle(interpolatedJointAngles.getElement(0));
			this.setShoulderAngle(interpolatedJointAngles.getElement(1));
			this.setElbowAngle(interpolatedJointAngles.getElement(2));
			this.setWristAngle(interpolatedJointAngles.getElement(3));

			try 
			{
				// Sleep for a short period of time (this makes it far
				// easier to visualize and follow the movement of the robotic arm)
				Thread.sleep(MOVE_TO_WAIT_PERIOD);
			} 
			catch (InterruptedException e) 
			{
				// Print the stack trace
				e.printStackTrace();
			}
		}
		
		// At this point, the angles for the arm should be quite close
		// to the final angles but due to numerical issues, they're unlikely
		// to be exactly same; just set them accordingly now
		this.setTurretAngle(finalJointAngles.getElement(0));
		this.setShoulderAngle(finalJointAngles.getElement(1));
		this.setElbowAngle(finalJointAngles.getElement(2));
		this.setWristAngle(finalJointAngles.getElement(3));
	}
	
	/**
	 * This helper function is used to determine the change in time (delta t) for each step
	 * when determining the current interpolation from the initial joint angle vector to the
	 * final (i.e. desired) joint angle vector.
	 * 
	 * Note 1: This is dependent both on the fixed angular speed (in degrees / second) as
	 * 		   well as the current move speed level.
	 * 
	 * Note 2: There's an implicit assumption that the joints all have the same speed,
	 * 		   which may or may not be true.
	 * 
	 * @param initialJointAngles The initial joint configuration (in degrees) of the robotic arm
	 * @param finalJointAngles The desired final joint configuration (in degrees) of the arm 
	 * @return The change in time (delta t) required for each time step.
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	private double computeDeltaTime(final GVector initialJointAngles,
									final GVector finalJointAngles) 
	{
		// Determine the joint which requires the most reconfiguration (in degrees)
		double largestMove = 0;
		
		// Go through all of the joints
		for (int i = 0; i < initialJointAngles.getSize(); i++)
		{
			// Determine the different between the initial and the final degree angle
			double deltaAngle = Math.abs(finalJointAngles.getElement(i)
									     - initialJointAngles.getElement(i));
			
			// If difference in angles is greater than the current max
			if (deltaAngle > largestMove)
			{
				// Update it accordingly
				largestMove = deltaAngle;
			}
		}
		
		// Calculate how many degrees the joints can move per second,
		// given both the fixed base angular speed (in degrees) as well
		// as the current move speed level
		double speed_deg_per_sec = MOVE_TO_ANGULAR_SPEED;
		speed_deg_per_sec = speed_deg_per_sec * (0.5 + 0.5 * speed.getValue());
		
		// Figure out how many seconds it will take to move all the joints
		double travelTime = largestMove / speed_deg_per_sec;
		
		// Divide the time per step (in seconds) by the travel time
		// This is the amount of progress that should be made by each move step
		double deltaTime = (0.001 * MOVE_TO_WAIT_PERIOD) / travelTime;
		
		// Return the delta t
		return deltaTime;
	}
} // RoboticArmSimulatedImpl
