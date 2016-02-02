package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.adapters;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ICartesianCoordinatesSetProvider;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;

public class CartesianCoordinatesAdapter implements
		ICartesianCoordinatesSetProvider {

	@Override
	public CartesianCoordinatesSet getDataSet(ContentNode<?> contentNode) {
		if (contentNode.getContent() instanceof CartesianCoordinatesSet) {
			CartesianCoordinatesSet content = (CartesianCoordinatesSet) contentNode
					.getContent();
			return content;
		} else {
			return null;
		}
	}

}
