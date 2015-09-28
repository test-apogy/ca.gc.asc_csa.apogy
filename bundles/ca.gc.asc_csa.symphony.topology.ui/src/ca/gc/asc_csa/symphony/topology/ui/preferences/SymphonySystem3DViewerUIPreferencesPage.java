package ca.gc.asc_csa.symphony.topology.ui.preferences;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ca.gc.asc_csa.symphony.topology.ui.Activator;


public class SymphonySystem3DViewerUIPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private ColorFieldEditor symphonySystem3DViewBackgroundColorColorFieldEditor;
	
	/**
	 * Create the preference page.
	 */
	public SymphonySystem3DViewerUIPreferencesPage() {
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
		Group symphonySystem3DViewGroup = new Group(container, SWT.NONE);
		symphonySystem3DViewGroup.setLayout(new GridLayout(2, true));
		symphonySystem3DViewGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		symphonySystem3DViewGroup.setText("Symphony System 3D View");	
		
		symphonySystem3DViewBackgroundColorColorFieldEditor = createColorFieldEditor(symphonySystem3DViewGroup, SymphonyTopologyUIPreferencesConstants.DEFAULT_SYMPHONY_SYSTEM_VIEW_BACKGROUND_COLOR_ID, "Background Color:");
		
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
		symphonySystem3DViewBackgroundColorColorFieldEditor.loadDefault();
		super.performDefaults();
	}
	
	private void storePreferences()
	{
		symphonySystem3DViewBackgroundColorColorFieldEditor.store();
	}
	
	private ColorFieldEditor createColorFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		ColorFieldEditor colorEditor = new ColorFieldEditor(preferenceID, preferenceLabel, container);				

		//Set the editor up to use this page	
		colorEditor.setPreferenceStore(getPreferenceStore());
		colorEditor.load();

		return colorEditor;
	}
}
