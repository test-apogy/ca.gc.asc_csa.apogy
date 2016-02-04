package ca.gc.asc_csa.apogy.core.ui.decorators;
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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import ca.gc.asc_csa.apogy.core.Updatable;
import ca.gc.asc_csa.apogy.core.ui.Activator;
import org.eclipse.ui.plugin.AbstractUIPlugin;

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
