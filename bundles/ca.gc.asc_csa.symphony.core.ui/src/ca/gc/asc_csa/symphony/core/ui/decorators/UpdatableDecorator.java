package ca.gc.asc_csa.symphony.core.ui.decorators;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.symphony.core.Updatable;
import ca.gc.asc_csa.symphony.core.ui.Activator;

public class UpdatableDecorator extends LabelProvider implements ILightweightLabelDecorator 
{
	private static ImageDescriptor UPDATING_IMG_DESCRIPTOR = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,"icons/ovr/updating_ovr_7x8.gif");
	private static ImageDescriptor AUTO_UPDATE_DISABLED_IMG_DESCRIPTOR = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,"icons/ovr/auto_update_disabled_ovr_7x8.gif");

	public static final String SUFFIX = "(Updating)";
	
	@Override
	public void decorate(Object element, IDecoration decoration) 
	{
		if(element instanceof Updatable)
		{
			Updatable updatable = (Updatable) element;
			
			if(updatable.isUpdating())
			{
				decoration.addOverlay(UPDATING_IMG_DESCRIPTOR, IDecoration.TOP_LEFT);
				decoration.addSuffix(SUFFIX);
			}
			
			if(!updatable.isAutoUpdateEnabled())
			{
				decoration.addOverlay(AUTO_UPDATE_DISABLED_IMG_DESCRIPTOR, IDecoration.TOP_RIGHT);
			}
		}
	}
}
