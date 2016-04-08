package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;
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
 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonTopologyAddonsDynamics' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonTopologyAddonsDynamics' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates' modelDirectory='/ca.gc.asc_csa.apogy.common.topology.addons.dynamics/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.topology.addons.dynamics.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.topology.addons'"
 * @generated
 */
public interface ApogyCommonTopologyAddonsDynamicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dynamics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dynamics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonTopologyAddonsDynamicsPackage eINSTANCE = ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.DynamicSystemPropertiesImpl <em>Dynamic System Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.DynamicSystemPropertiesImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getDynamicSystemProperties()
	 * @generated
	 */
	int DYNAMIC_SYSTEM_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES__MATERIALS = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic System Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Dynamic System Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_SYSTEM_PROPERTIES_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractDynamicsEngineImpl <em>Abstract Dynamics Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractDynamicsEngineImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractDynamicsEngine()
	 * @generated
	 */
	int ABSTRACT_DYNAMICS_ENGINE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Dynamics Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DYNAMICS_ENGINE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Start Simulation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DYNAMICS_ENGINE___START_SIMULATION = 0;

	/**
	 * The operation id for the '<em>Stop Simulation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DYNAMICS_ENGINE___STOP_SIMULATION = 1;

	/**
	 * The number of operations of the '<em>Abstract Dynamics Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DYNAMICS_ENGINE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl <em>Physical Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPhysicalBody()
	 * @generated
	 */
	int PHYSICAL_BODY = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Physical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__PHYSICAL_PROPERTIES = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Attachment Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__SIMULATION_PROPERTIES = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Center Of Mass Kinematic State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Points Of Interest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__POINTS_OF_INTEREST = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Collision Geometry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY__COLLISION_GEOMETRY = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Physical Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Physical Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_BODY_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalPropertiesImpl <em>Physical Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalPropertiesImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPhysicalProperties()
	 * @generated
	 */
	int PHYSICAL_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTIES__MASS = 0;

	/**
	 * The feature id for the '<em><b>Inertia Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTIES__INERTIA_MATRIX = 1;

	/**
	 * The feature id for the '<em><b>Center Of Mass Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Physical Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Physical Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractPhysicalBodySimulationPropertiesImpl <em>Abstract Physical Body Simulation Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractPhysicalBodySimulationPropertiesImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractPhysicalBodySimulationProperties()
	 * @generated
	 */
	int ABSTRACT_PHYSICAL_BODY_SIMULATION_PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Abstract Physical Body Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_BODY_SIMULATION_PROPERTIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Physical Body Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PHYSICAL_BODY_SIMULATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintSimulationPropertiesImpl <em>Abstract Constraint Simulation Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintSimulationPropertiesImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractConstraintSimulationProperties()
	 * @generated
	 */
	int ABSTRACT_CONSTRAINT_SIMULATION_PROPERTIES = 5;

	/**
	 * The number of structural features of the '<em>Abstract Constraint Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_SIMULATION_PROPERTIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Constraint Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_SIMULATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractCollisionGeometrySimulationPropertiesImpl <em>Abstract Collision Geometry Simulation Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractCollisionGeometrySimulationPropertiesImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractCollisionGeometrySimulationProperties()
	 * @generated
	 */
	int ABSTRACT_COLLISION_GEOMETRY_SIMULATION_PROPERTIES = 6;

	/**
	 * The number of structural features of the '<em>Abstract Collision Geometry Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLLISION_GEOMETRY_SIMULATION_PROPERTIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Collision Geometry Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLLISION_GEOMETRY_SIMULATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PointOfInterestImpl <em>Point Of Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PointOfInterestImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPointOfInterest()
	 * @generated
	 */
	int POINT_OF_INTEREST = 7;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_INTEREST__OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Kinematic State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_INTEREST__KINEMATIC_STATE = 1;

	/**
	 * The number of structural features of the '<em>Point Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_INTEREST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point Of Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_INTEREST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.KinematicStateImpl <em>Kinematic State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.KinematicStateImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getKinematicState()
	 * @generated
	 */
	int KINEMATIC_STATE = 8;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE__ORIENTATION = 1;

	/**
	 * The feature id for the '<em><b>Linear Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE__LINEAR_VELOCITY = 2;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE__ANGULAR_VELOCITY = 3;

	/**
	 * The feature id for the '<em><b>Linear Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE__LINEAR_ACCELERATION = 4;

	/**
	 * The feature id for the '<em><b>Angular Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE__ANGULAR_ACCELERATION = 5;

	/**
	 * The number of structural features of the '<em>Kinematic State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Kinematic State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintStateImpl <em>Constraint State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintStateImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getConstraintState()
	 * @generated
	 */
	int CONSTRAINT_STATE = 9;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_STATE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_STATE__VELOCITY = 1;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_STATE__FORCE = 2;

	/**
	 * The number of structural features of the '<em>Constraint State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractConstraint()
	 * @generated
	 */
	int ABSTRACT_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Attachment Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS = 0;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__CONSTAINT_ID = 3;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT__ENABLED = 4;

	/**
	 * The number of structural features of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Abstract Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylindricalConstraintImpl <em>Cylindrical Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylindricalConstraintImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCylindricalConstraint()
	 * @generated
	 */
	int CYLINDRICAL_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Attachment Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT__ATTACHMENT_POINTS = ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT__SIMULATION_PROPERTIES = ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT__DESCRIPTION = ABSTRACT_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT__CONSTAINT_ID = ABSTRACT_CONSTRAINT__CONSTAINT_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT__ENABLED = ABSTRACT_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Angular Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linear Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cylindrical Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cylindrical Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDRICAL_CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GearRatioConstraintImpl <em>Gear Ratio Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GearRatioConstraintImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getGearRatioConstraint()
	 * @generated
	 */
	int GEAR_RATIO_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Attachment Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT__ATTACHMENT_POINTS = ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT__SIMULATION_PROPERTIES = ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT__DESCRIPTION = ABSTRACT_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT__CONSTAINT_ID = ABSTRACT_CONSTRAINT__CONSTAINT_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT__ENABLED = ABSTRACT_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT__FORCE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gear Ratio Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gear Ratio Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEAR_RATIO_CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.HingeConstraintImpl <em>Hinge Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.HingeConstraintImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getHingeConstraint()
	 * @generated
	 */
	int HINGE_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Attachment Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT__ATTACHMENT_POINTS = ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT__SIMULATION_PROPERTIES = ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT__DESCRIPTION = ABSTRACT_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT__CONSTAINT_ID = ABSTRACT_CONSTRAINT__CONSTAINT_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT__ENABLED = ABSTRACT_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Angular Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hinge Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hinge Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINGE_CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PrismaticConstraintImpl <em>Prismatic Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PrismaticConstraintImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPrismaticConstraint()
	 * @generated
	 */
	int PRISMATIC_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Attachment Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT__ATTACHMENT_POINTS = ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT__SIMULATION_PROPERTIES = ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT__DESCRIPTION = ABSTRACT_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT__CONSTAINT_ID = ABSTRACT_CONSTRAINT__CONSTAINT_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT__ENABLED = ABSTRACT_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Linear Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT__LINEAR_CURRENT_STATE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prismatic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prismatic Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRISMATIC_CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.RPROConstraintImpl <em>RPRO Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.RPROConstraintImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getRPROConstraint()
	 * @generated
	 */
	int RPRO_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Attachment Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT__ATTACHMENT_POINTS = ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT__SIMULATION_PROPERTIES = ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT__DESCRIPTION = ABSTRACT_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT__CONSTAINT_ID = ABSTRACT_CONSTRAINT__CONSTAINT_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT__ENABLED = ABSTRACT_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Linear Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT__LINEAR_STRENGTH = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angular Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT__ANGULAR_STRENGTH = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RPRO Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RPRO Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPRO_CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.UniversalConstraintImpl <em>Universal Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.UniversalConstraintImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getUniversalConstraint()
	 * @generated
	 */
	int UNIVERSAL_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Attachment Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT__ATTACHMENT_POINTS = ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT__SIMULATION_PROPERTIES = ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT__DESCRIPTION = ABSTRACT_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT__CONSTAINT_ID = ABSTRACT_CONSTRAINT__CONSTAINT_ID;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT__ENABLED = ABSTRACT_CONSTRAINT__ENABLED;

	/**
	 * The feature id for the '<em><b>Angular0 Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angular1 Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Universal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT_FEATURE_COUNT = ABSTRACT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Universal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_CONSTRAINT_OPERATION_COUNT = ABSTRACT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintAttachmentPointImpl <em>Constraint Attachment Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintAttachmentPointImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getConstraintAttachmentPoint()
	 * @generated
	 */
	int CONSTRAINT_ATTACHMENT_POINT = 17;

	/**
	 * The feature id for the '<em><b>Physical Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ATTACHMENT_POINT__TRANSFORM = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ATTACHMENT_POINT__POINT_ID = 4;

	/**
	 * The number of structural features of the '<em>Constraint Attachment Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ATTACHMENT_POINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Constraint Attachment Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ATTACHMENT_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CollisionGeometryImpl <em>Collision Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CollisionGeometryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCollisionGeometry()
	 * @generated
	 */
	int COLLISION_GEOMETRY = 18;

	/**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY__SIMULATION_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY__GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY__TRANSFORM = 2;

	/**
	 * The feature id for the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY__MATERIAL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Geometry Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY__GEOMETRY_ID = 5;

	/**
	 * The number of structural features of the '<em>Collision Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Collision Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractMaterialImpl <em>Abstract Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractMaterialImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractMaterial()
	 * @generated
	 */
	int ABSTRACT_MATERIAL = 19;

	/**
	 * The feature id for the '<em><b>Material Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MATERIAL__MATERIAL_ID = 0;

	/**
	 * The number of structural features of the '<em>Abstract Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MATERIAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GeometryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 20;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.BoxGeometryImpl <em>Box Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.BoxGeometryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getBoxGeometry()
	 * @generated
	 */
	int BOX_GEOMETRY = 21;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_GEOMETRY__DIMENSION = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Box Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_GEOMETRY_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Box Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_GEOMETRY_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CapsuleGeometryImpl <em>Capsule Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CapsuleGeometryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCapsuleGeometry()
	 * @generated
	 */
	int CAPSULE_GEOMETRY = 22;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_GEOMETRY__RADIUS = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_GEOMETRY__LENGTH = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capsule Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_GEOMETRY_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Capsule Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_GEOMETRY_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylinderGeometryImpl <em>Cylinder Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylinderGeometryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCylinderGeometry()
	 * @generated
	 */
	int CYLINDER_GEOMETRY = 23;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_GEOMETRY__RADIUS = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_GEOMETRY__LENGTH = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cylinder Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_GEOMETRY_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cylinder Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_GEOMETRY_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.SphereGeometryImpl <em>Sphere Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.SphereGeometryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getSphereGeometry()
	 * @generated
	 */
	int SPHERE_GEOMETRY = 24;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_GEOMETRY__RADIUS = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sphere Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_GEOMETRY_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sphere Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_GEOMETRY_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getApogyCommonTopologyAddonsDynamicsFacade()
	 * @generated
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE = 25;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Center Of Mass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___FIND_CENTER_OF_MASS__NODE = 0;

	/**
	 * The operation id for the '<em>Find Total Mass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___FIND_TOTAL_MASS__NODE = 1;

	/**
	 * The operation id for the '<em>Get Physical Bodies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_PHYSICAL_BODIES__NODE = 2;

	/**
	 * The operation id for the '<em>Get Physical Node Simulation Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_PHYSICAL_NODE_SIMULATION_PROPERTY__PHYSICALBODY_CLASS = 3;

	/**
	 * The operation id for the '<em>Get Constraint Simulation Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_CONSTRAINT_SIMULATION_PROPERTY__ABSTRACTCONSTRAINT_CLASS = 4;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getSet()
	 * @generated
	 */
	int SET = 26;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties <em>Dynamic System Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic System Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties
	 * @generated
	 */
	EClass getDynamicSystemProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties#getConstraints()
	 * @see #getDynamicSystemProperties()
	 * @generated
	 */
	EReference getDynamicSystemProperties_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Materials</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties#getMaterials()
	 * @see #getDynamicSystemProperties()
	 * @generated
	 */
	EReference getDynamicSystemProperties_Materials();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine <em>Abstract Dynamics Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Dynamics Engine</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine
	 * @generated
	 */
	EClass getAbstractDynamicsEngine();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine#startSimulation() <em>Start Simulation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Simulation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine#startSimulation()
	 * @generated
	 */
	EOperation getAbstractDynamicsEngine__StartSimulation();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine#stopSimulation() <em>Stop Simulation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Simulation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine#stopSimulation()
	 * @generated
	 */
	EOperation getAbstractDynamicsEngine__StopSimulation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody <em>Physical Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Body</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody
	 * @generated
	 */
	EClass getPhysicalBody();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getPhysicalProperties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getPhysicalProperties()
	 * @see #getPhysicalBody()
	 * @generated
	 */
	EReference getPhysicalBody_PhysicalProperties();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getConstraintAttachmentPoints <em>Constraint Attachment Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint Attachment Points</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getConstraintAttachmentPoints()
	 * @see #getPhysicalBody()
	 * @generated
	 */
	EReference getPhysicalBody_ConstraintAttachmentPoints();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getSimulationProperties <em>Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simulation Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getSimulationProperties()
	 * @see #getPhysicalBody()
	 * @generated
	 */
	EReference getPhysicalBody_SimulationProperties();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getCenterOfMassKinematicState <em>Center Of Mass Kinematic State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center Of Mass Kinematic State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getCenterOfMassKinematicState()
	 * @see #getPhysicalBody()
	 * @generated
	 */
	EReference getPhysicalBody_CenterOfMassKinematicState();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getPointsOfInterest <em>Points Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points Of Interest</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getPointsOfInterest()
	 * @see #getPhysicalBody()
	 * @generated
	 */
	EReference getPhysicalBody_PointsOfInterest();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getCollisionGeometry <em>Collision Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collision Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getCollisionGeometry()
	 * @see #getPhysicalBody()
	 * @generated
	 */
	EReference getPhysicalBody_CollisionGeometry();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties
	 * @generated
	 */
	EClass getPhysicalProperties();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties#getMass()
	 * @see #getPhysicalProperties()
	 * @generated
	 */
	EAttribute getPhysicalProperties_Mass();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties#getInertiaMatrix <em>Inertia Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inertia Matrix</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties#getInertiaMatrix()
	 * @see #getPhysicalProperties()
	 * @generated
	 */
	EReference getPhysicalProperties_InertiaMatrix();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties#getCenterOfMassLocation <em>Center Of Mass Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center Of Mass Location</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties#getCenterOfMassLocation()
	 * @see #getPhysicalProperties()
	 * @generated
	 */
	EReference getPhysicalProperties_CenterOfMassLocation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties <em>Abstract Physical Body Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Physical Body Simulation Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties
	 * @generated
	 */
	EClass getAbstractPhysicalBodySimulationProperties();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraintSimulationProperties <em>Abstract Constraint Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constraint Simulation Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraintSimulationProperties
	 * @generated
	 */
	EClass getAbstractConstraintSimulationProperties();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractCollisionGeometrySimulationProperties <em>Abstract Collision Geometry Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Collision Geometry Simulation Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractCollisionGeometrySimulationProperties
	 * @generated
	 */
	EClass getAbstractCollisionGeometrySimulationProperties();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest <em>Point Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Of Interest</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest
	 * @generated
	 */
	EClass getPointOfInterest();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest#getOffset()
	 * @see #getPointOfInterest()
	 * @generated
	 */
	EReference getPointOfInterest_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest#getKinematicState <em>Kinematic State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinematic State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest#getKinematicState()
	 * @see #getPointOfInterest()
	 * @generated
	 */
	EReference getPointOfInterest_KinematicState();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState <em>Kinematic State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinematic State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState
	 * @generated
	 */
	EClass getKinematicState();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getPosition()
	 * @see #getKinematicState()
	 * @generated
	 */
	EReference getKinematicState_Position();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getOrientation()
	 * @see #getKinematicState()
	 * @generated
	 */
	EReference getKinematicState_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearVelocity <em>Linear Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearVelocity()
	 * @see #getKinematicState()
	 * @generated
	 */
	EReference getKinematicState_LinearVelocity();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularVelocity()
	 * @see #getKinematicState()
	 * @generated
	 */
	EReference getKinematicState_AngularVelocity();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearAcceleration <em>Linear Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Acceleration</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getLinearAcceleration()
	 * @see #getKinematicState()
	 * @generated
	 */
	EReference getKinematicState_LinearAcceleration();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularAcceleration <em>Angular Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Acceleration</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState#getAngularAcceleration()
	 * @see #getKinematicState()
	 * @generated
	 */
	EReference getKinematicState_AngularAcceleration();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState <em>Constraint State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState
	 * @generated
	 */
	EClass getConstraintState();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState#getPosition()
	 * @see #getConstraintState()
	 * @generated
	 */
	EAttribute getConstraintState_Position();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState#getVelocity()
	 * @see #getConstraintState()
	 * @generated
	 */
	EAttribute getConstraintState_Velocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState#getForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState#getForce()
	 * @see #getConstraintState()
	 * @generated
	 */
	EAttribute getConstraintState_Force();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint <em>Abstract Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint
	 * @generated
	 */
	EClass getAbstractConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getAttachmentPoints <em>Attachment Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachment Points</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getAttachmentPoints()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EReference getAbstractConstraint_AttachmentPoints();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getSimulationProperties <em>Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simulation Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getSimulationProperties()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EReference getAbstractConstraint_SimulationProperties();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getDescription()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EAttribute getAbstractConstraint_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getConstaintId <em>Constaint Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constaint Id</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getConstaintId()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EAttribute getAbstractConstraint_ConstaintId();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#isEnabled()
	 * @see #getAbstractConstraint()
	 * @generated
	 */
	EAttribute getAbstractConstraint_Enabled();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint <em>Cylindrical Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylindrical Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint
	 * @generated
	 */
	EClass getCylindricalConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getAngularCurrentState <em>Angular Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Current State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getAngularCurrentState()
	 * @see #getCylindricalConstraint()
	 * @generated
	 */
	EReference getCylindricalConstraint_AngularCurrentState();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getLinearCurrentState <em>Linear Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Current State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getLinearCurrentState()
	 * @see #getCylindricalConstraint()
	 * @generated
	 */
	EReference getCylindricalConstraint_LinearCurrentState();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint <em>Gear Ratio Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gear Ratio Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint
	 * @generated
	 */
	EClass getGearRatioConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint#getForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint#getForce()
	 * @see #getGearRatioConstraint()
	 * @generated
	 */
	EAttribute getGearRatioConstraint_Force();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint <em>Hinge Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hinge Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint
	 * @generated
	 */
	EClass getHingeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint#getAngularCurrentState <em>Angular Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Current State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint#getAngularCurrentState()
	 * @see #getHingeConstraint()
	 * @generated
	 */
	EReference getHingeConstraint_AngularCurrentState();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint <em>Prismatic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prismatic Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint
	 * @generated
	 */
	EClass getPrismaticConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint#getLinearCurrentState <em>Linear Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Current State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint#getLinearCurrentState()
	 * @see #getPrismaticConstraint()
	 * @generated
	 */
	EReference getPrismaticConstraint_LinearCurrentState();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint <em>RPRO Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPRO Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint
	 * @generated
	 */
	EClass getRPROConstraint();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getLinearStrength <em>Linear Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linear Strength</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getLinearStrength()
	 * @see #getRPROConstraint()
	 * @generated
	 */
	EReference getRPROConstraint_LinearStrength();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getAngularStrength <em>Angular Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angular Strength</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint#getAngularStrength()
	 * @see #getRPROConstraint()
	 * @generated
	 */
	EReference getRPROConstraint_AngularStrength();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint <em>Universal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint
	 * @generated
	 */
	EClass getUniversalConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint#getAngular0CurrentState <em>Angular0 Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular0 Current State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint#getAngular0CurrentState()
	 * @see #getUniversalConstraint()
	 * @generated
	 */
	EReference getUniversalConstraint_Angular0CurrentState();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint#getAngular1CurrentState <em>Angular1 Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular1 Current State</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint#getAngular1CurrentState()
	 * @see #getUniversalConstraint()
	 * @generated
	 */
	EReference getUniversalConstraint_Angular1CurrentState();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint <em>Constraint Attachment Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Attachment Point</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint
	 * @generated
	 */
	EClass getConstraintAttachmentPoint();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPhysicalBody <em>Physical Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Body</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPhysicalBody()
	 * @see #getConstraintAttachmentPoint()
	 * @generated
	 */
	EReference getConstraintAttachmentPoint_PhysicalBody();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Constraint</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getConstraint()
	 * @see #getConstraintAttachmentPoint()
	 * @generated
	 */
	EReference getConstraintAttachmentPoint_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getTransform()
	 * @see #getConstraintAttachmentPoint()
	 * @generated
	 */
	EReference getConstraintAttachmentPoint_Transform();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getDescription()
	 * @see #getConstraintAttachmentPoint()
	 * @generated
	 */
	EAttribute getConstraintAttachmentPoint_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPointId <em>Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Id</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPointId()
	 * @see #getConstraintAttachmentPoint()
	 * @generated
	 */
	EAttribute getConstraintAttachmentPoint_PointId();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry <em>Collision Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry
	 * @generated
	 */
	EClass getCollisionGeometry();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getSimulationProperties <em>Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Simulation Properties</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getSimulationProperties()
	 * @see #getCollisionGeometry()
	 * @generated
	 */
	EReference getCollisionGeometry_SimulationProperties();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getGeometry()
	 * @see #getCollisionGeometry()
	 * @generated
	 */
	EReference getCollisionGeometry_Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getTransform()
	 * @see #getCollisionGeometry()
	 * @generated
	 */
	EReference getCollisionGeometry_Transform();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getMaterial()
	 * @see #getCollisionGeometry()
	 * @generated
	 */
	EReference getCollisionGeometry_Material();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getDescription()
	 * @see #getCollisionGeometry()
	 * @generated
	 */
	EAttribute getCollisionGeometry_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getGeometryId <em>Geometry Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry Id</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry#getGeometryId()
	 * @see #getCollisionGeometry()
	 * @generated
	 */
	EAttribute getCollisionGeometry_GeometryId();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractMaterial <em>Abstract Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Material</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractMaterial
	 * @generated
	 */
	EClass getAbstractMaterial();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractMaterial#getMaterialId <em>Material Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Id</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractMaterial#getMaterialId()
	 * @see #getAbstractMaterial()
	 * @generated
	 */
	EAttribute getAbstractMaterial_MaterialId();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.BoxGeometry <em>Box Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.BoxGeometry
	 * @generated
	 */
	EClass getBoxGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.BoxGeometry#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.BoxGeometry#getDimension()
	 * @see #getBoxGeometry()
	 * @generated
	 */
	EReference getBoxGeometry_Dimension();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry <em>Capsule Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capsule Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry
	 * @generated
	 */
	EClass getCapsuleGeometry();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry#getRadius()
	 * @see #getCapsuleGeometry()
	 * @generated
	 */
	EAttribute getCapsuleGeometry_Radius();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry#getLength()
	 * @see #getCapsuleGeometry()
	 * @generated
	 */
	EAttribute getCapsuleGeometry_Length();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry <em>Cylinder Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry
	 * @generated
	 */
	EClass getCylinderGeometry();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry#getRadius()
	 * @see #getCylinderGeometry()
	 * @generated
	 */
	EAttribute getCylinderGeometry_Radius();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry#getLength()
	 * @see #getCylinderGeometry()
	 * @generated
	 */
	EAttribute getCylinderGeometry_Length();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.SphereGeometry <em>Sphere Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere Geometry</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.SphereGeometry
	 * @generated
	 */
	EClass getSphereGeometry();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.SphereGeometry#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.SphereGeometry#getRadius()
	 * @see #getSphereGeometry()
	 * @generated
	 */
	EAttribute getSphereGeometry_Radius();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade
	 * @generated
	 */
	EClass getApogyCommonTopologyAddonsDynamicsFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#findCenterOfMass(ca.gc.asc_csa.apogy.common.topology.Node) <em>Find Center Of Mass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Center Of Mass</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#findCenterOfMass(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsDynamicsFacade__FindCenterOfMass__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#findTotalMass(ca.gc.asc_csa.apogy.common.topology.Node) <em>Find Total Mass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Total Mass</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#findTotalMass(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsDynamicsFacade__FindTotalMass__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#getPhysicalBodies(ca.gc.asc_csa.apogy.common.topology.Node) <em>Get Physical Bodies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Physical Bodies</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#getPhysicalBodies(ca.gc.asc_csa.apogy.common.topology.Node)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsDynamicsFacade__GetPhysicalBodies__Node();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#getPhysicalNodeSimulationProperty(ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody, java.lang.Class) <em>Get Physical Node Simulation Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Physical Node Simulation Property</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#getPhysicalNodeSimulationProperty(ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsDynamicsFacade__GetPhysicalNodeSimulationProperty__PhysicalBody_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#getConstraintSimulationProperty(ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint, java.lang.Class) <em>Get Constraint Simulation Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Constraint Simulation Property</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade#getConstraintSimulationProperty(ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonTopologyAddonsDynamicsFacade__GetConstraintSimulationProperty__AbstractConstraint_Class();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T"
	 * @generated
	 */
	EDataType getSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonTopologyAddonsDynamicsFactory getApogyCommonTopologyAddonsDynamicsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.DynamicSystemPropertiesImpl <em>Dynamic System Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.DynamicSystemPropertiesImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getDynamicSystemProperties()
		 * @generated
		 */
		EClass DYNAMIC_SYSTEM_PROPERTIES = eINSTANCE.getDynamicSystemProperties();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_SYSTEM_PROPERTIES__CONSTRAINTS = eINSTANCE.getDynamicSystemProperties_Constraints();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_SYSTEM_PROPERTIES__MATERIALS = eINSTANCE.getDynamicSystemProperties_Materials();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractDynamicsEngineImpl <em>Abstract Dynamics Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractDynamicsEngineImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractDynamicsEngine()
		 * @generated
		 */
		EClass ABSTRACT_DYNAMICS_ENGINE = eINSTANCE.getAbstractDynamicsEngine();

		/**
		 * The meta object literal for the '<em><b>Start Simulation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DYNAMICS_ENGINE___START_SIMULATION = eINSTANCE.getAbstractDynamicsEngine__StartSimulation();

		/**
		 * The meta object literal for the '<em><b>Stop Simulation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_DYNAMICS_ENGINE___STOP_SIMULATION = eINSTANCE.getAbstractDynamicsEngine__StopSimulation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl <em>Physical Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalBodyImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPhysicalBody()
		 * @generated
		 */
		EClass PHYSICAL_BODY = eINSTANCE.getPhysicalBody();

		/**
		 * The meta object literal for the '<em><b>Physical Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BODY__PHYSICAL_PROPERTIES = eINSTANCE.getPhysicalBody_PhysicalProperties();

		/**
		 * The meta object literal for the '<em><b>Constraint Attachment Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS = eINSTANCE.getPhysicalBody_ConstraintAttachmentPoints();

		/**
		 * The meta object literal for the '<em><b>Simulation Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BODY__SIMULATION_PROPERTIES = eINSTANCE.getPhysicalBody_SimulationProperties();

		/**
		 * The meta object literal for the '<em><b>Center Of Mass Kinematic State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE = eINSTANCE.getPhysicalBody_CenterOfMassKinematicState();

		/**
		 * The meta object literal for the '<em><b>Points Of Interest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BODY__POINTS_OF_INTEREST = eINSTANCE.getPhysicalBody_PointsOfInterest();

		/**
		 * The meta object literal for the '<em><b>Collision Geometry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_BODY__COLLISION_GEOMETRY = eINSTANCE.getPhysicalBody_CollisionGeometry();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalPropertiesImpl <em>Physical Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PhysicalPropertiesImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPhysicalProperties()
		 * @generated
		 */
		EClass PHYSICAL_PROPERTIES = eINSTANCE.getPhysicalProperties();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PROPERTIES__MASS = eINSTANCE.getPhysicalProperties_Mass();

		/**
		 * The meta object literal for the '<em><b>Inertia Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PROPERTIES__INERTIA_MATRIX = eINSTANCE.getPhysicalProperties_InertiaMatrix();

		/**
		 * The meta object literal for the '<em><b>Center Of Mass Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PROPERTIES__CENTER_OF_MASS_LOCATION = eINSTANCE.getPhysicalProperties_CenterOfMassLocation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractPhysicalBodySimulationPropertiesImpl <em>Abstract Physical Body Simulation Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractPhysicalBodySimulationPropertiesImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractPhysicalBodySimulationProperties()
		 * @generated
		 */
		EClass ABSTRACT_PHYSICAL_BODY_SIMULATION_PROPERTIES = eINSTANCE.getAbstractPhysicalBodySimulationProperties();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintSimulationPropertiesImpl <em>Abstract Constraint Simulation Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintSimulationPropertiesImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractConstraintSimulationProperties()
		 * @generated
		 */
		EClass ABSTRACT_CONSTRAINT_SIMULATION_PROPERTIES = eINSTANCE.getAbstractConstraintSimulationProperties();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractCollisionGeometrySimulationPropertiesImpl <em>Abstract Collision Geometry Simulation Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractCollisionGeometrySimulationPropertiesImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractCollisionGeometrySimulationProperties()
		 * @generated
		 */
		EClass ABSTRACT_COLLISION_GEOMETRY_SIMULATION_PROPERTIES = eINSTANCE.getAbstractCollisionGeometrySimulationProperties();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PointOfInterestImpl <em>Point Of Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PointOfInterestImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPointOfInterest()
		 * @generated
		 */
		EClass POINT_OF_INTEREST = eINSTANCE.getPointOfInterest();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_OF_INTEREST__OFFSET = eINSTANCE.getPointOfInterest_Offset();

		/**
		 * The meta object literal for the '<em><b>Kinematic State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_OF_INTEREST__KINEMATIC_STATE = eINSTANCE.getPointOfInterest_KinematicState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.KinematicStateImpl <em>Kinematic State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.KinematicStateImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getKinematicState()
		 * @generated
		 */
		EClass KINEMATIC_STATE = eINSTANCE.getKinematicState();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINEMATIC_STATE__POSITION = eINSTANCE.getKinematicState_Position();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINEMATIC_STATE__ORIENTATION = eINSTANCE.getKinematicState_Orientation();

		/**
		 * The meta object literal for the '<em><b>Linear Velocity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINEMATIC_STATE__LINEAR_VELOCITY = eINSTANCE.getKinematicState_LinearVelocity();

		/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINEMATIC_STATE__ANGULAR_VELOCITY = eINSTANCE.getKinematicState_AngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Linear Acceleration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINEMATIC_STATE__LINEAR_ACCELERATION = eINSTANCE.getKinematicState_LinearAcceleration();

		/**
		 * The meta object literal for the '<em><b>Angular Acceleration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINEMATIC_STATE__ANGULAR_ACCELERATION = eINSTANCE.getKinematicState_AngularAcceleration();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintStateImpl <em>Constraint State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintStateImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getConstraintState()
		 * @generated
		 */
		EClass CONSTRAINT_STATE = eINSTANCE.getConstraintState();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_STATE__POSITION = eINSTANCE.getConstraintState_Position();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_STATE__VELOCITY = eINSTANCE.getConstraintState_Velocity();

		/**
		 * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_STATE__FORCE = eINSTANCE.getConstraintState_Force();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintImpl <em>Abstract Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractConstraintImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractConstraint()
		 * @generated
		 */
		EClass ABSTRACT_CONSTRAINT = eINSTANCE.getAbstractConstraint();

		/**
		 * The meta object literal for the '<em><b>Attachment Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTRAINT__ATTACHMENT_POINTS = eINSTANCE.getAbstractConstraint_AttachmentPoints();

		/**
		 * The meta object literal for the '<em><b>Simulation Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONSTRAINT__SIMULATION_PROPERTIES = eINSTANCE.getAbstractConstraint_SimulationProperties();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTRAINT__DESCRIPTION = eINSTANCE.getAbstractConstraint_Description();

		/**
		 * The meta object literal for the '<em><b>Constaint Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTRAINT__CONSTAINT_ID = eINSTANCE.getAbstractConstraint_ConstaintId();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONSTRAINT__ENABLED = eINSTANCE.getAbstractConstraint_Enabled();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylindricalConstraintImpl <em>Cylindrical Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylindricalConstraintImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCylindricalConstraint()
		 * @generated
		 */
		EClass CYLINDRICAL_CONSTRAINT = eINSTANCE.getCylindricalConstraint();

		/**
		 * The meta object literal for the '<em><b>Angular Current State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE = eINSTANCE.getCylindricalConstraint_AngularCurrentState();

		/**
		 * The meta object literal for the '<em><b>Linear Current State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE = eINSTANCE.getCylindricalConstraint_LinearCurrentState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GearRatioConstraintImpl <em>Gear Ratio Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GearRatioConstraintImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getGearRatioConstraint()
		 * @generated
		 */
		EClass GEAR_RATIO_CONSTRAINT = eINSTANCE.getGearRatioConstraint();

		/**
		 * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEAR_RATIO_CONSTRAINT__FORCE = eINSTANCE.getGearRatioConstraint_Force();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.HingeConstraintImpl <em>Hinge Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.HingeConstraintImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getHingeConstraint()
		 * @generated
		 */
		EClass HINGE_CONSTRAINT = eINSTANCE.getHingeConstraint();

		/**
		 * The meta object literal for the '<em><b>Angular Current State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE = eINSTANCE.getHingeConstraint_AngularCurrentState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PrismaticConstraintImpl <em>Prismatic Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PrismaticConstraintImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getPrismaticConstraint()
		 * @generated
		 */
		EClass PRISMATIC_CONSTRAINT = eINSTANCE.getPrismaticConstraint();

		/**
		 * The meta object literal for the '<em><b>Linear Current State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRISMATIC_CONSTRAINT__LINEAR_CURRENT_STATE = eINSTANCE.getPrismaticConstraint_LinearCurrentState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.RPROConstraintImpl <em>RPRO Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.RPROConstraintImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getRPROConstraint()
		 * @generated
		 */
		EClass RPRO_CONSTRAINT = eINSTANCE.getRPROConstraint();

		/**
		 * The meta object literal for the '<em><b>Linear Strength</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPRO_CONSTRAINT__LINEAR_STRENGTH = eINSTANCE.getRPROConstraint_LinearStrength();

		/**
		 * The meta object literal for the '<em><b>Angular Strength</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPRO_CONSTRAINT__ANGULAR_STRENGTH = eINSTANCE.getRPROConstraint_AngularStrength();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.UniversalConstraintImpl <em>Universal Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.UniversalConstraintImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getUniversalConstraint()
		 * @generated
		 */
		EClass UNIVERSAL_CONSTRAINT = eINSTANCE.getUniversalConstraint();

		/**
		 * The meta object literal for the '<em><b>Angular0 Current State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE = eINSTANCE.getUniversalConstraint_Angular0CurrentState();

		/**
		 * The meta object literal for the '<em><b>Angular1 Current State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE = eINSTANCE.getUniversalConstraint_Angular1CurrentState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintAttachmentPointImpl <em>Constraint Attachment Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintAttachmentPointImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getConstraintAttachmentPoint()
		 * @generated
		 */
		EClass CONSTRAINT_ATTACHMENT_POINT = eINSTANCE.getConstraintAttachmentPoint();

		/**
		 * The meta object literal for the '<em><b>Physical Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_ATTACHMENT_POINT__PHYSICAL_BODY = eINSTANCE.getConstraintAttachmentPoint_PhysicalBody();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_ATTACHMENT_POINT__CONSTRAINT = eINSTANCE.getConstraintAttachmentPoint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_ATTACHMENT_POINT__TRANSFORM = eINSTANCE.getConstraintAttachmentPoint_Transform();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_ATTACHMENT_POINT__DESCRIPTION = eINSTANCE.getConstraintAttachmentPoint_Description();

		/**
		 * The meta object literal for the '<em><b>Point Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_ATTACHMENT_POINT__POINT_ID = eINSTANCE.getConstraintAttachmentPoint_PointId();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CollisionGeometryImpl <em>Collision Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CollisionGeometryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCollisionGeometry()
		 * @generated
		 */
		EClass COLLISION_GEOMETRY = eINSTANCE.getCollisionGeometry();

		/**
		 * The meta object literal for the '<em><b>Simulation Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION_GEOMETRY__SIMULATION_PROPERTIES = eINSTANCE.getCollisionGeometry_SimulationProperties();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION_GEOMETRY__GEOMETRY = eINSTANCE.getCollisionGeometry_Geometry();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION_GEOMETRY__TRANSFORM = eINSTANCE.getCollisionGeometry_Transform();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION_GEOMETRY__MATERIAL = eINSTANCE.getCollisionGeometry_Material();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLISION_GEOMETRY__DESCRIPTION = eINSTANCE.getCollisionGeometry_Description();

		/**
		 * The meta object literal for the '<em><b>Geometry Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLISION_GEOMETRY__GEOMETRY_ID = eINSTANCE.getCollisionGeometry_GeometryId();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractMaterialImpl <em>Abstract Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.AbstractMaterialImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getAbstractMaterial()
		 * @generated
		 */
		EClass ABSTRACT_MATERIAL = eINSTANCE.getAbstractMaterial();

		/**
		 * The meta object literal for the '<em><b>Material Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MATERIAL__MATERIAL_ID = eINSTANCE.getAbstractMaterial_MaterialId();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.GeometryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.BoxGeometryImpl <em>Box Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.BoxGeometryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getBoxGeometry()
		 * @generated
		 */
		EClass BOX_GEOMETRY = eINSTANCE.getBoxGeometry();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX_GEOMETRY__DIMENSION = eINSTANCE.getBoxGeometry_Dimension();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CapsuleGeometryImpl <em>Capsule Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CapsuleGeometryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCapsuleGeometry()
		 * @generated
		 */
		EClass CAPSULE_GEOMETRY = eINSTANCE.getCapsuleGeometry();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPSULE_GEOMETRY__RADIUS = eINSTANCE.getCapsuleGeometry_Radius();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPSULE_GEOMETRY__LENGTH = eINSTANCE.getCapsuleGeometry_Length();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylinderGeometryImpl <em>Cylinder Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.CylinderGeometryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getCylinderGeometry()
		 * @generated
		 */
		EClass CYLINDER_GEOMETRY = eINSTANCE.getCylinderGeometry();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER_GEOMETRY__RADIUS = eINSTANCE.getCylinderGeometry_Radius();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER_GEOMETRY__LENGTH = eINSTANCE.getCylinderGeometry_Length();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.SphereGeometryImpl <em>Sphere Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.SphereGeometryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getSphereGeometry()
		 * @generated
		 */
		EClass SPHERE_GEOMETRY = eINSTANCE.getSphereGeometry();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE_GEOMETRY__RADIUS = eINSTANCE.getSphereGeometry_Radius();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getApogyCommonTopologyAddonsDynamicsFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE = eINSTANCE.getApogyCommonTopologyAddonsDynamicsFacade();

		/**
		 * The meta object literal for the '<em><b>Find Center Of Mass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___FIND_CENTER_OF_MASS__NODE = eINSTANCE.getApogyCommonTopologyAddonsDynamicsFacade__FindCenterOfMass__Node();

		/**
		 * The meta object literal for the '<em><b>Find Total Mass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___FIND_TOTAL_MASS__NODE = eINSTANCE.getApogyCommonTopologyAddonsDynamicsFacade__FindTotalMass__Node();

		/**
		 * The meta object literal for the '<em><b>Get Physical Bodies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_PHYSICAL_BODIES__NODE = eINSTANCE.getApogyCommonTopologyAddonsDynamicsFacade__GetPhysicalBodies__Node();

		/**
		 * The meta object literal for the '<em><b>Get Physical Node Simulation Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_PHYSICAL_NODE_SIMULATION_PROPERTY__PHYSICALBODY_CLASS = eINSTANCE.getApogyCommonTopologyAddonsDynamicsFacade__GetPhysicalNodeSimulationProperty__PhysicalBody_Class();

		/**
		 * The meta object literal for the '<em><b>Get Constraint Simulation Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_ADDONS_DYNAMICS_FACADE___GET_CONSTRAINT_SIMULATION_PROPERTY__ABSTRACTCONSTRAINT_CLASS = eINSTANCE.getApogyCommonTopologyAddonsDynamicsFacade__GetConstraintSimulationProperty__AbstractConstraint_Class();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

	}

} //ApogyCommonTopologyAddonsDynamicsPackage
