package org.eclipse.symphony.common.images.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ui.composites.SWTImageCanvas;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class ImageSection extends AbstractExtendedPropertySection implements
		IFilter {

	@Override
	public boolean select(Object toTest) {
		return ca.gc.asc_csa.eclipse.converters.Activator
				.convert(toTest, AbstractEImage.class) != null;
	}

	@Override
	protected void render(EObject eObject) {
		AbstractEImage image = (AbstractEImage) ca.gc.asc_csa.eclipse.converters.Activator
				.convert(eObject, AbstractEImage.class);
		if (image != null && image.asBufferedImage() != null) {
			ImageData imageData = EImagesUtilities.INSTANCE
					.convertToImageData(image.asBufferedImage());
			((SWTImageCanvas) getComposite()).setImageData(imageData);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new SWTImageCanvas(parent, SWT.NONE);
	}

	public SWTImageCanvas getCanvas() {
		return (SWTImageCanvas) getComposite();
	}
}