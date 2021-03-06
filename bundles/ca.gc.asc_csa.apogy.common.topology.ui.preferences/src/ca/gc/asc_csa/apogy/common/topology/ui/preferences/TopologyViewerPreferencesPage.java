package ca.gc.asc_csa.apogy.common.topology.ui.preferences;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
