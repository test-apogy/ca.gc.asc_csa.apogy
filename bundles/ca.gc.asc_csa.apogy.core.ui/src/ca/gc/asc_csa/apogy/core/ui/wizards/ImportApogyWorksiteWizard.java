package ca.gc.asc_csa.apogy.core.ui.wizards;
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

import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.WorksiteContributor;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.ui.Activator;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ImportApogyWorksiteWizard extends Wizard implements INewWizard {
	private ApogyWorksiteSelectionWizardPage page;

	/**
	 * Constructor for NewApogySessionWizard.
	 */
	public ImportApogyWorksiteWizard() {
		super();
		setWindowTitle("Import Apogy Worksite");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID,
				"icons/wizban/apogy_import_worksite.png");
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
		page = new ApogyWorksiteSelectionWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {

		WorksiteContributor worksiteContributor = page.getWorksiteContributor();

		try {
			List<EObject> content = ApogyCommonEMFFacade.INSTANCE
					.getContent(worksiteContributor.uri);
			AbstractWorksite worksite = (AbstractWorksite) content.get(0);

			InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE
					.getActiveInvocatorSession();
			ApogyEnvironment environment = (ApogyEnvironment) session
					.getEnvironment();

			/**
			 * Create and Execute Command Stack Command.
			 */
			EditingDomain editingDomain = AdapterFactoryEditingDomain
					.getEditingDomainFor(session);

			CompoundCommand command = new CompoundCommand();
			command.append(new AddCommand(editingDomain, environment
					.getWorksitesList(),
					ApogyCorePackage.Literals.WORKSITES_LIST__WORKSITES,
					worksite));

			command.append(new SetCommand(
					editingDomain,
					environment,
					ApogyCorePackage.Literals.APOGY_ENVIRONMENT__ACTIVE_WORKSITE,
					worksite));
			editingDomain.getCommandStack().execute(command);

		} catch (Throwable e) {
			Logger.INSTANCE.log(Activator.ID, this, "Unable to load the worksite " + worksiteContributor.uri.toString(), EventSeverity.ERROR, e);			
			return false;
		}

		return true;
	}
}