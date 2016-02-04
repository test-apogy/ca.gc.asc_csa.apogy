package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.preferences;
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
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class MRTImagingPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor imageSnapshotVisibilityFOVBooleanFieldEditor;	
	private BooleanFieldEditor imageSnapshotImageProjectionBooleanFieldEditor;
	private BooleanFieldEditor imageSnapshotImageProjectionOnFOVBooleanFieldEditor;
	private RadioGroupFieldEditor imageSnapshotFOVPresentationModeRadioGroupFieldEditor;	
	private ColorFieldEditor imageSnapshotFOVColorFieldEditor;	
	
	/**
	 * Create the preference page.
	 */
	public MRTImagingPreferencesPage() {
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
		Group grpImageSnapshotFOV = new Group(container, SWT.NONE);
		grpImageSnapshotFOV.setLayout(new GridLayout(2, true));
		grpImageSnapshotFOV.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		grpImageSnapshotFOV.setText("Image Snaphot");	
		
		Label circularSectorFOVVisibilityLabel = new Label(grpImageSnapshotFOV, SWT.NONE);
		circularSectorFOVVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		circularSectorFOVVisibilityLabel.setText("Visibility");
		
		imageSnapshotVisibilityFOVBooleanFieldEditor = createBooleanFieldEditor(grpImageSnapshotFOV, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_VISIBILITY_ID, "");		
		

		Label imageSnapshotImageProjectionOnFOVLabel = new Label(grpImageSnapshotFOV, SWT.NONE);
		imageSnapshotImageProjectionOnFOVLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		imageSnapshotImageProjectionOnFOVLabel.setText("Project Image On FOV");
		
		imageSnapshotImageProjectionOnFOVBooleanFieldEditor = createBooleanFieldEditor(grpImageSnapshotFOV, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ON_FOV_ID, "");		

		
		
		Label imageSnapshotImageProjectionLabel = new Label(grpImageSnapshotFOV, SWT.NONE);
		imageSnapshotImageProjectionLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		imageSnapshotImageProjectionLabel.setText("Show Projection");
		imageSnapshotImageProjectionBooleanFieldEditor = createBooleanFieldEditor(grpImageSnapshotFOV, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ID, "");
		
		
		imageSnapshotFOVColorFieldEditor = createColorFieldEditor(grpImageSnapshotFOV, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR_ID, "Default Color:");		

		Label circularSectorFOVModeLabel = new Label(grpImageSnapshotFOV, SWT.NONE);
		circularSectorFOVModeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		circularSectorFOVModeLabel.setText("Presentation Mode:");
		imageSnapshotFOVPresentationModeRadioGroupFieldEditor = createRadioGroupFieldEditor(grpImageSnapshotFOV, MRTImagingPreferencesConstants.DEFAULT_IMAGE_SNAPSHOT_FOV_PRESENTATION_MODE_ID, "");

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
		imageSnapshotVisibilityFOVBooleanFieldEditor.loadDefault();
		imageSnapshotImageProjectionBooleanFieldEditor.loadDefault();
		imageSnapshotImageProjectionOnFOVBooleanFieldEditor.loadDefault();
		imageSnapshotFOVPresentationModeRadioGroupFieldEditor.loadDefault();
		imageSnapshotFOVColorFieldEditor.loadDefault();
		
		
		super.performDefaults();
	}
	
	private String[][] getModeLabelsAndValues()
	{
		String [][] labelAndValues = new String[MeshPresentationMode.VALUES.size()][2];
		
		int i = 0;
		for(MeshPresentationMode value : MeshPresentationMode.VALUES)
		{
			labelAndValues[i][0] = value.getName();
			labelAndValues[i][1] = Integer.toString(value.getValue());
			i++;
		}
		
		return labelAndValues;
	}
	
	private BooleanFieldEditor createBooleanFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		BooleanFieldEditor editor = new BooleanFieldEditor(preferenceID, preferenceLabel, container);
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
	}
	
	private RadioGroupFieldEditor createRadioGroupFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		Composite editorContainer = new Composite(container, SWT.NULL);
		editorContainer.setLayout(new GridLayout(1, true));
		
		RadioGroupFieldEditor editor = new RadioGroupFieldEditor(preferenceID, preferenceLabel, 1, getModeLabelsAndValues(), editorContainer, false);
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
	}
	
	private ColorFieldEditor createColorFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		ColorFieldEditor colorEditor = new ColorFieldEditor(preferenceID, preferenceLabel, container);				

		//Set the editor up to use this page	
		colorEditor.setPreferenceStore(getPreferenceStore());
		colorEditor.load();

		return colorEditor;
	}

	private void storePreferences()
	{
		imageSnapshotVisibilityFOVBooleanFieldEditor.store();
		imageSnapshotImageProjectionBooleanFieldEditor.store();
		imageSnapshotImageProjectionOnFOVBooleanFieldEditor.store();
		imageSnapshotFOVPresentationModeRadioGroupFieldEditor.store();
		imageSnapshotFOVColorFieldEditor.store();		
	}

}
