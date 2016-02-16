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
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros;

import org.ros.exception.ServiceException;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.Node;
import org.ros.node.service.ServiceResponseBuilder;
import org.ros.node.topic.Publisher;

import ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.MoveSpeed;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.RoboticArmTelemetry;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdMoveToRequest;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdMoveToResponse;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdSpeedLevelRequest;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdSpeedLevelResponse;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdStowRequest;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdStowResponse;

public class RoboticArmROSServer extends AbstractNodeMain
{
	protected RoboticArm roboticArm = null;
	
	protected Publisher<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.RoboticArmTelemetry> telemetryPublisher = null;
	
	protected boolean telemetryShouldRun = true;
	protected Thread telemetryThread = null;
	
	/**
	 * ROS object needed for subscribers and service clients
	 */
	protected ConnectedNode rosNode;

	
	public RoboticArmROSServer(RoboticArm roboticArm)
	{
		this.roboticArm = roboticArm;
	}
	
	@Override
	public GraphName getDefaultNodeName() 
	{
		return GraphName.of(RoboticArmROSConstants.ROBOTIC_ARM_SERVER_NODE_NAME);
	}
	
	@Override
	public void onStart(ConnectedNode connectedNode) 
	{
		/* Set the node in the object */
		this.rosNode = connectedNode;

		initializeTopics();
		
		initializeServices();	
		
		// Starts the telemetry update.
		telemetryShouldRun = true;
		telemetryThread = new Thread(getTelemetryRunnable());
		telemetryThread.start();		
	}
	
	@Override
	public void onShutdown(Node node) 
	{
		// Stops the telemetry Thread.
		telemetryShouldRun = false;		
		
		// Shutdown node.
		this.rosNode.shutdown();
		
		super.onShutdown(node);
	}
	
	private void initializeTopics()
	{	
		// Creates the Publishers.
		telemetryPublisher = this.rosNode.newPublisher(RoboticArmROSConstants.TOPIC_NAME_ROBOTIC_ARM_TELEMETRY, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.RoboticArmTelemetry._TYPE);
	}
	
	private void initializeServices()
	{
		// MoveTo service
		this.rosNode.newServiceServer(RoboticArmROSConstants.SERVICE_NAME_MOVE_TO, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdMoveTo._TYPE, 
				new ServiceResponseBuilder<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdMoveToRequest, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdMoveToResponse>() 
		{

			@Override
			public void build(cmdMoveToRequest request, cmdMoveToResponse response) throws ServiceException 
			{				
				double turretAngle = request.getTurretAngle();
				double shoulderAngle = request.getShoulderAngle();
				double elbowAngle = request.getElbowAngle();
				double wristAngle = request.getWristAngle();
				
				roboticArm.moveTo(turretAngle, shoulderAngle, elbowAngle, wristAngle);
				
				// Adds some delay here
				try 
				{
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) 
				{				
					e.printStackTrace();
				}
				
				response.setResult(true);
			}
			
		});
		
		// Stow Arm Service
		this.rosNode.newServiceServer(RoboticArmROSConstants.SERVICE_NAME_STOW_ARM, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdStow._TYPE, 
				new ServiceResponseBuilder<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdStowRequest, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdStowResponse>() 
		{
			@Override
			public void build(cmdStowRequest request, cmdStowResponse response) throws ServiceException 
			{				
				roboticArm.stow();
				
				// Adds some delay here
				try 
				{
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) 
				{				
					e.printStackTrace();
				}
			}						
		});
		
		//
		this.rosNode.newServiceServer(RoboticArmROSConstants.SERVICE_NAME_SET_MOVE_SPEED, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdSpeedLevel._TYPE, 
				new ServiceResponseBuilder<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdSpeedLevelRequest, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs.cmdSpeedLevelResponse>() 
		{
			@Override
			public void build(cmdSpeedLevelRequest request, cmdSpeedLevelResponse response) throws ServiceException 
			{
				roboticArm.setSpeed(MoveSpeedLevel.get(request.getSpeed().getSpeedStatus()));
				
				response.setResult(true);
			}
								
		});
	}
	
	/**
	 * Creates a Runnable that periodically reads the robotic arm states and publishes the telemetry.
	 * @return The Runnable.
	 */
	private Runnable getTelemetryRunnable()
	{
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() 
			{
				while(telemetryShouldRun)
				{
					
					RoboticArmTelemetry roboticArmTelemetry = rosNode.getTopicMessageFactory().newFromType(RoboticArmTelemetry._TYPE);
					
					roboticArmTelemetry.setElbowAngle((float) roboticArm.getElbowAngle());
					roboticArmTelemetry.setShoulderAngle((float) roboticArm.getShoulderAngle());
					roboticArmTelemetry.setTurretAngle((float) roboticArm.getTurretAngle());
					roboticArmTelemetry.setWristAngle((float) roboticArm.getWristAngle());
					
					roboticArmTelemetry.setMoving(roboticArm.isArmMoving());
					
					MoveSpeed moveSpeed = rosNode.getTopicMessageFactory().newFromType(MoveSpeed._TYPE);
					moveSpeed.setSpeedStatus((byte) roboticArm.getSpeed().getValue()); 
					roboticArmTelemetry.setSpeed(moveSpeed);
					
					// Publishes the telemetry.
					telemetryPublisher.publish(roboticArmTelemetry);
					
					// Wait for next update.
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						telemetryShouldRun = false;
					}
				}				
			}
		};
		
		return runnable;
	}

}
