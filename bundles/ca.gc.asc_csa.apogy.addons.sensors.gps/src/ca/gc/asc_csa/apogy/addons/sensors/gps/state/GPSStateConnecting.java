package ca.gc.asc_csa.apogy.addons.sensors.gps.state;

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
