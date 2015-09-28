package ca.gc.asc_csa.symphony.topology.ui.views;

import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.viewer.TopologyViewer;
import ca.gc.asc_csa.topology.ui.viewer.views.AbstractTopology3DView;

public abstract class AbstractSymphony3DView extends AbstractTopology3DView
{
	
	@Override
	public TopologyViewer createTopologyViewer(Composite parent) 
	{
		JME3RenderEngineDelegate jme3RenderEngineDelegate = createJME3RenderEngineDelegate();		
		TopologyViewer viewer = new TopologyViewer(parent, jme3RenderEngineDelegate);
		
		jme3RenderEngineDelegate.setMaximumFrameRate(viewer.getMaximumFrameRate());
		jme3RenderEngineDelegate.setVerbose(viewer.isVerbose());		
		jme3RenderEngineDelegate.setAntiAliasing(viewer.isAntiAliasingEnabled());
		jme3RenderEngineDelegate.setShowStatisticsEnabled(viewer.isShowStatisticsEnabled());
		
		return viewer;
	}
	
	/**
	 * Method that create the JME3RenderEngineDelegate to be used.
	 * @return The JME3RenderEngineDelegate to be used.
	 */
	protected abstract JME3RenderEngineDelegate createJME3RenderEngineDelegate();

}
