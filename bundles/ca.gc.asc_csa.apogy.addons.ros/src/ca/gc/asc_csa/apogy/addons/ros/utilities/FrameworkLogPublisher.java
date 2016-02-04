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
	protected Publisher<ca.gc.asc_csa.apogy.addons.ros.messages.ROSFrameworkLogEntry> frameworkLogEntryPublisher = null;
	
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
			frameworkLogEntryPublisher = connectedNode.newPublisher(topicName, ca.gc.asc_csa.apogy.addons.ros.messages.ROSFrameworkLogEntry._TYPE);
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
							ca.gc.asc_csa.apogy.addons.ros.messages.ROSFrameworkLogEntry entry = FrameworkLogUtils.convertToROSFrameworkLogEntry(status, connectedNode);
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
