package ca.gc.asc_csa.apogy.addons.sensors.gps.state;
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

import ca.gc.asc_csa.apogy.addons.sensors.gps.GPS;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus;

public class GPSStateStopped extends GPSState {

	public GPSStateStopped(GPS gps) {
		super(gps);
	}

	@Override
	public void start() throws IllegalStateException {
		getGPS().setStatus(GPSStatus.CONNECTING);
		getGPS().setLastFailure(null);
	}	

}
