package org.eclipse.symphony.core.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.ui.NewSymphonyProjectSettings;
import org.eclipse.symphony.core.ui.Symphony__CoreUIFacade;
import org.eclipse.symphony.core.ui.SymphonyResourceSettings;
import org.eclipse.symphony.core.ui.composites.NewSymphonyProjectComposite;

public class NewSymphonyProjectWizardPage extends WizardPage {

	private NewSymphonyProjectSettings projectSettings;
	private Adapter projectSettingsAdapter;
	private SymphonyResourceSettings symphonyResourceSettings; 
	
	private final static String WIZARD_PAGE_ID = "org.eclipse.symphony.core.ui.wizards.NewSymphonyProjectWizardPage"; 
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewSymphonyProjectWizardPage(NewSymphonyProjectSettings projectSettings, SymphonyResourceSettings symphonyResourceSettings) {
		super(WIZARD_PAGE_ID);
		setTitle("New Symphony Project");
		setDescription("This wizard creates a new Symphony Project.");
		this.projectSettings = projectSettings;
		projectSettings.setDefaultValues();	
		projectSettings.eAdapters().add(getSettingsAdapter());
		this.symphonyResourceSettings = symphonyResourceSettings;
		updateSymphonyResourceSettings();
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {		
		NewSymphonyProjectComposite settingsComposite = new NewSymphonyProjectComposite(parent, SWT.NONE, projectSettings);
		settingsComposite.setNewSymphonyProjectSettings(projectSettings);
		setControl(settingsComposite);
	}
	
	@Override
	public void dispose() {
		projectSettings.eAdapters().remove(getSettingsAdapter());
		super.dispose();
	}

	private Adapter getSettingsAdapter() {
		if (projectSettingsAdapter == null){
			projectSettingsAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					String message = validate();	
					
					if (message == null){
						updateSymphonyResourceSettings();
					}
					
					setErrorMessage(message);
					setPageComplete(message == null);
				}
			};
		}
		return projectSettingsAdapter;
	}	
	
	protected void updateSymphonyResourceSettings() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectSettings.getName());
		symphonyResourceSettings.setResourceProject(project);
		symphonyResourceSettings.setResourceContainer(project.getFolder(Symphony__CoreUIFacade.INSTANCE.getDefaultSymphonySessionFolderName()));
	}

	private String validate() {
		if (projectSettings.getName() == null || projectSettings.getName().isEmpty()){
			return "Project name must be specified";
		}
				
		if (ResourcesPlugin.getWorkspace().getRoot().getProject(projectSettings.getName()).exists()){
			return "Project with the specified name already exists";
		}
		
		return null;
	}	
}