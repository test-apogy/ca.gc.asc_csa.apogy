package ca.gc.asc_csa.apogy.common.topology.ui.viewer.commands;
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
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class ZoomToFit extends AbstractHandler {		

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		if (activeWorkbenchWindow.getActivePage().getActivePart() instanceof TopologyViewerProvider) 
		{
			TopologyViewerProvider topoView = (TopologyViewerProvider) activeWorkbenchWindow.getActivePage().getActivePart();
			topoView.getTopologyViewer().zoomToFit();		
		}
		return null;
	}

}
