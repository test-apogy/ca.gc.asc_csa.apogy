package ca.gc.asc_csa.apogy.addons.sensors.imaging;
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
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

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
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsSensorsImaging' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' modelName='ApogyAddonsSensorsImaging' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.addons.sensors.imaging/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.sensors.imaging.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.sensors'"
 * @generated
 */
public interface ApogyAddonsSensorsImagingPackage extends EPackage
{
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
  String eNS_URI = "ca.gc.asc_csa.apogy.addons.sensors.imaging";

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
  ApogyAddonsSensorsImagingPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.AbstractCameraImpl <em>Abstract Camera</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.AbstractCameraImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getAbstractCamera()
	 * @generated
	 */
  int ABSTRACT_CAMERA = 0;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__PARENT = ApogyAddonsSensorsPackage.SENSOR__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__DESCRIPTION = ApogyAddonsSensorsPackage.SENSOR__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__NODE_ID = ApogyAddonsSensorsPackage.SENSOR__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__CHILDREN = ApogyAddonsSensorsPackage.SENSOR__CHILDREN;

  /**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__AGGREGATED_CHILDREN = ApogyAddonsSensorsPackage.SENSOR__AGGREGATED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__STATUS = ApogyAddonsSensorsPackage.SENSOR__STATUS;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__NAME = ApogyAddonsSensorsPackage.SENSOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT = ApogyAddonsSensorsPackage.SENSOR_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Camera</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA_FEATURE_COUNT = ApogyAddonsSensorsPackage.SENSOR_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA___ACCEPT__INODEVISITOR = ApogyAddonsSensorsPackage.SENSOR___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Take Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA___TAKE_SNAPSHOT = ApogyAddonsSensorsPackage.SENSOR_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Get Field Of View</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA___GET_FIELD_OF_VIEW = ApogyAddonsSensorsPackage.SENSOR_OPERATION_COUNT + 1;

  /**
	 * The number of operations of the '<em>Abstract Camera</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_CAMERA_OPERATION_COUNT = ApogyAddonsSensorsPackage.SENSOR_OPERATION_COUNT + 2;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImageSnapshotImpl <em>Image Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImageSnapshotImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getImageSnapshot()
	 * @generated
	 */
  int IMAGE_SNAPSHOT = 1;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT__PARENT = ApogyCommonTopologyPackage.GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT__DESCRIPTION = ApogyCommonTopologyPackage.GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT__NODE_ID = ApogyCommonTopologyPackage.GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT__CHILDREN = ApogyCommonTopologyPackage.GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT__TIME = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Field Of View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT__FIELD_OF_VIEW = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT__IMAGE = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Image Snapshot</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_FEATURE_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Convert To Horizontal Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SNAPSHOT___CONVERT_TO_HORIZONTAL_ANGLE__INT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Convert To Vertical Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SNAPSHOT___CONVERT_TO_VERTICAL_ANGLE__INT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Image Snapshot</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_OPERATION_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 2;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.RectifiedImageSnapshotImpl <em>Rectified Image Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.RectifiedImageSnapshotImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getRectifiedImageSnapshot()
	 * @generated
	 */
  int RECTIFIED_IMAGE_SNAPSHOT = 2;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT__PARENT = IMAGE_SNAPSHOT__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT__DESCRIPTION = IMAGE_SNAPSHOT__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT__NODE_ID = IMAGE_SNAPSHOT__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT__CHILDREN = IMAGE_SNAPSHOT__CHILDREN;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT__TIME = IMAGE_SNAPSHOT__TIME;

  /**
	 * The feature id for the '<em><b>Field Of View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT__FIELD_OF_VIEW = IMAGE_SNAPSHOT__FIELD_OF_VIEW;

  /**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT__IMAGE = IMAGE_SNAPSHOT__IMAGE;

  /**
	 * The number of structural features of the '<em>Rectified Image Snapshot</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT_FEATURE_COUNT = IMAGE_SNAPSHOT_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT___ACCEPT__INODEVISITOR = IMAGE_SNAPSHOT___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Convert To Horizontal Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIED_IMAGE_SNAPSHOT___CONVERT_TO_HORIZONTAL_ANGLE__INT = IMAGE_SNAPSHOT___CONVERT_TO_HORIZONTAL_ANGLE__INT;

		/**
	 * The operation id for the '<em>Convert To Vertical Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFIED_IMAGE_SNAPSHOT___CONVERT_TO_VERTICAL_ANGLE__INT = IMAGE_SNAPSHOT___CONVERT_TO_VERTICAL_ANGLE__INT;

		/**
	 * The operation id for the '<em>Get Rectified Image</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT___GET_RECTIFIED_IMAGE = IMAGE_SNAPSHOT_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Rectified Image Snapshot</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTIFIED_IMAGE_SNAPSHOT_OPERATION_COUNT = IMAGE_SNAPSHOT_OPERATION_COUNT + 1;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ZoomableImpl <em>Zoomable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ZoomableImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getZoomable()
	 * @generated
	 */
  int ZOOMABLE = 3;

