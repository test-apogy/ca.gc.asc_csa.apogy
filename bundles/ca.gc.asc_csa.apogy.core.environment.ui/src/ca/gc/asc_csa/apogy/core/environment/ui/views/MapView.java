package ca.gc.asc_csa.apogy.core.environment.ui.views;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFacade;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.ui.actions.ClearAllTrajectoriesAction;
import ca.gc.asc_csa.apogy.core.environment.ui.actions.UpdateMapAction;
import ca.gc.asc_csa.apogy.core.environment.ui.actions.ZoomFitMapAction;
import ca.gc.asc_csa.apogy.core.environment.ui.composites.MapComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.progress.UIJob;

public class MapView extends AbstractView 
{
	public static final String MAP_VIEW_CONFIG = Activator.ID + "." + "MAP_VIEW_CONFIG";
	public static final String MAP_VIEW_PINNED = Activator.ID + "." + "MAP_VIEW_PINNED";
	
	public static final String PART_NAME = "MapView";
	public static final String BUSY = "(BUSY)";
	
	protected MapViewConfiguration mapViewConfiguration;	
	private String mapViewConfigurationId = null;
	
	protected boolean pinned = false;
	protected boolean busy = false;
	
	protected MapComposite mapComposite;
	
	private Adapter activeSessionAdapter = null;
	
	@Override
	public void createPartControl(Composite parent) 
	{
		super.createPartControl(parent);
		
		parent.setLayout(new FillLayout());
		
		mapComposite = new MapComposite(parent, SWT.NONE);
		
		// Attempts to initialize the MapViewConfiguration.				
		setMapViewConfiguration(ApogyCoreEnvironmentUIFacade.INSTANCE.getActiveMapViewConfiguration(mapViewConfigurationId));
		
		// Register to ApogyCoreInvocatorFacade to listen for change on Active Session.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
	}
	
	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException 
	{					
		super.init(site, memento);
		
		if(memento != null)
		{
			mapViewConfigurationId = memento.getString(MAP_VIEW_CONFIG);
			
			Logger.INSTANCE.log(Activator.ID, this, "Initializing with MapViewConfiguration ID <" +mapViewConfigurationId + ">." , EventSeverity.INFO);
			
			if(memento.getBoolean(MAP_VIEW_PINNED) != null)
			{
				setPinned(memento.getBoolean(MAP_VIEW_PINNED));			
			}				
		}
	}
	
	@Override
	public void saveState(IMemento memento) 
	{	
		if(mapViewConfiguration != null)
		{
			mapViewConfigurationId = ApogyCoreEnvironmentUIFacade.INSTANCE.getMapViewConfigurationIdentifier(mapViewConfiguration);
			memento.putString(MAP_VIEW_CONFIG, mapViewConfigurationId);
		}
		memento.putBoolean(MAP_VIEW_PINNED, this.pinned);

		Logger.INSTANCE.log(Activator.ID, this, "Saving state MapViewConfiguration ID <" +mapViewConfigurationId + ">." , EventSeverity.INFO);
		
		super.saveState(memento);		
	}

	@Override
	public void addActions() 
	{	
		super.addActions();
		
		/* Creates ZoomFitMapAction Action */
		ZoomFitMapAction updateMapsAction = new ZoomFitMapAction(this);		
		
		/* Add ZoomFitMapAction action to toolbars.*/
		this.getViewSite().getActionBars().getToolBarManager().add(updateMapsAction);
		this.getViewSite().getActionBars().getMenuManager().add(updateMapsAction);
		
		/* Creates ZoomFitMapAction Action */
		ClearAllTrajectoriesAction clearAllTrajectoriesAction = new ClearAllTrajectoriesAction(this);		
		
		/* Add ZoomFitMapAction action to toolbars.*/
		this.getViewSite().getActionBars().getToolBarManager().add(clearAllTrajectoriesAction);
		this.getViewSite().getActionBars().getMenuManager().add(clearAllTrajectoriesAction);
		
		UpdateMapAction updateMapAction =  new UpdateMapAction(this);
		this.getViewSite().getActionBars().getToolBarManager().add(updateMapAction);
		this.getViewSite().getActionBars().getMenuManager().add(updateMapAction);

	}
	
