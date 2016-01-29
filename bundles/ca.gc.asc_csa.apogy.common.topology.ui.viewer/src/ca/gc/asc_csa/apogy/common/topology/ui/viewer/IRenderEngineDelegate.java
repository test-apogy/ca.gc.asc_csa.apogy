package ca.gc.asc_csa.apogy.common.topology.ui.viewer;

import java.awt.image.BufferedImage;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;

public interface IRenderEngineDelegate 
{						
	/**
	 * Create the composite into which the rendering will be done and attach it to the specified parent.
	 * @param topologyViewer The ITopologyViewer associated with this IRenderEngineDelegate.
	 * @param parent The parent composite.
	 * @return The composite created.
	 */
	public Composite createRenderComposite(ITopologyViewer topologyViewer, Composite parent);
		
	/**
	 * Adds a NodePresentation. This should have the effect of adding the associated SceneObject in the displayed scene.
	 * @param nodePresentation The NodePresentation to add.	
	 */
	public void add(NodePresentation nodePresentation);

	/**
	 * Adds a list of NodePresentation. This should have the effect of adding the associated SceneObjects in the displayed scene.
	 * @param nodePresentationList The List of NodePresentation to add.	
	 */
	public void add(List<NodePresentation> nodePresentationList);
	
	/**
	 * Removes a NodePresentation. This should have the effect of removing the associated SceneObject from the displayed scene.
	 * @param nodePresentation The NodePresentation to remove.	
	 */
	public void remove(NodePresentation nodePresentation);
	
	/**
	 * Removes a list of NodePresentation. This should have the effect of removing the associated SceneObjects from the displayed scene.
	 * @param nodePresentationList The List of NodePresentation to remove.	
	 */
	public void remove(List<NodePresentation> nodePresentationList);
		
	/**
	 * Enables or disables verbose mode of the viewer.
	 * @param enable True enables verbose, false disabled it.
	 */
	public void setVerbose(boolean verbose);
	
	/**
	 * Sets the maximum frame rate to be used by the viewer.
	 * @param maximumFrameRate The maximum frame rate, in frames per second.
	 */
	public void setMaximumFrameRate(int maximumFrameRate);
	
	/**
	 * Sets whether or not anti-aliasing should be used for rendering.
	 * @param True to enable anti-aliasing, false to disable anti-aliasing.
	 */
	public void setAntiAliasing(boolean enable);	
	
	/**
	 * Set whether or not the viewer statistics should be displayed.
	 * @param enable True enables showing statistics, false disabled it.
	 */
	public void setShowStatisticsEnabled(boolean enable);

	/**
	 * Cause the viewer to change the viewing location and orientation to display the entire scene.
	 */
	public void zoomToFit(TopologyPresentationSet topologyPresentationSet);
	
	/**
	 * Cause the viewpoint orientation to be updated such that the view has the +Z in the up direction.
	 */
	public void levelViewPoint();
	
	/**
	 * Set the high speed enabled.
	 * @param highSpeedEnabled True enables highSpeed motion, false disables it.
	 */
	public void setHighSpeedMotionEnabled(boolean highSpeedMotionEnabled);
	
	/**
	 * Set the picking mode enabled.
	 * @param pickingModeEnabled True enables picking, false disables it.
	 */
	public void setPickingModeEnabled(boolean pickingModeEnabled);
	
	/**
	 * Takes an image snapshot of the topology viewer.
	 * @return The image snapshot.
	 */
	public BufferedImage takeScreenshot();
	
	/**
	 * Return the Node associated with an object of the scene graph.
	 * @param sceneGraphObject The object from the scene graph.
	 * @return The associated Node, null if none is found.
	 */
	public Node getTopologyNode(Object sceneGraphObject);
	
	/**
	 * Dispose of this IRenderEngineDelegate. This method is called by the TopologyViewer when it is itself disposed of.
	 */
	public void dispose();
}
