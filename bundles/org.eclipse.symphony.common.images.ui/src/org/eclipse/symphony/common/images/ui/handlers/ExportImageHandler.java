package org.eclipse.symphony.common.images.ui.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ui.Activator;
import org.eclipse.symphony.common.images.ui.ImagesUiUtilities;
import org.eclipse.symphony.common.images.ui.properties.sections.ImageSection;
import org.eclipse.symphony.common.images.ui.views.ImageView;
import org.eclipse.symphony.common.ui.EclipseUiUtilities;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.ISection;

public class ExportImageHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		/** Verifies if there is a selection associated to the event. */
		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
		if (selection != null) {
			List<?> list = org.eclipse.symphony.common.converters.Activator.convert(selection, AbstractEImage.class);
			if (list != null && !list.isEmpty()){
				AbstractEImage image = (AbstractEImage) list.get(0);
				ImageData imageData = EImagesUtilities.INSTANCE.convertToImageData(image.asBufferedImage());
				ImagesUiUtilities.export(imageData);			
			}
		} else {

			IWorkbenchPart part = HandlerUtil.getActivePart(event);
			if (part instanceof IWorkbenchPart) {
				if (part instanceof ImageView) {
					ImageView imageView = (ImageView) part;
					ImagesUiUtilities.export(imageView.getCanvas()
							.getImageData());
				} else if (part instanceof PropertySheet) {
					ISection section = EclipseUiUtilities
							.getActiveTabbedPropertySheetSection(
									(PropertySheet) part,
									Activator.IMAGE_TABBED_PROPERTIES_SECTION_ID);
					if (section instanceof ImageSection) {
						ImagesUiUtilities.export(((ImageSection) section)
								.getCanvas().getImageData());
					}
				}
			}
		}
		return null;
	}
}