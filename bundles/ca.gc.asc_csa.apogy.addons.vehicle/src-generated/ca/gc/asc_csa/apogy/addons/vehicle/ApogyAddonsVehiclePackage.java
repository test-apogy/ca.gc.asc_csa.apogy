package ca.gc.asc_csa.apogy.addons.vehicle;
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
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

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
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsVehicle' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyAddonsVehicle' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.addons.vehicle/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.vehicle.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons'"
 * @generated
 */
public interface ApogyAddonsVehiclePackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "vehicle";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.addons.vehicle";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "vehicle";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsVehiclePackage eINSTANCE = ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl <em>Vehicle Pose Corrector</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getVehiclePoseCorrector()
	 * @generated
	 */
  int VEHICLE_POSE_CORRECTOR = 0;

  /**
	 * The feature id for the '<em><b>Apogy System Api Adapter</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER = ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER;

  /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__ENABLED = ApogyCorePackage.POSE_CORRECTOR__ENABLED;

  /**
	 * The feature id for the '<em><b>Initializing</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__INITIALIZING = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Meshes</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__MESHES = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Contact Bodies</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__CONTACT_BODIES = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>ZCorrection Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>ZCorrection</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__ZCORRECTION = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Orientation Correction Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Orientation Correction</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Contact Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 7;

  /**
	 * The number of structural features of the '<em>Vehicle Pose Corrector</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR_FEATURE_COUNT = ApogyCorePackage.POSE_CORRECTOR_FEATURE_COUNT + 8;

  /**
	 * The operation id for the '<em>Apply Correction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4 = ApogyCorePackage.POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4;

		/**
	 * The operation id for the '<em>Re Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR___RE_INITIALIZE = ApogyCorePackage.POSE_CORRECTOR_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Get Mesh Extent2 D</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR___GET_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH = ApogyCorePackage.POSE_CORRECTOR_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>Get Closest Neighbour Iterator Provider</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR___GET_CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER__CARTESIANTRIANGULARMESH = ApogyCorePackage.POSE_CORRECTOR_OPERATION_COUNT + 2;

  /**
	 * The number of operations of the '<em>Vehicle Pose Corrector</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_POSE_CORRECTOR_OPERATION_COUNT = ApogyCorePackage.POSE_CORRECTOR_OPERATION_COUNT + 3;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshNodeEntryImpl <em>Mesh Node Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshNodeEntryImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getMeshNodeEntry()
	 * @generated
	 */
	int MESH_NODE_ENTRY = 1;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE_ENTRY__NODE = 0;

		/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE_ENTRY__MESH = 1;

		/**
	 * The number of structural features of the '<em>Mesh Node Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE_ENTRY_FEATURE_COUNT = 2;

		/**
	 * The number of operations of the '<em>Mesh Node Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_NODE_ENTRY_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ContactProviderImpl <em>Contact Provider</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ContactProviderImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getContactProvider()
	 * @generated
	 */
  int CONTACT_PROVIDER = 2;

  /**
	 * The feature id for the '<em><b>Vehicle Pose Corrector</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR = 0;

  /**
	 * The number of structural features of the '<em>Contact Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTACT_PROVIDER_FEATURE_COUNT = 1;

  /**
	 * The operation id for the '<em>Extract Contact Bodies</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES = 0;

  /**
	 * The operation id for the '<em>Update Contact Points</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP = 1;

  /**
	 * The number of operations of the '<em>Contact Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CONTACT_PROVIDER_OPERATION_COUNT = 2;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelImpl <em>Wheel</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheel()
	 * @generated
	 */
  int WHEEL = 3;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__PARENT = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__DESCRIPTION = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__NODE_ID = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__CHILDREN = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CHILDREN;

  /**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__AGGREGATED_CHILDREN = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__AGGREGATED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Physical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__PHYSICAL_PROPERTIES = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES;

  /**
	 * The feature id for the '<em><b>Constraint Attachment Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__CONSTRAINT_ATTACHMENT_POINTS = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS;

  /**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__SIMULATION_PROPERTIES = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES;

  /**
	 * The feature id for the '<em><b>Center Of Mass Kinematic State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__CENTER_OF_MASS_KINEMATIC_STATE = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE;

  /**
	 * The feature id for the '<em><b>Points Of Interest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__POINTS_OF_INTEREST = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST;

  /**
	 * The feature id for the '<em><b>Collision Geometry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__COLLISION_GEOMETRY = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY;

  /**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL__RADIUS = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL__LENGTH = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Wheel</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_FEATURE_COUNT = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL___ACCEPT__INODEVISITOR = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Wheel</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_OPERATION_COUNT = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterImpl <em>Thruster</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getThruster()
	 * @generated
	 */
  int THRUSTER = 4;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER__PARENT = ApogyCommonTopologyPackage.NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER__DESCRIPTION = ApogyCommonTopologyPackage.NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER__NODE_ID = ApogyCommonTopologyPackage.NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Minimum Thrust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER__MINIMUM_THRUST = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Maximum Thrust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER__MAXIMUM_THRUST = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Current Thrust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRUSTER__CURRENT_THRUST = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Thrust Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER__THRUST_LEVEL = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Plume Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER__PLUME_ANGLE = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Thruster</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_FEATURE_COUNT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 5;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Thruster</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_OPERATION_COUNT = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterBindingImpl <em>Thruster Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterBindingImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getThrusterBinding()
	 * @generated
	 */
  int THRUSTER_BINDING = 5;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING__BINDED = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING__DESCRIPTION = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING__NAME = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING__SOURCE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING__FEATURE_NODE = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING__FEATURE_NODE_ADAPTER = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Thruster</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING__THRUSTER = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Thruster Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING_FEATURE_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING___BIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING___UNBIND = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING___CLONE__MAP = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

  /**
	 * The number of operations of the '<em>Thruster Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int THRUSTER_BINDING_OPERATION_COUNT = ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelContactProviderImpl <em>Wheel Contact Provider</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelContactProviderImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheelContactProvider()
	 * @generated
	 */
  int WHEEL_CONTACT_PROVIDER = 6;

  /**
	 * The feature id for the '<em><b>Vehicle Pose Corrector</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR = CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR;

  /**
	 * The feature id for the '<em><b>Contact Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_CONTACT_PROVIDER__CONTACT_MODE = CONTACT_PROVIDER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Wheel Contact Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_CONTACT_PROVIDER_FEATURE_COUNT = CONTACT_PROVIDER_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Extract Contact Bodies</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES = CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES;

  /**
	 * The operation id for the '<em>Update Contact Points</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP = CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP;

  /**
	 * The number of operations of the '<em>Wheel Contact Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_CONTACT_PROVIDER_OPERATION_COUNT = CONTACT_PROVIDER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootImpl <em>Lander Spherical Foot</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getLanderSphericalFoot()
	 * @generated
	 */
  int LANDER_SPHERICAL_FOOT = 7;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__PARENT = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__DESCRIPTION = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__NODE_ID = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__CHILDREN = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CHILDREN;

  /**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__AGGREGATED_CHILDREN = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__AGGREGATED_CHILDREN;

  /**
	 * The feature id for the '<em><b>Physical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__PHYSICAL_PROPERTIES = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__PHYSICAL_PROPERTIES;

  /**
	 * The feature id for the '<em><b>Constraint Attachment Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__CONSTRAINT_ATTACHMENT_POINTS = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CONSTRAINT_ATTACHMENT_POINTS;

  /**
	 * The feature id for the '<em><b>Simulation Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__SIMULATION_PROPERTIES = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__SIMULATION_PROPERTIES;

  /**
	 * The feature id for the '<em><b>Center Of Mass Kinematic State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__CENTER_OF_MASS_KINEMATIC_STATE = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__CENTER_OF_MASS_KINEMATIC_STATE;

  /**
	 * The feature id for the '<em><b>Points Of Interest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__POINTS_OF_INTEREST = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__POINTS_OF_INTEREST;

  /**
	 * The feature id for the '<em><b>Collision Geometry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__COLLISION_GEOMETRY = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY__COLLISION_GEOMETRY;

  /**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT__RADIUS = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Lander Spherical Foot</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_FEATURE_COUNT = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT___ACCEPT__INODEVISITOR = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Lander Spherical Foot</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_OPERATION_COUNT = ApogyCommonTopologyAddonsDynamicsPackage.PHYSICAL_BODY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootContactProviderImpl <em>Lander Spherical Foot Contact Provider</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootContactProviderImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getLanderSphericalFootContactProvider()
	 * @generated
	 */
  int LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER = 8;

  /**
	 * The feature id for the '<em><b>Vehicle Pose Corrector</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR = CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR;

  /**
	 * The number of structural features of the '<em>Lander Spherical Foot Contact Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER_FEATURE_COUNT = CONTACT_PROVIDER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Extract Contact Bodies</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES = CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES;

  /**
	 * The operation id for the '<em>Update Contact Points</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP = CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP;

  /**
	 * The number of operations of the '<em>Lander Spherical Foot Contact Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER_OPERATION_COUNT = CONTACT_PROVIDER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehicleFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehicleFacadeImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getApogyAddonsVehicleFacade()
	 * @generated
	 */
	int APOGY_ADDONS_VEHICLE_FACADE = 9;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_VEHICLE_FACADE_FEATURE_COUNT = 0;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ADDONS_VEHICLE_FACADE_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelVehicleUtilitiesImpl <em>Wheel Vehicle Utilities</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelVehicleUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheelVehicleUtilities()
	 * @generated
	 */
  int WHEEL_VEHICLE_UTILITIES = 10;

  /**
	 * The number of structural features of the '<em>Wheel Vehicle Utilities</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get Wheel Center Point</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_SEGMENT2D = 0;

  /**
	 * The operation id for the '<em>Get Wheel Center Point</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_TERRAINPROFILE = 1;

  /**
	 * The operation id for the '<em>Find Terrain Profile</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___FIND_TERRAIN_PROFILE__CARTESIANTRIANGULARMESH_PLANE = 2;

  /**
	 * The operation id for the '<em>Find Intersection</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___FIND_INTERSECTION__PLANE_LINE3D = 3;

  /**
	 * The operation id for the '<em>Is Point On Segment</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___IS_POINT_ON_SEGMENT__POINT2D_SEGMENT2D = 4;

  /**
	 * The operation id for the '<em>Find Mesh Extent2 D</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___FIND_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH = 5;

  /**
	 * The operation id for the '<em>Is Within</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___IS_WITHIN__POINT3D_MESHEXTENT2D = 6;

  /**
	 * The operation id for the '<em>Find Best Fit Plane</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES___FIND_BEST_FIT_PLANE__LIST = 7;

  /**
	 * The number of operations of the '<em>Wheel Vehicle Utilities</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WHEEL_VEHICLE_UTILITIES_OPERATION_COUNT = 8;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl <em>Mesh Extent2 D</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getMeshExtent2D()
	 * @generated
	 */
  int MESH_EXTENT2_D = 11;

  /**
	 * The feature id for the '<em><b>Minimum X</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESH_EXTENT2_D__MINIMUM_X = 0;

  /**
	 * The feature id for the '<em><b>Minimum Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESH_EXTENT2_D__MINIMUM_Y = 1;

  /**
	 * The feature id for the '<em><b>Maximum X</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESH_EXTENT2_D__MAXIMUM_X = 2;

  /**
	 * The feature id for the '<em><b>Maximum Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESH_EXTENT2_D__MAXIMUM_Y = 3;

  /**
	 * The number of structural features of the '<em>Mesh Extent2 D</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESH_EXTENT2_D_FEATURE_COUNT = 4;

  /**
	 * The number of operations of the '<em>Mesh Extent2 D</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MESH_EXTENT2_D_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolImpl <em>Path Planner Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPathPlannerTool()
	 * @generated
	 */
	int PATH_PLANNER_TOOL = 12;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__NAME = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__DESCRIPTION = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__TOOL_LIST = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__ACTIVE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__DISPOSED = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__VISIBLE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__ROOT_NODE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__ROOT_NODE;

		/**
	 * The feature id for the '<em><b>From Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__FROM_ABSOLUTE_POSITION = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>From Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__FROM_RELATIVE_POSITION = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__FROM_NODE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE;

		/**
	 * The feature id for the '<em><b>From Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__FROM_NODE_LOCK = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>To Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__TO_ABSOLUTE_POSITION = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>To Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__TO_RELATIVE_POSITION = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__TO_NODE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE;

		/**
	 * The feature id for the '<em><b>To Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__TO_NODE_LOCK = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__DISTANCE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE;

		/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__BUSY = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Auto Path Plan Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Mesh Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__MESH_LAYER = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Path Planner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__PATH_PLANNER = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Planned Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__PLANNED_PATH = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Path Planner Tool Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 5;

		/**
	 * The number of structural features of the '<em>Path Planner Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_FEATURE_COUNT = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 6;

		/**
	 * The operation id for the '<em>Initialise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL___INITIALISE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL___INITIALISE;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL___DISPOSE = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL___SELECTION_CHANGED__NODESELECTION = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL___SELECTION_CHANGED__NODESELECTION;

		/**
	 * The operation id for the '<em>Points Relative Pose Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D;

		/**
	 * The operation id for the '<em>Plan Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL___PLAN_PATH = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Path Planner Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_OPERATION_COUNT = ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolNodeImpl <em>Path Planner Tool Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolNodeImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPathPlannerToolNode()
	 * @generated
	 */
	int PATH_PLANNER_TOOL_NODE = 13;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Path Planner Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Path Planner Tool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Path Planner Tool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PLANNER_TOOL_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePathPlannerToolImpl <em>Vehicle Path Planner Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePathPlannerToolImpl
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getVehiclePathPlannerTool()
	 * @generated
	 */
	int VEHICLE_PATH_PLANNER_TOOL = 14;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__NAME = PATH_PLANNER_TOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__DESCRIPTION = PATH_PLANNER_TOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__TOOL_LIST = PATH_PLANNER_TOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__ACTIVE = PATH_PLANNER_TOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__DISPOSED = PATH_PLANNER_TOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__VISIBLE = PATH_PLANNER_TOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__ROOT_NODE = PATH_PLANNER_TOOL__ROOT_NODE;

		/**
	 * The feature id for the '<em><b>From Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__FROM_ABSOLUTE_POSITION = PATH_PLANNER_TOOL__FROM_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>From Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__FROM_RELATIVE_POSITION = PATH_PLANNER_TOOL__FROM_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__FROM_NODE = PATH_PLANNER_TOOL__FROM_NODE;

		/**
	 * The feature id for the '<em><b>From Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__FROM_NODE_LOCK = PATH_PLANNER_TOOL__FROM_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>To Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__TO_ABSOLUTE_POSITION = PATH_PLANNER_TOOL__TO_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>To Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__TO_RELATIVE_POSITION = PATH_PLANNER_TOOL__TO_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__TO_NODE = PATH_PLANNER_TOOL__TO_NODE;

		/**
	 * The feature id for the '<em><b>To Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__TO_NODE_LOCK = PATH_PLANNER_TOOL__TO_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__DISTANCE = PATH_PLANNER_TOOL__DISTANCE;

		/**
	 * The feature id for the '<em><b>Busy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__BUSY = PATH_PLANNER_TOOL__BUSY;

		/**
	 * The feature id for the '<em><b>Auto Path Plan Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED = PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED;

		/**
	 * The feature id for the '<em><b>Mesh Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__MESH_LAYER = PATH_PLANNER_TOOL__MESH_LAYER;

		/**
	 * The feature id for the '<em><b>Path Planner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__PATH_PLANNER = PATH_PLANNER_TOOL__PATH_PLANNER;

		/**
	 * The feature id for the '<em><b>Planned Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__PLANNED_PATH = PATH_PLANNER_TOOL__PLANNED_PATH;

		/**
	 * The feature id for the '<em><b>Path Planner Tool Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE = PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE;

		/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL__VARIABLE = PATH_PLANNER_TOOL_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Vehicle Path Planner Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL_FEATURE_COUNT = PATH_PLANNER_TOOL_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Initialise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL___INITIALISE = PATH_PLANNER_TOOL___INITIALISE;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL___DISPOSE = PATH_PLANNER_TOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL___SELECTION_CHANGED__NODESELECTION = PATH_PLANNER_TOOL___SELECTION_CHANGED__NODESELECTION;

		/**
	 * The operation id for the '<em>Points Relative Pose Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D = PATH_PLANNER_TOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D;

		/**
	 * The operation id for the '<em>Plan Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL___PLAN_PATH = PATH_PLANNER_TOOL___PLAN_PATH;

		/**
	 * The number of operations of the '<em>Vehicle Path Planner Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_PATH_PLANNER_TOOL_OPERATION_COUNT = PATH_PLANNER_TOOL_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode <em>ZCorrection Mode</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getZCorrectionMode()
	 * @generated
	 */
  int ZCORRECTION_MODE = 15;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode <em>Orientation Correction Mode</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getOrientationCorrectionMode()
	 * @generated
	 */
  int ORIENTATION_CORRECTION_MODE = 16;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode <em>Wheel Contact Mode</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheelContactMode()
	 * @generated
	 */
  int WHEEL_CONTACT_MODE = 17;

  /**
	 * The meta object id for the '<em>Segment2 D</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Segment2D
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getSegment2D()
	 * @generated
	 */
  int SEGMENT2_D = 25;

  /**
	 * The meta object id for the '<em>Line3d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Line3d
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getLine3d()
	 * @generated
	 */
  int LINE3D = 26;

  /**
	 * The meta object id for the '<em>Plane</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Plane
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPlane()
	 * @generated
	 */
  int PLANE = 27;

  /**
	 * The meta object id for the '<em>Terrain Profile</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getTerrainProfile()
	 * @generated
	 */
  int TERRAIN_PROFILE = 28;

  /**
	 * The meta object id for the '<em>Closest Neighbour Iterator Provider</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getClosestNeighbourIteratorProvider()
	 * @generated
	 */
  int CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER = 29;

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector <em>Vehicle Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Pose Corrector</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector
	 * @generated
	 */
  EClass getVehiclePoseCorrector();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#isInitializing <em>Initializing</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initializing</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#isInitializing()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EAttribute getVehiclePoseCorrector_Initializing();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getMeshes <em>Meshes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meshes</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getMeshes()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EReference getVehiclePoseCorrector_Meshes();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactBodies <em>Contact Bodies</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact Bodies</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactBodies()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EReference getVehiclePoseCorrector_ContactBodies();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrectionMode <em>ZCorrection Mode</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZCorrection Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrectionMode()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EAttribute getVehiclePoseCorrector_ZCorrectionMode();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrection <em>ZCorrection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZCorrection</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getZCorrection()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EAttribute getVehiclePoseCorrector_ZCorrection();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrectionMode <em>Orientation Correction Mode</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Correction Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrectionMode()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EAttribute getVehiclePoseCorrector_OrientationCorrectionMode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrection <em>Orientation Correction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orientation Correction</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getOrientationCorrection()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EReference getVehiclePoseCorrector_OrientationCorrection();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactProvider <em>Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getContactProvider()
	 * @see #getVehiclePoseCorrector()
	 * @generated
	 */
  EReference getVehiclePoseCorrector_ContactProvider();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#reInitialize() <em>Re Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Re Initialize</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#reInitialize()
	 * @generated
	 */
  EOperation getVehiclePoseCorrector__ReInitialize();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getMeshExtent2D(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Get Mesh Extent2 D</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mesh Extent2 D</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getMeshExtent2D(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
  EOperation getVehiclePoseCorrector__GetMeshExtent2D__CartesianTriangularMesh();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getClosestNeighbourIteratorProvider(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Get Closest Neighbour Iterator Provider</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Closest Neighbour Iterator Provider</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector#getClosestNeighbourIteratorProvider(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
  EOperation getVehiclePoseCorrector__GetClosestNeighbourIteratorProvider__CartesianTriangularMesh();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry <em>Mesh Node Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Node Entry</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry
	 * @generated
	 */
	EClass getMeshNodeEntry();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry#getNode()
	 * @see #getMeshNodeEntry()
	 * @generated
	 */
	EReference getMeshNodeEntry_Node();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshNodeEntry#getMesh()
	 * @see #getMeshNodeEntry()
	 * @generated
	 */
	EReference getMeshNodeEntry_Mesh();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider <em>Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider
	 * @generated
	 */
  EClass getContactProvider();

  /**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#getVehiclePoseCorrector <em>Vehicle Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vehicle Pose Corrector</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#getVehiclePoseCorrector()
	 * @see #getContactProvider()
	 * @generated
	 */
  EReference getContactProvider_VehiclePoseCorrector();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#extractContactBodies() <em>Extract Contact Bodies</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Contact Bodies</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#extractContactBodies()
	 * @generated
	 */
  EOperation getContactProvider__ExtractContactBodies();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#updateContactPoints(ca.gc.asc_csa.apogy.common.math.Matrix4x4, java.util.Map) <em>Update Contact Points</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Contact Points</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ContactProvider#updateContactPoints(ca.gc.asc_csa.apogy.common.math.Matrix4x4, java.util.Map)
	 * @generated
	 */
  EOperation getContactProvider__UpdateContactPoints__Matrix4x4_Map();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Wheel
	 * @generated
	 */
  EClass getWheel();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getRadius()
	 * @see #getWheel()
	 * @generated
	 */
  EAttribute getWheel_Radius();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Wheel#getLength()
	 * @see #getWheel()
	 * @generated
	 */
	EAttribute getWheel_Length();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster <em>Thruster</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thruster</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Thruster
	 * @generated
	 */
  EClass getThruster();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMinimumThrust <em>Minimum Thrust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Thrust</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMinimumThrust()
	 * @see #getThruster()
	 * @generated
	 */
	EAttribute getThruster_MinimumThrust();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMaximumThrust <em>Maximum Thrust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Thrust</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getMaximumThrust()
	 * @see #getThruster()
	 * @generated
	 */
	EAttribute getThruster_MaximumThrust();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getCurrentThrust <em>Current Thrust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Thrust</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getCurrentThrust()
	 * @see #getThruster()
	 * @generated
	 */
	EAttribute getThruster_CurrentThrust();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getPlumeAngle <em>Plume Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plume Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getPlumeAngle()
	 * @see #getThruster()
	 * @generated
	 */
  EAttribute getThruster_PlumeAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getThrustLevel <em>Thrust Level</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thrust Level</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Thruster#getThrustLevel()
	 * @see #getThruster()
	 * @generated
	 */
  EAttribute getThruster_ThrustLevel();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding <em>Thruster Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thruster Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding
	 * @generated
	 */
  EClass getThrusterBinding();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding#getThruster <em>Thruster</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Thruster</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ThrusterBinding#getThruster()
	 * @see #getThrusterBinding()
	 * @generated
	 */
  EReference getThrusterBinding_Thruster();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider <em>Wheel Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel Contact Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider
	 * @generated
	 */
  EClass getWheelContactProvider();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider#getContactMode <em>Contact Mode</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelContactProvider#getContactMode()
	 * @see #getWheelContactProvider()
	 * @generated
	 */
  EAttribute getWheelContactProvider_ContactMode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot <em>Lander Spherical Foot</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Spherical Foot</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot
	 * @generated
	 */
  EClass getLanderSphericalFoot();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFoot#getRadius()
	 * @see #getLanderSphericalFoot()
	 * @generated
	 */
  EAttribute getLanderSphericalFoot_Radius();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFootContactProvider <em>Lander Spherical Foot Contact Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Spherical Foot Contact Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.LanderSphericalFootContactProvider
	 * @generated
	 */
  EClass getLanderSphericalFootContactProvider();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFacade
	 * @generated
	 */
	EClass getApogyAddonsVehicleFacade();

		/**
	 * The meta object id for the '<em>Point2d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Point2d
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPoint2d()
	 * @generated
	 */
  int POINT2D = 18;


  /**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPoint3d()
	 * @generated
	 */
  int POINT3D = 19;

  /**
	 * The meta object id for the '<em>Vector3d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getVector3d()
	 * @generated
	 */
  int VECTOR3D = 20;

  /**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getMap()
	 * @generated
	 */
  int MAP = 21;

  /**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getList()
	 * @generated
	 */
  int LIST = 22;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 23;


  /**
	 * The meta object id for the '<em>Iterator</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Iterator
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getIterator()
	 * @generated
	 */
  int ITERATOR = 24;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities <em>Wheel Vehicle Utilities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel Vehicle Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities
	 * @generated
	 */
  EClass getWheelVehicleUtilities();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#getWheelCenterPoint(double, double, ca.gc.asc_csa.apogy.addons.vehicle.Segment2D) <em>Get Wheel Center Point</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Wheel Center Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#getWheelCenterPoint(double, double, ca.gc.asc_csa.apogy.addons.vehicle.Segment2D)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__GetWheelCenterPoint__double_double_Segment2D();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#getWheelCenterPoint(double, double, ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile) <em>Get Wheel Center Point</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Wheel Center Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#getWheelCenterPoint(double, double, ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__GetWheelCenterPoint__double_double_TerrainProfile();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findTerrainProfile(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, ca.gc.asc_csa.apogy.addons.vehicle.Plane) <em>Find Terrain Profile</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Terrain Profile</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findTerrainProfile(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, ca.gc.asc_csa.apogy.addons.vehicle.Plane)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__FindTerrainProfile__CartesianTriangularMesh_Plane();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findIntersection(ca.gc.asc_csa.apogy.addons.vehicle.Plane, ca.gc.asc_csa.apogy.addons.vehicle.Line3d) <em>Find Intersection</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Intersection</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findIntersection(ca.gc.asc_csa.apogy.addons.vehicle.Plane, ca.gc.asc_csa.apogy.addons.vehicle.Line3d)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__FindIntersection__Plane_Line3d();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#isPointOnSegment(javax.vecmath.Point2d, ca.gc.asc_csa.apogy.addons.vehicle.Segment2D) <em>Is Point On Segment</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Point On Segment</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#isPointOnSegment(javax.vecmath.Point2d, ca.gc.asc_csa.apogy.addons.vehicle.Segment2D)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__IsPointOnSegment__Point2d_Segment2D();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findMeshExtent2D(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Find Mesh Extent2 D</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Mesh Extent2 D</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findMeshExtent2D(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__FindMeshExtent2D__CartesianTriangularMesh();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#isWithin(javax.vecmath.Point3d, ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D) <em>Is Within</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Within</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#isWithin(javax.vecmath.Point3d, ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__IsWithin__Point3d_MeshExtent2D();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findBestFitPlane(java.util.List) <em>Find Best Fit Plane</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Best Fit Plane</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelVehicleUtilities#findBestFitPlane(java.util.List)
	 * @generated
	 */
  EOperation getWheelVehicleUtilities__FindBestFitPlane__List();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D <em>Mesh Extent2 D</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh Extent2 D</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D
	 * @generated
	 */
  EClass getMeshExtent2D();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumX <em>Minimum X</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum X</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumX()
	 * @see #getMeshExtent2D()
	 * @generated
	 */
  EAttribute getMeshExtent2D_MinimumX();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumY <em>Minimum Y</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Y</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMinimumY()
	 * @see #getMeshExtent2D()
	 * @generated
	 */
  EAttribute getMeshExtent2D_MinimumY();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumX <em>Maximum X</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum X</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumX()
	 * @see #getMeshExtent2D()
	 * @generated
	 */
  EAttribute getMeshExtent2D_MaximumX();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumY <em>Maximum Y</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Y</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D#getMaximumY()
	 * @see #getMeshExtent2D()
	 * @generated
	 */
  EAttribute getMeshExtent2D_MaximumY();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool <em>Path Planner Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Planner Tool</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool
	 * @generated
	 */
	EClass getPathPlannerTool();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isBusy <em>Busy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Busy</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isBusy()
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	EAttribute getPathPlannerTool_Busy();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isAutoPathPlanEnabled <em>Auto Path Plan Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Path Plan Enabled</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#isAutoPathPlanEnabled()
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	EAttribute getPathPlannerTool_AutoPathPlanEnabled();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getMeshLayer <em>Mesh Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getMeshLayer()
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	EReference getPathPlannerTool_MeshLayer();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlanner <em>Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path Planner</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlanner()
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	EReference getPathPlannerTool_PathPlanner();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPlannedPath <em>Planned Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planned Path</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPlannedPath()
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	EReference getPathPlannerTool_PlannedPath();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlannerToolNode <em>Path Planner Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Planner Tool Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#getPathPlannerToolNode()
	 * @see #getPathPlannerTool()
	 * @generated
	 */
	EReference getPathPlannerTool_PathPlannerToolNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#planPath() <em>Plan Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Plan Path</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool#planPath()
	 * @generated
	 */
	EOperation getPathPlannerTool__PlanPath();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode <em>Path Planner Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Planner Tool Node</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode
	 * @generated
	 */
	EClass getPathPlannerToolNode();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode#getPathPlannerTool <em>Path Planner Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Path Planner Tool</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode#getPathPlannerTool()
	 * @see #getPathPlannerToolNode()
	 * @generated
	 */
	EReference getPathPlannerToolNode_PathPlannerTool();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool <em>Vehicle Path Planner Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Path Planner Tool</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool
	 * @generated
	 */
	EClass getVehiclePathPlannerTool();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.VehiclePathPlannerTool#getVariable()
	 * @see #getVehiclePathPlannerTool()
	 * @generated
	 */
	EReference getVehiclePathPlannerTool_Variable();

		/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode <em>ZCorrection Mode</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ZCorrection Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode
	 * @generated
	 */
  EEnum getZCorrectionMode();

  /**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode <em>Orientation Correction Mode</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation Correction Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode
	 * @generated
	 */
  EEnum getOrientationCorrectionMode();

  /**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode <em>Wheel Contact Mode</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wheel Contact Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode
	 * @generated
	 */
  EEnum getWheelContactMode();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.vehicle.Segment2D <em>Segment2 D</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Segment2 D</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Segment2D
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.vehicle.Segment2D"
	 * @generated
	 */
  EDataType getSegment2D();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.vehicle.Line3d <em>Line3d</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Line3d</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Line3d
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.vehicle.Line3d"
	 * @generated
	 */
  EDataType getLine3d();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.vehicle.Plane <em>Plane</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plane</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.Plane
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.vehicle.Plane"
	 * @generated
	 */
  EDataType getPlane();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile <em>Terrain Profile</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Terrain Profile</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile"
	 * @generated
	 */
  EDataType getTerrainProfile();

  /**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider <em>Closest Neighbour Iterator Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Closest Neighbour Iterator Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider
	 * @model instanceClass="ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider"
	 * @generated
	 */
  EDataType getClosestNeighbourIteratorProvider();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsVehicleFactory getApogyAddonsVehicleFactory();

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
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
  EDataType getMap();

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
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
  EDataType getSortedSet();

  /**
	 * Returns the meta object for data type '{@link java.util.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Iterator</em>'.
	 * @see java.util.Iterator
	 * @model instanceClass="java.util.Iterator" typeParameters="T"
	 * @generated
	 */
  EDataType getIterator();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl <em>Vehicle Pose Corrector</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePoseCorrectorImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getVehiclePoseCorrector()
		 * @generated
		 */
    EClass VEHICLE_POSE_CORRECTOR = eINSTANCE.getVehiclePoseCorrector();

    /**
		 * The meta object literal for the '<em><b>Initializing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VEHICLE_POSE_CORRECTOR__INITIALIZING = eINSTANCE.getVehiclePoseCorrector_Initializing();

    /**
		 * The meta object literal for the '<em><b>Meshes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VEHICLE_POSE_CORRECTOR__MESHES = eINSTANCE.getVehiclePoseCorrector_Meshes();

    /**
		 * The meta object literal for the '<em><b>Contact Bodies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VEHICLE_POSE_CORRECTOR__CONTACT_BODIES = eINSTANCE.getVehiclePoseCorrector_ContactBodies();

    /**
		 * The meta object literal for the '<em><b>ZCorrection Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VEHICLE_POSE_CORRECTOR__ZCORRECTION_MODE = eINSTANCE.getVehiclePoseCorrector_ZCorrectionMode();

    /**
		 * The meta object literal for the '<em><b>ZCorrection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VEHICLE_POSE_CORRECTOR__ZCORRECTION = eINSTANCE.getVehiclePoseCorrector_ZCorrection();

    /**
		 * The meta object literal for the '<em><b>Orientation Correction Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION_MODE = eINSTANCE.getVehiclePoseCorrector_OrientationCorrectionMode();

    /**
		 * The meta object literal for the '<em><b>Orientation Correction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VEHICLE_POSE_CORRECTOR__ORIENTATION_CORRECTION = eINSTANCE.getVehiclePoseCorrector_OrientationCorrection();

    /**
		 * The meta object literal for the '<em><b>Contact Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VEHICLE_POSE_CORRECTOR__CONTACT_PROVIDER = eINSTANCE.getVehiclePoseCorrector_ContactProvider();

    /**
		 * The meta object literal for the '<em><b>Re Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation VEHICLE_POSE_CORRECTOR___RE_INITIALIZE = eINSTANCE.getVehiclePoseCorrector__ReInitialize();

    /**
		 * The meta object literal for the '<em><b>Get Mesh Extent2 D</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation VEHICLE_POSE_CORRECTOR___GET_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH = eINSTANCE.getVehiclePoseCorrector__GetMeshExtent2D__CartesianTriangularMesh();

    /**
		 * The meta object literal for the '<em><b>Get Closest Neighbour Iterator Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation VEHICLE_POSE_CORRECTOR___GET_CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER__CARTESIANTRIANGULARMESH = eINSTANCE.getVehiclePoseCorrector__GetClosestNeighbourIteratorProvider__CartesianTriangularMesh();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshNodeEntryImpl <em>Mesh Node Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshNodeEntryImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getMeshNodeEntry()
		 * @generated
		 */
		EClass MESH_NODE_ENTRY = eINSTANCE.getMeshNodeEntry();

				/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_NODE_ENTRY__NODE = eINSTANCE.getMeshNodeEntry_Node();

				/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH_NODE_ENTRY__MESH = eINSTANCE.getMeshNodeEntry_Mesh();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ContactProviderImpl <em>Contact Provider</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ContactProviderImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getContactProvider()
		 * @generated
		 */
    EClass CONTACT_PROVIDER = eINSTANCE.getContactProvider();

    /**
		 * The meta object literal for the '<em><b>Vehicle Pose Corrector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CONTACT_PROVIDER__VEHICLE_POSE_CORRECTOR = eINSTANCE.getContactProvider_VehiclePoseCorrector();

    /**
		 * The meta object literal for the '<em><b>Extract Contact Bodies</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation CONTACT_PROVIDER___EXTRACT_CONTACT_BODIES = eINSTANCE.getContactProvider__ExtractContactBodies();

    /**
		 * The meta object literal for the '<em><b>Update Contact Points</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation CONTACT_PROVIDER___UPDATE_CONTACT_POINTS__MATRIX4X4_MAP = eINSTANCE.getContactProvider__UpdateContactPoints__Matrix4x4_Map();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelImpl <em>Wheel</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheel()
		 * @generated
		 */
    EClass WHEEL = eINSTANCE.getWheel();

    /**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WHEEL__RADIUS = eINSTANCE.getWheel_Radius();

    /**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEEL__LENGTH = eINSTANCE.getWheel_Length();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterImpl <em>Thruster</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getThruster()
		 * @generated
		 */
    EClass THRUSTER = eINSTANCE.getThruster();

    /**
		 * The meta object literal for the '<em><b>Minimum Thrust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRUSTER__MINIMUM_THRUST = eINSTANCE.getThruster_MinimumThrust();

				/**
		 * The meta object literal for the '<em><b>Maximum Thrust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRUSTER__MAXIMUM_THRUST = eINSTANCE.getThruster_MaximumThrust();

				/**
		 * The meta object literal for the '<em><b>Current Thrust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRUSTER__CURRENT_THRUST = eINSTANCE.getThruster_CurrentThrust();

				/**
		 * The meta object literal for the '<em><b>Plume Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute THRUSTER__PLUME_ANGLE = eINSTANCE.getThruster_PlumeAngle();

    /**
		 * The meta object literal for the '<em><b>Thrust Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute THRUSTER__THRUST_LEVEL = eINSTANCE.getThruster_ThrustLevel();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterBindingImpl <em>Thruster Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ThrusterBindingImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getThrusterBinding()
		 * @generated
		 */
    EClass THRUSTER_BINDING = eINSTANCE.getThrusterBinding();

    /**
		 * The meta object literal for the '<em><b>Thruster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference THRUSTER_BINDING__THRUSTER = eINSTANCE.getThrusterBinding_Thruster();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelContactProviderImpl <em>Wheel Contact Provider</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelContactProviderImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheelContactProvider()
		 * @generated
		 */
    EClass WHEEL_CONTACT_PROVIDER = eINSTANCE.getWheelContactProvider();

    /**
		 * The meta object literal for the '<em><b>Contact Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute WHEEL_CONTACT_PROVIDER__CONTACT_MODE = eINSTANCE.getWheelContactProvider_ContactMode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootImpl <em>Lander Spherical Foot</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getLanderSphericalFoot()
		 * @generated
		 */
    EClass LANDER_SPHERICAL_FOOT = eINSTANCE.getLanderSphericalFoot();

    /**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER_SPHERICAL_FOOT__RADIUS = eINSTANCE.getLanderSphericalFoot_Radius();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootContactProviderImpl <em>Lander Spherical Foot Contact Provider</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.LanderSphericalFootContactProviderImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getLanderSphericalFootContactProvider()
		 * @generated
		 */
    EClass LANDER_SPHERICAL_FOOT_CONTACT_PROVIDER = eINSTANCE.getLanderSphericalFootContactProvider();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehicleFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehicleFacadeImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getApogyAddonsVehicleFacade()
		 * @generated
		 */
		EClass APOGY_ADDONS_VEHICLE_FACADE = eINSTANCE.getApogyAddonsVehicleFacade();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelVehicleUtilitiesImpl <em>Wheel Vehicle Utilities</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.WheelVehicleUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheelVehicleUtilities()
		 * @generated
		 */
    EClass WHEEL_VEHICLE_UTILITIES = eINSTANCE.getWheelVehicleUtilities();

    /**
		 * The meta object literal for the '<em><b>Get Wheel Center Point</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_SEGMENT2D = eINSTANCE.getWheelVehicleUtilities__GetWheelCenterPoint__double_double_Segment2D();

    /**
		 * The meta object literal for the '<em><b>Get Wheel Center Point</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___GET_WHEEL_CENTER_POINT__DOUBLE_DOUBLE_TERRAINPROFILE = eINSTANCE.getWheelVehicleUtilities__GetWheelCenterPoint__double_double_TerrainProfile();

    /**
		 * The meta object literal for the '<em><b>Find Terrain Profile</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___FIND_TERRAIN_PROFILE__CARTESIANTRIANGULARMESH_PLANE = eINSTANCE.getWheelVehicleUtilities__FindTerrainProfile__CartesianTriangularMesh_Plane();

    /**
		 * The meta object literal for the '<em><b>Find Intersection</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___FIND_INTERSECTION__PLANE_LINE3D = eINSTANCE.getWheelVehicleUtilities__FindIntersection__Plane_Line3d();

    /**
		 * The meta object literal for the '<em><b>Is Point On Segment</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___IS_POINT_ON_SEGMENT__POINT2D_SEGMENT2D = eINSTANCE.getWheelVehicleUtilities__IsPointOnSegment__Point2d_Segment2D();

    /**
		 * The meta object literal for the '<em><b>Find Mesh Extent2 D</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___FIND_MESH_EXTENT2_D__CARTESIANTRIANGULARMESH = eINSTANCE.getWheelVehicleUtilities__FindMeshExtent2D__CartesianTriangularMesh();

    /**
		 * The meta object literal for the '<em><b>Is Within</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___IS_WITHIN__POINT3D_MESHEXTENT2D = eINSTANCE.getWheelVehicleUtilities__IsWithin__Point3d_MeshExtent2D();

    /**
		 * The meta object literal for the '<em><b>Find Best Fit Plane</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation WHEEL_VEHICLE_UTILITIES___FIND_BEST_FIT_PLANE__LIST = eINSTANCE.getWheelVehicleUtilities__FindBestFitPlane__List();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl <em>Mesh Extent2 D</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getMeshExtent2D()
		 * @generated
		 */
    EClass MESH_EXTENT2_D = eINSTANCE.getMeshExtent2D();

    /**
		 * The meta object literal for the '<em><b>Minimum X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MESH_EXTENT2_D__MINIMUM_X = eINSTANCE.getMeshExtent2D_MinimumX();

    /**
		 * The meta object literal for the '<em><b>Minimum Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MESH_EXTENT2_D__MINIMUM_Y = eINSTANCE.getMeshExtent2D_MinimumY();

    /**
		 * The meta object literal for the '<em><b>Maximum X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MESH_EXTENT2_D__MAXIMUM_X = eINSTANCE.getMeshExtent2D_MaximumX();

    /**
		 * The meta object literal for the '<em><b>Maximum Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MESH_EXTENT2_D__MAXIMUM_Y = eINSTANCE.getMeshExtent2D_MaximumY();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolImpl <em>Path Planner Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPathPlannerTool()
		 * @generated
		 */
		EClass PATH_PLANNER_TOOL = eINSTANCE.getPathPlannerTool();

				/**
		 * The meta object literal for the '<em><b>Busy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PLANNER_TOOL__BUSY = eINSTANCE.getPathPlannerTool_Busy();

				/**
		 * The meta object literal for the '<em><b>Auto Path Plan Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED = eINSTANCE.getPathPlannerTool_AutoPathPlanEnabled();

				/**
		 * The meta object literal for the '<em><b>Mesh Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PLANNER_TOOL__MESH_LAYER = eINSTANCE.getPathPlannerTool_MeshLayer();

				/**
		 * The meta object literal for the '<em><b>Path Planner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PLANNER_TOOL__PATH_PLANNER = eINSTANCE.getPathPlannerTool_PathPlanner();

				/**
		 * The meta object literal for the '<em><b>Planned Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PLANNER_TOOL__PLANNED_PATH = eINSTANCE.getPathPlannerTool_PlannedPath();

				/**
		 * The meta object literal for the '<em><b>Path Planner Tool Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE = eINSTANCE.getPathPlannerTool_PathPlannerToolNode();

				/**
		 * The meta object literal for the '<em><b>Plan Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_PLANNER_TOOL___PLAN_PATH = eINSTANCE.getPathPlannerTool__PlanPath();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolNodeImpl <em>Path Planner Tool Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.PathPlannerToolNodeImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPathPlannerToolNode()
		 * @generated
		 */
		EClass PATH_PLANNER_TOOL_NODE = eINSTANCE.getPathPlannerToolNode();

				/**
		 * The meta object literal for the '<em><b>Path Planner Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL = eINSTANCE.getPathPlannerToolNode_PathPlannerTool();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePathPlannerToolImpl <em>Vehicle Path Planner Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.VehiclePathPlannerToolImpl
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getVehiclePathPlannerTool()
		 * @generated
		 */
		EClass VEHICLE_PATH_PLANNER_TOOL = eINSTANCE.getVehiclePathPlannerTool();

				/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_PATH_PLANNER_TOOL__VARIABLE = eINSTANCE.getVehiclePathPlannerTool_Variable();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode <em>ZCorrection Mode</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ZCorrectionMode
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getZCorrectionMode()
		 * @generated
		 */
    EEnum ZCORRECTION_MODE = eINSTANCE.getZCorrectionMode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode <em>Orientation Correction Mode</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.OrientationCorrectionMode
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getOrientationCorrectionMode()
		 * @generated
		 */
    EEnum ORIENTATION_CORRECTION_MODE = eINSTANCE.getOrientationCorrectionMode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode <em>Wheel Contact Mode</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.WheelContactMode
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getWheelContactMode()
		 * @generated
		 */
    EEnum WHEEL_CONTACT_MODE = eINSTANCE.getWheelContactMode();

    /**
		 * The meta object literal for the '<em>Segment2 D</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.Segment2D
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getSegment2D()
		 * @generated
		 */
    EDataType SEGMENT2_D = eINSTANCE.getSegment2D();

    /**
		 * The meta object literal for the '<em>Line3d</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.Line3d
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getLine3d()
		 * @generated
		 */
    EDataType LINE3D = eINSTANCE.getLine3d();

    /**
		 * The meta object literal for the '<em>Plane</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.Plane
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPlane()
		 * @generated
		 */
    EDataType PLANE = eINSTANCE.getPlane();

    /**
		 * The meta object literal for the '<em>Terrain Profile</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.TerrainProfile
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getTerrainProfile()
		 * @generated
		 */
    EDataType TERRAIN_PROFILE = eINSTANCE.getTerrainProfile();

    /**
		 * The meta object literal for the '<em>Closest Neighbour Iterator Provider</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.ClosestNeighbourIteratorProvider
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getClosestNeighbourIteratorProvider()
		 * @generated
		 */
    EDataType CLOSEST_NEIGHBOUR_ITERATOR_PROVIDER = eINSTANCE.getClosestNeighbourIteratorProvider();

    /**
		 * The meta object literal for the '<em>Point2d</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Point2d
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPoint2d()
		 * @generated
		 */
    EDataType POINT2D = eINSTANCE.getPoint2d();

    /**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getPoint3d()
		 * @generated
		 */
    EDataType POINT3D = eINSTANCE.getPoint3d();

    /**
		 * The meta object literal for the '<em>Vector3d</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getVector3d()
		 * @generated
		 */
    EDataType VECTOR3D = eINSTANCE.getVector3d();

    /**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getMap()
		 * @generated
		 */
    EDataType MAP = eINSTANCE.getMap();

    /**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getList()
		 * @generated
		 */
    EDataType LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

    /**
		 * The meta object literal for the '<em>Iterator</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Iterator
		 * @see ca.gc.asc_csa.apogy.addons.vehicle.impl.ApogyAddonsVehiclePackageImpl#getIterator()
		 * @generated
		 */
    EDataType ITERATOR = eINSTANCE.getIterator();

  }

} //ApogyAddonsVehiclePackage
