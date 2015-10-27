/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.examples.mobile_platform.Activator;
import org.eclipse.symphony.examples.mobile_platform.Symphony__ExamplesMobilePlatformPackage;
import org.eclipse.symphony.examples.mobile_platform.MobilePlatformStub;
import org.eclipse.symphony.examples.mobile_platform.Position;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mobile Platform Stub</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class MobilePlatformStubImpl extends MobilePlatformImpl implements MobilePlatformStub
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
	protected MobilePlatformStubImpl()
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
		return Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM_STUB;
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
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform would have been initialized.
		String message = this.getClass().getSimpleName() +
							".init(): Just a stub - " +
							"The necessary initialization for the mobile " +
							"platform would have taken place.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * This operation is used to dispose of the mobile platform
	 * and as such, it will perform the steps required to
	 * shutdown the platform and any resources it uses.  Note
	 * that implicitly, this means that the mobile platform won't
	 * be available after it has been disposed.
	 * @generated_NOT
	 */
	@Override
	public void dispose()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform would have been disposed.
		String message =  this.getClass().getSimpleName() +
							".dispose(): Just a stub - " +
							"The necessary disposal operations for the " +
							"mobile platform would have taken place.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform's position will be changed
		String message = this.getClass().getSimpleName() +
							".resetPosition(Position(X=" +
							position.getX() + ", Y=" +
							position.getY() + ", Theta=" +
							position.getTheta() + "): " + 
							"Just a stub - The mobile platform's " +
							"location and pose would have been " +
							"changed to the given position.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used to clear the mobile platform's positional
	 * error; this could be used to indicate that all error should now
	 * be taken in respect to the robot's current position.
	 * @generated_NOT
	 */
	@Override
	public void clearPositionError()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// position error will be cleared.
		String message = this.getClass().getSimpleName() +
							".clearPositionError(): " +
							"Just a stub - The mobile platform's " +
							"position error would have been cleared, " +
							"indicating that all error should be " +
							"relative to the current position.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used to stop the mobile platform, if it is 
	 * currently moving.
	 * @generated_NOT
	 */
	@Override
	public void stop()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform will stop moving, if it
		// is currently moving.
		String message = this.getClass().getSimpleName() +
							".stop(): Just a stub - " +
							"The mobile platform would have " +
							"stopped moving.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used move the mobile platform to the
	 * specified coordinates.
	 * 
	 * @param x This is the mobile platform's desired X coordinate (in metres).
	 * @param y This is the mobile platform's desired Y coordinate (in metres).
	 * @generated_NOT
	 */
	@Override
	public void moveTo(double x, double y)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform would move to the given
		// coordinates.
		String message = this.getClass().getSimpleName() +
							".moveTo(" + x + ", " + y + "): " +
							"Just a stub - The mobile platform " +
							"should move to the given coordinates.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform's linear velocity would
		// have been updated
		String message = this.getClass().getSimpleName() +
							".cmdLinearVelocity(" + linearVelocity + "): " +
							"Just a stub - The mobile platform's " +
							"linear velocity would have been changed.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform's angular velocity would
		// have been updated
		String message = this.getClass().getSimpleName() +
							".cmdAngularVelocity(" + Math.toDegrees(angularVelocity)
							+ DEGREE_SYM + "): " + "Just a stub - The mobile platform's " +
							"angular velocity would have been changed.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this is a stub, just indicate that the
		// mobile platform's linear and angular velocity
		// would have been updated.
		String message = this.getClass().getSimpleName() +
							".cmdVelocities(" + linearVelocity + ", " +
							Math.toDegrees(angularVelocity) + DEGREE_SYM +
							"): Just a stub - The mobile platform's " +
							"linear and angular velocities would have " +
							"been changed.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
} // MobilePlatformStubImpl
