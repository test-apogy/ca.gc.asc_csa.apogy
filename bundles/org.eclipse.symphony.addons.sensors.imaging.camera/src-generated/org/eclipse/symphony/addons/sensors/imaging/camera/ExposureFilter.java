/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exposure Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter#getExposure <em>Exposure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getExposureFilter()
 * @model
 * @generated
 */
public interface ExposureFilter extends ImageFilter
{
  /**
	 * Returns the value of the '<em><b>Exposure</b></em>' attribute.
	 * The default value is <code>"2.5"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exposure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure</em>' attribute.
	 * @see #setExposure(double)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getExposureFilter_Exposure()
	 * @model default="2.5" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FILTER_SETTING'"
	 * @generated
	 */
  double getExposure();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter#getExposure <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure</em>' attribute.
	 * @see #getExposure()
	 * @generated
	 */
  void setExposure(double value);

} // ExposureFilter
