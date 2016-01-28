package org.eclipse.symphony.addons.ros.utilities;

import org.ros.internal.message.Message;

import org.eclipse.symphony.addons.ros.ROSService;

/**
 * 	Strategy to log the service responses
 */
public interface ResponseLogger
{
	public void logResponse(ROSService<?, ?> service, Message response);
}
