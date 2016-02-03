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

import ca.gc.asc_csa.apogy.addons.sensors.gps.Activator;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPS;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus;
import ca.gc.asc_csa.apogy.common.lang.java.Timer;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class GPSStateReconnecting extends GPSState {

	public GPSStateReconnecting(GPS gps) {
		super(gps);
	}

	@Override
	public void failure(Exception e) {
		super.failure(e);
		getGPS().setStatus(GPSStatus.FAILED);
	}

	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public boolean reconnect() throws IllegalStateException {

		if (getGPS().getConnection().getInput() == null) {
			IOException e = new IOException("Failed to connect gps");
			failure(e);
			return false;
		} else {

			boolean done = false;
			boolean success = false;

			Timer timer = new Timer();

			timer.start();

			while (!done) {
				try {
					getGPS().getConnection().reset();
					done = true;
					success = true;
				} catch (IOException e) {
					Logger.INSTANCE.log(Activator.ID, this, "Problem while reconnecting from gps, retrying: "
							+ e.getMessage(), EventSeverity.WARNING, e);

					// We sleep for a few milliseconds (500)
					try {
						Thread.sleep(500);
					} catch (InterruptedException e2) {

					}
				} finally {
					if (timer.elapsed() > getGPS().getMaxReconnectTime()) {
						done = true;
					}
				}
			}

			if (success) {
				getGPS().setStatus(GPSStatus.RUNNING);
			} else {
				Logger.INSTANCE.log(Activator.ID, this, "Error while reading from gps: "
						+ getGPS().getLastFailure().getMessage(), EventSeverity.ERROR);
				
				getGPS().setStatus(GPSStatus.FAILED);
			}

			return success;
		}
	}

}
