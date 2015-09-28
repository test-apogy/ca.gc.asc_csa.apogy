package ca.gc.asc_csa.eclipse.images.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.ISection;

import ca.gc.asc_csa.eclipse.images.ui.Activator;
import ca.gc.asc_csa.eclipse.images.ui.properties.sections.ImageSection;
import ca.gc.asc_csa.eclipse.images.ui.views.ImageView;
import ca.gc.asc_csa.eclipse.ui.EclipseUiUtilities;

public class ImageCanvasZoomFitHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart part = HandlerUtil.getActivePart(event);				
		if (part instanceof IWorkbenchPart){		
			if (part instanceof ImageView){
				ImageView imageView = (ImageView) part;
				imageView.getCanvas().zoomFit();
			}else if (part instanceof PropertySheet){
				ISection section = EclipseUiUtilities.getActiveTabbedPropertySheetSection((PropertySheet)part, Activator.IMAGE_TABBED_PROPERTIES_SECTION_ID);
				if (section instanceof ImageSection){
					((ImageSection)section).getCanvas().zoomFit();
				}
			}
		}
		return null;
	}
}