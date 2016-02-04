package ca.gc.asc_csa.apogy.core.invocator;
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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class SessionContributorsRegistry 
{
	public static final String SESSION_CONTRIBUTORS_POINT_ID = "ca.gc.asc_csa.apogy.core.invocator.sessionProvider";
	public static final String SESSION_CONTRIBUTORS_NAME_ID = "Name";
	public static final String SESSION_CONTRIBUTORS_DESCRIPTION_ID = "Description";
	public static final String SESSION_CONTRIBUTORS_URI_ID = "URI";
	
	private boolean verbose = false;
	private List<SessionContributor> registeredSessionProviders = null;

	public SessionContributorsRegistry()
	{		
	}
	
	public SessionContributorsRegistry(boolean verbose)
	{		
		this.verbose = verbose;
	}
	
	public List<SessionContributor> getRegisteredSessionProviders()
	{
		if(registeredSessionProviders == null)
		{
			registeredSessionProviders = new ArrayList<SessionContributor>();
			
			IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(SESSION_CONTRIBUTORS_POINT_ID);

			IConfigurationElement[] contributors = extensionPoint.getConfigurationElements();

			for (int i = 0; i < contributors.length; i++) 
			{
				IConfigurationElement contributor = contributors[i];

				try
				{
					String name = contributor.getAttribute(SESSION_CONTRIBUTORS_NAME_ID);
					String description = contributor.getAttribute(SESSION_CONTRIBUTORS_DESCRIPTION_ID);
					String uriString = contributor.getAttribute(SESSION_CONTRIBUTORS_URI_ID);
										
					URI uri = URI.createURI("platform:/plugin/"	+ contributor.getNamespaceIdentifier() + "/"+ uriString, true);
					
					SessionContributor sessionContributor = new SessionContributor(name, description, uri);
					registeredSessionProviders.add(sessionContributor);					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}				
			}
			
			if(verbose)
			{
				System.out.println("Registered Session Contributors :");
				for(SessionContributor sessionContributor : registeredSessionProviders)
				{
					System.out.println("\t Name        : " + sessionContributor.name);
					System.out.println("\t Description : " + sessionContributor.description);
					System.out.println("\t URI         : " + sessionContributor.uri);
					System.out.println("");
				}
			}
			
			Logger.INSTANCE.log(Activator.ID, this, "Found <" + registeredSessionProviders.size() + "> registered Session Providers.", EventSeverity.OK);
		}
		
		return registeredSessionProviders;
	}
}
