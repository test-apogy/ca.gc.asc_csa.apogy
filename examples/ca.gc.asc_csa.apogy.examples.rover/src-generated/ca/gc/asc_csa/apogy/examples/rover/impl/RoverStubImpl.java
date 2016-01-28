/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.rover.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.rover.Activator;
import ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage;
import ca.gc.asc_csa.apogy.examples.rover.RoverStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoverStubImpl extends RoverImpl implements RoverStub
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
	protected RoverStubImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyExamplesRoverPackage.Literals.ROVER_STUB;
	}

	/** 
	 * This operation is used to perform the required initialization functions
	 * on the rover assembly; this may involve bootstrapping the components
	 * of the rover (e.g. mobile platform, cameras, etc.)
	 * @return Whether or not the rover assembly was successfully initialized
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the rover would have been initialized
		String message = this.getClass().getSimpleName() +
							".init(): Just a stub - the necessary " +
							"initialization for the rover would have taken place.";

		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

		// Just indicate that it would have been initialized
		return true;
	}

	/**
	 * This operation is used to dispose of the given rover, shutting down
	 * and releasing the rover's resources; this implicitly means that the
	 * rover will not be available after calling this method.
	 * @generated_NOT
	 */
	@Override
	public void dispose()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the rover would have been disposed
		String message = this.getClass().getSimpleName() +
							".dispose(): Just a stub - the necessary " +
							"disposal for the rover would have taken place.";
		
		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this is a stub, just indicate that the rover's
		// linear velocity would have been updated
		String message = this.getClass().getSimpleName() +
				".cmdLinearVelocity(" + linearVelocity +
				"): Just a stub - the rover's linear " +
				"velocity would have been updated.";

		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this is a stub, just indicate that the rover's
		// angular velocity would have been updated
		String message = this.getClass().getSimpleName() +
				".cmdAngularVelocity(" + Math.toDegrees(angularVelocity) +
				" (" + DEGREE_SYM + "/s)): Just a stub - the rover's " +
				"angular velocity would have been updated.";

		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this a stub, just indicate that the rover's linear and
		// angular velocities would have been updated
		String message = this.getClass().getSimpleName() +
				".cmdVelocities(" + linearVelocity + ", " +
				Math.toDegrees(angularVelocity) + " (" +
				DEGREE_SYM + "/s)): Just a stub - the rover's " +
				"linear and angular velocities would have been updated.";

		// Log the stub message
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
} //RoverStubImpl
