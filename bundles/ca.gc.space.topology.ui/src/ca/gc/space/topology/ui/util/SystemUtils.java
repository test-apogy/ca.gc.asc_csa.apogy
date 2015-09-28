package ca.gc.space.topology.ui.util;

public final class SystemUtils {

	private SystemUtils() {

	}

	public static double getUsedMemory() {
		System.gc();
		long total = Runtime.getRuntime().totalMemory();
		long used = total - Runtime.getRuntime().freeMemory();

		double usedInMeg = (double) used / (1024.0 * 1024.0);

		return usedInMeg;

	}

}
