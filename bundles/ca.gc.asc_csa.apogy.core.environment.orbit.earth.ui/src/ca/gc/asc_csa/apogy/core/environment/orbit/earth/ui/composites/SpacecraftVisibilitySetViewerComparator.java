package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites;
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

import java.util.Date;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

public class SpacecraftVisibilitySetViewerComparator extends ViewerComparator 
{
	public static final int DESCENDING = 1;
	private SpacecraftsVisibilitySetComposite.SpacecraftsVisibilitySetColumns column;		
	private int direction = DESCENDING;
	
	public SpacecraftVisibilitySetViewerComparator()
	{		
		column = SpacecraftsVisibilitySetComposite.SpacecraftsVisibilitySetColumns.GROUND_STATION;
	    direction = DESCENDING;
	}
	
	public int getDirection()
	{
		return direction;
	}
	
	public void setColumn(SpacecraftsVisibilitySetComposite.SpacecraftsVisibilitySetColumns column) 
	{
		if (this.column == column) 
		{
			// Same column as last sort; toggle the direction
		   direction = 1 - direction;
		} 
		else 
		{
			// New column; do an ascending sort
		    this.column = column;
		    direction = DESCENDING;
		}
	}
	
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) 
	{
		ViewerElement viewerElement1 = (ViewerElement) e1;
		ViewerElement viewerElement2 = (ViewerElement) e2;
		int rc = 0;
		switch (column) 
		{
			case GROUND_STATION:
				try
				{
					String s1 = viewerElement1.groundStation.getName();
					String s2 = viewerElement2.groundStation.getName();
					if(s1 == null) s1 = "";
					if(s2 == null) s2 = "";
					rc = s1.compareTo(s2);
				}
				catch(Throwable t)
				{				
				}
			break;
			
			case SPACECRAFT:
			
				try
				{
					String s1 = viewerElement1.pass.getOrbitModel().getName();					
					String s2 = viewerElement2.pass.getOrbitModel().getName();
					if(s1 == null) s1 = "";
					if(s2 == null) s2 = "";					
					rc = s1.compareTo(s2);
				}
				catch(Throwable t)
				{				
				}
			break;
			
			
			case START_DATE:
				try
				{
					Date date1 = viewerElement1.pass.getStartTime();
					Date date2 = viewerElement2.pass.getStartTime();					
					rc = date1.compareTo(date2);
				}
				catch(Throwable t)
				{					
				}
			break;
			
			case END_DATE:
				try
				{
					Date date1 = viewerElement1.pass.getEndTime();
					Date date2 = viewerElement2.pass.getEndTime();					
					rc = date1.compareTo(date2);
				}
				catch(Throwable t)
				{					
				}
			break;
			
			case DURATION:
				if(viewerElement1.pass.getDuration() > viewerElement2.pass.getDuration())
				{
					rc = 1;
				}
				else if(viewerElement1.pass.getDuration() < viewerElement2.pass.getDuration())
				{
					rc = -1;
				}								
			break;
			
			default:
			break;
		}
		
		// If descending order, flip the direction
	    if (direction == DESCENDING) 
	    {
	      rc = -rc;
	    }
	    return rc;
	}
	
}
