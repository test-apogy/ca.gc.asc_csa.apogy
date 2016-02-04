package ca.gc.asc_csa.apogy.common.geometry.data3d.ui;
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

import java.util.Iterator;
import java.util.List;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;

public class CartesianCoordinatesSetAdapterFactory {

	/**
	 * The providers registered in this factory.
	 */
	private List<ICartesianCoordinatesSetProvider> providers;

	public CartesianCoordinatesSetAdapterFactory(
			List<ICartesianCoordinatesSetProvider> providers) {
		this.providers = providers;
	}

	/**
	 * We go through the providers and find the one who is suitable for the
	 * object.
	 * 
	 * @param object
	 *            the content node for which we want to find the appropriate
	 *            adapter.
	 * @return the appropriate {@link ICartesianCoordinatesSetProvider} and
	 *         <code>null</code> if no {@link ICartesianCoordinatesSetProvider}
	 *         is found.
	 */
	public CartesianCoordinatesSet adapt(ContentNode<?> object) {

		Iterator<ICartesianCoordinatesSetProvider> iterator = providers
				.iterator();

		CartesianCoordinatesSet content = null;

		while (iterator.hasNext() && content == null) {
			ICartesianCoordinatesSetProvider currentProvider = iterator.next();

			if (currentProvider.getDataSet(object) != null) {
				content = currentProvider.getDataSet(object);
			}
		}

		return content;
	}

}
