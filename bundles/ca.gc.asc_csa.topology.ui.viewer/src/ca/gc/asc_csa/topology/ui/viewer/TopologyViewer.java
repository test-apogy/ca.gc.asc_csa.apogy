package ca.gc.asc_csa.topology.ui.viewer;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.topology.ui.viewer.preferences.TopologyViewerPreferencesConstants;
import ca.gc.space.topology.ui.GraphicsContext;
import ca.gc.space.topology.ui.NodePresentation;
import ca.gc.space.topology.ui.TopologyPresentationSet;
import ca.gc.space.topology.ui.TopologyUIPackage;

/**
 * Base class for TopologyViewer.
 * @author pallard
 *
 */
public class TopologyViewer implements ITopologyViewer
{
	private IPropertyChangeListener propertyChangeListener = null;
	
	private boolean verbose = false; 
	private boolean showStatisticsEnabled = false;
	private boolean highSpeedMotionEnabled = false;
	private boolean pickingEnabled = false;
	private boolean antiAliasing = false;
	private boolean busy = false;
	
	private int maximumFrameRate = 10;
	
	/**
	 * The Adapter listening to changes in the TopologyPresentationSet.
	 */
	private Adapter topologyPresentationSetAdapter = null;
	
    /**
     * List of selection change listeners (element type: <code>ISelectionChangedListener</code>).
     *
     * @see #fireSelectionChanged
     */
    private List<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
    
    /**
     * List of ITopologyViewerListener currently registered.
     */
    private List<ITopologyViewerListener> topologyViewerListeners = new ArrayList<ITopologyViewerListener>();
    
    /**
     * The current selection.
     */
    private ISelection selection;
	
    /**
     * The GraphicsContext currently displayed.
     */
    protected GraphicsContext graphicsContext;
    
