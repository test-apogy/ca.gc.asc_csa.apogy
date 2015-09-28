package ca.gc.space.java3d;

import java.text.NumberFormat;
import java.util.Enumeration;

import javax.media.j3d.Behavior;
import javax.media.j3d.WakeupOnElapsedFrames;

import org.eclipse.core.runtime.Status;

public class FrameClock extends Behavior {

	private static final long STATS_PERIOD = 5000;
	private WakeupOnElapsedFrames f;
	private int frameCount = 0;
	private long t0;

	@Override
	public void initialize() {
		System.out.println("FrameClock.initialize()");
		f = new WakeupOnElapsedFrames(1);

		t0 = System.currentTimeMillis();

		frameCount = 0;

		wakeupOn(f);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void processStimulus(Enumeration arg0) {
		frameCount++;
		long tNow = System.currentTimeMillis();

		if ((tNow - t0) >= STATS_PERIOD) {
			System.out.println("FrameClock.processStimulus()");
			double delta = (double) (tNow - t0) / 1000.0;
			double fps = (double) frameCount / delta;
			t0 = tNow;
			Status logEntry = new Status(Status.INFO, Activator.PLUGIN_ID,
					"FPS: " + NumberFormat.getInstance().format(fps));
			frameCount = 0;
			Activator.getDefault().getLog().log(logEntry);

		}

		wakeupOn(f);

	}

}
