package ca.gc.asc_csa.apogy.addons.ros.utilities;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.ArrayList;
import java.util.List;

import org.ros.RosRun;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import ca.gc.asc_csa.apogy.addons.ros.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

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
