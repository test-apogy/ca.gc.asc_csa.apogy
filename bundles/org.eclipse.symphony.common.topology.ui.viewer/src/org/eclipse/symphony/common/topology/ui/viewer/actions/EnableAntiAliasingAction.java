package org.eclipse.symphony.common.topology.ui.viewer.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerProvider;
import org.eclipse.symphony.common.topology.ui.viewer.internal.IConstants;
import org.eclipse.symphony.common.topology.ui.viewer.internal.PluginImages;

public class EnableAntiAliasingAction extends Action {

	private TopologyViewerProvider provider;

	public EnableAntiAliasingAction(TopologyViewerProvider provider) 
	{
		super("Anti-Aliasing", IAction.AS_CHECK_BOX);

		this.provider = provider;

		ImageDescriptor enabledImageDescriptor = PluginImages
				.getImageDescriptor(IConstants.IMG_ELCL_ANTIALIASING);
		setImageDescriptor(enabledImageDescriptor);

		update();
	}

	@Override
	public void run() 
	{
		provider.getTopologyViewer().setAntiAliasing(isChecked());
	}

	public void update() 
	{
		if(provider != null && provider.getTopologyViewer() != null)
		{
			setChecked(provider.getTopologyViewer().isAntiAliasingEnabled());
		}
	}
}
