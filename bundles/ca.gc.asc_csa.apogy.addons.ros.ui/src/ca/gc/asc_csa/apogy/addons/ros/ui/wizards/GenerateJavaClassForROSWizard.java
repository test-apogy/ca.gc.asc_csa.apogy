package ca.gc.asc_csa.apogy.addons.ros.ui.wizards;
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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.ros.internal.message.GenerateInterfaces;

public class GenerateJavaClassForROSWizard extends Wizard implements INewWizard
{
	private GenerateJavaClassForROSWizardDestinationPage pageOne;
	
	public GenerateJavaClassForROSWizard()
	{
		super();
		setWindowTitle("Create ROS Java classes.");
	}
	
	@Override
	public boolean canFinish() 
	{			
		boolean rosPackageDefined = pageOne.getROSPackagePath() != null && pageOne.getROSPackagePath().length() > 0;
		boolean destinationPathDefined = pageOne.getPath() != null && pageOne.getPath().length() > 0;
		return rosPackageDefined && destinationPathDefined;
	}
	
	@Override
	public boolean performFinish() 
	{		
		String[] args = new String[]{pageOne.getPath()};
		GenerateInterfaces.main(args);		
		return true;
	}
	
	@Override
	public void addPages() 
	{
		pageOne = new GenerateJavaClassForROSWizardDestinationPage("");
		addPage(pageOne);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection)
	{
		
	}
}
