package ca.gc.asc_csa.apogy.addons.vehicle.ui.preferences;
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
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class VehicleUIPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor physicalWheelVisibilityBooleanFieldEditor;
	private BooleanFieldEditor landerSphericalFootVisibilityBooleanFieldEditor;
	private BooleanFieldEditor thrusterPlumeEnvelopeVisibilityBooleanFieldEditor;
	
	private ColorFieldEditor physicalWheelColorFieldEditor;
	private ColorFieldEditor landerSphericalFootColorFieldEditor;
	private ColorFieldEditor thrusterPlumeEnvelopeFootColorFieldEditor;
	
	private StringFieldEditor thrusterPlumeEnvelopeLengthEditor;
	
	/**
	 * Create the preference page.
	 */
	public VehicleUIPreferencesPage() {
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
		
		// Physical Wheel 
		Group grpPhysicalWheel = new Group(container, SWT.NONE);
		grpPhysicalWheel.setLayout(new GridLayout(2, true));
		grpPhysicalWheel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpPhysicalWheel.setText("Physical Wheel");	
				
		Label physicalWheelVisibilityLabel = new Label(grpPhysicalWheel, SWT.NONE);
		physicalWheelVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		physicalWheelVisibilityLabel.setText("Visibility");		
		physicalWheelVisibilityBooleanFieldEditor = createBooleanFieldEditor(grpPhysicalWheel, VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_VISIBILITY_ID, "");					
		physicalWheelColorFieldEditor = createColorFieldEditor(grpPhysicalWheel, VehicleUIPreferencesConstants.DEFAULT_PHYSICAL_WHEEL_COLOR_ID, "Default Color:");		
		
		
		// Physical Wheel 
		Group grpLanderFoot = new Group(container, SWT.NONE);
		grpLanderFoot.setLayout(new GridLayout(2, true));
		grpLanderFoot.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpLanderFoot.setText("Lander Spherical Foot");	
		
		Label landerSphericalFootVisibilityLabel = new Label(grpLanderFoot, SWT.NONE);
		landerSphericalFootVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		landerSphericalFootVisibilityLabel.setText("Visibility");		
		landerSphericalFootVisibilityBooleanFieldEditor =  createBooleanFieldEditor(grpLanderFoot, VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_VISIBILITY_ID, "");
		landerSphericalFootColorFieldEditor = createColorFieldEditor(grpLanderFoot, VehicleUIPreferencesConstants.DEFAULT_LANDER_SPHERICAL_FOOT_COLOR_ID, "Default Color:");		
	
		// Thruster
		Group grpThruster = new Group(container, SWT.NONE);
		grpThruster.setLayout(new GridLayout(2, true));
		grpThruster.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpThruster.setText("Thruster");	
		
		Label thrusterVisibilityLabel = new Label(grpThruster, SWT.NONE);
		thrusterVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		thrusterVisibilityLabel.setText("Visibility");		
		thrusterPlumeEnvelopeVisibilityBooleanFieldEditor =  createBooleanFieldEditor(grpThruster, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_VISIBILITY_ID, "");				
		thrusterPlumeEnvelopeFootColorFieldEditor = createColorFieldEditor(grpThruster, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_COLOR_ID, "Default Color:");		
							
		Label thrusterPlumeEnvelopeLengthLabel = new Label(grpThruster, SWT.NONE);
		thrusterPlumeEnvelopeLengthLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		thrusterPlumeEnvelopeLengthLabel.setText("Plume Envelope Length (m):");
		thrusterPlumeEnvelopeLengthEditor = createStringFieldEditor(grpThruster, VehicleUIPreferencesConstants.DEFAULT_THRUSTER_PLUME_ENVELOPE_LENGTH_ID, "");
			
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
		physicalWheelVisibilityBooleanFieldEditor.loadDefault();
		landerSphericalFootVisibilityBooleanFieldEditor.loadDefault();	
		
		physicalWheelColorFieldEditor.loadDefault();	
		landerSphericalFootColorFieldEditor.loadDefault();	
		
		thrusterPlumeEnvelopeVisibilityBooleanFieldEditor.loadDefault();	
		thrusterPlumeEnvelopeFootColorFieldEditor.loadDefault();	
		thrusterPlumeEnvelopeLengthEditor.loadDefault();
		
		super.performDefaults();
	}
	
	private BooleanFieldEditor createBooleanFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		BooleanFieldEditor editor = new BooleanFieldEditor(preferenceID, preferenceLabel, container);
		
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
	
	private StringFieldEditor createStringFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		Composite editorContainer = new Composite(container, SWT.NULL);
		editorContainer.setLayout(new GridLayout(1, true));
		editorContainer.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, false, 1, 1));

		StringFieldEditor editor = new StringFieldEditor(preferenceID, preferenceLabel, 5, editorContainer);		
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
	}
	
	private void storePreferences()
	{
		physicalWheelVisibilityBooleanFieldEditor.store();
		landerSphericalFootVisibilityBooleanFieldEditor.store();
		
		physicalWheelColorFieldEditor.store();
		landerSphericalFootColorFieldEditor.store();
		
		thrusterPlumeEnvelopeVisibilityBooleanFieldEditor.store();
		thrusterPlumeEnvelopeFootColorFieldEditor.store();
		thrusterPlumeEnvelopeLengthEditor.store();
	}
}
