package ca.gc.asc_csa.topology.ui.viewer.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
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

import ca.gc.asc_csa.topology.ui.viewer.Activator;

public class TopologyViewerPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor viewerVerboseEditor;
	private BooleanFieldEditor viewerAntiAliasingEditor;
	private IntegerFieldEditor viewerMaximumFrameRateEditor;
	private StringFieldEditor navigationLinearLowSpeedFactorEditor;
	private StringFieldEditor navigationLinearHighSpeedFactorEditor;
	
	/**
	 * Create the preference page.
	 */
	public TopologyViewerPreferencesPage() {
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
		
		
		Group grpViewerSettings = new Group(container, SWT.NONE);
		grpViewerSettings.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpViewerSettings.setLayout(new GridLayout(1, true));		
		grpViewerSettings.setText("Viewer Settings");	
		
		viewerVerboseEditor = createBooleanFieldEditor(grpViewerSettings, TopologyViewerPreferencesConstants.VIEWER_VERBOSE_ID, "Verbose Enabled");
		
		viewerAntiAliasingEditor = createBooleanFieldEditor(grpViewerSettings, TopologyViewerPreferencesConstants.VIEWER_ANTI_ALIASING_ID, "Anti-Aliasing Enabled");
		
		// Viewer frame rate.
		viewerMaximumFrameRateEditor = createIntegerFieldEditor(grpViewerSettings, TopologyViewerPreferencesConstants.VIEWER_MAX_FRAME_RATE_ID, "Maximum Frame Rate");
		
		// Navigation Speeds
		Group grpNavigationSpeeds = new Group(container, SWT.NONE);
		grpNavigationSpeeds.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpNavigationSpeeds.setLayout(new GridLayout(1, true));		
		grpNavigationSpeeds.setText("Navigation Settings");
		
		navigationLinearLowSpeedFactorEditor = createStringFieldEditor(grpNavigationSpeeds, TopologyViewerPreferencesConstants.DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID, "Linear Low Speed Factor");
		navigationLinearHighSpeedFactorEditor = createStringFieldEditor(grpNavigationSpeeds, TopologyViewerPreferencesConstants.DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID, "Linear High Speed Factor");				
		
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
		viewerVerboseEditor.loadDefault();
		viewerAntiAliasingEditor.loadDefault();
		viewerMaximumFrameRateEditor.loadDefault();
		navigationLinearLowSpeedFactorEditor.loadDefault();
		navigationLinearHighSpeedFactorEditor.loadDefault();
				
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
	
	private IntegerFieldEditor createIntegerFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		Composite editorContainer = new Composite(container, SWT.NULL);
		editorContainer.setLayout(new GridLayout(1, true));
		editorContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		IntegerFieldEditor editor = new IntegerFieldEditor(preferenceID, preferenceLabel, editorContainer);
		
		//Set the editor up to use this page	
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
	
	private void storePreferences()
	{
		viewerVerboseEditor.store();
		viewerAntiAliasingEditor.store();
		viewerMaximumFrameRateEditor.store();	
		navigationLinearLowSpeedFactorEditor.store();
		navigationLinearHighSpeedFactorEditor.store();						
	}
}
