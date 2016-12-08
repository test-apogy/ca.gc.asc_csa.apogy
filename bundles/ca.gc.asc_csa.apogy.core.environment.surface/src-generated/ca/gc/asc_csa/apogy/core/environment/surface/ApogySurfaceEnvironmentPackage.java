/**
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
package ca.gc.asc_csa.apogy.core.environment.surface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

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
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogySurfaceEnvironment' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogySurfaceEnvironment' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.surface/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.surface.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment'"
 * @generated
 */
public interface ApogySurfaceEnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "surface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.surface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "surface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogySurfaceEnvironmentPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteImpl <em>Surface Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSurfaceWorksite()
	 * @generated
	 */
	int SURFACE_WORKSITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__NAME = ApogyCoreEnvironmentPackage.WORKSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__DESCRIPTION = ApogyCoreEnvironmentPackage.WORKSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__TIME = ApogyCoreEnvironmentPackage.WORKSITE__TIME;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__WORKSITES_LIST = ApogyCoreEnvironmentPackage.WORKSITE__WORKSITES_LIST;

	/**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__WORKSITE_NODE = ApogyCoreEnvironmentPackage.WORKSITE__WORKSITE_NODE;

	/**
	 * The feature id for the '<em><b>Sky</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__SKY = ApogyCoreEnvironmentPackage.WORKSITE__SKY;

	/**
	 * The feature id for the '<em><b>Maps List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__MAPS_LIST = ApogyCoreEnvironmentPackage.WORKSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Celestial Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__CELESTIAL_BODY = ApogyCoreEnvironmentPackage.WORKSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_FEATURE_COUNT = ApogyCoreEnvironmentPackage.WORKSITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_OPERATION_COUNT = ApogyCoreEnvironmentPackage.WORKSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TRANSFORMATION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__LAYERS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Map Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__MAP_NODE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListImpl <em>Maps List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapsList()
	 * @generated
	 */
	int MAPS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST__MAPS = 0;

	/**
	 * The feature id for the '<em><b>Maps List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST__MAPS_LIST_NODE = 1;

	/**
	 * The number of structural features of the '<em>Maps List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Maps List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerImpl <em>Abstract Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getAbstractMapLayer()
	 * @generated
	 */
	int ABSTRACT_MAP_LAYER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER__MAP = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapLayerPresentationImpl <em>Map Layer Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapLayerPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapLayerPresentation()
	 * @generated
	 */
	int MAP_LAYER_PRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__VISIBLE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__MAP_LAYER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.URLMapLayerImpl <em>URL Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.URLMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getURLMapLayer()
	 * @generated
	 */
	int URL_MAP_LAYER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_MAP_LAYER__URL = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RegionImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 6;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularRegionImpl <em>Rectangular Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularRegionImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularRegion()
	 * @generated
	 */
	int RECTANGULAR_REGION = 7;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__TRANSFORMATION = REGION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>XMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__XMIN = REGION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__XMAX = REGION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>YMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__YMIN = REGION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__YMAX = REGION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__XDIMENSION = REGION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__YDIMENSION = REGION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lower Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__LOWER_LEFT_CORNER = REGION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Upper Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__UPPER_LEFT_CORNER = REGION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lower Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__LOWER_RIGHT_CORNER = REGION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Upper Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION__UPPER_RIGHT_CORNER = REGION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Rectangular Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Rectangular Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularVolumeRegionImpl <em>Rectangular Volume Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularVolumeRegionImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularVolumeRegion()
	 * @generated
	 */
	int RECTANGULAR_VOLUME_REGION = 8;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__TRANSFORMATION = RECTANGULAR_REGION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>XMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__XMIN = RECTANGULAR_REGION__XMIN;

	/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__XMAX = RECTANGULAR_REGION__XMAX;

	/**
	 * The feature id for the '<em><b>YMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__YMIN = RECTANGULAR_REGION__YMIN;

	/**
	 * The feature id for the '<em><b>YMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__YMAX = RECTANGULAR_REGION__YMAX;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__XDIMENSION = RECTANGULAR_REGION__XDIMENSION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__YDIMENSION = RECTANGULAR_REGION__YDIMENSION;

	/**
	 * The feature id for the '<em><b>Lower Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__LOWER_LEFT_CORNER = RECTANGULAR_REGION__LOWER_LEFT_CORNER;

	/**
	 * The feature id for the '<em><b>Upper Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__UPPER_LEFT_CORNER = RECTANGULAR_REGION__UPPER_LEFT_CORNER;

	/**
	 * The feature id for the '<em><b>Lower Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__LOWER_RIGHT_CORNER = RECTANGULAR_REGION__LOWER_RIGHT_CORNER;

	/**
	 * The feature id for the '<em><b>Upper Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__UPPER_RIGHT_CORNER = RECTANGULAR_REGION__UPPER_RIGHT_CORNER;

	/**
	 * The feature id for the '<em><b>ZMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__ZMIN = RECTANGULAR_REGION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ZMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__ZMAX = RECTANGULAR_REGION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__ZDIMENSION = RECTANGULAR_REGION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rectangular Volume Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION_FEATURE_COUNT = RECTANGULAR_REGION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rectangular Volume Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION_OPERATION_COUNT = RECTANGULAR_REGION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider <em>Rectangular Region Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularRegionProvider()
	 * @generated
	 */
	int RECTANGULAR_REGION_PROVIDER = 9;

	/**
	 * The number of structural features of the '<em>Rectangular Region Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_PROVIDER___GET_REGION = 0;

	/**
	 * The number of operations of the '<em>Rectangular Region Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage <em>Rectangular Region Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularRegionImage()
	 * @generated
	 */
	int RECTANGULAR_REGION_IMAGE = 10;

	/**
	 * The number of structural features of the '<em>Rectangular Region Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_IMAGE_FEATURE_COUNT = RECTANGULAR_REGION_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_IMAGE___GET_REGION = RECTANGULAR_REGION_PROVIDER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE = RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_IMAGE___GET_RESOLUTION = RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rectangular Region Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_IMAGE_OPERATION_COUNT = RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl <em>Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getImageMapLayer()
	 * @generated
	 */
	int IMAGE_MAP_LAYER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__WIDTH = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__HEIGHT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__OPAQUE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__IMAGE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__LEGEND = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER__RESOLUTION = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER___GET_REGION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER___GET_REGION_IMAGE = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER___GET_RESOLUTION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerPresentationImpl <em>Image Map Layer Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getImageMapLayerPresentation()
	 * @generated
	 */
	int IMAGE_MAP_LAYER_PRESENTATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__NAME = MAP_LAYER_PRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__DESCRIPTION = MAP_LAYER_PRESENTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__VISIBLE = MAP_LAYER_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__MAP_LAYER = MAP_LAYER_PRESENTATION__MAP_LAYER;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__ALPHA = MAP_LAYER_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION_FEATURE_COUNT = MAP_LAYER_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_REGION = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_REGION_IMAGE = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_RESOLUTION = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Image Map Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Image Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION_OPERATION_COUNT = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.URLImageMapLayerImpl <em>URL Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.URLImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getURLImageMapLayer()
	 * @generated
	 */
	int URL_IMAGE_MAP_LAYER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__NAME = IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__DESCRIPTION = IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__MAP = IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__WIDTH = IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__HEIGHT = IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__OPAQUE = IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__IMAGE = IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__LEGEND = IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__RESOLUTION = IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__URL = IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Legend URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER__LEGEND_URL = IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>URL Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER_FEATURE_COUNT = IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER___GET_REGION = IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER___GET_REGION_IMAGE = IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER___GET_RESOLUTION = IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>URL Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER_OPERATION_COUNT = IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerImpl <em>Topology Tree Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getTopologyTreeMapLayer()
	 * @generated
	 */
	int TOPOLOGY_TREE_MAP_LAYER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Topology Tree Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topology Tree Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Topology Tree Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerNodeImpl <em>Topology Tree Map Layer Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getTopologyTreeMapLayerNode()
	 * @generated
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Topology Tree Map Layer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transient Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Topology Tree Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Topology Tree Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl <em>Cartesian Triangular Mesh Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Mesh Is Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Layer Presentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Current Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Force Update Texture Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDerivedImageMapLayerImpl <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDerivedImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshDerivedImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME = IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION = IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP = IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH = IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT = IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE = IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE = IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND = IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION = IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT = IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION = IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE = IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION = IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT = IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshSlopeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

	/**
	 * The feature id for the '<em><b>Auto Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

	/**
	 * The feature id for the '<em><b>Auto Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE;

	/**
	 * The feature id for the '<em><b>Minimum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE;

	/**
	 * The feature id for the '<em><b>Maximum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE;

	/**
	 * The feature id for the '<em><b>Slope Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshHeightImageMapLayerImpl <em>Cartesian Triangular Mesh Height Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshHeightImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

	/**
	 * The feature id for the '<em><b>Auto Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Height Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Height Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SlopeRangeImpl <em>Slope Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SlopeRangeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSlopeRange()
	 * @generated
	 */
	int SLOPE_RANGE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slope Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__SLOPE_LOWER_BOUND = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slope Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__SLOPE_UPPER_BOUND = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__COLOR = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Slope Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Slope Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.LineOfSightImageMapLayerImpl <em>Line Of Sight Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.LineOfSightImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getLineOfSightImageMapLayer()
	 * @generated
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

	/**
	 * The feature id for the '<em><b>Line Of Sight Available Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Of Sight Not Available Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Observer Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Height Above Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Height Perpendicular To Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Line Of Sight Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Line Of Sight Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractShapeImageLayerImpl <em>Abstract Shape Image Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractShapeImageLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getAbstractShapeImageLayer()
	 * @generated
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__NAME = IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION = IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__MAP = IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE = IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH = IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT = IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE = IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE = IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND = IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION = IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED = IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__COLOR = IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT = IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION = IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE = IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION = IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION = IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Abstract Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT = IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.EllipseShapeImageLayerImpl <em>Ellipse Shape Image Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.EllipseShapeImageLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getEllipseShapeImageLayer()
	 * @generated
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__NAME = ABSTRACT_SHAPE_IMAGE_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__DESCRIPTION = ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__MAP = ABSTRACT_SHAPE_IMAGE_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__OPAQUE = ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__LEGEND = ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__SHAPED_FILLED = ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__COLOR = ABSTRACT_SHAPE_IMAGE_LAYER__COLOR;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Ellipse Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ellipse Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Center Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ellipse Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER_FEATURE_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Ellipse Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER_OPERATION_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangleShapeImageLayerImpl <em>Rectangle Shape Image Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangleShapeImageLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangleShapeImageLayer()
	 * @generated
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__NAME = ABSTRACT_SHAPE_IMAGE_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__DESCRIPTION = ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__MAP = ABSTRACT_SHAPE_IMAGE_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__OPAQUE = ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__LEGEND = ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__SHAPED_FILLED = ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__COLOR = ABSTRACT_SHAPE_IMAGE_LAYER__COLOR;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Rectangle Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rectangle Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Center Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rectangle Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER_FEATURE_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Rectangle Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER_OPERATION_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.PolygonShapeImageMapLayerImpl <em>Polygon Shape Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.PolygonShapeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getPolygonShapeImageMapLayer()
	 * @generated
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME = ABSTRACT_SHAPE_IMAGE_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION = ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP = ABSTRACT_SHAPE_IMAGE_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE = ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND = ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED = ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR = ABSTRACT_SHAPE_IMAGE_LAYER__COLOR;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The number of structural features of the '<em>Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The operation id for the '<em>Get Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianCoordinatesPolygonShapeImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME = POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP = POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH = POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT = POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE = POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE = POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND = POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED = POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR = POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Polygon Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES = POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT = POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The operation id for the '<em>Get Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT = POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.BasicCartesianTriangularMeshMapLayerImpl <em>Basic Cartesian Triangular Mesh Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.BasicCartesianTriangularMeshMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getBasicCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Mesh Is Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY;

	/**
	 * The feature id for the '<em><b>Map Layer Presentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Current Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH;

	/**
	 * The operation id for the '<em>Force Update Texture Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE;

	/**
	 * The number of operations of the '<em>Basic Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshURLMapLayerImpl <em>Cartesian Triangular Mesh URL Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshURLMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshURLMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Mesh Is Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH_IS_DIRTY = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY;

	/**
	 * The feature id for the '<em><b>Map Layer Presentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MAP_LAYER_PRESENTATIONS = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS;

	/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Current Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER___GET_CURRENT_MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH;

	/**
	 * The operation id for the '<em>Force Update Texture Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.FeaturesOfInterestMapLayerImpl <em>Features Of Interest Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.FeaturesOfInterestMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getFeaturesOfInterestMapLayer()
	 * @generated
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__FEATURES = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Features Of Interest Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER___GET_REGION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Features Of Interest Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteNodeImpl <em>Surface Worksite Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSurfaceWorksiteNode()
	 * @generated
	 */
	int SURFACE_WORKSITE_NODE = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE__PARENT = ApogyCoreEnvironmentPackage.WORKSITE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE__DESCRIPTION = ApogyCoreEnvironmentPackage.WORKSITE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE__NODE_ID = ApogyCoreEnvironmentPackage.WORKSITE_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE__CHILDREN = ApogyCoreEnvironmentPackage.WORKSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE__AGGREGATED_CHILDREN = ApogyCoreEnvironmentPackage.WORKSITE_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE__WORKSITE = ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE;

	/**
	 * The number of structural features of the '<em>Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE_FEATURE_COUNT = ApogyCoreEnvironmentPackage.WORKSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE___ACCEPT__INODEVISITOR = ApogyCoreEnvironmentPackage.WORKSITE_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE_OPERATION_COUNT = ApogyCoreEnvironmentPackage.WORKSITE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListNodeImpl <em>Maps List Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapsListNode()
	 * @generated
	 */
	int MAPS_LIST_NODE = 32;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Maps List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE__MAPS_LIST = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Maps List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Maps List Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapNodeImpl <em>Map Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapNode()
	 * @generated
	 */
	int MAP_NODE = 33;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__PARENT = ApogyCommonTopologyPackage.TRANSFORM_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__DESCRIPTION = ApogyCommonTopologyPackage.TRANSFORM_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__NODE_ID = ApogyCommonTopologyPackage.TRANSFORM_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__CHILDREN = ApogyCommonTopologyPackage.TRANSFORM_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.TRANSFORM_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__POSITION = ApogyCommonTopologyPackage.TRANSFORM_NODE__POSITION;

	/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__ROTATION_MATRIX = ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE__MAP = ApogyCommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.TRANSFORM_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE___AS_MATRIX4D = ApogyCommonTopologyPackage.TRANSFORM_NODE___AS_MATRIX4D;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE___SET_TRANSFORMATION__MATRIX4D = ApogyCommonTopologyPackage.TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D;

	/**
	 * The number of operations of the '<em>Map Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerNodeImpl <em>Abstract Map Layer Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getAbstractMapLayerNode()
	 * @generated
	 */
	int ABSTRACT_MAP_LAYER_NODE = 34;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Abstract Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_LAYER_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerNodeImpl <em>Cartesian Triangular Mesh Map Layer Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshMapLayerNode()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = 35;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__PARENT = ABSTRACT_MAP_LAYER_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__DESCRIPTION = ABSTRACT_MAP_LAYER_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__NODE_ID = ABSTRACT_MAP_LAYER_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__CHILDREN = ABSTRACT_MAP_LAYER_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__AGGREGATED_CHILDREN = ABSTRACT_MAP_LAYER_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER = ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER;

	/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE_FEATURE_COUNT = ABSTRACT_MAP_LAYER_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___ACCEPT__INODEVISITOR = ABSTRACT_MAP_LAYER_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Get Cartesian Triangular Mesh Map Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = ABSTRACT_MAP_LAYER_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE_OPERATION_COUNT = ABSTRACT_MAP_LAYER_NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceEnvironmentUtilitiesImpl <em>Surface Environment Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceEnvironmentUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSurfaceEnvironmentUtilities()
	 * @generated
	 */
	int SURFACE_ENVIRONMENT_UTILITIES = 36;

	/**
	 * The number of structural features of the '<em>Surface Environment Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_ENVIRONMENT_UTILITIES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Convert To Julian Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE = 0;

	/**
	 * The operation id for the '<em>Parse Right Ascension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING = 1;

	/**
	 * The operation id for the '<em>Parse Deg Min Sec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING = 2;

	/**
	 * The number of operations of the '<em>Surface Environment Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_ENVIRONMENT_UTILITIES_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getApogySurfaceEnvironmentFacade()
	 * @generated
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE = 37;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create EImage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST = 0;

	/**
	 * The operation id for the '<em>Get Absolute Rectangular Region Corners</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION = 1;

	/**
	 * The operation id for the '<em>Get Best Resolution Rectangular Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST = 2;

	/**
	 * The operation id for the '<em>Get Rectangular Region Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D = 3;

	/**
	 * The operation id for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D = 4;

	/**
	 * The operation id for the '<em>Get Rectangular Region Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D = 5;

	/**
	 * The operation id for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D = 6;

	/**
	 * The operation id for the '<em>Fits Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION = 7;

	/**
	 * The operation id for the '<em>Intersects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4 = 8;

	/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D = 9;

	/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D = 10;

	/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST = 11;

	/**
	 * The operation id for the '<em>Get Best Resolution Map Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST = 12;

	/**
	 * The operation id for the '<em>Get Visible Image Map Layer Presentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST = 13;

	/**
	 * The operation id for the '<em>Get Rectangular Volume Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH = 14;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_FACADE_OPERATION_COUNT = 15;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 38;

	/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 39;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getList()
	 * @generated
	 */
	int LIST = 40;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite <em>Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite
	 * @generated
	 */
	EClass getSurfaceWorksite();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getMapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maps List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getMapsList()
	 * @see #getSurfaceWorksite()
	 * @generated
	 */
	EReference getSurfaceWorksite_MapsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getCelestialBody <em>Celestial Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Celestial Body</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getCelestialBody()
	 * @see #getSurfaceWorksite()
	 * @generated
	 */
	EReference getSurfaceWorksite_CelestialBody();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.Map#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Map#getTransformation()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Transformation();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.Map#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Map#getLayers()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Layers();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.Map#getMapNode <em>Map Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Map#getMapNode()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_MapNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maps List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapsList
	 * @generated
	 */
	EClass getMapsList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapsList#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maps</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapsList#getMaps()
	 * @see #getMapsList()
	 * @generated
	 */
	EReference getMapsList_Maps();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapsList#getMapsListNode <em>Maps List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapsList#getMapsListNode()
	 * @see #getMapsList()
	 * @generated
	 */
	EReference getMapsList_MapsListNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer <em>Abstract Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer
	 * @generated
	 */
	EClass getAbstractMapLayer();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer#getMap()
	 * @see #getAbstractMapLayer()
	 * @generated
	 */
	EReference getAbstractMapLayer_Map();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer#getAbstractMapLayerNode <em>Abstract Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer#getAbstractMapLayerNode()
	 * @see #getAbstractMapLayer()
	 * @generated
	 */
	EReference getAbstractMapLayer_AbstractMapLayerNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation <em>Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Layer Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation
	 * @generated
	 */
	EClass getMapLayerPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation#isVisible()
	 * @see #getMapLayerPresentation()
	 * @generated
	 */
	EAttribute getMapLayerPresentation_Visible();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation#getMapLayer <em>Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation#getMapLayer()
	 * @see #getMapLayerPresentation()
	 * @generated
	 */
	EReference getMapLayerPresentation_MapLayer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer <em>URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer
	 * @generated
	 */
	EClass getURLMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer#getUrl()
	 * @see #getURLMapLayer()
	 * @generated
	 */
	EAttribute getURLMapLayer_Url();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.Region#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Region#getTransformation()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transformation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion <em>Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion
	 * @generated
	 */
	EClass getRectangularRegion();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getXMin <em>XMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMin</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getXMin()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EAttribute getRectangularRegion_XMin();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getXMax <em>XMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMax</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getXMax()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EAttribute getRectangularRegion_XMax();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getYMin <em>YMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMin</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getYMin()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EAttribute getRectangularRegion_YMin();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getYMax <em>YMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMax</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getYMax()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EAttribute getRectangularRegion_YMax();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getXDimension()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EAttribute getRectangularRegion_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getYDimension()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EAttribute getRectangularRegion_YDimension();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getLowerLeftCorner <em>Lower Left Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Left Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getLowerLeftCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EReference getRectangularRegion_LowerLeftCorner();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getUpperLeftCorner <em>Upper Left Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper Left Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getUpperLeftCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EReference getRectangularRegion_UpperLeftCorner();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getLowerRightCorner <em>Lower Right Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Right Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getLowerRightCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EReference getRectangularRegion_LowerRightCorner();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getUpperRightCorner <em>Upper Right Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper Right Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion#getUpperRightCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
	EReference getRectangularRegion_UpperRightCorner();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion <em>Rectangular Volume Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Volume Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion
	 * @generated
	 */
	EClass getRectangularVolumeRegion();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMin <em>ZMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMin</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMin()
	 * @see #getRectangularVolumeRegion()
	 * @generated
	 */
	EAttribute getRectangularVolumeRegion_ZMin();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMax <em>ZMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMax</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZMax()
	 * @see #getRectangularVolumeRegion()
	 * @generated
	 */
	EAttribute getRectangularVolumeRegion_ZMax();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZDimension <em>ZDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion#getZDimension()
	 * @see #getRectangularVolumeRegion()
	 * @generated
	 */
	EAttribute getRectangularVolumeRegion_ZDimension();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider <em>Rectangular Region Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Region Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider
	 * @generated
	 */
	EClass getRectangularRegionProvider();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider#getRegion() <em>Get Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Region</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider#getRegion()
	 * @generated
	 */
	EOperation getRectangularRegionProvider__GetRegion();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage <em>Rectangular Region Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Region Image</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage
	 * @generated
	 */
	EClass getRectangularRegionImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Region Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage#getRegionImage()
	 * @generated
	 */
	EOperation getRectangularRegionImage__GetRegionImage();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage#getResolution() <em>Get Resolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resolution</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage#getResolution()
	 * @generated
	 */
	EOperation getRectangularRegionImage__GetResolution();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer <em>Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer
	 * @generated
	 */
	EClass getImageMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getWidth()
	 * @see #getImageMapLayer()
	 * @generated
	 */
	EAttribute getImageMapLayer_Width();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getHeight()
	 * @see #getImageMapLayer()
	 * @generated
	 */
	EAttribute getImageMapLayer_Height();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#isOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#isOpaque()
	 * @see #getImageMapLayer()
	 * @generated
	 */
	EAttribute getImageMapLayer_Opaque();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getImage()
	 * @see #getImageMapLayer()
	 * @generated
	 */
	EReference getImageMapLayer_Image();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legend</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getLegend()
	 * @see #getImageMapLayer()
	 * @generated
	 */
	EReference getImageMapLayer_Legend();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getResolution()
	 * @see #getImageMapLayer()
	 * @generated
	 */
	EAttribute getImageMapLayer_Resolution();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor) <em>Update Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor)
	 * @generated
	 */
	EOperation getImageMapLayer__UpdateImage__IProgressMonitor();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getImageMapLayerRegion() <em>Get Image Map Layer Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Region</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getImageMapLayerRegion()
	 * @generated
	 */
	EOperation getImageMapLayer__GetImageMapLayerRegion();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation <em>Image Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Map Layer Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation
	 * @generated
	 */
	EClass getImageMapLayerPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation#getAlpha()
	 * @see #getImageMapLayerPresentation()
	 * @generated
	 */
	EAttribute getImageMapLayerPresentation_Alpha();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation#getImageMapLayer() <em>Get Image Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation#getImageMapLayer()
	 * @generated
	 */
	EOperation getImageMapLayerPresentation__GetImageMapLayer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer <em>URL Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer
	 * @generated
	 */
	EClass getURLImageMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer#getLegendURL <em>Legend URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend URL</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer#getLegendURL()
	 * @see #getURLImageMapLayer()
	 * @generated
	 */
	EAttribute getURLImageMapLayer_LegendURL();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer <em>Topology Tree Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Tree Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer
	 * @generated
	 */
	EClass getTopologyTreeMapLayer();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer#getTopologyTreeRoot <em>Topology Tree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Tree Root</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer#getTopologyTreeRoot()
	 * @see #getTopologyTreeMapLayer()
	 * @generated
	 */
	EReference getTopologyTreeMapLayer_TopologyTreeRoot();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode <em>Topology Tree Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Tree Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode
	 * @generated
	 */
	EClass getTopologyTreeMapLayerNode();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Topology Tree Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTopologyTreeMapLayer()
	 * @see #getTopologyTreeMapLayerNode()
	 * @generated
	 */
	EReference getTopologyTreeMapLayerNode_TopologyTreeMapLayer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTransientParent <em>Transient Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transient Parent</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTransientParent()
	 * @see #getTopologyTreeMapLayerNode()
	 * @generated
	 */
	EReference getTopologyTreeMapLayerNode_TransientParent();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#isMeshIsDirty <em>Mesh Is Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mesh Is Dirty</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#isMeshIsDirty()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshMapLayer_MeshIsDirty();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getMapLayerPresentations <em>Map Layer Presentations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Layer Presentations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getMapLayerPresentations()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshMapLayer_MapLayerPresentations();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getTextureImage <em>Texture Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Texture Image</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getTextureImage()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshMapLayer_TextureImage();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getCartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getCartesianTriangularMeshMapLayerNode()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getCurrentMesh() <em>Get Current Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#getCurrentMesh()
	 * @generated
	 */
	EOperation getCartesianTriangularMeshMapLayer__GetCurrentMesh();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#forceUpdateTextureImage() <em>Force Update Texture Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Force Update Texture Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer#forceUpdateTextureImage()
	 * @generated
	 */
	EOperation getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshDerivedImageMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution <em>Required Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution()
	 * @see #getCartesianTriangularMeshDerivedImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer()
	 * @see #getCartesianTriangularMeshDerivedImageMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshSlopeImageMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale <em>Auto Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Scale</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale()
	 * @see #getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshSlopeImageMapLayer_AutoScale();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope <em>Minimum Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope()
	 * @see #getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope <em>Maximum Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope()
	 * @see #getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshDiscreteSlopeImageMapLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer#getSlopeRanges <em>Slope Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slope Ranges</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer#getSlopeRanges()
	 * @see #getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer <em>Cartesian Triangular Mesh Height Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Height Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshHeightImageMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer#isAutoScale <em>Auto Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Scale</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer#isAutoScale()
	 * @see #getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshHeightImageMapLayer_AutoScale();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight <em>Minimum Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight()
	 * @see #getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight <em>Maximum Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight()
	 * @see #getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange <em>Slope Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Range</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange
	 * @generated
	 */
	EClass getSlopeRange();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeLowerBound <em>Slope Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Lower Bound</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeLowerBound()
	 * @see #getSlopeRange()
	 * @generated
	 */
	EAttribute getSlopeRange_SlopeLowerBound();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeUpperBound <em>Slope Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Upper Bound</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeUpperBound()
	 * @see #getSlopeRange()
	 * @generated
	 */
	EAttribute getSlopeRange_SlopeUpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getColor()
	 * @see #getSlopeRange()
	 * @generated
	 */
	EAttribute getSlopeRange_Color();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer <em>Line Of Sight Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Of Sight Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer
	 * @generated
	 */
	EClass getLineOfSightImageMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getLineOfSightAvailableColor <em>Line Of Sight Available Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Of Sight Available Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getLineOfSightAvailableColor()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_LineOfSightAvailableColor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getLineOfSightNotAvailableColor <em>Line Of Sight Not Available Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Of Sight Not Available Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getLineOfSightNotAvailableColor()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_LineOfSightNotAvailableColor();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getObserverPose <em>Observer Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observer Pose</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getObserverPose()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EReference getLineOfSightImageMapLayer_ObserverPose();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getTargetHeightAboveGround <em>Target Height Above Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Height Above Ground</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#getTargetHeightAboveGround()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_TargetHeightAboveGround();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#isUseHeightPerpendicularToGround <em>Use Height Perpendicular To Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Height Perpendicular To Ground</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer#isUseHeightPerpendicularToGround()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_UseHeightPerpendicularToGround();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer <em>Abstract Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Shape Image Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer
	 * @generated
	 */
	EClass getAbstractShapeImageLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#isShapedFilled <em>Shaped Filled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaped Filled</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#isShapedFilled()
	 * @see #getAbstractShapeImageLayer()
	 * @generated
	 */
	EAttribute getAbstractShapeImageLayer_ShapedFilled();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getColor()
	 * @see #getAbstractShapeImageLayer()
	 * @generated
	 */
	EAttribute getAbstractShapeImageLayer_Color();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getRequiredResolution <em>Required Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer#getRequiredResolution()
	 * @see #getAbstractShapeImageLayer()
	 * @generated
	 */
	EAttribute getAbstractShapeImageLayer_RequiredResolution();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer <em>Ellipse Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Shape Image Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer
	 * @generated
	 */
	EClass getEllipseShapeImageLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer#getEllipseWidth <em>Ellipse Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ellipse Width</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer#getEllipseWidth()
	 * @see #getEllipseShapeImageLayer()
	 * @generated
	 */
	EAttribute getEllipseShapeImageLayer_EllipseWidth();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer#getEllipseHeight <em>Ellipse Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ellipse Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer#getEllipseHeight()
	 * @see #getEllipseShapeImageLayer()
	 * @generated
	 */
	EAttribute getEllipseShapeImageLayer_EllipseHeight();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Center Lines</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer#isShowCenterLines()
	 * @see #getEllipseShapeImageLayer()
	 * @generated
	 */
	EAttribute getEllipseShapeImageLayer_ShowCenterLines();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer <em>Rectangle Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Shape Image Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer
	 * @generated
	 */
	EClass getRectangleShapeImageLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer#getRectangleWidth <em>Rectangle Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rectangle Width</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer#getRectangleWidth()
	 * @see #getRectangleShapeImageLayer()
	 * @generated
	 */
	EAttribute getRectangleShapeImageLayer_RectangleWidth();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer#getRectangleHeight <em>Rectangle Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rectangle Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer#getRectangleHeight()
	 * @see #getRectangleShapeImageLayer()
	 * @generated
	 */
	EAttribute getRectangleShapeImageLayer_RectangleHeight();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Center Lines</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer#isShowCenterLines()
	 * @see #getRectangleShapeImageLayer()
	 * @generated
	 */
	EAttribute getRectangleShapeImageLayer_ShowCenterLines();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer <em>Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Shape Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer
	 * @generated
	 */
	EClass getPolygonShapeImageMapLayer();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer#getVertices() <em>Get Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vertices</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer#getVertices()
	 * @generated
	 */
	EOperation getPolygonShapeImageMapLayer__GetVertices();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer
	 * @generated
	 */
	EClass getCartesianCoordinatesPolygonShapeImageMapLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer#getPolygonVertices <em>Polygon Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon Vertices</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer#getPolygonVertices()
	 * @see #getCartesianCoordinatesPolygonShapeImageMapLayer()
	 * @generated
	 */
	EReference getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer <em>Basic Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Cartesian Triangular Mesh Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer
	 * @generated
	 */
	EClass getBasicCartesianTriangularMeshMapLayer();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer#getMesh()
	 * @see #getBasicCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getBasicCartesianTriangularMeshMapLayer_Mesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer <em>Cartesian Triangular Mesh URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh URL Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshURLMapLayer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer#getMesh()
	 * @see #getCartesianTriangularMeshURLMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshURLMapLayer_Mesh();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Of Interest Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer
	 * @generated
	 */
	EClass getFeaturesOfInterestMapLayer();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer#getFeatures()
	 * @see #getFeaturesOfInterestMapLayer()
	 * @generated
	 */
	EReference getFeaturesOfInterestMapLayer_Features();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode <em>Surface Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Worksite Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode
	 * @generated
	 */
	EClass getSurfaceWorksiteNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode <em>Maps List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maps List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode
	 * @generated
	 */
	EClass getMapsListNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode#getMapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode#getMapsList()
	 * @see #getMapsListNode()
	 * @generated
	 */
	EReference getMapsListNode_MapsList();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapNode <em>Map Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapNode
	 * @generated
	 */
	EClass getMapNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapNode#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapNode#getMap()
	 * @see #getMapNode()
	 * @generated
	 */
	EReference getMapNode_Map();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode <em>Abstract Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode
	 * @generated
	 */
	EClass getAbstractMapLayerNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode#getAbstractMapLayer <em>Abstract Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode#getAbstractMapLayer()
	 * @see #getAbstractMapLayerNode()
	 * @generated
	 */
	EReference getAbstractMapLayerNode_AbstractMapLayer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode
	 * @generated
	 */
	EClass getCartesianTriangularMeshMapLayerNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode#getCartesianTriangularMeshMapLayer() <em>Get Cartesian Triangular Mesh Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cartesian Triangular Mesh Map Layer</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode#getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EOperation getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities <em>Surface Environment Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Environment Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities
	 * @generated
	 */
	EClass getSurfaceEnvironmentUtilities();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities#convertToJulianDate(java.util.Date) <em>Convert To Julian Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Julian Date</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities#convertToJulianDate(java.util.Date)
	 * @generated
	 */
	EOperation getSurfaceEnvironmentUtilities__ConvertToJulianDate__Date();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities#parseRightAscension(java.lang.String) <em>Parse Right Ascension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Right Ascension</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities#parseRightAscension(java.lang.String)
	 * @generated
	 */
	EOperation getSurfaceEnvironmentUtilities__ParseRightAscension__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities#parseDegMinSec(java.lang.String) <em>Parse Deg Min Sec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Deg Min Sec</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities#parseDegMinSec(java.lang.String)
	 * @generated
	 */
	EOperation getSurfaceEnvironmentUtilities__ParseDegMinSec__String();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade
	 * @generated
	 */
	EClass getApogySurfaceEnvironmentFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#createEImage(java.util.List) <em>Create EImage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EImage</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#createEImage(java.util.List)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__CreateEImage__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getAbsoluteRectangularRegionCorners(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion) <em>Get Absolute Rectangular Region Corners</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Absolute Rectangular Region Corners</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getAbsoluteRectangularRegionCorners(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List) <em>Get Best Resolution Rectangular Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Best Resolution Rectangular Region Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetBestResolutionRectangularRegionImage__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionExtent(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionExtent(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionImageExtent(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionImageExtent(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#fitsInside(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion) <em>Fits Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fits Inside</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#fitsInside(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#intersects(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Intersects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intersects</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#intersects(ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getImageMapLayerPresentationExtent(ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getImageMapLayerPresentationExtent(ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List) <em>Get Image Map Layer Presentation Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationImage__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getBestResolutionMapLayer(java.util.List) <em>Get Best Resolution Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Best Resolution Map Layer</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getBestResolutionMapLayer(java.util.List)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetBestResolutionMapLayer__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List) <em>Get Visible Image Map Layer Presentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visible Image Map Layer Presentation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetVisibleImageMapLayerPresentation__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularVolumeRegion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Get Rectangular Volume Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Volume Region</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade#getRectangularVolumeRegion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

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
	ApogySurfaceEnvironmentFactory getApogySurfaceEnvironmentFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteImpl <em>Surface Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSurfaceWorksite()
		 * @generated
		 */
		EClass SURFACE_WORKSITE = eINSTANCE.getSurfaceWorksite();

		/**
		 * The meta object literal for the '<em><b>Maps List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_WORKSITE__MAPS_LIST = eINSTANCE.getSurfaceWorksite_MapsList();

		/**
		 * The meta object literal for the '<em><b>Celestial Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_WORKSITE__CELESTIAL_BODY = eINSTANCE.getSurfaceWorksite_CelestialBody();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__TRANSFORMATION = eINSTANCE.getMap_Transformation();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__LAYERS = eINSTANCE.getMap_Layers();

		/**
		 * The meta object literal for the '<em><b>Map Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__MAP_NODE = eINSTANCE.getMap_MapNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListImpl <em>Maps List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapsList()
		 * @generated
		 */
		EClass MAPS_LIST = eINSTANCE.getMapsList();

		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPS_LIST__MAPS = eINSTANCE.getMapsList_Maps();

		/**
		 * The meta object literal for the '<em><b>Maps List Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPS_LIST__MAPS_LIST_NODE = eINSTANCE.getMapsList_MapsListNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerImpl <em>Abstract Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getAbstractMapLayer()
		 * @generated
		 */
		EClass ABSTRACT_MAP_LAYER = eINSTANCE.getAbstractMapLayer();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAP_LAYER__MAP = eINSTANCE.getAbstractMapLayer_Map();

		/**
		 * The meta object literal for the '<em><b>Abstract Map Layer Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = eINSTANCE.getAbstractMapLayer_AbstractMapLayerNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapLayerPresentationImpl <em>Map Layer Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapLayerPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapLayerPresentation()
		 * @generated
		 */
		EClass MAP_LAYER_PRESENTATION = eINSTANCE.getMapLayerPresentation();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_LAYER_PRESENTATION__VISIBLE = eINSTANCE.getMapLayerPresentation_Visible();

		/**
		 * The meta object literal for the '<em><b>Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LAYER_PRESENTATION__MAP_LAYER = eINSTANCE.getMapLayerPresentation_MapLayer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.URLMapLayerImpl <em>URL Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.URLMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getURLMapLayer()
		 * @generated
		 */
		EClass URL_MAP_LAYER = eINSTANCE.getURLMapLayer();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_MAP_LAYER__URL = eINSTANCE.getURLMapLayer_Url();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RegionImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSFORMATION = eINSTANCE.getRegion_Transformation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularRegionImpl <em>Rectangular Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularRegionImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularRegion()
		 * @generated
		 */
		EClass RECTANGULAR_REGION = eINSTANCE.getRectangularRegion();

		/**
		 * The meta object literal for the '<em><b>XMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_REGION__XMIN = eINSTANCE.getRectangularRegion_XMin();

		/**
		 * The meta object literal for the '<em><b>XMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_REGION__XMAX = eINSTANCE.getRectangularRegion_XMax();

		/**
		 * The meta object literal for the '<em><b>YMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_REGION__YMIN = eINSTANCE.getRectangularRegion_YMin();

		/**
		 * The meta object literal for the '<em><b>YMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_REGION__YMAX = eINSTANCE.getRectangularRegion_YMax();

		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_REGION__XDIMENSION = eINSTANCE.getRectangularRegion_XDimension();

		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_REGION__YDIMENSION = eINSTANCE.getRectangularRegion_YDimension();

		/**
		 * The meta object literal for the '<em><b>Lower Left Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGULAR_REGION__LOWER_LEFT_CORNER = eINSTANCE.getRectangularRegion_LowerLeftCorner();

		/**
		 * The meta object literal for the '<em><b>Upper Left Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGULAR_REGION__UPPER_LEFT_CORNER = eINSTANCE.getRectangularRegion_UpperLeftCorner();

		/**
		 * The meta object literal for the '<em><b>Lower Right Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGULAR_REGION__LOWER_RIGHT_CORNER = eINSTANCE.getRectangularRegion_LowerRightCorner();

		/**
		 * The meta object literal for the '<em><b>Upper Right Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGULAR_REGION__UPPER_RIGHT_CORNER = eINSTANCE.getRectangularRegion_UpperRightCorner();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularVolumeRegionImpl <em>Rectangular Volume Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangularVolumeRegionImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularVolumeRegion()
		 * @generated
		 */
		EClass RECTANGULAR_VOLUME_REGION = eINSTANCE.getRectangularVolumeRegion();

		/**
		 * The meta object literal for the '<em><b>ZMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_VOLUME_REGION__ZMIN = eINSTANCE.getRectangularVolumeRegion_ZMin();

		/**
		 * The meta object literal for the '<em><b>ZMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_VOLUME_REGION__ZMAX = eINSTANCE.getRectangularVolumeRegion_ZMax();

		/**
		 * The meta object literal for the '<em><b>ZDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_VOLUME_REGION__ZDIMENSION = eINSTANCE.getRectangularVolumeRegion_ZDimension();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider <em>Rectangular Region Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularRegionProvider()
		 * @generated
		 */
		EClass RECTANGULAR_REGION_PROVIDER = eINSTANCE.getRectangularRegionProvider();

		/**
		 * The meta object literal for the '<em><b>Get Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECTANGULAR_REGION_PROVIDER___GET_REGION = eINSTANCE.getRectangularRegionProvider__GetRegion();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage <em>Rectangular Region Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangularRegionImage()
		 * @generated
		 */
		EClass RECTANGULAR_REGION_IMAGE = eINSTANCE.getRectangularRegionImage();

		/**
		 * The meta object literal for the '<em><b>Get Region Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE = eINSTANCE.getRectangularRegionImage__GetRegionImage();

		/**
		 * The meta object literal for the '<em><b>Get Resolution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECTANGULAR_REGION_IMAGE___GET_RESOLUTION = eINSTANCE.getRectangularRegionImage__GetResolution();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl <em>Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getImageMapLayer()
		 * @generated
		 */
		EClass IMAGE_MAP_LAYER = eINSTANCE.getImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MAP_LAYER__WIDTH = eINSTANCE.getImageMapLayer_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MAP_LAYER__HEIGHT = eINSTANCE.getImageMapLayer_Height();

		/**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MAP_LAYER__OPAQUE = eINSTANCE.getImageMapLayer_Opaque();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_MAP_LAYER__IMAGE = eINSTANCE.getImageMapLayer_Image();

		/**
		 * The meta object literal for the '<em><b>Legend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_MAP_LAYER__LEGEND = eINSTANCE.getImageMapLayer_Legend();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MAP_LAYER__RESOLUTION = eINSTANCE.getImageMapLayer_Resolution();

		/**
		 * The meta object literal for the '<em><b>Update Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = eINSTANCE.getImageMapLayer__UpdateImage__IProgressMonitor();

		/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = eINSTANCE.getImageMapLayer__GetImageMapLayerRegion();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerPresentationImpl <em>Image Map Layer Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ImageMapLayerPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getImageMapLayerPresentation()
		 * @generated
		 */
		EClass IMAGE_MAP_LAYER_PRESENTATION = eINSTANCE.getImageMapLayerPresentation();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MAP_LAYER_PRESENTATION__ALPHA = eINSTANCE.getImageMapLayerPresentation_Alpha();

		/**
		 * The meta object literal for the '<em><b>Get Image Map Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER = eINSTANCE.getImageMapLayerPresentation__GetImageMapLayer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.URLImageMapLayerImpl <em>URL Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.URLImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getURLImageMapLayer()
		 * @generated
		 */
		EClass URL_IMAGE_MAP_LAYER = eINSTANCE.getURLImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Legend URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_IMAGE_MAP_LAYER__LEGEND_URL = eINSTANCE.getURLImageMapLayer_LegendURL();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerImpl <em>Topology Tree Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getTopologyTreeMapLayer()
		 * @generated
		 */
		EClass TOPOLOGY_TREE_MAP_LAYER = eINSTANCE.getTopologyTreeMapLayer();

		/**
		 * The meta object literal for the '<em><b>Topology Tree Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT = eINSTANCE.getTopologyTreeMapLayer_TopologyTreeRoot();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerNodeImpl <em>Topology Tree Map Layer Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.TopologyTreeMapLayerNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getTopologyTreeMapLayerNode()
		 * @generated
		 */
		EClass TOPOLOGY_TREE_MAP_LAYER_NODE = eINSTANCE.getTopologyTreeMapLayerNode();

		/**
		 * The meta object literal for the '<em><b>Topology Tree Map Layer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER = eINSTANCE.getTopologyTreeMapLayerNode_TopologyTreeMapLayer();

		/**
		 * The meta object literal for the '<em><b>Transient Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT = eINSTANCE.getTopologyTreeMapLayerNode_TransientParent();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl <em>Cartesian Triangular Mesh Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshMapLayer();

		/**
		 * The meta object literal for the '<em><b>Mesh Is Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY = eINSTANCE.getCartesianTriangularMeshMapLayer_MeshIsDirty();

		/**
		 * The meta object literal for the '<em><b>Map Layer Presentations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS = eINSTANCE.getCartesianTriangularMeshMapLayer_MapLayerPresentations();

		/**
		 * The meta object literal for the '<em><b>Texture Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE = eINSTANCE.getCartesianTriangularMeshMapLayer_TextureImage();

		/**
		 * The meta object literal for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = eINSTANCE.getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode();

		/**
		 * The meta object literal for the '<em><b>Get Current Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH = eINSTANCE.getCartesianTriangularMeshMapLayer__GetCurrentMesh();

		/**
		 * The meta object literal for the '<em><b>Force Update Texture Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = eINSTANCE.getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDerivedImageMapLayerImpl <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDerivedImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshDerivedImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshDerivedImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Required Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = eINSTANCE.getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution();

		/**
		 * The meta object literal for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshSlopeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshSlopeImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Auto Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer_AutoScale();

		/**
		 * The meta object literal for the '<em><b>Minimum Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope();

		/**
		 * The meta object literal for the '<em><b>Maximum Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshDiscreteSlopeImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Slope Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES = eINSTANCE.getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshHeightImageMapLayerImpl <em>Cartesian Triangular Mesh Height Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshHeightImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshHeightImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Auto Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer_AutoScale();

		/**
		 * The meta object literal for the '<em><b>Minimum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight();

		/**
		 * The meta object literal for the '<em><b>Maximum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SlopeRangeImpl <em>Slope Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SlopeRangeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSlopeRange()
		 * @generated
		 */
		EClass SLOPE_RANGE = eINSTANCE.getSlopeRange();

		/**
		 * The meta object literal for the '<em><b>Slope Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_RANGE__SLOPE_LOWER_BOUND = eINSTANCE.getSlopeRange_SlopeLowerBound();

		/**
		 * The meta object literal for the '<em><b>Slope Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_RANGE__SLOPE_UPPER_BOUND = eINSTANCE.getSlopeRange_SlopeUpperBound();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_RANGE__COLOR = eINSTANCE.getSlopeRange_Color();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.LineOfSightImageMapLayerImpl <em>Line Of Sight Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.LineOfSightImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getLineOfSightImageMapLayer()
		 * @generated
		 */
		EClass LINE_OF_SIGHT_IMAGE_MAP_LAYER = eINSTANCE.getLineOfSightImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Line Of Sight Available Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR = eINSTANCE.getLineOfSightImageMapLayer_LineOfSightAvailableColor();

		/**
		 * The meta object literal for the '<em><b>Line Of Sight Not Available Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR = eINSTANCE.getLineOfSightImageMapLayer_LineOfSightNotAvailableColor();

		/**
		 * The meta object literal for the '<em><b>Observer Pose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE = eINSTANCE.getLineOfSightImageMapLayer_ObserverPose();

		/**
		 * The meta object literal for the '<em><b>Target Height Above Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND = eINSTANCE.getLineOfSightImageMapLayer_TargetHeightAboveGround();

		/**
		 * The meta object literal for the '<em><b>Use Height Perpendicular To Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND = eINSTANCE.getLineOfSightImageMapLayer_UseHeightPerpendicularToGround();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractShapeImageLayerImpl <em>Abstract Shape Image Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractShapeImageLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getAbstractShapeImageLayer()
		 * @generated
		 */
		EClass ABSTRACT_SHAPE_IMAGE_LAYER = eINSTANCE.getAbstractShapeImageLayer();

		/**
		 * The meta object literal for the '<em><b>Shaped Filled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED = eINSTANCE.getAbstractShapeImageLayer_ShapedFilled();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHAPE_IMAGE_LAYER__COLOR = eINSTANCE.getAbstractShapeImageLayer_Color();

		/**
		 * The meta object literal for the '<em><b>Required Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = eINSTANCE.getAbstractShapeImageLayer_RequiredResolution();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.EllipseShapeImageLayerImpl <em>Ellipse Shape Image Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.EllipseShapeImageLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getEllipseShapeImageLayer()
		 * @generated
		 */
		EClass ELLIPSE_SHAPE_IMAGE_LAYER = eINSTANCE.getEllipseShapeImageLayer();

		/**
		 * The meta object literal for the '<em><b>Ellipse Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_WIDTH = eINSTANCE.getEllipseShapeImageLayer_EllipseWidth();

		/**
		 * The meta object literal for the '<em><b>Ellipse Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_HEIGHT = eINSTANCE.getEllipseShapeImageLayer_EllipseHeight();

		/**
		 * The meta object literal for the '<em><b>Show Center Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = eINSTANCE.getEllipseShapeImageLayer_ShowCenterLines();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangleShapeImageLayerImpl <em>Rectangle Shape Image Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.RectangleShapeImageLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getRectangleShapeImageLayer()
		 * @generated
		 */
		EClass RECTANGLE_SHAPE_IMAGE_LAYER = eINSTANCE.getRectangleShapeImageLayer();

		/**
		 * The meta object literal for the '<em><b>Rectangle Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH = eINSTANCE.getRectangleShapeImageLayer_RectangleWidth();

		/**
		 * The meta object literal for the '<em><b>Rectangle Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT = eINSTANCE.getRectangleShapeImageLayer_RectangleHeight();

		/**
		 * The meta object literal for the '<em><b>Show Center Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = eINSTANCE.getRectangleShapeImageLayer_ShowCenterLines();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.PolygonShapeImageMapLayerImpl <em>Polygon Shape Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.PolygonShapeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getPolygonShapeImageMapLayer()
		 * @generated
		 */
		EClass POLYGON_SHAPE_IMAGE_MAP_LAYER = eINSTANCE.getPolygonShapeImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Get Vertices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES = eINSTANCE.getPolygonShapeImageMapLayer__GetVertices();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianCoordinatesPolygonShapeImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER = eINSTANCE.getCartesianCoordinatesPolygonShapeImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Polygon Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES = eINSTANCE.getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.BasicCartesianTriangularMeshMapLayerImpl <em>Basic Cartesian Triangular Mesh Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.BasicCartesianTriangularMeshMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getBasicCartesianTriangularMeshMapLayer()
		 * @generated
		 */
		EClass BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getBasicCartesianTriangularMeshMapLayer();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH = eINSTANCE.getBasicCartesianTriangularMeshMapLayer_Mesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshURLMapLayerImpl <em>Cartesian Triangular Mesh URL Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshURLMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshURLMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshURLMapLayer();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH = eINSTANCE.getCartesianTriangularMeshURLMapLayer_Mesh();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.FeaturesOfInterestMapLayerImpl <em>Features Of Interest Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.FeaturesOfInterestMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getFeaturesOfInterestMapLayer()
		 * @generated
		 */
		EClass FEATURES_OF_INTEREST_MAP_LAYER = eINSTANCE.getFeaturesOfInterestMapLayer();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_OF_INTEREST_MAP_LAYER__FEATURES = eINSTANCE.getFeaturesOfInterestMapLayer_Features();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteNodeImpl <em>Surface Worksite Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSurfaceWorksiteNode()
		 * @generated
		 */
		EClass SURFACE_WORKSITE_NODE = eINSTANCE.getSurfaceWorksiteNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListNodeImpl <em>Maps List Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapsListNode()
		 * @generated
		 */
		EClass MAPS_LIST_NODE = eINSTANCE.getMapsListNode();

		/**
		 * The meta object literal for the '<em><b>Maps List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPS_LIST_NODE__MAPS_LIST = eINSTANCE.getMapsListNode_MapsList();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapNodeImpl <em>Map Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.MapNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getMapNode()
		 * @generated
		 */
		EClass MAP_NODE = eINSTANCE.getMapNode();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_NODE__MAP = eINSTANCE.getMapNode_Map();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerNodeImpl <em>Abstract Map Layer Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getAbstractMapLayerNode()
		 * @generated
		 */
		EClass ABSTRACT_MAP_LAYER_NODE = eINSTANCE.getAbstractMapLayerNode();

		/**
		 * The meta object literal for the '<em><b>Abstract Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER = eINSTANCE.getAbstractMapLayerNode_AbstractMapLayer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerNodeImpl <em>Cartesian Triangular Mesh Map Layer Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.CartesianTriangularMeshMapLayerNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getCartesianTriangularMeshMapLayerNode()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = eINSTANCE.getCartesianTriangularMeshMapLayerNode();

		/**
		 * The meta object literal for the '<em><b>Get Cartesian Triangular Mesh Map Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceEnvironmentUtilitiesImpl <em>Surface Environment Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceEnvironmentUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getSurfaceEnvironmentUtilities()
		 * @generated
		 */
		EClass SURFACE_ENVIRONMENT_UTILITIES = eINSTANCE.getSurfaceEnvironmentUtilities();

		/**
		 * The meta object literal for the '<em><b>Convert To Julian Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SURFACE_ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE = eINSTANCE.getSurfaceEnvironmentUtilities__ConvertToJulianDate__Date();

		/**
		 * The meta object literal for the '<em><b>Parse Right Ascension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SURFACE_ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING = eINSTANCE.getSurfaceEnvironmentUtilities__ParseRightAscension__String();

		/**
		 * The meta object literal for the '<em><b>Parse Deg Min Sec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SURFACE_ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING = eINSTANCE.getSurfaceEnvironmentUtilities__ParseDegMinSec__String();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getApogySurfaceEnvironmentFacade()
		 * @generated
		 */
		EClass APOGY_SURFACE_ENVIRONMENT_FACADE = eINSTANCE.getApogySurfaceEnvironmentFacade();

		/**
		 * The meta object literal for the '<em><b>Create EImage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST = eINSTANCE.getApogySurfaceEnvironmentFacade__CreateEImage__List();

		/**
		 * The meta object literal for the '<em><b>Get Absolute Rectangular Region Corners</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION = eINSTANCE.getApogySurfaceEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion();

		/**
		 * The meta object literal for the '<em><b>Get Best Resolution Rectangular Region Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST = eINSTANCE.getApogySurfaceEnvironmentFacade__GetBestResolutionRectangularRegionImage__List();

		/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D = eINSTANCE.getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Image Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D = eINSTANCE.getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D = eINSTANCE.getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Image Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D = eINSTANCE.getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Fits Inside</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION = eINSTANCE.getApogySurfaceEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion();

		/**
		 * The meta object literal for the '<em><b>Intersects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4 = eINSTANCE.getApogySurfaceEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4();

		/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D = eINSTANCE.getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D = eINSTANCE.getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST = eINSTANCE.getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationImage__List();

		/**
		 * The meta object literal for the '<em><b>Get Best Resolution Map Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST = eINSTANCE.getApogySurfaceEnvironmentFacade__GetBestResolutionMapLayer__List();

		/**
		 * The meta object literal for the '<em><b>Get Visible Image Map Layer Presentation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST = eINSTANCE.getApogySurfaceEnvironmentFacade__GetVisibleImageMapLayerPresentation__List();

		/**
		 * The meta object literal for the '<em><b>Get Rectangular Volume Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH = eINSTANCE.getApogySurfaceEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

	}

} //ApogySurfaceEnvironmentPackage
