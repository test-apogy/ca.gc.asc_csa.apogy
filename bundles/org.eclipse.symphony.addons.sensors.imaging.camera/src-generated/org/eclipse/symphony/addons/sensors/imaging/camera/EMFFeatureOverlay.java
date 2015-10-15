/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.symphony.core.invocator.VariableFeatureReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Feature Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReference <em>Variable Feature Reference</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getNumberFormat <em>Number Format</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReferenceChangeCount <em>Variable Feature Reference Change Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getEMFFeatureOverlay()
 * @model
 * @generated
 */
public interface EMFFeatureOverlay extends AbstractTextOverlay
{
  /**
	 * Returns the value of the '<em><b>Variable Feature Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Feature Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Feature Reference</em>' containment reference.
	 * @see #setVariableFeatureReference(VariableFeatureReference)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getEMFFeatureOverlay_VariableFeatureReference()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  VariableFeatureReference getVariableFeatureReference();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReference <em>Variable Feature Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Feature Reference</em>' containment reference.
	 * @see #getVariableFeatureReference()
	 * @generated
	 */
  void setVariableFeatureReference(VariableFeatureReference value);

  /**
	 * Returns the value of the '<em><b>Number Format</b></em>' attribute.
	 * The default value is <code>"0.00"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The number format to use when displaying a Number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Format</em>' attribute.
	 * @see #setNumberFormat(String)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getEMFFeatureOverlay_NumberFormat()
	 * @model default="0.00" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FONT_PROPERTIES'"
	 * @generated
	 */
  String getNumberFormat();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getNumberFormat <em>Number Format</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Format</em>' attribute.
	 * @see #getNumberFormat()
	 * @generated
	 */
  void setNumberFormat(String value);

		/**
	 * Returns the value of the '<em><b>Variable Feature Reference Change Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Attribute used to trigger an overlay update when changes in the VariableFeatureReference are made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Feature Reference Change Count</em>' attribute.
	 * @see #setVariableFeatureReferenceChangeCount(long)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getEMFFeatureOverlay_VariableFeatureReferenceChangeCount()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	long getVariableFeatureReferenceChangeCount();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReferenceChangeCount <em>Variable Feature Reference Change Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Feature Reference Change Count</em>' attribute.
	 * @see #getVariableFeatureReferenceChangeCount()
	 * @generated
	 */
	void setVariableFeatureReferenceChangeCount(long value);

} // EMFFeatureOverlay
