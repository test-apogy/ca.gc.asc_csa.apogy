package ca.gc.asc_csa.apogy.common.geometry.data3d.decorators;
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

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

public class CartesianPositionCoordinatesDecorator implements ILightweightLabelDecorator
{

	public void decorate(Object element, IDecoration decoration)
	{
		CartesianPositionCoordinates position = (CartesianPositionCoordinates) element;
		decoration.addSuffix("(" + position.getX() + ", " + position.getY() + ", "+ position.getZ() + ")");
	}

	public void addListener(ILabelProviderListener listener)
	{
	}

	public void dispose()
	{
	}

	public boolean isLabelProperty(Object element, String property)
	{
		return true;
	}

	public void removeListener(ILabelProviderListener listener)
	{
	}
}
