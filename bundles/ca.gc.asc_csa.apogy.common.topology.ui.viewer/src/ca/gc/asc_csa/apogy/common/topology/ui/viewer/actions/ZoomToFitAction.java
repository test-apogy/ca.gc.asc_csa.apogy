package ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.IConstants;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.PluginImages;


public class ZoomToFitAction extends Action 
{
	/**
	 * The {@link TopologyView} on which we want to perform a zoom to fit.
	 */
	private TopologyViewerProvider provider;
	
	public ZoomToFitAction(TopologyViewerProvider provider) 
	{
		super("Zoom-to-Fit");
		if (provider == null) 
		{
			throw new IllegalArgumentException("Provider is null");
		}

		// The image to assign to this action.
		ImageDescriptor zoomToFit = PluginImages.getImageDescriptor(IConstants.IMG_ELCL_ZOOM_TO_FIT);

		setImageDescriptor(zoomToFit);

		this.provider = provider;
	}

	@Override
	public void run() 
	{
		if (provider.getTopologyViewer() != null) 
		{
			provider.getTopologyViewer().zoomToFit();
		}
	}
}
