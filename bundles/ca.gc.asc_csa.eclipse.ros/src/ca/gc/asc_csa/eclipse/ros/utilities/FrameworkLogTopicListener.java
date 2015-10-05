package ca.gc.asc_csa.eclipse.ros.utilities;

import org.eclipse.osgi.framework.log.FrameworkLogEntry;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.ros.message.MessageListener;

import ca.gc.asc_csa.eclipse.ros.Activator;

public class FrameworkLogTopicListener implements MessageListener<eclipse_ros_msgs.ROSFrameworkLogEntry>
{
	protected String messagePrefix = null;
	
	public FrameworkLogTopicListener(String messagePrefix)
	{
		this.messagePrefix = messagePrefix;
	}
	
	@Override
	public void onNewMessage(eclipse_ros_msgs.ROSFrameworkLogEntry message) 
	{
		try
		{			
			FrameworkLogEntry frameworkLogEntry = FrameworkLogUtils.convertToFrameworkLogEntry(messagePrefix, message);
			Logger.INSTANCE.log(Activator.ID, this, frameworkLogEntry.getMessage(), EventSeverity.get(frameworkLogEntry.getSeverity()));
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
}
