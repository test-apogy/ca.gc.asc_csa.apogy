package ca.gc.asc_csa.topology.ui.viewer.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;

import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.topology.ui.viewer.internal.IConstants;
import ca.gc.asc_csa.topology.ui.viewer.internal.PluginImages;

public class EnableStatisticsDisplayAction extends Action {

	private TopologyViewerProvider provider;

	public EnableStatisticsDisplayAction(TopologyViewerProvider provider) 
	{
		super("Statistics", IAction.AS_CHECK_BOX);

		this.provider = provider;

		ImageDescriptor enabledImageDescriptor = PluginImages.getImageDescriptor(IConstants.IMG_ELCL_STATISTICS);
		setImageDescriptor(enabledImageDescriptor);

		update();
	}

	@Override
	public void run() 
	{
		provider.getTopologyViewer().setShowStatisticsEnabled(isChecked());
	}

	public void update() 
	{
		if(provider != null && provider.getTopologyViewer() != null)
		{
			setChecked(provider.getTopologyViewer().isShowStatisticsEnabled());
		}
	}
}
