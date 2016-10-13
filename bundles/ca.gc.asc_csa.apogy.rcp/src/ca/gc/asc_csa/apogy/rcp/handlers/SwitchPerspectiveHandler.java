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

import java.util.Iterator;
import java.util.List;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SwitchPerspectiveHandler {
	@Execute
	public void execute(MPerspective activePerspective, 
			            MApplication app,
			            EPartService partService, 
			            EModelService modelService, 
			            @Named("ca.gc.asc_csa.apogy.rcp.commands.switchPerspectiveCommandPerspectiveId") String id, 
			            @Named("ca.gc.asc_csa.apogy.rcp.commands.switchPerspectiveCommandPerspectiveLabel") String label){
		System.out.println("SwitchPerspectiveHandler.execute(): " + id);
		System.out.println("SwitchPerspectiveHandler.execute(): active = " + activePerspective.getElementId());
		
		List<MPerspective> perspectives = modelService.findElements(app, id, MPerspective.class, null);

		
		System.out.println("SwitchPerspectiveHandler.execute(): Registered Perspectives:");
		for (Iterator iterator = perspectives.iterator(); iterator.hasNext();) {
			MPerspective mPerspective = (MPerspective) iterator.next();			
			System.out.println(mPerspective.getElementId());			
		}
		System.out.println("---------------------------------------------------------------");
		
		
		MPerspective element = (MPerspective) modelService.find(id, app);	
		if (element == null){
			element = (MPerspective) modelService.find(id + "<" + label + ">", app);
		}
		
		// now switch perspective
		if (element!=null){
			if (element != activePerspective){
				partService.switchPerspective(element);
			}
		}else{			
			System.out.println("SwitchPerspectiveHandler.execute() Perspective <"+ id + "> not found.");
		}
	}
}