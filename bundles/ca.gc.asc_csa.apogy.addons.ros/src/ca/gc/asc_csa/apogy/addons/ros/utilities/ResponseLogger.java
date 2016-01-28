package ca.gc.asc_csa.apogy.addons.ros.utilities;

import org.ros.internal.message.Message;

import ca.gc.asc_csa.apogy.addons.ros.ROSService;

/**
 * 	Strategy to log the service responses
 */
public interface ResponseLogger
{
	public void logResponse(ROSService<?, ?> service, Message response);
}
