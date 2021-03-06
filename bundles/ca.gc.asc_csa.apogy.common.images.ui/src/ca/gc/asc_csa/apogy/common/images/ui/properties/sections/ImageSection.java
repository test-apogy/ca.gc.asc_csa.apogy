package ca.gc.asc_csa.apogy.common.images.ui.properties.sections;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ui.composites.SWTImageCanvas;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class ImageSection extends AbstractExtendedPropertySection implements IFilter
{
	@Override
	public boolean select(Object toTest)
	{
		return (ApogyCommonConvertersFacade.INSTANCE.convert(toTest, AbstractEImage.class) != null);
	}

	@Override
	protected void render(EObject eObject)
	{
		AbstractEImage image = (AbstractEImage) ApogyCommonConvertersFacade.INSTANCE.convert(eObject, AbstractEImage.class);
		
		if (image != null && image.asBufferedImage() != null)
		{
			ImageData imageData = EImagesUtilities.INSTANCE.convertToImageData(image.asBufferedImage());
			((SWTImageCanvas) getComposite()).setImageData(imageData);
		}
	}

	@Override
	public boolean shouldUseExtraSpace()
	{
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent)
	{
		return new SWTImageCanvas(parent, SWT.NONE);
	}

	public SWTImageCanvas getCanvas()
	{
		return (SWTImageCanvas) getComposite();
	}
}