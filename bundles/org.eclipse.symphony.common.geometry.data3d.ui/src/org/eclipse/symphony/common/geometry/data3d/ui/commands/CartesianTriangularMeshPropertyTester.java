package org.eclipse.symphony.common.geometry.data3d.ui.commands;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;

public class CartesianTriangularMeshPropertyTester extends PropertyTester 
{
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) 
	{
		CartesianTriangularMesh mesh = (CartesianTriangularMesh) receiver;
		
		if(property.equals("pointsNotEmpty"))
		{
			return mesh.getPoints().size() > 0;
		}
		else if(property.equals("trianglesNotEmpty"))
		{
			return mesh.getPolygons().size() > 0;
		}
		else
		{
			return false;
		}				
	}
}
