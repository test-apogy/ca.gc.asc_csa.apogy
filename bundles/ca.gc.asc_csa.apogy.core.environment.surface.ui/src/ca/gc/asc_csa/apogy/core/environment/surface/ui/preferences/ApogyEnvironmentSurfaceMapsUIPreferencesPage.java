package ca.gc.asc_csa.apogy.core.environment.surface.ui.preferences;
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
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.Activator;

public class ApogyEnvironmentSurfaceMapsUIPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	// Maps
	private StringFieldEditor mapMinimumXEditor;
	private StringFieldEditor mapMaximumXEditor;
	private StringFieldEditor mapMinimumYEditor;
	private StringFieldEditor mapMaximumYEditor;
	
	private StringFieldEditor mapUpdatePeriodEditor;
	private StringFieldEditor mapMaximumImageSizeEditor;
		
	
	private List<FieldEditor> editors = new ArrayList<FieldEditor>();
	
	/**
	 * Create the preference page.
	 */
	public ApogyEnvironmentSurfaceMapsUIPreferencesPage() {
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
		
		// Default Map View Map Size 
		Group grpDefaultMapSize = new Group(container, SWT.NONE);
		grpDefaultMapSize.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpDefaultMapSize.setLayout(new GridLayout(2, true));		
		grpDefaultMapSize.setText("Map Default Size");	
				
		mapMinimumXEditor = createStringFieldEditor(grpDefaultMapSize, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MIN_ID, "Minium X (m)");				
		editors.add(mapMinimumXEditor);
		
		mapMaximumXEditor = createStringFieldEditor(grpDefaultMapSize, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MAX_ID, "Maximum X (m)");
		editors.add(mapMaximumXEditor);
		
		mapMinimumYEditor = createStringFieldEditor(grpDefaultMapSize, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MIN_ID, "Minium Y (m)");
		editors.add(mapMinimumYEditor);
		
		mapMaximumYEditor = createStringFieldEditor(grpDefaultMapSize, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MAX_ID, "Maximum Y (m)");
		editors.add(mapMaximumYEditor);
		
		Group grpMapView = new Group(container, SWT.NONE);
		grpMapView.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpMapView.setLayout(new GridLayout(1, true));		
		grpMapView.setText("Map View Settings");	
				
		mapUpdatePeriodEditor = createStringFieldEditor(grpMapView, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_UPDATE_PERIOD_MILLISECONDS_ID, "Map View Update Period (milliseconds)");
		editors.add(mapUpdatePeriodEditor);
		
		mapMaximumImageSizeEditor = createStringFieldEditor(grpMapView, ApogyEnvironmentSurfaceUIPreferencesConstants.DEFAULT_MAP_VIEW_IMAGE_MAXIMUM_NUMBER_OF_PIXELS_ID, "Maximum Image Size (pixels)");
		editors.add(mapMaximumImageSizeEditor);
								
		return container;
	}
		
	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) 
	{
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	public boolean performOk() 
	{
		storePreferences();			
		return super.performOk();
	}
	
	@Override
	public void dispose() 
	{
		editors.clear();
		super.dispose();
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
