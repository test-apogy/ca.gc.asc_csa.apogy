package org.eclipse.symphony.common.topology.addons.dynamics.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;
import org.eclipse.symphony.common.topology.addons.dynamics.ui.Activator;
import org.eclipse.symphony.common.topology.addons.dynamics.ui.views.AbstractPinableView;

public class PinViewAction extends Action {

	private static final String id ="ca.gc.asc_csa.esm.juno.ui.actions.PinViewAction";
	private String description = "Pins the current selection.";
	private String toolTipText = "Pins the current selection.";
	private String text = "Pins the current selection.";	
	private ImageDescriptor imageDescriptor = null;
	private AbstractPinableView<?> view = null;	
		
	public PinViewAction(AbstractPinableView<?> view)
	{
		this.view = view;				
		try
		{
			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/pin.gif");			
		}
		catch(Exception e)
		{
			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		}								
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
		view.setPinView(isChecked());
	}
	
	public void runWithEvent(Event event)
	{
		this.run();
	}
}
