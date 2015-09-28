/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.eclipse.images.core.EImagesUtilities;
import ca.gc.asc_csa.symphony.tools.camera.InvertFilter;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invert Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InvertFilterImpl extends ImageFilterImpl implements InvertFilter
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected InvertFilterImpl()
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
		return SymphonyCameraToolsPackage.Literals.INVERT_FILTER;
	}
  
  @Override
  public AbstractEImage filter(AbstractCamera camera,	AbstractEImage cameraImage) 
  {
	  return EImagesUtilities.INSTANCE.applyInvertFilter(cameraImage);
  }
} //InvertFilterImpl
