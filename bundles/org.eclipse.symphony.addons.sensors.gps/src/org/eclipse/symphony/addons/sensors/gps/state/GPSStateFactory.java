package org.eclipse.symphony.addons.sensors.gps.state;

import org.eclipse.symphony.addons.sensors.gps.GPS;
import org.eclipse.symphony.addons.sensors.gps.GPSStatus;

public final class GPSStateFactory {

	private GPSStateFactory() {

	}

	public static GPSState createState(GPS gps) {

		GPSState state = null;

		switch (gps.getStatus().getValue()) {
		case GPSStatus.CONNECTING_VALUE:
			state = new GPSStateConnecting(gps);
			break;
		case GPSStatus.STOPPED_VALUE:
			state = new GPSStateStopped(gps);
			break;
		case GPSStatus.FAILED_VALUE:
			state = new GPSStateFailed(gps);
			break;
		case GPSStatus.RECONNECTING_VALUE:
			state = new GPSStateReconnecting(gps);
			break;
		case GPSStatus.RUNNING_VALUE:
			state = new GPSStateRunning(gps);
			break;
		default:
			break;
		}

		return state;
	}

}
