package org.eclipse.symphony.addons.ui.preferences;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.symphony.addons.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SymphonyToolsUIPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private ColorFieldEditor sunVectorColorFieldEditor;
	
	/**
	 * Create the preference page.
	 */
	public SymphonyToolsUIPreferencesPage() {
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
		
		// Circular Sector FOV
		Group grpSunvectorTool = new Group(container, SWT.NONE);
		grpSunvectorTool.setLayout(new GridLayout(2, true));
		grpSunvectorTool.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		grpSunvectorTool.setText("Sun Vector Tool");	
		
			
		// FOV Color
		sunVectorColorFieldEditor = createColorFieldEditor(grpSunvectorTool, SymphonyToolsUIPreferencesConstants.DEFAULT_SUN_VECTOR_COLOR_ID, "Default Vector Color:");		

			
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
		sunVectorColorFieldEditor.loadDefault();
			
		super.performDefaults();
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
		sunVectorColorFieldEditor.store();
	}

}
