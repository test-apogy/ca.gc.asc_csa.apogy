package org.eclipse.symphony.common.io.jinput;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

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
			eControllerEnvironment = JInputFactory.eINSTANCE.createEControllerEnvironment();
		return eControllerEnvironment;
	}
}
