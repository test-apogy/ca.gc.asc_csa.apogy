/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.imaging;

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
 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsROSImaging' modelName='ApogyAddonsROSImaging' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelDirectory='/ca.gc.asc_csa.apogy.addons.ros.imaging/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.ros.imaging.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.ros'"
 * @generated
 */
public interface ApogyAddonsROSImagingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imaging";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.ros.imaging";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imaging";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsROSImagingPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingFacadeImpl
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getApogyAddonsROSImagingFacade()
	 * @generated
	 */
	int APOGY_ADDONS_ROS_IMAGING_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_IMAGING_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Convert To EImage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__IMAGE = 0;

	/**
	 * The operation id for the '<em>Convert To EImage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE = 1;

	/**
	 * The operation id for the '<em>Convert To Compressed Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE = 2;

	/**
	 * The operation id for the '<em>Convert To Compressed Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE = 3;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_ROS_IMAGING_FACADE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensor_msgs.Image
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 1;

	/**
	 * The meta object id for the '<em>Compressed Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensor_msgs.CompressedImage
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getCompressedImage()
	 * @generated
	 */
	int COMPRESSED_IMAGE = 2;

	/**
	 * The meta object id for the '<em>Connected Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.node.ConnectedNode
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getConnectedNode()
	 * @generated
	 */
	int CONNECTED_NODE = 3;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade
	 * @generated
	 */
	EClass getApogyAddonsROSImagingFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToEImage(sensor_msgs.Image) <em>Convert To EImage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To EImage</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToEImage(sensor_msgs.Image)
	 * @generated
	 */
	EOperation getApogyAddonsROSImagingFacade__ConvertToEImage__Image();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToEImage(sensor_msgs.CompressedImage) <em>Convert To EImage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To EImage</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToEImage(sensor_msgs.CompressedImage)
	 * @generated
	 */
	EOperation getApogyAddonsROSImagingFacade__ConvertToEImage__CompressedImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToCompressedImage(ca.gc.asc_csa.apogy.common.images.EImage, org.ros.node.ConnectedNode) <em>Convert To Compressed Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Compressed Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToCompressedImage(ca.gc.asc_csa.apogy.common.images.EImage, org.ros.node.ConnectedNode)
	 * @generated
	 */
	EOperation getApogyAddonsROSImagingFacade__ConvertToCompressedImage__EImage_ConnectedNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToCompressedImage(org.eclipse.swt.graphics.ImageData, org.ros.node.ConnectedNode) <em>Convert To Compressed Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Compressed Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade#convertToCompressedImage(org.eclipse.swt.graphics.ImageData, org.ros.node.ConnectedNode)
	 * @generated
	 */
	EOperation getApogyAddonsROSImagingFacade__ConvertToCompressedImage__ImageData_ConnectedNode();

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
	ApogyAddonsROSImagingFactory getApogyAddonsROSImagingFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingFacadeImpl
		 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getApogyAddonsROSImagingFacade()
		 * @generated
		 */
		EClass APOGY_ADDONS_ROS_IMAGING_FACADE = eINSTANCE.getApogyAddonsROSImagingFacade();

		/**
		 * The meta object literal for the '<em><b>Convert To EImage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__IMAGE = eINSTANCE.getApogyAddonsROSImagingFacade__ConvertToEImage__Image();

		/**
		 * The meta object literal for the '<em><b>Convert To EImage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE = eINSTANCE.getApogyAddonsROSImagingFacade__ConvertToEImage__CompressedImage();

		/**
		 * The meta object literal for the '<em><b>Convert To Compressed Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE = eINSTANCE.getApogyAddonsROSImagingFacade__ConvertToCompressedImage__EImage_ConnectedNode();

		/**
		 * The meta object literal for the '<em><b>Convert To Compressed Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE = eINSTANCE.getApogyAddonsROSImagingFacade__ConvertToCompressedImage__ImageData_ConnectedNode();

		/**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensor_msgs.Image
		 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getImage()
		 * @generated
		 */
		EDataType IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em>Compressed Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sensor_msgs.CompressedImage
		 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getCompressedImage()
		 * @generated
		 */
		EDataType COMPRESSED_IMAGE = eINSTANCE.getCompressedImage();

		/**
		 * The meta object literal for the '<em>Connected Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.node.ConnectedNode
		 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingPackageImpl#getConnectedNode()
		 * @generated
		 */
		EDataType CONNECTED_NODE = eINSTANCE.getConnectedNode();

	}

} //ApogyAddonsROSImagingPackage
