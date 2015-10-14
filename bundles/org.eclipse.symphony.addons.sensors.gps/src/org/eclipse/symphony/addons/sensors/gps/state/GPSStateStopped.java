package org.eclipse.symphony.addons.sensors.gps.state;

import org.eclipse.symphony.addons.sensors.gps.GPS;
import org.eclipse.symphony.addons.sensors.gps.GPSStatus;

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
