package org.eclipse.symphony.addons.sensors.fov.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.symphony.addons.sensors.fov.ui.Activator;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class MRTFOVPreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor circularSectorFOVBooleanFieldEditor;
	private BooleanFieldEditor conicalFOVBooleanFieldEditor;
	private BooleanFieldEditor rectangularFrustumFOVBooleanFieldEditor;
	
	private RadioGroupFieldEditor circularSectorFOVRadioGroupFieldEditor;
	private RadioGroupFieldEditor conicalFOVRadioGroupFieldEditor;
	private RadioGroupFieldEditor rectangularFrustumFOVRadioGroupFieldEditor;
	
	private ColorFieldEditor circularSectorFOVColorFieldEditor;
	private ColorFieldEditor conicalFOVColorFieldEditor;
	private ColorFieldEditor rectangularFrustumFOVColorFieldEditor;
	
	private BooleanFieldEditor circularSectorFOVOutlineFieldEditor;
	private BooleanFieldEditor conicalFOVOutlineFieldEditor;
	private BooleanFieldEditor rectangularFrustumFOVOutlineFieldEditor;
	
	private BooleanFieldEditor circularSectorFOVProjectionFieldEditor;
	private BooleanFieldEditor conicalFOVProjectionFieldEditor;
	private BooleanFieldEditor rectangularFrustumFOVProjectionFieldEditor;
	
	private ColorFieldEditor circularSectorFOVProjectionColorFieldEditor;
	private ColorFieldEditor conicalFOVProjectionColorFieldEditor;
	private ColorFieldEditor rectangularFrustumFOVProjectionColorFieldEditor;
	
	/**
	 * Create the preference page.
	 */
	public MRTFOVPreferencesPage() {
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
		Group grpCircularSectorFov = new Group(container, SWT.NONE);
		grpCircularSectorFov.setLayout(new GridLayout(2, true));
		grpCircularSectorFov.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		grpCircularSectorFov.setText("Circular Sector FOV");	
		
		Label circularSectorFOVVisibilityLabel = new Label(grpCircularSectorFov, SWT.NONE);
		circularSectorFOVVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		circularSectorFOVVisibilityLabel.setText("Visibility");		
		circularSectorFOVBooleanFieldEditor = createBooleanFieldEditor(grpCircularSectorFov, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_VISIBILITY_ID, "");				
		
		Label circularSectorFOVOutlineLabel = new Label(grpCircularSectorFov, SWT.NONE);
		circularSectorFOVOutlineLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		circularSectorFOVOutlineLabel.setText("Show Outline Only");
		circularSectorFOVOutlineFieldEditor = createBooleanFieldEditor(grpCircularSectorFov, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_OUTLINE_ONLY_ID, "");
		
		// FOV Color
		circularSectorFOVColorFieldEditor = createColorFieldEditor(grpCircularSectorFov, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_COLOR_ID, "Default Color:");		

		Label circularSectorFOVModeLabel = new Label(grpCircularSectorFov, SWT.NONE);
		circularSectorFOVModeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		circularSectorFOVModeLabel.setText("Presentation Mode:");
		circularSectorFOVRadioGroupFieldEditor = createRadioGroupFieldEditor(grpCircularSectorFov, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PRESENTATION_MODE_ID, "");
		
		// Projection
		Label circularSectorFOVProjectionLabel = new Label(grpCircularSectorFov, SWT.NONE);
		circularSectorFOVProjectionLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		circularSectorFOVProjectionLabel.setText("Show Projection");
		circularSectorFOVProjectionFieldEditor = createBooleanFieldEditor(grpCircularSectorFov, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_SHOW_PROJECTION_ID, "");

		// Projection Color
		circularSectorFOVProjectionColorFieldEditor = createColorFieldEditor(grpCircularSectorFov, MRTFOVPreferencesConstants.DEFAULT_CIRCULAR_SECTOR_FOV_PROJECTION_COLOR_ID, "Projection Color");
		
		// Conical FOV
		Group grpConicalFov = new Group(container, SWT.NONE);
		grpConicalFov.setLayout(new GridLayout(2, true));
		grpConicalFov.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		grpConicalFov.setText("Conical FOV");
		
		Label conicalFOVVisibilityLabel = new Label(grpConicalFov, SWT.NONE);
		conicalFOVVisibilityLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		conicalFOVVisibilityLabel.setText("Visibility");
		conicalFOVBooleanFieldEditor = createBooleanFieldEditor(grpConicalFov, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_VISIBILITY_ID, "");		
				
		Label conicalFOVOutlineLabel = new Label(grpConicalFov, SWT.NONE);
		conicalFOVOutlineLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		conicalFOVOutlineLabel.setText("Show Outline Only");
		conicalFOVOutlineFieldEditor = createBooleanFieldEditor(grpConicalFov, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_OUTLINE_ONLY_ID, "");
		
		conicalFOVColorFieldEditor = createColorFieldEditor(grpConicalFov, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_COLOR_ID, "Default Color");
			
		Label conicalFOVModeLabel = new Label(grpConicalFov, SWT.NONE);
		conicalFOVModeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		conicalFOVModeLabel.setText("Presentation Mode:");
		conicalFOVRadioGroupFieldEditor = createRadioGroupFieldEditor(grpConicalFov, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PRESENTATION_MODE_ID, "");
		
		// Projection
		Label conicalFOVProjectionLabel = new Label(grpConicalFov, SWT.NONE);
		conicalFOVProjectionLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		conicalFOVProjectionLabel.setText("Show Projection");
		conicalFOVProjectionFieldEditor = createBooleanFieldEditor(grpConicalFov, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_SHOW_PROJECTION_ID, "Projection Color");
		
		// Projection Color
		conicalFOVProjectionColorFieldEditor = createColorFieldEditor(grpConicalFov, MRTFOVPreferencesConstants.DEFAULT_CONICAL_FOV_PROJECTION_COLOR_ID, "Projection Color");

		
		// Rectangular Frustum FOV
		Group grpRectangularFrustumFov = new Group(container, SWT.NONE);
		grpRectangularFrustumFov.setLayout(new GridLayout(2, true));
		grpRectangularFrustumFov.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		grpRectangularFrustumFov.setText("Rectangular Frustum FOV");
		
		Label rectangularFrustumFOVLabel = new Label(grpRectangularFrustumFov, SWT.NONE);
		rectangularFrustumFOVLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		rectangularFrustumFOVLabel.setText("Visibility");	
		rectangularFrustumFOVBooleanFieldEditor = createBooleanFieldEditor(grpRectangularFrustumFov, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_VISIBILITY_ID, "");				
		
		Label rectangularFrustumFOVOutlineLabel = new Label(grpRectangularFrustumFov, SWT.NONE);
		rectangularFrustumFOVOutlineLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		rectangularFrustumFOVOutlineLabel.setText("Show Outline Only");
		rectangularFrustumFOVOutlineFieldEditor = createBooleanFieldEditor(grpRectangularFrustumFov, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_OUTLINE_ONLY_ID, "");
		
		rectangularFrustumFOVColorFieldEditor = createColorFieldEditor(grpRectangularFrustumFov, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_COLOR_ID, "Default Color");

		Label rectangularFrustumFOVVModeLabel = new Label(grpRectangularFrustumFov, SWT.NONE);
		rectangularFrustumFOVVModeLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		rectangularFrustumFOVVModeLabel.setText("Presentation Mode:");
		rectangularFrustumFOVRadioGroupFieldEditor = createRadioGroupFieldEditor(grpRectangularFrustumFov, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PRESENTATION_MODE_ID, "");

		// Projection
		Label rectangularFrustumFOVProjectionLabel = new Label(grpRectangularFrustumFov, SWT.NONE);
		rectangularFrustumFOVProjectionLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		rectangularFrustumFOVProjectionLabel.setText("Show Projection");
		rectangularFrustumFOVProjectionFieldEditor = createBooleanFieldEditor(grpRectangularFrustumFov, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_SHOW_PROJECTION_ID, "");

		// Projection Color
		rectangularFrustumFOVProjectionColorFieldEditor = createColorFieldEditor(grpRectangularFrustumFov, MRTFOVPreferencesConstants.DEFAULT_RECTANGULAR_FRUSTUM_FOV_PROJECTION_COLOR_ID, "Projection Color");
		
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
		circularSectorFOVBooleanFieldEditor.loadDefault();
		conicalFOVBooleanFieldEditor.loadDefault();
		rectangularFrustumFOVBooleanFieldEditor.loadDefault();

		circularSectorFOVRadioGroupFieldEditor.loadDefault();
		conicalFOVRadioGroupFieldEditor.loadDefault();
		rectangularFrustumFOVRadioGroupFieldEditor.loadDefault();
		
		circularSectorFOVColorFieldEditor.loadDefault();
		conicalFOVColorFieldEditor.loadDefault();
		rectangularFrustumFOVColorFieldEditor.loadDefault();
		
		circularSectorFOVOutlineFieldEditor.loadDefault();
		conicalFOVOutlineFieldEditor.loadDefault();
		rectangularFrustumFOVOutlineFieldEditor.loadDefault();
		
		circularSectorFOVProjectionFieldEditor.loadDefault();
		conicalFOVProjectionFieldEditor.loadDefault();
		rectangularFrustumFOVProjectionFieldEditor.loadDefault();
		
		circularSectorFOVProjectionColorFieldEditor.loadDefault();
		conicalFOVProjectionColorFieldEditor.loadDefault();
		rectangularFrustumFOVProjectionColorFieldEditor.loadDefault();
		
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
	
	private RadioGroupFieldEditor createRadioGroupFieldEditor(final Composite container, final String preferenceID, final String preferenceLabel)
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

	private void storePreferences()
	{
		circularSectorFOVBooleanFieldEditor.store();
		conicalFOVBooleanFieldEditor.store();
		rectangularFrustumFOVBooleanFieldEditor.store();
		
		circularSectorFOVRadioGroupFieldEditor.store();
		conicalFOVRadioGroupFieldEditor.store();
		rectangularFrustumFOVRadioGroupFieldEditor.store();
		
		circularSectorFOVColorFieldEditor.store();
		conicalFOVColorFieldEditor.store();
		rectangularFrustumFOVColorFieldEditor.store();	
		
		circularSectorFOVOutlineFieldEditor.store();
		conicalFOVOutlineFieldEditor.store();
		rectangularFrustumFOVOutlineFieldEditor.store();
		
		circularSectorFOVProjectionFieldEditor.store();
		conicalFOVProjectionFieldEditor.store();
		rectangularFrustumFOVProjectionFieldEditor.store();
		
		circularSectorFOVProjectionColorFieldEditor.store();
		conicalFOVProjectionColorFieldEditor.store();
		rectangularFrustumFOVProjectionColorFieldEditor.store();

	}

}
