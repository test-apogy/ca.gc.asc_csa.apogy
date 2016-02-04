package ca.gc.asc_csa.apogy.common.images;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca),
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonImages' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='ApogyCommonImages' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.common.images/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.images.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common'"
 * @generated
 */
public interface ApogyCommonImagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "images";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.images";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "images";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonImagesPackage eINSTANCE = ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage <em>Abstract EImage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImage
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getAbstractEImage()
	 * @generated
	 */
	int ABSTRACT_EIMAGE = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Abstract EImage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>As Buffered Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE___AS_BUFFERED_IMAGE = 0;

	/**
	 * The number of operations of the '<em>Abstract EImage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.impl.EImageImpl <em>EImage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.impl.EImageImpl
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getEImage()
	 * @generated
	 */
	int EIMAGE = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGE__WIDTH = ABSTRACT_EIMAGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGE__HEIGHT = ABSTRACT_EIMAGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Image Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGE__IMAGE_CONTENT = ABSTRACT_EIMAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EImage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGE_FEATURE_COUNT = ABSTRACT_EIMAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As Buffered Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGE___AS_BUFFERED_IMAGE = ABSTRACT_EIMAGE___AS_BUFFERED_IMAGE;

	/**
	 * The number of operations of the '<em>EImage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGE_OPERATION_COUNT = ABSTRACT_EIMAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.impl.ImagesAlbumImpl <em>Images Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ImagesAlbumImpl
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImagesAlbum()
	 * @generated
	 */
	int IMAGES_ALBUM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ALBUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ALBUM__IMAGES = 1;

	/**
	 * The number of structural features of the '<em>Images Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ALBUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Images Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGES_ALBUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.impl.URLEImageImpl <em>URLE Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.impl.URLEImageImpl
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getURLEImage()
	 * @generated
	 */
	int URLE_IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLE_IMAGE__WIDTH = ABSTRACT_EIMAGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLE_IMAGE__HEIGHT = ABSTRACT_EIMAGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLE_IMAGE__URL = ABSTRACT_EIMAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URLE Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLE_IMAGE_FEATURE_COUNT = ABSTRACT_EIMAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As Buffered Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLE_IMAGE___AS_BUFFERED_IMAGE = ABSTRACT_EIMAGE___AS_BUFFERED_IMAGE;

	/**
	 * The number of operations of the '<em>URLE Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLE_IMAGE_OPERATION_COUNT = ABSTRACT_EIMAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.impl.EImagesUtilitiesImpl <em>EImages Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.impl.EImagesUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getEImagesUtilities()
	 * @generated
	 */
	int EIMAGES_UTILITIES = 4;

	/**
	 * The number of structural features of the '<em>EImages Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___COPY__ABSTRACTEIMAGE = 0;

	/**
	 * The operation id for the '<em>Convert To Gray Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___CONVERT_TO_GRAY_SCALE__ABSTRACTEIMAGE = 1;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Resize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_INT_INT = 4;

	/**
	 * The operation id for the '<em>Create Transparent Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___CREATE_TRANSPARENT_IMAGE__INT_INT = 5;

	/**
	 * The operation id for the '<em>Save Image As JPEG</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___SAVE_IMAGE_AS_JPEG__STRING_ABSTRACTEIMAGE = 6;

	/**
	 * The operation id for the '<em>Save Image As PNG</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___SAVE_IMAGE_AS_PNG__STRING_ABSTRACTEIMAGE = 7;

	/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_OVERLAY__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN = 8;

	/**
	 * The operation id for the '<em>Flip Horizontal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___FLIP_HORIZONTAL__ABSTRACTEIMAGE = 9;

	/**
	 * The operation id for the '<em>Flip Vertical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___FLIP_VERTICAL__ABSTRACTEIMAGE = 10;

	/**
	 * The operation id for the '<em>Rotate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___ROTATE__ABSTRACTEIMAGE_DOUBLE_BOOLEAN = 11;

	/**
	 * The operation id for the '<em>Translate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___TRANSLATE__ABSTRACTEIMAGE_INT_INT = 12;

	/**
	 * The operation id for the '<em>Get All Encompassing Image Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___GET_ALL_ENCOMPASSING_IMAGE_SIZE__LIST = 13;

	/**
	 * The operation id for the '<em>Super Pose Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___SUPER_POSE_IMAGES__LIST_BOOLEAN_IMAGEALIGNMENT = 14;

	/**
	 * The operation id for the '<em>Super Pose Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___SUPER_POSE_IMAGES__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN_IMAGEALIGNMENT = 15;

	/**
	 * The operation id for the '<em>Add Border</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___ADD_BORDER__ABSTRACTEIMAGE_INT_INT_INT_INT = 16;

	/**
	 * The operation id for the '<em>Get Sub Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___GET_SUB_IMAGE__ABSTRACTEIMAGE_INT_INT_INT_INT = 17;

	/**
	 * The operation id for the '<em>Convert To Buffered Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___CONVERT_TO_BUFFERED_IMAGE__IMAGEDATA = 18;

	/**
	 * The operation id for the '<em>Convert To Image Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___CONVERT_TO_IMAGE_DATA__BUFFEREDIMAGE = 19;

	/**
	 * The operation id for the '<em>Create Uniform Color Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___CREATE_UNIFORM_COLOR_IMAGE__INT_INT_INT_INT_INT_INT = 20;

	/**
	 * The operation id for the '<em>Apply Alpha</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_ALPHA__ABSTRACTEIMAGE_FLOAT = 21;

	/**
	 * The operation id for the '<em>Apply Edge Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_EDGE_FILTER__ABSTRACTEIMAGE = 22;

	/**
	 * The operation id for the '<em>Apply Contrast And Brightness Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_CONTRAST_AND_BRIGHTNESS_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE = 23;

	/**
	 * The operation id for the '<em>Apply Exposure Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_EXPOSURE_FILTER__ABSTRACTEIMAGE_DOUBLE = 24;

	/**
	 * The operation id for the '<em>Apply Invert Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_INVERT_FILTER__ABSTRACTEIMAGE = 25;

	/**
	 * The operation id for the '<em>Apply Rescale Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_RESCALE_FILTER__ABSTRACTEIMAGE_DOUBLE = 26;

	/**
	 * The operation id for the '<em>Apply Gain Filter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___APPLY_GAIN_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE = 27;

	/**
	 * The operation id for the '<em>Create Text Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES___CREATE_TEXT_IMAGE__STRING_FONT_COLOR_COLOR_INT = 28;

	/**
	 * The number of operations of the '<em>EImages Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIMAGES_UTILITIES_OPERATION_COUNT = 29;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.impl.ImageSizeImpl <em>Image Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ImageSizeImpl
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImageSize()
	 * @generated
	 */
	int IMAGE_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SIZE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SIZE__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Image Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Image Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider <em>Abstract EImage Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getAbstractEImageProvider()
	 * @generated
	 */
	int ABSTRACT_EIMAGE_PROVIDER = 6;

	/**
	 * The number of structural features of the '<em>Abstract EImage Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Abstract EImage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE_PROVIDER___GET_ABSTRACT_EIMAGE = 0;

	/**
	 * The number of operations of the '<em>Abstract EImage Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EIMAGE_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.images.ImageAlignment <em>Image Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.images.ImageAlignment
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImageAlignment()
	 * @generated
	 */
	int IMAGE_ALIGNMENT = 7;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getList()
	 * @generated
	 */
	int LIST = 8;

	/**
	 * The meta object id for the '<em>Image Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.ImageData
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImageData()
	 * @generated
	 */
	int IMAGE_DATA = 9;

	/**
	 * The meta object id for the '<em>Buffered Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.image.BufferedImage
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getBufferedImage()
	 * @generated
	 */
	int BUFFERED_IMAGE = 10;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 11;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.Color
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 12;

	/**
	 * The meta object id for the '<em>Font</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.Font
	 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getFont()
	 * @generated
	 */
	int FONT = 13;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.images.EImage <em>EImage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EImage</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.EImage
	 * @generated
	 */
	EClass getEImage();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.images.EImage#getImageContent <em>Image Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Content</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.EImage#getImageContent()
	 * @see #getEImage()
	 * @generated
	 */
	EAttribute getEImage_ImageContent();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.images.ImagesAlbum <em>Images Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Images Album</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.ImagesAlbum
	 * @generated
	 */
	EClass getImagesAlbum();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.images.ImagesAlbum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.ImagesAlbum#getName()
	 * @see #getImagesAlbum()
	 * @generated
	 */
	EAttribute getImagesAlbum_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.images.ImagesAlbum#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.ImagesAlbum#getImages()
	 * @see #getImagesAlbum()
	 * @generated
	 */
	EReference getImagesAlbum_Images();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage <em>Abstract EImage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract EImage</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImage
	 * @generated
	 */
	EClass getAbstractEImage();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImage#getWidth()
	 * @see #getAbstractEImage()
	 * @generated
	 */
	EAttribute getAbstractEImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImage#getHeight()
	 * @see #getAbstractEImage()
	 * @generated
	 */
	EAttribute getAbstractEImage_Height();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage#asBufferedImage() <em>As Buffered Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Buffered Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImage#asBufferedImage()
	 * @generated
	 */
	EOperation getAbstractEImage__AsBufferedImage();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.images.URLEImage <em>URLE Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URLE Image</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.URLEImage
	 * @generated
	 */
	EClass getURLEImage();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.images.URLEImage#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.URLEImage#getUrl()
	 * @see #getURLEImage()
	 * @generated
	 */
	EAttribute getURLEImage_Url();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities <em>EImages Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EImages Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities
	 * @generated
	 */
	EClass getEImagesUtilities();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#copy(ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#copy(ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__Copy__AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#convertToGrayScale(ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Convert To Gray Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Gray Scale</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#convertToGrayScale(ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__ConvertToGrayScale__AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#resize(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double) <em>Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#resize(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double)
	 * @generated
	 */
	EOperation getEImagesUtilities__Resize__AbstractEImage_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#resize(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, double) <em>Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#resize(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, double)
	 * @generated
	 */
	EOperation getEImagesUtilities__Resize__AbstractEImage_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#resize(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int) <em>Resize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#resize(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int)
	 * @generated
	 */
	EOperation getEImagesUtilities__Resize__AbstractEImage_int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#createTransparentImage(int, int) <em>Create Transparent Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Transparent Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#createTransparentImage(int, int)
	 * @generated
	 */
	EOperation getEImagesUtilities__CreateTransparentImage__int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#saveImageAsJPEG(java.lang.String, ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Save Image As JPEG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Image As JPEG</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#saveImageAsJPEG(java.lang.String, ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__SaveImageAsJPEG__String_AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#saveImageAsPNG(java.lang.String, ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Save Image As PNG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Image As PNG</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#saveImageAsPNG(java.lang.String, ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__SaveImageAsPNG__String_AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyOverlay(ca.gc.asc_csa.apogy.common.images.AbstractEImage, ca.gc.asc_csa.apogy.common.images.AbstractEImage, boolean) <em>Apply Overlay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Overlay</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyOverlay(ca.gc.asc_csa.apogy.common.images.AbstractEImage, ca.gc.asc_csa.apogy.common.images.AbstractEImage, boolean)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyOverlay__AbstractEImage_AbstractEImage_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#flipHorizontal(ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Flip Horizontal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flip Horizontal</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#flipHorizontal(ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__FlipHorizontal__AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#flipVertical(ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Flip Vertical</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Flip Vertical</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#flipVertical(ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__FlipVertical__AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#rotate(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, boolean) <em>Rotate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rotate</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#rotate(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, boolean)
	 * @generated
	 */
	EOperation getEImagesUtilities__Rotate__AbstractEImage_double_boolean();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#translate(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int) <em>Translate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Translate</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#translate(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int)
	 * @generated
	 */
	EOperation getEImagesUtilities__Translate__AbstractEImage_int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#getAllEncompassingImageSize(java.util.List) <em>Get All Encompassing Image Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Encompassing Image Size</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#getAllEncompassingImageSize(java.util.List)
	 * @generated
	 */
	EOperation getEImagesUtilities__GetAllEncompassingImageSize__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#superPoseImages(java.util.List, boolean, ca.gc.asc_csa.apogy.common.images.ImageAlignment) <em>Super Pose Images</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Super Pose Images</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#superPoseImages(java.util.List, boolean, ca.gc.asc_csa.apogy.common.images.ImageAlignment)
	 * @generated
	 */
	EOperation getEImagesUtilities__SuperPoseImages__List_boolean_ImageAlignment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#superPoseImages(ca.gc.asc_csa.apogy.common.images.AbstractEImage, ca.gc.asc_csa.apogy.common.images.AbstractEImage, boolean, ca.gc.asc_csa.apogy.common.images.ImageAlignment) <em>Super Pose Images</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Super Pose Images</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#superPoseImages(ca.gc.asc_csa.apogy.common.images.AbstractEImage, ca.gc.asc_csa.apogy.common.images.AbstractEImage, boolean, ca.gc.asc_csa.apogy.common.images.ImageAlignment)
	 * @generated
	 */
	EOperation getEImagesUtilities__SuperPoseImages__AbstractEImage_AbstractEImage_boolean_ImageAlignment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#addBorder(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int, int, int) <em>Add Border</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Border</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#addBorder(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int, int, int)
	 * @generated
	 */
	EOperation getEImagesUtilities__AddBorder__AbstractEImage_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#getSubImage(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int, int, int) <em>Get Sub Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sub Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#getSubImage(ca.gc.asc_csa.apogy.common.images.AbstractEImage, int, int, int, int)
	 * @generated
	 */
	EOperation getEImagesUtilities__GetSubImage__AbstractEImage_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#convertToBufferedImage(org.eclipse.swt.graphics.ImageData) <em>Convert To Buffered Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Buffered Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#convertToBufferedImage(org.eclipse.swt.graphics.ImageData)
	 * @generated
	 */
	EOperation getEImagesUtilities__ConvertToBufferedImage__ImageData();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#convertToImageData(java.awt.image.BufferedImage) <em>Convert To Image Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Image Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#convertToImageData(java.awt.image.BufferedImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__ConvertToImageData__BufferedImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#createUniformColorImage(int, int, int, int, int, int) <em>Create Uniform Color Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Uniform Color Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#createUniformColorImage(int, int, int, int, int, int)
	 * @generated
	 */
	EOperation getEImagesUtilities__CreateUniformColorImage__int_int_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyAlpha(ca.gc.asc_csa.apogy.common.images.AbstractEImage, float) <em>Apply Alpha</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Alpha</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyAlpha(ca.gc.asc_csa.apogy.common.images.AbstractEImage, float)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyAlpha__AbstractEImage_float();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyEdgeFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Apply Edge Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Edge Filter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyEdgeFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyEdgeFilter__AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyContrastAndBrightnessFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, double) <em>Apply Contrast And Brightness Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Contrast And Brightness Filter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyContrastAndBrightnessFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, double)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyContrastAndBrightnessFilter__AbstractEImage_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyExposureFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double) <em>Apply Exposure Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Exposure Filter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyExposureFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyExposureFilter__AbstractEImage_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyInvertFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage) <em>Apply Invert Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Invert Filter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyInvertFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyInvertFilter__AbstractEImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyRescaleFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double) <em>Apply Rescale Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Rescale Filter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyRescaleFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyRescaleFilter__AbstractEImage_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyGainFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, double) <em>Apply Gain Filter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Gain Filter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#applyGainFilter(ca.gc.asc_csa.apogy.common.images.AbstractEImage, double, double)
	 * @generated
	 */
	EOperation getEImagesUtilities__ApplyGainFilter__AbstractEImage_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.EImagesUtilities#createTextImage(java.lang.String, java.awt.Font, java.awt.Color, java.awt.Color, int) <em>Create Text Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Text Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.EImagesUtilities#createTextImage(java.lang.String, java.awt.Font, java.awt.Color, java.awt.Color, int)
	 * @generated
	 */
	EOperation getEImagesUtilities__CreateTextImage__String_Font_Color_Color_int();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.images.ImageSize <em>Image Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Size</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.ImageSize
	 * @generated
	 */
	EClass getImageSize();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.images.ImageSize#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.ImageSize#getWidth()
	 * @see #getImageSize()
	 * @generated
	 */
	EAttribute getImageSize_Width();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.images.ImageSize#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.ImageSize#getHeight()
	 * @see #getImageSize()
	 * @generated
	 */
	EAttribute getImageSize_Height();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider <em>Abstract EImage Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract EImage Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider
	 * @generated
	 */
	EClass getAbstractEImageProvider();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider#getAbstractEImage() <em>Get Abstract EImage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstract EImage</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider#getAbstractEImage()
	 * @generated
	 */
	EOperation getAbstractEImageProvider__GetAbstractEImage();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.images.ImageAlignment <em>Image Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Alignment</em>'.
	 * @see ca.gc.asc_csa.apogy.common.images.ImageAlignment
	 * @generated
	 */
	EEnum getImageAlignment();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.ImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Data</em>'.
	 * @see org.eclipse.swt.graphics.ImageData
	 * @model instanceClass="org.eclipse.swt.graphics.ImageData"
	 * @generated
	 */
	EDataType getImageData();

	/**
	 * Returns the meta object for data type '{@link java.awt.image.BufferedImage <em>Buffered Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Buffered Image</em>'.
	 * @see java.awt.image.BufferedImage
	 * @model instanceClass="java.awt.image.BufferedImage"
	 * @generated
	 */
	EDataType getBufferedImage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link java.awt.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.awt.Color
	 * @model instanceClass="java.awt.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link java.awt.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font</em>'.
	 * @see java.awt.Font
	 * @model instanceClass="java.awt.Font"
	 * @generated
	 */
	EDataType getFont();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonImagesFactory getApogyCommonImagesFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.impl.EImageImpl <em>EImage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.impl.EImageImpl
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getEImage()
		 * @generated
		 */
		EClass EIMAGE = eINSTANCE.getEImage();

		/**
		 * The meta object literal for the '<em><b>Image Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EIMAGE__IMAGE_CONTENT = eINSTANCE.getEImage_ImageContent();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.impl.ImagesAlbumImpl <em>Images Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ImagesAlbumImpl
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImagesAlbum()
		 * @generated
		 */
		EClass IMAGES_ALBUM = eINSTANCE.getImagesAlbum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGES_ALBUM__NAME = eINSTANCE.getImagesAlbum_Name();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGES_ALBUM__IMAGES = eINSTANCE.getImagesAlbum_Images();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage <em>Abstract EImage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImage
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getAbstractEImage()
		 * @generated
		 */
		EClass ABSTRACT_EIMAGE = eINSTANCE.getAbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EIMAGE__WIDTH = eINSTANCE.getAbstractEImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EIMAGE__HEIGHT = eINSTANCE.getAbstractEImage_Height();

		/**
		 * The meta object literal for the '<em><b>As Buffered Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EIMAGE___AS_BUFFERED_IMAGE = eINSTANCE.getAbstractEImage__AsBufferedImage();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.impl.URLEImageImpl <em>URLE Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.impl.URLEImageImpl
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getURLEImage()
		 * @generated
		 */
		EClass URLE_IMAGE = eINSTANCE.getURLEImage();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URLE_IMAGE__URL = eINSTANCE.getURLEImage_Url();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.impl.EImagesUtilitiesImpl <em>EImages Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.impl.EImagesUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getEImagesUtilities()
		 * @generated
		 */
		EClass EIMAGES_UTILITIES = eINSTANCE.getEImagesUtilities();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___COPY__ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__Copy__AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Convert To Gray Scale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___CONVERT_TO_GRAY_SCALE__ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__ConvertToGrayScale__AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Resize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE = eINSTANCE.getEImagesUtilities__Resize__AbstractEImage_double();

		/**
		 * The meta object literal for the '<em><b>Resize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE_DOUBLE = eINSTANCE.getEImagesUtilities__Resize__AbstractEImage_double_double();

		/**
		 * The meta object literal for the '<em><b>Resize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_INT_INT = eINSTANCE.getEImagesUtilities__Resize__AbstractEImage_int_int();

		/**
		 * The meta object literal for the '<em><b>Create Transparent Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___CREATE_TRANSPARENT_IMAGE__INT_INT = eINSTANCE.getEImagesUtilities__CreateTransparentImage__int_int();

		/**
		 * The meta object literal for the '<em><b>Save Image As JPEG</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___SAVE_IMAGE_AS_JPEG__STRING_ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__SaveImageAsJPEG__String_AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Save Image As PNG</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___SAVE_IMAGE_AS_PNG__STRING_ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__SaveImageAsPNG__String_AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Apply Overlay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_OVERLAY__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN = eINSTANCE.getEImagesUtilities__ApplyOverlay__AbstractEImage_AbstractEImage_boolean();

		/**
		 * The meta object literal for the '<em><b>Flip Horizontal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___FLIP_HORIZONTAL__ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__FlipHorizontal__AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Flip Vertical</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___FLIP_VERTICAL__ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__FlipVertical__AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___ROTATE__ABSTRACTEIMAGE_DOUBLE_BOOLEAN = eINSTANCE.getEImagesUtilities__Rotate__AbstractEImage_double_boolean();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___TRANSLATE__ABSTRACTEIMAGE_INT_INT = eINSTANCE.getEImagesUtilities__Translate__AbstractEImage_int_int();

		/**
		 * The meta object literal for the '<em><b>Get All Encompassing Image Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___GET_ALL_ENCOMPASSING_IMAGE_SIZE__LIST = eINSTANCE.getEImagesUtilities__GetAllEncompassingImageSize__List();

		/**
		 * The meta object literal for the '<em><b>Super Pose Images</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___SUPER_POSE_IMAGES__LIST_BOOLEAN_IMAGEALIGNMENT = eINSTANCE.getEImagesUtilities__SuperPoseImages__List_boolean_ImageAlignment();

		/**
		 * The meta object literal for the '<em><b>Super Pose Images</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___SUPER_POSE_IMAGES__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN_IMAGEALIGNMENT = eINSTANCE.getEImagesUtilities__SuperPoseImages__AbstractEImage_AbstractEImage_boolean_ImageAlignment();

		/**
		 * The meta object literal for the '<em><b>Add Border</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___ADD_BORDER__ABSTRACTEIMAGE_INT_INT_INT_INT = eINSTANCE.getEImagesUtilities__AddBorder__AbstractEImage_int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Get Sub Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___GET_SUB_IMAGE__ABSTRACTEIMAGE_INT_INT_INT_INT = eINSTANCE.getEImagesUtilities__GetSubImage__AbstractEImage_int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Convert To Buffered Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___CONVERT_TO_BUFFERED_IMAGE__IMAGEDATA = eINSTANCE.getEImagesUtilities__ConvertToBufferedImage__ImageData();

		/**
		 * The meta object literal for the '<em><b>Convert To Image Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___CONVERT_TO_IMAGE_DATA__BUFFEREDIMAGE = eINSTANCE.getEImagesUtilities__ConvertToImageData__BufferedImage();

		/**
		 * The meta object literal for the '<em><b>Create Uniform Color Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___CREATE_UNIFORM_COLOR_IMAGE__INT_INT_INT_INT_INT_INT = eINSTANCE.getEImagesUtilities__CreateUniformColorImage__int_int_int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Apply Alpha</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_ALPHA__ABSTRACTEIMAGE_FLOAT = eINSTANCE.getEImagesUtilities__ApplyAlpha__AbstractEImage_float();

		/**
		 * The meta object literal for the '<em><b>Apply Edge Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_EDGE_FILTER__ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__ApplyEdgeFilter__AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Apply Contrast And Brightness Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_CONTRAST_AND_BRIGHTNESS_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE = eINSTANCE.getEImagesUtilities__ApplyContrastAndBrightnessFilter__AbstractEImage_double_double();

		/**
		 * The meta object literal for the '<em><b>Apply Exposure Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_EXPOSURE_FILTER__ABSTRACTEIMAGE_DOUBLE = eINSTANCE.getEImagesUtilities__ApplyExposureFilter__AbstractEImage_double();

		/**
		 * The meta object literal for the '<em><b>Apply Invert Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_INVERT_FILTER__ABSTRACTEIMAGE = eINSTANCE.getEImagesUtilities__ApplyInvertFilter__AbstractEImage();

		/**
		 * The meta object literal for the '<em><b>Apply Rescale Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_RESCALE_FILTER__ABSTRACTEIMAGE_DOUBLE = eINSTANCE.getEImagesUtilities__ApplyRescaleFilter__AbstractEImage_double();

		/**
		 * The meta object literal for the '<em><b>Apply Gain Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___APPLY_GAIN_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE = eINSTANCE.getEImagesUtilities__ApplyGainFilter__AbstractEImage_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Text Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EIMAGES_UTILITIES___CREATE_TEXT_IMAGE__STRING_FONT_COLOR_COLOR_INT = eINSTANCE.getEImagesUtilities__CreateTextImage__String_Font_Color_Color_int();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.impl.ImageSizeImpl <em>Image Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ImageSizeImpl
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImageSize()
		 * @generated
		 */
		EClass IMAGE_SIZE = eINSTANCE.getImageSize();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_SIZE__WIDTH = eINSTANCE.getImageSize_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_SIZE__HEIGHT = eINSTANCE.getImageSize_Height();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider <em>Abstract EImage Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImageProvider
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getAbstractEImageProvider()
		 * @generated
		 */
		EClass ABSTRACT_EIMAGE_PROVIDER = eINSTANCE.getAbstractEImageProvider();

		/**
		 * The meta object literal for the '<em><b>Get Abstract EImage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_EIMAGE_PROVIDER___GET_ABSTRACT_EIMAGE = eINSTANCE.getAbstractEImageProvider__GetAbstractEImage();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.images.ImageAlignment <em>Image Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.images.ImageAlignment
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImageAlignment()
		 * @generated
		 */
		EEnum IMAGE_ALIGNMENT = eINSTANCE.getImageAlignment();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Image Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.ImageData
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getImageData()
		 * @generated
		 */
		EDataType IMAGE_DATA = eINSTANCE.getImageData();

		/**
		 * The meta object literal for the '<em>Buffered Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.image.BufferedImage
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getBufferedImage()
		 * @generated
		 */
		EDataType BUFFERED_IMAGE = eINSTANCE.getBufferedImage();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.Color
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Font</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.Font
		 * @see ca.gc.asc_csa.apogy.common.images.impl.ApogyCommonImagesPackageImpl#getFont()
		 * @generated
		 */
		EDataType FONT = eINSTANCE.getFont();

	}

} //ApogyCommonImagesPackage
