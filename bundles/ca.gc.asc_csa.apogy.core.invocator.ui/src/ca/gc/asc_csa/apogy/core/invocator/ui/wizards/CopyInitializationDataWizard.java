package ca.gc.asc_csa.apogy.core.invocator.ui.wizards;
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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class CopyInitializationDataWizard extends Wizard implements INewWizard {
	private CopyInitializationDataWizardPage page;

	/**
	 * Constructor for CopyInitializationDataWizard.
	 */
	public CopyInitializationDataWizard() {
		super();
		setWindowTitle("Copy Apogy Initialization Data");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID,
				"icons/wizban/apogy_copy_initialization_data.png");
		setDefaultPageImageDescriptor(image);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		page = new CopyInitializationDataWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		try {
			ApogyCoreInvocatorUIFacade.INSTANCE.copyInitializationData(page.getSourceContext(), page.getDestinationContext());
			return true;
		} catch (Exception e) {
			Logger.INSTANCE.log(Activator.ID, this, "Contexts <" + page.getSourceContext().getName() + "> and <" + page.getDestinationContext().getName() + "> are not consistent.", EventSeverity.ERROR, e);
			return false;
		}
	}
}