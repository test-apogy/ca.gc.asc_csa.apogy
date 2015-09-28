package ca.gc.asc_csa.eclipse.ros.utilities;

import org.ros.internal.message.Message;

import ca.gc.asc_csa.eclipse.ros.RosService;

/**
 * Strategy to create a request message.
 * Called when the desired service is not launched and can't create a request message.
 * It is useful to prevent NullPointerExceptions and to avoid null checks everywhere.
 */
public interface NullRequestHandler
{
	public Message handleNullRequest ( RosService<?, ?> service );
}	