  /**
	 * The feature id for the '<em><b>Current Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ZOOMABLE__CURRENT_ZOOM = 0;

  /**
	 * The feature id for the '<em><b>Commanded Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ZOOMABLE__COMMANDED_ZOOM = 1;

  /**
	 * The number of structural features of the '<em>Zoomable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ZOOMABLE_FEATURE_COUNT = 2;

  /**
	 * The operation id for the '<em>Command Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ZOOMABLE___COMMAND_ZOOM__DOUBLE = 0;

  /**
	 * The operation id for the '<em>Get Minimum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ZOOMABLE___GET_MINIMUM_ZOOM = 1;

  /**
	 * The operation id for the '<em>Get Maximum Zoom</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ZOOMABLE___GET_MAXIMUM_ZOOM = 2;

  /**
	 * The number of operations of the '<em>Zoomable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ZOOMABLE_OPERATION_COUNT = 3;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImagingUtilitiesImpl <em>Imaging Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImagingUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getImagingUtilities()
	 * @generated
	 */
	int IMAGING_UTILITIES = 4;

		/**
	 * The number of structural features of the '<em>Imaging Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_UTILITIES_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Linear Convert To Horizontal Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_UTILITIES___LINEAR_CONVERT_TO_HORIZONTAL_ANGLE__IMAGESNAPSHOT_INT = 0;

		/**
	 * The operation id for the '<em>Linear Convert To Vertical Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_UTILITIES___LINEAR_CONVERT_TO_VERTICAL_ANGLE__IMAGESNAPSHOT_INT = 1;

		/**
	 * The operation id for the '<em>Get Azimuth Elevation Overlay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_UTILITIES___GET_AZIMUTH_ELEVATION_OVERLAY__INT_INT_DOUBLE_DOUBLE_DOUBLE_DOUBLE_AZIMUTHDIRECTION_ELEVATIONDIRECTION_INT_STRING_INT_COLOR_COLOR_INT = 2;

		/**
	 * The number of operations of the '<em>Imaging Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGING_UTILITIES_OPERATION_COUNT = 3;


		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection <em>Azimuth Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getAzimuthDirection()
	 * @generated
	 */
	int AZIMUTH_DIRECTION = 5;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection <em>Elevation Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getElevationDirection()
	 * @generated
	 */
	int ELEVATION_DIRECTION = 6;


