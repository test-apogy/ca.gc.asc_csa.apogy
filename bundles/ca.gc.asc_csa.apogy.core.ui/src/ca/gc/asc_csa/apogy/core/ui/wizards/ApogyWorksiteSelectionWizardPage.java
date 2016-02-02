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

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.Activator;
import ca.gc.asc_csa.apogy.core.WorksiteContributor;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.ui.composites.WorksiteContributorsListComposite;

public class ApogyWorksiteSelectionWizardPage extends WizardPage
{
	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.ui.wizards.ApogyWorksiteSelectionWizardPage";
	private WorksiteContributorsListComposite listComposite;
	private final static String ERROR_MSG = "You must select one worksite";
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ApogyWorksiteSelectionWizardPage()
	{
		super(WIZARD_PAGE_ID);
		setTitle("Select Registered Apogy Worksite");
		setDescription("This wizard allows to select a registered Apogy Worksite.");
		validate();
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent)
	{
		listComposite = new WorksiteContributorsListComposite(parent, SWT.NONE, Activator.getRegisteredWorksiteProviders())
		{
			@Override
			protected void newWorksiteContributorSelected(WorksiteContributor selectedWorksiteContributor)
			{
				validate();
			}
		};
		setControl(listComposite);
	}	
	
	protected void validate()
	{
		String message = null;
		if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() == null)
		{
			message = "There is no active Apogy Session.  Activate a session first.";
		}
		else
		{
			if (getWorksiteContributor() == null)
			{
				message = ERROR_MSG;			
			}
		}	
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public WorksiteContributor getWorksiteContributor()
	{
		return listComposite == null ? null : listComposite.getSelectedWorksiteContributor();
	}
}