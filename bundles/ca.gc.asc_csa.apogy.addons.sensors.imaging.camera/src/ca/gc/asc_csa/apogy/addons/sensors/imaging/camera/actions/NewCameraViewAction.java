package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.actions;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.Activator;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.views.CameraView;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class NewCameraViewAction extends Action 
{
	/**
	 * The counter indicating the next id to assign to the view, in order to
	 * make it unique.
	 */
	private static int viewCounter = 1;			
	private ImageDescriptor imageDescriptor = null;

	private String description = "Opens a new Camera View.";
	private String toolTipText = description;
	private String text = description;
	
	
	public NewCameraViewAction(CameraView view)
	{				
		try
		{
			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/new_view.gif");			
		}
		catch(Exception e)
		{
			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		}	
		setImageDescriptor(imageDescriptor);								
	}
	
	public String getDescription() 
	{
		return this.description;
	}
	
	public String getText() 
	{		
		return text;
	}

	public String getToolTipText() 
	{		
		return toolTipText;
	}
	
	@Override
	public void run() 
	{
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if(window != null)
		{
			IWorkbenchPage page = window.getActivePage();
			if(page != null)
			{
				try
				{
					// We find the next secondary id.
					String secondaryId = createNextSecondaryID(page);
					
					// We assign the secondary ID it to the view.
					page.showView(CameraView.ID, secondaryId, 1);
					
					
				}
				catch(Throwable t)
				{
					Logger.INSTANCE.log(Activator.ID, this, "Error opening new Camera Window", EventSeverity.ERROR, t);
				}
			}
		}
	}
	
	public int getStyle() 
	{		
		return IAction.AS_PUSH_BUTTON;
	}
	
	@Override
	public ImageDescriptor getImageDescriptor() 
	{	
		return imageDescriptor;
	}
	
	private String createNextSecondaryID(IWorkbenchPage page)
	{
		// We find the next secondary id.
		boolean exists = true;
		String secondaryId = null;
		IViewReference[] viewReferences = page.getViewReferences();
		List<String> secondaryIds = new ArrayList<String>(viewReferences.length);
		List<IViewReference> topologyViews = new ArrayList<IViewReference>();

		for (int i = 0; i < viewReferences.length; i++) 
		{
			if (viewReferences[i].getId().equals(CameraView.ID)) 
			{
				if (viewReferences[i].getSecondaryId() != null) 
				{
					secondaryIds.add(viewReferences[i].getSecondaryId());
				}
				topologyViews.add(viewReferences[i]);
			}
		}

		Collections.sort(secondaryIds);

		while (exists) 
		{
			secondaryId = "View #" + viewCounter; //$NON-NLS-1$

			int pos = Collections.binarySearch(secondaryIds, secondaryId);
			exists = pos >= 0;
			viewCounter++;
		}
		
		return secondaryId;
	}
}
