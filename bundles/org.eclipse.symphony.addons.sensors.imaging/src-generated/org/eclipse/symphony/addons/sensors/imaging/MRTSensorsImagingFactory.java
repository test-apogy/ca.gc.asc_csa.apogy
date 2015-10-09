/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage
 * @generated
 */
public interface MRTSensorsImagingFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MRTSensorsImagingFactory eINSTANCE = org.eclipse.symphony.addons.sensors.imaging.impl.MRTSensorsImagingFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Image Snapshot</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Snapshot</em>'.
	 * @generated
	 */
  ImageSnapshot createImageSnapshot();

  /**
	 * Returns a new object of class '<em>Rectified Image Snapshot</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectified Image Snapshot</em>'.
	 * @generated
	 */
  RectifiedImageSnapshot createRectifiedImageSnapshot();

  /**
	 * Returns a new object of class '<em>Imaging Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Utilities</em>'.
	 * @generated
	 */
	ImagingUtilities createImagingUtilities();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  MRTSensorsImagingPackage getMRTSensorsImagingPackage();

} //MRTSensorsImagingFactory