	@Override
	public void dispose() 
	{
		// Unregister to ApogyCoreInvocatorFacade.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
		
		setMapViewConfiguration(null);
		
		if(mapComposite != null) mapComposite.dispose();
				
		super.dispose();
	}
	
	@Override
	public void updateSelection(ISelection selection) 
	{
		List<Object> mapViewConfigurations = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, MapViewConfiguration.class);
		
		if(!mapViewConfigurations.isEmpty())
		{				
			MapViewConfiguration mapViewConfiguration = (MapViewConfiguration) mapViewConfigurations.get(0);										
			setMapViewConfiguration(mapViewConfiguration);						
		}
	}
	
	public void updateMap()
	{
		if(getMapViewConfiguration() != null)
		{
			getMapViewConfiguration().forceUpdate();
			setMapViewConfiguration(getMapViewConfiguration());
		}
	}
	
	@Override
	public void updatePartName() 
	{		
		final MapViewConfiguration newMapViewConfiguration = getMapViewConfiguration();
		
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{					
				String partName = PART_NAME;
				if(newMapViewConfiguration != null)
				{
					if(newMapViewConfiguration.getName() != null && newMapViewConfiguration.getName().length() > 0)
					{
						partName += " - " + newMapViewConfiguration.getName();
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

	public void zoomFitMap()
	{
		if(!isBusy())
		{
			try
			{
				if(mapComposite != null && !mapComposite.isDisposed())
				{
					mapComposite.resetMaps();
				}
			}
			catch(Throwable t)
			{
				t.printStackTrace();
				Logger.INSTANCE.log(Activator.ID, this, "Error occured in zoomFitMap!",  EventSeverity.WARNING, t);
			}
		}
	}
	
	public void clearAllTrajectories()
	{
		if(!isBusy())
		{
			try
			{
				if(mapComposite != null && !mapComposite.isDisposed())
				{
					mapComposite.clearAllTrajectories();
				}
			}
			catch(Throwable t)
			{
				t.printStackTrace();
				Logger.INSTANCE.log(Activator.ID, this, "Error occured in clearAllTrajectories!",  EventSeverity.WARNING, t);
			}
		}
	}
	
	public MapViewConfiguration getMapViewConfiguration()
	{
		return mapViewConfiguration;
	}
	
	public void setMapViewConfiguration(final MapViewConfiguration newMapViewConfiguration)
	{
		if(!isBusy())
		{
			this.mapViewConfiguration = newMapViewConfiguration;	
								
			UIJob setMapViewConfigurationJob = new UIJob("")
			{			
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) 
				{			
					showBusy(true);
					
					try
					{
						if(mapComposite != null && !mapComposite.isDisposed())
						{
							mapComposite.setMapViewConfiguration(newMapViewConfiguration);
						}
					}
					catch(Throwable t)
					{
						t.printStackTrace();
						Logger.INSTANCE.log(Activator.ID, this, "Error occured while setting the MapViewConfiguration !",  EventSeverity.WARNING, t);
					}
					
					MapView.this.showBusy(false);
					
					return Status.OK_STATUS;
				}
			};
			setMapViewConfigurationJob.schedule();
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "MapView is busy, cannot update MapViewConfiguration!",  EventSeverity.WARNING);
		}
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
							// Tries to update the MapViewConfiguration being displayed.
							setMapViewConfiguration(ApogyCoreEnvironmentUIFacade.INSTANCE.getActiveMapViewConfiguration(mapViewConfigurationId));
						}						
					}
				}
			};
		}
		
		return activeSessionAdapter;
	}
}
