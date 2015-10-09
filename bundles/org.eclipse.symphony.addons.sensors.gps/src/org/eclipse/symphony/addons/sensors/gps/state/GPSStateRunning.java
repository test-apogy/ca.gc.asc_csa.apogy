package org.eclipse.symphony.addons.sensors.gps.state;

import java.io.IOException;

import org.eclipse.symphony.addons.sensors.gps.GPS;
import org.eclipse.symphony.addons.sensors.gps.GPS_STATUS;

public class GPSStateRunning extends GPSState {

	public GPSStateRunning(GPS gps) {
		super(gps);
	}

	@Override
	public void failure(Exception e) {
		super.failure(e);
		getGPS().setStatus(GPS_STATUS.RECONNECTING);
		getGPS().reconnect();
	}

	@Override
	public boolean isRunning() {
		return true;
	}

	@Override
	public void stop() throws IllegalStateException {
		getGPS().setStatus(GPS_STATUS.STOPPED);
		getGPS().setLastFailure(null);
	}

	@Override
	public void updateGPS() throws IllegalStateException {
		try {
			getGPS().getDataInterpreter().updateGPS();
		} catch (IOException e) {
			failure(e);
		}
	}

}