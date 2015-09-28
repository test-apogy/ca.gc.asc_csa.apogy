package ca.gc.asc_csa.eclipse.ros.utilities;

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
	protected Publisher<eclipse_ros_msgs.ROSFrameworkLogEntry> frameworkLogEntryPublisher = null;
	
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
			frameworkLogEntryPublisher = connectedNode.newPublisher(topicName, eclipse_ros_msgs.ROSFrameworkLogEntry._TYPE);
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
		if(logListener == null)
		{
			logListener = new ILogListener() {
				
				@Override
				public void logging(IStatus status, String plugin) 
				{
					try
					{
						if(frameworkLogEntryPublisher != null)
						{						
							eclipse_ros_msgs.ROSFrameworkLogEntry entry = FrameworkLogUtils.convertToROSFrameworkLogEntry(status, connectedNode);
							frameworkLogEntryPublisher.publish(entry);
						}
					}
					catch(Throwable t)
					{						
					}
				}
			};
		}
		
		return logListener;
	}
}
