package org.eclipse.symphony.addons.sensors.gps.state;

import org.eclipse.symphony.addons.sensors.gps.GPS;
import org.eclipse.symphony.addons.sensors.gps.GPS_STATUS;

public final class GPSStateFactory {

	private GPSStateFactory() {

	}

	public static GPSState createState(GPS gps) {

		GPSState state = null;

		switch (gps.getStatus().getValue()) {
		case GPS_STATUS.CONNECTING_VALUE:
			state = new GPSStateConnecting(gps);
			break;
		case GPS_STATUS.STOPPED_VALUE:
			state = new GPSStateStopped(gps);
			break;
		case GPS_STATUS.FAILED_VALUE:
			state = new GPSStateFailed(gps);
			break;
		case GPS_STATUS.RECONNECTING_VALUE:
			state = new GPSStateReconnecting(gps);
			break;
		case GPS_STATUS.RUNNING_VALUE:
			state = new GPSStateRunning(gps);
			break;
		default:
			break;
		}

		return state;
	}

}
