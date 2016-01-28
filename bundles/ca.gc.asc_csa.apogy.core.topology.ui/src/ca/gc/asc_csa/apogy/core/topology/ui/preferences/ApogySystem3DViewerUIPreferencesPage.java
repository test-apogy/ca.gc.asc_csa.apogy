package ca.gc.asc_csa.apogy.core.topology.ui.preferences;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import ca.gc.asc_csa.apogy.core.topology.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


public class ApogySystem3DViewerUIPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private ColorFieldEditor apogySystem3DViewBackgroundColorColorFieldEditor;
	
	/**
	 * Create the preference page.
	 */
	public ApogySystem3DViewerUIPreferencesPage() {
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
		Group apogySystem3DViewGroup = new Group(container, SWT.NONE);
		apogySystem3DViewGroup.setLayout(new GridLayout(2, true));
		apogySystem3DViewGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		apogySystem3DViewGroup.setText("Apogy System 3D View");	
		
		apogySystem3DViewBackgroundColorColorFieldEditor = createColorFieldEditor(apogySystem3DViewGroup, ApogyTopologyUIPreferencesConstants.DEFAULT_APOGY_SYSTEM_VIEW_BACKGROUND_COLOR_ID, "Background Color:");
		
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
		apogySystem3DViewBackgroundColorColorFieldEditor.loadDefault();
		super.performDefaults();
	}
	
	private void storePreferences()
	{
		apogySystem3DViewBackgroundColorColorFieldEditor.store();
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
