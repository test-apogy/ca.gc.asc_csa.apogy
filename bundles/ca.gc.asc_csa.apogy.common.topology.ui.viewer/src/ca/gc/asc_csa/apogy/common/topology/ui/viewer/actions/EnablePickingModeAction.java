package ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.IConstants;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.PluginImages;


public class EnablePickingModeAction extends Action 
{
	/**
	 * The {@link TopologyView} on which we want to enable/disble high speed motion.
	 */
	private TopologyViewerProvider provider;
	
	public EnablePickingModeAction(TopologyViewerProvider provider) 
	{
		super("Enable Picking", IAction.AS_CHECK_BOX);
		if (provider == null) 
		{
			throw new IllegalArgumentException("Provider is null");
		}

		// The image to assign to this action.
		ImageDescriptor pickingMode = PluginImages.getImageDescriptor(IConstants.IMG_ELCL_ENABLE_PICKING_MODE);

		setImageDescriptor(pickingMode);

		this.provider = provider;
	}

	@Override
	public void run() 
	{
		if (provider.getTopologyViewer() != null) 
		{
			provider.getTopologyViewer().setPickingModeEnabled(isChecked());
		}
	}
}
