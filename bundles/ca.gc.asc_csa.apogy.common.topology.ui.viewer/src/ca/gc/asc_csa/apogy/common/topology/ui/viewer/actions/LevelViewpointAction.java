package ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.IConstants;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.PluginImages;


public class LevelViewpointAction extends Action 
{
	/**
	 * The {@link TopologyView} on which we want to perform a level viewpoint.
	 */
	private TopologyViewerProvider provider;
	
	public LevelViewpointAction(TopologyViewerProvider provider) 
	{
		super("Level View  Point");
		if (provider == null) 
		{
			throw new IllegalArgumentException("Provider is null");
		}

		// The image to assign to this action.
		ImageDescriptor levelViewPoint = PluginImages.getImageDescriptor(IConstants.IMG_ELCL_LEVEL_VIEWPOINT);

		setImageDescriptor(levelViewPoint);

		this.provider = provider;
	}

	@Override
	public void run() 
	{
		if (provider.getTopologyViewer() != null) 
		{
			provider.getTopologyViewer().levelViewPoint();
		}
	}
}
