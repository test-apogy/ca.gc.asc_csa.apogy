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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;

import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewUtilities;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.commands.EarthViewShowFlatEarthAction;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.commands.EarthViewShowRoundEarthAction;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites.EarthComposite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites.EarthComposite.EarthViewMode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

public class EarthView extends AbstractView 
{
	public static final String ID = EarthView.class.getName();
	public static final String EARTH_VIEW_CONFIG = Activator.ID  + "." + "EARTH_VIEW_CONFIG";
	public static final String EARTH_VIEW_PINNED = Activator.ID  + "." + "EARTH_VIEW_PINNED";
	public static final String EARTH_VIEW_MODE = Activator.ID  + "." + "EARTH_VIEW_MODE";
		
	public static final String PART_NAME = "EarthView";
	public static final String BUSY = "(BUSY)";
	
	private String earthViewConfigurationId = null;	
	private EarthViewConfiguration earthViewConfiguration = null;
    private EarthComposite earthComposite = null; 
 
    private EarthViewShowRoundEarthAction earthViewShowRoundEarthAction;
    private EarthViewShowFlatEarthAction earthViewShowFlatEarthAction;
    
    private EarthViewMode mode = EarthViewMode.ROUND;
       
    private Adapter activeSessionAdapter = null;
    
    public void createPartControl(Composite parent) 
    {
    	super.createPartControl(parent);
    	
    	parent.setLayout(new GridLayout(1,false));
    	       	       	   
    	earthComposite = new EarthComposite(parent, SWT.BORDER);
    	earthComposite.setLayoutData(new GridData(GridData.FILL_BOTH));    	
    	
		// Attempts to initialize the CameraViewConfiguration.				
		setEarthViewConfiguration(EarthViewUtilities.INSTANCE.getActiveEarthViewConfiguration(earthViewConfigurationId));

		// Register to ApogyCoreInvocatorFacade to listen for change on Active Session.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
		
		// Updates the view mode.
		setCurrentMode(mode);
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
		
		// Notifies the EarthViewConfiguration of a new selection.
		if(earthViewConfiguration != null)
		{
			earthViewConfiguration.selectionChanged(selection);
		}
 	} 
     
 	public void setEarthViewConfiguration(EarthViewConfiguration earthViewConfiguration)
 	{
 		this.earthViewConfiguration = earthViewConfiguration;
 		
 		if(earthComposite != null && !earthComposite.isDisposed())
 		{ 		
 			setBusy(true);
 			earthComposite.setEarthViewConfiguration(earthViewConfiguration);
 			updatePartName();
 			setBusy(false);
 		}
 	}

	public EarthComposite.EarthViewMode getCurrentMode() 
	{
		return mode;		
	}

	public void setCurrentMode(EarthComposite.EarthViewMode currentMode) 
	{
		this.mode = currentMode;
		
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
 	
	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException 
	{					
		super.init(site, memento);
		
		if(memento != null)
		{
			earthViewConfigurationId = memento.getString(EARTH_VIEW_CONFIG);
			
			Logger.INSTANCE.log(Activator.ID, this, "Initializing with EarthViewConfiguration ID <" + earthViewConfigurationId + ">." , EventSeverity.INFO);
			
			Boolean pinned = memento.getBoolean(EARTH_VIEW_PINNED);
			if(pinned != null)
			{
				setPinned(pinned);	
			}		
			
			String mode = memento.getString(EARTH_VIEW_MODE);						
			if(mode != null)
			{
				setCurrentMode(EarthComposite.EarthViewMode.valueOf(mode));
			}
		}
	}
	
	@Override
	public void saveState(IMemento memento) 
	{	
		if(earthViewConfiguration != null)
		{
			earthViewConfigurationId = EarthViewUtilities.INSTANCE.getCameraViewConfigurationIdentifier(earthViewConfiguration);
			memento.putString(EARTH_VIEW_CONFIG, earthViewConfigurationId);
		}
		memento.putBoolean(EARTH_VIEW_PINNED, isPinned());		
		memento.putString(EARTH_VIEW_MODE, this.mode.toString());

		Logger.INSTANCE.log(Activator.ID, this, "Saving state EarthViewConfiguration ID <" +earthViewConfigurationId + ">." , EventSeverity.INFO);
		
		super.saveState(memento);		
	}
 	
	protected Adapter getActiveSessionAdapter()
	{
		if(activeSessionAdapter == null)
		{
			activeSessionAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{				
					if(msg.getNotifier() instanceof ApogyCoreInvocatorFacade)
					{
						int featureId = msg.getFeatureID(ApogyCoreInvocatorFacade.class);
						
						if(featureId == ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
						{
							// Tries to update the EarthViewConfiguration being displayed.
							setEarthViewConfiguration(EarthViewUtilities.INSTANCE.getActiveEarthViewConfiguration(earthViewConfigurationId));
						}						
					}
				}
			};
		}
		
		return activeSessionAdapter;
	}	
}
