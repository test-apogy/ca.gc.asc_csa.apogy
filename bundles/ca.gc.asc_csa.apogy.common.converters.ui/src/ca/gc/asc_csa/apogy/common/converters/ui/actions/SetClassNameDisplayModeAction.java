package ca.gc.asc_csa.apogy.common.converters.ui.actions;
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
import ca.gc.asc_csa.apogy.common.converters.ui.Activator;
import ca.gc.asc_csa.apogy.common.converters.ui.composites.ConvertersUIConstants.ClassNameDisplayMode;
import ca.gc.asc_csa.apogy.common.converters.ui.views.ConvertersView;

public class SetClassNameDisplayModeAction extends Action {

	private static final String id ="ca.gc.asc_csa.apogy.common.converters.ui.actions.SetClassNameDisplayModeAction";
	private String description = "Use fully qualified class names in displays.";
	private String toolTipText = "Use fully qualified class names in displays.";
	private String text ="Use fully qualified class names in displays.";	
	private ImageDescriptor imageDescriptor = null;
	private ConvertersView view = null;	
		
	public SetClassNameDisplayModeAction(ConvertersView view)
	{
		this.view = view;				
		try
		{
			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/long_name.gif");			
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
		if(isChecked())
		{
			view.setClassNameDisplayMode(ClassNameDisplayMode.FULLY_QUALIFIED_CLASS_NAME);
		}
		else
		{
			view.setClassNameDisplayMode(ClassNameDisplayMode.SIMPLE_CLASS_NAME);
		}
	}
	
	public void runWithEvent(Event event)
	{
		this.run();
	}
}
