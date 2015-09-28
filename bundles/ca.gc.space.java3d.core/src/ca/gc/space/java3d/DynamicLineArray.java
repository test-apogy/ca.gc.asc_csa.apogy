package ca.gc.space.java3d;

import java.util.ArrayList;
import java.util.Collection;

import javax.media.j3d.LineArray;
import javax.media.j3d.PointArray;
import javax.media.j3d.Shape3D;
import javax.vecmath.Point3d;

/**
 * A list of Point3D that is represented as Shape3D.
 * @author pallard
 *
 */
public class DynamicLineArray extends ArrayList<Point3d>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6312840848830523465L;
	
	private LineArray lineArray;
	private Shape3D shape;
	private boolean duplicateVertices = true;

	public DynamicLineArray()
	{
		shape = new Shape3D();
		shape.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
		shape.setCapability(Shape3D.ALLOW_GEOMETRY_READ);
	}
	
	/**
	 * Returns the Shape3D associated with the list of Point3d
	 * @return The Shape3D.
	 */
	public Shape3D getShape3D()
	{
		return shape;
	}
	
	/**
	 * Returns whether or not vertices are duplicated to created continuous lines.
	 * between all points.
	 * @return True if vertices are duplicated, false otherwise.
	 */
	public boolean isDuplicateVertices()
	{
		return duplicateVertices;
	}

	/**
	 * Sets whether or not vertices are duplicated to created continuous lines.
	 * @param duplicateVertices True duplicates vertices, false does not.
	 */
	public void setDuplicateVertices(boolean duplicateVertices)
	{
		this.duplicateVertices = duplicateVertices;
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
	 * Updates the LineArray to reflect the list of Point3d.
	 */
	public void update()
	{			
		try
		{						
			if(this.size() > 1)
			{			
				LineArray newLineArray = null;
				if(duplicateVertices)
				{				
					Point3d[] data = new Point3d[(this.size() - 1) * 2];						
					int index = 0;
					for(int i = 0; i < data.length; i++)
					{
						data[i] = this.get(index);
						if(Math.IEEEremainder(i,2) == 0)
						{
							index++;
						}														
					}
					newLineArray = new LineArray(data.length, PointArray.COORDINATES);	
					newLineArray.setCoordinates(0, data, 0, data.length);
				}
				else
				{					
					int size = (int) Math.round(Math.floor(this.size() / 2)) * 2;
					newLineArray = new LineArray(size, PointArray.COORDINATES);
					Point3d[] data = new Point3d[this.size()];
					this.toArray(data);
					newLineArray.setCoordinates(0, data, 0, size);
				}
				shape.addGeometry(newLineArray);
				shape.removeGeometry(lineArray);
				lineArray = newLineArray;
			}	
			else if(lineArray != null)
			{
				shape.removeGeometry(lineArray);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
