package ca.gc.asc_csa.apogy.core.ui.handlers;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class ImportWorksiteHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		/** Verifies if there is a selection associated to the event. */
//		ISelection selection = HandlerUtil.getActiveMenuSelection(event);
//		if (selection != null) {
//			List<?> list = ca.gc.asc_csa.apogy.common.converters.Activator.convert(selection, AbstractEImage.class);
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