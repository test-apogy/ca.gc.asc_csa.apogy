/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zoomable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.Zoomable#getCurrentZoom <em>Current Zoom</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.Zoomable#getCommandedZoom <em>Commanded Zoom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage#getZoomable()
 * @model abstract="true"
 * @generated
 */
public interface Zoomable extends EObject
{
  /**
	 * Returns the value of the '<em><b>Current Zoom</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Zoom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The current value of the zoom.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Zoom</em>' attribute.
	 * @see #setCurrentZoom(double)
	 * @see org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage#getZoomable_CurrentZoom()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ZOOMABLE_PROPERTIES'"
	 * @generated
	 */
  double getCurrentZoom();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.Zoomable#getCurrentZoom <em>Current Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Zoom</em>' attribute.
	 * @see #getCurrentZoom()
	 * @generated
	 */
  void setCurrentZoom(double value);

  /**
	 * Returns the value of the '<em><b>Commanded Zoom</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commanded Zoom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The commanded value of the zoom.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commanded Zoom</em>' attribute.
	 * @see #setCommandedZoom(double)
	 * @see org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage#getZoomable_CommandedZoom()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ZOOMABLE_PROPERTIES'"
	 * @generated
	 */
  double getCommandedZoom();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.Zoomable#getCommandedZoom <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Zoom</em>' attribute.
	 * @see #getCommandedZoom()
	 * @generated
	 */
  void setCommandedZoom(double value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Command the camera zoom.
	 * @param newZoom The commanded zoom.
	 * <!-- end-model-doc -->
	 * @model unique="false" newZoomUnique="false"
	 * @generated
	 */
  boolean commandZoom(double newZoom);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the minimum zoom value that can be commanded.
	 * @return The minimum zoom value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  double getMinimumZoom();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the maximum zoom value that can be commanded.
	 * @return The maximum zoom value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  double getMaximumZoom();

} // Zoomable
