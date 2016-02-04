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

public final class GPSStateFactory {

	private GPSStateFactory() {

	}

	public static GPSState createState(GPS gps) {

		GPSState state = null;

		switch (gps.getStatus().getValue()) {
		case GPSStatus.CONNECTING_VALUE:
			state = new GPSStateConnecting(gps);
			break;
		case GPSStatus.STOPPED_VALUE:
			state = new GPSStateStopped(gps);
			break;
		case GPSStatus.FAILED_VALUE:
			state = new GPSStateFailed(gps);
			break;
		case GPSStatus.RECONNECTING_VALUE:
			state = new GPSStateReconnecting(gps);
			break;
		case GPSStatus.RUNNING_VALUE:
			state = new GPSStateRunning(gps);
			break;
		default:
			break;
		}

		return state;
	}

}
