package ca.gc.asc_csa.apogy.core.environment.ui.preferences;

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
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class ApogyEnvironmentSkyPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private StringFieldEditor starMagnitudeCutoffEditor;
	
	private List<FieldEditor> editors = new ArrayList<FieldEditor>();
	
	/**
	 * Create the preference page.
	 */
	public ApogyEnvironmentSkyPreferencesPage() {
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
				
		Group grpStarField = new Group(container, SWT.NONE);
		grpStarField.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpStarField.setLayout(new GridLayout(1, true));		
		grpStarField.setText("Star Field Settings");	
		
		starMagnitudeCutoffEditor = createStringFieldEditor(grpStarField, ApogyEnvironmentUIPreferencesConstants.DEFAULT_STAR_MAGNITUDE_CUTOFF_ID, "Star Magnitude Cutoff");
		editors.add(starMagnitudeCutoffEditor);
		
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
}
