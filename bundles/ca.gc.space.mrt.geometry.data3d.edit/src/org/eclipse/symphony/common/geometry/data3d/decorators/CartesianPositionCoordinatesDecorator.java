package org.eclipse.symphony.common.geometry.data3d.decorators;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

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
