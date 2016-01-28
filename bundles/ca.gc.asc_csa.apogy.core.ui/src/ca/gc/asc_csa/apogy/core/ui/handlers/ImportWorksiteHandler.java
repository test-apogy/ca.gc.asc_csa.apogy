package org.eclipse.symphony.core.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class ImportWorksiteHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		/** Verifies if there is a selection associated to the event. */
//		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
//		if (selection != null) {
//			List<?> list = org.eclipse.symphony.common.converters.Activator.convert(selection, AbstractEImage.class);
//			if (list != null && !list.isEmpty()){
//				AbstractEImage image = (AbstractEImage) list.get(0);
//				ImageData imageData = EImagesUtilities.INSTANCE.convertToImageData(image.asBufferedImage());
//				ImagesUiUtilities.export(imageData);			
//			}
//		} else {
//
//			IWorkbenchPart part = HandlerUtil.getActivePart(event);
//			if (part instanceof IWorkbenchPart) {
//				if (part instanceof ImageView) {
//					ImageView imageView = (ImageView) part;
//					ImagesUiUtilities.export(imageView.getCanvas()
//							.getImageData());
//				} else if (part instanceof PropertySheet) {
//					ISection section = EclipseUiUtilities
//							.getActiveTabbedPropertySheetSection(
//									(PropertySheet) part,
//									Activator.IMAGE_TABBED_PROPERTIES_SECTION_ID);
//					if (section instanceof ImageSection) {
//						ImagesUiUtilities.export(((ImageSection) section)
//								.getCanvas().getImageData());
//					}
//				}
//			}
//		}
		return null;
	}
}