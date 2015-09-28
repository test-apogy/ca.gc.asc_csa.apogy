/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.images.core.ros;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ImagesCoreROS' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)' modelName='ImagesCoreROS' modelDirectory='/ca.gc.asc_csa.eclipse.images.core.ros/src-generated' editDirectory='/ca.gc.asc_csa.eclipse.images.core.ros.edit/src-generated' basePackage='ca.gc.asc_csa.eclipse.images.core'"
 * @generated
 */
public interface ImagesCoreROSPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "ros";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.eclipse.images.core.ros";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "ros";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ImagesCoreROSPackage eINSTANCE = ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSFacadeImpl
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getImagesCoreROSFacade()
	 * @generated
	 */
  int IMAGES_CORE_ROS_FACADE = 0;

  /**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGES_CORE_ROS_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Convert To EImage</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGES_CORE_ROS_FACADE___CONVERT_TO_EIMAGE__IMAGE = 0;

  /**
	 * The operation id for the '<em>Convert To EImage</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGES_CORE_ROS_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE = 1;

  /**
	 * The operation id for the '<em>Convert To Compressed Image</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGES_CORE_ROS_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE = 2;

  /**
	 * The operation id for the '<em>Convert To Compressed Image</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGES_CORE_ROS_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE = 3;

  /**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGES_CORE_ROS_FACADE_OPERATION_COUNT = 4;


  /**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see sensor_msgs.Image
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getImage()
	 * @generated
	 */
  int IMAGE = 1;

  /**
	 * The meta object id for the '<em>Compressed Image</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see sensor_msgs.CompressedImage
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getCompressedImage()
	 * @generated
	 */
  int COMPRESSED_IMAGE = 2;

  /**
	 * The meta object id for the '<em>Connected Node</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.ros.node.ConnectedNode
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getConnectedNode()
	 * @generated
	 */
  int CONNECTED_NODE = 3;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade
	 * @generated
	 */
  EClass getImagesCoreROSFacade();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToEImage(sensor_msgs.Image) <em>Convert To EImage</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To EImage</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToEImage(sensor_msgs.Image)
	 * @generated
	 */
  EOperation getImagesCoreROSFacade__ConvertToEImage__Image();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToEImage(sensor_msgs.CompressedImage) <em>Convert To EImage</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To EImage</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToEImage(sensor_msgs.CompressedImage)
	 * @generated
	 */
  EOperation getImagesCoreROSFacade__ConvertToEImage__CompressedImage();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToCompressedImage(ca.gc.asc_csa.eclipse.images.core.EImage, org.ros.node.ConnectedNode) <em>Convert To Compressed Image</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Compressed Image</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToCompressedImage(ca.gc.asc_csa.eclipse.images.core.EImage, org.ros.node.ConnectedNode)
	 * @generated
	 */
  EOperation getImagesCoreROSFacade__ConvertToCompressedImage__EImage_ConnectedNode();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToCompressedImage(org.eclipse.swt.graphics.ImageData, org.ros.node.ConnectedNode) <em>Convert To Compressed Image</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Compressed Image</em>' operation.
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade#convertToCompressedImage(org.eclipse.swt.graphics.ImageData, org.ros.node.ConnectedNode)
	 * @generated
	 */
  EOperation getImagesCoreROSFacade__ConvertToCompressedImage__ImageData_ConnectedNode();

  /**
	 * Returns the meta object for data type '{@link sensor_msgs.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image</em>'.
	 * @see sensor_msgs.Image
	 * @model instanceClass="sensor_msgs.Image"
	 * @generated
	 */
  EDataType getImage();

  /**
	 * Returns the meta object for data type '{@link sensor_msgs.CompressedImage <em>Compressed Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compressed Image</em>'.
	 * @see sensor_msgs.CompressedImage
	 * @model instanceClass="sensor_msgs.CompressedImage"
	 * @generated
	 */
  EDataType getCompressedImage();

  /**
	 * Returns the meta object for data type '{@link org.ros.node.ConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Connected Node</em>'.
	 * @see org.ros.node.ConnectedNode
	 * @model instanceClass="org.ros.node.ConnectedNode"
	 * @generated
	 */
  EDataType getConnectedNode();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  ImagesCoreROSFactory getImagesCoreROSFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSFacadeImpl
		 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getImagesCoreROSFacade()
		 * @generated
		 */
    EClass IMAGES_CORE_ROS_FACADE = eINSTANCE.getImagesCoreROSFacade();
    /**
		 * The meta object literal for the '<em><b>Convert To EImage</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation IMAGES_CORE_ROS_FACADE___CONVERT_TO_EIMAGE__IMAGE = eINSTANCE.getImagesCoreROSFacade__ConvertToEImage__Image();
    /**
		 * The meta object literal for the '<em><b>Convert To EImage</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation IMAGES_CORE_ROS_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE = eINSTANCE.getImagesCoreROSFacade__ConvertToEImage__CompressedImage();
    /**
		 * The meta object literal for the '<em><b>Convert To Compressed Image</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation IMAGES_CORE_ROS_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE = eINSTANCE.getImagesCoreROSFacade__ConvertToCompressedImage__EImage_ConnectedNode();
    /**
		 * The meta object literal for the '<em><b>Convert To Compressed Image</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation IMAGES_CORE_ROS_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE = eINSTANCE.getImagesCoreROSFacade__ConvertToCompressedImage__ImageData_ConnectedNode();
    /**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see sensor_msgs.Image
		 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getImage()
		 * @generated
		 */
    EDataType IMAGE = eINSTANCE.getImage();
    /**
		 * The meta object literal for the '<em>Compressed Image</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see sensor_msgs.CompressedImage
		 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getCompressedImage()
		 * @generated
		 */
    EDataType COMPRESSED_IMAGE = eINSTANCE.getCompressedImage();
    /**
		 * The meta object literal for the '<em>Connected Node</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.ros.node.ConnectedNode
		 * @see ca.gc.asc_csa.eclipse.images.core.ros.impl.ImagesCoreROSPackageImpl#getConnectedNode()
		 * @generated
		 */
    EDataType CONNECTED_NODE = eINSTANCE.getConnectedNode();

  }

} //ImagesCoreROSPackage
