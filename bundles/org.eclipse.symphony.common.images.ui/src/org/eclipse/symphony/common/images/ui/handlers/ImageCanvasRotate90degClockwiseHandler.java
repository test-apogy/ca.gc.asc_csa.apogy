package org.eclipse.symphony.common.images.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.symphony.common.images.ui.Activator;
import org.eclipse.symphony.common.images.ui.properties.sections.ImageSection;
import org.eclipse.symphony.common.images.ui.views.ImageView;
import org.eclipse.symphony.common.ui.EclipseUiUtilities;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.ISection;

public class ImageCanvasRotate90degClockwiseHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart part = HandlerUtil.getActivePart(event);				
		if (part instanceof IWorkbenchPart){		
			if (part instanceof ImageView){
				ImageView imageView = (ImageView) part;
				imageView.getCanvas().rotate90degClockwise();
			}else if (part instanceof PropertySheet){
				ISection section = EclipseUiUtilities.getActiveTabbedPropertySheetSection((PropertySheet)part, Activator.IMAGE_TABBED_PROPERTIES_SECTION_ID);
				if (section instanceof ImageSection){
					((ImageSection)section).getCanvas().rotate90degClockwise();
				}
			}
		}
		return null;
	}
}