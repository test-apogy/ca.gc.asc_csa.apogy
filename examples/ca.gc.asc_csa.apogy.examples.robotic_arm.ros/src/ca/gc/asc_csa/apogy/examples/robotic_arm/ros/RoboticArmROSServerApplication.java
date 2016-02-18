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

import java.net.URI;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.ros.address.InetAddressFactory;
import org.ros.node.DefaultNodeMainExecutor;
import org.ros.node.NodeConfiguration;
import org.ros.node.NodeMainExecutor;

import ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmFactory;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;

/**
 * This class is used to start a ROS node that acts as the server for the RoboticArmROS
 * implementation of RoboticArm.
 * @author pallard
 *
 */
public class RoboticArmROSServerApplication implements IApplication
{
	private RoboticArmROSServer server = null;
	private RoboticArm roboticArm = null;
	
	@Override
	public Object start(IApplicationContext context) throws Exception 
	{
		roboticArm = ApogyExamplesRoboticArmFactory.eINSTANCE.createRoboticArmSimulated();
		
		// TODo : Remove
		roboticArm.init();
		
		server = new RoboticArmROSServer(roboticArm);	
			
		System.out.println("Robotic Arm ROS Server starting...");
		
		String host = InetAddressFactory.newNonLoopback().getHostAddress().toString();

        NodeConfiguration configuration = NodeConfiguration.newPublic(host, URI.create("http://ld2031439:11311"));

        final NodeMainExecutor runner = DefaultNodeMainExecutor.newDefault();
        configuration.setNodeName("roboticArm");
        runner.execute(server, configuration);
		
        int i = 0;
        while(i==0)
        {
        	Thread.sleep(100);
        }
		
		return new String("OK");
	}

	@Override
	public void stop() 
	{

	}

}
