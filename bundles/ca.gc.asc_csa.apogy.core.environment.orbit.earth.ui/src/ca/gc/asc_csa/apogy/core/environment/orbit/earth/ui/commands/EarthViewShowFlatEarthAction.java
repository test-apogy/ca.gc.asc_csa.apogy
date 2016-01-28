package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.commands;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites.EarthComposite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites.EarthComposite.EarthViewMode;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.views.EarthView;

public class EarthViewShowFlatEarthAction extends Action {

	private static final String id ="ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.commands.ToggleEarthViewModeAction";
	private String description = "Displays Earth using Mercator projection.";
	private String toolTipText = "Displays Earth using Mercator projection.";
	private String text = "Displays Earth using Mercator projection.";	
	private ImageDescriptor imageDescriptor = null;	
	private EarthView earthView = null;	
		
	public EarthViewShowFlatEarthAction(EarthView earthView)
	{
		this.earthView = earthView;				
		try
		{
			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/flat_earth.gif");			
		}
		catch(Exception e)
		{
			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		}		
		
		if(earthView.getCurrentMode() == EarthViewMode.FLAT) setChecked(true);
		else setChecked(false);
	}		
	
	public String getDescription() 
	{
		return this.description;
	}

	public String getId() 
	{		
		return id;
	}

	public ImageDescriptor getImageDescriptor() 
	{		
		return imageDescriptor;	
	}

	public IMenuCreator getMenuCreator() 
	{	
		return null;
	}

	public int getStyle() 
	{		
		return IAction.AS_CHECK_BOX;
	}

	public String getText() 
	{		
		return text;
	}

	public String getToolTipText() 
	{		
		return toolTipText;
	}

	public void run() 
	{		
		if(earthView.getCurrentMode() == EarthComposite.EarthViewMode.ROUND)
		{
			earthView.setCurrentMode(EarthComposite.EarthViewMode.FLAT);
		}
		else
		{
			earthView.setCurrentMode(EarthComposite.EarthViewMode.ROUND);
		}
	}
	
	public void runWithEvent(Event event)
	{
		this.run();
	}
}
