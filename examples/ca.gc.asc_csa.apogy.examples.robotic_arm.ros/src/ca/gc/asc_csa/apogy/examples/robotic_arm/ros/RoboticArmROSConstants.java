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

import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFacade;

public class RoboticArmROSConstants 
{	  
	  public static final String ROBOTIC_ARM__PREFIX 												 	 = "/roboticArm";
	  public static final String ROBOTIC_ARM_TOPICS_PREFIX 												 = ROBOTIC_ARM__PREFIX;	  
	  public static final String ROBOTIC_ARM_SERVICE_PREFIX 											 = ROBOTIC_ARM__PREFIX;
	  
	  public static final String ROBOTIC_ARM_SERVER_NODE_NAME											 = "roboticArmServer";
	  public static final String ROBOTIC_ARM_CLIENT_NODE_NAME											 = ROBOTIC_ARM__PREFIX + "/Client" + ApogyAddonsROSFacade.INSTANCE.getNodeNamePrefix();
	  
	  // Topics
	  public static final String TOPIC_NAME_ROBOTIC_ARM_TELEMETRY										 = ROBOTIC_ARM_TOPICS_PREFIX + "/Telemetry";
	  
	  // Services	  	
	  public static final String SERVICE_NAME_INIT											 			 = ROBOTIC_ARM_SERVICE_PREFIX + "/cmdInit";
	  public static final String SERVICE_NAME_SET_MOVE_SPEED											 = ROBOTIC_ARM_SERVICE_PREFIX + "/cmdMoveSpeed";
	  public static final String SERVICE_NAME_MOVE_TO											 		 = ROBOTIC_ARM_SERVICE_PREFIX + "/cmdMoveTo";
	  public static final String SERVICE_NAME_STOW_ARM													 = ROBOTIC_ARM_SERVICE_PREFIX + "/cmdStow";
}
