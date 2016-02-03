package ca.gc.asc_csa.apogy.common.lang.java;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
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
