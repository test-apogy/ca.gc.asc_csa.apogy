package ca.gc.asc_csa.apogy.addons.ros.messages;
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

public interface ROSFrameworkLogEntry extends org.ros.internal.message.Message
{
	static final java.lang.String _TYPE = "ca.gc.asc_csa.apogy.addons.ros.messages/ROSFrameworkLogEntry";
	static final java.lang.String _DEFINITION = "# ROS message\t: ca.gc.asc_csa.apogy.addons.ros.messages/ROSFrameworkLogEntry\n" +
												"# File name\t\t: ROSFrameworkLogEntry.msg\n" +
												"# Created on\t: 14 feb 2013\n" +
												"# Last edit\t\t: 14 feb 2013\n" +
												"# TRT Telemetry\n\n" +
												"# ROS header\n" +
												"Header header\n\n" +
												"# Name of bundle\n" +
												"string bundleName\n\n" +
												"# Severity of the message\n" +
												"int8 severity\n\n" +
												"# Message\n" +
												"string message\n\n" +
												"# Throwable message (if applicable)\n" +
												"string throwableMessage\n";

	std_msgs.Header getHeader();
	void setHeader(std_msgs.Header value);
	
	String getBundleName();
	void setBundleName(String value);
	
	byte getSeverity();
	void setSeverity(byte value);
	
	String getMessage();
	void setMessage(String value);
	
	String getThrowableMessage();
	void setThrowableMessage(String value);
}
