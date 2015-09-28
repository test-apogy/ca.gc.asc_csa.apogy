package ca.gc.asc_csa.symphony.environment.ui.views;

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
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.progress.UIJob;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.ui.views.AbstractView;
import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.symphony.environment.ui.Activator;
import ca.gc.asc_csa.symphony.environment.ui.EnvironmentUiFacade;
import ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.symphony.environment.ui.actions.ClearAllTrajectoriesAction;
import ca.gc.asc_csa.symphony.environment.ui.actions.UpdateMapAction;
import ca.gc.asc_csa.symphony.environment.ui.actions.ZoomFitMapAction;
import ca.gc.asc_csa.symphony.environment.ui.composites.MapComposite;

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
		setMapViewConfiguration(EnvironmentUiFacade.INSTANCE.getActiveMapViewConfiguration(mapViewConfigurationId));
		
		// Register to EMFEcoreInvocatorFacade to listen for change on Active Session.
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
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
			mapViewConfigurationId = EnvironmentUiFacade.INSTANCE.getMapViewConfigurationIdentifier(mapViewConfiguration);
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
		// Unregister to EMFEcoreInvocatorFacade.
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
		
		setMapViewConfiguration(null);
		
		if(mapComposite != null) mapComposite.dispose();
				
		super.dispose();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void updateSelection(ISelection selection) 
	{		
		List<MapViewConfiguration> mapViewConfigurations = (List<MapViewConfiguration>) ca.gc.asc_csa.eclipse.converters.Activator.convert(selection, MapViewConfiguration.class);
		if(!mapViewConfigurations.isEmpty())
		{				
			MapViewConfiguration mapViewConfiguration = mapViewConfigurations.get(0);										
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
					if(msg.getNotifier() instanceof EMFEcoreInvocatorFacade)
					{
						int featureId = msg.getFeatureID(EMFEcoreInvocatorFacade.class);
						
						if(featureId == EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
						{
							// Tries to update the MapViewConfiguration being displayed.
							setMapViewConfiguration(EnvironmentUiFacade.INSTANCE.getActiveMapViewConfiguration(mapViewConfigurationId));
						}						
					}
				}
			};
		}
		
		return activeSessionAdapter;
	}
}
