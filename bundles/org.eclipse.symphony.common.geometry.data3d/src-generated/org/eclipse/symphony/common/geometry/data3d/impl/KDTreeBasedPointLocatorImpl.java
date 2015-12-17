/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.KDTreeBasedPointLocator;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;

import edu.wlu.cs.levy.CG.KDTree;
import edu.wlu.cs.levy.CG.KeyDuplicateException;
import edu.wlu.cs.levy.CG.KeySizeException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KD Tree Based Point Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class KDTreeBasedPointLocatorImpl extends PointLocatorImpl implements KDTreeBasedPointLocator 
{
	List<CartesianPositionCoordinates> pointsToSearch = new ArrayList<CartesianPositionCoordinates>();
	
	private boolean isDirty;

	private KDTree kdTree;

	private double[] queryBuffer1;

	private double[] queryBuffer2;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KDTreeBasedPointLocatorImpl() 
	{
		super();
	}

	@Override
	protected void finalize() throws Throwable 
	{
		pointsToSearch.clear();
		super.finalize();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() 
	{
		return Symphony__CommonGeometryData3DPackage.Literals.KD_TREE_BASED_POINT_LOCATOR;
	}	
	
	@Override
	public List<CartesianPositionCoordinates> getPoints() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		points.addAll(pointsToSearch);
		return points;
	}
	
	@Override
	public void addPoint(CartesianPositionCoordinates point) 
	{
		isDirty = true;
		pointsToSearch.add(point);
	}
	
	@Override
	public void addPoints(List<CartesianPositionCoordinates> points) 
	{
		isDirty = true;
		pointsToSearch.addAll(points);
	}
	
	@Override
	public void removePoint(CartesianPositionCoordinates point) 
	{
		isDirty = true;
		pointsToSearch.remove(point);
	}
	
	@Override
	public void removePoints(List<CartesianPositionCoordinates> points) 
	{
		isDirty = true;
		pointsToSearch.removeAll(points);
	}
	
	@Override
	public void clearPoints() 
	{
		isDirty = true;
		pointsToSearch.clear();
	}
	
	@Override
	public CartesianPositionCoordinates findClosestPoint(CartesianPositionCoordinates point) 
	{
		if(pointsToSearch.isEmpty())
		{
			return null;
		}
		else
		{
			getQueryBuffer1()[0] = point.getX();
			getQueryBuffer1()[1] = point.getY();
			getQueryBuffer1()[2] = point.getZ();
	
			CartesianPositionCoordinates closestPoint = null;
	
			try 
			{
				Object nearest = getKdTree().nearest(getQueryBuffer1());
	
				if (nearest != null) 
				{
					closestPoint = pointsToSearch.get((Integer) nearest);
				}
	
			} 
			catch (KeySizeException e) 
			{
				e.printStackTrace();
			}
			return closestPoint;			
		}
	}
	
	@Override
	public List<CartesianPositionCoordinates> findClosestPoints(CartesianPositionCoordinates point, int maximumNumberOfNeighbors) 
	{
		if(point == null)
		{
			throw new IllegalArgumentException();
		}
		
		if(maximumNumberOfNeighbors <= 0)
		{
			throw new IllegalArgumentException();
		}
		
		if(pointsToSearch.isEmpty())
		{
			return null;
		}
		else
		{
			try 
			{
				Object[] nearest = getKdTree().nearest(getQueryBuffer1(), maximumNumberOfNeighbors);
	
				List<CartesianPositionCoordinates> neighbors = new ArrayList<CartesianPositionCoordinates>();
	
				for (int i = 0; i < nearest.length; i++) 
				{
					CartesianPositionCoordinates neighbor = pointsToSearch.get(((Integer) nearest[i]).intValue());
					neighbors.add(neighbor);
				}
	
				return neighbors;
	
			} 
			catch (IllegalArgumentException e) 
			{
				throw new IllegalArgumentException();
			} 
			catch (KeySizeException e) 
			{
				throw new IllegalArgumentException(e);
			}
		}		
	}
	
	@Override
	public List<CartesianPositionCoordinates> findPointsWithinRadius(CartesianPositionCoordinates point, double radius)  
	{
		if(point == null)
		{
			throw new IllegalArgumentException();
		}		
		
		List<CartesianPositionCoordinates> neighbors = new ArrayList<CartesianPositionCoordinates>();
		
		if(pointsToSearch.isEmpty())
		{
			return neighbors;
		}
		else
		{
		
			getQueryBuffer1()[0] = point.getX() - Math.abs(radius);
			getQueryBuffer1()[1] = point.getY() - Math.abs(radius);
			getQueryBuffer1()[2] = point.getZ() - Math.abs(radius);
	
			// The upper bound.
			getQueryBuffer2()[0] = point.getX() + Math.abs(radius);
			getQueryBuffer2()[1] = point.getY() + Math.abs(radius);
			getQueryBuffer2()[2] = point.getZ() + Math.abs(radius);
				
			try 
			{
				Object[] range = getKdTree().range(getQueryBuffer1(),getQueryBuffer2());
					
				for (int i = 0; i < range.length; i++) 
				{
					// Checks that the point is indeed within the radius.
					CartesianPositionCoordinates p = pointsToSearch.get((Integer) range[i]);
										
					if(p.asPoint3d().distance(point.asPoint3d()) < radius)
					{				
						neighbors.add(pointsToSearch.get((Integer) range[i]));
					}							
				}
			} 
			catch (KeySizeException e) 
			{			
				e.printStackTrace();
			}
			
			return neighbors;
		}		
	}
	
	private KDTree getKdTree() 
	{
		if (kdTree == null || isDirty) 
		{
			if (pointsToSearch == null) 
			{
				throw new IllegalArgumentException();
			}

			kdTree = new KDTree(3);

			// We build the KD tree.
			int pid = 0;
			for (CartesianPositionCoordinates point : pointsToSearch) 
			{
				double key[] = new double[] { point.getX(), point.getY(),point.getZ() };
				try 
				{
					kdTree.insert(key, pid++);
				} 
				catch (KeySizeException e) 
				{
					e.printStackTrace();
				} 
				catch (KeyDuplicateException e) 
				{				
				}
			}

			isDirty = false;
		}
		return kdTree;
	}
	
	private double[] getQueryBuffer1() 
	{
		if (queryBuffer1 == null) 
		{
			queryBuffer1 = new double[3];
		}
		return queryBuffer1;
	}

	private double[] getQueryBuffer2() 
	{
		if (queryBuffer2 == null) {
			queryBuffer2 = new double[3];
		}
		return queryBuffer2;
	}	
} //KDTreeBasedPointLocatorImpl
