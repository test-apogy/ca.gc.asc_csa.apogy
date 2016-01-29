package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.Activator;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.PathPresentationMode;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class MRTPathsPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor wayPointPathVisibilityBooleanFieldEditor;	
	private RadioGroupFieldEditor wayPointPathPresentationModeRadioGroupFieldEditor;	
	private ColorFieldEditor wayPointPathColorFieldEditor;
	private IntegerFieldEditor  wayPointPathPointSizeIntegerFieldEditor;
	private StringFieldEditor wayPointPathEndPointRadiusStringEditor;
	
	
	/**
	 * Create the preference page.
	 */
	public MRTPathsPreferencesPage() {
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
		
		// WayPointPath
		Group grpWayPointPath = new Group(container, SWT.NONE);
		grpWayPointPath.setLayout(new GridLayout(2, true));
		grpWayPointPath.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		grpWayPointPath.setText("WayPointPath");	
		
		Label wayPointPathVisibilityLabel = new Label(grpWayPointPath, SWT.NONE);
		wayPointPathVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		wayPointPathVisibilityLabel.setText("Visibility");		
		wayPointPathVisibilityBooleanFieldEditor = createBooleanFieldEditor(grpWayPointPath, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_VISIBILITY_ID, "");				
		
		wayPointPathColorFieldEditor = createColorFieldEditor(grpWayPointPath, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_COLOR_ID, "Default Color:");		

		Label circularSectorFOVModeLabel = new Label(grpWayPointPath, SWT.NONE);
		circularSectorFOVModeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		circularSectorFOVModeLabel.setText("Presentation Mode:");
		wayPointPathPresentationModeRadioGroupFieldEditor = createPathPresentationRadioGroupFieldEditor(grpWayPointPath, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_PRESENTATION_MODE_ID, "");
		
		wayPointPathPointSizeIntegerFieldEditor = createIntegerFieldEditor(grpWayPointPath, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_POINT_SIZE_ID, "Point Size:");
				
		wayPointPathEndPointRadiusStringEditor = createStringFieldEditor(grpWayPointPath, MRTPathsPreferencesConstants.DEFAULT_WAYPOINTPATH_END_POINT_RADIUS_ID, "End Points Radius (m):");
		
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
		wayPointPathVisibilityBooleanFieldEditor.loadDefault();
		wayPointPathPresentationModeRadioGroupFieldEditor.loadDefault();	
		wayPointPathColorFieldEditor.loadDefault();
		wayPointPathPointSizeIntegerFieldEditor.loadDefault();
		wayPointPathEndPointRadiusStringEditor.loadDefault();
		super.performDefaults();
	}
	
	private String[][] getModeLabelsAndValues()
	{
		String [][] labelAndValues = new String[PathPresentationMode.VALUES.size()][2];
		
		int i = 0;
		for(PathPresentationMode value : PathPresentationMode.VALUES)
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
	
	private RadioGroupFieldEditor createPathPresentationRadioGroupFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
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

	private IntegerFieldEditor createIntegerFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		IntegerFieldEditor integerFieldEditor = new IntegerFieldEditor(preferenceID, preferenceLabel, container);
		
		//Set the editor up to use this page	
		integerFieldEditor.setPreferenceStore(getPreferenceStore());
		integerFieldEditor.load();

		return integerFieldEditor;
	}
	
	private StringFieldEditor createStringFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
	{
		StringFieldEditor editor = new StringFieldEditor(preferenceID, preferenceLabel, container);
		
		//Set the editor up to use this page	
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		
		return editor;
	}
	
	private void storePreferences()
	{
		wayPointPathVisibilityBooleanFieldEditor.store();		
		wayPointPathPresentationModeRadioGroupFieldEditor.store();		
		wayPointPathColorFieldEditor.store();
		wayPointPathPointSizeIntegerFieldEditor.store();	
		wayPointPathEndPointRadiusStringEditor.store();
	}

}
