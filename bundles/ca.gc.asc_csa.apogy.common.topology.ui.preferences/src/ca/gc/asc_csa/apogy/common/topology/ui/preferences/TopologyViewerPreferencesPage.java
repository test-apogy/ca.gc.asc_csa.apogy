package ca.gc.asc_csa.apogy.common.topology.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class TopologyViewerPreferencesPage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	public TopologyViewerPreferencesPage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		BooleanFieldEditor antiAliasing = new BooleanFieldEditor(
				PreferenceConstants.P_ANTI_ALIASING, "Anti-aliasing",
				getFieldEditorParent());

		BooleanFieldEditor show3DAxis = new BooleanFieldEditor(
				PreferenceConstants.P_SHOW_3D_AXIS, "Show 3D Axis",
				getFieldEditorParent());

		addField(antiAliasing);
		addField(show3DAxis);
	}

	@Override
	public void init(IWorkbench workbench) {

	}

}
