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

public abstract class GPSState {

	private GPS gps;

	public GPSState(GPS gps) {

		if (gps == null) {
			throw new IllegalArgumentException();
		}

		this.gps = gps;
	}

	public GPS getGPS() {
		return gps;
	}

	public void start() throws IllegalStateException {
		throw new IllegalStateException();
	}

	public void stop() throws IllegalStateException {
		throw new IllegalStateException();
	}

	public void reset() throws IllegalStateException {
		getGPS().setStatus(GPSStatus.STOPPED);
		getGPS().setLastFailure(null);
	}

	public void updateGPS() throws IllegalStateException {
		throw new IllegalStateException();
	}

	public boolean isRunning() {
		return false;
	}

	public boolean reconnect() throws IllegalStateException {
		throw new IllegalStateException();
	}

	public void failure(Exception e) {
		getGPS().setLastFailure(e);
	}

}
