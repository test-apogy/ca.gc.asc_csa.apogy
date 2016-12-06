package ca.gc.asc_csa.apogy.common.io.jinput;
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

import java.util.logging.Level;
import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	public static final String ID = "ca.gc.asc_csa.apogy.common.io.jinput"; //$NON-NLS-1$

	private static final String LOGGER_NAME = "net.java.games.input"; 
	private static final Level LOGGER_LEVEL = Level.WARNING;
	
	private static Level origLevel;
	private static BundleContext context;
	private static EControllerEnvironment eControllerEnvironment = null;
	
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		Logger logger = Logger.getLogger(LOGGER_NAME);
		origLevel = logger.getLevel();
		logger.setLevel(LOGGER_LEVEL);
		
		getEControllerEnvironment().startPolling();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		getEControllerEnvironment().stopPolling();
		
		Logger logger = Logger.getLogger(LOGGER_NAME);
		logger.setLevel(origLevel);
		
		Activator.context = null;
	}
	
	/** 
	 * Returns the reference to the {@link EControllerEnvironment} singleton.
	 * @return Reference to the {@link EControllerEnvironment} singleton.
	 */
	public static EControllerEnvironment getEControllerEnvironment() {
		if (eControllerEnvironment == null)
			eControllerEnvironment = ApogyCommonIOJInputFactory.eINSTANCE.createEControllerEnvironment();
		return eControllerEnvironment;
	}
}
