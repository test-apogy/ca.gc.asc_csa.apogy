package ca.gc.asc_csa.apogy.common.ui.actions;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Event;

import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.common.ui.views.Pinnable;

@Deprecated
public class PinViewAction extends Action {

	private static final String ID ="ca.gc.asc_csa.apogy.common.ui.actions.PinViewAction";
	private String description = "Pins the current selection.";
	private String toolTipText = "Pins the current selection.";
	private String text = "Pins the current selection.";	
	private ImageDescriptor imageDescriptor = null;
	private Pinnable pinnable = null;	
		
	public PinViewAction(Pinnable pinnable)
	{
		this.pinnable = pinnable;				
		try
		{
			imageDescriptor = ApogyCommonUiFacade.INSTANCE.getImageDescriptor("platform:/plugin/" + ca.gc.asc_csa.apogy.common.ui.Activator.ID + "/icons/pin.gif");			
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
		return ID;
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
		pinnable.setPinned(isChecked());
	}
	
	public void runWithEvent(Event event)
	{
		this.run();
	}
}
