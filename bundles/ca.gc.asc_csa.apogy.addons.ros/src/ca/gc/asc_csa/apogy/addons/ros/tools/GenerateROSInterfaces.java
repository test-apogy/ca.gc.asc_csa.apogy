package ca.gc.asc_csa.apogy.addons.ros.tools;
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
