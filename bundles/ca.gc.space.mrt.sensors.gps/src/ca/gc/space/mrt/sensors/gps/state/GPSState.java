package ca.gc.space.mrt.sensors.gps.state;

import ca.gc.space.mrt.sensors.gps.GPS;
import ca.gc.space.mrt.sensors.gps.GPS_STATUS;

/**
 * Implements the <a href="http://en.wikipedia.org/wiki/State_pattern">state
 * pattern</a> for the gps.
 * 
 * @author sgemme
 * 
 */
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
		getGPS().setStatus(GPS_STATUS.STOPPED);
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
