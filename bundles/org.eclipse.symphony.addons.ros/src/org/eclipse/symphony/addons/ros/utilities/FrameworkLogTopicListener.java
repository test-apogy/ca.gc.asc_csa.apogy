package org.eclipse.symphony.addons.ros.utilities;

import org.eclipse.osgi.framework.log.FrameworkLogEntry;
import org.ros.message.MessageListener;
import org.eclipse.symphony.addons.ros.Activator;
import org.eclipse.symphony.addons.ros.messages.ROSFrameworkLogEntry;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

public class FrameworkLogTopicListener implements MessageListener<ROSFrameworkLogEntry>
{
	protected String messagePrefix = null;
	
	public FrameworkLogTopicListener(String messagePrefix)
	{
		this.messagePrefix = messagePrefix;
	}
	
	@Override
	public void onNewMessage(org.eclipse.symphony.addons.ros.messages.ROSFrameworkLogEntry message) 
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
