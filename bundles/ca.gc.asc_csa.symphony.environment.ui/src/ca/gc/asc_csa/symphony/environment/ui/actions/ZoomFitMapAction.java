package ca.gc.asc_csa.symphony.environment.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;

import ca.gc.asc_csa.symphony.environment.ui.Activator;
import ca.gc.asc_csa.symphony.environment.ui.views.MapView;

public class ZoomFitMapAction extends Action 
{
	private MapView mapView = null;
	private ImageDescriptor imageDescriptor = null;
	
	public ZoomFitMapAction(MapView mapView) 
	{
		setMapView(mapView);
		
		try
		{
			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/fit_map.gif");			
		}
		catch(Exception e)
		{
			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		}	
	}

	public void setMapView(MapView newMapView)
	{
		this.mapView = newMapView;
	}
	
	@Override
	public int getStyle() 
	{		
		return IAction.AS_PUSH_BUTTON;
	}
	
	@Override
	public void run() 
	{		
		this.mapView.zoomFitMap();
	}
	@Override
	public ImageDescriptor getImageDescriptor() 
	{		
		return imageDescriptor;
	}
	
	@Override
	public String getText() 
	{		
		return "Resets the plot to display the entire map.";
	}

	@Override
	public String getToolTipText() 
	{		
		return "Resets the plot to display the entire map.";
	}

}
