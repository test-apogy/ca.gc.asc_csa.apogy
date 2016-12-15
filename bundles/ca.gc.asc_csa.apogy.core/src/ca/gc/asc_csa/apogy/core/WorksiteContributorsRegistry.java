package ca.gc.asc_csa.apogy.core;
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

public class WorksiteContributorsRegistry 
{
	public static final String WORKSITE_CONTRIBUTORS_POINT_ID = "ca.gc.asc_csa.apogy.core.worksiteProvider";
	public static final String WORKSITE_CONTRIBUTORS_NAME_ID = "Name";
	public static final String WORKSITE_CONTRIBUTORS_DESCRIPTION_ID = "Description";
	public static final String WORKSITE_CONTRIBUTORS_URI_ID = "URI";
	
	private boolean verbose = false;
	private List<WorksiteContributor> registeredWorksiteProviders = null;

	public WorksiteContributorsRegistry()
	{		
	}
	
	public WorksiteContributorsRegistry(boolean verbose)
	{		
		this.verbose = verbose;
	}
	
	public List<WorksiteContributor> getRegisteredWorksiteProviders()
	{
		if(registeredWorksiteProviders == null)
		{
			registeredWorksiteProviders = new ArrayList<WorksiteContributor>();
			
			IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(WORKSITE_CONTRIBUTORS_POINT_ID);

			IConfigurationElement[] contributors = extensionPoint.getConfigurationElements();

			for (int i = 0; i < contributors.length; i++) 
			{
				IConfigurationElement contributor = contributors[i];

				try
				{
					String name = contributor.getAttribute(WORKSITE_CONTRIBUTORS_NAME_ID);
					String description = contributor.getAttribute(WORKSITE_CONTRIBUTORS_DESCRIPTION_ID);
					String uriString = contributor.getAttribute(WORKSITE_CONTRIBUTORS_URI_ID);
										
					URI uri = URI.createURI("platform:/plugin/"	+ contributor.getNamespaceIdentifier() + "/"+ uriString, true);
					
					WorksiteContributor sessionContributor = new WorksiteContributor(name, description, uri);
					registeredWorksiteProviders.add(sessionContributor);					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}				
			}
			
			if(verbose)
			{
				System.out.println("Worksite Contributors :");
				for(WorksiteContributor worksiteContributor : registeredWorksiteProviders)
				{
					System.out.println("\t Name        : " + worksiteContributor.name);
					System.out.println("\t Description : " + worksiteContributor.description);
					System.out.println("\t URI         : " + worksiteContributor.uri);
					System.out.println("");
				}
			}			
			Logger.INSTANCE.log(Activator.ID, this, "Found <" + registeredWorksiteProviders.size() + "> registered Worksite Providers.", EventSeverity.OK);
		}
		
		return registeredWorksiteProviders;
	}
}
