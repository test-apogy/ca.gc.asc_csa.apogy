package org.eclipse.symphony.addons.ros.utilities;

import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;

public class FrameworkLogPublisher
{
	protected ILogListener logListener = null;
	protected ConnectedNode connectedNode = null;
	protected String topicName = null;
	protected Publisher<org.eclipse.symphony.addons.ros.messages.ROSFrameworkLogEntry> frameworkLogEntryPublisher = null;
	
	public FrameworkLogPublisher(String topicName, final ConnectedNode connectedNode)
	{
		setTopicName(topicName);
		setConnectedNode(connectedNode);
		
		registerListener();
	}		
	
	@Override
	protected void finalize() throws Throwable 
	{
		unRegisterListener();
		super.finalize();
	}
	
	private void setTopicName(String topicName)
	{
		this.topicName = topicName;
	}
	
	private void setConnectedNode(final ConnectedNode connectedNode)
	{
		if(frameworkLogEntryPublisher != null)
		{
			frameworkLogEntryPublisher.shutdown();
			frameworkLogEntryPublisher = null;
		}
		
		this.connectedNode = connectedNode;
		
		if(connectedNode != null)
		{
			frameworkLogEntryPublisher = connectedNode.newPublisher(topicName, org.eclipse.symphony.addons.ros.messages.ROSFrameworkLogEntry._TYPE);
		}
	}
	
	private void registerListener()
	{
		Platform.addLogListener(getILogListener());
	}
	
	private void unRegisterListener()
	{
		Platform.removeLogListener(getILogListener());
	}
	
	private ILogListener getILogListener()
	{
		if (logListener == null)
		{
			logListener = new ILogListener()
			{
				@Override
				public void logging(IStatus status, String plugin) 
				{
					try
					{
						if (frameworkLogEntryPublisher != null)
						{						
							org.eclipse.symphony.addons.ros.messages.ROSFrameworkLogEntry entry = FrameworkLogUtils.convertToROSFrameworkLogEntry(status, connectedNode);
							frameworkLogEntryPublisher.publish(entry);
						}
					}
					catch (Throwable t)
					{
						
					}
				}
			};
		}
		
		return logListener;
	}
}
