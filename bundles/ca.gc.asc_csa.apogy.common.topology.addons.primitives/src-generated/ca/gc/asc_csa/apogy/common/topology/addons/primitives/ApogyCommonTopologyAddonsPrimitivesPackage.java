package ca.gc.asc_csa.apogy.common.topology.addons.primitives;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonTopologyAddonsPrimitives' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonTopologyAddonsPrimitives' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.common.topology.addons.primitives/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.topology.addons.primitives.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.topology.addons'"
 * @generated
 */
public interface ApogyCommonTopologyAddonsPrimitivesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "primitives";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.topology.addons.primitives";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "primitives";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonTopologyAddonsPrimitivesPackage eINSTANCE = ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__PARENT = ApogyCommonTopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__DESCRIPTION = ApogyCommonTopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__NODE_ID = ApogyCommonTopologyPackage.NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__XROTATION = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__YROTATION = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__ZROTATION = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__LENGTH = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__END_POINT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_OPERATION_COUNT = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl <em>Pick Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPickVector()
	 * @generated
	 */
	int PICK_VECTOR = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__PARENT = VECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__DESCRIPTION = VECTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__NODE_ID = VECTOR__NODE_ID;

	/**
	 * The feature id for the '<em><b>XRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__XROTATION = VECTOR__XROTATION;

	/**
	 * The feature id for the '<em><b>YRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__YROTATION = VECTOR__YROTATION;

	/**
	 * The feature id for the '<em><b>ZRotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__ZROTATION = VECTOR__ZROTATION;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__LENGTH = VECTOR__LENGTH;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__END_POINT = VECTOR__END_POINT;

	/**
	 * The feature id for the '<em><b>Intersection Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__INTERSECTION_DISTANCE = VECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intersected Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__INTERSECTED_NODE = VECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relative Intersection Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__RELATIVE_INTERSECTION_POSITION = VECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Absolute Intersection Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION = VECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node Types In Intersection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__NODE_TYPES_IN_INTERSECTION = VECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Node Types To Exclude From Intersection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION = VECTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pick Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR_FEATURE_COUNT = VECTOR_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR___ACCEPT__INODEVISITOR = VECTOR___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Is Node Included In Intersection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR___IS_NODE_INCLUDED_IN_INTERSECTION__NODE = VECTOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pick Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_VECTOR_OPERATION_COUNT = VECTOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl <em>Plane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPlane()
	 * @generated
	 */
	int PLANE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__PARENT = ApogyCommonTopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__DESCRIPTION = ApogyCommonTopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__NODE_ID = ApogyCommonTopologyPackage.NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>V0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__V0 = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>V1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__V1 = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__WIDTH = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE__HEIGHT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_FEATURE_COUNT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Plane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANE_OPERATION_COUNT = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.WayPointImpl <em>Way Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.WayPointImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getWayPoint()
	 * @generated
	 */
	int WAY_POINT = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The number of structural features of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Way Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LabelImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PARENT = ApogyCommonTopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = ApogyCommonTopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NODE_ID = ApogyCommonTopologyPackage.NODE__NODE_ID;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpherePrimitiveImpl <em>Sphere Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpherePrimitiveImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getSpherePrimitive()
	 * @generated
	 */
	int SPHERE_PRIMITIVE = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE__RADIUS = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sphere Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Sphere Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_PRIMITIVE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LightImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__PARENT = ApogyCommonTopologyPackage.LEAF__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__DESCRIPTION = ApogyCommonTopologyPackage.LEAF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__NODE_ID = ApogyCommonTopologyPackage.LEAF__NODE_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__ENABLED = ApogyCommonTopologyPackage.LEAF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT__COLOR = ApogyCommonTopologyPackage.LEAF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = ApogyCommonTopologyPackage.LEAF_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.LEAF___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = ApogyCommonTopologyPackage.LEAF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.AmbientLightImpl <em>Ambient Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.AmbientLightImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getAmbientLight()
	 * @generated
	 */
	int AMBIENT_LIGHT = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT__PARENT = LIGHT__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT__DESCRIPTION = LIGHT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT__NODE_ID = LIGHT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT__ENABLED = LIGHT__ENABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT__COLOR = LIGHT__COLOR;

	/**
	 * The number of structural features of the '<em>Ambient Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT_FEATURE_COUNT = LIGHT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT___ACCEPT__INODEVISITOR = LIGHT___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Ambient Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENT_LIGHT_OPERATION_COUNT = LIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.DirectionalLightImpl <em>Directional Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.DirectionalLightImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getDirectionalLight()
	 * @generated
	 */
	int DIRECTIONAL_LIGHT = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__PARENT = LIGHT__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__DESCRIPTION = LIGHT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__NODE_ID = LIGHT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__ENABLED = LIGHT__ENABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__COLOR = LIGHT__COLOR;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT__DIRECTION = LIGHT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directional Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT_FEATURE_COUNT = LIGHT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT___ACCEPT__INODEVISITOR = LIGHT___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Directional Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIONAL_LIGHT_OPERATION_COUNT = LIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PointLightImpl <em>Point Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PointLightImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPointLight()
	 * @generated
	 */
	int POINT_LIGHT = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__PARENT = LIGHT__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__DESCRIPTION = LIGHT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__NODE_ID = LIGHT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__ENABLED = LIGHT__ENABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__COLOR = LIGHT__COLOR;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__POSITION = LIGHT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attenuation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT__ATTENUATION = LIGHT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_FEATURE_COUNT = LIGHT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT___ACCEPT__INODEVISITOR = LIGHT___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Point Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_LIGHT_OPERATION_COUNT = LIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpotLightImpl <em>Spot Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpotLightImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getSpotLight()
	 * @generated
	 */
	int SPOT_LIGHT = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__PARENT = POINT_LIGHT__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__DESCRIPTION = POINT_LIGHT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__NODE_ID = POINT_LIGHT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__ENABLED = POINT_LIGHT__ENABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__COLOR = POINT_LIGHT__COLOR;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__POSITION = POINT_LIGHT__POSITION;

	/**
	 * The feature id for the '<em><b>Attenuation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__ATTENUATION = POINT_LIGHT__ATTENUATION;

	/**
	 * The feature id for the '<em><b>Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__CONCENTRATION = POINT_LIGHT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spread Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__SPREAD_ANGLE = POINT_LIGHT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT__DIRECTION = POINT_LIGHT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spot Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT_FEATURE_COUNT = POINT_LIGHT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT___ACCEPT__INODEVISITOR = POINT_LIGHT___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Spot Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_LIGHT_OPERATION_COUNT = POINT_LIGHT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getApogyCommonTopologyAddonsPrimitivesFacade()
	 * @generated
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE = 11;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__VECTOR = 0;

	/**
	 * The operation id for the '<em>Create Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__POINT3D_POINT3D = 1;

	/**
	 * The operation id for the '<em>Create Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__DOUBLE_DOUBLE_DOUBLE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Create Plane</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_PLANE__VECTOR3D_VECTOR3D_DOUBLE_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Create Ambient Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__TUPLE3D = 4;

	/**
	 * The operation id for the '<em>Create Ambient Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__BOOLEAN_TUPLE3D = 5;

	/**
	 * The operation id for the '<em>Create Directional Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__TUPLE3D_TUPLE3D = 6;

	/**
	 * The operation id for the '<em>Create Directional Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D = 7;

	/**
	 * The operation id for the '<em>Create Point Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D = 8;

	/**
	 * The operation id for the '<em>Create Point Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D = 9;

	/**
	 * The operation id for the '<em>Create Point Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D = 10;

	/**
	 * The operation id for the '<em>Create Point Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D = 11;

	/**
	 * The operation id for the '<em>Create Spot Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT = 12;

	/**
	 * The operation id for the '<em>Create Spot Light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT = 13;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 12;

	/**
	 * The meta object id for the '<em>Vector3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 13;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getXRotation <em>XRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRotation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getXRotation()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_XRotation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getYRotation <em>YRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRotation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getYRotation()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_YRotation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getZRotation <em>ZRotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZRotation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getZRotation()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_ZRotation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getLength()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_Length();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector#getEndPoint()
	 * @see #getVector()
	 * @generated
	 */
	EAttribute getVector_EndPoint();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector <em>Pick Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick Vector</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector
	 * @generated
	 */
	EClass getPickVector();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getIntersectionDistance <em>Intersection Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intersection Distance</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getIntersectionDistance()
	 * @see #getPickVector()
	 * @generated
	 */
	EAttribute getPickVector_IntersectionDistance();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getIntersectedNode <em>Intersected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intersected Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getIntersectedNode()
	 * @see #getPickVector()
	 * @generated
	 */
	EReference getPickVector_IntersectedNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getRelativeIntersectionPosition <em>Relative Intersection Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Intersection Position</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getRelativeIntersectionPosition()
	 * @see #getPickVector()
	 * @generated
	 */
	EAttribute getPickVector_RelativeIntersectionPosition();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getAbsoluteIntersectionPosition <em>Absolute Intersection Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Intersection Position</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getAbsoluteIntersectionPosition()
	 * @see #getPickVector()
	 * @generated
	 */
	EAttribute getPickVector_AbsoluteIntersectionPosition();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getNodeTypesInIntersection <em>Node Types In Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Types In Intersection</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getNodeTypesInIntersection()
	 * @see #getPickVector()
	 * @generated
	 */
	EReference getPickVector_NodeTypesInIntersection();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getNodeTypesToExcludeFromIntersection <em>Node Types To Exclude From Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Types To Exclude From Intersection</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#getNodeTypesToExcludeFromIntersection()
	 * @see #getPickVector()
	 * @generated
	 */
	EReference getPickVector_NodeTypesToExcludeFromIntersection();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#isNodeIncludedInIntersection(ca.gc.asc_csa.apogy.common.topology.Node) <em>Is Node Included In Intersection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Node Included In Intersection</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector#isNodeIncludedInIntersection(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getPickVector__IsNodeIncludedInIntersection__Node();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plane</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane
	 * @generated
	 */
	EClass getPlane();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getV0 <em>V0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>V0</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getV0()
	 * @see #getPlane()
	 * @generated
	 */
	EReference getPlane_V0();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getV1 <em>V1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>V1</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getV1()
	 * @see #getPlane()
	 * @generated
	 */
	EReference getPlane_V1();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getWidth()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Width();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane#getHeight()
	 * @see #getPlane()
	 * @generated
	 */
	EAttribute getPlane_Height();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.WayPoint <em>Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.WayPoint
	 * @generated
	 */
	EClass getWayPoint();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpherePrimitive <em>Sphere Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere Primitive</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpherePrimitive
	 * @generated
	 */
	EClass getSpherePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpherePrimitive#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpherePrimitive#getRadius()
	 * @see #getSpherePrimitive()
	 * @generated
	 */
	EAttribute getSpherePrimitive_Radius();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Light
	 * @generated
	 */
	EClass getLight();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Light#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Light#isEnabled()
	 * @see #getLight()
	 * @generated
	 */
	EAttribute getLight_Enabled();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.Light#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.Light#getColor()
	 * @see #getLight()
	 * @generated
	 */
	EReference getLight_Color();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.AmbientLight <em>Ambient Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambient Light</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.AmbientLight
	 * @generated
	 */
	EClass getAmbientLight();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.DirectionalLight <em>Directional Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directional Light</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.DirectionalLight
	 * @generated
	 */
	EClass getDirectionalLight();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.DirectionalLight#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.DirectionalLight#getDirection()
	 * @see #getDirectionalLight()
	 * @generated
	 */
	EReference getDirectionalLight_Direction();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight <em>Point Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Light</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight
	 * @generated
	 */
	EClass getPointLight();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight#getPosition()
	 * @see #getPointLight()
	 * @generated
	 */
	EReference getPointLight_Position();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight#getAttenuation <em>Attenuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attenuation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight#getAttenuation()
	 * @see #getPointLight()
	 * @generated
	 */
	EReference getPointLight_Attenuation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight <em>Spot Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spot Light</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight
	 * @generated
	 */
	EClass getSpotLight();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight#getConcentration <em>Concentration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concentration</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight#getConcentration()
	 * @see #getSpotLight()
	 * @generated
	 */
	EAttribute getSpotLight_Concentration();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight#getSpreadAngle <em>Spread Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight#getSpreadAngle()
	 * @see #getSpotLight()
	 * @generated
	 */
	EAttribute getSpotLight_SpreadAngle();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight#getDirection()
	 * @see #getSpotLight()
	 * @generated
	 */
	EReference getSpotLight_Direction();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade
	 * @generated
	 */
	EClass getApogyCommonTopologyAddonsPrimitivesFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createVector(ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector) <em>Create Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createVector(ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Vector();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createVector(javax.vecmath.Point3d, javax.vecmath.Point3d) <em>Create Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createVector(javax.vecmath.Point3d, javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Point3d_Point3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createVector(double, double, double, double) <em>Create Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createVector(double, double, double, double)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPlane(javax.vecmath.Vector3d, javax.vecmath.Vector3d, double, double) <em>Create Plane</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Plane</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPlane(javax.vecmath.Vector3d, javax.vecmath.Vector3d, double, double)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePlane__Vector3d_Vector3d_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createAmbientLight(ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Ambient Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Ambient Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createAmbientLight(ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createAmbientLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Ambient Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Ambient Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createAmbientLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__boolean_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createDirectionalLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Directional Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Directional Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createDirectionalLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createDirectionalLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Directional Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Directional Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createDirectionalLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__boolean_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Point Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Point Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Point Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Point Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Point Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Point Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Create Point Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Point Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createPointLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__boolean_Tuple3d_Tuple3d_Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createSpotLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, float, float) <em>Create Spot Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Spot Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createSpotLight(ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, float, float)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createSpotLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, float, float) <em>Create Spot Light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Spot Light</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade#createSpotLight(boolean, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d, float, float)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__boolean_Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float();

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
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3d <em>Vector3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector3d</em>'.
	 * @see javax.vecmath.Vector3d
	 * @model instanceClass="javax.vecmath.Vector3d"
	 * @generated
	 */
	EDataType getVector3d();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonTopologyAddonsPrimitivesFactory getApogyCommonTopologyAddonsPrimitivesFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.VectorImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getVector()
		 * @generated
		 */
		EClass VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em><b>XRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__XROTATION = eINSTANCE.getVector_XRotation();

		/**
		 * The meta object literal for the '<em><b>YRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__YROTATION = eINSTANCE.getVector_YRotation();

		/**
		 * The meta object literal for the '<em><b>ZRotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__ZROTATION = eINSTANCE.getVector_ZRotation();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__LENGTH = eINSTANCE.getVector_Length();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR__END_POINT = eINSTANCE.getVector_EndPoint();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl <em>Pick Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PickVectorImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPickVector()
		 * @generated
		 */
		EClass PICK_VECTOR = eINSTANCE.getPickVector();

		/**
		 * The meta object literal for the '<em><b>Intersection Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK_VECTOR__INTERSECTION_DISTANCE = eINSTANCE.getPickVector_IntersectionDistance();

		/**
		 * The meta object literal for the '<em><b>Intersected Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK_VECTOR__INTERSECTED_NODE = eINSTANCE.getPickVector_IntersectedNode();

		/**
		 * The meta object literal for the '<em><b>Relative Intersection Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK_VECTOR__RELATIVE_INTERSECTION_POSITION = eINSTANCE.getPickVector_RelativeIntersectionPosition();

		/**
		 * The meta object literal for the '<em><b>Absolute Intersection Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION = eINSTANCE.getPickVector_AbsoluteIntersectionPosition();

		/**
		 * The meta object literal for the '<em><b>Node Types In Intersection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK_VECTOR__NODE_TYPES_IN_INTERSECTION = eINSTANCE.getPickVector_NodeTypesInIntersection();

		/**
		 * The meta object literal for the '<em><b>Node Types To Exclude From Intersection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION = eINSTANCE.getPickVector_NodeTypesToExcludeFromIntersection();

		/**
		 * The meta object literal for the '<em><b>Is Node Included In Intersection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PICK_VECTOR___IS_NODE_INCLUDED_IN_INTERSECTION__NODE = eINSTANCE.getPickVector__IsNodeIncludedInIntersection__Node();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl <em>Plane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PlaneImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPlane()
		 * @generated
		 */
		EClass PLANE = eINSTANCE.getPlane();

		/**
		 * The meta object literal for the '<em><b>V0</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANE__V0 = eINSTANCE.getPlane_V0();

		/**
		 * The meta object literal for the '<em><b>V1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANE__V1 = eINSTANCE.getPlane_V1();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__WIDTH = eINSTANCE.getPlane_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANE__HEIGHT = eINSTANCE.getPlane_Height();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.WayPointImpl <em>Way Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.WayPointImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getWayPoint()
		 * @generated
		 */
		EClass WAY_POINT = eINSTANCE.getWayPoint();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LabelImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpherePrimitiveImpl <em>Sphere Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpherePrimitiveImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getSpherePrimitive()
		 * @generated
		 */
		EClass SPHERE_PRIMITIVE = eINSTANCE.getSpherePrimitive();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_PRIMITIVE__RADIUS = eINSTANCE.getSpherePrimitive_Radius();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.LightImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGHT__ENABLED = eINSTANCE.getLight_Enabled();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIGHT__COLOR = eINSTANCE.getLight_Color();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.AmbientLightImpl <em>Ambient Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.AmbientLightImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getAmbientLight()
		 * @generated
		 */
		EClass AMBIENT_LIGHT = eINSTANCE.getAmbientLight();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.DirectionalLightImpl <em>Directional Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.DirectionalLightImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getDirectionalLight()
		 * @generated
		 */
		EClass DIRECTIONAL_LIGHT = eINSTANCE.getDirectionalLight();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIONAL_LIGHT__DIRECTION = eINSTANCE.getDirectionalLight_Direction();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PointLightImpl <em>Point Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.PointLightImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPointLight()
		 * @generated
		 */
		EClass POINT_LIGHT = eINSTANCE.getPointLight();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_LIGHT__POSITION = eINSTANCE.getPointLight_Position();

		/**
		 * The meta object literal for the '<em><b>Attenuation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_LIGHT__ATTENUATION = eINSTANCE.getPointLight_Attenuation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpotLightImpl <em>Spot Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.SpotLightImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getSpotLight()
		 * @generated
		 */
		EClass SPOT_LIGHT = eINSTANCE.getSpotLight();

		/**
		 * The meta object literal for the '<em><b>Concentration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOT_LIGHT__CONCENTRATION = eINSTANCE.getSpotLight_Concentration();

		/**
		 * The meta object literal for the '<em><b>Spread Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPOT_LIGHT__SPREAD_ANGLE = eINSTANCE.getSpotLight_SpreadAngle();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPOT_LIGHT__DIRECTION = eINSTANCE.getSpotLight_Direction();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getApogyCommonTopologyAddonsPrimitivesFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade();

		/**
		 * The meta object literal for the '<em><b>Create Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__VECTOR = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Vector();

		/**
		 * The meta object literal for the '<em><b>Create Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__POINT3D_POINT3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Point3d_Point3d();

		/**
		 * The meta object literal for the '<em><b>Create Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Plane</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_PLANE__VECTOR3D_VECTOR3D_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreatePlane__Vector3d_Vector3d_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Ambient Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Ambient Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__BOOLEAN_TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__boolean_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Directional Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__TUPLE3D_TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Directional Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__boolean_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Point Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Point Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Point Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Point Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__boolean_Tuple3d_Tuple3d_Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Spot Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float();

		/**
		 * The meta object literal for the '<em><b>Create Spot Light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT = eINSTANCE.getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__boolean_Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

		/**
		 * The meta object literal for the '<em>Vector3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl.ApogyCommonTopologyAddonsPrimitivesPackageImpl#getVector3d()
		 * @generated
		 */
		EDataType VECTOR3D = eINSTANCE.getVector3d();

	}

} //ApogyCommonTopologyAddonsPrimitivesPackage
