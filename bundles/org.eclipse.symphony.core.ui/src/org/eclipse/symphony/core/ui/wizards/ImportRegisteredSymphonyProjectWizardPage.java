package org.eclipse.symphony.core.ui.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Activator;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.SessionContributor;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.composites.SessionContributorListComposite;

public class ImportRegisteredSymphonyProjectWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "org.eclipse.symphony.core.ui.wizards.ImportRegisteredSymphonyProjectWizardPage";
	private SessionContributorListComposite listComposite;
	private final static String ERROR_MSG = "You must select one session";
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ImportRegisteredSymphonyProjectWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Import Registered Symphony Project");
		setDescription("This wizard imports an existing registered Symphony Project.");

		setErrorMessage(ERROR_MSG);
		setPageComplete(false);
	}


	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		listComposite = new SessionContributorListComposite(parent, SWT.NONE, Activator.getRegisteredSessionProviders()){
			@Override
			protected void sessionContributorSelected(
					SessionContributor selectedSessionContributor) {
				String message = selectedSessionContributor == null ?
						ERROR_MSG : null;
				setErrorMessage(message);
				setPageComplete(message == null);
			}
		};
		setControl(listComposite);
	}	
	
	public SessionContributor getSessionContributor(){
		return listComposite.getSelectedSessionContributor();
	}
}