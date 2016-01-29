/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.DrawnCameraOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.OverlayAlignment;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drawn Camera Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DrawnCameraOverlayImpl extends CameraOverlayImpl implements DrawnCameraOverlay
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DrawnCameraOverlayImpl()
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
		return ApogyAddonsSensorsImagingCameraPackage.Literals.DRAWN_CAMERA_OVERLAY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractEImage applyOverlay(AbstractCamera camera, AbstractEImage cameraImage, OverlayAlignment overlayAlignment, int overlayWidth, int overlayHeight)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyAddonsSensorsImagingCameraPackage.DRAWN_CAMERA_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT:
				return applyOverlay((AbstractCamera)arguments.get(0), (AbstractEImage)arguments.get(1), (OverlayAlignment)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DrawnCameraOverlayImpl