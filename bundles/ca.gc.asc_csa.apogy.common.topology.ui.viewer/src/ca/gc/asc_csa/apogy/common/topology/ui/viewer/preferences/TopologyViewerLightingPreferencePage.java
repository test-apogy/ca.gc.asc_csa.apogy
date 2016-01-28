package org.eclipse.symphony.common.topology.ui.viewer.preferences;

import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.symphony.common.topology.ui.viewer.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.wb.swt.DoubleFieldEditor;
import org.eclipse.wb.swt.FieldLayoutPreferencePage;

public class TopologyViewerLightingPreferencePage extends
		FieldLayoutPreferencePage implements IWorkbenchPreferencePage {

	private static final boolean WARMTH_ENABLED = false;

	/**
	 * Create the preference page.
	 */
	public TopologyViewerLightingPreferencePage() {
		ScopedPreferenceStore prefsStore = new ScopedPreferenceStore(
				InstanceScope.INSTANCE, Activator.ID);

		prefsStore
				.setSearchContexts(new IScopeContext[] { InstanceScope.INSTANCE });

		setPreferenceStore(prefsStore);
		setDescription("Lighting");
	}

	/**
	 * Create contents of the preference page.
	 * 
	 * @param parent
	 */
	@Override
	public Control createPageContents(Composite parent) {
		Composite container = new Composite(parent, SWT.BORDER);
		GridLayout gl_container = new GridLayout();
		if (WARMTH_ENABLED) {
			gl_container.numColumns = 7;
		} else {
			gl_container.numColumns = 6;
		}
		container.setLayout(gl_container);

		// Key light
		Label lblKey = new Label(container, SWT.NONE);
		lblKey.setText("Key");

		Composite composite_keyLightEnabled = new Composite(container, SWT.NONE);
		composite_keyLightEnabled.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			BooleanFieldEditor keyLightEnabledFieldEditor = new BooleanFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_LIGHT_ENABLED, "Enabled",
					composite_keyLightEnabled);
			addField(keyLightEnabledFieldEditor);
		}

		if (WARMTH_ENABLED) {
			Composite composite_1 = new Composite(container, SWT.NONE);
			composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			{
				DoubleFieldEditor keyWarmthFieldEditor = new DoubleFieldEditor(
						TopologyViewerLightingPreferenceConstants.P_KEY_LIGHT_WARMTH, "Warm",
						composite_1);
				keyWarmthFieldEditor.setValidRange(0.0, 1.0);
				addField(keyWarmthFieldEditor);
			}
		}

		Composite composite_keyLightColor = new Composite(container, SWT.NONE);
		composite_keyLightColor.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			ColorFieldEditor keyLightColor = new ColorFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_LIGHT_COLOR, "Color",
					composite_keyLightColor);
			addField(keyLightColor);
		}

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		{
			DoubleFieldEditor keyIntFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_LIGHT_INTENSITY, "Int", composite);
			keyIntFieldEditor.setValidRange(0.0, 1.0);
			addField(keyIntFieldEditor);
		}

		Composite composite_2 = new Composite(container, SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor keyElevationFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_LIGHT_ELEVATION, "Ele",
					composite_2);
			keyElevationFieldEditor.setValidRange(-180.0, 180.0);
			addField(keyElevationFieldEditor);
		}

		Composite composite_3 = new Composite(container, SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor keyAzimuthFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_LIGHT_AZIMUTH, "Azi", composite_3);
			keyAzimuthFieldEditor.setValidRange(-180.0, 180.0);
			addField(keyAzimuthFieldEditor);
		}

		// Fill light
		Label lblFill = new Label(container, SWT.NONE);
		lblFill.setText("Fill");

		Composite composite_fillLightEnabled = new Composite(container,
				SWT.NONE);
		composite_fillLightEnabled.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			BooleanFieldEditor fillLightEnabledFieldEditor = new BooleanFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_FILL_LIGHT_ENABLED, "Enabled",
					composite_fillLightEnabled);
			addField(fillLightEnabledFieldEditor);
		}

		if (WARMTH_ENABLED) {
			Composite composite_4 = new Composite(container, SWT.NONE);
			composite_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			{
				DoubleFieldEditor fillWarmthFieldEditor = new DoubleFieldEditor(
						TopologyViewerLightingPreferenceConstants.P_FILL_LIGHT_WARMTH, "Warm",
						composite_4);
				fillWarmthFieldEditor.setValidRange(0.0, 1.0);
				addField(fillWarmthFieldEditor);
			}
		}

		Composite composite_fillLightColor = new Composite(container, SWT.NONE);
		composite_keyLightColor.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			ColorFieldEditor fillLightColor = new ColorFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_FILL_LIGHT_COLOR, "Color",
					composite_fillLightColor);
			addField(fillLightColor);
		}

		Composite composite_5 = new Composite(container, SWT.NONE);
		composite_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		composite_5.setToolTipText("Key-to-Fill Ratio");
		{
			DoubleFieldEditor kToFRatioFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_TO_FILL_RATIO, "K:F", composite_5);
			kToFRatioFieldEditor.setToolTipText("Key-to-fill ratio");
			kToFRatioFieldEditor.setValidRange(0.0, 100.0);
			addField(kToFRatioFieldEditor);
		}

		Composite composite_6 = new Composite(container, SWT.NONE);
		composite_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor fillElevationFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_FILL_LIGHT_ELEVATION, "Ele",
					composite_6);
			fillElevationFieldEditor.setValidRange(-180.0, 180.0);
			addField(fillElevationFieldEditor);
		}

		Composite composite_7 = new Composite(container, SWT.NONE);
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor fillAzimuthFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_FILL_LIGHT_AZIMUTH, "Azi",
					composite_7);
			fillAzimuthFieldEditor.setValidRange(-180.0, 180.0);
			addField(fillAzimuthFieldEditor);
		}

		// Back light
		Label lblBack = new Label(container, SWT.NONE);
		lblBack.setText("Back");

		Composite composite_backLightEnabled = new Composite(container,
				SWT.NONE);
		composite_backLightEnabled.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			BooleanFieldEditor backLightEnabledFieldEditor = new BooleanFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_BACK_LIGHT_ENABLED, "Enabled",
					composite_backLightEnabled);
			addField(backLightEnabledFieldEditor);
		}

		if (WARMTH_ENABLED) {
			Composite composite_8 = new Composite(container, SWT.NONE);
			composite_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			{
				DoubleFieldEditor backWarmthFieldEditor = new DoubleFieldEditor(
						TopologyViewerLightingPreferenceConstants.P_BACK_LIGHT_WARMTH, "Warm",
						composite_8);
				backWarmthFieldEditor.setValidRange(0.0, 1.0);
				addField(backWarmthFieldEditor);
			}
		}

		Composite composite_backLightColor = new Composite(container, SWT.NONE);
		composite_keyLightColor.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			ColorFieldEditor backLightColor = new ColorFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_BACK_LIGHT_COLOR, "Color",
					composite_backLightColor);
			addField(backLightColor);
		}

		Composite composite_9 = new Composite(container, SWT.NONE);
		composite_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor kToBRatioFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_TO_BACK_RATIO, "K:B", composite_9);
			kToBRatioFieldEditor.setToolTipText("Key-to-Back Ratio");
			kToBRatioFieldEditor.setValidRange(0.0, 100.0);
			addField(kToBRatioFieldEditor);
		}

		Composite composite_10 = new Composite(container, SWT.NONE);
		composite_10.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor backElevationFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_BACK_LIGHT_ELEVATION, "Ele",
					composite_10);
			backElevationFieldEditor.setValidRange(-180.0, 180.0);
			addField(backElevationFieldEditor);
		}

		Composite composite_11 = new Composite(container, SWT.NONE);
		composite_11.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor backAzimuthFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_BACK_LIGHT_AZIMUTH, "Azi",
					composite_11);
			backAzimuthFieldEditor.setValidRange(-180.0, 180.0);
			addField(backAzimuthFieldEditor);
		}

		// Head light
		Label lblHead = new Label(container, SWT.NONE);
		lblHead.setText("Head");

		Composite composite_headLightEnabled = new Composite(container,
				SWT.NONE);
		composite_headLightEnabled.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			BooleanFieldEditor headLightEnabledFieldEditor = new BooleanFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_HEAD_LIGHT_ENABLED, "Enabled",
					composite_headLightEnabled);
			addField(headLightEnabledFieldEditor);
		}

		if (WARMTH_ENABLED) {
			Composite composite_12 = new Composite(container, SWT.NONE);
			composite_12.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false, 1, 1));
			{
				DoubleFieldEditor headWarmthFieldEditor = new DoubleFieldEditor(
						TopologyViewerLightingPreferenceConstants.P_HEAD_LIGHT_WARMTH, "Warm",
						composite_12);
				headWarmthFieldEditor.setValidRange(0.0, 1.0);
				addField(headWarmthFieldEditor);
			}
		}

		Composite composite_headLightColor = new Composite(container, SWT.NONE);
		composite_keyLightColor.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, true, false, 1, 1));
		{
			ColorFieldEditor headLightColor = new ColorFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_HEAD_LIGHT_COLOR, "Color",
					composite_headLightColor);
			addField(headLightColor);
		}

		Composite composite_13 = new Composite(container, SWT.NONE);
		composite_13.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		{
			DoubleFieldEditor kToHRatioFieldEditor = new DoubleFieldEditor(
					TopologyViewerLightingPreferenceConstants.P_KEY_TO_HEAD_RATIO, "K:H",
					composite_13);
			kToHRatioFieldEditor.setToolTipText("Key-to-Head Ratio");
			kToHRatioFieldEditor.setValidRange(0.0, 100.0);
			addField(kToHRatioFieldEditor);
		}
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		return container;
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}
}