		/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.Color
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 7;


		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera <em>Abstract Camera</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Camera</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera
	 * @generated
	 */
  EClass getAbstractCamera();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#getLatestImageSnapshot <em>Latest Image Snapshot</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Latest Image Snapshot</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#getLatestImageSnapshot()
	 * @see #getAbstractCamera()
	 * @generated
	 */
  EReference getAbstractCamera_LatestImageSnapshot();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#takeSnapshot() <em>Take Snapshot</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Take Snapshot</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#takeSnapshot()
	 * @generated
	 */
  EOperation getAbstractCamera__TakeSnapshot();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#getFieldOfView() <em>Get Field Of View</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Field Of View</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#getFieldOfView()
	 * @generated
	 */
  EOperation getAbstractCamera__GetFieldOfView();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot <em>Image Snapshot</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Snapshot</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot
	 * @generated
	 */
  EClass getImageSnapshot();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#getFieldOfView <em>Field Of View</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Of View</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#getFieldOfView()
	 * @see #getImageSnapshot()
	 * @generated
	 */
  EReference getImageSnapshot_FieldOfView();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#getImage()
	 * @see #getImageSnapshot()
	 * @generated
	 */
  EReference getImageSnapshot_Image();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#convertToHorizontalAngle(int) <em>Convert To Horizontal Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Horizontal Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#convertToHorizontalAngle(int)
	 * @generated
	 */
	EOperation getImageSnapshot__ConvertToHorizontalAngle__int();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#convertToVerticalAngle(int) <em>Convert To Vertical Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Vertical Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot#convertToVerticalAngle(int)
	 * @generated
	 */
	EOperation getImageSnapshot__ConvertToVerticalAngle__int();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot <em>Rectified Image Snapshot</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectified Image Snapshot</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot
	 * @generated
	 */
  EClass getRectifiedImageSnapshot();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot#getRectifiedImage() <em>Get Rectified Image</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectified Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot#getRectifiedImage()
	 * @generated
	 */
  EOperation getRectifiedImageSnapshot__GetRectifiedImage();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable <em>Zoomable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoomable</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable
	 * @generated
	 */
  EClass getZoomable();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getCurrentZoom <em>Current Zoom</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Zoom</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getCurrentZoom()
	 * @see #getZoomable()
	 * @generated
	 */
  EAttribute getZoomable_CurrentZoom();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getCommandedZoom <em>Commanded Zoom</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Zoom</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getCommandedZoom()
	 * @see #getZoomable()
	 * @generated
	 */
  EAttribute getZoomable_CommandedZoom();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#commandZoom(double) <em>Command Zoom</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Command Zoom</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#commandZoom(double)
	 * @generated
	 */
  EOperation getZoomable__CommandZoom__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getMinimumZoom() <em>Get Minimum Zoom</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Minimum Zoom</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getMinimumZoom()
	 * @generated
	 */
  EOperation getZoomable__GetMinimumZoom();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getMaximumZoom() <em>Get Maximum Zoom</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maximum Zoom</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable#getMaximumZoom()
	 * @generated
	 */
  EOperation getZoomable__GetMaximumZoom();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities <em>Imaging Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imaging Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities
	 * @generated
	 */
	EClass getImagingUtilities();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities#linearConvertToHorizontalAngle(ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot, int) <em>Linear Convert To Horizontal Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Linear Convert To Horizontal Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities#linearConvertToHorizontalAngle(ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot, int)
	 * @generated
	 */
	EOperation getImagingUtilities__LinearConvertToHorizontalAngle__ImageSnapshot_int();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities#linearConvertToVerticalAngle(ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot, int) <em>Linear Convert To Vertical Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Linear Convert To Vertical Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities#linearConvertToVerticalAngle(ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot, int)
	 * @generated
	 */
	EOperation getImagingUtilities__LinearConvertToVerticalAngle__ImageSnapshot_int();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities#getAzimuthElevationOverlay(int, int, double, double, double, double, ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection, ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection, int, java.lang.String, int, java.awt.Color, java.awt.Color, int) <em>Get Azimuth Elevation Overlay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Azimuth Elevation Overlay</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities#getAzimuthElevationOverlay(int, int, double, double, double, double, ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection, ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection, int, java.lang.String, int, java.awt.Color, java.awt.Color, int)
	 * @generated
	 */
	EOperation getImagingUtilities__GetAzimuthElevationOverlay__int_int_double_double_double_double_AzimuthDirection_ElevationDirection_int_String_int_Color_Color_int();

		/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection <em>Azimuth Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Azimuth Direction</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection
	 * @generated
	 */
	EEnum getAzimuthDirection();

		/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection <em>Elevation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Elevation Direction</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection
	 * @generated
	 */
	EEnum getElevationDirection();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsSensorsImagingFactory getApogyAddonsSensorsImagingFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.AbstractCameraImpl <em>Abstract Camera</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.AbstractCameraImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getAbstractCamera()
		 * @generated
		 */
    EClass ABSTRACT_CAMERA = eINSTANCE.getAbstractCamera();

    /**
		 * The meta object literal for the '<em><b>Latest Image Snapshot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT = eINSTANCE.getAbstractCamera_LatestImageSnapshot();

    /**
		 * The meta object literal for the '<em><b>Take Snapshot</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_CAMERA___TAKE_SNAPSHOT = eINSTANCE.getAbstractCamera__TakeSnapshot();

    /**
		 * The meta object literal for the '<em><b>Get Field Of View</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_CAMERA___GET_FIELD_OF_VIEW = eINSTANCE.getAbstractCamera__GetFieldOfView();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImageSnapshotImpl <em>Image Snapshot</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImageSnapshotImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getImageSnapshot()
		 * @generated
		 */
    EClass IMAGE_SNAPSHOT = eINSTANCE.getImageSnapshot();

