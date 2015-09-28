package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.Collection;

import javax.media.j3d.PointArray;
import javax.media.j3d.Shape3D;
import javax.vecmath.Point3d;

/**
 * A list of Point3D that is represented as Shape3D.
 * @author pallard
 *
 */
public class DynamicPointArray extends ArrayList<Point3d>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1392857617045899538L;
	private PointArray pointArray;
	private Shape3D shape;
	
	public DynamicPointArray()
	{
		shape = new Shape3D();
		shape.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
		shape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);
		shape.setCapability(Shape3D.ALLOW_APPEARANCE_WRITE);
		shape.setCapability(Shape3D.ALLOW_APPEARANCE_READ);
	}
	
	/**
	 * Returns the Shape3D associated with the list of Point3d
	 * @return The Shape3D.
	 */
	public Shape3D getShape3D()
	{
		return shape;
	}
	
	@Override
	public Point3d set(int index, Point3d element)
	{
		Point3d result = super.set(index, element);
		update();
		return result;
	}
	
	@Override
	public boolean add(Point3d e)
	{	
		boolean result = super.add(e);
		update();
		return result;
	}
	
	@Override
	public void add(int index, Point3d element)
	{
		super.add(index, element);
		update();
	}
	
	@Override
	public boolean addAll(Collection<? extends Point3d> c)
	{		
		boolean result = super.addAll(c);
		update();
		return result;
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends Point3d> c)
	{		
		boolean result =  super.addAll(index, c);
		update();
		return result;
	}
	
	@Override
	public boolean remove(Object o)
	{		
		boolean result = super.remove(o);
		update();
		return result;
	}
	
	@Override
	public Point3d remove(int index)
	{		
		Point3d result =  super.remove(index);
		update();
		return result;
	}	
	
	@Override
	public boolean removeAll(Collection<?> c)
	{		
		boolean result = super.removeAll(c);
		update();
		return result;
	}		
	
	@Override
	public void clear()
	{		
		super.clear();
		update();
	}
	
	@Override
	public boolean retainAll(Collection<?> c)
	{		
		boolean result = super.retainAll(c);
		update();
		return result;
	}		
	
	/**
	 * Updates the PointArray to reflect the list of Point3d.
	 */
	public void update()
	{					
		if(this.size() != 0)
		{			
			PointArray newPointArray = new PointArray(this.size(), PointArray.COORDINATES);			
			newPointArray.setCapability(PointArray.ALLOW_COORDINATE_WRITE);
			Point3d[] data = new Point3d[this.size()];
			
			this.toArray(data);
			newPointArray.setCoordinates(0, data, 0, this.size());	
			
			// Adds new geometry
			shape.addGeometry(newPointArray);
			
			// Removes old geometry
			shape.removeGeometry(pointArray);
						
			pointArray = newPointArray;
		}	
		else if(pointArray != null)
		{
			shape.removeGeometry(pointArray);
		}
	}
}
