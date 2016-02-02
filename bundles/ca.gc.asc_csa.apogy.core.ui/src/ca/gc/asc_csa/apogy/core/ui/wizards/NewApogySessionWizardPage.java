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

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings;
import ca.gc.asc_csa.apogy.core.ui.composites.NewApogySessionComposite;

public class NewApogySessionWizardPage extends WizardPage {

	private NewApogySessionSettings sessionSettings;
	private Adapter sessionSettingsAdapter;
	private ApogyResourceSettings apogyResourceSettings;
	private boolean dataInitialized = false;
	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.ui.wizards.NewApogySessionWizardPage";

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewApogySessionWizardPage(
			NewApogySessionSettings sessionSettings,
			ApogyResourceSettings apogyResourceSettings) {
		super(WIZARD_PAGE_ID);
		setTitle("New Apogy Session");
		setDescription("This wizard creates a new Apogy Session File with *.sym extension.");
		this.sessionSettings = sessionSettings;
		sessionSettings.eAdapters().add(getSessionSettingsAdapter());
		this.apogyResourceSettings = apogyResourceSettings;
		sessionSettings.setDefaultValues(apogyResourceSettings.getResourceContainer());

		String message = validate();
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		NewApogySessionComposite sessionComposite = new NewApogySessionComposite(
				parent, SWT.NONE, sessionSettings);
		sessionComposite.setNewApogySessionSettings(sessionSettings);
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
			sessionSettings.setDefaultValues(apogyResourceSettings.getResourceContainer());
		}
	}
	
	private String validate() {
		if (apogyResourceSettings.getResourceContainer() != null) {
			
			if (sessionSettings.getFilename() == null || sessionSettings.getFilename().isEmpty()) {
				return "File name must be specified";
			}
			
			if (apogyResourceSettings.getResourceContainer().getFile(new Path(sessionSettings.getFilename())).exists()){
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