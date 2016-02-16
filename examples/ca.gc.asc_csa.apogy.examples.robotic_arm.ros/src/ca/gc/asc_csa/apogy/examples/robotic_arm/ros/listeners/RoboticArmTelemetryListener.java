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
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.listeners;

import org.ros.message.MessageListener;

import ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmTelemetry;

public class RoboticArmTelemetryListener implements MessageListener<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmTelemetry>
{
	private RoboticArm roboticArm = null;
	
	public RoboticArmTelemetryListener(RoboticArm roboticArm)
	{
		setRoboticArm(roboticArm);
	}
	
	public void setRoboticArm(RoboticArm roboticArm)
	{
		this.roboticArm = roboticArm;
	}
	
	@Override
	public void onNewMessage(RoboticArmTelemetry msg) 
	{		
		try
		{
			if(roboticArm != null)
			{
				// Updates the joint angles. Note that here that the ROS telemetry is defined in radians, but our model is in degrees.
				roboticArm.setTurretAngle(Math.toDegrees(msg.getTurretAngle()));
				roboticArm.setShoulderAngle(Math.toDegrees(msg.getShoulderAngle()));
				roboticArm.setElbowAngle(Math.toDegrees(msg.getElbowAngle()));
				roboticArm.setWristAngle(Math.toDegrees(msg.getWristAngle()));
				
				// Updates the moving flag.
				roboticArm.setArmMoving(msg.getMoving());
				
				// Updates the MoveSpeed value.
				roboticArm.setSpeed(MoveSpeedLevel.get(msg.getSpeed().getSpeedStatus()));
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
