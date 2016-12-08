/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;

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
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreEnvironmentSurfaceEarthUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreEnvironmentUI' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.earth.surface.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment.earth.surface'"
 * @generated
 */
public interface ApogyCoreEnvironmentSurfaceEarthUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.earth.surface.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreEnvironmentSurfaceEarthUIPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSurfaceWorksitePresentationImpl <em>Earth Surface Worksite Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSurfaceWorksitePresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__NODE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__COLOR = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__SHADOW_MODE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__CENTROID = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__MIN = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__MAX = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__XRANGE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__YRANGE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__ZRANGE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__SCENE_OBJECT = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE;

	/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH;

	/**
	 * The feature id for the '<em><b>Azimuth Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE;

	/**
	 * The feature id for the '<em><b>Elevation Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE;

	/**
	 * The feature id for the '<em><b>Azimuth Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE;

	/**
	 * The feature id for the '<em><b>Plane Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE;

	/**
	 * The feature id for the '<em><b>Plane Grid Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE;

	/**
	 * The feature id for the '<em><b>Plane Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE;

	/**
	 * The number of structural features of the '<em>Earth Surface Worksite Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION_FEATURE_COUNT = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Earth Surface Worksite Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION_OPERATION_COUNT = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSkyPresentationImpl <em>Earth Sky Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSkyPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getEarthSkyPresentation()
	 * @generated
	 */
	int EARTH_SKY_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__NODE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__COLOR = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__SHADOW_MODE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__CENTROID = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__MIN = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__MAX = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__XRANGE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__YRANGE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__ZRANGE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__SCENE_OBJECT = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Horizon Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__HORIZON_VISIBLE = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__HORIZON_VISIBLE;

	/**
	 * The number of structural features of the '<em>Earth Sky Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION_FEATURE_COUNT = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Earth Sky Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION_OPERATION_COUNT = ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.MoonPresentationImpl <em>Moon Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.MoonPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getMoonPresentation()
	 * @generated
	 */
	int MOON_PRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The number of structural features of the '<em>Moon Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Moon Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EnvironmentUIUtilitiesImpl <em>Environment UI Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EnvironmentUIUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getEnvironmentUIUtilities()
	 * @generated
	 */
	int ENVIRONMENT_UI_UTILITIES = 3;

	/**
	 * The number of structural features of the '<em>Environment UI Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_UTILITIES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>To Point3f</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR = 0;

	/**
	 * The operation id for the '<em>Get Point Size For Magnitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT = 1;

	/**
	 * The operation id for the '<em>Get Sun Light Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE = 2;

	/**
	 * The operation id for the '<em>Get Sky Transparency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE = 3;

	/**
	 * The operation id for the '<em>Get Sky Color</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE = 4;

	/**
	 * The number of operations of the '<em>Environment UI Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_UTILITIES_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 4;

	/**
	 * The meta object id for the '<em>Point3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3f
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getPoint3f()
	 * @generated
	 */
	int POINT3F = 5;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation <em>Earth Surface Worksite Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Worksite Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation
	 * @generated
	 */
	EClass getEarthSurfaceWorksitePresentation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation <em>Earth Sky Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Sky Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation
	 * @generated
	 */
	EClass getEarthSkyPresentation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation <em>Moon Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moon Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation
	 * @generated
	 */
	EClass getMoonPresentation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities <em>Environment UI Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment UI Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities
	 * @generated
	 */
	EClass getEnvironmentUIUtilities();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#toPoint3f(ca.gc.asc_csa.apogy.core.environment.Star) <em>To Point3f</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Point3f</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#toPoint3f(ca.gc.asc_csa.apogy.core.environment.Star)
	 * @generated
	 */
	EOperation getEnvironmentUIUtilities__ToPoint3f__Star();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getPointSizeForMagnitude(float, float, float, float, float) <em>Get Point Size For Magnitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Point Size For Magnitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getPointSizeForMagnitude(float, float, float, float, float)
	 * @generated
	 */
	EOperation getEnvironmentUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getSunLightColor(double) <em>Get Sun Light Color</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Light Color</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getSunLightColor(double)
	 * @generated
	 */
	EOperation getEnvironmentUIUtilities__GetSunLightColor__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getSkyTransparency(double) <em>Get Sky Transparency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sky Transparency</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getSkyTransparency(double)
	 * @generated
	 */
	EOperation getEnvironmentUIUtilities__GetSkyTransparency__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getSkyColor(double) <em>Get Sky Color</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sky Color</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities#getSkyColor(double)
	 * @generated
	 */
	EOperation getEnvironmentUIUtilities__GetSkyColor__double();

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
	 * Returns the meta object for data type '{@link javax.vecmath.Point3f <em>Point3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3f</em>'.
	 * @see javax.vecmath.Point3f
	 * @model instanceClass="javax.vecmath.Point3f"
	 * @generated
	 */
	EDataType getPoint3f();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreEnvironmentSurfaceEarthUIFactory getApogyCoreEnvironmentSurfaceEarthUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSurfaceWorksitePresentationImpl <em>Earth Surface Worksite Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSurfaceWorksitePresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getEarthSurfaceWorksitePresentation()
		 * @generated
		 */
		EClass EARTH_SURFACE_WORKSITE_PRESENTATION = eINSTANCE.getEarthSurfaceWorksitePresentation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSkyPresentationImpl <em>Earth Sky Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EarthSkyPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getEarthSkyPresentation()
		 * @generated
		 */
		EClass EARTH_SKY_PRESENTATION = eINSTANCE.getEarthSkyPresentation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.MoonPresentationImpl <em>Moon Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.MoonPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getMoonPresentation()
		 * @generated
		 */
		EClass MOON_PRESENTATION = eINSTANCE.getMoonPresentation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EnvironmentUIUtilitiesImpl <em>Environment UI Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.EnvironmentUIUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getEnvironmentUIUtilities()
		 * @generated
		 */
		EClass ENVIRONMENT_UI_UTILITIES = eINSTANCE.getEnvironmentUIUtilities();

		/**
		 * The meta object literal for the '<em><b>To Point3f</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR = eINSTANCE.getEnvironmentUIUtilities__ToPoint3f__Star();

		/**
		 * The meta object literal for the '<em><b>Get Point Size For Magnitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT = eINSTANCE.getEnvironmentUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float();

		/**
		 * The meta object literal for the '<em><b>Get Sun Light Color</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE = eINSTANCE.getEnvironmentUIUtilities__GetSunLightColor__double();

		/**
		 * The meta object literal for the '<em><b>Get Sky Transparency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE = eINSTANCE.getEnvironmentUIUtilities__GetSkyTransparency__double();

		/**
		 * The meta object literal for the '<em><b>Get Sky Color</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE = eINSTANCE.getEnvironmentUIUtilities__GetSkyColor__double();

		/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();

		/**
		 * The meta object literal for the '<em>Point3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3f
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl.ApogyCoreEnvironmentSurfaceEarthUIPackageImpl#getPoint3f()
		 * @generated
		 */
		EDataType POINT3F = eINSTANCE.getPoint3f();

	}

} //ApogyCoreEnvironmentSurfaceEarthUIPackage
