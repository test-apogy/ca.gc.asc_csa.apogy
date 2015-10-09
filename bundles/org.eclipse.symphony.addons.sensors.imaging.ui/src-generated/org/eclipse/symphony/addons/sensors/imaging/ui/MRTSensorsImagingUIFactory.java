/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIPackage
 * @generated
 */
public interface MRTSensorsImagingUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MRTSensorsImagingUIFactory eINSTANCE = org.eclipse.symphony.addons.sensors.imaging.ui.impl.MRTSensorsImagingUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Image Snapshot Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Snapshot Presentation</em>'.
	 * @generated
	 */
  ImageSnapshotPresentation createImageSnapshotPresentation();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  MRTSensorsImagingUIPackage getMRTSensorsImagingUIPackage();

} //MRTSensorsImagingUIFactory