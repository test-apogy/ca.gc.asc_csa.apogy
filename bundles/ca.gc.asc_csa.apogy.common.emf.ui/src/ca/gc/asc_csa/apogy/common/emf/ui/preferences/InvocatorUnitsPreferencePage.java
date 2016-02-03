package ca.gc.asc_csa.apogy.common.emf.ui.preferences;
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

import java.util.Map;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import ca.gc.asc_csa.apogy.common.emf.ui.Activator;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AvailableUnitsComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.NativeToDisplayUnitsMapComposite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class InvocatorUnitsPreferencePage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private NativeToDisplayUnitsMapComposite nativeToDisplayUnitsMapComposite = null;
	private AvailableUnitsComposite availableUnitsComposite = null;
	
	/**
	 * Create the preference page.
	 */
	public InvocatorUnitsPreferencePage() 
	{
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) 
	{
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, false));
			
		Group unitsGroup = new Group(container,SWT.None);
		unitsGroup.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		unitsGroup.setLayout(new GridLayout(2, false));
		unitsGroup.setText("Units Display");
		
		nativeToDisplayUnitsMapComposite = new NativeToDisplayUnitsMapComposite(unitsGroup, SWT.NONE);
		nativeToDisplayUnitsMapComposite.setNativeToDisplayUnitsMap(Activator.getDefault().getNativeToDisplayUnitsMap());
		nativeToDisplayUnitsMapComposite.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		
		availableUnitsComposite = new AvailableUnitsComposite(unitsGroup, SWT.NONE);
		availableUnitsComposite.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
				
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
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Reset to default the preferences.					
		store.setToDefault(PreferencesConstants.NATIVE_TO_DISPLAY_UNITS_ID);		
		nativeToDisplayUnitsMapComposite.setNativeToDisplayUnitsMap(Activator.getDefault().getNativeToDisplayUnitsMap());

		super.performDefaults();
	}
	

	private void storePreferences()
	{	
		Map<String, String> nativeToDisplayUnitsMap = nativeToDisplayUnitsMapComposite.getNativeToDisplayUnitsMap();
		getPreferenceStore().setValue(PreferencesConstants.NATIVE_TO_DISPLAY_UNITS_ID, nativeToDisplayUnitsMap.toString());
	}
}
