/*******************************************************************************
 * Copyright (c) 2010 - 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package ca.gc.asc_csa.apogy.rcp.handlers;

import java.util.List;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SwitchPerspectiveHandler {
	@Execute
	public void execute(MWindow window, EPartService partService, EModelService modelService, @Named("ca.gc.asc_csa.apogy.rcp.commands.switchPerspectiveCommandPerspectiveId") String id) {
		System.out.println("SwitchPerspectiveHandler.execute(): " + id);
		
//		MPerspective element = (MPerspective) modelService.find(id, app);
	    List<MPerspective> perspectives = modelService.findElements(window,
	            id, MPerspective.class, null);		
		
		// now switch perspective
		if (!perspectives.isEmpty()){
			partService.switchPerspective(perspectives.get(0));
		}else{			
			throw new RuntimeException("Perspective <"+ id + "> not found.");
		}
	}
}