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

import java.util.List;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{
	public static final String ID = "ca.gc.asc_csa.apogy.core.invocator";
	
	private static SessionContributorsRegistry sessionContributorsRegistry = new SessionContributorsRegistry(false);
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	

	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		
		// DEBUG Force SessionProviders to be loaded.
		getRegisteredSessionProviders();
	}


	public void stop(BundleContext context) throws Exception {
		Activator.context = null;
	}

	/**
	 * Returns the list of registered Session Contributors.
	 * @return The list of registered Session Contributors, never null.
	 */
	public static synchronized List<SessionContributor> getRegisteredSessionProviders()
	{
		return sessionContributorsRegistry.getRegisteredSessionProviders();
	}
}
