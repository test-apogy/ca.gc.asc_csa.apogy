/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.imaging.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.symphony.addons.ros.imaging.Symphony__AddonsROSImagingFacade;
import org.eclipse.symphony.addons.ros.imaging.Symphony__AddonsROSImagingFactory;
import org.eclipse.symphony.addons.ros.imaging.Symphony__AddonsROSImagingPackage;

import org.eclipse.symphony.common.images.Symphony__CommonImagesPackage;

import org.ros.node.ConnectedNode;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsROSImagingPackageImpl extends EPackageImpl implements Symphony__AddonsROSImagingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__AddonsROSImagingFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compressedImageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectedNodeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.addons.ros.imaging.Symphony__AddonsROSImagingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__AddonsROSImagingPackageImpl() {
		super(eNS_URI, Symphony__AddonsROSImagingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Symphony__AddonsROSImagingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__AddonsROSImagingPackage init() {
		if (isInited) return (Symphony__AddonsROSImagingPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__AddonsROSImagingPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__AddonsROSImagingPackageImpl theSymphony__AddonsROSImagingPackage = (Symphony__AddonsROSImagingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__AddonsROSImagingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__AddonsROSImagingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonImagesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__AddonsROSImagingPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__AddonsROSImagingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__AddonsROSImagingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__AddonsROSImagingPackage.eNS_URI, theSymphony__AddonsROSImagingPackage);
		return theSymphony__AddonsROSImagingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__AddonsROSImagingFacade() {
		return symphony__AddonsROSImagingFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsROSImagingFacade__ConvertToEImage__Image() {
		return symphony__AddonsROSImagingFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsROSImagingFacade__ConvertToEImage__CompressedImage() {
		return symphony__AddonsROSImagingFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsROSImagingFacade__ConvertToCompressedImage__EImage_ConnectedNode() {
		return symphony__AddonsROSImagingFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__AddonsROSImagingFacade__ConvertToCompressedImage__ImageData_ConnectedNode() {
		return symphony__AddonsROSImagingFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImage() {
		return imageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompressedImage() {
		return compressedImageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectedNode() {
		return connectedNodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSImagingFactory getSymphony__AddonsROSImagingFactory() {
		return (Symphony__AddonsROSImagingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		symphony__AddonsROSImagingFacadeEClass = createEClass(SYMPHONY_ADDONS_ROS_IMAGING_FACADE);
		createEOperation(symphony__AddonsROSImagingFacadeEClass, SYMPHONY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__IMAGE);
		createEOperation(symphony__AddonsROSImagingFacadeEClass, SYMPHONY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE);
		createEOperation(symphony__AddonsROSImagingFacadeEClass, SYMPHONY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE);
		createEOperation(symphony__AddonsROSImagingFacadeEClass, SYMPHONY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE);

		// Create data types
		imageEDataType = createEDataType(IMAGE);
		compressedImageEDataType = createEDataType(COMPRESSED_IMAGE);
		connectedNodeEDataType = createEDataType(CONNECTED_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Symphony__CommonImagesPackage theSymphony__CommonImagesPackage = (Symphony__CommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonImagesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__AddonsROSImagingFacadeEClass, Symphony__AddonsROSImagingFacade.class, "Symphony__AddonsROSImagingFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__AddonsROSImagingFacade__ConvertToEImage__Image(), theSymphony__CommonImagesPackage.getEImage(), "convertToEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImage(), "rosImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsROSImagingFacade__ConvertToEImage__CompressedImage(), theSymphony__CommonImagesPackage.getEImage(), "convertToEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompressedImage(), "compressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsROSImagingFacade__ConvertToCompressedImage__EImage_ConnectedNode(), this.getCompressedImage(), "convertToCompressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonImagesPackage.getEImage(), "eImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__AddonsROSImagingFacade__ConvertToCompressedImage__ImageData_ConnectedNode(), this.getCompressedImage(), "convertToCompressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonImagesPackage.getImageData(), "imageData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(imageEDataType, Image.class, "Image", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(compressedImageEDataType, CompressedImage.class, "CompressedImage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectedNodeEDataType, ConnectedNode.class, "ConnectedNode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__AddonsROSImagingPackageImpl
