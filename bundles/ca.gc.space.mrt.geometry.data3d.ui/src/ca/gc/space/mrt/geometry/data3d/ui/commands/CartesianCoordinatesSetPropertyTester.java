package ca.gc.space.mrt.geometry.data3d.ui.commands;

import org.eclipse.core.expressions.PropertyTester;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;

public class CartesianCoordinatesSetPropertyTester extends PropertyTester
{

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) 
	{
		CartesianCoordinatesSet coordinatesSet = (CartesianCoordinatesSet) receiver;
		
		if(property.equals("pointsNotEmpty"))
		{
			return coordinatesSet.getPoints().size() > 0;
		}
		else
		{
			return false;
		}				
	}
	 
}
