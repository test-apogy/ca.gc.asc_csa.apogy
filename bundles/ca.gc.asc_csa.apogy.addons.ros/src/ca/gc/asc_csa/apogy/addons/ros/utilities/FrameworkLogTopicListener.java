package ca.gc.asc_csa.apogy.addons.ros.utilities;

import org.eclipse.osgi.framework.log.FrameworkLogEntry;
import org.ros.message.MessageListener;
import ca.gc.asc_csa.apogy.addons.ros.Activator;
import ca.gc.asc_csa.apogy.addons.ros.messages.ROSFrameworkLogEntry;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class FrameworkLogTopicListener implements MessageListener<ROSFrameworkLogEntry>
{
	protected String messagePrefix = null;
	
	public FrameworkLogTopicListener(String messagePrefix)
	{
		this.messagePrefix = messagePrefix;
	}
	
	@Override
	public void onNewMessage(ca.gc.asc_csa.apogy.addons.ros.messages.ROSFrameworkLogEntry message) 
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
