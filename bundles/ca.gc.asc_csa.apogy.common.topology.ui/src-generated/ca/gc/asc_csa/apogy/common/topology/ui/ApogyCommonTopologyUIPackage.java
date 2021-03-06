package ca.gc.asc_csa.apogy.common.topology.ui;
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
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonTopologyUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonTopologyUI' complianceLevel='6.0' modelDirectory='/ca.gc.asc_csa.apogy.common.topology.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.topology.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.topology'"
 * @generated
 */
public interface ApogyCommonTopologyUIPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.common.topology.ui";

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
	ApogyCommonTopologyUIPackage eINSTANCE = ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationRegistryImpl <em>Topology Presentation Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationRegistryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getTopologyPresentationRegistry()
	 * @generated
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST = 0;

	/**
	 * The feature id for the '<em><b>Node Presentation List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST = 1;

	/**
	 * The number of structural features of the '<em>Topology Presentation Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Topology Presentation Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY___CREATE_TOPOLOGY_PRESENTATION_SET__NODE = 0;

	/**
	 * The operation id for the '<em>Release</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY___RELEASE__TOPOLOGYPRESENTATIONSET = 1;

	/**
	 * The operation id for the '<em>Get Presentation Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY___GET_PRESENTATION_NODE__NODE = 2;

	/**
	 * The number of operations of the '<em>Topology Presentation Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_REGISTRY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.GraphicsContextImpl <em>Graphics Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.GraphicsContextImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getGraphicsContext()
	 * @generated
	 */
	int GRAPHICS_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT__TOPOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET = 1;

	/**
	 * The number of structural features of the '<em>Graphics Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT___DISPOSE = 0;

	/**
	 * The number of operations of the '<em>Graphics Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICS_CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodeSelectionImpl <em>Node Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.NodeSelectionImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getNodeSelection()
	 * @generated
	 */
	int NODE_SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__TOPOLOGY_PRESENTATION_SET = 0;

	/**
	 * The feature id for the '<em><b>Selected Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__SELECTED_NODE = 1;

	/**
	 * The feature id for the '<em><b>Node Presentation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__NODE_PRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Relative Intersection Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__RELATIVE_INTERSECTION_POINT = 3;

	/**
	 * The feature id for the '<em><b>Absolute Intersection Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT = 4;

	/**
	 * The feature id for the '<em><b>Relative Intersection Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL = 5;

	/**
	 * The feature id for the '<em><b>Absolute Intersection Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL = 6;

	/**
	 * The number of structural features of the '<em>Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationSetImpl <em>Topology Presentation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationSetImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getTopologyPresentationSet()
	 * @generated
	 */
	int TOPOLOGY_PRESENTATION_SET = 3;

	/**
	 * The feature id for the '<em><b>Topology Presentation Registry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY = 0;

	/**
	 * The feature id for the '<em><b>Graphics Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Node Presentation List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST = 2;

	/**
	 * The number of structural features of the '<em>Topology Presentation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Presentation Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET___GET_PRESENTATION_NODE__NODE = 0;

	/**
	 * The operation id for the '<em>Get Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET___GET_NODES = 1;

	/**
	 * The number of operations of the '<em>Topology Presentation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_PRESENTATION_SET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl <em>Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getNodePresentation()
	 * @generated
	 */
	int NODE_PRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__NODE = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__VISIBLE = 3;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__SHADOW_MODE = 4;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = 5;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__CENTROID = 6;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__MIN = 7;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__MAX = 8;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__XRANGE = 9;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__YRANGE = 10;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__ZRANGE = 11;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION__SCENE_OBJECT = 12;

	/**
	 * The number of structural features of the '<em>Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TransformNodePresentationImpl <em>Transform Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.TransformNodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getTransformNodePresentation()
	 * @generated
	 */
	int TRANSFORM_NODE_PRESENTATION = 5;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION__AXIS_LENGTH = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transform Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transform Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.RotationNodePresentationImpl <em>Rotation Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.RotationNodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getRotationNodePresentation()
	 * @generated
	 */
	int ROTATION_NODE_PRESENTATION = 6;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION__AXIS_LENGTH = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotation Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotation Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.PositionNodePresentationImpl <em>Position Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.PositionNodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getPositionNodePresentation()
	 * @generated
	 */
	int POSITION_NODE_PRESENTATION = 7;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION__AXIS_LENGTH = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.URLNodePresentationImpl <em>URL Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.URLNodePresentationImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getURLNodePresentation()
	 * @generated
	 */
	int URL_NODE_PRESENTATION = 8;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__NODE = NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__COLOR = NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__VISIBLE = NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__SHADOW_MODE = NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__CENTROID = NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__MIN = NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__MAX = NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__XRANGE = NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__YRANGE = NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__ZRANGE = NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__SCENE_OBJECT = NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__AXIS_VISIBLE = NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__AXIS_LENGTH = NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION__PRESENTATION_MODE = NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>URL Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION_FEATURE_COUNT = NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>URL Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_NODE_PRESENTATION_OPERATION_COUNT = NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getApogyCommonTopologyUIFacade()
	 * @generated
	 */
	int APOGY_COMMON_TOPOLOGY_UI_FACADE = 9;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Graphics Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_GRAPHICS_CONTEXT__NODE = 0;

	/**
	 * The operation id for the '<em>Find Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_UI_FACADE___FIND_EXTENT__NODE_TOPOLOGYPRESENTATIONSET_TUPLE3D_TUPLE3D = 1;

	/**
	 * The operation id for the '<em>Create Node Selection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODEPRESENTATION_POINT3D = 2;

	/**
	 * The operation id for the '<em>Create Node Selection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODE_POINT3D_VECTOR3F = 3;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_UI_FACADE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode <em>Shadow Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getShadowMode()
	 * @generated
	 */
	int SHADOW_MODE = 10;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode <em>Mesh Presentation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getMeshPresentationMode()
	 * @generated
	 */
	int MESH_PRESENTATION_MODE = 11;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getList()
	 * @generated
	 */
	int LIST = 12;

	/**
	 * The meta object id for the '<em>RGB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.RGB
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getRGB()
	 * @generated
	 */
	int RGB = 13;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 14;

	/**
	 * The meta object id for the '<em>Vector3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3f
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getVector3f()
	 * @generated
	 */
	int VECTOR3F = 15;

	/**
	 * The meta object id for the '<em>Scene Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.SceneObject
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getSceneObject()
	 * @generated
	 */
	int SCENE_OBJECT = 16;


	/**
	 * The meta object id for the '<em>Notification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Notification
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 17;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry <em>Topology Presentation Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Presentation Registry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry
	 * @generated
	 */
	EClass getTopologyPresentationRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList <em>Topology Presentation Set List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topology Presentation Set List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList()
	 * @see #getTopologyPresentationRegistry()
	 * @generated
	 */
	EReference getTopologyPresentationRegistry_TopologyPresentationSetList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getNodePresentationList <em>Node Presentation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Presentation List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getNodePresentationList()
	 * @see #getTopologyPresentationRegistry()
	 * @generated
	 */
	EReference getTopologyPresentationRegistry_NodePresentationList();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#createTopologyPresentationSet(ca.gc.asc_csa.apogy.common.topology.Node) <em>Create Topology Presentation Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Topology Presentation Set</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#createTopologyPresentationSet(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getTopologyPresentationRegistry__CreateTopologyPresentationSet__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#release(ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet) <em>Release</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Release</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#release(ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet)
	 * @generated
	 */
	EOperation getTopologyPresentationRegistry__Release__TopologyPresentationSet();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getPresentationNode(ca.gc.asc_csa.apogy.common.topology.Node) <em>Get Presentation Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Presentation Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getPresentationNode(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getTopologyPresentationRegistry__GetPresentationNode__Node();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext <em>Graphics Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphics Context</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext
	 * @generated
	 */
	EClass getGraphicsContext();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopology()
	 * @see #getGraphicsContext()
	 * @generated
	 */
	EReference getGraphicsContext_Topology();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology Presentation Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopologyPresentationSet()
	 * @see #getGraphicsContext()
	 * @generated
	 */
	EReference getGraphicsContext_TopologyPresentationSet();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#dispose()
	 * @generated
	 */
	EOperation getGraphicsContext__Dispose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection <em>Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Selection</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection
	 * @generated
	 */
	EClass getNodeSelection();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topology Presentation Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getTopologyPresentationSet()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EReference getNodeSelection_TopologyPresentationSet();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getSelectedNode <em>Selected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getSelectedNode()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EReference getNodeSelection_SelectedNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getNodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getNodePresentation()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EReference getNodeSelection_NodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionPoint <em>Relative Intersection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Intersection Point</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionPoint()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_RelativeIntersectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionPoint <em>Absolute Intersection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Intersection Point</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionPoint()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_AbsoluteIntersectionPoint();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionNormal <em>Relative Intersection Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Intersection Normal</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionNormal()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_RelativeIntersectionNormal();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionNormal <em>Absolute Intersection Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Intersection Normal</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionNormal()
	 * @see #getNodeSelection()
	 * @generated
	 */
	EAttribute getNodeSelection_AbsoluteIntersectionNormal();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Presentation Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet
	 * @generated
	 */
	EClass getTopologyPresentationSet();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Topology Presentation Registry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry()
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	EReference getTopologyPresentationSet_TopologyPresentationRegistry();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getGraphicsContext <em>Graphics Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graphics Context</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getGraphicsContext()
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	EReference getTopologyPresentationSet_GraphicsContext();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getNodePresentationList <em>Node Presentation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Presentation List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getNodePresentationList()
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	EReference getTopologyPresentationSet_NodePresentationList();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getPresentationNode(ca.gc.asc_csa.apogy.common.topology.Node) <em>Get Presentation Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Presentation Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getPresentationNode(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getTopologyPresentationSet__GetPresentationNode__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getNodes() <em>Get Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nodes</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getNodes()
	 * @generated
	 */
	EOperation getTopologyPresentationSet__GetNodes();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation
	 * @generated
	 */
	EClass getNodePresentation();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Topology Presentation Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getTopologyPresentationSet()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_TopologyPresentationSet();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getNode()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Node();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getColor()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_Color();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#isVisible()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_Visible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#isUseInBoundingCalculation <em>Use In Bounding Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use In Bounding Calculation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#isUseInBoundingCalculation()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_UseInBoundingCalculation();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getCentroid <em>Centroid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centroid</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getCentroid()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Centroid();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getMin()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Min();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getMax()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EReference getNodePresentation_Max();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getXRange <em>XRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRange</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getXRange()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_XRange();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getYRange <em>YRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRange</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getYRange()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_YRange();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getZRange <em>ZRange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZRange</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getZRange()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_ZRange();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getSceneObject <em>Scene Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Object</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getSceneObject()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_SceneObject();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getShadowMode <em>Shadow Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getShadowMode()
	 * @see #getNodePresentation()
	 * @generated
	 */
	EAttribute getNodePresentation_ShadowMode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation <em>Transform Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation
	 * @generated
	 */
	EClass getTransformNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation#isAxisVisible()
	 * @see #getTransformNodePresentation()
	 * @generated
	 */
	EAttribute getTransformNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation#getAxisLength <em>Axis Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation#getAxisLength()
	 * @see #getTransformNodePresentation()
	 * @generated
	 */
	EAttribute getTransformNodePresentation_AxisLength();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation <em>Rotation Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation
	 * @generated
	 */
	EClass getRotationNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation#isAxisVisible()
	 * @see #getRotationNodePresentation()
	 * @generated
	 */
	EAttribute getRotationNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation#getAxisLength <em>Axis Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation#getAxisLength()
	 * @see #getRotationNodePresentation()
	 * @generated
	 */
	EAttribute getRotationNodePresentation_AxisLength();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation <em>Position Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation
	 * @generated
	 */
	EClass getPositionNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation#isAxisVisible()
	 * @see #getPositionNodePresentation()
	 * @generated
	 */
	EAttribute getPositionNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation#getAxisLength <em>Axis Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation#getAxisLength()
	 * @see #getPositionNodePresentation()
	 * @generated
	 */
	EAttribute getPositionNodePresentation_AxisLength();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation <em>URL Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Node Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation
	 * @generated
	 */
	EClass getURLNodePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation#isAxisVisible()
	 * @see #getURLNodePresentation()
	 * @generated
	 */
	EAttribute getURLNodePresentation_AxisVisible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation#getAxisLength <em>Axis Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation#getAxisLength()
	 * @see #getURLNodePresentation()
	 * @generated
	 */
	EAttribute getURLNodePresentation_AxisLength();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation#getPresentationMode()
	 * @see #getURLNodePresentation()
	 * @generated
	 */
	EAttribute getURLNodePresentation_PresentationMode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade
	 * @generated
	 */
	EClass getApogyCommonTopologyUIFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#createGraphicsContext(ca.gc.asc_csa.apogy.common.topology.Node) <em>Create Graphics Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graphics Context</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#createGraphicsContext(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getApogyCommonTopologyUIFacade__CreateGraphicsContext__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#findExtent(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Find Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#findExtent(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyUIFacade__FindExtent__Node_TopologyPresentationSet_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#createNodeSelection(ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet, ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation, javax.vecmath.Point3d) <em>Create Node Selection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Node Selection</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#createNodeSelection(ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet, ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation, javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_NodePresentation_Point3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#createNodeSelection(ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet, ca.gc.asc_csa.apogy.common.topology.Node, javax.vecmath.Point3d, javax.vecmath.Vector3f) <em>Create Node Selection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Node Selection</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade#createNodeSelection(ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet, ca.gc.asc_csa.apogy.common.topology.Node, javax.vecmath.Point3d, javax.vecmath.Vector3f)
	 * @generated
	 */
	EOperation getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_Node_Point3d_Vector3f();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode <em>Shadow Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shadow Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode
	 * @generated
	 */
	EEnum getShadowMode();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode <em>Mesh Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mesh Presentation Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
	 * @generated
	 */
	EEnum getMeshPresentationMode();

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
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.RGB <em>RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB</em>'.
	 * @see org.eclipse.swt.graphics.RGB
	 * @model instanceClass="org.eclipse.swt.graphics.RGB"
	 * @generated
	 */
	EDataType getRGB();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3d <em>Point3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3d</em>'.
	 * @see javax.vecmath.Point3d
	 * @model instanceClass="javax.vecmath.Point3d"
	 * @generated
	 */
	EDataType getPoint3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector3f</em>'.
	 * @see javax.vecmath.Vector3f
	 * @model instanceClass="javax.vecmath.Vector3f"
	 * @generated
	 */
	EDataType getVector3f();

	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.common.topology.ui.SceneObject <em>Scene Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scene Object</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.SceneObject
	 * @model instanceClass="ca.gc.asc_csa.apogy.common.topology.ui.SceneObject"
	 * @generated
	 */
	EDataType getSceneObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notification</em>'.
	 * @see org.eclipse.emf.common.notify.Notification
	 * @model instanceClass="org.eclipse.emf.common.notify.Notification"
	 * @generated
	 */
	EDataType getNotification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonTopologyUIFactory getApogyCommonTopologyUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationRegistryImpl <em>Topology Presentation Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationRegistryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getTopologyPresentationRegistry()
		 * @generated
		 */
		EClass TOPOLOGY_PRESENTATION_REGISTRY = eINSTANCE.getTopologyPresentationRegistry();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST = eINSTANCE.getTopologyPresentationRegistry_TopologyPresentationSetList();

		/**
		 * The meta object literal for the '<em><b>Node Presentation List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST = eINSTANCE.getTopologyPresentationRegistry_NodePresentationList();

		/**
		 * The meta object literal for the '<em><b>Create Topology Presentation Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_REGISTRY___CREATE_TOPOLOGY_PRESENTATION_SET__NODE = eINSTANCE.getTopologyPresentationRegistry__CreateTopologyPresentationSet__Node();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_REGISTRY___RELEASE__TOPOLOGYPRESENTATIONSET = eINSTANCE.getTopologyPresentationRegistry__Release__TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Get Presentation Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_REGISTRY___GET_PRESENTATION_NODE__NODE = eINSTANCE.getTopologyPresentationRegistry__GetPresentationNode__Node();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.GraphicsContextImpl <em>Graphics Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.GraphicsContextImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getGraphicsContext()
		 * @generated
		 */
		EClass GRAPHICS_CONTEXT = eINSTANCE.getGraphicsContext();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICS_CONTEXT__TOPOLOGY = eINSTANCE.getGraphicsContext_Topology();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET = eINSTANCE.getGraphicsContext_TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPHICS_CONTEXT___DISPOSE = eINSTANCE.getGraphicsContext__Dispose();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodeSelectionImpl <em>Node Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.NodeSelectionImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getNodeSelection()
		 * @generated
		 */
		EClass NODE_SELECTION = eINSTANCE.getNodeSelection();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTION__TOPOLOGY_PRESENTATION_SET = eINSTANCE.getNodeSelection_TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Selected Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTION__SELECTED_NODE = eINSTANCE.getNodeSelection_SelectedNode();

		/**
		 * The meta object literal for the '<em><b>Node Presentation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_SELECTION__NODE_PRESENTATION = eINSTANCE.getNodeSelection_NodePresentation();

		/**
		 * The meta object literal for the '<em><b>Relative Intersection Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__RELATIVE_INTERSECTION_POINT = eINSTANCE.getNodeSelection_RelativeIntersectionPoint();

		/**
		 * The meta object literal for the '<em><b>Absolute Intersection Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT = eINSTANCE.getNodeSelection_AbsoluteIntersectionPoint();

		/**
		 * The meta object literal for the '<em><b>Relative Intersection Normal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL = eINSTANCE.getNodeSelection_RelativeIntersectionNormal();

		/**
		 * The meta object literal for the '<em><b>Absolute Intersection Normal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL = eINSTANCE.getNodeSelection_AbsoluteIntersectionNormal();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationSetImpl <em>Topology Presentation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.TopologyPresentationSetImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getTopologyPresentationSet()
		 * @generated
		 */
		EClass TOPOLOGY_PRESENTATION_SET = eINSTANCE.getTopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Registry</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY = eINSTANCE.getTopologyPresentationSet_TopologyPresentationRegistry();

		/**
		 * The meta object literal for the '<em><b>Graphics Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT = eINSTANCE.getTopologyPresentationSet_GraphicsContext();

		/**
		 * The meta object literal for the '<em><b>Node Presentation List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST = eINSTANCE.getTopologyPresentationSet_NodePresentationList();

		/**
		 * The meta object literal for the '<em><b>Get Presentation Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_SET___GET_PRESENTATION_NODE__NODE = eINSTANCE.getTopologyPresentationSet__GetPresentationNode__Node();

		/**
		 * The meta object literal for the '<em><b>Get Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TOPOLOGY_PRESENTATION_SET___GET_NODES = eINSTANCE.getTopologyPresentationSet__GetNodes();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl <em>Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getNodePresentation()
		 * @generated
		 */
		EClass NODE_PRESENTATION = eINSTANCE.getNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Topology Presentation Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = eINSTANCE.getNodePresentation_TopologyPresentationSet();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__NODE = eINSTANCE.getNodePresentation_Node();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__COLOR = eINSTANCE.getNodePresentation_Color();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__VISIBLE = eINSTANCE.getNodePresentation_Visible();

		/**
		 * The meta object literal for the '<em><b>Use In Bounding Calculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = eINSTANCE.getNodePresentation_UseInBoundingCalculation();

		/**
		 * The meta object literal for the '<em><b>Centroid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__CENTROID = eINSTANCE.getNodePresentation_Centroid();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__MIN = eINSTANCE.getNodePresentation_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_PRESENTATION__MAX = eINSTANCE.getNodePresentation_Max();

		/**
		 * The meta object literal for the '<em><b>XRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__XRANGE = eINSTANCE.getNodePresentation_XRange();

		/**
		 * The meta object literal for the '<em><b>YRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__YRANGE = eINSTANCE.getNodePresentation_YRange();

		/**
		 * The meta object literal for the '<em><b>ZRange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__ZRANGE = eINSTANCE.getNodePresentation_ZRange();

		/**
		 * The meta object literal for the '<em><b>Scene Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__SCENE_OBJECT = eINSTANCE.getNodePresentation_SceneObject();

		/**
		 * The meta object literal for the '<em><b>Shadow Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PRESENTATION__SHADOW_MODE = eINSTANCE.getNodePresentation_ShadowMode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.TransformNodePresentationImpl <em>Transform Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.TransformNodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getTransformNodePresentation()
		 * @generated
		 */
		EClass TRANSFORM_NODE_PRESENTATION = eINSTANCE.getTransformNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getTransformNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_NODE_PRESENTATION__AXIS_LENGTH = eINSTANCE.getTransformNodePresentation_AxisLength();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.RotationNodePresentationImpl <em>Rotation Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.RotationNodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getRotationNodePresentation()
		 * @generated
		 */
		EClass ROTATION_NODE_PRESENTATION = eINSTANCE.getRotationNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getRotationNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION_NODE_PRESENTATION__AXIS_LENGTH = eINSTANCE.getRotationNodePresentation_AxisLength();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.PositionNodePresentationImpl <em>Position Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.PositionNodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getPositionNodePresentation()
		 * @generated
		 */
		EClass POSITION_NODE_PRESENTATION = eINSTANCE.getPositionNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getPositionNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_NODE_PRESENTATION__AXIS_LENGTH = eINSTANCE.getPositionNodePresentation_AxisLength();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.URLNodePresentationImpl <em>URL Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.URLNodePresentationImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getURLNodePresentation()
		 * @generated
		 */
		EClass URL_NODE_PRESENTATION = eINSTANCE.getURLNodePresentation();

		/**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getURLNodePresentation_AxisVisible();

		/**
		 * The meta object literal for the '<em><b>Axis Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE_PRESENTATION__AXIS_LENGTH = eINSTANCE.getURLNodePresentation_AxisLength();

		/**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_NODE_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getURLNodePresentation_PresentationMode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getApogyCommonTopologyUIFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_TOPOLOGY_UI_FACADE = eINSTANCE.getApogyCommonTopologyUIFacade();

		/**
		 * The meta object literal for the '<em><b>Create Graphics Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_GRAPHICS_CONTEXT__NODE = eINSTANCE.getApogyCommonTopologyUIFacade__CreateGraphicsContext__Node();

		/**
		 * The meta object literal for the '<em><b>Find Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_UI_FACADE___FIND_EXTENT__NODE_TOPOLOGYPRESENTATIONSET_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCommonTopologyUIFacade__FindExtent__Node_TopologyPresentationSet_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Node Selection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODEPRESENTATION_POINT3D = eINSTANCE.getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_NodePresentation_Point3d();

		/**
		 * The meta object literal for the '<em><b>Create Node Selection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODE_POINT3D_VECTOR3F = eINSTANCE.getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_Node_Point3d_Vector3f();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode <em>Shadow Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getShadowMode()
		 * @generated
		 */
		EEnum SHADOW_MODE = eINSTANCE.getShadowMode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode <em>Mesh Presentation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getMeshPresentationMode()
		 * @generated
		 */
		EEnum MESH_PRESENTATION_MODE = eINSTANCE.getMeshPresentationMode();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>RGB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.RGB
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getRGB()
		 * @generated
		 */
		EDataType RGB = eINSTANCE.getRGB();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

		/**
		 * The meta object literal for the '<em>Vector3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3f
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getVector3f()
		 * @generated
		 */
		EDataType VECTOR3F = eINSTANCE.getVector3f();

		/**
		 * The meta object literal for the '<em>Scene Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.SceneObject
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getSceneObject()
		 * @generated
		 */
		EDataType SCENE_OBJECT = eINSTANCE.getSceneObject();

		/**
		 * The meta object literal for the '<em>Notification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Notification
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIPackageImpl#getNotification()
		 * @generated
		 */
		EDataType NOTIFICATION = eINSTANCE.getNotification();

	}

} //TopologyTopologyUIPackage
