/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

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
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyCameraTools' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)' modelName='SymphonyCameraTools' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.addons.sensors.imaging.camera/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.imaging.camera.edit/src-generated' basePackage='ca.gc.asc_csa.symphony.tools'"
 * @generated
 */
public interface SymphonyCameraToolsPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "camera";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.addons.sensors.imaging.camera";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "camera";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyCameraToolsPackage eINSTANCE = org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewUtilitiesImpl <em>Camera View Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewUtilitiesImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraViewUtilities()
	 * @generated
	 */
	int CAMERA_VIEW_UTILITIES = 0;

		/**
	 * The number of structural features of the '<em>Camera View Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_UTILITIES_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Camera View Configuration Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_UTILITIES___GET_CAMERA_VIEW_CONFIGURATION_IDENTIFIER__CAMERAVIEWCONFIGURATION = 0;

		/**
	 * The operation id for the '<em>Get Active Camera View Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION__STRING = 1;

		/**
	 * The operation id for the '<em>Get Active Camera View Configuration List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION_LIST = 2;

		/**
	 * The number of operations of the '<em>Camera View Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_UTILITIES_OPERATION_COUNT = 3;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationListImpl <em>Camera View Configuration List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationListImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraViewConfigurationList()
	 * @generated
	 */
  int CAMERA_VIEW_CONFIGURATION_LIST = 1;

  /**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION_LIST__TOOLS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

  /**
	 * The feature id for the '<em><b>Camera View Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Camera View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION_LIST_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Camera View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION_LIST_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationImpl <em>Camera View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraViewConfiguration()
	 * @generated
	 */
  int CAMERA_VIEW_CONFIGURATION = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__NAME = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME;

		/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__VARIABLE = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE;

		/**
	 * The feature id for the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT;

		/**
	 * The feature id for the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__FEATURE_ROOT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__DESCRIPTION = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Camera View Configuration List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__CAMERA = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Image Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Image Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Image Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Display Rectified Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Overlay List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Tool List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_CONFIGURATION__TOOL_LIST = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 8;

		/**
	 * The feature id for the '<em><b>Filter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION__FILTER_LIST = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 9;

  /**
	 * The feature id for the '<em><b>Image Auto Save Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 10;

		/**
	 * The feature id for the '<em><b>Save Image With Overlays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 11;

		/**
	 * The feature id for the '<em><b>Image Auto Save Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 12;

		/**
	 * The number of structural features of the '<em>Camera View Configuration</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION_FEATURE_COUNT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 13;

  /**
	 * The operation id for the '<em>Get Camera Image Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_VIEW_CONFIGURATION___GET_CAMERA_IMAGE_ANNOTATIONS = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Camera View Configuration</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_VIEW_CONFIGURATION_OPERATION_COUNT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_OPERATION_COUNT + 1;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.FilterListImpl <em>Filter List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.FilterListImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getFilterList()
	 * @generated
	 */
  int FILTER_LIST = 3;

  /**
	 * The feature id for the '<em><b>Camera View Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_LIST__CAMERA_VIEW_CONFIGURATION = 0;

		/**
	 * The feature id for the '<em><b>Image Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILTER_LIST__IMAGE_FILTERS = 1;

  /**
	 * The number of structural features of the '<em>Filter List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILTER_LIST_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Filter List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FILTER_LIST_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFilterImpl <em>Image Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageFilter()
	 * @generated
	 */
  int IMAGE_FILTER = 4;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_FILTER__NAME = EMFEcorePackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_FILTER__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_FILTER__ENABLED = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Image Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_FILTER_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FILTER___DISPOSE = EMFEcorePackage.NAMED_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Image Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_FILTER_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.GrayScaleFilterImpl <em>Gray Scale Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.GrayScaleFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getGrayScaleFilter()
	 * @generated
	 */
  int GRAY_SCALE_FILTER = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAY_SCALE_FILTER__NAME = IMAGE_FILTER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAY_SCALE_FILTER__DESCRIPTION = IMAGE_FILTER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAY_SCALE_FILTER__ENABLED = IMAGE_FILTER__ENABLED;

  /**
	 * The number of structural features of the '<em>Gray Scale Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAY_SCALE_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAY_SCALE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAY_SCALE_FILTER___DISPOSE = IMAGE_FILTER___DISPOSE;

		/**
	 * The number of operations of the '<em>Gray Scale Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GRAY_SCALE_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.EdgeFilterImpl <em>Edge Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.EdgeFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getEdgeFilter()
	 * @generated
	 */
  int EDGE_FILTER = 6;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_FILTER__NAME = IMAGE_FILTER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_FILTER__DESCRIPTION = IMAGE_FILTER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_FILTER__ENABLED = IMAGE_FILTER__ENABLED;

  /**
	 * The number of structural features of the '<em>Edge Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FILTER___DISPOSE = IMAGE_FILTER___DISPOSE;

		/**
	 * The number of operations of the '<em>Edge Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EDGE_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ContrastAndBrightnessFilterImpl <em>Contrast And Brightness Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ContrastAndBrightnessFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getContrastAndBrightnessFilter()
	 * @generated
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER = 7;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER__NAME = IMAGE_FILTER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER__DESCRIPTION = IMAGE_FILTER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER__ENABLED = IMAGE_FILTER__ENABLED;

  /**
	 * The feature id for the '<em><b>Contrast</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST = IMAGE_FILTER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Brightness</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS = IMAGE_FILTER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Contrast And Brightness Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAST_AND_BRIGHTNESS_FILTER___DISPOSE = IMAGE_FILTER___DISPOSE;

		/**
	 * The number of operations of the '<em>Contrast And Brightness Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTRAST_AND_BRIGHTNESS_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ExposureFilterImpl <em>Exposure Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ExposureFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getExposureFilter()
	 * @generated
	 */
  int EXPOSURE_FILTER = 8;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPOSURE_FILTER__NAME = IMAGE_FILTER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPOSURE_FILTER__DESCRIPTION = IMAGE_FILTER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPOSURE_FILTER__ENABLED = IMAGE_FILTER__ENABLED;

  /**
	 * The feature id for the '<em><b>Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPOSURE_FILTER__EXPOSURE = IMAGE_FILTER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Exposure Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPOSURE_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPOSURE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_FILTER___DISPOSE = IMAGE_FILTER___DISPOSE;

		/**
	 * The number of operations of the '<em>Exposure Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EXPOSURE_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.GainFilterImpl <em>Gain Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.GainFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getGainFilter()
	 * @generated
	 */
  int GAIN_FILTER = 9;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER__NAME = IMAGE_FILTER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER__DESCRIPTION = IMAGE_FILTER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER__ENABLED = IMAGE_FILTER__ENABLED;

  /**
	 * The feature id for the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER__GAIN = IMAGE_FILTER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER__BIAS = IMAGE_FILTER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Gain Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAIN_FILTER___DISPOSE = IMAGE_FILTER___DISPOSE;

		/**
	 * The number of operations of the '<em>Gain Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int GAIN_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.InvertFilterImpl <em>Invert Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.InvertFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getInvertFilter()
	 * @generated
	 */
  int INVERT_FILTER = 10;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVERT_FILTER__NAME = IMAGE_FILTER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVERT_FILTER__DESCRIPTION = IMAGE_FILTER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVERT_FILTER__ENABLED = IMAGE_FILTER__ENABLED;

  /**
	 * The number of structural features of the '<em>Invert Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVERT_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVERT_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERT_FILTER___DISPOSE = IMAGE_FILTER___DISPOSE;

		/**
	 * The number of operations of the '<em>Invert Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int INVERT_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.RescaleFilterImpl <em>Rescale Filter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.RescaleFilterImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getRescaleFilter()
	 * @generated
	 */
  int RESCALE_FILTER = 11;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESCALE_FILTER__NAME = IMAGE_FILTER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESCALE_FILTER__DESCRIPTION = IMAGE_FILTER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESCALE_FILTER__ENABLED = IMAGE_FILTER__ENABLED;

  /**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESCALE_FILTER__SCALE = IMAGE_FILTER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Rescale Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESCALE_FILTER_FEATURE_COUNT = IMAGE_FILTER_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Filter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESCALE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_FILTER___DISPOSE = IMAGE_FILTER___DISPOSE;

		/**
	 * The number of operations of the '<em>Rescale Filter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RESCALE_FILTER_OPERATION_COUNT = IMAGE_FILTER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraImageAnnotationImpl <em>Camera Image Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraImageAnnotationImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraImageAnnotation()
	 * @generated
	 */
	int CAMERA_IMAGE_ANNOTATION = 12;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_IMAGE_ANNOTATION__NAME = EMFEcorePackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_IMAGE_ANNOTATION__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_IMAGE_ANNOTATION__VISIBLE = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Camera Image Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_IMAGE_ANNOTATION_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_IMAGE_ANNOTATION___DISPOSE = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Camera Image Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayListImpl <em>Camera Overlay List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayListImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraOverlayList()
	 * @generated
	 */
  int CAMERA_OVERLAY_LIST = 13;

  /**
	 * The feature id for the '<em><b>Camera View Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION = 0;

		/**
	 * The feature id for the '<em><b>Overlays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY_LIST__OVERLAYS = 1;

  /**
	 * The number of structural features of the '<em>Camera Overlay List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY_LIST_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Camera Overlay List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY_LIST_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayImpl <em>Camera Overlay</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraOverlay()
	 * @generated
	 */
  int CAMERA_OVERLAY = 14;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY__NAME = CAMERA_IMAGE_ANNOTATION__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY__DESCRIPTION = CAMERA_IMAGE_ANNOTATION__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY__VISIBLE = CAMERA_IMAGE_ANNOTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OVERLAY__CAMERA_OVERLAY_LIST = CAMERA_IMAGE_ANNOTATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY__OVERLAY_ALIGNMENT = CAMERA_IMAGE_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Camera Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY_FEATURE_COUNT = CAMERA_IMAGE_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OVERLAY___DISPOSE = CAMERA_IMAGE_ANNOTATION___DISPOSE;

		/**
	 * The number of operations of the '<em>Camera Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_OVERLAY_OPERATION_COUNT = CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.DrawnCameraOverlayImpl <em>Drawn Camera Overlay</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.DrawnCameraOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getDrawnCameraOverlay()
	 * @generated
	 */
  int DRAWN_CAMERA_OVERLAY = 15;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DRAWN_CAMERA_OVERLAY__NAME = CAMERA_OVERLAY__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DRAWN_CAMERA_OVERLAY__DESCRIPTION = CAMERA_OVERLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DRAWN_CAMERA_OVERLAY__VISIBLE = CAMERA_OVERLAY__VISIBLE;

  /**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWN_CAMERA_OVERLAY__CAMERA_OVERLAY_LIST = CAMERA_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DRAWN_CAMERA_OVERLAY__OVERLAY_ALIGNMENT = CAMERA_OVERLAY__OVERLAY_ALIGNMENT;

  /**
	 * The number of structural features of the '<em>Drawn Camera Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DRAWN_CAMERA_OVERLAY_FEATURE_COUNT = CAMERA_OVERLAY_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWN_CAMERA_OVERLAY___DISPOSE = CAMERA_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DRAWN_CAMERA_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = CAMERA_OVERLAY_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Drawn Camera Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DRAWN_CAMERA_OVERLAY_OPERATION_COUNT = CAMERA_OVERLAY_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.AbstractTextOverlayImpl <em>Abstract Text Overlay</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.AbstractTextOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getAbstractTextOverlay()
	 * @generated
	 */
  int ABSTRACT_TEXT_OVERLAY = 16;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__NAME = DRAWN_CAMERA_OVERLAY__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__DESCRIPTION = DRAWN_CAMERA_OVERLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__VISIBLE = DRAWN_CAMERA_OVERLAY__VISIBLE;

  /**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXT_OVERLAY__CAMERA_OVERLAY_LIST = DRAWN_CAMERA_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__OVERLAY_ALIGNMENT = DRAWN_CAMERA_OVERLAY__OVERLAY_ALIGNMENT;

  /**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__FONT_NAME = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__FONT_SIZE = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Horizontal Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Vertical Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY__TEXT_COLOR = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Abstract Text Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 5;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXT_OVERLAY___DISPOSE = DRAWN_CAMERA_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = DRAWN_CAMERA_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

  /**
	 * The operation id for the '<em>Get Displayed String</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING = DRAWN_CAMERA_OVERLAY_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Abstract Text Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TEXT_OVERLAY_OPERATION_COUNT = DRAWN_CAMERA_OVERLAY_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureOverlayImpl <em>EMF Feature Overlay</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getEMFFeatureOverlay()
	 * @generated
	 */
  int EMF_FEATURE_OVERLAY = 17;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__NAME = ABSTRACT_TEXT_OVERLAY__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__DESCRIPTION = ABSTRACT_TEXT_OVERLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__VISIBLE = ABSTRACT_TEXT_OVERLAY__VISIBLE;

  /**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_OVERLAY__CAMERA_OVERLAY_LIST = ABSTRACT_TEXT_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__OVERLAY_ALIGNMENT = ABSTRACT_TEXT_OVERLAY__OVERLAY_ALIGNMENT;

  /**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__FONT_NAME = ABSTRACT_TEXT_OVERLAY__FONT_NAME;

  /**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__FONT_SIZE = ABSTRACT_TEXT_OVERLAY__FONT_SIZE;

  /**
	 * The feature id for the '<em><b>Horizontal Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__HORIZONTAL_OFFSET = ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET;

  /**
	 * The feature id for the '<em><b>Vertical Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__VERTICAL_OFFSET = ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET;

  /**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__TEXT_COLOR = ABSTRACT_TEXT_OVERLAY__TEXT_COLOR;

  /**
	 * The feature id for the '<em><b>Variable Feature Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Number Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY__NUMBER_FORMAT = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Variable Feature Reference Change Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>EMF Feature Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY_FEATURE_COUNT = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_OVERLAY___DISPOSE = ABSTRACT_TEXT_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = ABSTRACT_TEXT_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

  /**
	 * The operation id for the '<em>Get Displayed String</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY___GET_DISPLAYED_STRING = ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING;

  /**
	 * The number of operations of the '<em>EMF Feature Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_FEATURE_OVERLAY_OPERATION_COUNT = ABSTRACT_TEXT_OVERLAY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraNameOverlayImpl <em>Camera Name Overlay</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraNameOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraNameOverlay()
	 * @generated
	 */
  int CAMERA_NAME_OVERLAY = 18;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__NAME = ABSTRACT_TEXT_OVERLAY__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__DESCRIPTION = ABSTRACT_TEXT_OVERLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__VISIBLE = ABSTRACT_TEXT_OVERLAY__VISIBLE;

  /**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_NAME_OVERLAY__CAMERA_OVERLAY_LIST = ABSTRACT_TEXT_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__OVERLAY_ALIGNMENT = ABSTRACT_TEXT_OVERLAY__OVERLAY_ALIGNMENT;

  /**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__FONT_NAME = ABSTRACT_TEXT_OVERLAY__FONT_NAME;

  /**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__FONT_SIZE = ABSTRACT_TEXT_OVERLAY__FONT_SIZE;

  /**
	 * The feature id for the '<em><b>Horizontal Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__HORIZONTAL_OFFSET = ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET;

  /**
	 * The feature id for the '<em><b>Vertical Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__VERTICAL_OFFSET = ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET;

  /**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY__TEXT_COLOR = ABSTRACT_TEXT_OVERLAY__TEXT_COLOR;

  /**
	 * The number of structural features of the '<em>Camera Name Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY_FEATURE_COUNT = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_NAME_OVERLAY___DISPOSE = ABSTRACT_TEXT_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = ABSTRACT_TEXT_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

  /**
	 * The operation id for the '<em>Get Displayed String</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY___GET_DISPLAYED_STRING = ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING;

  /**
	 * The number of operations of the '<em>Camera Name Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CAMERA_NAME_OVERLAY_OPERATION_COUNT = ABSTRACT_TEXT_OVERLAY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCountOverlayImpl <em>Image Count Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCountOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageCountOverlay()
	 * @generated
	 */
	int IMAGE_COUNT_OVERLAY = 19;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__NAME = ABSTRACT_TEXT_OVERLAY__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__DESCRIPTION = ABSTRACT_TEXT_OVERLAY__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__VISIBLE = ABSTRACT_TEXT_OVERLAY__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__CAMERA_OVERLAY_LIST = ABSTRACT_TEXT_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__OVERLAY_ALIGNMENT = ABSTRACT_TEXT_OVERLAY__OVERLAY_ALIGNMENT;

		/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__FONT_NAME = ABSTRACT_TEXT_OVERLAY__FONT_NAME;

		/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__FONT_SIZE = ABSTRACT_TEXT_OVERLAY__FONT_SIZE;

		/**
	 * The feature id for the '<em><b>Horizontal Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__HORIZONTAL_OFFSET = ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET;

		/**
	 * The feature id for the '<em><b>Vertical Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__VERTICAL_OFFSET = ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET;

		/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__TEXT_COLOR = ABSTRACT_TEXT_OVERLAY__TEXT_COLOR;

		/**
	 * The feature id for the '<em><b>Indicator Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Image Count Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY_FEATURE_COUNT = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY___DISPOSE = ABSTRACT_TEXT_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = ABSTRACT_TEXT_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

		/**
	 * The operation id for the '<em>Get Displayed String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY___GET_DISPLAYED_STRING = ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING;

		/**
	 * The number of operations of the '<em>Image Count Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COUNT_OVERLAY_OPERATION_COUNT = ABSTRACT_TEXT_OVERLAY_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFrozenOverlayImpl <em>Image Frozen Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFrozenOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageFrozenOverlay()
	 * @generated
	 */
	int IMAGE_FROZEN_OVERLAY = 20;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__NAME = ABSTRACT_TEXT_OVERLAY__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__DESCRIPTION = ABSTRACT_TEXT_OVERLAY__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__VISIBLE = ABSTRACT_TEXT_OVERLAY__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__CAMERA_OVERLAY_LIST = ABSTRACT_TEXT_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__OVERLAY_ALIGNMENT = ABSTRACT_TEXT_OVERLAY__OVERLAY_ALIGNMENT;

		/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__FONT_NAME = ABSTRACT_TEXT_OVERLAY__FONT_NAME;

		/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__FONT_SIZE = ABSTRACT_TEXT_OVERLAY__FONT_SIZE;

		/**
	 * The feature id for the '<em><b>Horizontal Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__HORIZONTAL_OFFSET = ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET;

		/**
	 * The feature id for the '<em><b>Vertical Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__VERTICAL_OFFSET = ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET;

		/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__TEXT_COLOR = ABSTRACT_TEXT_OVERLAY__TEXT_COLOR;

		/**
	 * The feature id for the '<em><b>Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__FROZEN = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Expected Image Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Frozen Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Image Frozen Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY_FEATURE_COUNT = ABSTRACT_TEXT_OVERLAY_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY___DISPOSE = ABSTRACT_TEXT_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = ABSTRACT_TEXT_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

		/**
	 * The operation id for the '<em>Get Displayed String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY___GET_DISPLAYED_STRING = ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING;

		/**
	 * The number of operations of the '<em>Image Frozen Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FROZEN_OVERLAY_OPERATION_COUNT = ABSTRACT_TEXT_OVERLAY_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCameraOverlayImpl <em>Image Camera Overlay</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCameraOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageCameraOverlay()
	 * @generated
	 */
  int IMAGE_CAMERA_OVERLAY = 21;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_CAMERA_OVERLAY__NAME = CAMERA_OVERLAY__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_CAMERA_OVERLAY__DESCRIPTION = CAMERA_OVERLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_CAMERA_OVERLAY__VISIBLE = CAMERA_OVERLAY__VISIBLE;

  /**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CAMERA_OVERLAY__CAMERA_OVERLAY_LIST = CAMERA_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_CAMERA_OVERLAY__OVERLAY_ALIGNMENT = CAMERA_OVERLAY__OVERLAY_ALIGNMENT;

  /**
	 * The number of structural features of the '<em>Image Camera Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_CAMERA_OVERLAY_FEATURE_COUNT = CAMERA_OVERLAY_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CAMERA_OVERLAY___DISPOSE = CAMERA_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Get Overlay</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_CAMERA_OVERLAY___GET_OVERLAY__ABSTRACTCAMERA_OVERLAYALIGNMENT_INT_INT = CAMERA_OVERLAY_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Image Camera Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_CAMERA_OVERLAY_OPERATION_COUNT = CAMERA_OVERLAY_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.URLImageOverlayImpl <em>URL Image Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.URLImageOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getURLImageOverlay()
	 * @generated
	 */
	int URL_IMAGE_OVERLAY = 22;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__NAME = IMAGE_CAMERA_OVERLAY__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__DESCRIPTION = IMAGE_CAMERA_OVERLAY__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__VISIBLE = IMAGE_CAMERA_OVERLAY__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__CAMERA_OVERLAY_LIST = IMAGE_CAMERA_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__OVERLAY_ALIGNMENT = IMAGE_CAMERA_OVERLAY__OVERLAY_ALIGNMENT;

		/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__URL = IMAGE_CAMERA_OVERLAY_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Image Size Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY = IMAGE_CAMERA_OVERLAY_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY__IMAGE = IMAGE_CAMERA_OVERLAY_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>URL Image Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY_FEATURE_COUNT = IMAGE_CAMERA_OVERLAY_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY___DISPOSE = IMAGE_CAMERA_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Get Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY___GET_OVERLAY__ABSTRACTCAMERA_OVERLAYALIGNMENT_INT_INT = IMAGE_CAMERA_OVERLAY___GET_OVERLAY__ABSTRACTCAMERA_OVERLAYALIGNMENT_INT_INT;

		/**
	 * The number of operations of the '<em>URL Image Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_OVERLAY_OPERATION_COUNT = IMAGE_CAMERA_OVERLAY_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyLogoOverlayImpl <em>Symphony Logo Overlay</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyLogoOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getSymphonyLogoOverlay()
	 * @generated
	 */
  int SYMPHONY_LOGO_OVERLAY = 23;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_LOGO_OVERLAY__NAME = IMAGE_CAMERA_OVERLAY__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_LOGO_OVERLAY__DESCRIPTION = IMAGE_CAMERA_OVERLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_LOGO_OVERLAY__VISIBLE = IMAGE_CAMERA_OVERLAY__VISIBLE;

  /**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_LOGO_OVERLAY__CAMERA_OVERLAY_LIST = IMAGE_CAMERA_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_LOGO_OVERLAY__OVERLAY_ALIGNMENT = IMAGE_CAMERA_OVERLAY__OVERLAY_ALIGNMENT;

  /**
	 * The number of structural features of the '<em>Symphony Logo Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_LOGO_OVERLAY_FEATURE_COUNT = IMAGE_CAMERA_OVERLAY_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_LOGO_OVERLAY___DISPOSE = IMAGE_CAMERA_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Get Overlay</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_LOGO_OVERLAY___GET_OVERLAY__ABSTRACTCAMERA_OVERLAYALIGNMENT_INT_INT = IMAGE_CAMERA_OVERLAY___GET_OVERLAY__ABSTRACTCAMERA_OVERLAYALIGNMENT_INT_INT;

  /**
	 * The number of operations of the '<em>Symphony Logo Overlay</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SYMPHONY_LOGO_OVERLAY_OPERATION_COUNT = IMAGE_CAMERA_OVERLAY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.FOVOverlayImpl <em>FOV Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.FOVOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getFOVOverlay()
	 * @generated
	 */
	int FOV_OVERLAY = 24;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__NAME = DRAWN_CAMERA_OVERLAY__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__DESCRIPTION = DRAWN_CAMERA_OVERLAY__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__VISIBLE = DRAWN_CAMERA_OVERLAY__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__CAMERA_OVERLAY_LIST = DRAWN_CAMERA_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__OVERLAY_ALIGNMENT = DRAWN_CAMERA_OVERLAY__OVERLAY_ALIGNMENT;

		/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__LINE_WIDTH = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Positive Values Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__POSITIVE_VALUES_COLOR = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Negative Value Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__NEGATIVE_VALUE_COLOR = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Angle Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__ANGLE_INTERVAL = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__FONT_NAME = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__FONT_SIZE = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Azimuth Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__AZIMUTH_DIRECTION = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 6;

		/**
	 * The feature id for the '<em><b>Elevation Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY__ELEVATION_DIRECTION = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 7;

		/**
	 * The number of structural features of the '<em>FOV Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY_FEATURE_COUNT = DRAWN_CAMERA_OVERLAY_FEATURE_COUNT + 8;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY___DISPOSE = DRAWN_CAMERA_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = DRAWN_CAMERA_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

		/**
	 * The operation id for the '<em>Get Tool Tip Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT = DRAWN_CAMERA_OVERLAY_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>FOV Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOV_OVERLAY_OPERATION_COUNT = DRAWN_CAMERA_OVERLAY_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthElevationFOVOverlayImpl <em>Azimuth Elevation FOV Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthElevationFOVOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getAzimuthElevationFOVOverlay()
	 * @generated
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY = 25;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__NAME = FOV_OVERLAY__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__DESCRIPTION = FOV_OVERLAY__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__VISIBLE = FOV_OVERLAY__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__CAMERA_OVERLAY_LIST = FOV_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__OVERLAY_ALIGNMENT = FOV_OVERLAY__OVERLAY_ALIGNMENT;

		/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__LINE_WIDTH = FOV_OVERLAY__LINE_WIDTH;

		/**
	 * The feature id for the '<em><b>Positive Values Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__POSITIVE_VALUES_COLOR = FOV_OVERLAY__POSITIVE_VALUES_COLOR;

		/**
	 * The feature id for the '<em><b>Negative Value Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__NEGATIVE_VALUE_COLOR = FOV_OVERLAY__NEGATIVE_VALUE_COLOR;

		/**
	 * The feature id for the '<em><b>Angle Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__ANGLE_INTERVAL = FOV_OVERLAY__ANGLE_INTERVAL;

		/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__FONT_NAME = FOV_OVERLAY__FONT_NAME;

		/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__FONT_SIZE = FOV_OVERLAY__FONT_SIZE;

		/**
	 * The feature id for the '<em><b>Azimuth Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_DIRECTION = FOV_OVERLAY__AZIMUTH_DIRECTION;

		/**
	 * The feature id for the '<em><b>Elevation Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_DIRECTION = FOV_OVERLAY__ELEVATION_DIRECTION;

		/**
	 * The number of structural features of the '<em>Azimuth Elevation FOV Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY_FEATURE_COUNT = FOV_OVERLAY_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY___DISPOSE = FOV_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = FOV_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

		/**
	 * The operation id for the '<em>Get Tool Tip Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT = FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT;

		/**
	 * The operation id for the '<em>Change Azimuth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_AZIMUTH__DOUBLE = FOV_OVERLAY_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Change Elevation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_ELEVATION__DOUBLE = FOV_OVERLAY_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Azimuth Elevation FOV Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_ELEVATION_FOV_OVERLAY_OPERATION_COUNT = FOV_OVERLAY_OPERATION_COUNT + 2;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureAzimuthElevationFOVOverlayImpl <em>EMF Feature Azimuth Elevation FOV Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureAzimuthElevationFOVOverlayImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getEMFFeatureAzimuthElevationFOVOverlay()
	 * @generated
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY = 26;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__NAME = AZIMUTH_ELEVATION_FOV_OVERLAY__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__DESCRIPTION = AZIMUTH_ELEVATION_FOV_OVERLAY__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__VISIBLE = AZIMUTH_ELEVATION_FOV_OVERLAY__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Overlay List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__CAMERA_OVERLAY_LIST = AZIMUTH_ELEVATION_FOV_OVERLAY__CAMERA_OVERLAY_LIST;

		/**
	 * The feature id for the '<em><b>Overlay Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__OVERLAY_ALIGNMENT = AZIMUTH_ELEVATION_FOV_OVERLAY__OVERLAY_ALIGNMENT;

		/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__LINE_WIDTH = AZIMUTH_ELEVATION_FOV_OVERLAY__LINE_WIDTH;

		/**
	 * The feature id for the '<em><b>Positive Values Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__POSITIVE_VALUES_COLOR = AZIMUTH_ELEVATION_FOV_OVERLAY__POSITIVE_VALUES_COLOR;

		/**
	 * The feature id for the '<em><b>Negative Value Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__NEGATIVE_VALUE_COLOR = AZIMUTH_ELEVATION_FOV_OVERLAY__NEGATIVE_VALUE_COLOR;

		/**
	 * The feature id for the '<em><b>Angle Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ANGLE_INTERVAL = AZIMUTH_ELEVATION_FOV_OVERLAY__ANGLE_INTERVAL;

		/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__FONT_NAME = AZIMUTH_ELEVATION_FOV_OVERLAY__FONT_NAME;

		/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__FONT_SIZE = AZIMUTH_ELEVATION_FOV_OVERLAY__FONT_SIZE;

		/**
	 * The feature id for the '<em><b>Azimuth Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_DIRECTION = AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_DIRECTION;

		/**
	 * The feature id for the '<em><b>Elevation Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_DIRECTION = AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_DIRECTION;

		/**
	 * The feature id for the '<em><b>Azimuth Feature Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE = AZIMUTH_ELEVATION_FOV_OVERLAY_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Elevation Feature Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE = AZIMUTH_ELEVATION_FOV_OVERLAY_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>EMF Feature Azimuth Elevation FOV Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY_FEATURE_COUNT = AZIMUTH_ELEVATION_FOV_OVERLAY_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY___DISPOSE = AZIMUTH_ELEVATION_FOV_OVERLAY___DISPOSE;

		/**
	 * The operation id for the '<em>Apply Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = AZIMUTH_ELEVATION_FOV_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT;

		/**
	 * The operation id for the '<em>Get Tool Tip Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT = AZIMUTH_ELEVATION_FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT;

		/**
	 * The operation id for the '<em>Change Azimuth</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_AZIMUTH__DOUBLE = AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_AZIMUTH__DOUBLE;

		/**
	 * The operation id for the '<em>Change Elevation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_ELEVATION__DOUBLE = AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_ELEVATION__DOUBLE;

		/**
	 * The number of operations of the '<em>EMF Feature Azimuth Elevation FOV Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY_OPERATION_COUNT = AZIMUTH_ELEVATION_FOV_OVERLAY_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthFeatureReferenceImpl <em>Azimuth Feature Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthFeatureReferenceImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getAzimuthFeatureReference()
	 * @generated
	 */
	int AZIMUTH_FEATURE_REFERENCE = 27;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_FEATURE_REFERENCE__NAME = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME;

		/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_FEATURE_REFERENCE__VARIABLE = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE;

		/**
	 * The feature id for the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT;

		/**
	 * The feature id for the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_FEATURE_REFERENCE__FEATURE_ROOT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT;

		/**
	 * The number of structural features of the '<em>Azimuth Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_FEATURE_REFERENCE_FEATURE_COUNT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 0;

		/**
	 * The number of operations of the '<em>Azimuth Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZIMUTH_FEATURE_REFERENCE_OPERATION_COUNT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ElevationFeatureReferenceImpl <em>Elevation Feature Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ElevationFeatureReferenceImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getElevationFeatureReference()
	 * @generated
	 */
	int ELEVATION_FEATURE_REFERENCE = 28;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_FEATURE_REFERENCE__NAME = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME;

		/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_FEATURE_REFERENCE__VARIABLE = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE;

		/**
	 * The feature id for the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT;

		/**
	 * The feature id for the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_FEATURE_REFERENCE__FEATURE_ROOT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT;

		/**
	 * The number of structural features of the '<em>Elevation Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_FEATURE_REFERENCE_FEATURE_COUNT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_FEATURE_COUNT + 0;

		/**
	 * The number of operations of the '<em>Elevation Feature Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_FEATURE_REFERENCE_OPERATION_COUNT = EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ToolTipTextProviderImpl <em>Tool Tip Text Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ToolTipTextProviderImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getToolTipTextProvider()
	 * @generated
	 */
	int TOOL_TIP_TEXT_PROVIDER = 29;

		/**
	 * The number of structural features of the '<em>Tool Tip Text Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TIP_TEXT_PROVIDER_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Tool Tip Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TIP_TEXT_PROVIDER___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT = 0;

		/**
	 * The number of operations of the '<em>Tool Tip Text Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_TIP_TEXT_PROVIDER_OPERATION_COUNT = 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolImpl <em>Camera Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraTool()
	 * @generated
	 */
	int CAMERA_TOOL = 30;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL__NAME = CAMERA_IMAGE_ANNOTATION__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL__DESCRIPTION = CAMERA_IMAGE_ANNOTATION__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL__VISIBLE = CAMERA_IMAGE_ANNOTATION__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL__CAMERA_TOOL_LIST = CAMERA_IMAGE_ANNOTATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Camera Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL_FEATURE_COUNT = CAMERA_IMAGE_ANNOTATION_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Initialize Camera</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL___INITIALIZE_CAMERA__ABSTRACTCAMERA = CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Update Image Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL___UPDATE_IMAGE_SNAPSHOT__IMAGESNAPSHOT = CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT + 1;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL___DISPOSE = CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT + 2;

		/**
	 * The operation id for the '<em>Mouse Moved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL___MOUSE_MOVED__ABSTRACTEIMAGE_INT_INT_INT = CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT + 3;

		/**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL___POSITION_SELECTED__ABSTRACTEIMAGE_INT_INT_INT = CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT + 4;

		/**
	 * The number of operations of the '<em>Camera Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL_OPERATION_COUNT = CAMERA_IMAGE_ANNOTATION_OPERATION_COUNT + 5;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolListImpl <em>Camera Tool List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolListImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraToolList()
	 * @generated
	 */
	int CAMERA_TOOL_LIST = 31;

		/**
	 * The feature id for the '<em><b>Camera View Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL_LIST__CAMERA_VIEW_CONFIGURATION = 0;

		/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL_LIST__TOOLS = 1;

		/**
	 * The number of structural features of the '<em>Camera Tool List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL_LIST_FEATURE_COUNT = 2;

		/**
	 * The number of operations of the '<em>Camera Tool List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TOOL_LIST_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.PointerCameraToolImpl <em>Pointer Camera Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.PointerCameraToolImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getPointerCameraTool()
	 * @generated
	 */
	int POINTER_CAMERA_TOOL = 32;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__NAME = CAMERA_TOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__DESCRIPTION = CAMERA_TOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__VISIBLE = CAMERA_TOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Camera Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__CAMERA_TOOL_LIST = CAMERA_TOOL__CAMERA_TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__POSE_TRANSFORM = CAMERA_TOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Fov</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__FOV = CAMERA_TOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__VECTOR_COLOR = CAMERA_TOOL_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Intersection Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE = CAMERA_TOOL_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Pointer Camera Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL_FEATURE_COUNT = CAMERA_TOOL_FEATURE_COUNT + 4;

		/**
	 * The operation id for the '<em>Initialize Camera</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL___INITIALIZE_CAMERA__ABSTRACTCAMERA = CAMERA_TOOL___INITIALIZE_CAMERA__ABSTRACTCAMERA;

		/**
	 * The operation id for the '<em>Update Image Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL___UPDATE_IMAGE_SNAPSHOT__IMAGESNAPSHOT = CAMERA_TOOL___UPDATE_IMAGE_SNAPSHOT__IMAGESNAPSHOT;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL___DISPOSE = CAMERA_TOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Mouse Moved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL___MOUSE_MOVED__ABSTRACTEIMAGE_INT_INT_INT = CAMERA_TOOL___MOUSE_MOVED__ABSTRACTEIMAGE_INT_INT_INT;

		/**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL___POSITION_SELECTED__ABSTRACTEIMAGE_INT_INT_INT = CAMERA_TOOL___POSITION_SELECTED__ABSTRACTEIMAGE_INT_INT_INT;

		/**
	 * The operation id for the '<em>Get Tool Tip Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT = CAMERA_TOOL_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Pointer Camera Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_CAMERA_TOOL_OPERATION_COUNT = CAMERA_TOOL_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment <em>Overlay Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getOverlayAlignment()
	 * @generated
	 */
  int OVERLAY_ALIGNMENT = 33;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy <em>Image Size Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageSizePolicy()
	 * @generated
	 */
	int IMAGE_SIZE_POLICY = 34;

		/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getColor3f()
	 * @generated
	 */
  int COLOR3F = 35;


  /**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 36;


		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities <em>Camera View Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera View Utilities</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities
	 * @generated
	 */
	EClass getCameraViewUtilities();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities#getCameraViewConfigurationIdentifier(org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration) <em>Get Camera View Configuration Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Camera View Configuration Identifier</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities#getCameraViewConfigurationIdentifier(org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration)
	 * @generated
	 */
	EOperation getCameraViewUtilities__GetCameraViewConfigurationIdentifier__CameraViewConfiguration();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities#getActiveCameraViewConfiguration(java.lang.String) <em>Get Active Camera View Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Camera View Configuration</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities#getActiveCameraViewConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getCameraViewUtilities__GetActiveCameraViewConfiguration__String();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities#getActiveCameraViewConfigurationList() <em>Get Active Camera View Configuration List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Camera View Configuration List</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities#getActiveCameraViewConfigurationList()
	 * @generated
	 */
	EOperation getCameraViewUtilities__GetActiveCameraViewConfigurationList();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList <em>Camera View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera View Configuration List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList
	 * @generated
	 */
  EClass getCameraViewConfigurationList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList#getCameraViewConfigurations <em>Camera View Configurations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Camera View Configurations</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList#getCameraViewConfigurations()
	 * @see #getCameraViewConfigurationList()
	 * @generated
	 */
  EReference getCameraViewConfigurationList_CameraViewConfigurations();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera View Configuration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration
	 * @generated
	 */
  EClass getCameraViewConfiguration();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getCameraViewConfigurationList <em>Camera View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Camera View Configuration List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getCameraViewConfigurationList()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	EReference getCameraViewConfiguration_CameraViewConfigurationList();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Camera</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getCamera()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
  EReference getCameraViewConfiguration_Camera();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageWidth <em>Image Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Width</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageWidth()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
  EAttribute getCameraViewConfiguration_ImageWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageHeight <em>Image Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Height</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageHeight()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
  EAttribute getCameraViewConfiguration_ImageHeight();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageCount <em>Image Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Count</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageCount()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	EAttribute getCameraViewConfiguration_ImageCount();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#isDisplayRectifiedImage <em>Display Rectified Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Rectified Image</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#isDisplayRectifiedImage()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
  EAttribute getCameraViewConfiguration_DisplayRectifiedImage();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getOverlayList <em>Overlay List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overlay List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getOverlayList()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
  EReference getCameraViewConfiguration_OverlayList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getToolList <em>Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getToolList()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	EReference getCameraViewConfiguration_ToolList();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getFilterList <em>Filter List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getFilterList()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
  EReference getCameraViewConfiguration_FilterList();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#isImageAutoSaveEnable <em>Image Auto Save Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Auto Save Enable</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#isImageAutoSaveEnable()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	EAttribute getCameraViewConfiguration_ImageAutoSaveEnable();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#isSaveImageWithOverlays <em>Save Image With Overlays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Image With Overlays</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#isSaveImageWithOverlays()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	EAttribute getCameraViewConfiguration_SaveImageWithOverlays();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageAutoSaveFolderPath <em>Image Auto Save Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Auto Save Folder Path</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getImageAutoSaveFolderPath()
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	EAttribute getCameraViewConfiguration_ImageAutoSaveFolderPath();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getCameraImageAnnotations() <em>Get Camera Image Annotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Camera Image Annotations</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getCameraImageAnnotations()
	 * @generated
	 */
	EOperation getCameraViewConfiguration__GetCameraImageAnnotations();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FilterList <em>Filter List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FilterList
	 * @generated
	 */
  EClass getFilterList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FilterList#getCameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Camera View Configuration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FilterList#getCameraViewConfiguration()
	 * @see #getFilterList()
	 * @generated
	 */
	EReference getFilterList_CameraViewConfiguration();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FilterList#getImageFilters <em>Image Filters</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Filters</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FilterList#getImageFilters()
	 * @see #getFilterList()
	 * @generated
	 */
  EReference getFilterList_ImageFilters();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter <em>Image Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter
	 * @generated
	 */
  EClass getImageFilter();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter#isEnabled()
	 * @see #getImageFilter()
	 * @generated
	 */
  EAttribute getImageFilter_Enabled();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter#filter(ca.gc.space.mrt.sensors.imaging.AbstractCamera, org.eclipse.symphony.common.images.AbstractEImage) <em>Filter</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter#filter(ca.gc.space.mrt.sensors.imaging.AbstractCamera, org.eclipse.symphony.common.images.AbstractEImage)
	 * @generated
	 */
  EOperation getImageFilter__Filter__AbstractCamera_AbstractEImage();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter#dispose()
	 * @generated
	 */
	EOperation getImageFilter__Dispose();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.GrayScaleFilter <em>Gray Scale Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gray Scale Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.GrayScaleFilter
	 * @generated
	 */
  EClass getGrayScaleFilter();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EdgeFilter <em>Edge Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EdgeFilter
	 * @generated
	 */
  EClass getEdgeFilter();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter <em>Contrast And Brightness Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrast And Brightness Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter
	 * @generated
	 */
  EClass getContrastAndBrightnessFilter();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter#getContrast <em>Contrast</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrast</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter#getContrast()
	 * @see #getContrastAndBrightnessFilter()
	 * @generated
	 */
  EAttribute getContrastAndBrightnessFilter_Contrast();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter#getBrightness <em>Brightness</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brightness</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter#getBrightness()
	 * @see #getContrastAndBrightnessFilter()
	 * @generated
	 */
  EAttribute getContrastAndBrightnessFilter_Brightness();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter <em>Exposure Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposure Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter
	 * @generated
	 */
  EClass getExposureFilter();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter#getExposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ExposureFilter#getExposure()
	 * @see #getExposureFilter()
	 * @generated
	 */
  EAttribute getExposureFilter_Exposure();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter <em>Gain Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gain Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter
	 * @generated
	 */
  EClass getGainFilter();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter#getGain <em>Gain</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gain</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter#getGain()
	 * @see #getGainFilter()
	 * @generated
	 */
  EAttribute getGainFilter_Gain();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter#getBias <em>Bias</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bias</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.GainFilter#getBias()
	 * @see #getGainFilter()
	 * @generated
	 */
  EAttribute getGainFilter_Bias();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.InvertFilter <em>Invert Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invert Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.InvertFilter
	 * @generated
	 */
  EClass getInvertFilter();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter <em>Rescale Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescale Filter</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter
	 * @generated
	 */
  EClass getRescaleFilter();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.RescaleFilter#getScale()
	 * @see #getRescaleFilter()
	 * @generated
	 */
  EAttribute getRescaleFilter_Scale();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation <em>Camera Image Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Image Annotation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation
	 * @generated
	 */
	EClass getCameraImageAnnotation();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation#isVisible()
	 * @see #getCameraImageAnnotation()
	 * @generated
	 */
	EAttribute getCameraImageAnnotation_Visible();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation#dispose()
	 * @generated
	 */
	EOperation getCameraImageAnnotation__Dispose();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList <em>Camera Overlay List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Overlay List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList
	 * @generated
	 */
  EClass getCameraOverlayList();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getCameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Camera View Configuration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getCameraViewConfiguration()
	 * @see #getCameraOverlayList()
	 * @generated
	 */
	EReference getCameraOverlayList_CameraViewConfiguration();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getOverlays <em>Overlays</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Overlays</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getOverlays()
	 * @see #getCameraOverlayList()
	 * @generated
	 */
  EReference getCameraOverlayList_Overlays();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay <em>Camera Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay
	 * @generated
	 */
  EClass getCameraOverlay();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getCameraOverlayList <em>Camera Overlay List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Camera Overlay List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getCameraOverlayList()
	 * @see #getCameraOverlay()
	 * @generated
	 */
	EReference getCameraOverlay_CameraOverlayList();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getOverlayAlignment <em>Overlay Alignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlay Alignment</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getOverlayAlignment()
	 * @see #getCameraOverlay()
	 * @generated
	 */
  EAttribute getCameraOverlay_OverlayAlignment();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.DrawnCameraOverlay <em>Drawn Camera Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawn Camera Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.DrawnCameraOverlay
	 * @generated
	 */
  EClass getDrawnCameraOverlay();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.DrawnCameraOverlay#applyOverlay(ca.gc.space.mrt.sensors.imaging.AbstractCamera, org.eclipse.symphony.common.images.AbstractEImage, org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment, int, int) <em>Apply Overlay</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Overlay</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.DrawnCameraOverlay#applyOverlay(ca.gc.space.mrt.sensors.imaging.AbstractCamera, org.eclipse.symphony.common.images.AbstractEImage, org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment, int, int)
	 * @generated
	 */
  EOperation getDrawnCameraOverlay__ApplyOverlay__AbstractCamera_AbstractEImage_OverlayAlignment_int_int();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay <em>Abstract Text Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Text Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay
	 * @generated
	 */
  EClass getAbstractTextOverlay();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getFontName()
	 * @see #getAbstractTextOverlay()
	 * @generated
	 */
  EAttribute getAbstractTextOverlay_FontName();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getFontSize()
	 * @see #getAbstractTextOverlay()
	 * @generated
	 */
  EAttribute getAbstractTextOverlay_FontSize();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getHorizontalOffset <em>Horizontal Offset</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Offset</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getHorizontalOffset()
	 * @see #getAbstractTextOverlay()
	 * @generated
	 */
  EAttribute getAbstractTextOverlay_HorizontalOffset();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getVerticalOffset <em>Vertical Offset</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Offset</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getVerticalOffset()
	 * @see #getAbstractTextOverlay()
	 * @generated
	 */
  EAttribute getAbstractTextOverlay_VerticalOffset();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getTextColor()
	 * @see #getAbstractTextOverlay()
	 * @generated
	 */
  EAttribute getAbstractTextOverlay_TextColor();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getDisplayedString() <em>Get Displayed String</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Displayed String</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AbstractTextOverlay#getDisplayedString()
	 * @generated
	 */
  EOperation getAbstractTextOverlay__GetDisplayedString();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay <em>EMF Feature Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Feature Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay
	 * @generated
	 */
  EClass getEMFFeatureOverlay();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Feature Reference</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReference()
	 * @see #getEMFFeatureOverlay()
	 * @generated
	 */
  EReference getEMFFeatureOverlay_VariableFeatureReference();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getNumberFormat <em>Number Format</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Format</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getNumberFormat()
	 * @see #getEMFFeatureOverlay()
	 * @generated
	 */
  EAttribute getEMFFeatureOverlay_NumberFormat();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReferenceChangeCount <em>Variable Feature Reference Change Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Feature Reference Change Count</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureOverlay#getVariableFeatureReferenceChangeCount()
	 * @see #getEMFFeatureOverlay()
	 * @generated
	 */
	EAttribute getEMFFeatureOverlay_VariableFeatureReferenceChangeCount();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraNameOverlay <em>Camera Name Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Name Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraNameOverlay
	 * @generated
	 */
  EClass getCameraNameOverlay();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay <em>Image Count Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Count Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay
	 * @generated
	 */
	EClass getImageCountOverlay();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay#isIndicatorVisible <em>Indicator Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay#isIndicatorVisible()
	 * @see #getImageCountOverlay()
	 * @generated
	 */
	EAttribute getImageCountOverlay_IndicatorVisible();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay <em>Image Frozen Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Frozen Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay
	 * @generated
	 */
	EClass getImageFrozenOverlay();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay#isFrozen <em>Frozen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frozen</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay#isFrozen()
	 * @see #getImageFrozenOverlay()
	 * @generated
	 */
	EAttribute getImageFrozenOverlay_Frozen();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay#getExpectedImageUpdatePeriod <em>Expected Image Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Image Update Period</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay#getExpectedImageUpdatePeriod()
	 * @see #getImageFrozenOverlay()
	 * @generated
	 */
	EAttribute getImageFrozenOverlay_ExpectedImageUpdatePeriod();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay#getFrozenMessage <em>Frozen Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frozen Message</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay#getFrozenMessage()
	 * @see #getImageFrozenOverlay()
	 * @generated
	 */
	EAttribute getImageFrozenOverlay_FrozenMessage();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageCameraOverlay <em>Image Camera Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Camera Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageCameraOverlay
	 * @generated
	 */
  EClass getImageCameraOverlay();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageCameraOverlay#getOverlay(ca.gc.space.mrt.sensors.imaging.AbstractCamera, org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment, int, int) <em>Get Overlay</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Overlay</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageCameraOverlay#getOverlay(ca.gc.space.mrt.sensors.imaging.AbstractCamera, org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment, int, int)
	 * @generated
	 */
  EOperation getImageCameraOverlay__GetOverlay__AbstractCamera_OverlayAlignment_int_int();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay <em>URL Image Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Image Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay
	 * @generated
	 */
	EClass getURLImageOverlay();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay#getUrl()
	 * @see #getURLImageOverlay()
	 * @generated
	 */
	EAttribute getURLImageOverlay_Url();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay#getImageSizePolicy <em>Image Size Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Size Policy</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay#getImageSizePolicy()
	 * @see #getURLImageOverlay()
	 * @generated
	 */
	EAttribute getURLImageOverlay_ImageSizePolicy();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.URLImageOverlay#getImage()
	 * @see #getURLImageOverlay()
	 * @generated
	 */
	EReference getURLImageOverlay_Image();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyLogoOverlay <em>Symphony Logo Overlay</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symphony Logo Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyLogoOverlay
	 * @generated
	 */
  EClass getSymphonyLogoOverlay();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay <em>FOV Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FOV Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay
	 * @generated
	 */
	EClass getFOVOverlay();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getLineWidth()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_LineWidth();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getPositiveValuesColor <em>Positive Values Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Values Color</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getPositiveValuesColor()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_PositiveValuesColor();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getNegativeValueColor <em>Negative Value Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Value Color</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getNegativeValueColor()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_NegativeValueColor();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getAngleInterval <em>Angle Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle Interval</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getAngleInterval()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_AngleInterval();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getFontName()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_FontName();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getFontSize()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_FontSize();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getAzimuthDirection <em>Azimuth Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Direction</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getAzimuthDirection()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_AzimuthDirection();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getElevationDirection <em>Elevation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation Direction</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.FOVOverlay#getElevationDirection()
	 * @see #getFOVOverlay()
	 * @generated
	 */
	EAttribute getFOVOverlay_ElevationDirection();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay <em>Azimuth Elevation FOV Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Azimuth Elevation FOV Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay
	 * @generated
	 */
	EClass getAzimuthElevationFOVOverlay();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay#changeAzimuth(double) <em>Change Azimuth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Azimuth</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay#changeAzimuth(double)
	 * @generated
	 */
	EOperation getAzimuthElevationFOVOverlay__ChangeAzimuth__double();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay#changeElevation(double) <em>Change Elevation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Elevation</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay#changeElevation(double)
	 * @generated
	 */
	EOperation getAzimuthElevationFOVOverlay__ChangeElevation__double();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay <em>EMF Feature Azimuth Elevation FOV Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Feature Azimuth Elevation FOV Overlay</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay
	 * @generated
	 */
	EClass getEMFFeatureAzimuthElevationFOVOverlay();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getAzimuthFeatureReference <em>Azimuth Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Azimuth Feature Reference</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getAzimuthFeatureReference()
	 * @see #getEMFFeatureAzimuthElevationFOVOverlay()
	 * @generated
	 */
	EReference getEMFFeatureAzimuthElevationFOVOverlay_AzimuthFeatureReference();

		/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getElevationFeatureReference <em>Elevation Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elevation Feature Reference</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getElevationFeatureReference()
	 * @see #getEMFFeatureAzimuthElevationFOVOverlay()
	 * @generated
	 */
	EReference getEMFFeatureAzimuthElevationFOVOverlay_ElevationFeatureReference();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthFeatureReference <em>Azimuth Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Azimuth Feature Reference</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthFeatureReference
	 * @generated
	 */
	EClass getAzimuthFeatureReference();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ElevationFeatureReference <em>Elevation Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevation Feature Reference</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ElevationFeatureReference
	 * @generated
	 */
	EClass getElevationFeatureReference();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider <em>Tool Tip Text Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Tip Text Provider</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider
	 * @generated
	 */
	EClass getToolTipTextProvider();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider#getToolTipText(ca.gc.space.mrt.sensors.imaging.AbstractCamera, ca.gc.space.mrt.sensors.imaging.ImageSnapshot, int, int, int) <em>Get Tool Tip Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tool Tip Text</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ToolTipTextProvider#getToolTipText(ca.gc.space.mrt.sensors.imaging.AbstractCamera, ca.gc.space.mrt.sensors.imaging.ImageSnapshot, int, int, int)
	 * @generated
	 */
	EOperation getToolTipTextProvider__GetToolTipText__AbstractCamera_ImageSnapshot_int_int_int();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool <em>Camera Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Tool</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool
	 * @generated
	 */
	EClass getCameraTool();

		/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#getCameraToolList <em>Camera Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Camera Tool List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#getCameraToolList()
	 * @see #getCameraTool()
	 * @generated
	 */
	EReference getCameraTool_CameraToolList();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#initializeCamera(ca.gc.space.mrt.sensors.imaging.AbstractCamera) <em>Initialize Camera</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Camera</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#initializeCamera(ca.gc.space.mrt.sensors.imaging.AbstractCamera)
	 * @generated
	 */
	EOperation getCameraTool__InitializeCamera__AbstractCamera();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#updateImageSnapshot(ca.gc.space.mrt.sensors.imaging.ImageSnapshot) <em>Update Image Snapshot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Image Snapshot</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#updateImageSnapshot(ca.gc.space.mrt.sensors.imaging.ImageSnapshot)
	 * @generated
	 */
	EOperation getCameraTool__UpdateImageSnapshot__ImageSnapshot();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#dispose()
	 * @generated
	 */
	EOperation getCameraTool__Dispose();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#mouseMoved(org.eclipse.symphony.common.images.AbstractEImage, int, int, int) <em>Mouse Moved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mouse Moved</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#mouseMoved(org.eclipse.symphony.common.images.AbstractEImage, int, int, int)
	 * @generated
	 */
	EOperation getCameraTool__MouseMoved__AbstractEImage_int_int_int();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#positionSelected(org.eclipse.symphony.common.images.AbstractEImage, int, int, int) <em>Position Selected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Position Selected</em>' operation.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#positionSelected(org.eclipse.symphony.common.images.AbstractEImage, int, int, int)
	 * @generated
	 */
	EOperation getCameraTool__PositionSelected__AbstractEImage_int_int_int();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList <em>Camera Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Tool List</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList
	 * @generated
	 */
	EClass getCameraToolList();

		/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getCameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Camera View Configuration</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getCameraViewConfiguration()
	 * @see #getCameraToolList()
	 * @generated
	 */
	EReference getCameraToolList_CameraViewConfiguration();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getTools()
	 * @see #getCameraToolList()
	 * @generated
	 */
	EReference getCameraToolList_Tools();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool <em>Pointer Camera Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Camera Tool</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool
	 * @generated
	 */
	EClass getPointerCameraTool();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool#getFov <em>Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fov</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool#getFov()
	 * @see #getPointerCameraTool()
	 * @generated
	 */
	EReference getPointerCameraTool_Fov();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool#getVectorColor <em>Vector Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Color</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool#getVectorColor()
	 * @see #getPointerCameraTool()
	 * @generated
	 */
	EAttribute getPointerCameraTool_VectorColor();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool#getIntersectionDistance <em>Intersection Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intersection Distance</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.PointerCameraTool#getIntersectionDistance()
	 * @see #getPointerCameraTool()
	 * @generated
	 */
	EAttribute getPointerCameraTool_IntersectionDistance();

		/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment <em>Overlay Alignment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overlay Alignment</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment
	 * @generated
	 */
  EEnum getOverlayAlignment();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy <em>Image Size Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Size Policy</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy
	 * @generated
	 */
	EEnum getImageSizePolicy();

		/**
	 * Returns the meta object for data type '{@link javax.vecmath.Color3f <em>Color3f</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color3f</em>'.
	 * @see javax.vecmath.Color3f
	 * @model instanceClass="javax.vecmath.Color3f"
	 * @generated
	 */
  EDataType getColor3f();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  SymphonyCameraToolsFactory getSymphonyCameraToolsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewUtilitiesImpl <em>Camera View Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewUtilitiesImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraViewUtilities()
		 * @generated
		 */
		EClass CAMERA_VIEW_UTILITIES = eINSTANCE.getCameraViewUtilities();
			/**
		 * The meta object literal for the '<em><b>Get Camera View Configuration Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_VIEW_UTILITIES___GET_CAMERA_VIEW_CONFIGURATION_IDENTIFIER__CAMERAVIEWCONFIGURATION = eINSTANCE.getCameraViewUtilities__GetCameraViewConfigurationIdentifier__CameraViewConfiguration();
			/**
		 * The meta object literal for the '<em><b>Get Active Camera View Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION__STRING = eINSTANCE.getCameraViewUtilities__GetActiveCameraViewConfiguration__String();
			/**
		 * The meta object literal for the '<em><b>Get Active Camera View Configuration List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION_LIST = eINSTANCE.getCameraViewUtilities__GetActiveCameraViewConfigurationList();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationListImpl <em>Camera View Configuration List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationListImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraViewConfigurationList()
		 * @generated
		 */
    EClass CAMERA_VIEW_CONFIGURATION_LIST = eINSTANCE.getCameraViewConfigurationList();
    /**
		 * The meta object literal for the '<em><b>Camera View Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS = eINSTANCE.getCameraViewConfigurationList_CameraViewConfigurations();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationImpl <em>Camera View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraViewConfigurationImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraViewConfiguration()
		 * @generated
		 */
    EClass CAMERA_VIEW_CONFIGURATION = eINSTANCE.getCameraViewConfiguration();
    /**
		 * The meta object literal for the '<em><b>Camera View Configuration List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST = eINSTANCE.getCameraViewConfiguration_CameraViewConfigurationList();
				/**
		 * The meta object literal for the '<em><b>Camera</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CAMERA_VIEW_CONFIGURATION__CAMERA = eINSTANCE.getCameraViewConfiguration_Camera();
    /**
		 * The meta object literal for the '<em><b>Image Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH = eINSTANCE.getCameraViewConfiguration_ImageWidth();
    /**
		 * The meta object literal for the '<em><b>Image Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT = eINSTANCE.getCameraViewConfiguration_ImageHeight();
    /**
		 * The meta object literal for the '<em><b>Image Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT = eINSTANCE.getCameraViewConfiguration_ImageCount();
				/**
		 * The meta object literal for the '<em><b>Display Rectified Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE = eINSTANCE.getCameraViewConfiguration_DisplayRectifiedImage();
    /**
		 * The meta object literal for the '<em><b>Overlay List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST = eINSTANCE.getCameraViewConfiguration_OverlayList();
    /**
		 * The meta object literal for the '<em><b>Tool List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_VIEW_CONFIGURATION__TOOL_LIST = eINSTANCE.getCameraViewConfiguration_ToolList();
				/**
		 * The meta object literal for the '<em><b>Filter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CAMERA_VIEW_CONFIGURATION__FILTER_LIST = eINSTANCE.getCameraViewConfiguration_FilterList();
    /**
		 * The meta object literal for the '<em><b>Image Auto Save Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE = eINSTANCE.getCameraViewConfiguration_ImageAutoSaveEnable();
				/**
		 * The meta object literal for the '<em><b>Save Image With Overlays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS = eINSTANCE.getCameraViewConfiguration_SaveImageWithOverlays();
				/**
		 * The meta object literal for the '<em><b>Image Auto Save Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH = eINSTANCE.getCameraViewConfiguration_ImageAutoSaveFolderPath();
				/**
		 * The meta object literal for the '<em><b>Get Camera Image Annotations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_VIEW_CONFIGURATION___GET_CAMERA_IMAGE_ANNOTATIONS = eINSTANCE.getCameraViewConfiguration__GetCameraImageAnnotations();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.FilterListImpl <em>Filter List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.FilterListImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getFilterList()
		 * @generated
		 */
    EClass FILTER_LIST = eINSTANCE.getFilterList();
    /**
		 * The meta object literal for the '<em><b>Camera View Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_LIST__CAMERA_VIEW_CONFIGURATION = eINSTANCE.getFilterList_CameraViewConfiguration();
				/**
		 * The meta object literal for the '<em><b>Image Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FILTER_LIST__IMAGE_FILTERS = eINSTANCE.getFilterList_ImageFilters();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFilterImpl <em>Image Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageFilter()
		 * @generated
		 */
    EClass IMAGE_FILTER = eINSTANCE.getImageFilter();
    /**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_FILTER__ENABLED = eINSTANCE.getImageFilter_Enabled();
    /**
		 * The meta object literal for the '<em><b>Filter</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation IMAGE_FILTER___FILTER__ABSTRACTCAMERA_ABSTRACTEIMAGE = eINSTANCE.getImageFilter__Filter__AbstractCamera_AbstractEImage();
    /**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_FILTER___DISPOSE = eINSTANCE.getImageFilter__Dispose();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.GrayScaleFilterImpl <em>Gray Scale Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.GrayScaleFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getGrayScaleFilter()
		 * @generated
		 */
    EClass GRAY_SCALE_FILTER = eINSTANCE.getGrayScaleFilter();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.EdgeFilterImpl <em>Edge Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.EdgeFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getEdgeFilter()
		 * @generated
		 */
    EClass EDGE_FILTER = eINSTANCE.getEdgeFilter();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ContrastAndBrightnessFilterImpl <em>Contrast And Brightness Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ContrastAndBrightnessFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getContrastAndBrightnessFilter()
		 * @generated
		 */
    EClass CONTRAST_AND_BRIGHTNESS_FILTER = eINSTANCE.getContrastAndBrightnessFilter();
    /**
		 * The meta object literal for the '<em><b>Contrast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST = eINSTANCE.getContrastAndBrightnessFilter_Contrast();
    /**
		 * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS = eINSTANCE.getContrastAndBrightnessFilter_Brightness();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ExposureFilterImpl <em>Exposure Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ExposureFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getExposureFilter()
		 * @generated
		 */
    EClass EXPOSURE_FILTER = eINSTANCE.getExposureFilter();
    /**
		 * The meta object literal for the '<em><b>Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EXPOSURE_FILTER__EXPOSURE = eINSTANCE.getExposureFilter_Exposure();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.GainFilterImpl <em>Gain Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.GainFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getGainFilter()
		 * @generated
		 */
    EClass GAIN_FILTER = eINSTANCE.getGainFilter();
    /**
		 * The meta object literal for the '<em><b>Gain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GAIN_FILTER__GAIN = eINSTANCE.getGainFilter_Gain();
    /**
		 * The meta object literal for the '<em><b>Bias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute GAIN_FILTER__BIAS = eINSTANCE.getGainFilter_Bias();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.InvertFilterImpl <em>Invert Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.InvertFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getInvertFilter()
		 * @generated
		 */
    EClass INVERT_FILTER = eINSTANCE.getInvertFilter();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.RescaleFilterImpl <em>Rescale Filter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.RescaleFilterImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getRescaleFilter()
		 * @generated
		 */
    EClass RESCALE_FILTER = eINSTANCE.getRescaleFilter();
    /**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RESCALE_FILTER__SCALE = eINSTANCE.getRescaleFilter_Scale();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraImageAnnotationImpl <em>Camera Image Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraImageAnnotationImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraImageAnnotation()
		 * @generated
		 */
		EClass CAMERA_IMAGE_ANNOTATION = eINSTANCE.getCameraImageAnnotation();
				/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_IMAGE_ANNOTATION__VISIBLE = eINSTANCE.getCameraImageAnnotation_Visible();
				/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_IMAGE_ANNOTATION___DISPOSE = eINSTANCE.getCameraImageAnnotation__Dispose();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayListImpl <em>Camera Overlay List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayListImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraOverlayList()
		 * @generated
		 */
    EClass CAMERA_OVERLAY_LIST = eINSTANCE.getCameraOverlayList();
    /**
		 * The meta object literal for the '<em><b>Camera View Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION = eINSTANCE.getCameraOverlayList_CameraViewConfiguration();
				/**
		 * The meta object literal for the '<em><b>Overlays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CAMERA_OVERLAY_LIST__OVERLAYS = eINSTANCE.getCameraOverlayList_Overlays();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayImpl <em>Camera Overlay</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraOverlay()
		 * @generated
		 */
    EClass CAMERA_OVERLAY = eINSTANCE.getCameraOverlay();
    /**
		 * The meta object literal for the '<em><b>Camera Overlay List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_OVERLAY__CAMERA_OVERLAY_LIST = eINSTANCE.getCameraOverlay_CameraOverlayList();
				/**
		 * The meta object literal for the '<em><b>Overlay Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CAMERA_OVERLAY__OVERLAY_ALIGNMENT = eINSTANCE.getCameraOverlay_OverlayAlignment();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.DrawnCameraOverlayImpl <em>Drawn Camera Overlay</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.DrawnCameraOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getDrawnCameraOverlay()
		 * @generated
		 */
    EClass DRAWN_CAMERA_OVERLAY = eINSTANCE.getDrawnCameraOverlay();
    /**
		 * The meta object literal for the '<em><b>Apply Overlay</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation DRAWN_CAMERA_OVERLAY___APPLY_OVERLAY__ABSTRACTCAMERA_ABSTRACTEIMAGE_OVERLAYALIGNMENT_INT_INT = eINSTANCE.getDrawnCameraOverlay__ApplyOverlay__AbstractCamera_AbstractEImage_OverlayAlignment_int_int();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.AbstractTextOverlayImpl <em>Abstract Text Overlay</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.AbstractTextOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getAbstractTextOverlay()
		 * @generated
		 */
    EClass ABSTRACT_TEXT_OVERLAY = eINSTANCE.getAbstractTextOverlay();
    /**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TEXT_OVERLAY__FONT_NAME = eINSTANCE.getAbstractTextOverlay_FontName();
    /**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TEXT_OVERLAY__FONT_SIZE = eINSTANCE.getAbstractTextOverlay_FontSize();
    /**
		 * The meta object literal for the '<em><b>Horizontal Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET = eINSTANCE.getAbstractTextOverlay_HorizontalOffset();
    /**
		 * The meta object literal for the '<em><b>Vertical Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET = eINSTANCE.getAbstractTextOverlay_VerticalOffset();
    /**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TEXT_OVERLAY__TEXT_COLOR = eINSTANCE.getAbstractTextOverlay_TextColor();
    /**
		 * The meta object literal for the '<em><b>Get Displayed String</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING = eINSTANCE.getAbstractTextOverlay__GetDisplayedString();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureOverlayImpl <em>EMF Feature Overlay</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getEMFFeatureOverlay()
		 * @generated
		 */
    EClass EMF_FEATURE_OVERLAY = eINSTANCE.getEMFFeatureOverlay();
    /**
		 * The meta object literal for the '<em><b>Variable Feature Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE = eINSTANCE.getEMFFeatureOverlay_VariableFeatureReference();
    /**
		 * The meta object literal for the '<em><b>Number Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EMF_FEATURE_OVERLAY__NUMBER_FORMAT = eINSTANCE.getEMFFeatureOverlay_NumberFormat();
    /**
		 * The meta object literal for the '<em><b>Variable Feature Reference Change Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT = eINSTANCE.getEMFFeatureOverlay_VariableFeatureReferenceChangeCount();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraNameOverlayImpl <em>Camera Name Overlay</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraNameOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraNameOverlay()
		 * @generated
		 */
    EClass CAMERA_NAME_OVERLAY = eINSTANCE.getCameraNameOverlay();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCountOverlayImpl <em>Image Count Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCountOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageCountOverlay()
		 * @generated
		 */
		EClass IMAGE_COUNT_OVERLAY = eINSTANCE.getImageCountOverlay();
				/**
		 * The meta object literal for the '<em><b>Indicator Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE = eINSTANCE.getImageCountOverlay_IndicatorVisible();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFrozenOverlayImpl <em>Image Frozen Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageFrozenOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageFrozenOverlay()
		 * @generated
		 */
		EClass IMAGE_FROZEN_OVERLAY = eINSTANCE.getImageFrozenOverlay();
				/**
		 * The meta object literal for the '<em><b>Frozen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_FROZEN_OVERLAY__FROZEN = eINSTANCE.getImageFrozenOverlay_Frozen();
				/**
		 * The meta object literal for the '<em><b>Expected Image Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD = eINSTANCE.getImageFrozenOverlay_ExpectedImageUpdatePeriod();
				/**
		 * The meta object literal for the '<em><b>Frozen Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE = eINSTANCE.getImageFrozenOverlay_FrozenMessage();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCameraOverlayImpl <em>Image Camera Overlay</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCameraOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageCameraOverlay()
		 * @generated
		 */
    EClass IMAGE_CAMERA_OVERLAY = eINSTANCE.getImageCameraOverlay();
    /**
		 * The meta object literal for the '<em><b>Get Overlay</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation IMAGE_CAMERA_OVERLAY___GET_OVERLAY__ABSTRACTCAMERA_OVERLAYALIGNMENT_INT_INT = eINSTANCE.getImageCameraOverlay__GetOverlay__AbstractCamera_OverlayAlignment_int_int();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.URLImageOverlayImpl <em>URL Image Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.URLImageOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getURLImageOverlay()
		 * @generated
		 */
		EClass URL_IMAGE_OVERLAY = eINSTANCE.getURLImageOverlay();
				/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_IMAGE_OVERLAY__URL = eINSTANCE.getURLImageOverlay_Url();
				/**
		 * The meta object literal for the '<em><b>Image Size Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY = eINSTANCE.getURLImageOverlay_ImageSizePolicy();
				/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL_IMAGE_OVERLAY__IMAGE = eINSTANCE.getURLImageOverlay_Image();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyLogoOverlayImpl <em>Symphony Logo Overlay</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyLogoOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getSymphonyLogoOverlay()
		 * @generated
		 */
    EClass SYMPHONY_LOGO_OVERLAY = eINSTANCE.getSymphonyLogoOverlay();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.FOVOverlayImpl <em>FOV Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.FOVOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getFOVOverlay()
		 * @generated
		 */
		EClass FOV_OVERLAY = eINSTANCE.getFOVOverlay();
				/**
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__LINE_WIDTH = eINSTANCE.getFOVOverlay_LineWidth();
				/**
		 * The meta object literal for the '<em><b>Positive Values Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__POSITIVE_VALUES_COLOR = eINSTANCE.getFOVOverlay_PositiveValuesColor();
				/**
		 * The meta object literal for the '<em><b>Negative Value Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__NEGATIVE_VALUE_COLOR = eINSTANCE.getFOVOverlay_NegativeValueColor();
				/**
		 * The meta object literal for the '<em><b>Angle Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__ANGLE_INTERVAL = eINSTANCE.getFOVOverlay_AngleInterval();
				/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__FONT_NAME = eINSTANCE.getFOVOverlay_FontName();
				/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__FONT_SIZE = eINSTANCE.getFOVOverlay_FontSize();
				/**
		 * The meta object literal for the '<em><b>Azimuth Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__AZIMUTH_DIRECTION = eINSTANCE.getFOVOverlay_AzimuthDirection();
				/**
		 * The meta object literal for the '<em><b>Elevation Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOV_OVERLAY__ELEVATION_DIRECTION = eINSTANCE.getFOVOverlay_ElevationDirection();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthElevationFOVOverlayImpl <em>Azimuth Elevation FOV Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthElevationFOVOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getAzimuthElevationFOVOverlay()
		 * @generated
		 */
		EClass AZIMUTH_ELEVATION_FOV_OVERLAY = eINSTANCE.getAzimuthElevationFOVOverlay();
				/**
		 * The meta object literal for the '<em><b>Change Azimuth</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_AZIMUTH__DOUBLE = eINSTANCE.getAzimuthElevationFOVOverlay__ChangeAzimuth__double();
				/**
		 * The meta object literal for the '<em><b>Change Elevation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_ELEVATION__DOUBLE = eINSTANCE.getAzimuthElevationFOVOverlay__ChangeElevation__double();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureAzimuthElevationFOVOverlayImpl <em>EMF Feature Azimuth Elevation FOV Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.EMFFeatureAzimuthElevationFOVOverlayImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getEMFFeatureAzimuthElevationFOVOverlay()
		 * @generated
		 */
		EClass EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY = eINSTANCE.getEMFFeatureAzimuthElevationFOVOverlay();
				/**
		 * The meta object literal for the '<em><b>Azimuth Feature Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE = eINSTANCE.getEMFFeatureAzimuthElevationFOVOverlay_AzimuthFeatureReference();
				/**
		 * The meta object literal for the '<em><b>Elevation Feature Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE = eINSTANCE.getEMFFeatureAzimuthElevationFOVOverlay_ElevationFeatureReference();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthFeatureReferenceImpl <em>Azimuth Feature Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.AzimuthFeatureReferenceImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getAzimuthFeatureReference()
		 * @generated
		 */
		EClass AZIMUTH_FEATURE_REFERENCE = eINSTANCE.getAzimuthFeatureReference();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ElevationFeatureReferenceImpl <em>Elevation Feature Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ElevationFeatureReferenceImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getElevationFeatureReference()
		 * @generated
		 */
		EClass ELEVATION_FEATURE_REFERENCE = eINSTANCE.getElevationFeatureReference();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ToolTipTextProviderImpl <em>Tool Tip Text Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.ToolTipTextProviderImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getToolTipTextProvider()
		 * @generated
		 */
		EClass TOOL_TIP_TEXT_PROVIDER = eINSTANCE.getToolTipTextProvider();
				/**
		 * The meta object literal for the '<em><b>Get Tool Tip Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOOL_TIP_TEXT_PROVIDER___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT = eINSTANCE.getToolTipTextProvider__GetToolTipText__AbstractCamera_ImageSnapshot_int_int_int();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolImpl <em>Camera Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraTool()
		 * @generated
		 */
		EClass CAMERA_TOOL = eINSTANCE.getCameraTool();
				/**
		 * The meta object literal for the '<em><b>Camera Tool List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_TOOL__CAMERA_TOOL_LIST = eINSTANCE.getCameraTool_CameraToolList();
				/**
		 * The meta object literal for the '<em><b>Initialize Camera</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_TOOL___INITIALIZE_CAMERA__ABSTRACTCAMERA = eINSTANCE.getCameraTool__InitializeCamera__AbstractCamera();
				/**
		 * The meta object literal for the '<em><b>Update Image Snapshot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_TOOL___UPDATE_IMAGE_SNAPSHOT__IMAGESNAPSHOT = eINSTANCE.getCameraTool__UpdateImageSnapshot__ImageSnapshot();
				/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_TOOL___DISPOSE = eINSTANCE.getCameraTool__Dispose();
				/**
		 * The meta object literal for the '<em><b>Mouse Moved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_TOOL___MOUSE_MOVED__ABSTRACTEIMAGE_INT_INT_INT = eINSTANCE.getCameraTool__MouseMoved__AbstractEImage_int_int_int();
				/**
		 * The meta object literal for the '<em><b>Position Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAMERA_TOOL___POSITION_SELECTED__ABSTRACTEIMAGE_INT_INT_INT = eINSTANCE.getCameraTool__PositionSelected__AbstractEImage_int_int_int();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolListImpl <em>Camera Tool List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraToolListImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getCameraToolList()
		 * @generated
		 */
		EClass CAMERA_TOOL_LIST = eINSTANCE.getCameraToolList();
				/**
		 * The meta object literal for the '<em><b>Camera View Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_TOOL_LIST__CAMERA_VIEW_CONFIGURATION = eINSTANCE.getCameraToolList_CameraViewConfiguration();
				/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMERA_TOOL_LIST__TOOLS = eINSTANCE.getCameraToolList_Tools();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.PointerCameraToolImpl <em>Pointer Camera Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.PointerCameraToolImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getPointerCameraTool()
		 * @generated
		 */
		EClass POINTER_CAMERA_TOOL = eINSTANCE.getPointerCameraTool();
				/**
		 * The meta object literal for the '<em><b>Fov</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTER_CAMERA_TOOL__FOV = eINSTANCE.getPointerCameraTool_Fov();
				/**
		 * The meta object literal for the '<em><b>Vector Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTER_CAMERA_TOOL__VECTOR_COLOR = eINSTANCE.getPointerCameraTool_VectorColor();
				/**
		 * The meta object literal for the '<em><b>Intersection Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTER_CAMERA_TOOL__INTERSECTION_DISTANCE = eINSTANCE.getPointerCameraTool_IntersectionDistance();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment <em>Overlay Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getOverlayAlignment()
		 * @generated
		 */
    EEnum OVERLAY_ALIGNMENT = eINSTANCE.getOverlayAlignment();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy <em>Image Size Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.ImageSizePolicy
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getImageSizePolicy()
		 * @generated
		 */
		EEnum IMAGE_SIZE_POLICY = eINSTANCE.getImageSizePolicy();
				/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getColor3f()
		 * @generated
		 */
    EDataType COLOR3F = eINSTANCE.getColor3f();
				/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.addons.sensors.imaging.camera.impl.SymphonyCameraToolsPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

  }

} //SymphonyCameraToolsPackage
