/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;

import ca.gc.asc_csa.symphony.tools.camera.EdgeFilter;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
		return SymphonyCameraToolsPackage.Literals.EDGE_FILTER;
	}
  
  @Override
  public AbstractEImage filter(AbstractCamera camera,	AbstractEImage cameraImage) 
  {
	  return EImagesUtilities.INSTANCE.applyEdgeFilter(cameraImage);
  }

} //EdgeFilterImpl