    /**
     * The IRenderEngineDelegate used by the TopologyViewer.
     */
	protected IRenderEngineDelegate iRenderEngineDelegate;

	
	public TopologyViewer(Composite parent, IRenderEngineDelegate iRenderEngineDelegate)
	{
		this.iRenderEngineDelegate = iRenderEngineDelegate;				
		initializeComposite(parent);
		
		// Initialize Viewer setting from Preferences				
		updateSettingFromPreferences();
		
		ca.gc.asc_csa.topology.ui.viewer.Activator.getTopologyViewerRegistry().registerITopologyViewer(this);
		
		ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPropertyChangeListener());
	}
	
	@Override
	public Object getInput() 
	{		
		return graphicsContext;
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) 
	{
		if(listener != null) selectionChangedListeners.add(listener);	
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) 
	{
		if(listener != null) selectionChangedListeners.remove(listener);
	}

	@Override
	public ISelection getSelection() 
	{		
		return selection;
	}
	
	@Override
	public void setSelection(ISelection selection) 
	{		
		this.selection = selection;
		fireSelectionChanged(new SelectionChangedEvent(this, selection));	
	}

	@Override
	public boolean isBusy() 
	{		
		return busy;
	}

	@Override
	public void setInput(Object input) 
	{		
		if(!isBusy())
		{			
			if(input instanceof GraphicsContext)
			{
				GraphicsContext newGraphicsContext = (GraphicsContext) input;
												
				// If the input is different then the one currently selected.
				if(newGraphicsContext != graphicsContext)
				{						
					// Set the new GraphicsContext
					setGraphicsContext(newGraphicsContext);
				}								
			}
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "Viewer Busy, set input rejected!", EventSeverity.WARNING);
		}
	}

	@Override
	public void setVerbose(boolean verbose) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting verbose enabled to <" + verbose + ">", EventSeverity.INFO);	
		
		this.verbose = verbose;
		if(iRenderEngineDelegate != null)
		{
			iRenderEngineDelegate.setVerbose(verbose);
		}
	}

	@Override
	public boolean isVerbose() 
	{		
		return verbose;
	}

	@Override
	public void zoomToFit() 
	{
		if(graphicsContext != null && graphicsContext.getTopologyPresentationSet() != null)
		{
			iRenderEngineDelegate.zoomToFit(graphicsContext.getTopologyPresentationSet());			
		}
	}

	@Override
	public void setShowStatisticsEnabled(boolean enable) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting show statistics enabled to <" + enable + ">", EventSeverity.INFO);		
		this.showStatisticsEnabled = enable;
		iRenderEngineDelegate.setShowStatisticsEnabled(enable);
	}

	@Override
	public boolean isShowStatisticsEnabled() 
	{		
		return showStatisticsEnabled;
	}

	@Override
	public BufferedImage takeScreenshot() 
	{
		return iRenderEngineDelegate.takeScreenshot();
	}

	@Override
	public void setAntiAliasing(boolean enable) 
	{		
		this.antiAliasing = enable;
		iRenderEngineDelegate.setAntiAliasing(enable);
	}

	@Override
	public boolean isAntiAliasingEnabled() 
	{
		return antiAliasing;
	}

	@Override
	public void setMaximumFrameRate(int maximumFrameRate) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting maximum frame rate to <" + maximumFrameRate + ">", EventSeverity.INFO);	
		this.maximumFrameRate = maximumFrameRate;
		iRenderEngineDelegate.setMaximumFrameRate(maximumFrameRate);		
	}

	@Override
	public int getMaximumFrameRate() 
	{
		return maximumFrameRate;
	}

	@Override
	public void levelViewPoint() 
	{	
		iRenderEngineDelegate.levelViewPoint();
	}

	@Override
	public void setHighSpeedMotionEnabled(boolean highSpeedMotionEnabled) 
	{
		this.highSpeedMotionEnabled = highSpeedMotionEnabled;
		iRenderEngineDelegate.setHighSpeedMotionEnabled(highSpeedMotionEnabled);
	}

	@Override
	public boolean isHighSpeedMotionEnabled() 
	{		
		return highSpeedMotionEnabled;
	}
	
	@Override
	public void setPickingModeEnabled(boolean pickingModeEnabled) 
	{
		this.pickingEnabled = pickingModeEnabled;
		iRenderEngineDelegate.setPickingModeEnabled(pickingModeEnabled);
	}
	
	@Override
	public boolean isPickingModeEnabled() 
	{
		return this.pickingEnabled;
	}
	
	@Override
	public void addITopologyViewerListener(ITopologyViewerListener topologyViewerListener) 
	{
		if(topologyViewerListener != null)
		{
			topologyViewerListeners.add(topologyViewerListener);
		}
	}

	@Override
	public void removeITopologyViewerListener(ITopologyViewerListener topologyViewerListener) 
	{
		if(topologyViewerListener != null)
		{
			topologyViewerListeners.remove(topologyViewerListener);
		}
	}

	@Override
	public void dispose() 
	{
		ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getPreferenceStore().removePropertyChangeListener(getPropertyChangeListener());
		ca.gc.asc_csa.topology.ui.viewer.Activator.getTopologyViewerRegistry().unRegisterITopologyViewer(this);
		
		// Unregister from the GraphicsContext
		if(graphicsContext != null)
		{
			graphicsContext.dispose();
		}
				
		// Dispose of the RenderEngineDelegate.
		iRenderEngineDelegate.dispose();		
	}
		
	/**
	 * Initialize the composite associated with this TopologyViewer.
	 * @param parent
	 */
	protected void initializeComposite(Composite parent)
	{
		Composite top = new Composite(parent, SWT.NONE);
		top.setLayout(new FillLayout());
		
		// Adds the render composite.
		iRenderEngineDelegate.createRenderComposite(this, top);
	}		
	
	/**
	 * Sets the GraphicsContext to be used for display.
	 * @param newGraphicsContext The new GraphicsContext to display. Can be null.
	 */
	protected void setGraphicsContext(GraphicsContext newGraphicsContext)
	{
		setBusy(true);
		
		if(this.graphicsContext != null)
		{
			// Unregister from the previous TopologyPresentationSet
			TopologyPresentationSet oldPresentationTopology = this.graphicsContext.getTopologyPresentationSet();
			if(oldPresentationTopology != null)
			{
				// Unregister from the previous PresentationTopology.
				oldPresentationTopology.eAdapters().remove(getTopologyPresentationSetAdapter());
				
				// Clears the displayed topology.
				clearDisplayedTopology(oldPresentationTopology);
				
				// Dispose of the graphics context.
				this.graphicsContext.dispose();
			}
		}
		
		this.graphicsContext = newGraphicsContext;
		
		if(newGraphicsContext != null)
		{
			// Register to the new TopologyPresentationSet
			TopologyPresentationSet newPresentationTopology = newGraphicsContext.getTopologyPresentationSet();
			if(newPresentationTopology != null)
			{
				// Initialize the displayed topology.
				initializeDisplayedTopology(newPresentationTopology);
				
				// Register to the new GraphicsContext
				newPresentationTopology.eAdapters().add(getTopologyPresentationSetAdapter());
			}
		}
		
		setBusy(false);
	}
	
	protected void setBusy(boolean newBusy)
	{
		boolean oldBusy = this.busy;
		this.busy = newBusy;
		
		if(oldBusy != newBusy)
		{
			fireBusyChanged(oldBusy, newBusy);
		}
	}
	
	protected void initializeDisplayedTopology(TopologyPresentationSet topologyPresentationSet)
	{
		if(topologyPresentationSet != null)
		{
			List<NodePresentation> presentationList = new ArrayList<NodePresentation>(topologyPresentationSet.getNodePresentationList());
			iRenderEngineDelegate.add(presentationList);
		}
	}
	
	protected void clearDisplayedTopology(TopologyPresentationSet topologyPresentationSet)
	{
		if(topologyPresentationSet != null)
		{
			List<NodePresentation> presentationList = new ArrayList<NodePresentation>(topologyPresentationSet.getNodePresentationList());
			iRenderEngineDelegate.remove(presentationList);
		}
	}
	
	/**
     * Notifies any selection changed listeners that the viewer's selection has changed.
     * Only listeners registered at the time this method is called are notified.
     *
     * @param event a selection changed event
     *
     * @see ISelectionChangedListener#selectionChanged
     */
    protected void fireSelectionChanged(final SelectionChangedEvent event) 
    {    	
        for (ISelectionChangedListener listener : selectionChangedListeners) 
        {
            final ISelectionChangedListener l = listener;
            SafeRunnable.run(new SafeRunnable() 
            {
                @Override
				public void run() 
                {
                	if(l != null) l.selectionChanged(event);
                }
            });
        }
    }
    
    /**
     * Method used to signal to all ITopologyViewerListener a change in the busy value.
     * @param oldBusy Previous value of busy.
     * @param newBusy New value of busy.
     */
    protected void fireBusyChanged(boolean oldBusy, boolean newBusy)
    {
    	for(ITopologyViewerListener listener : topologyViewerListeners)
    	{
    		final ITopologyViewerListener l = listener;
    		final boolean oldBusyValue = oldBusy;
    		final boolean newBusyValue = newBusy;
    		SafeRunnable.run(new SafeRunnable() 
            {
                @Override
				public void run() 
                {
                	if(l != null) l.busyChanged(oldBusyValue, newBusyValue);
                }
            });
    	}
    }
	
    /**
     * Returns the Adapter used to listens to changes in the TopologyPresentationSet. This adapter is responsible
     * for calling the iRenderEngineDelegate to add or remove NodePresention when the TopologyPresentationSet changes. 
     * @return The Adapter.
     */
	protected Adapter getTopologyPresentationSetAdapter()
	{
		if(topologyPresentationSetAdapter == null)
		{
			topologyPresentationSetAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof TopologyPresentationSet)
					{
						int featureId = msg.getFeatureID(TopologyPresentationSet.class);
						switch (featureId) 
						{
							case TopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST:
							{
								int eventType = msg.getEventType();
								
								switch (eventType) 
								{
									case Notification.ADD:
									{
										if(msg.getNewValue() instanceof NodePresentation)
										{
											NodePresentation nodePresentation = (NodePresentation) msg.getNewValue();
											iRenderEngineDelegate.add(nodePresentation);
										}
									}
									break;
									
									case Notification.ADD_MANY:
									{
										@SuppressWarnings("unchecked")
										List<NodePresentation> toAdd = (List<NodePresentation>) msg.getNewValue();
										iRenderEngineDelegate.add(toAdd);
									}
									break;
									
									case Notification.REMOVE:
									{
										if(msg.getOldValue() instanceof NodePresentation)
										{
											NodePresentation nodePresentation = (NodePresentation) msg.getOldValue();
											iRenderEngineDelegate.remove(nodePresentation);
										}
									}
									break;
									
									case Notification.REMOVE_MANY:
									{
										@SuppressWarnings("unchecked")
										List<NodePresentation> toRemove = (List<NodePresentation>) msg.getOldValue();
										iRenderEngineDelegate.remove(toRemove);
									}
									break;

								default:
									break;
								}
							}
							break;

						default:
							break;
						}
					}
				}
			};
		}
		return topologyPresentationSetAdapter;
	}

	private IPropertyChangeListener getPropertyChangeListener() 
	{
		if(propertyChangeListener == null)
		{
			propertyChangeListener = new IPropertyChangeListener() 
			{			
				@Override
				public void propertyChange(PropertyChangeEvent event) 
				{
					// Update all viewer preferences.
					updateSettingFromPreferences();
				}
			};
		}
		
		return propertyChangeListener;
	}
	
	private void updateSettingFromPreferences()
	{
		// Update all viewer preferences.
		IPreferenceStore store = ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getPreferenceStore();
		
		Integer maxFrameRate = store.getInt(TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_ID);
		if(maxFrameRate != null) setMaximumFrameRate(maximumFrameRate);			
		
		Boolean antiAliasing = store.getBoolean(TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_ID);
		if(antiAliasing != null) setAntiAliasing(antiAliasing);
		
		Boolean verbose = store.getBoolean(TopologyViewerPreferencesConstants.VIEWER_VERBOSE_ID);
		if(verbose != null) setVerbose(verbose);
	}

	
}
