package org.eclipse.symphony.addons.geometry.paths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;

/**
 * Class that maintains a target WayPointPath in sync with a source WayPointPath.
 * @author pallard
 *
 */
public class WayPointPathBinding 
{
	private Adapter adapter = null;
	
	private Map<CartesianPositionCoordinates, CartesianPositionCoordinates> originalToCopy = new HashMap<CartesianPositionCoordinates, CartesianPositionCoordinates>();
	
	private WayPointPath sourceWayPointPath = null;
	private WayPointPath targetWayPointPath = null;
	
	
	
	public WayPointPathBinding(WayPointPath sourceWayPointPath , WayPointPath targetWayPointPath )
	{
		// Do this first !
		setTargetWayPointPath(targetWayPointPath);
				
		setSourceWayPointPath(sourceWayPointPath);		
	}

	public WayPointPath getSourceWayPointPath() 
	{
		return sourceWayPointPath;
	}

	public void setSourceWayPointPath(WayPointPath newSourceWayPointPath) 
	{		
		// Remove listener from previous source path.
		if(sourceWayPointPath != null)
		{
			sourceWayPointPath.eAdapters().remove(getAdapter());
		}
		
		// Clear target path.
		if(targetWayPointPath != null) targetWayPointPath.getPoints().clear();
		
		// Clears map
		originalToCopy.clear();
		
		this.sourceWayPointPath = newSourceWayPointPath;
		
		// Adds listener to new source path.
		if(newSourceWayPointPath != null)
		{
			// Adds the point currenlty in the source path to the target path.
			if(targetWayPointPath != null)
			{
				addPoints(newSourceWayPointPath.getPoints());
			}
			
			newSourceWayPointPath.eAdapters().add(getAdapter());
		}				
	}

	public WayPointPath getTargetWayPointPath() 
	{
		return targetWayPointPath;
	}

	public void setTargetWayPointPath(WayPointPath targetWayPointPath) 
	{
		this.targetWayPointPath = targetWayPointPath;
	}

	protected void addPoint(CartesianPositionCoordinates point)
	{
		if(getTargetWayPointPath() != null)
		{
			// First, copy the original point
			CartesianPositionCoordinates pointCopy = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(point);
			
			// Adds the point to the target path.
			getTargetWayPointPath().getPoints().add(pointCopy);
			
			// Adds the point to the map.
			originalToCopy.put(point, pointCopy);
		}
	}
	
	protected void addPoints(List<CartesianPositionCoordinates> points)
	{
		if(getTargetWayPointPath() != null)
		{
			List<CartesianPositionCoordinates> pointsCopy = new ArrayList<CartesianPositionCoordinates>();
			
			for(CartesianPositionCoordinates point : points)
			{						
				// First, copy the original point
				CartesianPositionCoordinates pointCopy = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(point);
				
				// Adds point to temporary list.
				pointsCopy.add(pointCopy);
				
				// Adds the point to the map.
				originalToCopy.put(point, pointCopy);
			}
						
			// Adds the point to the target path.
			getTargetWayPointPath().getPoints().addAll(pointsCopy);
		}
	}
	
	protected void removePoint(CartesianPositionCoordinates point)
	{
		if(getTargetWayPointPath() != null)
		{
			CartesianPositionCoordinates pointCopy = originalToCopy.get(point);
			
			if(pointCopy != null)
			{
				getTargetWayPointPath().getPoints().remove(pointCopy);
			}
		}
	}
	
	protected void removePoints(List<CartesianPositionCoordinates> points)
	{
		if(getTargetWayPointPath() != null)
		{		
			for(CartesianPositionCoordinates point : points)
			{
				CartesianPositionCoordinates pointCopy = originalToCopy.get(point);
				
				if(pointCopy != null)
				{
					getTargetWayPointPath().getPoints().remove(pointCopy);
				}
			}
		}
	}
	
	protected Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof WayPointPath)
					{
						int featureId = msg.getFeatureID(WayPointPath.class);
						switch (featureId) 
						{
							case PathsPackage.WAY_POINT_PATH__POINTS:
								
								int eventType = msg.getEventType();
								switch (eventType) 
								{
									case Notification.ADD:
										CartesianPositionCoordinates pointAdded = (CartesianPositionCoordinates) msg.getNewValue();
										addPoint(pointAdded);
									break;
									
									case Notification.ADD_MANY:
										List<CartesianPositionCoordinates> pointsAdded = (List<CartesianPositionCoordinates>) msg.getNewValue();
										addPoints(pointsAdded);
									break;
									
									case Notification.REMOVE:
										CartesianPositionCoordinates pointRemoved = (CartesianPositionCoordinates) msg.getOldValue();
										addPoint(pointRemoved);
									break;
									
									case Notification.REMOVE_MANY:
										List<CartesianPositionCoordinates> pointsRemoved = (List<CartesianPositionCoordinates>) msg.getNewValue();
										removePoints(pointsRemoved);
									break;
								}
							
							break;

							default:
							break;
						}
					}
				}
			};
		}
		
		return adapter;
	}
}
