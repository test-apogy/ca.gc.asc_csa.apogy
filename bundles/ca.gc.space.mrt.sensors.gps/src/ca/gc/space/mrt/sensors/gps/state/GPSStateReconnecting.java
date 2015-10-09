package ca.gc.space.mrt.sensors.gps.state;

import java.io.IOException;

import org.eclipse.symphony.common.lang.java.Timer;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.space.mrt.sensors.gps.Activator;
import ca.gc.space.mrt.sensors.gps.GPS;
import ca.gc.space.mrt.sensors.gps.GPS_STATUS;

public class GPSStateReconnecting extends GPSState {

	public GPSStateReconnecting(GPS gps) {
		super(gps);
	}

	@Override
	public void failure(Exception e) {
		super.failure(e);
		getGPS().setStatus(GPS_STATUS.FAILED);
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
				getGPS().setStatus(GPS_STATUS.RUNNING);
			} else {
				Logger.INSTANCE.log(Activator.ID, this, "Error while reading from gps: "
						+ getGPS().getLastFailure().getMessage(), EventSeverity.ERROR);
				
				getGPS().setStatus(GPS_STATUS.FAILED);
			}

			return success;
		}
	}

}
