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


import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.commands.EarthViewShowFlatEarthAction;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.commands.EarthViewShowRoundEarthAction;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites.EarthComposite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites.EarthComposite.EarthViewMode;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;

public class EarthView extends AbstractView 
{
	public static final String PART_NAME = "EarthView";
	public static final String BUSY = "(BUSY)";
	
	private EarthViewConfiguration earthViewConfiguration = null;
    private EarthComposite earthComposite = null; 
 
    private EarthViewShowRoundEarthAction earthViewShowRoundEarthAction;
    private EarthViewShowFlatEarthAction earthViewShowFlatEarthAction;
       
    public void createPartControl(Composite parent) 
    {
    	super.createPartControl(parent);
    	
    	parent.setLayout(new GridLayout(1,false));
    	       	       	   
    	earthComposite = new EarthComposite(parent, SWT.BORDER);
    	earthComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
    }

 	@Override
 	public void updatePartName() 
 	{ 		
		final EarthViewConfiguration newEarthViewConfiguration = earthViewConfiguration;
		
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{					
				String partName = PART_NAME;
				if(newEarthViewConfiguration != null)
				{
					if(newEarthViewConfiguration.getName() != null && newEarthViewConfiguration.getName().length() > 0)
					{
						partName += " - " + newEarthViewConfiguration.getName();
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
		
		List<Object> earthViewConfigurations = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, EarthViewConfiguration.class);
		
		if(!earthViewConfigurations.isEmpty())
		{				
			EarthViewConfiguration earthViewConfiguration = (EarthViewConfiguration) earthViewConfigurations.get(0);										
			setEarthViewConfiguration(earthViewConfiguration);								
		} 		
 	} 
     
 	public void setEarthViewConfiguration(EarthViewConfiguration earthViewConfiguration)
 	{
 		this.earthViewConfiguration = earthViewConfiguration;
 		
 		if(earthComposite != null && !earthComposite.isDisposed())
 		{
 			earthComposite.setEarthViewConfiguration(earthViewConfiguration);
 		}
 	}

	public EarthComposite.EarthViewMode getCurrentMode() 
	{
		if(earthComposite != null) return earthComposite.getMode();
		else return null;
	}

	public void setCurrentMode(EarthComposite.EarthViewMode currentMode) 
	{
		if(earthComposite != null && !earthComposite.isDisposed())	
		{
			earthComposite.setMode(currentMode);
			
			if(currentMode == EarthViewMode.FLAT)
			{
				earthViewShowRoundEarthAction.setChecked(false);
				earthViewShowFlatEarthAction.setChecked(true);
			}
			else
			{
				earthViewShowRoundEarthAction.setChecked(true);
				earthViewShowFlatEarthAction.setChecked(false);
			}
		}
	}
 	
 	@Override
 	public void addActions() 
 	{ 	
 		super.addActions();
 		
 		/* Creates EarthViewShowRoundEarthAction Action */
 		earthViewShowRoundEarthAction = new EarthViewShowRoundEarthAction(this);
 		earthViewShowRoundEarthAction.setChecked(true);
		
		/* Add EarthViewShowRoundEarthAction action to toolbars*/
		this.getViewSite().getActionBars().getToolBarManager().add(earthViewShowRoundEarthAction);
		this.getViewSite().getActionBars().getMenuManager().add(earthViewShowRoundEarthAction);
		
		/* Creates EarthViewShowRoundEarthAction Action */
		earthViewShowFlatEarthAction = new EarthViewShowFlatEarthAction(this);
		earthViewShowFlatEarthAction.setChecked(false);
		
		/* Add EarthViewShowRoundEarthAction action to toolbars*/
		this.getViewSite().getActionBars().getToolBarManager().add(earthViewShowFlatEarthAction);
		this.getViewSite().getActionBars().getMenuManager().add(earthViewShowFlatEarthAction);				
 	}
}
