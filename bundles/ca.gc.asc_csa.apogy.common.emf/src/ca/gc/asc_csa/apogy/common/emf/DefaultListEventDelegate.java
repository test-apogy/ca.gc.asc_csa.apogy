package ca.gc.asc_csa.apogy.common.emf;
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

import java.util.List;

public class DefaultListEventDelegate<T> implements ListEventDelegate<T> {

	@Override
	public void added(T element) {

	}

	@Override
	public void addedMany(List<T> elements) {
		for (T t : elements) {
			added(t);
		}

	}

	@Override
	public void removed(T element) {

	}

	@Override
	public void removedMany(List<T> elements) {
		for (T t : elements) {
			removed(t);
		}

	}

}
