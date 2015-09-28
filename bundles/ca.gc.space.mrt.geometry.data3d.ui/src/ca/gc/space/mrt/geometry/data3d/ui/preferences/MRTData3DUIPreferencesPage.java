package ca.gc.space.mrt.geometry.data3d.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ca.gc.space.mrt.geometry.data3d.ui.Activator;
import ca.gc.space.topology.ui.MeshPresentationMode;

public class MRTData3DUIPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor triangularMeshVisibilityBooleanFieldEditor;	
	private BooleanFieldEditor cartesianCoordSetVisibilityBooleanFieldEditor;
	private BooleanFieldEditor triangularMeshUseShadingBooleanFieldEditor;	
	
	private RadioGroupFieldEditor wayPointPathPresentationModeRadioGroupFieldEditor;	
	
	private ColorFieldEditor triangularMeshColorFieldEditor;
	private ColorFieldEditor cartesianCoordSetColorFieldEditor;
	
	private IntegerFieldEditor  triangularMeshPointSizeIntegerFieldEditor;	
	private IntegerFieldEditor  cartesianCoordSetPointSizeIntegerFieldEditor;	
	

	/**
	 * Create the preference page.
	 */
	public MRTData3DUIPreferencesPage() {
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
		
		// Cartesian Coordinates Set
		Group grpCartesianCoordSet = new Group(container, SWT.NONE);
		grpCartesianCoordSet.setLayout(new GridLayout(2, true));
		grpCartesianCoordSet.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpCartesianCoordSet.setText("Cartesian Coordinates Set (Point Cloud)");	
		
		Label cartesianCoordSetVisibilityLabel = new Label(grpCartesianCoordSet, SWT.NONE);
		cartesianCoordSetVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		cartesianCoordSetVisibilityLabel.setText("Visibility");		
		cartesianCoordSetVisibilityBooleanFieldEditor = createBooleanFieldEditor(grpCartesianCoordSet, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_VISIBILITY_ID, "");				
		
		cartesianCoordSetColorFieldEditor = createColorFieldEditor(grpCartesianCoordSet, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_COLOR_ID, "Default Color:");		
	
		cartesianCoordSetPointSizeIntegerFieldEditor = createIntegerFieldEditor(grpCartesianCoordSet, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE_ID, "Point Size:");
				
		// Triangular Mesh
		Group grpTriangularMesh = new Group(container, SWT.NONE);
		grpTriangularMesh.setLayout(new GridLayout(2, true));
		grpTriangularMesh.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpTriangularMesh.setText("Triangular Mesh");	
		
		Label triangularMeshVisibilityLabel = new Label(grpTriangularMesh, SWT.NONE);
		triangularMeshVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		triangularMeshVisibilityLabel.setText("Visibility");		
		triangularMeshVisibilityBooleanFieldEditor = createBooleanFieldEditor(grpTriangularMesh, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_VISIBILITY_ID, "");				
		
		Label triangularMeshUseShadingLabel = new Label(grpTriangularMesh, SWT.NONE);
		triangularMeshUseShadingLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		triangularMeshUseShadingLabel.setText("Use Shading");	
		triangularMeshUseShadingBooleanFieldEditor = createBooleanFieldEditor(grpTriangularMesh, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_USE_SHADING_ID, "");

		
		triangularMeshColorFieldEditor = createColorFieldEditor(grpTriangularMesh, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_COLOR_ID, "Default Color:");						
		triangularMeshPointSizeIntegerFieldEditor = createIntegerFieldEditor(grpTriangularMesh, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_POINT_SIZE_ID, "Point Size:");			
		wayPointPathPresentationModeRadioGroupFieldEditor = createPathPresentationRadioGroupFieldEditor(grpTriangularMesh, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE_ID, "");
		
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
		triangularMeshVisibilityBooleanFieldEditor.loadDefault();
		cartesianCoordSetVisibilityBooleanFieldEditor.loadDefault();		
		wayPointPathPresentationModeRadioGroupFieldEditor.loadDefault();			
		triangularMeshColorFieldEditor.loadDefault();
		cartesianCoordSetColorFieldEditor.loadDefault();	
		triangularMeshPointSizeIntegerFieldEditor.loadDefault();
		cartesianCoordSetPointSizeIntegerFieldEditor.loadDefault();	
		triangularMeshUseShadingBooleanFieldEditor.loadDefault();
		super.performDefaults();
	}
	
	private String[][] getModeLabelsAndValues()
	{
		String [][] labelAndValues = new String[MeshPresentationMode.VALUES.size()][2];
		
		int i = 0;
		for(MeshPresentationMode value : MeshPresentationMode.VALUES)
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
	
	private void storePreferences()
	{
		triangularMeshVisibilityBooleanFieldEditor.store();
		cartesianCoordSetVisibilityBooleanFieldEditor.store();	
		wayPointPathPresentationModeRadioGroupFieldEditor.store();			
		triangularMeshColorFieldEditor.store();
		cartesianCoordSetColorFieldEditor.store();	
		triangularMeshPointSizeIntegerFieldEditor.store();
		cartesianCoordSetPointSizeIntegerFieldEditor.store();	
		triangularMeshUseShadingBooleanFieldEditor.store();
		
	}

}
