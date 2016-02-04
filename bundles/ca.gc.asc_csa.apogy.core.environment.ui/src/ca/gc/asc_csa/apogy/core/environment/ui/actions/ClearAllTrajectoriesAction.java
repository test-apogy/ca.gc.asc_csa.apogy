package ca.gc.asc_csa.apogy.core.environment.ui.actions;
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
import org.eclipse.jface.resource.ImageDescriptor;
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.ui.views.MapView;

public class ClearAllTrajectoriesAction extends Action 
{
	private MapView mapView = null;
	private ImageDescriptor imageDescriptor = null;
	
	public ClearAllTrajectoriesAction(MapView mapView) 
	{
		setMapView(mapView);
		
		try
		{
			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/clear_all_trajectories.gif");			
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
		this.mapView.clearAllTrajectories();
	}
	@Override
	public ImageDescriptor getImageDescriptor() 
	{		
		return imageDescriptor;
	}
	
	@Override
	public String getText() 
	{		
		return "Clear all trajectories displayed on the map.";
	}

	@Override
	public String getToolTipText() 
	{		
		return "Clear all trajectories displayed on the map.";
	}

}
