package ca.gc.asc_csa.topology.ui.viewer.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;

import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.topology.ui.viewer.internal.IConstants;
import ca.gc.asc_csa.topology.ui.viewer.internal.PluginImages;


public class EnableHighSpeedMotionAction extends Action 
{
	/**
	 * The {@link TopologyView} on which we want to enable/disble high speed motion.
	 */
	private TopologyViewerProvider provider;
	
	public EnableHighSpeedMotionAction(TopologyViewerProvider provider) 
	{
		super("High Speed Motion", IAction.AS_CHECK_BOX);
		if (provider == null) 
		{
			throw new IllegalArgumentException("Provider is null");
		}

		// The image to assign to this action.
		ImageDescriptor highSpeedMotion = PluginImages.getImageDescriptor(IConstants.IMG_ELCL_ENABLE_HIGH_SPEED_MOTION);

		setImageDescriptor(highSpeedMotion);

		this.provider = provider;
	}

	@Override
	public void run() 
	{
		if (provider.getTopologyViewer() != null) 
		{
			provider.getTopologyViewer().setHighSpeedMotionEnabled(isChecked());
		}
	}
}
