/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.symphony.core.topology.ui.internal;

import ca.gc.space.topology.ui.Activator;

/**
 * Constants relating to the console plug-in.
 * 
 * @since 3.0
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IConstants {

	/**
	 * Console plug-in identifier (value <code>"org.eclipse.ui.console"</code>).
	 */
	public static final String ID = Activator.getDefault().getBundle()
			.getSymbolicName();

	// Enabled
	public static final String IMG_ELCL_NEW_TOPO_VIEW = "IMG_ELCL_NEW_CON";
	public static final String IMG_ELCL_PIN = "IMG_ELCL_PIN"; //$NON-NLS-1$

	// Disabled
	public static final String IMG_DLCL_PIN = "IMG_DLCL_PIN"; //$NON-NLS-1$

	/**
	 * Status code indicating an unexpected internal error.
	 */
	public static final int INTERNAL_ERROR = 120;

	public static final String IMG_ELCL_DISPLAY_3D_AXIS = "IMG_ELCL_DISPLAY_3D_AXIS";
	public static final String IMG_DLCL_DISPLAY_3D_AXIS = "IMG_DLCL_DISPLAY_3D_AXIS";

	public static final String IMG_ELCL_ANTIALIASING = "IMG_ELCL_ANTIALIASING";

	public static final String IMG_ELCL_VIEWPOINT = "IMG_ELCL_VIEWPOINT";
	public static final String IMG_ELCL_CAMERA = "IMG_ELCL_CAMERA";
	public static final String IMG_ELCL_ARBITRARY = "IMG_ELCL_ARBITRARY";

	/**
	 * Zoom to fit
	 */
	public static final String IMG_ELCL_ZOOM_TO_FIT = "IMG_ELCL_ZOOM_TO_FIT";

}
