package org.eclipse.symphony.addons.ros.utilities;

import java.util.ArrayList;
import java.util.List;

import org.ros.RosRun;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.eclipse.symphony.addons.ros.Activator;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

public class ROSNodeMain extends AbstractNodeMain
{
	private String nodeName;
	
	public ROSNodeMain ( String nodeName )
	{
		this.nodeName = nodeName;
	}
	
	@Override
	public GraphName getDefaultNodeName()
	{
		return GraphName.of(nodeName);
	}
	
	public void start ( )
	{
		try
		{
			RosRun.main(this);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Event called when the node is connected to the ROS master <br>
	 * <br>
	 * Start the subscriber handler and the service clients handler
	 */
	@Override
	public void onStart(ConnectedNode connectedNode) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Node connected", EventSeverity.INFO);
		
		for ( NodeStartedListener l : nodeStartedListeners )
		{
			l.nodeStarted(connectedNode);
		}
	}
	
	private List<NodeStartedListener> nodeStartedListeners = new ArrayList<NodeStartedListener>();
	
	public interface NodeStartedListener
	{
		public void nodeStarted(ConnectedNode connectedNode);
	}
	
	public void addNodeStartedListener(NodeStartedListener l)
	{
		nodeStartedListeners.add(l);
	}
}
