package ca.gc.asc_csa.apogy.common.topology.ui.viewer.views;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewerListener;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewer;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions.EnableAntiAliasingAction;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions.EnableHighSpeedMotionAction;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions.EnablePickingModeAction;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions.EnableStatisticsDisplayAction;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions.LevelViewpointAction;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions.TakeScreenShotAction;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions.ZoomToFitAction;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;

public abstract class AbstractTopology3DView extends AbstractView implements IPartListener2, TopologyViewerProvider, ITopologyViewerListener 
{
	public static final String BUSY = "(BUSY)";
	
	public static final String ABSTRACT_TOPOLOGY_3D_VIEW_STATISTICS = Activator.ID  + "." + "ABSTRACT_TOPOLOGY_3D_VIEW_STATISTICS";
	public static final String ABSTRACT_TOPOLOGY_3D_VIEW_ANTIALIASING = Activator.ID  + "." + "ABSTRACT_TOPOLOGY_3D_VIEW_ANTIALIASING";
	
	
	// States
	protected boolean enableStatisticsDisplay = false;
	protected boolean antiAliasing = false;
	
	// Actions.			
	protected EnableStatisticsDisplayAction enableStatisticsDisplayAction;
	protected EnableAntiAliasingAction antiAliasingAction;	
	protected ZoomToFitAction zoomToFitAction;	
	protected TakeScreenShotAction takeScreenShotAction = null;
	protected LevelViewpointAction levelViewpointAction;
	protected EnableHighSpeedMotionAction enableHighSpeedMotionAction;
	protected EnablePickingModeAction enablePickingModeAction;
	
	protected ISelection currentSelection = null;	
	protected ISelectionListener selectionListener;
	
	protected ITopologyViewer topologyViewer = null;
			
	
	@Override
	public void createPartControl(Composite parent) 
	{
		super.createPartControl(parent);
		
		topologyViewer = createTopologyViewer(parent);
		
		// Register to the topology viewer to monitor its changes.
		topologyViewer.addITopologyViewerListener(this);
				
		// We register a listener to selection service.
		getViewSite().getPage().addPartListener(this);
		
		// Initialize the show statistics value		
		enableStatisticsDisplayAction.setChecked(enableStatisticsDisplay);
		topologyViewer.setShowStatisticsEnabled(enableStatisticsDisplay);
		
		// Initialize the anti-aliasing value.	
		antiAliasingAction.setChecked(antiAliasing);
		topologyViewer.setAntiAliasing(antiAliasing);
	}
	
	@Override
	public void addActions() 
	{	
		super.addActions();
		
		enableStatisticsDisplayAction = new EnableStatisticsDisplayAction(this);
		enableStatisticsDisplayAction.setChecked(false);		
		takeScreenShotAction = new TakeScreenShotAction(this);		
		antiAliasingAction = new EnableAntiAliasingAction(this);		
		zoomToFitAction = new ZoomToFitAction(this);
		levelViewpointAction =  new LevelViewpointAction(this);
		enableHighSpeedMotionAction = new EnableHighSpeedMotionAction(this);
		enablePickingModeAction = new EnablePickingModeAction(this);

		// We get the toolbar manager.
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
		
		// Adds Anti-aliasing Action.		
		toolBarManager.add(antiAliasingAction);
		
		// Adds Statistics
		toolBarManager.add(enableStatisticsDisplayAction);
		
		// Zoom-Fit Action		
		toolBarManager.add(zoomToFitAction);

		// Level View Point Action		
		toolBarManager.add(levelViewpointAction);
		
		// Enable High Speed Action		
		toolBarManager.add(enableHighSpeedMotionAction);		
		
		// Enable Picking Action		
		toolBarManager.add(enablePickingModeAction);		
		
		// Take Screen Shot Action
		toolBarManager.add(takeScreenShotAction);
		
		getViewSite().getActionBars().updateActionBars();
	}
	
	/**
	 * Updates the text displayed on the View Tab.
	 */
	public void updatePartName()
	{
			Display.getDefault().asyncExec(new Runnable() 
			{			
				@Override
				public void run() 
				{					
					String partName = getPartNamePrefix();
					String partNameSuffix = getPartNameSuffix();					
					
					if(partNameSuffix != null && partNameSuffix.length() > 0)
					{
						partName += " - " + partNameSuffix;
					}
					else
					{
						partName += " - ?"; 
					}
							
					if(getTopologyViewer().isBusy()) partName += " " + BUSY;
										
					setPartName(partName);
				}
		});		
	}
	
	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException 
	{					
		super.init(site, memento);
		
		if(memento != null)
		{
			if(memento.getBoolean(ABSTRACT_TOPOLOGY_3D_VIEW_STATISTICS) != null)
			{
				enableStatisticsDisplay = memento.getBoolean(ABSTRACT_TOPOLOGY_3D_VIEW_STATISTICS);				
			}
			
			if(memento.getBoolean(ABSTRACT_TOPOLOGY_3D_VIEW_ANTIALIASING) != null)
			{
				antiAliasing = memento.getBoolean(ABSTRACT_TOPOLOGY_3D_VIEW_ANTIALIASING);				
			}
		}
	}
	
	@Override
	public void saveState(IMemento memento) 
	{			
		if(topologyViewer != null) 
		{
			memento.putBoolean(ABSTRACT_TOPOLOGY_3D_VIEW_STATISTICS, topologyViewer.isShowStatisticsEnabled());
			memento.putBoolean(ABSTRACT_TOPOLOGY_3D_VIEW_ANTIALIASING, topologyViewer.isAntiAliasingEnabled());
		}
	
		super.saveState(memento);		
	}
	
	@Override
	public void dispose() 
	{	
		if(topologyViewer != null)
		{
			// Un-Register from the topology viewer.
			topologyViewer.removeITopologyViewerListener(this);
		}
		
		// Unregister from selection.		
		getSite().getPage().removeSelectionListener(this);	
		
		// Unregister from part events.
		getViewSite().getPage().removePartListener(this);
		
		super.dispose();
	}
	
	public void partClosed(IWorkbenchPartReference partRef) 
	{
		if(topologyViewer != null)
		{
			topologyViewer.dispose();
		}			
	}
	
	@Override
	public void partActivated(IWorkbenchPartReference partRef) 
	{
	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) 
	{			
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) 
	{
	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) 
	{
	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) 
	{
	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) 
	{		
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) 
	{
	}
	
	@Override
	public void setFocus() 
	{		
	}
		
	@Override
	public ITopologyViewer getTopologyViewer() 
	{		
		return topologyViewer;
	}
	
	@Override
	public void busyChanged(boolean oldBusy, boolean newBusy) 
	{
		updatePartName();
	}
	
	@Override
	public void antiAliasingChanged(boolean oldAntiAliasing,boolean newAntiAliasing) 
	{	
		// Nothing to do.
	}
	
	/**
	 * 
	 * @param parent
	 * @return
	 */
	public abstract TopologyViewer createTopologyViewer(Composite parent);
	
	/**
	 * Return the view ID.
	 * @return
	 */
	public abstract String getViewID();
	
	/**
	 * 
	 * @return
	 */
	protected abstract String getPartNamePrefix();
	
	/**
	 * 
	 * @return
	 */
	protected abstract String getPartNameSuffix();
}
