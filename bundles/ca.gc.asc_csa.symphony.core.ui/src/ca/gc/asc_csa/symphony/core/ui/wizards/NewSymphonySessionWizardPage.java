package ca.gc.asc_csa.symphony.core.ui.wizards;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.symphony.core.ui.NewSymphonySessionSettings;
import ca.gc.asc_csa.symphony.core.ui.SymphonyResourceSettings;
import ca.gc.asc_csa.symphony.core.ui.composites.NewSymphonySessionComposite;

public class NewSymphonySessionWizardPage extends WizardPage {

	private NewSymphonySessionSettings sessionSettings;
	private Adapter sessionSettingsAdapter;
	private SymphonyResourceSettings symphonyResourceSettings;
	private boolean dataInitialized = false;
	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.symphony.core.ui.wizards.NewSymphonySessionWizardPage";

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewSymphonySessionWizardPage(
			NewSymphonySessionSettings sessionSettings,
			SymphonyResourceSettings symphonyResourceSettings) {
		super(WIZARD_PAGE_ID);
		setTitle("New Symphony Session");
		setDescription("This wizard creates a new Symphony Session File with *.sym extension.");
		this.sessionSettings = sessionSettings;
		sessionSettings.eAdapters().add(getSessionSettingsAdapter());
		this.symphonyResourceSettings = symphonyResourceSettings;
		sessionSettings.setDefaultValues(symphonyResourceSettings.getResourceContainer());

		String message = validate();
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		NewSymphonySessionComposite sessionComposite = new NewSymphonySessionComposite(
				parent, SWT.NONE, sessionSettings);
		sessionComposite.setNewSymphonySessionSettings(sessionSettings);
		setControl(sessionComposite);
	}

	@Override
	public void dispose() {
		sessionSettings.eAdapters().remove(getSessionSettingsAdapter());
		super.dispose();
	}

	private Adapter getSessionSettingsAdapter() {
		if (sessionSettingsAdapter == null) {
			sessionSettingsAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					String message = validate();
					setErrorMessage(message);
					setPageComplete(message == null);
				}
			};
		}
		return sessionSettingsAdapter;
	}
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		
		if (visible && !dataInitialized){
			dataInitialized = true;			
			sessionSettings.setDefaultValues(symphonyResourceSettings.getResourceContainer());
		}
	}
	
	private String validate() {
		if (symphonyResourceSettings.getResourceContainer() != null) {
			
			if (sessionSettings.getFilename() == null || sessionSettings.getFilename().isEmpty()) {
				return "File name must be specified";
			}
			
			if (symphonyResourceSettings.getResourceContainer().getFile(new Path(sessionSettings.getFilename())).exists()){
				return "File name already used";
			}

			if (sessionSettings.getFilename().replace('\\', '/')
					.indexOf('/', 1) > 0) {
				return "File name must be valid";
			}

			/** Check if there is a file extension. */
			int dotLoc = sessionSettings.getFilename().lastIndexOf('.');
			if (dotLoc == -1) {
				return "File extension must be \"sym\"";
			}

			String ext = sessionSettings.getFilename().substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("sym") == false) {
				return "File extension must be \"sym\"";
			}
		}
		return null;
	}
}