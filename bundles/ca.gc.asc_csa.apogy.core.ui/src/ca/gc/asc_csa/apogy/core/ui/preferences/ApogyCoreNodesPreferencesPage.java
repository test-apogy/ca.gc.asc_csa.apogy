package ca.gc.asc_csa.apogy.core.ui.preferences;
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
import ca.gc.asc_csa.apogy.core.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class ApogyCoreNodesPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor resultNodeFlagVisibilityBooleanFieldEditor;	
	private StringFieldEditor resultNodeFlagPoleHeight;
	
	/**
	 * Create the preference page.
	 */
	public ApogyCoreNodesPreferencesPage() {
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
		
		// Image Snapshot FOV
		Group grpResultNode = new Group(container, SWT.NONE);
		grpResultNode.setLayout(new GridLayout(2, true));
		grpResultNode.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		grpResultNode.setText("Result Node");	
		
		Label resultNodeFlagVisibilityLabel = new Label(grpResultNode, SWT.NONE);
		resultNodeFlagVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		resultNodeFlagVisibilityLabel.setText("Flag Visibility");
		
		resultNodeFlagVisibilityBooleanFieldEditor = createBooleanFieldEditor(grpResultNode, ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY_ID, "");		

		Label resultNodeFlagPoleHeightLabel = new Label(grpResultNode, SWT.NONE);
		resultNodeFlagPoleHeightLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		resultNodeFlagPoleHeightLabel.setText("Flag Height (m)");
		
		resultNodeFlagPoleHeight = createStringFieldEditor(grpResultNode, ApogyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT_ID, "");		

		
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
	protected void performApply() 
	{
		storePreferences();
		super.performApply();
	}
	
	@Override
	protected void performDefaults() 
	{		
		resultNodeFlagVisibilityBooleanFieldEditor.loadDefault();
		resultNodeFlagPoleHeight.loadDefault();
		
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

		StringFieldEditor editor = new StringFieldEditor(preferenceID, preferenceLabel, 5, editorContainer);
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
	}
	
	private void storePreferences()
	{
		resultNodeFlagVisibilityBooleanFieldEditor.store();	
		resultNodeFlagPoleHeight.store();
	}
}
