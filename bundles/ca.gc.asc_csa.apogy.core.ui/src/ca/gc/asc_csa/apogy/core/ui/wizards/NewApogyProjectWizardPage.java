package ca.gc.asc_csa.apogy.core.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings;
import ca.gc.asc_csa.apogy.core.ui.composites.NewApogyProjectComposite;

public class NewApogyProjectWizardPage extends WizardPage {

	private NewApogyProjectSettings projectSettings;
	private Adapter projectSettingsAdapter;
	private ApogyResourceSettings apogyResourceSettings; 
	
	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.ui.wizards.NewApogyProjectWizardPage"; 
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewApogyProjectWizardPage(NewApogyProjectSettings projectSettings, ApogyResourceSettings apogyResourceSettings) {
		super(WIZARD_PAGE_ID);
		setTitle("New Apogy Project");
		setDescription("This wizard creates a new Apogy Project.");
		this.projectSettings = projectSettings;
		projectSettings.setDefaultValues();	
		projectSettings.eAdapters().add(getSettingsAdapter());
		this.apogyResourceSettings = apogyResourceSettings;
		updateApogyResourceSettings();
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {		
		NewApogyProjectComposite settingsComposite = new NewApogyProjectComposite(parent, SWT.NONE, projectSettings);
		settingsComposite.setNewApogyProjectSettings(projectSettings);
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
						updateApogyResourceSettings();
					}
					
					setErrorMessage(message);
					setPageComplete(message == null);
				}
			};
		}
		return projectSettingsAdapter;
	}	
	
	protected void updateApogyResourceSettings() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectSettings.getName());
		apogyResourceSettings.setResourceProject(project);
		apogyResourceSettings.setResourceContainer(project.getFolder(ApogyCoreUIFacade.INSTANCE.getDefaultApogySessionFolderName()));
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