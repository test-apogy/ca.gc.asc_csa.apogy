package org.eclipse.symphony.core.ui.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.Activator;
import org.eclipse.symphony.core.WorksiteContributor;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.ui.composites.WorksiteContributorsListComposite;

public class SymphonyWorksiteSelectionWizardPage extends WizardPage
{
	private final static String WIZARD_PAGE_ID = "org.eclipse.symphony.core.ui.wizards.SymphonyWorksiteSelectionWizardPage";
	private WorksiteContributorsListComposite listComposite;
	private final static String ERROR_MSG = "You must select one worksite";
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public SymphonyWorksiteSelectionWizardPage()
	{
		super(WIZARD_PAGE_ID);
		setTitle("Select Registered Symphony Worksite");
		setDescription("This wizard allows to select a registered Symphony Worksite.");
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
		if (Symphony__CoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() == null)
		{
			message = "There is no active Symphony Session.  Activate a session first.";
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