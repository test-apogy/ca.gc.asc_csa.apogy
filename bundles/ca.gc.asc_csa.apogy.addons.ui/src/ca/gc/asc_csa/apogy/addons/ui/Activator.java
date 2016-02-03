package ca.gc.asc_csa.apogy.addons.ui;
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

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin implements BundleActivator 
{
	public static final String ID = "ca.gc.asc_csa.apogy.addons.ui";
	
	// The shared instance
	private static Activator plugin;	
	
	private static BundleContext context;
	
	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public static BundleContext getContext() {
		return context;
	}
	
	public Activator()
	{
		plugin = this;
	}
	
	@Override
	public void start(BundleContext context) throws Exception 
	{		
		Activator.context = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {		
		Activator.context = null;
	}
}