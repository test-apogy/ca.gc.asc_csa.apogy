package ca.gc.asc_csa.apogy.core.environment.ui.jme3.preferences;
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ca.gc.asc_csa.apogy.core.environment.ui.jme3.Activator;


public class ApogyEnvironmentUIJME3PreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	
	private StringFieldEditor  shadowMapSizeEditor;	
	
	private List<FieldEditor> editors = new ArrayList<FieldEditor>();

	
	/**
	 * Create the preference page.
	 */
	public ApogyEnvironmentUIJME3PreferencesPage() {
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) 
	{
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, true));
		
		// Shadows.
		Group earthSkyGroup = new Group(container, SWT.NONE);
		earthSkyGroup.setLayout(new GridLayout(2, true));
		earthSkyGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		earthSkyGroup.setText("Shadows");	
		
		Label earthSkyShadowMapSizeLabel = new Label(earthSkyGroup, SWT.NONE);
		earthSkyShadowMapSizeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		earthSkyShadowMapSizeLabel.setText("Shadow Map Size");
		shadowMapSizeEditor = createStringFieldEditor(earthSkyGroup, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_ID, "");
		editors.add(shadowMapSizeEditor);
		
		return container;
	}
		
	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	public boolean performOk() 
	{
		storePreferences();			
		return super.performOk();
	}
	
	@Override
	protected void performApply() 
	{
		storePreferences();
		super.performApply();
	}
	
	@Override
	protected void performDefaults() 
	{			
		for(FieldEditor editor : editors)
		{
			editor.loadDefault();
		}
					
		super.performDefaults();
	}
	

	private StringFieldEditor createStringFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		Composite editorContainer = new Composite(container, SWT.NULL);
		editorContainer.setLayout(new GridLayout(1, true));
		editorContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		StringFieldEditor editor = new StringFieldEditor(preferenceID, preferenceLabel, editorContainer);
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
	}

	private void storePreferences()
	{
		for(FieldEditor editor : editors)
		{
			editor.store();
		}	
	}
}
