/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.images.core.ros;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.ImageData;
import org.ros.node.ConnectedNode;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;
import ca.gc.asc_csa.eclipse.images.core.EImage;
import ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSPackage#getImagesCoreROSFacade()
 * @model
 * @generated
 */
public interface ImagesCoreROSFacade extends EObject
{

  public static final ImagesCoreROSFacade INSTANCE = ImagesCoreROSFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" rosImageDataType="ca.gc.asc_csa.eclipse.images.core.ros.Image" rosImageUnique="false"
	 * @generated
	 */
  EImage convertToEImage(Image rosImage);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" compressedImageDataType="ca.gc.asc_csa.eclipse.images.core.ros.CompressedImage" compressedImageUnique="false"
	 * @generated
	 */
  EImage convertToEImage(CompressedImage compressedImage);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.images.core.ros.CompressedImage" unique="false" eImageUnique="false" connectedNodeDataType="ca.gc.asc_csa.eclipse.images.core.ros.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
  CompressedImage convertToCompressedImage(EImage eImage, ConnectedNode connectedNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.images.core.ros.CompressedImage" unique="false" imageDataDataType="ca.gc.asc_csa.eclipse.images.core.ImageData" imageDataUnique="false" connectedNodeDataType="ca.gc.asc_csa.eclipse.images.core.ros.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
  CompressedImage convertToCompressedImage(ImageData imageData, ConnectedNode connectedNode);
} // ImagesCoreROSFacade
