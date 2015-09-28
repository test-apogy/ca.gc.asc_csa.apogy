package ca.gc.asc_csa.eclipse.ros.utilities;

import org.ros.internal.message.Message;

import ca.gc.asc_csa.eclipse.ros.RosService;

/**
 * 	Strategy to log the service responses
 */
public interface ResponseLogger
{
	public void logResponse ( RosService<?, ?> service, Message response );
}
