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
package ca.gc.asc_csa.apogy.core.environment.surface.ui;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogySurfaceEnvironmentUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreSurfaceEnvironmentUI' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.surface.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.surface.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment.surface'"
 * @generated
 */
public interface ApogySurfaceEnvironmentUIPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.surface.ui";

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
	ApogySurfaceEnvironmentUIPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl <em>Abstract Surface Worksite Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Azimuth Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elevation Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Azimuth Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Plane Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Plane Grid Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plane Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Abstract Surface Worksite Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Abstract Surface Worksite Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksiteSkyPresentationImpl <em>Abstract Surface Worksite Sky Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksiteSkyPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractSurfaceWorksiteSkyPresentation()
	 * @generated
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Horizon Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__HORIZON_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Surface Worksite Sky Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Surface Worksite Sky Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MoonPresentationImpl <em>Moon Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MoonPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMoonPresentation()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeatureOfInterestNodePresentationImpl <em>Feature Of Interest Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeatureOfInterestNodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getFeatureOfInterestNodePresentation()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Pole Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flag Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Of Interest Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Of Interest Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getApogySurfaceEnvironmentUIFacade()
	 * @generated
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE = 4;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Visible Rectangular Region Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_VISIBLE_RECTANGULAR_REGION_PROVIDER__MAPVIEWCONFIGURATION = 0;

	/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__MAPVIEWCONFIGURATION_RECTANGULARREGION_INT = 1;

	/**
	 * The operation id for the '<em>Get Trajectory Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_TRAJECTORY_LENGTH__XYSERIES = 2;

	/**
	 * The operation id for the '<em>Get Map View Configuration Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_MAP_VIEW_CONFIGURATION_IDENTIFIER__MAPVIEWCONFIGURATION = 3;

	/**
	 * The operation id for the '<em>Get Active Map View Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION__STRING = 4;

	/**
	 * The operation id for the '<em>Get Active Map View Configuration List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION_LIST = 5;

	/**
	 * The operation id for the '<em>Get Feature Of Interest Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_FEATURE_OF_INTEREST_LISTS__INVOCATORSESSION = 6;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_SURFACE_ENVIRONMENT_UI_FACADE_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.EnvironmentSurfaceUIUtilitiesImpl <em>Environment Surface UI Utilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.EnvironmentSurfaceUIUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getEnvironmentSurfaceUIUtilities()
	 * @generated
	 */
	int ENVIRONMENT_SURFACE_UI_UTILITIES = 5;

	/**
	 * The number of structural features of the '<em>Environment Surface UI Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SURFACE_UI_UTILITIES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>To Point3f</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SURFACE_UI_UTILITIES___TO_POINT3F__STAR = 0;

	/**
	 * The operation id for the '<em>Get Point Size For Magnitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SURFACE_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT = 1;

	/**
	 * The number of operations of the '<em>Environment Surface UI Utilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_SURFACE_UI_UTILITIES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationListImpl <em>Map View Configuration List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapViewConfigurationList()
	 * @generated
	 */
	int MAP_VIEW_CONFIGURATION_LIST = 6;

	/**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION_LIST__TOOLS_LIST = ApogyCoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

	/**
	 * The feature id for the '<em><b>Map View Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS = ApogyCoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION_LIST_FEATURE_COUNT = ApogyCoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Map View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION_LIST_OPERATION_COUNT = ApogyCoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationImpl <em>Map View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapViewConfiguration()
	 * @generated
	 */
	int MAP_VIEW_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__MAP_LAYERS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Map Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Rectangular Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Map Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__MAP_IMAGE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Map Image Rectangular Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__EXTENT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Map View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION___FORCE_UPDATE = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Map View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewItemPresentationImpl <em>Map View Item Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewItemPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapViewItemPresentation()
	 * @generated
	 */
	int MAP_VIEW_ITEM_PRESENTATION = 8;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_ITEM_PRESENTATION__VISIBLE = 0;

	/**
	 * The number of structural features of the '<em>Map View Item Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_ITEM_PRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map View Item Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_ITEM_PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapAnnotationImpl <em>Map Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapAnnotationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapAnnotation()
	 * @generated
	 */
	int MAP_ANNOTATION = 9;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION__VISIBLE = MAP_VIEW_ITEM_PRESENTATION__VISIBLE;

	/**
	 * The number of structural features of the '<em>Map Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_FEATURE_COUNT = MAP_VIEW_ITEM_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION = MAP_VIEW_ITEM_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Map Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ANNOTATION_OPERATION_COUNT = MAP_VIEW_ITEM_PRESENTATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapToolImpl <em>Map Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapToolImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapTool()
	 * @generated
	 */
	int MAP_TOOL = 10;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL__VISIBLE = MAP_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL__ACTIVE = MAP_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL_FEATURE_COUNT = MAP_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL___GET_XY_SHAPE_ANNOTATION = MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = MAP_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL___DISPOSE = MAP_ANNOTATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = MAP_ANNOTATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Map Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TOOL_OPERATION_COUNT = MAP_ANNOTATION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapRulerImpl <em>Map Ruler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapRulerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapRuler()
	 * @generated
	 */
	int MAP_RULER = 11;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER__VISIBLE = MAP_TOOL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER__ACTIVE = MAP_TOOL__ACTIVE;

	/**
	 * The feature id for the '<em><b>Ruler Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER__RULER_COLOR = MAP_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Ruler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER_FEATURE_COUNT = MAP_TOOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER___GET_XY_SHAPE_ANNOTATION = MAP_TOOL___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER___INITIALIZE__CHARTCOMPOSITE_JFREECHART = MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER___DISPOSE = MAP_TOOL___DISPOSE;

	/**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER___POSITION_SELECTED__INT_DOUBLE_DOUBLE = MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Map Ruler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_RULER_OPERATION_COUNT = MAP_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeaturesOfInterestMapLayerPresentationImpl <em>Features Of Interest Map Layer Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeaturesOfInterestMapLayerPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION = 12;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__VISIBLE = MAP_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Features Of Interest Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER = MAP_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Of Interest Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS = MAP_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Of Interest Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR = MAP_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Features Of Interest Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION_FEATURE_COUNT = MAP_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_XY_SHAPE_ANNOTATION = MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_REGION = MAP_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Features Of Interest Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION_OPERATION_COUNT = MAP_ANNOTATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl <em>Trajectory Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getTrajectoryProvider()
	 * @generated
	 */
	int TRAJECTORY_PROVIDER = 13;

	/**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER__LATEST_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = 1;

	/**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = 3;

	/**
	 * The number of structural features of the '<em>Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER___INITIALIZE = 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER___CLEAR = 1;

	/**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = 2;

	/**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER___GET_XY_SERIES = 3;

	/**
	 * The number of operations of the '<em>Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PROVIDER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractTrajectoryToolImpl <em>Abstract Trajectory Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractTrajectoryToolImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractTrajectoryTool()
	 * @generated
	 */
	int ABSTRACT_TRAJECTORY_TOOL = 14;

	/**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL__LATEST_POSITION = TRAJECTORY_PROVIDER__LATEST_POSITION;

	/**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL__AZIMUTH_ANGLE = TRAJECTORY_PROVIDER__AZIMUTH_ANGLE;

	/**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_LENGTH = TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH;

	/**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_COLOR = TRAJECTORY_PROVIDER__TRAJECTORY_COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL__VISIBLE = TRAJECTORY_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL__ACTIVE = TRAJECTORY_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Trajectory Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL_FEATURE_COUNT = TRAJECTORY_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___INITIALIZE = TRAJECTORY_PROVIDER___INITIALIZE;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___CLEAR = TRAJECTORY_PROVIDER___CLEAR;

	/**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___AS_LIST_OF_POINT2D = TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D;

	/**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___GET_XY_SERIES = TRAJECTORY_PROVIDER___GET_XY_SERIES;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION = TRAJECTORY_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = TRAJECTORY_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___DISPOSE = TRAJECTORY_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = TRAJECTORY_PROVIDER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Trajectory Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRAJECTORY_TOOL_OPERATION_COUNT = TRAJECTORY_PROVIDER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryPickingToolImpl <em>Trajectory Picking Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryPickingToolImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getTrajectoryPickingTool()
	 * @generated
	 */
	int TRAJECTORY_PICKING_TOOL = 15;

	/**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL__LATEST_POSITION = ABSTRACT_TRAJECTORY_TOOL__LATEST_POSITION;

	/**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL__AZIMUTH_ANGLE = ABSTRACT_TRAJECTORY_TOOL__AZIMUTH_ANGLE;

	/**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL__TRAJECTORY_LENGTH = ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_LENGTH;

	/**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL__TRAJECTORY_COLOR = ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL__VISIBLE = ABSTRACT_TRAJECTORY_TOOL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL__ACTIVE = ABSTRACT_TRAJECTORY_TOOL__ACTIVE;

	/**
	 * The number of structural features of the '<em>Trajectory Picking Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL_FEATURE_COUNT = ABSTRACT_TRAJECTORY_TOOL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___INITIALIZE = ABSTRACT_TRAJECTORY_TOOL___INITIALIZE;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___CLEAR = ABSTRACT_TRAJECTORY_TOOL___CLEAR;

	/**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___AS_LIST_OF_POINT2D = ABSTRACT_TRAJECTORY_TOOL___AS_LIST_OF_POINT2D;

	/**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___GET_XY_SERIES = ABSTRACT_TRAJECTORY_TOOL___GET_XY_SERIES;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___GET_XY_SHAPE_ANNOTATION = ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___DISPOSE = ABSTRACT_TRAJECTORY_TOOL___DISPOSE;

	/**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Trajectory Picking Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_PICKING_TOOL_OPERATION_COUNT = ABSTRACT_TRAJECTORY_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryProviderImpl <em>Variable Trajectory Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryProviderImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getVariableTrajectoryProvider()
	 * @generated
	 */
	int VARIABLE_TRAJECTORY_PROVIDER = 16;

	/**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER__LATEST_POSITION = TRAJECTORY_PROVIDER__LATEST_POSITION;

	/**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = TRAJECTORY_PROVIDER__AZIMUTH_ANGLE;

	/**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH;

	/**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = TRAJECTORY_PROVIDER__TRAJECTORY_COLOR;

	/**
	 * The feature id for the '<em><b>Variable Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION = TRAJECTORY_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER = TRAJECTORY_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT = TRAJECTORY_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER___INITIALIZE = TRAJECTORY_PROVIDER___INITIALIZE;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER___CLEAR = TRAJECTORY_PROVIDER___CLEAR;

	/**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D;

	/**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER___GET_XY_SERIES = TRAJECTORY_PROVIDER___GET_XY_SERIES;

	/**
	 * The number of operations of the '<em>Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_PROVIDER_OPERATION_COUNT = TRAJECTORY_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.DefaultVariableTrajectoryProviderImpl <em>Default Variable Trajectory Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.DefaultVariableTrajectoryProviderImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getDefaultVariableTrajectoryProvider()
	 * @generated
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER = 17;

	/**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__LATEST_POSITION = VARIABLE_TRAJECTORY_PROVIDER__LATEST_POSITION;

	/**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_ANGLE;

	/**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH;

	/**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_COLOR;

	/**
	 * The feature id for the '<em><b>Variable Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION = VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION;

	/**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER = VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Distance Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD = VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Azimuth Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD = VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT = VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___INITIALIZE = VARIABLE_TRAJECTORY_PROVIDER___INITIALIZE;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___CLEAR = VARIABLE_TRAJECTORY_PROVIDER___CLEAR;

	/**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = VARIABLE_TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D;

	/**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___GET_XY_SERIES = VARIABLE_TRAJECTORY_PROVIDER___GET_XY_SERIES;

	/**
	 * The number of operations of the '<em>Default Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER_OPERATION_COUNT = VARIABLE_TRAJECTORY_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractVariableAnnotationImpl <em>Abstract Variable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractVariableAnnotationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractVariableAnnotation()
	 * @generated
	 */
	int ABSTRACT_VARIABLE_ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION__VISIBLE = MAP_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION__VARIABLE = MAP_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = MAP_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Apogy System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER = MAP_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT = MAP_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION = MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = MAP_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT = MAP_ANNOTATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.PoseVariableAnnotationImpl <em>Pose Variable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.PoseVariableAnnotationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getPoseVariableAnnotation()
	 * @generated
	 */
	int POSE_VARIABLE_ANNOTATION = 19;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION__VISIBLE = ABSTRACT_VARIABLE_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION__VARIABLE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Apogy System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER = ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER;

	/**
	 * The feature id for the '<em><b>Vectorlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION__VECTORLENGTH = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION__VECTOR_COLOR = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Pose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION__SHOW_POSE = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pose Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION_FEATURE_COUNT = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION = ABSTRACT_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pose Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION_OPERATION_COUNT = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryAnnotationImpl <em>Variable Trajectory Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryAnnotationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getVariableTrajectoryAnnotation()
	 * @generated
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION = 20;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__VISIBLE = ABSTRACT_VARIABLE_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__VARIABLE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__VARIABLE_INSTANCE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Apogy System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__APOGY_SYSTEM_API_ADAPTER = ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER;

	/**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trajectory Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Variable Trajectory Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION_FEATURE_COUNT = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION___GET_XY_SHAPE_ANNOTATION = ABSTRACT_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION___UPDATE_POSE__MATRIX4X4 = ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION___INITIALIZE = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION___CLEAR = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION___AS_LIST_OF_POINT2D = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION___GET_XY_SERIES = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Variable Trajectory Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION_OPERATION_COUNT = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VehicleVariableAnnotationImpl <em>Vehicle Variable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VehicleVariableAnnotationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getVehicleVariableAnnotation()
	 * @generated
	 */
	int VEHICLE_VARIABLE_ANNOTATION = 21;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__VISIBLE = POSE_VARIABLE_ANNOTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__VARIABLE = POSE_VARIABLE_ANNOTATION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = POSE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

	/**
	 * The feature id for the '<em><b>Apogy System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER = POSE_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER;

	/**
	 * The feature id for the '<em><b>Vectorlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__VECTORLENGTH = POSE_VARIABLE_ANNOTATION__VECTORLENGTH;

	/**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__VECTOR_COLOR = POSE_VARIABLE_ANNOTATION__VECTOR_COLOR;

	/**
	 * The feature id for the '<em><b>Show Pose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__SHOW_POSE = POSE_VARIABLE_ANNOTATION__SHOW_POSE;

	/**
	 * The feature id for the '<em><b>Vehicle Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH = POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicle Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH = POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vehicle Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION_FEATURE_COUNT = POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION = POSE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = POSE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

	/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Vehicle Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION_OPERATION_COUNT = POSE_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getList()
	 * @generated
	 */
	int LIST = 22;

	/**
	 * The meta object id for the '<em>Point2d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point2d
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getPoint2d()
	 * @generated
	 */
	int POINT2D = 23;

	/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 24;

	/**
	 * The meta object id for the '<em>Point3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3f
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getPoint3f()
	 * @generated
	 */
	int POINT3F = 25;

	/**
	 * The meta object id for the '<em>XY Series</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.data.xy.XYSeries
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getXYSeries()
	 * @generated
	 */
	int XY_SERIES = 26;

	/**
	 * The meta object id for the '<em>XY Plot</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.chart.plot.XYPlot
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getXYPlot()
	 * @generated
	 */
	int XY_PLOT = 27;

	/**
	 * The meta object id for the '<em>XY Data Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.data.xy.XYDataItem
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getXYDataItem()
	 * @generated
	 */
	int XY_DATA_ITEM = 28;

	/**
	 * The meta object id for the '<em>Abstract XY Annotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.chart.annotations.AbstractXYAnnotation
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractXYAnnotation()
	 * @generated
	 */
	int ABSTRACT_XY_ANNOTATION = 29;

	/**
	 * The meta object id for the '<em>Chart Composite</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.experimental.chart.swt.ChartComposite
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getChartComposite()
	 * @generated
	 */
	int CHART_COMPOSITE = 30;

	/**
	 * The meta object id for the '<em>JFree Chart</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.chart.JFreeChart
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getJFreeChart()
	 * @generated
	 */
	int JFREE_CHART = 31;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation <em>Abstract Surface Worksite Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Surface Worksite Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation
	 * @generated
	 */
	EClass getAbstractSurfaceWorksitePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isAxisVisible()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#getAxisLength <em>Axis Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Length</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#getAxisLength()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_AxisLength();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isAzimuthVisible <em>Azimuth Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isAzimuthVisible()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_AzimuthVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isElevationLinesVisible <em>Elevation Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation Lines Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isElevationLinesVisible()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_ElevationLinesVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isAzimuthLinesVisible <em>Azimuth Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Lines Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isAzimuthLinesVisible()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_AzimuthLinesVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isPlaneVisible <em>Plane Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plane Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#isPlaneVisible()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_PlaneVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#getPlaneGridSize <em>Plane Grid Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plane Grid Size</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#getPlaneGridSize()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_PlaneGridSize();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#getPlaneSize <em>Plane Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plane Size</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation#getPlaneSize()
	 * @see #getAbstractSurfaceWorksitePresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksitePresentation_PlaneSize();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation <em>Abstract Surface Worksite Sky Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Surface Worksite Sky Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation
	 * @generated
	 */
	EClass getAbstractSurfaceWorksiteSkyPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation#isHorizonVisible <em>Horizon Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizon Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation#isHorizonVisible()
	 * @see #getAbstractSurfaceWorksiteSkyPresentation()
	 * @generated
	 */
	EAttribute getAbstractSurfaceWorksiteSkyPresentation_HorizonVisible();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MoonPresentation <em>Moon Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moon Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MoonPresentation
	 * @generated
	 */
	EClass getMoonPresentation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation <em>Feature Of Interest Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation
	 * @generated
	 */
	EClass getFeatureOfInterestNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation#getPoleHeight <em>Pole Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pole Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation#getPoleHeight()
	 * @see #getFeatureOfInterestNodePresentation()
	 * @generated
	 */
	EAttribute getFeatureOfInterestNodePresentation_PoleHeight();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation#isFlagVisible <em>Flag Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation#isFlagVisible()
	 * @see #getFeatureOfInterestNodePresentation()
	 * @generated
	 */
	EAttribute getFeatureOfInterestNodePresentation_FlagVisible();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade
	 * @generated
	 */
	EClass getApogySurfaceEnvironmentUIFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getVisibleRectangularRegionProvider(ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration) <em>Get Visible Rectangular Region Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visible Rectangular Region Provider</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getVisibleRectangularRegionProvider(ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentUIFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getImageMapLayerPresentationImage(ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration, ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, int) <em>Get Image Map Layer Presentation Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getImageMapLayerPresentationImage(ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration, ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion, int)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentUIFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getTrajectoryLength(org.jfree.data.xy.XYSeries) <em>Get Trajectory Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Trajectory Length</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getTrajectoryLength(org.jfree.data.xy.XYSeries)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentUIFacade__GetTrajectoryLength__XYSeries();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getMapViewConfigurationIdentifier(ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration) <em>Get Map View Configuration Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Map View Configuration Identifier</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getMapViewConfigurationIdentifier(ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentUIFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getActiveMapViewConfiguration(java.lang.String) <em>Get Active Map View Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Map View Configuration</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getActiveMapViewConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentUIFacade__GetActiveMapViewConfiguration__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getActiveMapViewConfigurationList() <em>Get Active Map View Configuration List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Map View Configuration List</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getActiveMapViewConfigurationList()
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentUIFacade__GetActiveMapViewConfigurationList();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getFeatureOfInterestLists(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession) <em>Get Feature Of Interest Lists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Of Interest Lists</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade#getFeatureOfInterestLists(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession)
	 * @generated
	 */
	EOperation getApogySurfaceEnvironmentUIFacade__GetFeatureOfInterestLists__InvocatorSession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities <em>Environment Surface UI Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Surface UI Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities
	 * @generated
	 */
	EClass getEnvironmentSurfaceUIUtilities();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities#toPoint3f(ca.gc.asc_csa.apogy.core.environment.Star) <em>To Point3f</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Point3f</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities#toPoint3f(ca.gc.asc_csa.apogy.core.environment.Star)
	 * @generated
	 */
	EOperation getEnvironmentSurfaceUIUtilities__ToPoint3f__Star();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities#getPointSizeForMagnitude(float, float, float, float, float) <em>Get Point Size For Magnitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Point Size For Magnitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities#getPointSizeForMagnitude(float, float, float, float, float)
	 * @generated
	 */
	EOperation getEnvironmentSurfaceUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfigurationList <em>Map View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Configuration List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfigurationList
	 * @generated
	 */
	EClass getMapViewConfigurationList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfigurationList#getMapViewConfigurations <em>Map View Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map View Configurations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfigurationList#getMapViewConfigurations()
	 * @see #getMapViewConfigurationList()
	 * @generated
	 */
	EReference getMapViewConfigurationList_MapViewConfigurations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration <em>Map View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Configuration</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration
	 * @generated
	 */
	EClass getMapViewConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapLayers <em>Map Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Layers</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapLayers()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_MapLayers();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getBackgroundColor()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EAttribute getMapViewConfiguration_BackgroundColor();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapAnnotations <em>Map Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Annotations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapAnnotations()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_MapAnnotations();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getDefaultRectangularRegion <em>Default Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Rectangular Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getDefaultRectangularRegion()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_DefaultRectangularRegion();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapImage <em>Map Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Image</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapImage()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_MapImage();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapImageRectangularRegion <em>Map Image Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Image Rectangular Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getMapImageRectangularRegion()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_MapImageRectangularRegion();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#getExtent()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_Extent();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#forceUpdate() <em>Force Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Force Update</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration#forceUpdate()
	 * @generated
	 */
	EOperation getMapViewConfiguration__ForceUpdate();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewItemPresentation <em>Map View Item Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Item Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewItemPresentation
	 * @generated
	 */
	EClass getMapViewItemPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewItemPresentation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewItemPresentation#isVisible()
	 * @see #getMapViewItemPresentation()
	 * @generated
	 */
	EAttribute getMapViewItemPresentation_Visible();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapAnnotation <em>Map Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Annotation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapAnnotation
	 * @generated
	 */
	EClass getMapAnnotation();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapAnnotation#getXYShapeAnnotation() <em>Get XY Shape Annotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XY Shape Annotation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapAnnotation#getXYShapeAnnotation()
	 * @generated
	 */
	EOperation getMapAnnotation__GetXYShapeAnnotation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool <em>Map Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Tool</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool
	 * @generated
	 */
	EClass getMapTool();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#isActive()
	 * @see #getMapTool()
	 * @generated
	 */
	EAttribute getMapTool_Active();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#initialize(org.jfree.experimental.chart.swt.ChartComposite, org.jfree.chart.JFreeChart) <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#initialize(org.jfree.experimental.chart.swt.ChartComposite, org.jfree.chart.JFreeChart)
	 * @generated
	 */
	EOperation getMapTool__Initialize__ChartComposite_JFreeChart();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#dispose()
	 * @generated
	 */
	EOperation getMapTool__Dispose();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#positionSelected(int, double, double) <em>Position Selected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Position Selected</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool#positionSelected(int, double, double)
	 * @generated
	 */
	EOperation getMapTool__PositionSelected__int_double_double();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapRuler <em>Map Ruler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Ruler</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapRuler
	 * @generated
	 */
	EClass getMapRuler();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapRuler#getRulerColor <em>Ruler Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruler Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.MapRuler#getRulerColor()
	 * @see #getMapRuler()
	 * @generated
	 */
	EAttribute getMapRuler_RulerColor();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation <em>Features Of Interest Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Of Interest Map Layer Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation
	 * @generated
	 */
	EClass getFeaturesOfInterestMapLayerPresentation();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Features Of Interest Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeaturesOfInterestMapLayer()
	 * @see #getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	EReference getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestRadius <em>Feature Of Interest Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Of Interest Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestRadius()
	 * @see #getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	EAttribute getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestColor <em>Feature Of Interest Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Of Interest Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestColor()
	 * @see #getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	EAttribute getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider <em>Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider
	 * @generated
	 */
	EClass getTrajectoryProvider();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getLatestPosition <em>Latest Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Position</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getLatestPosition()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
	EAttribute getTrajectoryProvider_LatestPosition();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getAzimuthAngle <em>Azimuth Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getAzimuthAngle()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
	EAttribute getTrajectoryProvider_AzimuthAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getTrajectoryLength <em>Trajectory Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trajectory Length</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getTrajectoryLength()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
	EAttribute getTrajectoryProvider_TrajectoryLength();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getTrajectoryColor <em>Trajectory Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trajectory Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getTrajectoryColor()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
	EAttribute getTrajectoryProvider_TrajectoryColor();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#initialize()
	 * @generated
	 */
	EOperation getTrajectoryProvider__Initialize();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#clear()
	 * @generated
	 */
	EOperation getTrajectoryProvider__Clear();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#asListOfPoint2d() <em>As List Of Point2d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As List Of Point2d</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#asListOfPoint2d()
	 * @generated
	 */
	EOperation getTrajectoryProvider__AsListOfPoint2d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getXYSeries() <em>Get XY Series</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XY Series</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider#getXYSeries()
	 * @generated
	 */
	EOperation getTrajectoryProvider__GetXYSeries();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractTrajectoryTool <em>Abstract Trajectory Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Trajectory Tool</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractTrajectoryTool
	 * @generated
	 */
	EClass getAbstractTrajectoryTool();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryPickingTool <em>Trajectory Picking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory Picking Tool</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryPickingTool
	 * @generated
	 */
	EClass getTrajectoryPickingTool();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider <em>Variable Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Trajectory Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider
	 * @generated
	 */
	EClass getVariableTrajectoryProvider();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider#getVariableAnnotation <em>Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Annotation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider#getVariableAnnotation()
	 * @see #getVariableTrajectoryProvider()
	 * @generated
	 */
	EReference getVariableTrajectoryProvider_VariableAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider#getPoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider#getPoseProvider()
	 * @see #getVariableTrajectoryProvider()
	 * @generated
	 */
	EReference getVariableTrajectoryProvider_PoseProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider <em>Default Variable Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Variable Trajectory Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider
	 * @generated
	 */
	EClass getDefaultVariableTrajectoryProvider();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold <em>Distance Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Threshold</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold()
	 * @see #getDefaultVariableTrajectoryProvider()
	 * @generated
	 */
	EAttribute getDefaultVariableTrajectoryProvider_DistanceThreshold();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold <em>Azimuth Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Threshold</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold()
	 * @see #getDefaultVariableTrajectoryProvider()
	 * @generated
	 */
	EAttribute getDefaultVariableTrajectoryProvider_AzimuthThreshold();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation <em>Abstract Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Variable Annotation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation
	 * @generated
	 */
	EClass getAbstractVariableAnnotation();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariable()
	 * @see #getAbstractVariableAnnotation()
	 * @generated
	 */
	EReference getAbstractVariableAnnotation_Variable();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariableInstance <em>Variable Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Instance</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariableInstance()
	 * @see #getAbstractVariableAnnotation()
	 * @generated
	 */
	EReference getAbstractVariableAnnotation_VariableInstance();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getApogySystemApiAdapter <em>Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apogy System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getApogySystemApiAdapter()
	 * @see #getAbstractVariableAnnotation()
	 * @generated
	 */
	EReference getAbstractVariableAnnotation_ApogySystemApiAdapter();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#updatePose(ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Update Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Pose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#updatePose(ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getAbstractVariableAnnotation__UpdatePose__Matrix4x4();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation <em>Pose Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Variable Annotation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation
	 * @generated
	 */
	EClass getPoseVariableAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#getVectorlength <em>Vectorlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vectorlength</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#getVectorlength()
	 * @see #getPoseVariableAnnotation()
	 * @generated
	 */
	EAttribute getPoseVariableAnnotation_Vectorlength();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#getVectorColor <em>Vector Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#getVectorColor()
	 * @see #getPoseVariableAnnotation()
	 * @generated
	 */
	EAttribute getPoseVariableAnnotation_VectorColor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#isShowPose <em>Show Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Pose</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#isShowPose()
	 * @see #getPoseVariableAnnotation()
	 * @generated
	 */
	EAttribute getPoseVariableAnnotation_ShowPose();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#updatePose(double, double, double) <em>Update Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Pose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation#updatePose(double, double, double)
	 * @generated
	 */
	EOperation getPoseVariableAnnotation__UpdatePose__double_double_double();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation <em>Variable Trajectory Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Trajectory Annotation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation
	 * @generated
	 */
	EClass getVariableTrajectoryAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation#getTrajectoryProvider <em>Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trajectory Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation#getTrajectoryProvider()
	 * @see #getVariableTrajectoryAnnotation()
	 * @generated
	 */
	EReference getVariableTrajectoryAnnotation_TrajectoryProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation <em>Vehicle Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Variable Annotation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation
	 * @generated
	 */
	EClass getVehicleVariableAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleLength <em>Vehicle Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Length</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleLength()
	 * @see #getVehicleVariableAnnotation()
	 * @generated
	 */
	EAttribute getVehicleVariableAnnotation_VehicleLength();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleWidth <em>Vehicle Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Width</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation#getVehicleWidth()
	 * @see #getVehicleVariableAnnotation()
	 * @generated
	 */
	EAttribute getVehicleVariableAnnotation_VehicleWidth();

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
	 * Returns the meta object for data type '{@link javax.vecmath.Point2d <em>Point2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point2d</em>'.
	 * @see javax.vecmath.Point2d
	 * @model instanceClass="javax.vecmath.Point2d"
	 * @generated
	 */
	EDataType getPoint2d();

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
	 * Returns the meta object for data type '{@link org.jfree.data.xy.XYSeries <em>XY Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Series</em>'.
	 * @see org.jfree.data.xy.XYSeries
	 * @model instanceClass="org.jfree.data.xy.XYSeries"
	 * @generated
	 */
	EDataType getXYSeries();

	/**
	 * Returns the meta object for data type '{@link org.jfree.chart.plot.XYPlot <em>XY Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Plot</em>'.
	 * @see org.jfree.chart.plot.XYPlot
	 * @model instanceClass="org.jfree.chart.plot.XYPlot"
	 * @generated
	 */
	EDataType getXYPlot();

	/**
	 * Returns the meta object for data type '{@link org.jfree.data.xy.XYDataItem <em>XY Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Data Item</em>'.
	 * @see org.jfree.data.xy.XYDataItem
	 * @model instanceClass="org.jfree.data.xy.XYDataItem"
	 * @generated
	 */
	EDataType getXYDataItem();

	/**
	 * Returns the meta object for data type '{@link org.jfree.chart.annotations.AbstractXYAnnotation <em>Abstract XY Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstract XY Annotation</em>'.
	 * @see org.jfree.chart.annotations.AbstractXYAnnotation
	 * @model instanceClass="org.jfree.chart.annotations.AbstractXYAnnotation"
	 * @generated
	 */
	EDataType getAbstractXYAnnotation();

	/**
	 * Returns the meta object for data type '{@link org.jfree.experimental.chart.swt.ChartComposite <em>Chart Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Chart Composite</em>'.
	 * @see org.jfree.experimental.chart.swt.ChartComposite
	 * @model instanceClass="org.jfree.experimental.chart.swt.ChartComposite"
	 * @generated
	 */
	EDataType getChartComposite();

	/**
	 * Returns the meta object for data type '{@link org.jfree.chart.JFreeChart <em>JFree Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JFree Chart</em>'.
	 * @see org.jfree.chart.JFreeChart
	 * @model instanceClass="org.jfree.chart.JFreeChart"
	 * @generated
	 */
	EDataType getJFreeChart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogySurfaceEnvironmentUIFactory getApogySurfaceEnvironmentUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl <em>Abstract Surface Worksite Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractSurfaceWorksitePresentation()
		 * @generated
		 */
		EClass ABSTRACT_SURFACE_WORKSITE_PRESENTATION = eINSTANCE.getAbstractSurfaceWorksitePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getAbstractSurfaceWorksitePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH = eINSTANCE.getAbstractSurfaceWorksitePresentation_AxisLength();

		/**
		 * The meta object literal for the '<em><b>Azimuth Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE = eINSTANCE.getAbstractSurfaceWorksitePresentation_AzimuthVisible();

		/**
		 * The meta object literal for the '<em><b>Elevation Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE = eINSTANCE.getAbstractSurfaceWorksitePresentation_ElevationLinesVisible();

		/**
		 * The meta object literal for the '<em><b>Azimuth Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE = eINSTANCE.getAbstractSurfaceWorksitePresentation_AzimuthLinesVisible();

		/**
		 * The meta object literal for the '<em><b>Plane Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE = eINSTANCE.getAbstractSurfaceWorksitePresentation_PlaneVisible();

		/**
		 * The meta object literal for the '<em><b>Plane Grid Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE = eINSTANCE.getAbstractSurfaceWorksitePresentation_PlaneGridSize();

		/**
		 * The meta object literal for the '<em><b>Plane Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE = eINSTANCE.getAbstractSurfaceWorksitePresentation_PlaneSize();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksiteSkyPresentationImpl <em>Abstract Surface Worksite Sky Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksiteSkyPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractSurfaceWorksiteSkyPresentation()
		 * @generated
		 */
		EClass ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION = eINSTANCE.getAbstractSurfaceWorksiteSkyPresentation();

		/**
		 * The meta object literal for the '<em><b>Horizon Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION__HORIZON_VISIBLE = eINSTANCE.getAbstractSurfaceWorksiteSkyPresentation_HorizonVisible();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MoonPresentationImpl <em>Moon Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MoonPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMoonPresentation()
		 * @generated
		 */
		EClass MOON_PRESENTATION = eINSTANCE.getMoonPresentation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeatureOfInterestNodePresentationImpl <em>Feature Of Interest Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeatureOfInterestNodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getFeatureOfInterestNodePresentation()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_NODE_PRESENTATION = eINSTANCE.getFeatureOfInterestNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Pole Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT = eINSTANCE.getFeatureOfInterestNodePresentation_PoleHeight();

		/**
		 * The meta object literal for the '<em><b>Flag Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE = eINSTANCE.getFeatureOfInterestNodePresentation_FlagVisible();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getApogySurfaceEnvironmentUIFacade()
		 * @generated
		 */
		EClass APOGY_SURFACE_ENVIRONMENT_UI_FACADE = eINSTANCE.getApogySurfaceEnvironmentUIFacade();

		/**
		 * The meta object literal for the '<em><b>Get Visible Rectangular Region Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_VISIBLE_RECTANGULAR_REGION_PROVIDER__MAPVIEWCONFIGURATION = eINSTANCE.getApogySurfaceEnvironmentUIFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration();

		/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__MAPVIEWCONFIGURATION_RECTANGULARREGION_INT = eINSTANCE.getApogySurfaceEnvironmentUIFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int();

		/**
		 * The meta object literal for the '<em><b>Get Trajectory Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_TRAJECTORY_LENGTH__XYSERIES = eINSTANCE.getApogySurfaceEnvironmentUIFacade__GetTrajectoryLength__XYSeries();

		/**
		 * The meta object literal for the '<em><b>Get Map View Configuration Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_MAP_VIEW_CONFIGURATION_IDENTIFIER__MAPVIEWCONFIGURATION = eINSTANCE.getApogySurfaceEnvironmentUIFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration();

		/**
		 * The meta object literal for the '<em><b>Get Active Map View Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION__STRING = eINSTANCE.getApogySurfaceEnvironmentUIFacade__GetActiveMapViewConfiguration__String();

		/**
		 * The meta object literal for the '<em><b>Get Active Map View Configuration List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION_LIST = eINSTANCE.getApogySurfaceEnvironmentUIFacade__GetActiveMapViewConfigurationList();

		/**
		 * The meta object literal for the '<em><b>Get Feature Of Interest Lists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_SURFACE_ENVIRONMENT_UI_FACADE___GET_FEATURE_OF_INTEREST_LISTS__INVOCATORSESSION = eINSTANCE.getApogySurfaceEnvironmentUIFacade__GetFeatureOfInterestLists__InvocatorSession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.EnvironmentSurfaceUIUtilitiesImpl <em>Environment Surface UI Utilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.EnvironmentSurfaceUIUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getEnvironmentSurfaceUIUtilities()
		 * @generated
		 */
		EClass ENVIRONMENT_SURFACE_UI_UTILITIES = eINSTANCE.getEnvironmentSurfaceUIUtilities();

		/**
		 * The meta object literal for the '<em><b>To Point3f</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_SURFACE_UI_UTILITIES___TO_POINT3F__STAR = eINSTANCE.getEnvironmentSurfaceUIUtilities__ToPoint3f__Star();

		/**
		 * The meta object literal for the '<em><b>Get Point Size For Magnitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_SURFACE_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT = eINSTANCE.getEnvironmentSurfaceUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationListImpl <em>Map View Configuration List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapViewConfigurationList()
		 * @generated
		 */
		EClass MAP_VIEW_CONFIGURATION_LIST = eINSTANCE.getMapViewConfigurationList();

		/**
		 * The meta object literal for the '<em><b>Map View Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS = eINSTANCE.getMapViewConfigurationList_MapViewConfigurations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationImpl <em>Map View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewConfigurationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapViewConfiguration()
		 * @generated
		 */
		EClass MAP_VIEW_CONFIGURATION = eINSTANCE.getMapViewConfiguration();

		/**
		 * The meta object literal for the '<em><b>Map Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__MAP_LAYERS = eINSTANCE.getMapViewConfiguration_MapLayers();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR = eINSTANCE.getMapViewConfiguration_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Map Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS = eINSTANCE.getMapViewConfiguration_MapAnnotations();

		/**
		 * The meta object literal for the '<em><b>Default Rectangular Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION = eINSTANCE.getMapViewConfiguration_DefaultRectangularRegion();

		/**
		 * The meta object literal for the '<em><b>Map Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__MAP_IMAGE = eINSTANCE.getMapViewConfiguration_MapImage();

		/**
		 * The meta object literal for the '<em><b>Map Image Rectangular Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION = eINSTANCE.getMapViewConfiguration_MapImageRectangularRegion();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__EXTENT = eINSTANCE.getMapViewConfiguration_Extent();

		/**
		 * The meta object literal for the '<em><b>Force Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_VIEW_CONFIGURATION___FORCE_UPDATE = eINSTANCE.getMapViewConfiguration__ForceUpdate();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewItemPresentationImpl <em>Map View Item Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapViewItemPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapViewItemPresentation()
		 * @generated
		 */
		EClass MAP_VIEW_ITEM_PRESENTATION = eINSTANCE.getMapViewItemPresentation();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW_ITEM_PRESENTATION__VISIBLE = eINSTANCE.getMapViewItemPresentation_Visible();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapAnnotationImpl <em>Map Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapAnnotationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapAnnotation()
		 * @generated
		 */
		EClass MAP_ANNOTATION = eINSTANCE.getMapAnnotation();

		/**
		 * The meta object literal for the '<em><b>Get XY Shape Annotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION = eINSTANCE.getMapAnnotation__GetXYShapeAnnotation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapToolImpl <em>Map Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapToolImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapTool()
		 * @generated
		 */
		EClass MAP_TOOL = eINSTANCE.getMapTool();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TOOL__ACTIVE = eINSTANCE.getMapTool_Active();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = eINSTANCE.getMapTool__Initialize__ChartComposite_JFreeChart();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_TOOL___DISPOSE = eINSTANCE.getMapTool__Dispose();

		/**
		 * The meta object literal for the '<em><b>Position Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = eINSTANCE.getMapTool__PositionSelected__int_double_double();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapRulerImpl <em>Map Ruler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.MapRulerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getMapRuler()
		 * @generated
		 */
		EClass MAP_RULER = eINSTANCE.getMapRuler();

		/**
		 * The meta object literal for the '<em><b>Ruler Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_RULER__RULER_COLOR = eINSTANCE.getMapRuler_RulerColor();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeaturesOfInterestMapLayerPresentationImpl <em>Features Of Interest Map Layer Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.FeaturesOfInterestMapLayerPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getFeaturesOfInterestMapLayerPresentation()
		 * @generated
		 */
		EClass FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION = eINSTANCE.getFeaturesOfInterestMapLayerPresentation();

		/**
		 * The meta object literal for the '<em><b>Features Of Interest Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER = eINSTANCE.getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer();

		/**
		 * The meta object literal for the '<em><b>Feature Of Interest Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS = eINSTANCE.getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius();

		/**
		 * The meta object literal for the '<em><b>Feature Of Interest Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR = eINSTANCE.getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl <em>Trajectory Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getTrajectoryProvider()
		 * @generated
		 */
		EClass TRAJECTORY_PROVIDER = eINSTANCE.getTrajectoryProvider();

		/**
		 * The meta object literal for the '<em><b>Latest Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY_PROVIDER__LATEST_POSITION = eINSTANCE.getTrajectoryProvider_LatestPosition();

		/**
		 * The meta object literal for the '<em><b>Azimuth Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = eINSTANCE.getTrajectoryProvider_AzimuthAngle();

		/**
		 * The meta object literal for the '<em><b>Trajectory Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = eINSTANCE.getTrajectoryProvider_TrajectoryLength();

		/**
		 * The meta object literal for the '<em><b>Trajectory Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = eINSTANCE.getTrajectoryProvider_TrajectoryColor();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAJECTORY_PROVIDER___INITIALIZE = eINSTANCE.getTrajectoryProvider__Initialize();

		/**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAJECTORY_PROVIDER___CLEAR = eINSTANCE.getTrajectoryProvider__Clear();

		/**
		 * The meta object literal for the '<em><b>As List Of Point2d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = eINSTANCE.getTrajectoryProvider__AsListOfPoint2d();

		/**
		 * The meta object literal for the '<em><b>Get XY Series</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAJECTORY_PROVIDER___GET_XY_SERIES = eINSTANCE.getTrajectoryProvider__GetXYSeries();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractTrajectoryToolImpl <em>Abstract Trajectory Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractTrajectoryToolImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractTrajectoryTool()
		 * @generated
		 */
		EClass ABSTRACT_TRAJECTORY_TOOL = eINSTANCE.getAbstractTrajectoryTool();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryPickingToolImpl <em>Trajectory Picking Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryPickingToolImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getTrajectoryPickingTool()
		 * @generated
		 */
		EClass TRAJECTORY_PICKING_TOOL = eINSTANCE.getTrajectoryPickingTool();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryProviderImpl <em>Variable Trajectory Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryProviderImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getVariableTrajectoryProvider()
		 * @generated
		 */
		EClass VARIABLE_TRAJECTORY_PROVIDER = eINSTANCE.getVariableTrajectoryProvider();

		/**
		 * The meta object literal for the '<em><b>Variable Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION = eINSTANCE.getVariableTrajectoryProvider_VariableAnnotation();

		/**
		 * The meta object literal for the '<em><b>Pose Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER = eINSTANCE.getVariableTrajectoryProvider_PoseProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.DefaultVariableTrajectoryProviderImpl <em>Default Variable Trajectory Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.DefaultVariableTrajectoryProviderImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getDefaultVariableTrajectoryProvider()
		 * @generated
		 */
		EClass DEFAULT_VARIABLE_TRAJECTORY_PROVIDER = eINSTANCE.getDefaultVariableTrajectoryProvider();

		/**
		 * The meta object literal for the '<em><b>Distance Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD = eINSTANCE.getDefaultVariableTrajectoryProvider_DistanceThreshold();

		/**
		 * The meta object literal for the '<em><b>Azimuth Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD = eINSTANCE.getDefaultVariableTrajectoryProvider_AzimuthThreshold();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractVariableAnnotationImpl <em>Abstract Variable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractVariableAnnotationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractVariableAnnotation()
		 * @generated
		 */
		EClass ABSTRACT_VARIABLE_ANNOTATION = eINSTANCE.getAbstractVariableAnnotation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE_ANNOTATION__VARIABLE = eINSTANCE.getAbstractVariableAnnotation_Variable();

		/**
		 * The meta object literal for the '<em><b>Variable Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = eINSTANCE.getAbstractVariableAnnotation_VariableInstance();

		/**
		 * The meta object literal for the '<em><b>Apogy System Api Adapter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER = eINSTANCE.getAbstractVariableAnnotation_ApogySystemApiAdapter();

		/**
		 * The meta object literal for the '<em><b>Update Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = eINSTANCE.getAbstractVariableAnnotation__UpdatePose__Matrix4x4();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.PoseVariableAnnotationImpl <em>Pose Variable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.PoseVariableAnnotationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getPoseVariableAnnotation()
		 * @generated
		 */
		EClass POSE_VARIABLE_ANNOTATION = eINSTANCE.getPoseVariableAnnotation();

		/**
		 * The meta object literal for the '<em><b>Vectorlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE_VARIABLE_ANNOTATION__VECTORLENGTH = eINSTANCE.getPoseVariableAnnotation_Vectorlength();

		/**
		 * The meta object literal for the '<em><b>Vector Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE_VARIABLE_ANNOTATION__VECTOR_COLOR = eINSTANCE.getPoseVariableAnnotation_VectorColor();

		/**
		 * The meta object literal for the '<em><b>Show Pose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE_VARIABLE_ANNOTATION__SHOW_POSE = eINSTANCE.getPoseVariableAnnotation_ShowPose();

		/**
		 * The meta object literal for the '<em><b>Update Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getPoseVariableAnnotation__UpdatePose__double_double_double();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryAnnotationImpl <em>Variable Trajectory Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VariableTrajectoryAnnotationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getVariableTrajectoryAnnotation()
		 * @generated
		 */
		EClass VARIABLE_TRAJECTORY_ANNOTATION = eINSTANCE.getVariableTrajectoryAnnotation();

		/**
		 * The meta object literal for the '<em><b>Trajectory Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER = eINSTANCE.getVariableTrajectoryAnnotation_TrajectoryProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VehicleVariableAnnotationImpl <em>Vehicle Variable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.VehicleVariableAnnotationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getVehicleVariableAnnotation()
		 * @generated
		 */
		EClass VEHICLE_VARIABLE_ANNOTATION = eINSTANCE.getVehicleVariableAnnotation();

		/**
		 * The meta object literal for the '<em><b>Vehicle Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH = eINSTANCE.getVehicleVariableAnnotation_VehicleLength();

		/**
		 * The meta object literal for the '<em><b>Vehicle Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH = eINSTANCE.getVehicleVariableAnnotation_VehicleWidth();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Point2d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point2d
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getPoint2d()
		 * @generated
		 */
		EDataType POINT2D = eINSTANCE.getPoint2d();

		/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();

		/**
		 * The meta object literal for the '<em>Point3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3f
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getPoint3f()
		 * @generated
		 */
		EDataType POINT3F = eINSTANCE.getPoint3f();

		/**
		 * The meta object literal for the '<em>XY Series</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.data.xy.XYSeries
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getXYSeries()
		 * @generated
		 */
		EDataType XY_SERIES = eINSTANCE.getXYSeries();

		/**
		 * The meta object literal for the '<em>XY Plot</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.chart.plot.XYPlot
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getXYPlot()
		 * @generated
		 */
		EDataType XY_PLOT = eINSTANCE.getXYPlot();

		/**
		 * The meta object literal for the '<em>XY Data Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.data.xy.XYDataItem
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getXYDataItem()
		 * @generated
		 */
		EDataType XY_DATA_ITEM = eINSTANCE.getXYDataItem();

		/**
		 * The meta object literal for the '<em>Abstract XY Annotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.chart.annotations.AbstractXYAnnotation
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getAbstractXYAnnotation()
		 * @generated
		 */
		EDataType ABSTRACT_XY_ANNOTATION = eINSTANCE.getAbstractXYAnnotation();

		/**
		 * The meta object literal for the '<em>Chart Composite</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.experimental.chart.swt.ChartComposite
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getChartComposite()
		 * @generated
		 */
		EDataType CHART_COMPOSITE = eINSTANCE.getChartComposite();

		/**
		 * The meta object literal for the '<em>JFree Chart</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.chart.JFreeChart
		 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIPackageImpl#getJFreeChart()
		 * @generated
		 */
		EDataType JFREE_CHART = eINSTANCE.getJFreeChart();

	}

} //ApogySurfaceEnvironmentUIPackage
