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

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.core.environment.ui.jme3.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


public class ApogyEnvironmentUIJME3PreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor earthSkyBloomEnableEditor;
	private StringFieldEditor earthSkyShadowMapSizeEditor;	
	private BooleanFieldEditor earthSkySunCastShadowsEnableEditor;
	private BooleanFieldEditor earthSkyMoonCastShadowsEnableEditor;

	
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
		
		// Earth Sky.
		Group earthSkyGroup = new Group(container, SWT.NONE);
		earthSkyGroup.setLayout(new GridLayout(2, true));
		earthSkyGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		earthSkyGroup.setText("Earth Sky");	
		
		Label earthSkyBloomEnableLabel = new Label(earthSkyGroup, SWT.NONE);
		earthSkyBloomEnableLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		earthSkyBloomEnableLabel.setText("Sun and Moon Bloom Enable");
		earthSkyBloomEnableEditor = createBooleanFieldEditor(earthSkyGroup, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_ID, "");
		
		Label earthSkyShadowMapSizeLabel = new Label(earthSkyGroup, SWT.NONE);
		earthSkyShadowMapSizeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		earthSkyShadowMapSizeLabel.setText("Shadow Map Size");
		earthSkyShadowMapSizeEditor = createStringFieldEditor(earthSkyGroup, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_ID, "");


		Label earthSkySunCastShadowsEnableLabel = new Label(earthSkyGroup, SWT.NONE);
		earthSkySunCastShadowsEnableLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		earthSkySunCastShadowsEnableLabel.setText("Sun Cast Shadows Enable");
		earthSkySunCastShadowsEnableEditor = createBooleanFieldEditor(earthSkyGroup, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID, "");

		Label earthSkyMoonCastShadowsEnableLabel = new Label(earthSkyGroup, SWT.NONE);
		earthSkyMoonCastShadowsEnableLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		earthSkyMoonCastShadowsEnableLabel.setText("Moon Cast Shadows Enable");
		earthSkyMoonCastShadowsEnableEditor = createBooleanFieldEditor(earthSkyGroup, ApogyEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID, "");
		
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
		earthSkyBloomEnableEditor.loadDefault();
		earthSkyShadowMapSizeEditor.loadDefault();
		earthSkySunCastShadowsEnableEditor.loadDefault();
		earthSkyMoonCastShadowsEnableEditor.loadDefault();
		
		super.performDefaults();
	}
	
	private BooleanFieldEditor createBooleanFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		Composite editorContainer = new Composite(container, SWT.NULL);
		editorContainer.setLayout(new GridLayout(1, true));
		editorContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		BooleanFieldEditor editor = new BooleanFieldEditor(preferenceID, preferenceLabel, editorContainer);
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
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
		earthSkyBloomEnableEditor.store();		
		earthSkyShadowMapSizeEditor.store();		
		earthSkySunCastShadowsEnableEditor.store();
		earthSkyMoonCastShadowsEnableEditor.store();
	}
}
