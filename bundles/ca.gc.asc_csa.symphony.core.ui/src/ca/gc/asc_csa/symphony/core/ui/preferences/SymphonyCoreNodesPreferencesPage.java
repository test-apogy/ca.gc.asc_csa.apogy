package ca.gc.asc_csa.symphony.core.ui.preferences;

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
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ca.gc.asc_csa.symphony.core.ui.Activator;

public class SymphonyCoreNodesPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor resultNodeFlagVisibilityBooleanFieldEditor;	
	private StringFieldEditor resultNodeFlagPoleHeight;
	
	/**
	 * Create the preference page.
	 */
	public SymphonyCoreNodesPreferencesPage() {
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
		
		resultNodeFlagVisibilityBooleanFieldEditor = createBooleanFieldEditor(grpResultNode, SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_VISIBILITY_ID, "");		

		Label resultNodeFlagPoleHeightLabel = new Label(grpResultNode, SWT.NONE);
		resultNodeFlagPoleHeightLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		resultNodeFlagPoleHeightLabel.setText("Flag Height (m)");
		
		resultNodeFlagPoleHeight = createStringFieldEditor(grpResultNode, SymphonyCorePreferencesConstants.DEFAULT_RESULT_NODE_FLAG_POLE_HEIGHT_ID, "");		

		
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
