package org.eclipse.symphony.common.topology.ui.preferences;

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
import org.eclipse.symphony.common.topology.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class TopologyUIPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor positionNodeAxisVisibilityEditor;
	private StringFieldEditor positionNodeAxisLengthEditor;
	
	private BooleanFieldEditor rotationNodeAxisVisibilityEditor;
	private StringFieldEditor rotationNodeAxisLengthEditor;
	
	private BooleanFieldEditor transformNodeAxisVisibilityEditor;
	private StringFieldEditor transformNodeAxisLengthEditor;
	
	private BooleanFieldEditor urlNodeAxisVisibilityEditor;
	private StringFieldEditor urlNodeAxisLengthEditor;
	
	/**
	 * Create the preference page.
	 */
	public TopologyUIPreferencesPage() {
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
		
		// Position Node.
		Group positionNodeGroup = new Group(container, SWT.NONE);
		positionNodeGroup.setLayout(new GridLayout(2, true));
		positionNodeGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		positionNodeGroup.setText("Position Node");	
		
		Label positionNodeAxisVisibilityLabel = new Label(positionNodeGroup, SWT.NONE);
		positionNodeAxisVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		positionNodeAxisVisibilityLabel.setText("Axis Visibility");
		positionNodeAxisVisibilityEditor = createBooleanFieldEditor(positionNodeGroup, PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_VISIBILITY_ID, "");
		
		Label positionNodeAxisLengthLabel = new Label(positionNodeGroup, SWT.NONE);
		positionNodeAxisLengthLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		positionNodeAxisLengthLabel.setText("Axis Length (m)");
		positionNodeAxisLengthEditor = createStringFieldEditor(positionNodeGroup, PreferencesConstants.DEFAULT_POSITION_NODE_AXIS_LENGTH_ID, "");


		// Rotation Node.
		Group rotationNodeGroup = new Group(container, SWT.NONE);
		rotationNodeGroup.setLayout(new GridLayout(2, true));
		rotationNodeGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		rotationNodeGroup.setText("Rotation Node");	
		
		Label rotationNodeAxisVisibilityLabel = new Label(rotationNodeGroup, SWT.NONE);
		rotationNodeAxisVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		rotationNodeAxisVisibilityLabel.setText("Axis Visibility");
		rotationNodeAxisVisibilityEditor = createBooleanFieldEditor(rotationNodeGroup, PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_VISIBILITY_ID, "");

		Label rotatioNodeAxisLengthLabel = new Label(rotationNodeGroup, SWT.NONE);
		rotatioNodeAxisLengthLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		rotatioNodeAxisLengthLabel.setText("Axis Length (m)");
		rotationNodeAxisLengthEditor = createStringFieldEditor(rotationNodeGroup, PreferencesConstants.DEFAULT_ROTATION_NODE_AXIS_LENGTH_ID, "");
		
		// Transform Node.
		Group transformNodeGroup = new Group(container, SWT.NONE);
		transformNodeGroup.setLayout(new GridLayout(2, true));
		transformNodeGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		transformNodeGroup.setText("Transform Node");	
		
		Label transformNodeAxisVisibilityLabel = new Label(transformNodeGroup, SWT.NONE);
		transformNodeAxisVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		transformNodeAxisVisibilityLabel.setText("Axis Visibility");
		transformNodeAxisVisibilityEditor = createBooleanFieldEditor(transformNodeGroup, PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_VISIBILITY_ID, "");
		
		Label transformNodeAxisLengthLabel = new Label(transformNodeGroup, SWT.NONE);
		transformNodeAxisLengthLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		transformNodeAxisLengthLabel.setText("Axis Length (m)");
		transformNodeAxisLengthEditor = createStringFieldEditor(transformNodeGroup, PreferencesConstants.DEFAULT_TRANSFORM_NODE_AXIS_LENGTH_ID, "");
		
		// URL Node.
		Group urlNodeGroup = new Group(container, SWT.NONE);
		urlNodeGroup.setLayout(new GridLayout(2, true));
		urlNodeGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		urlNodeGroup.setText("URL Node");	
		
		Label urlNodeAxisVisibilityLabel = new Label(urlNodeGroup, SWT.NONE);
		urlNodeAxisVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		urlNodeAxisVisibilityLabel.setText("Axis Visibility");
		urlNodeAxisVisibilityEditor = createBooleanFieldEditor(urlNodeGroup, PreferencesConstants.DEFAULT_URL_NODE_AXIS_VISIBILITY_ID, "");

		Label urlNodeAxisLengthLabel = new Label(urlNodeGroup, SWT.NONE);
		urlNodeAxisLengthLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		urlNodeAxisLengthLabel.setText("Axis Length (m)");
		urlNodeAxisLengthEditor = createStringFieldEditor(urlNodeGroup, PreferencesConstants.DEFAULT_URL_NODE_AXIS_LENGTH_ID, "");

		
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
		positionNodeAxisVisibilityEditor.loadDefault();
		positionNodeAxisLengthEditor.loadDefault();
		
		rotationNodeAxisVisibilityEditor.loadDefault();
		rotationNodeAxisLengthEditor.loadDefault();
		
		transformNodeAxisVisibilityEditor.loadDefault();
		transformNodeAxisLengthEditor.loadDefault();
		
		urlNodeAxisVisibilityEditor.loadDefault();
		urlNodeAxisLengthEditor.loadDefault();
		
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

		StringFieldEditor editor = new StringFieldEditor(preferenceID, preferenceLabel, editorContainer);
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
	}

	private void storePreferences()
	{
		positionNodeAxisVisibilityEditor.store();
		positionNodeAxisVisibilityEditor.store();
		
		rotationNodeAxisVisibilityEditor.store();
		rotationNodeAxisLengthEditor.store();
		
		transformNodeAxisVisibilityEditor.store();
		transformNodeAxisLengthEditor.store();
		
		urlNodeAxisVisibilityEditor.store();
		urlNodeAxisLengthEditor.store();		
	}

}
