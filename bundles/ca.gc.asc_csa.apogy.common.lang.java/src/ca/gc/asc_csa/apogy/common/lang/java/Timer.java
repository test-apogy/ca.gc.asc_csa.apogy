package org.eclipse.symphony.common.lang.java;

/**
 * A time class.
 * 
 * 
 * @author sgemme
 * 
 */
public class Timer {

	private long t0;
	private long total;
	private int n;

	public Timer() {
		total = 0;
		n = 0;
	}

	/**
	 * Resets the timer:
	 * <ul>
	 * <li>t0 = 0</li>
	 * <li>total = 0</li>
	 * <li>n = 0</li>
	 * </ul>
	 */
	public void reset() {
		t0 = 0;
		total = 0;
		n = 0;
	}

	/**
	 * Starts the timer.
	 */
	public void start() {
		t0 = System.currentTimeMillis();
	}

	/**
	 * Stops the timer and returns the elapsed time, in ms, since the
	 * {@link #start()} method was called.
	 * 
	 * @return
	 */
	public long stop() {

		long delta = System.currentTimeMillis() - t0;
		n++;
		total += delta;

		return delta;
	}

	/**
	 * 
	 * @return The elapsed time since the call to 'start()'.
	 */
	public long elapsed() {
		long delta = System.currentTimeMillis() - t0;

		return delta;
	}

	/**
	 * 
	 * @return the average time between {@link #start()} and {@link #stop()}
	 *         calls.
	 */
	public double average() {
		if (n == 0) {
			return 0.0;
		} else {
			return (double) total / (double) n;
		}
	}

	public double getTotal() {
		return total;
	}

}
