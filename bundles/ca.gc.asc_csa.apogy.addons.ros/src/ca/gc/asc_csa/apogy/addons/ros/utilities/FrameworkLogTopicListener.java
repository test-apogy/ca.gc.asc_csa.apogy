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
