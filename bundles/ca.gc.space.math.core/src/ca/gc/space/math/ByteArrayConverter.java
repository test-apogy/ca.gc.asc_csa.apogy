package ca.gc.space.math;

/**
 * 
 * @author seb <br>
 *         <br>
 * 
 * 'Creation date: 9-Nov-06 <br>
 * <br>
 * 
 * <br>
 * 
 * 'Description: this class is used to convert byte arrays to types such as:
 * <code>int, long, float, double</code>. The code was taken from <a
 * href="http://www.captain.at/howto-java-convert-binary-data.php">http://www.captain.at/howto-java-convert-binary-data.php</a><br>
 */
public final class ByteArrayConverter {

	/**
	 * Private constructor to prevent instance creation.
	 * 
	 */
	private ByteArrayConverter() {
	}

	/**
	 * Converts a byte array to a double. Takes <code>arr[start+8]</code> and
	 * converts it to a <code>double</code>.
	 * 
	 * @param arr
	 *            the byte array.
	 * @param start
	 *            the start position in <code>arr</a>
	 * @return the <code>double</code> encoded by <code>arr[start+8]</code>.
	 */
	public static double arr2double(byte[] arr, int start, boolean bigEndian) {

		checkPreCondition(arr, start, 8);

		int i = 0;
		int len = 8;		
		byte[] tmp = createTmpArray(arr, start, len, bigEndian);
		long accum = 0;
		i = 0;
		for (int shiftBy = 0; shiftBy < 64; shiftBy += 8) {
			accum |= ((long) (tmp[i] & 0xff)) << shiftBy;
			i++;
		}
		return Double.longBitsToDouble(accum);
	}

	/**
	 * Converts a byte array to a double. Takes <code>arr[start+4]</code> and
	 * converts it to a <code>long</code>.
	 * 
	 * @param arr
	 *            the byte array.
	 * @param start
	 *            the start position in <code>arr</a>
	 * @return the <code>long</code> encoded by <code>arr[start+4]</code>.
	 */
	public static long arr2long(byte[] arr, int start, boolean bigEndian) {

		checkPreCondition(arr, start, 4);

		int i = 0;
		int len = 4;		
		byte[] tmp = createTmpArray(arr, start, len, bigEndian);
		long accum = 0;
		i = 0;

		for (int shiftBy = 0; shiftBy < 32; shiftBy += 8) {
			accum |= ((long) (tmp[i] & 0xff)) << shiftBy;
			i++;
		}
		return accum;
	}

	/**
	 * Converts a byte array to a int. Takes <code>arr[start+2]</code> and
	 * converts it to a <code>int</code>.
	 * 
	 * @param arr
	 *            the byte array.
	 * @param start
	 *            the start position in <code>arr</a>
	 * @return the <code>int</code> encoded by <code>arr[start+2]</code>.
	 */
	public static int arr2int(byte[] arr, int start, boolean bigEndian) {

		checkPreCondition(arr, start, 2);

		int low;
		int high;

		if (bigEndian) {
			low = arr[start + 1] & 0xff;
			high = arr[start] & 0xff;
		} else {
			low = arr[start] & 0xff;
			high = arr[start + 1] & 0xff;
		}
		
		return (int) (high << 8 | low);
	}

	/**
	 * Converts a byte array to a float. Takes <code>arr[start+4]</code> and
	 * converts it to a <code>float</code>.
	 * 
	 * @param arr
	 *            the byte array.
	 * @param start
	 *            the start position in <code>arr</a>
	 * @return the <code>float</code> encoded by <code>arr[start+4]</code>.
	 */
	public static float arr2float(byte[] arr, int start, boolean bigEndian) {
		int i = 0;
		int len = 4;		
		byte[] tmp = createTmpArray(arr, start, len, bigEndian);
		int accum = 0;
		i = 0;
		for (int shiftBy = 0; shiftBy < 32; shiftBy += 8) {
			accum |= ((long) (tmp[i] & 0xff)) << shiftBy;
			i++;
		}
		return Float.intBitsToFloat(accum);
	}

	/**
	 * Checks the following pre-condition:
	 * <ul>
	 * <li><code>arr != null</code></li>
	 * <li><code>arr.length >= len</code></li>
	 * <li><code>start < 0</code></li>
	 * <li><code>start >= arr.length - len</li>
	 * </ul>
	 * If one of these conditions is not respected, an {@link IllegalArgumentException} is thrown.
	 * @param arr the array
	 * @param start the start position in the array.
	 * @param len the length to verify. For example, for a <code>double</code> it would be 8.
	 */
	private static void checkPreCondition(byte[] arr, int start, int len) {

		if (arr == null) {
			throw new IllegalArgumentException("arr is null.");
		}

		if (arr.length < len) {
			throw new IllegalArgumentException(
					"**Error, arr must be of length greater or equal to " + len);
		}

		if (start < 0 || start > arr.length - len) {
			throw new IllegalArgumentException(
					"**Error, start must be between [0" + (arr.length - len)
							+ "[");
		}
	}

	private static byte[] createTmpArray(byte[] arr, int start, int len,
			boolean bigEndian) {
		byte[] tmp = new byte[len];
		int cnt = bigEndian ? len - 1 : 0;

		for (int i = start; i < (start + len); i++) {
			tmp[cnt] = arr[i];
			if (bigEndian)
				cnt--;
			else
				cnt++;
		}

		return tmp;
	}

}
