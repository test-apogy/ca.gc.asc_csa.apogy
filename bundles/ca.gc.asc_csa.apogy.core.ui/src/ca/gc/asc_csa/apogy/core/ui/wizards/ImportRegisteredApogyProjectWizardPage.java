package ca.gc.asc_csa.apogy.core.ui.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.invocator.Activator;
import ca.gc.asc_csa.apogy.core.invocator.SessionContributor;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.SessionContributorListComposite;

public class ImportRegisteredApogyProjectWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.ui.wizards.ImportRegisteredApogyProjectWizardPage";
	private SessionContributorListComposite listComposite;
	private final static String ERROR_MSG = "You must select one session";
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ImportRegisteredApogyProjectWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Import Registered Apogy Project");
		setDescription("This wizard imports an existing registered Apogy Project.");

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