package ca.gc.asc_csa.apogy.examples.robotic_arm.ros;

import java.net.URI;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.ros.node.DefaultNodeMainExecutor;
import org.ros.node.NodeMainExecutor;

import ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmFactory;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;

public class RoboticArmROSServerApplication implements IApplication
{
	private RoboticArmROSServer server = null;
	private RoboticArm roboticArm = null;
	
	@Override
	public Object start(IApplicationContext context) throws Exception 
	{
		roboticArm = ApogyExamplesRoboticArmFactory.eINSTANCE.createRoboticArmSimulated();
		server = new RoboticArmROSServer(roboticArm);			
//		
//		final NodeMainExecutor nodeMainExecutor = DefaultNodeMainExecutor.newDefault();
//        nodeConfiguration.newPublic(host,URI.create("http://IPofMaster:11311/"));
//        nodeMainExecutor.execute(nodeMain, nodeConfiguration);
//		
		return new String("OK");
	}

	@Override
	public void stop() 
	{

	}

}
