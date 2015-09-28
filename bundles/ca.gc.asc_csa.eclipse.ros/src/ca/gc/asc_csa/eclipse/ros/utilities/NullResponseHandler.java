package ca.gc.asc_csa.eclipse.ros.utilities;

import org.ros.internal.message.Message;

import ca.gc.asc_csa.eclipse.ros.RosService;

/**
 * Strategy to handle a null service response.
 * It is called when a service call never receives a response and times out.
 */
public interface NullResponseHandler
{
	public Message handleNullResponse ( RosService<?, ?> service );
}