package org.eclipse.symphony.common.lang.java;

/**
 * 
 * 'Description: this object represents an Object associated with a double
 * value. This class is useful for sorting.
 * 
 * @author sgemme
 * 
 * @param <T>
 *            the object that contains the value.
 */
public class ObjectValueData<T> implements Comparable<ObjectValueData<T>> {

	/**
	 * The object.
	 */
	private T obj;

	/**
	 * The value associated to it, which will be used for comparison.
	 */
	public double value;

	public ObjectValueData(T obj, double value) {
		this.obj = obj;
		this.value = value;
	}

	public T getObj() {
		return obj;
	}

	public double getValue() {
		return value;
	}

	@Override
	public int compareTo(ObjectValueData<T> o) {

		if (o == null) {
			throw new IllegalArgumentException("Error o is null");
		}

		int ret = 0;

		if (this.getValue() < o.getValue()) {
			ret = -1;
		} else if (this.getValue() > o.getValue()) {
			ret = 1;
		}

		return ret;
	}

}
