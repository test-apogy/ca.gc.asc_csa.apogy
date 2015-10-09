package org.eclipse.symphony.common.topology.ui.viewer.preferences;

import org.eclipse.swt.graphics.RGB;

public class TopologyViewerLightingPreferenceConstants {

	public static final String P_ANTI_ALIASING = "org.eclipse.symphony.common.topology.ui.antialising";

	public static final String P_SHOW_3D_AXIS = "org.eclipse.symphony.common.topology.ui.show3DAxis";

	// Warmth
	public static final String P_KEY_LIGHT_WARMTH = "keyLigthWarmth";
	public static final float P_KEY_LIGHT_WARMTH_DEFAULT = 0.6f;

	public static final String P_FILL_LIGHT_WARMTH = "fillLigthWarmth";
	public static final float P_FILL_LIGHT_WARMTH_DEFAULT = 0.4f;

	public static final String P_BACK_LIGHT_WARMTH = "backLigthWarmth";
	public static final float P_BACK_LIGHT_WARMTH_DEFAULT = 0.5f;

	public static final String P_HEAD_LIGHT_WARMTH = "headLigthWarmth";
	public static final float P_HEAD_LIGHT_WARMTH_DEFAULT = 0.5f;

	// Intensity
	public static final String P_KEY_LIGHT_INTENSITY = "keyLigthIntensity";
	public static final float P_KEY_LIGHT_INTENSITY_DEFAULT = 0.75f;

	// Key to ratios
	public static final String P_KEY_TO_FILL_RATIO = "keyToFillRatio";
	public static final float P_KEY_TO_FILL_RATIO_DEFAULT = 3.0f;

	public static final String P_KEY_TO_BACK_RATIO = "keyToBackRatio";
	public static final float P_KEY_TO_BACK_RATIO_DEFAULT = 3.5f;

	public static final String P_KEY_TO_HEAD_RATIO = "keyToHeadRatio";
	public static final float P_KEY_TO_HEAD_RATIO_DEFAULT = 3.0f;

	// Elevation
	public static final String P_KEY_LIGHT_ELEVATION = "keyLigthElevation";
	public static final float P_KEY_LIGHT_ELEVATION_DEFAULT = 50.0f;

	public static final String P_FILL_LIGHT_ELEVATION = "fillLigthElevation";
	public static final float P_FILL_LIGHT_ELEVATION_DEFAULT = -75.0f;

	public static final String P_BACK_LIGHT_ELEVATION = "backLigthElevation";
	public static final float P_BACK_LIGHT_ELEVATION_DEFAULT = 0.0f;

	// Azimuth
	public static final String P_KEY_LIGHT_AZIMUTH = "keyLigthAzimuth";
	public static final float P_KEY_LIGHT_AZIMUTH_DEFAULT = 10.0f;

	public static final String P_FILL_LIGHT_AZIMUTH = "fillLigthAzimuth";
	public static final float P_FILL_LIGHT_AZIMUTH_DEFAULT = -10.0f;

	public static final String P_BACK_LIGHT_AZIMUTH = "backLigthAzimuth";
	public static final float P_BACK_LIGHT_AZIMUTH_DEFAULT = 110.0f;

	// Colors
	public static final String P_KEY_LIGHT_COLOR = "keyLightColor";
	public static final RGB P_KEY_LIGHT_COLOR_DEFAULT = new RGB(255, 255, 255);

	public static final String P_FILL_LIGHT_COLOR = "fillLightColor";
	public static final RGB P_FILL_LIGHT_COLOR_DEFAULT = new RGB(255, 255, 255);

	public static final String P_BACK_LIGHT_COLOR = "backLightColor";
	public static final RGB P_BACK_LIGHT_COLOR_DEFAULT = new RGB(255, 255, 255);

	public static final String P_HEAD_LIGHT_COLOR = "headLightColor";
	public static final RGB P_HEAD_LIGHT_COLOR_DEFAULT = new RGB(255, 255, 255);

	// Enable / disable
	public static final String P_KEY_LIGHT_ENABLED = "keyLightEnabled";
	public static final boolean P_KEY_LIGHT_ENABLED_DEFAULT = true;

	public static final String P_FILL_LIGHT_ENABLED = "fillLightEnabled";
	public static final boolean P_FILL_LIGHT_ENABLED_DEFAULT = true;

	public static final String P_BACK_LIGHT_ENABLED = "backLightEnabled";
	public static final boolean P_BACK_LIGHT_ENABLED_DEFAULT = true;

	public static final String P_HEAD_LIGHT_ENABLED = "headLightEnabled";
	public static final boolean P_HEAD_LIGHT_ENABLED_DEFAULT = true;
}
