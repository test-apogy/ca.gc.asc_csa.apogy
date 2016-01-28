/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.robotic_arm.Activator;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmPackage;
import ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArmStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robotic Arm Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoboticArmStubImpl extends RoboticArmImpl implements RoboticArmStub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoboticArmStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesRoboticArmPackage.Literals.ROBOTIC_ARM_STUB;
	}

	/**
	 * Performs the required operations required in order to initialize
	 * the robotic arm.
	 * @return Whether or not the robotic arm was successfully initialized.
	 */
	@Override
	public boolean init()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the robotic arm would have been initialized
		String message = this.getClass().getSimpleName() +
						".init(): Just a stub - the necessary initialization for the arm would have taken place.";
		
		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Indicate that it was successful
		return true;
	}

	/** 
	 * Changes the level of speed at which the robotic arm should move; this
	 * is likely to be used by both moveTo() and stow() as they both involve
	 * moving the arm.
	 * @param speedLevel The new move speed level, indicating how fast the arm should move.
	 */
	@Override
	public void cmdMoveSpeedLevel(MoveSpeedLevel speedLevel)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the move speed level would have been changed
		String message = this.getClass().getSimpleName() +
						".cmdMoveSpeedLevel(MoveSpeedLevel." + speedLevel.getName() +
						"): Just a stub - the move speed level would have been updated.";
		
		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);		
	}

	/**
	 * Initiates the motion of the arm and move the arm to the specified configuration.
	 * @param turretAngle The expected angle (in radians) of the turret joint (joint 1) after moving
	 * @param shoulderAngle The expected angle (in radians) of the shoulder joint (joint 2) after moving.
	 * @param elbowAngle The expected angle (in radians) of the elbow joint (joint 3) after moving.
	 * @param wristAngle The expected angle (in radians) of the wrist joint (joint 4) after moving.
	 */
	@Override
	public void moveTo(double turretAngle, double shoulderAngle,
					   double elbowAngle, double wristAngle)
	{
		/**
		 * This is the degree symbol, as expressed in unicode
		 */
		final String DEGREE_SYM = "\u00b0";
		
		// Generate the message and log it
		// As this is a stub, just indicate that the robotic arm would have moved to the given joint configuration
		String message = this.getClass().getSimpleName() +
							".moveTo(" + Math.toDegrees(turretAngle) + DEGREE_SYM + ", " + 
							Math.toDegrees(shoulderAngle) +	DEGREE_SYM + ", " + 
							Math.toDegrees(elbowAngle) + DEGREE_SYM + ", " + 
							Math.toDegrees(wristAngle) + DEGREE_SYM  + "): Just a stub - " +
							"the robotic arm would have moved to the given target joint orientation.";
		
		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	@Override
	/**
	 * Initiates the motion of the arm and moves the arm to the stow configuration.
	 */
	public void stow()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the robotic arm would have moved to its stow joint configuration
		String message = this.getClass().getSimpleName() + ".stow(): Just a stub - " +
							"the robotic arm would have moved to the stow joint configuration.";
		
		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
} //RoboticArmStubImpl
