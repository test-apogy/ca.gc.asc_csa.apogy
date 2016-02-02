package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.views;
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

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites.SpacecraftsVisibilitySetComposite;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;

public class SpacecraftVisibilitySetView extends AbstractView 
{	
	public static final String PART_NAME = "SpacecraftVisibilitySetView";
	public static final String BUSY = "(BUSY)";
	
	private SpacecraftsVisibilitySet spacecraftsVisibilitySet;
    private SpacecraftsVisibilitySetComposite spacecraftsVisibilitySetComposite = null; 
         
    public void createPartControl(Composite parent) 
    {
    	super.createPartControl(parent);
    	
    	parent.setLayout(new GridLayout(1,false));
    	       	       	   
    	spacecraftsVisibilitySetComposite = new SpacecraftsVisibilitySetComposite(parent, SWT.BORDER);
    	spacecraftsVisibilitySetComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
    }

 	@Override
 	public void updatePartName() 
 	{ 		
		final SpacecraftsVisibilitySet newSpacecraftsVisibilitySet = spacecraftsVisibilitySet;
		
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{					
				String partName = PART_NAME;
				if(newSpacecraftsVisibilitySet != null)
				{
					if(newSpacecraftsVisibilitySet.getName() != null && newSpacecraftsVisibilitySet.getName().length() > 0)
					{
						partName += " - " + newSpacecraftsVisibilitySet.getName();
					}
					else
					{
						partName += " - ?"; 
					}
							
					if(busy) partName += " " + BUSY;
				}				
				setPartName(partName);
			}
		});		
 	}

	@Override
 	public void updateSelection(ISelection selection) 
 	{ 		
		List<Object> spacecraftsVisibilitySets = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, SpacecraftsVisibilitySet.class);
		
		if(!spacecraftsVisibilitySets.isEmpty())
		{				
			SpacecraftsVisibilitySet spacecraftsVisibilitySet = (SpacecraftsVisibilitySet) spacecraftsVisibilitySets.get(0);										
			setSpacecraftsVisibilitySet(spacecraftsVisibilitySet);								
		} 		
 	} 
     
 	public void setSpacecraftsVisibilitySet(SpacecraftsVisibilitySet spacecraftsVisibilitySet)
 	{
 		this.spacecraftsVisibilitySet = spacecraftsVisibilitySet;
 		
 		if(spacecraftsVisibilitySetComposite != null && !spacecraftsVisibilitySetComposite.isDisposed())
 		{
 			spacecraftsVisibilitySetComposite.setSpacecraftsVisibilitySet(spacecraftsVisibilitySet);
 		}
 	}
}
