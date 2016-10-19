package ca.gc.asc_csa.apogy.workspace.ui.wizards;
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
import org.eclipse.swt.widgets.Composite;

public class NewApogyProjectWizardPage extends WizardPage {

//	private NewApogyProjectSettings projectSettings;
//	private Adapter projectSettingsAdapter;
//	private ApogyResourceSettings apogyResourceSettings; 
	
	protected NewApogyProjectWizardPage(String pageName) {
		super(pageName);
	}

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.workspace.ui.wizards.NewApogyProjectWizardPage"; 
	
//	/**
//	 * Constructor for SampleNewWizardPage.
//	 * 
//	 * @param pageName
//	 */
//	public NewApogyProjectWizardPage(NewApogyProjectSettings projectSettings, ApogyResourceSettings apogyResourceSettings) {
//		super(WIZARD_PAGE_ID);
//		setTitle("New Apogy Project");
//		setDescription("This wizard creates a new Apogy Project.");
////		this.projectSettings = projectSettings;
////		projectSettings.setDefaultValues();	
////		projectSettings.eAdapters().add(getSettingsAdapter());
////		this.apogyResourceSettings = apogyResourceSettings;
////		updateApogyResourceSettings();
//	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {		
//		NewApogyProjectComposite settingsComposite = new NewApogyProjectComposite(parent, SWT.NONE, projectSettings);
//		settingsComposite.setNewApogyProjectSettings(projectSettings);
//		setControl(settingsComposite);
	}
	
	@Override
	public void dispose() {
//		projectSettings.eAdapters().remove(getSettingsAdapter());
		super.dispose();
	}

//	private Adapter getSettingsAdapter() {
//		if (projectSettingsAdapter == null){
//			projectSettingsAdapter = new AdapterImpl(){
//				@Override
//				public void notifyChanged(Notification msg) {
//					String message = validate();	
//					
//					if (message == null){
//						updateApogyResourceSettings();
//					}
//					
//					setErrorMessage(message);
//					setPageComplete(message == null);
//				}
//			};
//		}
//		return projectSettingsAdapter;
//	}	
	
//	protected void updateApogyResourceSettings() {
//		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectSettings.getName());
//		apogyResourceSettings.setResourceProject(project);
//		apogyResourceSettings.setResourceContainer(project.getFolder(ApogyCoreUIFacade.INSTANCE.getDefaultApogySessionFolderName()));
//	}

//	private String validate() {
//		if (projectSettings.getName() == null || projectSettings.getName().isEmpty()){
//			return "Project name must be specified";
//		}
//				
//		if (ResourcesPlugin.getWorkspace().getRoot().getProject(projectSettings.getName()).exists()){
//			return "Project with the specified name already exists";
//		}
//		
//		return null;
//	}	
}