    /**
		 * The meta object literal for the '<em><b>Field Of View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IMAGE_SNAPSHOT__FIELD_OF_VIEW = eINSTANCE.getImageSnapshot_FieldOfView();

    /**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IMAGE_SNAPSHOT__IMAGE = eINSTANCE.getImageSnapshot_Image();

    /**
		 * The meta object literal for the '<em><b>Convert To Horizontal Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_SNAPSHOT___CONVERT_TO_HORIZONTAL_ANGLE__INT = eINSTANCE.getImageSnapshot__ConvertToHorizontalAngle__int();

				/**
		 * The meta object literal for the '<em><b>Convert To Vertical Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_SNAPSHOT___CONVERT_TO_VERTICAL_ANGLE__INT = eINSTANCE.getImageSnapshot__ConvertToVerticalAngle__int();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.RectifiedImageSnapshotImpl <em>Rectified Image Snapshot</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.RectifiedImageSnapshotImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getRectifiedImageSnapshot()
		 * @generated
		 */
    EClass RECTIFIED_IMAGE_SNAPSHOT = eINSTANCE.getRectifiedImageSnapshot();

    /**
		 * The meta object literal for the '<em><b>Get Rectified Image</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECTIFIED_IMAGE_SNAPSHOT___GET_RECTIFIED_IMAGE = eINSTANCE.getRectifiedImageSnapshot__GetRectifiedImage();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ZoomableImpl <em>Zoomable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ZoomableImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getZoomable()
		 * @generated
		 */
    EClass ZOOMABLE = eINSTANCE.getZoomable();

    /**
		 * The meta object literal for the '<em><b>Current Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ZOOMABLE__CURRENT_ZOOM = eINSTANCE.getZoomable_CurrentZoom();

    /**
		 * The meta object literal for the '<em><b>Commanded Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ZOOMABLE__COMMANDED_ZOOM = eINSTANCE.getZoomable_CommandedZoom();

    /**
		 * The meta object literal for the '<em><b>Command Zoom</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ZOOMABLE___COMMAND_ZOOM__DOUBLE = eINSTANCE.getZoomable__CommandZoom__double();

    /**
		 * The meta object literal for the '<em><b>Get Minimum Zoom</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ZOOMABLE___GET_MINIMUM_ZOOM = eINSTANCE.getZoomable__GetMinimumZoom();

    /**
		 * The meta object literal for the '<em><b>Get Maximum Zoom</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ZOOMABLE___GET_MAXIMUM_ZOOM = eINSTANCE.getZoomable__GetMaximumZoom();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImagingUtilitiesImpl <em>Imaging Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ImagingUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getImagingUtilities()
		 * @generated
		 */
		EClass IMAGING_UTILITIES = eINSTANCE.getImagingUtilities();

				/**
		 * The meta object literal for the '<em><b>Linear Convert To Horizontal Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGING_UTILITIES___LINEAR_CONVERT_TO_HORIZONTAL_ANGLE__IMAGESNAPSHOT_INT = eINSTANCE.getImagingUtilities__LinearConvertToHorizontalAngle__ImageSnapshot_int();

				/**
		 * The meta object literal for the '<em><b>Linear Convert To Vertical Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGING_UTILITIES___LINEAR_CONVERT_TO_VERTICAL_ANGLE__IMAGESNAPSHOT_INT = eINSTANCE.getImagingUtilities__LinearConvertToVerticalAngle__ImageSnapshot_int();

				/**
		 * The meta object literal for the '<em><b>Get Azimuth Elevation Overlay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGING_UTILITIES___GET_AZIMUTH_ELEVATION_OVERLAY__INT_INT_DOUBLE_DOUBLE_DOUBLE_DOUBLE_AZIMUTHDIRECTION_ELEVATIONDIRECTION_INT_STRING_INT_COLOR_COLOR_INT = eINSTANCE.getImagingUtilities__GetAzimuthElevationOverlay__int_int_double_double_double_double_AzimuthDirection_ElevationDirection_int_String_int_Color_Color_int();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection <em>Azimuth Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getAzimuthDirection()
		 * @generated
		 */
		EEnum AZIMUTH_DIRECTION = eINSTANCE.getAzimuthDirection();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection <em>Elevation Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getElevationDirection()
		 * @generated
		 */
		EEnum ELEVATION_DIRECTION = eINSTANCE.getElevationDirection();

				/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.Color
		 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.impl.ApogyAddonsSensorsImagingPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

  }

} //ApogyAddonsSensorsImagingPackage
