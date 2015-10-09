package org.eclipse.symphony.common.topology.ui.preferences;

import javax.vecmath.Color3f;
import javax.vecmath.Vector3f;

import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * 
 * @author sgemme
 * 
 */
public class LightingPreferences {

	private IPreferenceStore preferenceStore;

	public IPreferenceStore getPreferenceStore() {
		if (preferenceStore == null) {
			IScopeContext context = InstanceScope.INSTANCE;
			String qualifier = org.eclipse.symphony.common.topology.ui.preferences.Activator.PLUGIN_ID;
			preferenceStore = new ScopedPreferenceStore(context, qualifier);
		}
		return preferenceStore;
	}

	// Key light
	public float getKeyLightWarmth() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_KEY_LIGHT_WARMTH);
	}

	public float getKeyLightIntensity() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_KEY_LIGHT_INTENSITY);
	}

	public float getKeyLightElevation() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_KEY_LIGHT_ELEVATION);
	}

	public float getKeyLightAzimuth() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_KEY_LIGHT_AZIMUTH);
	}

	// Fill light
	public float getFillLightWarmth() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_FILL_LIGHT_WARMTH);
	}

	public float getKeyToFillRatio() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_KEY_TO_FILL_RATIO);
	}

	public float getFillLightElevation() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_FILL_LIGHT_ELEVATION);
	}

	public float getFillLightAzimuth() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_FILL_LIGHT_AZIMUTH);
	}

	// Back light
	public float getBackLightWarmth() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_BACK_LIGHT_WARMTH);
	}

	public float getKeyToBackRatio() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_KEY_TO_BACK_RATIO);
	}

	public float getBackLightElevation() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_BACK_LIGHT_ELEVATION);
	}

	public float getBackLightAzimuth() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_BACK_LIGHT_AZIMUTH);
	}

	// Head light
	public float getHeadLightWarmth() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_HEAD_LIGHT_WARMTH);
	}

	public float getKeyToHeadRatio() {
		return getPreferenceStore().getFloat(
				PreferenceConstants.P_KEY_TO_HEAD_RATIO);
	}

	public Vector3f getKeyLightDirection() {
		return sphericalToCartesian(getKeyLightAzimuth(),
				getKeyLightElevation());
	}

	public Color3f getKeyLightColor() {
		RGB color = PreferenceConverter.getColor(getPreferenceStore(),
				PreferenceConstants.P_KEY_LIGHT_COLOR);
		return createColor(getKeyLightWarmth(), 1.0f, color);
	}

	public Vector3f getBackLightDirection() {
		return sphericalToCartesian(getBackLightAzimuth(),
				getBackLightElevation());
	}

	public Color3f getBackLightColor() {
		RGB color = PreferenceConverter.getColor(getPreferenceStore(),
				PreferenceConstants.P_BACK_LIGHT_COLOR);
		return createColor(getBackLightWarmth(), getKeyToBackRatio(), color);
	}

	public Vector3f getFillLightDirection() {
		return sphericalToCartesian(getFillLightAzimuth(),
				getFillLightElevation());
	}

	public Color3f getFillLightColor() {
		RGB color = PreferenceConverter.getColor(getPreferenceStore(),
				PreferenceConstants.P_FILL_LIGHT_COLOR);
		return createColor(getFillLightWarmth(), getKeyToFillRatio(), color);
	}

	public Color3f getHeadLightColor() {
		RGB color = PreferenceConverter.getColor(getPreferenceStore(),
				PreferenceConstants.P_HEAD_LIGHT_COLOR);
		return createColor(getHeadLightWarmth(), getKeyToHeadRatio(), color);
	}

	private Color3f createColor(float warmth, float keyRatio, RGB color) {

		float cr = (float) color.red / 255.0f;
		float cg = (float) color.green / 255.0f;
		float cb = (float) color.blue / 255.0f;

		float scale = getKeyLightIntensity() / keyRatio;

		Color3f c = new Color3f(cr, cg, cb);
		c.scale(scale);

		return c;
	}

	/**
	 * 
	 * @param azimuth
	 *            azimuth in degrees
	 * @param elevation
	 *            elevation in degrees
	 * @return
	 */
	private Vector3f sphericalToCartesian(double azimuth, double elevation) {
		double azimuthRadians = Math.toRadians(azimuth);
		double elevationRadians = Math.toRadians(elevation);

		double x = (Math.sin(elevationRadians) * Math.cos(azimuthRadians));
		double y = (Math.sin(elevationRadians) * Math.sin(azimuthRadians));
		double z = Math.cos(elevationRadians);

		Vector3f direction = new Vector3f((float) x, (float) y, (float) z);
		direction.normalize();

		return direction;
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>isKeyLightEnabled</dd>
	 * <dt>Description:</dt>
	 * <dd>verifies if the key light is enabled or not in the preferences.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return true if the key light is enabled and false if not.
	 */
	public boolean isKeyLightEnabled() {
		return getPreferenceStore().getBoolean(
				PreferenceConstants.P_KEY_LIGHT_ENABLED);
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>isBackLightEnabled</dd>
	 * <dt>Description:</dt>
	 * <dd>verifies if the back light is enabled or not in the preferences.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return true if the back light is enabled and false if not.
	 */
	public boolean isBackLightEnabled() {
		return getPreferenceStore().getBoolean(
				PreferenceConstants.P_BACK_LIGHT_ENABLED);
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>isFillLightEnabled</dd>
	 * <dt>Description:</dt>
	 * <dd>verifies if the fill light is enabled or not in the preferences.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return true if the fill light is enabled and false if not.
	 */
	public boolean isFillLightEnabled() {
		return getPreferenceStore().getBoolean(
				PreferenceConstants.P_FILL_LIGHT_ENABLED);
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>isHeadLightEnabled</dd>
	 * <dt>Description:</dt>
	 * <dd>verifies if the head light is enabled or not in the preferences.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return true if the head light is enabled and false if not.
	 */
	public boolean isHeadLightEnabled() {
		return getPreferenceStore().getBoolean(
				PreferenceConstants.P_HEAD_LIGHT_ENABLED);
	}

}
