package ca.gc.space.mrt.sensors.gps.state;

import java.io.IOException;

import ca.gc.space.mrt.sensors.gps.GPS;
import ca.gc.space.mrt.sensors.gps.GPS_STATUS;

public class GPSStateConnecting extends GPSState {

	public GPSStateConnecting(GPS gps) {
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
	public void updateGPS() throws IllegalStateException {
		try {
			if (getGPS().getConnection().getInput() == null) {
				throw new IOException("Failed to connect gps");
			}
			getGPS().getDataInterpreter().updateGPS();
			getGPS().setStatus(GPS_STATUS.RUNNING);
		} catch (IOException e) {
			failure(e);
		}
	}

}
