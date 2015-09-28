/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.images.core.ros.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ros.node.ConnectedNode;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;
import ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage;
import ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade;
import ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFactory;
import ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagesCoreROSPackageImpl extends EPackageImpl implements ImagesCoreROSPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imagesCoreROSFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ImagesCoreROSPackageImpl()
  {
		super(eNS_URI, ImagesCoreROSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImagesCoreROSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ImagesCoreROSPackage init()
  {
		if (isInited) return (ImagesCoreROSPackage)EPackage.Registry.INSTANCE.getEPackage(ImagesCoreROSPackage.eNS_URI);

		// Obtain or create and register package
		ImagesCoreROSPackageImpl theImagesCoreROSPackage = (ImagesCoreROSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImagesCoreROSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImagesCoreROSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ImagesCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theImagesCoreROSPackage.createPackageContents();

		// Initialize created meta-data
		theImagesCoreROSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImagesCoreROSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImagesCoreROSPackage.eNS_URI, theImagesCoreROSPackage);
		return theImagesCoreROSPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getImagesCoreROSFacade()
  {
		return imagesCoreROSFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getImagesCoreROSFacade__ConvertToEImage__Image()
  {
		return imagesCoreROSFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getImagesCoreROSFacade__ConvertToEImage__CompressedImage()
  {
		return imagesCoreROSFacadeEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getImagesCoreROSFacade__ConvertToCompressedImage__EImage_ConnectedNode()
  {
		return imagesCoreROSFacadeEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getImagesCoreROSFacade__ConvertToCompressedImage__ImageData_ConnectedNode()
  {
		return imagesCoreROSFacadeEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getImage()
  {
		return imageEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getCompressedImage()
  {
		return compressedImageEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getConnectedNode()
  {
		return connectedNodeEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImagesCoreROSFactory getImagesCoreROSFactory()
  {
		return (ImagesCoreROSFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		imagesCoreROSFacadeEClass = createEClass(IMAGES_CORE_ROS_FACADE);
		createEOperation(imagesCoreROSFacadeEClass, IMAGES_CORE_ROS_FACADE___CONVERT_TO_EIMAGE__IMAGE);
		createEOperation(imagesCoreROSFacadeEClass, IMAGES_CORE_ROS_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE);
		createEOperation(imagesCoreROSFacadeEClass, IMAGES_CORE_ROS_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE);
		createEOperation(imagesCoreROSFacadeEClass, IMAGES_CORE_ROS_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE);

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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ImagesCorePackage theImagesCorePackage = (ImagesCorePackage)EPackage.Registry.INSTANCE.getEPackage(ImagesCorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(imagesCoreROSFacadeEClass, ImagesCoreROSFacade.class, "ImagesCoreROSFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getImagesCoreROSFacade__ConvertToEImage__Image(), theImagesCorePackage.getEImage(), "convertToEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImage(), "rosImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImagesCoreROSFacade__ConvertToEImage__CompressedImage(), theImagesCorePackage.getEImage(), "convertToEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompressedImage(), "compressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImagesCoreROSFacade__ConvertToCompressedImage__EImage_ConnectedNode(), this.getCompressedImage(), "convertToCompressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theImagesCorePackage.getEImage(), "eImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImagesCoreROSFacade__ConvertToCompressedImage__ImageData_ConnectedNode(), this.getCompressedImage(), "convertToCompressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theImagesCorePackage.getImageData(), "imageData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(imageEDataType, Image.class, "Image", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(compressedImageEDataType, CompressedImage.class, "CompressedImage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectedNodeEDataType, ConnectedNode.class, "ConnectedNode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ImagesCoreROSPackageImpl
