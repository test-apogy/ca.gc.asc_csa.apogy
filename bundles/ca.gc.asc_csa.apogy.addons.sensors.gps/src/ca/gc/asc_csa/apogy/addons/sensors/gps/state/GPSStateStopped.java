package ca.gc.asc_csa.apogy.addons.sensors.gps.state;

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
