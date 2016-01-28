package ca.gc.asc_csa.apogy.addons.ros.tools;

import java.util.Map;

import org.ros.EnvironmentVariables;
import org.ros.internal.message.GenerateInterfaces;

public class GenerateROSInterfaces {

	public static void main(String[] args) 
	{
		// Ensure that the Environment Variable ROS_PACKAGE_PATH refers to the location of the ROS package folder.
		
		System.out.println("Generating ROS Java Classes");
		
		Map<String, String> env = System.getenv();
		String rosPackagePath = env.get(EnvironmentVariables.ROS_PACKAGE_PATH);
		
		System.out.println("\t Source ROS Package         : <" + rosPackagePath + ">");
		System.out.println("\t Java Classes output folder : <" + args[0] + ">.");
		
		GenerateInterfaces.main(args);
		
		System.out.println("Generation Completed.");
	}

}
