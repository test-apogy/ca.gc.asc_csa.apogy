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
