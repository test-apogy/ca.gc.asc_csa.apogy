package ca.gc.asc_csa.eclipse.ros.utilities;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.osgi.framework.log.FrameworkLogEntry;
import org.ros.node.ConnectedNode;

public class FrameworkLogUtils 
{
	public static eclipse_ros_msgs.ROSFrameworkLogEntry convertToROSFrameworkLogEntry(IStatus status, final ConnectedNode connectedNode)
	{
		eclipse_ros_msgs.ROSFrameworkLogEntry entry = connectedNode.getTopicMessageFactory().newFromType(eclipse_ros_msgs.ROSFrameworkLogEntry._TYPE);		
		
		entry.setBundleName(status.getPlugin());
		entry.setMessage(status.getMessage());
		
		byte severity = (byte) status.getSeverity();		
		entry.setSeverity(severity);
		
		if(status.getException() != null)
		{
			entry.setThrowableMessage(status.getException().getMessage());
		}
		
		return entry;
	}	
	
	public static eclipse_ros_msgs.ROSFrameworkLogEntry convertToROSFrameworkLogEntry(FrameworkLogEntry frameworkLogEntry, final ConnectedNode connectedNode)
	{
		eclipse_ros_msgs.ROSFrameworkLogEntry entry = connectedNode.getTopicMessageFactory().newFromType(eclipse_ros_msgs.ROSFrameworkLogEntry._TYPE);		
		
		entry.setBundleName(frameworkLogEntry.getEntry());
		entry.setMessage(frameworkLogEntry.getMessage());
		
		byte severity = (byte) frameworkLogEntry.getSeverity();		
		entry.setSeverity(severity);
		
		if(frameworkLogEntry.getThrowable() != null)
		{
			entry.setThrowableMessage(frameworkLogEntry.getThrowable().getMessage());
		}
		
		return entry;
	}	

	public static FrameworkLogEntry convertToFrameworkLogEntry(String messagePrefix, eclipse_ros_msgs.ROSFrameworkLogEntry rosFrameworkLogEntry)
	{
		String bundleName = rosFrameworkLogEntry.getBundleName();
		int severity = rosFrameworkLogEntry.getSeverity();
		
		String fullMessage = rosFrameworkLogEntry.getMessage();
		if(messagePrefix != null)
		{
			fullMessage = messagePrefix + fullMessage;
		}
		
		Throwable throwable = null;
		if(rosFrameworkLogEntry.getThrowableMessage() != null && rosFrameworkLogEntry.getThrowableMessage().length() > 0)
		{
			throwable = new Throwable(rosFrameworkLogEntry.getThrowableMessage());
		}				
		
		FrameworkLogEntry frameworkLogEntry = new FrameworkLogEntry(bundleName, severity, 0, fullMessage, 0, throwable, null);		
		return frameworkLogEntry;
	}
}
