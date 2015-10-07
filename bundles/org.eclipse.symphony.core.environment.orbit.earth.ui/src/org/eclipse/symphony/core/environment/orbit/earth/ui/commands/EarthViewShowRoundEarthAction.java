package org.eclipse.symphony.core.environment.orbit.earth.ui.commands;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;
import org.eclipse.symphony.core.environment.orbit.earth.ui.Activator;
import org.eclipse.symphony.core.environment.orbit.earth.ui.composites.EarthComposite;
import org.eclipse.symphony.core.environment.orbit.earth.ui.composites.EarthComposite.EarthViewMode;
import org.eclipse.symphony.core.environment.orbit.earth.ui.views.EarthView;

public class EarthViewShowRoundEarthAction extends Action {

	private static final String id ="org.eclipse.symphony.core.environment.orbit.earth.ui.commands.ToggleEarthViewModeAction";
	private String description = "Displays round Earth.";
	private String toolTipText = "Displays round Earth.";
	private String text = "Displays round Earth.";	
	private ImageDescriptor imageDescriptor = null;	
	private EarthView earthView = null;	
		
	public EarthViewShowRoundEarthAction(EarthView earthView)
	{
		this.earthView = earthView;				
		try
		{
			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/round_earth.gif");			
		}
		catch(Exception e)
		{
			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		}			
		
		if(earthView.getCurrentMode() == EarthViewMode.ROUND) setChecked(true);
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
		earthView.setCurrentMode(EarthComposite.EarthViewMode.ROUND);		
	}
	
	public void runWithEvent(Event event)
	{
		this.run();
	}
}