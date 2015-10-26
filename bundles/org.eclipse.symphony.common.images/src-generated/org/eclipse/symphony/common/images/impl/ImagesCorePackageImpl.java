/**
 * Canadian Space Agency 2011
 */
package org.eclipse.symphony.common.images.impl;

import java.awt.image.BufferedImage;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.AbstractEImageProvider;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ImageAlignment;
import org.eclipse.symphony.common.images.ImageSize;
import org.eclipse.symphony.common.images.ImagesAlbum;
import org.eclipse.symphony.common.images.ImagesCoreFactory;
import org.eclipse.symphony.common.images.ImagesCorePackage;
import org.eclipse.symphony.common.images.URLEImage;

import java.awt.Color;
import java.awt.Font;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagesCorePackageImpl extends EPackageImpl implements ImagesCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagesAlbumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urleImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eImagesUtilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEImageProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imageAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageDataEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bufferedImageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontEDataType = null;

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
	 * @see org.eclipse.symphony.common.images.ImagesCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImagesCorePackageImpl() {
		super(eNS_URI, ImagesCoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImagesCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImagesCorePackage init() {
		if (isInited) return (ImagesCorePackage)EPackage.Registry.INSTANCE.getEPackage(ImagesCorePackage.eNS_URI);

		// Obtain or create and register package
		ImagesCorePackageImpl theImagesCorePackage = (ImagesCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImagesCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImagesCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theImagesCorePackage.createPackageContents();

		// Initialize created meta-data
		theImagesCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImagesCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImagesCorePackage.eNS_URI, theImagesCorePackage);
		return theImagesCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagesAlbum() {
		return imagesAlbumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagesAlbum_Images() {
		return (EReference)imagesAlbumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEImage() {
		return eImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEImage_ImageContent() {
		return (EAttribute)eImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEImage() {
		return abstractEImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEImage_Width() {
		return (EAttribute)abstractEImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEImage_Height() {
		return (EAttribute)abstractEImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEImage__AsBufferedImage() {
		return abstractEImageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLEImage() {
		return urleImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLEImage_Url() {
		return (EAttribute)urleImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEImagesUtilities() {
		return eImagesUtilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__Copy__AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ConvertToGrayScale__AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__Resize__AbstractEImage_double() {
		return eImagesUtilitiesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__Resize__AbstractEImage_double_double() {
		return eImagesUtilitiesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__Resize__AbstractEImage_int_int() {
		return eImagesUtilitiesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__CreateTransparentImage__int_int() {
		return eImagesUtilitiesEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__SaveImageAsJPEG__String_AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__SaveImageAsPNG__String_AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyOverlay__AbstractEImage_AbstractEImage_boolean() {
		return eImagesUtilitiesEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__FlipHorizontal__AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__FlipVertical__AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__Rotate__AbstractEImage_double_boolean() {
		return eImagesUtilitiesEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__Translate__AbstractEImage_int_int() {
		return eImagesUtilitiesEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__GetAllEncompassingImageSize__List() {
		return eImagesUtilitiesEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__SuperPoseImages__List_boolean_ImageAlignment() {
		return eImagesUtilitiesEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__SuperPoseImages__AbstractEImage_AbstractEImage_boolean_ImageAlignment() {
		return eImagesUtilitiesEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__AddBorder__AbstractEImage_int_int_int_int() {
		return eImagesUtilitiesEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__GetSubImage__AbstractEImage_int_int_int_int() {
		return eImagesUtilitiesEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ConvertToBufferedImage__ImageData() {
		return eImagesUtilitiesEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ConvertToImageData__BufferedImage() {
		return eImagesUtilitiesEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__CreateUniformColorImage__int_int_int_int_int_int() {
		return eImagesUtilitiesEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyAlpha__AbstractEImage_float() {
		return eImagesUtilitiesEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyEdgeFilter__AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyContrastAndBrightnessFilter__AbstractEImage_double_double() {
		return eImagesUtilitiesEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyExposureFilter__AbstractEImage_double() {
		return eImagesUtilitiesEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyInvertFilter__AbstractEImage() {
		return eImagesUtilitiesEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyRescaleFilter__AbstractEImage_double() {
		return eImagesUtilitiesEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__ApplyGainFilter__AbstractEImage_double_double() {
		return eImagesUtilitiesEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEImagesUtilities__CreateTextImage__String_Font_Color_Color_int() {
		return eImagesUtilitiesEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageSize() {
		return imageSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageSize_Width() {
		return (EAttribute)imageSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageSize_Height() {
		return (EAttribute)imageSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEImageProvider() {
		return abstractEImageProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractEImageProvider__GetAbstractEImage() {
		return abstractEImageProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImageAlignment() {
		return imageAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagesAlbum_Name() {
		return (EAttribute)imagesAlbumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImageData() {
		return imageDataEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBufferedImage() {
		return bufferedImageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFont() {
		return fontEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagesCoreFactory getImagesCoreFactory() {
		return (ImagesCoreFactory)getEFactoryInstance();
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
		eImageEClass = createEClass(EIMAGE);
		createEAttribute(eImageEClass, EIMAGE__IMAGE_CONTENT);

		imagesAlbumEClass = createEClass(IMAGES_ALBUM);
		createEAttribute(imagesAlbumEClass, IMAGES_ALBUM__NAME);
		createEReference(imagesAlbumEClass, IMAGES_ALBUM__IMAGES);

		abstractEImageEClass = createEClass(ABSTRACT_EIMAGE);
		createEAttribute(abstractEImageEClass, ABSTRACT_EIMAGE__WIDTH);
		createEAttribute(abstractEImageEClass, ABSTRACT_EIMAGE__HEIGHT);
		createEOperation(abstractEImageEClass, ABSTRACT_EIMAGE___AS_BUFFERED_IMAGE);

		urleImageEClass = createEClass(URLE_IMAGE);
		createEAttribute(urleImageEClass, URLE_IMAGE__URL);

		eImagesUtilitiesEClass = createEClass(EIMAGES_UTILITIES);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___COPY__ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___CONVERT_TO_GRAY_SCALE__ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE_DOUBLE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_INT_INT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___CREATE_TRANSPARENT_IMAGE__INT_INT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___SAVE_IMAGE_AS_JPEG__STRING_ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___SAVE_IMAGE_AS_PNG__STRING_ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_OVERLAY__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___FLIP_HORIZONTAL__ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___FLIP_VERTICAL__ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___ROTATE__ABSTRACTEIMAGE_DOUBLE_BOOLEAN);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___TRANSLATE__ABSTRACTEIMAGE_INT_INT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___GET_ALL_ENCOMPASSING_IMAGE_SIZE__LIST);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___SUPER_POSE_IMAGES__LIST_BOOLEAN_IMAGEALIGNMENT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___SUPER_POSE_IMAGES__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN_IMAGEALIGNMENT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___ADD_BORDER__ABSTRACTEIMAGE_INT_INT_INT_INT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___GET_SUB_IMAGE__ABSTRACTEIMAGE_INT_INT_INT_INT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___CONVERT_TO_BUFFERED_IMAGE__IMAGEDATA);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___CONVERT_TO_IMAGE_DATA__BUFFEREDIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___CREATE_UNIFORM_COLOR_IMAGE__INT_INT_INT_INT_INT_INT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_ALPHA__ABSTRACTEIMAGE_FLOAT);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_EDGE_FILTER__ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_CONTRAST_AND_BRIGHTNESS_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_EXPOSURE_FILTER__ABSTRACTEIMAGE_DOUBLE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_INVERT_FILTER__ABSTRACTEIMAGE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_RESCALE_FILTER__ABSTRACTEIMAGE_DOUBLE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___APPLY_GAIN_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE);
		createEOperation(eImagesUtilitiesEClass, EIMAGES_UTILITIES___CREATE_TEXT_IMAGE__STRING_FONT_COLOR_COLOR_INT);

		imageSizeEClass = createEClass(IMAGE_SIZE);
		createEAttribute(imageSizeEClass, IMAGE_SIZE__WIDTH);
		createEAttribute(imageSizeEClass, IMAGE_SIZE__HEIGHT);

		abstractEImageProviderEClass = createEClass(ABSTRACT_EIMAGE_PROVIDER);
		createEOperation(abstractEImageProviderEClass, ABSTRACT_EIMAGE_PROVIDER___GET_ABSTRACT_EIMAGE);

		// Create enums
		imageAlignmentEEnum = createEEnum(IMAGE_ALIGNMENT);

		// Create data types
		listEDataType = createEDataType(LIST);
		imageDataEDataType = createEDataType(IMAGE_DATA);
		bufferedImageEDataType = createEDataType(BUFFERED_IMAGE);
		exceptionEDataType = createEDataType(EXCEPTION);
		colorEDataType = createEDataType(COLOR);
		fontEDataType = createEDataType(FONT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		eImageEClass.getESuperTypes().add(this.getAbstractEImage());
		urleImageEClass.getESuperTypes().add(this.getAbstractEImage());

		// Initialize classes, features, and operations; add parameters
		initEClass(eImageEClass, EImage.class, "EImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEImage_ImageContent(), this.getBufferedImage(), "imageContent", null, 0, 1, EImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagesAlbumEClass, ImagesAlbum.class, "ImagesAlbum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagesAlbum_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ImagesAlbum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImagesAlbum_Images(), this.getAbstractEImage(), null, "images", null, 0, -1, ImagesAlbum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEImageEClass, AbstractEImage.class, "AbstractEImage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractEImage_Width(), theEcorePackage.getEInt(), "width", "-1", 0, 1, AbstractEImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractEImage_Height(), theEcorePackage.getEInt(), "height", "-1", 0, 1, AbstractEImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractEImage__AsBufferedImage(), this.getBufferedImage(), "asBufferedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(urleImageEClass, URLEImage.class, "URLEImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLEImage_Url(), theEcorePackage.getEString(), "url", null, 0, 1, URLEImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eImagesUtilitiesEClass, EImagesUtilities.class, "EImagesUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEImagesUtilities__Copy__AbstractEImage(), this.getAbstractEImage(), "copy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 1, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ConvertToGrayScale__AbstractEImage(), this.getAbstractEImage(), "convertToGrayScale", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__Resize__AbstractEImage_double(), this.getAbstractEImage(), "resize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "scaleFactor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__Resize__AbstractEImage_double_double(), this.getAbstractEImage(), "resize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "widthScaleFactor", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "heightScaleFactor", 1, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__Resize__AbstractEImage_int_int(), this.getAbstractEImage(), "resize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "newWidth", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "newHeight", 1, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__CreateTransparentImage__int_int(), this.getAbstractEImage(), "createTransparentImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "width", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "height", 1, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__SaveImageAsJPEG__String_AbstractEImage(), null, "saveImageAsJPEG", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "destinationFilePath", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "image", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEImagesUtilities__SaveImageAsPNG__String_AbstractEImage(), null, "saveImageAsPNG", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "destinationFilePath", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "image", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEImagesUtilities__ApplyOverlay__AbstractEImage_AbstractEImage_boolean(), this.getAbstractEImage(), "applyOverlay", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "overlayImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "allowOverlayResize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__FlipHorizontal__AbstractEImage(), this.getAbstractEImage(), "flipHorizontal", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__FlipVertical__AbstractEImage(), this.getAbstractEImage(), "flipVertical", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__Rotate__AbstractEImage_double_boolean(), this.getAbstractEImage(), "rotate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "enableImageResize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__Translate__AbstractEImage_int_int(), this.getAbstractEImage(), "translate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "widthTranslation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "heightTranslation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__GetAllEncompassingImageSize__List(), this.getImageSize(), "getAllEncompassingImageSize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getAbstractEImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "images", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__SuperPoseImages__List_boolean_ImageAlignment(), this.getAbstractEImage(), "superPoseImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getAbstractEImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "images", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "allowImageResize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageAlignment(), "alignment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__SuperPoseImages__AbstractEImage_AbstractEImage_boolean_ImageAlignment(), this.getAbstractEImage(), "superPoseImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "imageA", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "imageB", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "allowImageResize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageAlignment(), "alignment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__AddBorder__AbstractEImage_int_int_int_int(), this.getAbstractEImage(), "addBorder", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "borderWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "red", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "green", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "blue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__GetSubImage__AbstractEImage_int_int_int_int(), this.getAbstractEImage(), "getSubImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "widthOffset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "heightOffset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "subImageWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "subImageHeight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getEImagesUtilities__ConvertToBufferedImage__ImageData(), this.getBufferedImage(), "convertToBufferedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageData(), "imageData", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ConvertToImageData__BufferedImage(), this.getImageData(), "convertToImageData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedImage(), "bufferedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__CreateUniformColorImage__int_int_int_int_int_int(), this.getAbstractEImage(), "createUniformColorImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "width", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "height", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "red", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "green", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "blue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "alpha", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ApplyAlpha__AbstractEImage_float(), this.getAbstractEImage(), "applyAlpha", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "alpha", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ApplyEdgeFilter__AbstractEImage(), this.getAbstractEImage(), "applyEdgeFilter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ApplyContrastAndBrightnessFilter__AbstractEImage_double_double(), this.getAbstractEImage(), "applyContrastAndBrightnessFilter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "contrast", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "brightness", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ApplyExposureFilter__AbstractEImage_double(), this.getAbstractEImage(), "applyExposureFilter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "exposure", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ApplyInvertFilter__AbstractEImage(), this.getAbstractEImage(), "applyInvertFilter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ApplyRescaleFilter__AbstractEImage_double(), this.getAbstractEImage(), "applyRescaleFilter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "scale", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__ApplyGainFilter__AbstractEImage_double_double(), this.getAbstractEImage(), "applyGainFilter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractEImage(), "originalImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "gain", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "bias", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEImagesUtilities__CreateTextImage__String_Font_Color_Color_int(), this.getAbstractEImage(), "createTextImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "text", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFont(), "font", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColor(), "textColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColor(), "backgroundColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "borderWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imageSizeEClass, ImageSize.class, "ImageSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageSize_Width(), theEcorePackage.getEInt(), "width", "-1", 0, 1, ImageSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageSize_Height(), theEcorePackage.getEInt(), "height", "-1", 0, 1, ImageSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEImageProviderEClass, AbstractEImageProvider.class, "AbstractEImageProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractEImageProvider__GetAbstractEImage(), this.getAbstractEImage(), "getAbstractEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(imageAlignmentEEnum, ImageAlignment.class, "ImageAlignment");
		addEEnumLiteral(imageAlignmentEEnum, ImageAlignment.CENTER);
		addEEnumLiteral(imageAlignmentEEnum, ImageAlignment.LOWER_LEFT_CORNER);
		addEEnumLiteral(imageAlignmentEEnum, ImageAlignment.UPPER_LEFT_CORNER);
		addEEnumLiteral(imageAlignmentEEnum, ImageAlignment.LOWER_RIGHT_CORNER);
		addEEnumLiteral(imageAlignmentEEnum, ImageAlignment.UPPER_RIGHT_CORNER);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(imageDataEDataType, ImageData.class, "ImageData", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bufferedImageEDataType, BufferedImage.class, "BufferedImage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fontEDataType, Font.class, "Font", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "ImagesCore",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)",
			 "modelName", "ImagesCore",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.images/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.images.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.common"
		   });	
		addAnnotation
		  (getAbstractEImage_Width(), 
		   source, 
		   new String[] {
			 "propertyCategory", "IMAGE_INFORMATION"
		   });	
		addAnnotation
		  (getAbstractEImage_Height(), 
		   source, 
		   new String[] {
			 "propertyCategory", "IMAGE_INFORMATION"
		   });	
		addAnnotation
		  (getEImagesUtilities__GetSubImage__AbstractEImage_int_int_int_int(), 
		   source, 
		   new String[] {
			 "documentation", "Gets a sub image from a specified image. Note that the\nwidthOffset and heightOffset are relative to the upper\nleft corner of the image."
		   });
	}

} //ImagesCorePackageImpl
