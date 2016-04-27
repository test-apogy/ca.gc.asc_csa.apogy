package ca.gc.asc_csa.apogy.common.topology.ui.viewer.preferences;
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

import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.wb.swt.FieldLayoutPreferencePage;

import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;

public class TopologyViewerLightingPreferencePage extends FieldLayoutPreferencePage implements IWorkbenchPreferencePage 
{
	private BooleanFieldEditor ambientLightVisibleEditor;
	private ColorFieldEditor ambientLightColorEditor;

	private List<FieldEditor> editors = new ArrayList<FieldEditor>();
	
	/**
	 * Create the preference page.
	 */
	public TopologyViewerLightingPreferencePage() 
	{
		ScopedPreferenceStore prefsStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, Activator.ID);

		prefsStore.setSearchContexts(new IScopeContext[] { InstanceScope.INSTANCE });

		setPreferenceStore(prefsStore);
		setDescription("Lighting");
	}

	/**
	 * Create contents of the preference page.
	 * 
	 * @param parent
	 */
	@Override
	public Control createPageContents(Composite parent) 
	{
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, true));
				
		Group ambientLightGroup = new Group(container, SWT.NONE);
		ambientLightGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		ambientLightGroup.setLayout(new GridLayout(1, true));		
		ambientLightGroup.setText("Ambient Light");	
		
		ambientLightVisibleEditor = createBooleanFieldEditor(ambientLightGroup, TopologyViewerLightingPreferenceConstants.AMBIENT_LIGHT_ENABLED_ID, "Ambient Light Enabled");
		editors.add(ambientLightVisibleEditor);
		
		// Filler
		new Label(ambientLightGroup, SWT.NONE);
		
		ambientLightColorEditor = createColorFieldEditor(ambientLightGroup, TopologyViewerLightingPreferenceConstants.AMBIENT_LIGHT_COLOR_ID, "Ambient Light Color");
		editors.add(ambientLightColorEditor);
		
		return container;
	}

	@Override
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
		
	@Override
	public void dispose() 
	{
		editors.clear();
		super.dispose();
	}
	
	private void storePreferences()
	{
		for(FieldEditor editor : editors)
		{
			editor.store();
		}					
	}
	
	private ColorFieldEditor createColorFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		Composite editorContainer = new Composite(container, SWT.NULL);
		editorContainer.setLayout(new GridLayout(1, true));
		editorContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		ColorFieldEditor editor = new ColorFieldEditor(preferenceID, preferenceLabel, editorContainer);
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;				
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
}
