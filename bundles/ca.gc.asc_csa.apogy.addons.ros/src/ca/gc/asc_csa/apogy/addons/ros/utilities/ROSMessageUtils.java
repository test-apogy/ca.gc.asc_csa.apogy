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

import java.util.Date;

public class ROSMessageUtils 
{
	/**
	 * Converts a ROS Header Time to a Date.
	 * @param time The ROS Time.
	 * @return The associated Date.
	 */
	public static Date convertToDate(org.ros.message.Time time)
	{
		long milliseconds = Math.round(time.totalNsecs() * 0.001); 
		return new Date(milliseconds);
	}
}
