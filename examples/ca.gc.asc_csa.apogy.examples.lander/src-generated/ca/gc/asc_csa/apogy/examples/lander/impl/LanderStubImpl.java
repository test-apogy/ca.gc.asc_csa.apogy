package ca.gc.asc_csa.apogy.examples.lander.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.lander.Activator;
import ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage;
import ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension;
import ca.gc.asc_csa.apogy.examples.lander.LanderStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lander Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LanderStubImpl extends LanderImpl implements LanderStub
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
	protected LanderStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesLanderPackage.Literals.LANDER_STUB;
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
		return 0;
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
		return 1;
	}

	/**
	 * This operation performs the steps required in order to
	 * initialize the lander.
	 * @return Whether or not the lander was successfully initialized
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander would
		// have been initialized
		String message = this.getClass().getSimpleName() +
							".init(): Just a stub - " +
							"the necessary initialization for the lander " +
							"would have taken place.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
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
		// Generate the message and log it
		// As this is a stub, just indicate that the legs of the lander
		// would have extended / retracted as commanded.
		String message = this.getClass().getSimpleName() +
							".commandLegPosition(LanderLegPosition." +
							legAExtension.getName() + ", LanderLegPosition." +
							legBExtension.getName() + ", LanderLegPosition." +
							legCExtension.getName() + "): Just a stub - " +
							"the legs of the lander would have extended / " +
							"retracted to match the specified leg extensions";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
	 * @param xAngularVelocity The new X angular velocity for the lander (given in radians / second)
	 * @param yAngularVelocity The new Y angular velocity for the lander (given in radians / second)
	 * @generated_NOT
	 */
	@Override
	public void commandAngularVelocities(double xAngularVelocity,
										 double yAngularVelocity)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander's
		// angular velocities would have been updated.
		String message = this.getClass().getSimpleName() +
							".commandAngularVelocities(" +
							Math.toDegrees(xAngularVelocity) + " (" +
							DEGREE_SYM + "/s), " +
							Math.toDegrees(yAngularVelocity) + " (" + 
							DEGREE_SYM + "/s)): Just a stub - " +
							"the lander's angular velocities would have been " +
							"appropriately updated.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used to update the lander's thrust level
	 * (which is given in newtons.)
	 * @param thrustLevel The lander's new thrust level (given in newtons)
	 * @generated_NOT
	 */
	@Override
	public void commandThrust(double thrustLevel)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander's
		// thrust would have been updated.
		String message = this.getClass().getSimpleName() +
							".commandThrust(" + thrustLevel + "): Just a stub - " +
							"the lander's thrust level would have been " +
							"appropriately updated.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
	
	/**
	 * This operation is used to change the lander's current thrust
	 * level by the specified (absolute) offset (which is given in
	 * newtons.)
	 * <p> 
	 * Note: The thrust level is always bounded by
	 * 		 [thruster.getMinimumThrust(), thruster.getMaximumThrust()]
	 * 
	 * @param thrustOffset The amount (in N) that the thrust level should be increased / decreased. 
	 * @generated_NOT
	 */
	@Override
	public void changeThrustBy(double thrustOffset)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander's
		// thrust would have been updated.
		String message = this.getClass().getSimpleName() +
							".changeThrustBy(" + thrustOffset + "): Just a stub - " +
							"the lander's thrust level would have been " +
							"increased / decreased accordingly.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
	
	/**
	 * This operation is used to permit the lander to start flying.
	 * <p>
	 * Whether or not the lander is able to actually fly is dependent on
	 * the mass of the lander, the lander's current thrust and the gravity
	 * being used (e.g. the Earth's gravity, g ~= -9.81); there may
	 * potentially be other factors as well.
	 * @see #stopFlying()
	 * @param logStateChanges Whether or not to log the state changes that occur because it has started flying
	 * @generated_NOT
	 */
	@Override
	public void startFlying(boolean logStateChanges)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander
		// could now start flying
		String message = this.getClass().getSimpleName() +
							".startFlying(" + logStateChanges + "): Just a stub - " +
							"the lander would be able to start flying.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used to indicate that the lander is no longer
	 * allowed to fly and should stop doing so.
	 * @see #startFlying()
	 * @generated_NOT
	 */
	@Override
	public void stopFlying()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander
		// can no longer fly and should land
		String message = this.getClass().getSimpleName() +
							".stopFlying(): Just a stub - " +
							"the lander would stop flying and land immediately.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used to move the lander to the specified X, Y and
	 * Z coordinates.
	 * @param x The lander's new desired X coordinate
	 * @param y The lander's new desired Y coordinate
	 * @param z The lander's new desired Z coordinate
	 * @generated_NOT
	 */
	@Override
	public void moveTo(double x, double y, double z)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander
		// should move to the coordinates specified.
		String message = this.getClass().getSimpleName() +
							".moveTo(" + x + ", " + y + ", " + z + "): " +
							"Just a stub - the lander would move to the " +
							"specified Cartesian coordinates.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used to change the lander's attitude /
	 * orientation to the specified angles.
	 * @param xAngle The lander's new angle of rotation (in radians) around the X axis
	 * @param yAngle The lander's new angle of rotation (in radians) around the Y axis
	 * @param zAngle The lander's new angle of rotation (in radians) around the Z axis
	 * @generated_NOT
	 */
	@Override
	public void changeAttitude(double xAngle, double yAngle, double zAngle)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander
		// should change its attitude / orientation to the specified angles
		String message = this.getClass().getSimpleName() +
							".changeAttitude(" + Math.toDegrees(xAngle) +
							DEGREE_SYM + ", " +	Math.toDegrees(yAngle) +
							DEGREE_SYM + ", " +	Math.toDegrees(zAngle) +
							DEGREE_SYM + "): Just a stub - " +
							"the lander would change its attitude / orientation " +
							"to reflect the specified angles.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
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
		// Generate the message and log it
		// As this is a stub, just indicate that the lander
		// should reset its attitude / orientation
		String message = this.getClass().getSimpleName() +
							".resetAttitude(): Just a stub - " +
							"the lander would reset its attitude / orientation.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}

	/**
	 * This operation is used to perform operations to cleanup the lander
	 * when it is no longer needed.
	 * @generated_NOT
	 */
	@Override
	public void dispose()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the lander
		// should perform the required disposal operations
		String message = this.getClass().getSimpleName() +
							".dispose(): Just a stub - " +
							"the lander would perform the required " +
							"disposal operations.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	}
} //LanderStubImpl
