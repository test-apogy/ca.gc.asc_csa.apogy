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

/**
 * This class is a ROS Node that is the server for the RoboticArmROS implementation of RoboticArm
 * @author pallard
 *
 */
public class RoboticArmROSServer extends AbstractNodeMain
{
	protected RoboticArm roboticArm = null;
	
	protected Publisher<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmTelemetry> telemetryPublisher = null;
	
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
		System.out.println("Initializing topics...");	
		
		// Creates the Publishers.
		telemetryPublisher = this.rosNode.newPublisher(RoboticArmROSConstants.TOPIC_NAME_ROBOTIC_ARM_TELEMETRY, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmTelemetry._TYPE);
	}
	
	private void initializeServices()
	{
		System.out.println("Initializing services...");	
				
		// MoveTo service
		System.out.println("Initializing " + RoboticArmROSConstants.SERVICE_NAME_INIT + " service...");
		this.rosNode.newServiceServer(RoboticArmROSConstants.SERVICE_NAME_INIT, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdInit._TYPE, 
				new ServiceResponseBuilder<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdInitRequest, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdInitResponse>() 
		{
										
			@Override
			public void build(cmdInitRequest request, cmdInitResponse response) throws ServiceException 
			{			
				System.out.println("------------>RoboticArmROSServer.init()");
				
				roboticArm.init();				
				response.setResult(true);
			}
			
		});
		
		
		// MoveTo service
		System.out.println("Initializing " + RoboticArmROSConstants.SERVICE_NAME_MOVE_TO + " service...");
		this.rosNode.newServiceServer(RoboticArmROSConstants.SERVICE_NAME_MOVE_TO, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdMoveTo._TYPE, 
				new ServiceResponseBuilder<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdMoveToRequest, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdMoveToResponse>() 
		{

			@Override
			public void build(cmdMoveToRequest request, cmdMoveToResponse response) throws ServiceException 
			{				
				// The ROS Service expects radians, but the RoboticArm moveTo expects degrees, so conversion is needed.
				double turretAngle = Math.toDegrees(request.getTurretAngle());
				double shoulderAngle = Math.toDegrees(request.getShoulderAngle());
				double elbowAngle = Math.toDegrees(request.getElbowAngle());
				double wristAngle = Math.toDegrees(request.getWristAngle());
				
				roboticArm.moveTo(turretAngle, shoulderAngle, elbowAngle, wristAngle);
				
				response.setResult(true);
			}
			
		});
		
		// Stow Arm Service
		// MoveTo service
		System.out.println("Initializing " + RoboticArmROSConstants.SERVICE_NAME_STOW_ARM + " service...");
		this.rosNode.newServiceServer(RoboticArmROSConstants.SERVICE_NAME_STOW_ARM, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdStow._TYPE, 
				new ServiceResponseBuilder<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdStowRequest, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdStowResponse>() 
		{
			@Override
			public void build(cmdStowRequest request, cmdStowResponse response) throws ServiceException 
			{				
				roboticArm.stow();								
				response.setResult(true);
			}						
		});
		
		// Move Speed Service
		System.out.println("Initializing " + RoboticArmROSConstants.SERVICE_NAME_SET_MOVE_SPEED + " service...");
		this.rosNode.newServiceServer(RoboticArmROSConstants.SERVICE_NAME_SET_MOVE_SPEED, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdSpeedLevel._TYPE, 
				new ServiceResponseBuilder<ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdSpeedLevelRequest, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdSpeedLevelResponse>() 
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
				System.out.println("Robotic Arm ROS Server : Telemetry Update starts.");
				while(telemetryShouldRun)
				{
					
					RoboticArmTelemetry roboticArmTelemetry = rosNode.getTopicMessageFactory().newFromType(RoboticArmTelemetry._TYPE);
					
					roboticArmTelemetry.setElbowAngle((float) Math.toRadians(roboticArm.getElbowAngle()));
					roboticArmTelemetry.setShoulderAngle((float) Math.toRadians(roboticArm.getShoulderAngle()));
					roboticArmTelemetry.setTurretAngle((float) Math.toRadians(roboticArm.getTurretAngle()));
					roboticArmTelemetry.setWristAngle((float) Math.toRadians(roboticArm.getWristAngle()));
					
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
