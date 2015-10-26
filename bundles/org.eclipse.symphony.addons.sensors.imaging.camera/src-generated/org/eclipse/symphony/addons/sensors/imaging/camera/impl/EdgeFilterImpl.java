/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.sensors.imaging.AbstractCamera;
import org.eclipse.symphony.addons.sensors.imaging.camera.EdgeFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EdgeFilterImpl extends ImageFilterImpl implements EdgeFilter
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EdgeFilterImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Symphony__AddonsSensorsImagingCameraPackage.Literals.EDGE_FILTER;
	}
  
  @Override
  public AbstractEImage filter(AbstractCamera camera,	AbstractEImage cameraImage) 
  {
	  return EImagesUtilities.INSTANCE.applyEdgeFilter(cameraImage);
  }

} //EdgeFilterImpl
