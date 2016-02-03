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

import java.io.IOException;

import ca.gc.asc_csa.apogy.addons.sensors.gps.GPS;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus;

public class GPSStateConnecting extends GPSState {

	public GPSStateConnecting(GPS gps) {
		super(gps);
	}

	@Override
	public void failure(Exception e) {
		super.failure(e);
		getGPS().setStatus(GPSStatus.RECONNECTING);
		getGPS().reconnect();
	}

	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public void updateGPS() throws IllegalStateException {
		try {
			if (getGPS().getConnection().getInput() == null) {
				throw new IOException("Failed to connect gps");
			}
			getGPS().getDataInterpreter().updateGPS();
			getGPS().setStatus(GPSStatus.RUNNING);
		} catch (IOException e) {
			failure(e);
		}
	}

}
