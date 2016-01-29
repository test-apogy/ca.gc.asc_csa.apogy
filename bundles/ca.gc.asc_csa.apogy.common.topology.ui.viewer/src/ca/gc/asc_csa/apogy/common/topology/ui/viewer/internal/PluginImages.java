/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;

/**
 * The images provided by the debug plugin.
 */
public class PluginImages {

	/**
	 * The image registry containing <code>Image</code>s and the
	 * <code>ImageDescriptor</code>s.
	 */
	private static ImageRegistry imageRegistry;

	/* Declare Common paths */
	private static URL ICON_BASE_URL = null;

	static {
		String pathSuffix = "icons/full/"; //$NON-NLS-1$		
		ICON_BASE_URL = Activator.getBundleContext().getBundle()
				.getEntry(pathSuffix);
	}

	// Use IPath and toOSString to build the names to ensure they have the
	// slashes correct
	//	private final static String LOCALTOOL = "clcl16/"; //basic colors - size 16x16 //$NON-NLS-1$
	private final static String DLCL = "dlcl16/"; //disabled - size 16x16 //$NON-NLS-1$
	private final static String ELCL = "elcl16/"; //enabled - size 16x16 //$NON-NLS-1$

	//	private final static String VIEW = "cview16/"; // views //$NON-NLS-1$

	/**
	 * Declare all images
	 */
	private static void declareImages() {
		// Actions

		// Enabled
		declareRegistryImage(IConstants.IMG_ELCL_NEW_TOPO_VIEW, ELCL+ "new_con.gif"); //$NON-NLS-1$		
		declareRegistryImage(IConstants.IMG_ELCL_PIN, ELCL + "pin.gif"); //$NON-NLS-1$
		declareRegistryImage(IConstants.IMG_ELCL_DISPLAY_3D_AXIS, ELCL	+ "Photoshop3DAxis.png"); //$NON-NLS-1$
		declareRegistryImage(IConstants.IMG_ELCL_ANTIALIASING, ELCL	+ "anti_aliasing_filter_icon.jpg"); //$NON-NLS-1$
		declareRegistryImage(IConstants.IMG_ELCL_VIEWPOINT, ELCL + "test.png"); //$NON-NLS-1$
		declareRegistryImage(IConstants.IMG_ELCL_CAMERA, ELCL+ "camera-lens.png"); //$NON-NLS-1$
		declareRegistryImage(IConstants.IMG_ELCL_ARBITRARY, ELCL+ "layer-shape-polygon.png"); //$NON-NLS-1$
		
		declareRegistryImage(IConstants.IMG_ELCL_ZOOM_TO_FIT, ELCL+ "Gnome-Zoom-Fit-Best-16.png"); //$NON-NLS-1$

		declareRegistryImage(IConstants.IMG_ELCL_LEVEL_VIEWPOINT, ELCL + "levelView.gif");
		declareRegistryImage(IConstants.IMG_ELCL_ENABLE_HIGH_SPEED_MOTION, ELCL + "highSpeedMotion.gif");
		declareRegistryImage(IConstants.IMG_ELCL_ENABLE_PICKING_MODE, ELCL + "pickingMode.gif");
		
		// Disabled
		declareRegistryImage(IConstants.IMG_DLCL_PIN, DLCL + "pin.gif"); //$NON-NLS-1$
		declareRegistryImage(IConstants.IMG_DLCL_DISPLAY_3D_AXIS, DLCL+ "Photoshop3DAxis.png"); //$NON-NLS-1$

		declareRegistryImage(IConstants.IMG_NAVIGATION_MODE,  ELCL + "SelectNavigationMode.gif");
		declareRegistryImage(IConstants.IMG_OBSERVATION_MODE, ELCL + "SelectObservationMode.gif");
		
		declareRegistryImage(IConstants.IMG_TAKE_SCREENSHOT, ELCL + "takeScreenshot.gif");		
		declareRegistryImage(IConstants.IMG_ELCL_STATISTICS, ELCL + "viewer_statistics.gif");
		
			
		
	}

	/**
	 * Declare an Image in the registry table.
	 * 
	 * @param key
	 *            The key to use when registering the image
	 * @param path
	 *            The path where the image can be found. This path is relative
	 *            to where this plugin class is found (i.e. typically the
	 *            packages directory)
	 */
	@SuppressWarnings("unused")
	private final static void declareRegistryImage(String key, String path) {
		ImageDescriptor desc = ImageDescriptor.getMissingImageDescriptor();
		try {
			URL url = makeIconFileURL(path);

			try {
				URL fileURL = FileLocator.toFileURL(url);
			} catch (IOException e) {
				e.printStackTrace();
			}
			desc = ImageDescriptor.createFromURL(url);

		} catch (MalformedURLException me) {
			me.printStackTrace();
			// ConsolePlugin.log(me);
		}
		imageRegistry.put(key, desc);
	}

	/**
	 * Returns the ImageRegistry.
	 */
	public static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			initializeImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * Initialize the image registry by declaring all of the required graphics.
	 * This involves creating JFace image descriptors describing how to
	 * create/find the image should it be needed. The image is not actually
	 * allocated until requested.
	 * 
	 * Prefix conventions Wizard Banners WIZBAN_ Preference Banners PREF_BAN_
	 * Property Page Banners PROPBAN_ Color toolbar CTOOL_ Enable toolbar ETOOL_
	 * Disable toolbar DTOOL_ Local enabled toolbar ELCL_ Local Disable toolbar
	 * DLCL_ Object large OBJL_ Object small OBJS_ View VIEW_ Product images
	 * PROD_ Misc images MISC_
	 * 
	 * Where are the images? The images (typically gifs) are found in the same
	 * location as this plugin class. This may mean the same package directory
	 * as the package holding this class. The images are declared using
	 * this.getClass() to ensure they are looked up via this plugin class.
	 * 
	 * @see org.eclipse.jface.resource.ImageRegistry
	 */
	public static ImageRegistry initializeImageRegistry() {
		imageRegistry = new ImageRegistry();
		declareImages();
		return imageRegistry;
	}

	/**
	 * Returns the <code>Image<code> identified by the given key,
	 * or <code>null</code> if it does not exist.
	 */
	public static Image getImage(String key) {
		return getImageRegistry().get(key);
	}

	/**
	 * Returns the <code>ImageDescriptor<code> identified by the given key,
	 * or <code>null</code> if it does not exist.
	 */
	public static ImageDescriptor getImageDescriptor(String key) {
		return getImageRegistry().getDescriptor(key);
	}

	private static URL makeIconFileURL(String iconPath)
			throws MalformedURLException {
		if (ICON_BASE_URL == null) {
			throw new MalformedURLException();
		}

		return new URL(ICON_BASE_URL, iconPath);
	}
}