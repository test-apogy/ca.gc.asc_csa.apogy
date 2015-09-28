/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage;
import ca.gc.space.mrt.sensors.imaging.RectifiedImageSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectified Image Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RectifiedImageSnapshotImpl extends ImageSnapshotImpl implements RectifiedImageSnapshot
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RectifiedImageSnapshotImpl()
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
		return MRTSensorsImagingPackage.Literals.RECTIFIED_IMAGE_SNAPSHOT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractEImage getRectifiedImage()
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
			case MRTSensorsImagingPackage.RECTIFIED_IMAGE_SNAPSHOT___GET_RECTIFIED_IMAGE:
				return getRectifiedImage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RectifiedImageSnapshotImpl
