package ca.gc.space.mrt.sensors.gps.state;

import ca.gc.space.mrt.sensors.gps.GPS;
import ca.gc.space.mrt.sensors.gps.GPS_STATUS;

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
