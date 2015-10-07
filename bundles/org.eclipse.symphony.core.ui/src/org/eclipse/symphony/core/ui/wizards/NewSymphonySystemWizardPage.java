package org.eclipse.symphony.core.ui.wizards;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.ui.NewSymphonySystemSettings;
import org.eclipse.symphony.core.ui.composites.NewSymphonySystemComposite;

public class NewSymphonySystemWizardPage extends WizardPage {

	private NewSymphonySystemSettings systemSettings;
	private Adapter systemSettingsAdapter; 
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewSymphonySystemWizardPage(NewSymphonySystemSettings systemSettings) {
		super("wizardPage");
		setTitle("New Symphony Session");
		setDescription("This wizard creates a new Symphony Session File with *.ss extension.");
		this.systemSettings = systemSettings;
		systemSettings.eAdapters().add(getSystemSettingsAdapter());
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {		
		NewSymphonySystemComposite sessionComposite = new NewSymphonySystemComposite(parent, SWT.NONE, systemSettings);
		sessionComposite.setNewSymphonySystemSettings(systemSettings);
		setControl(sessionComposite);
	}
	
	@Override
	public void dispose() {
		systemSettings.eAdapters().remove(getSystemSettingsAdapter());
		super.dispose();
	}

	private Adapter getSystemSettingsAdapter() {
		if (systemSettingsAdapter == null){
			systemSettingsAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					String message = validate();		
					setErrorMessage(message);
					setPageComplete(message == null);
				}
			};
		}
		return systemSettingsAdapter;
	}
	
	private String validate() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(systemSettings.getFolder()));
		if (systemSettings.getFolder().length() == 0) {
			return "File container must be specified";
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			return "File container must exist";
		}
		if (!container.isAccessible()) {
			return "Project must be writable";
		}
		if (systemSettings.getFilename().length() == 0) {
			return "File name must be specified";
		}
		if (systemSettings.getFilename().replace('\\', '/').indexOf('/', 1) > 0) {
			return "File name must be valid";
		}
		
		/** Check if there is a file extension. */
		int dotLoc = systemSettings.getFilename().lastIndexOf('.');
		if (dotLoc == -1) {
			return "File extension must be \"ss\"";
		}	
		
		String ext = systemSettings.getFilename().substring(dotLoc + 1);
		if (ext.equalsIgnoreCase("ss") == false) {
			return "File extension must be \"ss\"";
		}
		return null;
	}	
}