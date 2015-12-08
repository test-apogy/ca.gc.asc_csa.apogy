package org.eclipse.symphony.core.environment.ui.preferences;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.symphony.core.environment.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SymphonyEnvironmentWorksitePreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private BooleanFieldEditor earthSurfaceWorksiteAxisVisibleEditor;
	private StringFieldEditor earthSurfaceWorksiteAxisLengthEditor;
	
	private BooleanFieldEditor earthSurfaceWorksiteAzimuthVisibleEditor;
	private BooleanFieldEditor earthSurfaceWorksiteAzimuthLinesVisibleEditor;
	
	private BooleanFieldEditor earthSurfaceWorksiteElevationLinesVisibleEditor;
	
	private BooleanFieldEditor earthSurfaceWorksitePlaneVisibleEditor;
	private StringFieldEditor earthSurfaceWorksitePlaneGridSizeEditor;
	private StringFieldEditor earthSurfaceWorksitePlaneSizeEditor;
	
	
	private List<FieldEditor> editors = new ArrayList<FieldEditor>();
	
	/**
	 * Create the preference page.
	 */
	public SymphonyEnvironmentWorksitePreferencesPage() {
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
				
		Group grpAxis = new Group(container, SWT.NONE);
		grpAxis.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpAxis.setLayout(new GridLayout(1, true));		
		grpAxis.setText("Axis");	
						
		earthSurfaceWorksiteAxisVisibleEditor = createBooleanFieldEditor(grpAxis, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AXIS_VISIBLE_ID, "Axis Visible");
		editors.add(earthSurfaceWorksiteAxisVisibleEditor);
		
		earthSurfaceWorksiteAxisLengthEditor = createStringFieldEditor(grpAxis, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AXIS_LENGTH_ID, "Axis Length (m)");				
		editors.add(earthSurfaceWorksiteAxisLengthEditor);
		
		Group grpAzimuth = new Group(container, SWT.NONE);
		grpAzimuth.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpAzimuth.setLayout(new GridLayout(1, true));		
		grpAzimuth.setText("Azimuth Displays");	

		earthSurfaceWorksiteAzimuthVisibleEditor = createBooleanFieldEditor(grpAzimuth, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AZIMUTH_VISIBLE_ID, "Azimuth Visible");
		editors.add(earthSurfaceWorksiteAzimuthVisibleEditor);
		
		earthSurfaceWorksiteAzimuthLinesVisibleEditor = createBooleanFieldEditor(grpAzimuth, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_AZIMUTH_LINES_VISIBLE_ID, "Azimuth Lines Visible");
		editors.add(earthSurfaceWorksiteAzimuthLinesVisibleEditor);
		
		Group grpElevation = new Group(container, SWT.NONE);
		grpElevation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpElevation.setLayout(new GridLayout(1, true));		
		grpElevation.setText("Elevation Displays");	
		
		earthSurfaceWorksiteElevationLinesVisibleEditor = createBooleanFieldEditor(grpElevation, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_ELEVATION_LINES_VISIBLE_ID, "Elevation Lines Visible");
		editors.add(earthSurfaceWorksiteElevationLinesVisibleEditor);
		
		Group grpPlane = new Group(container, SWT.NONE);
		grpPlane.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpPlane.setLayout(new GridLayout(1, true));				
		grpPlane.setText("Plane");	
		
		earthSurfaceWorksitePlaneVisibleEditor = createBooleanFieldEditor(grpPlane, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_VISIBLE_ID, "Plane Visible");		
		editors.add(earthSurfaceWorksitePlaneVisibleEditor);
		
		earthSurfaceWorksitePlaneSizeEditor = createStringFieldEditor(grpPlane, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_SIZE_ID,  "Plane Size");
		editors.add(earthSurfaceWorksitePlaneSizeEditor);
		
		earthSurfaceWorksitePlaneGridSizeEditor = createStringFieldEditor(grpPlane, SymphonyEnvironmentUIPreferencesConstants.DEFAULT_EARTH_SURFACE_WORKSITE_PLANE_GRID_SIZE_ID,  "Grid Size");
		editors.add(earthSurfaceWorksitePlaneGridSizeEditor);
		
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

		StringFieldEditor editor = new StringFieldEditor(preferenceID, preferenceLabel, editorContainer);
		
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
	

}
