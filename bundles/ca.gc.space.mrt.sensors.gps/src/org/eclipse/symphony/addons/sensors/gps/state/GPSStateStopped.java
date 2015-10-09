package org.eclipse.symphony.addons.sensors.gps.state;

import org.eclipse.symphony.addons.sensors.gps.GPS;
import org.eclipse.symphony.addons.sensors.gps.GPS_STATUS;

public class GPSStateStopped extends GPSState {

	public GPSStateStopped(GPS gps) {
		super(gps);
	}

	@Override
	public void start() throws IllegalStateException {
		getGPS().setStatus(GPS_STATUS.CONNECTING);
		getGPS().setLastFailure(null);
	}	

}
