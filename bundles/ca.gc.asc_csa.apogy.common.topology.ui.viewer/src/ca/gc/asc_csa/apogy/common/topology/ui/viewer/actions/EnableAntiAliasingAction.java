package ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions;
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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.IConstants;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.PluginImages;

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
