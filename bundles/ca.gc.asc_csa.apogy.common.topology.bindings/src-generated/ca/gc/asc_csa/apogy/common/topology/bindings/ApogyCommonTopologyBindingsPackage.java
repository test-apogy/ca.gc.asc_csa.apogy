package ca.gc.asc_csa.apogy.common.topology.bindings;
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
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonTopologyBindings' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonTopologyBindings' complianceLevel='6.0' modelDirectory='/ca.gc.asc_csa.apogy.common.topology.bindings/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.topology.bindings.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.topology'"
 * @generated
 */
public interface ApogyCommonTopologyBindingsPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "bindings";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.common.topology.bindings";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "bindings";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCommonTopologyBindingsPackage eINSTANCE = ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.AbstractTopologyBindingImpl <em>Abstract Topology Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.AbstractTopologyBindingImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getAbstractTopologyBinding()
	 * @generated
	 */
  int ABSTRACT_TOPOLOGY_BINDING = 0;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING__BINDED = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING__NAME = 2;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING__SOURCE = 3;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE = 4;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER = 5;

  /**
	 * The number of structural features of the '<em>Abstract Topology Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT = 6;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING___BIND = 0;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING___UNBIND = 1;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP = 2;

  /**
	 * The number of operations of the '<em>Abstract Topology Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT = 3;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.RotationBindingImpl <em>Rotation Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.RotationBindingImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getRotationBinding()
	 * @generated
	 */
  int ROTATION_BINDING = 1;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__BINDED = ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__DESCRIPTION = ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__NAME = ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__SOURCE = ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__FEATURE_NODE = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__FEATURE_NODE_ADAPTER = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Rotation Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__ROTATION_NODE = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Rotation Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__ROTATION_AXIS = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Rotation Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING_FEATURE_COUNT = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING___BIND = ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING___UNBIND = ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING___CLONE__MAP = ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

  /**
	 * The number of operations of the '<em>Rotation Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING_OPERATION_COUNT = ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.TranslationBindingImpl <em>Translation Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.TranslationBindingImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getTranslationBinding()
	 * @generated
	 */
  int TRANSLATION_BINDING = 2;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__BINDED = ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__DESCRIPTION = ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__NAME = ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__SOURCE = ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__FEATURE_NODE = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__FEATURE_NODE_ADAPTER = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Position Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__POSITION_NODE = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Translation Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING__TRANSLATION_AXIS = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Translation Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING_FEATURE_COUNT = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING___BIND = ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING___UNBIND = ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING___CLONE__MAP = ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

  /**
	 * The number of operations of the '<em>Translation Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSLATION_BINDING_OPERATION_COUNT = ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.TransformMatrixBindingImpl <em>Transform Matrix Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.TransformMatrixBindingImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getTransformMatrixBinding()
	 * @generated
	 */
  int TRANSFORM_MATRIX_BINDING = 3;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING__BINDED = ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING__DESCRIPTION = ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING__NAME = ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING__SOURCE = ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING__FEATURE_NODE = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING__FEATURE_NODE_ADAPTER = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Transform Matrix Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING_FEATURE_COUNT = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING___BIND = ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING___UNBIND = ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING___CLONE__MAP = ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

  /**
	 * The number of operations of the '<em>Transform Matrix Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRANSFORM_MATRIX_BINDING_OPERATION_COUNT = ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationSwitchBindingImpl <em>Enumeration Switch Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationSwitchBindingImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getEnumerationSwitchBinding()
	 * @generated
	 */
  int ENUMERATION_SWITCH_BINDING = 4;

  /**
	 * The feature id for the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__BINDED = ABSTRACT_TOPOLOGY_BINDING__BINDED;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__DESCRIPTION = ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__NAME = ABSTRACT_TOPOLOGY_BINDING__NAME;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__SOURCE = ABSTRACT_TOPOLOGY_BINDING__SOURCE;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__FEATURE_NODE = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__FEATURE_NODE_ADAPTER = ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER;

  /**
	 * The feature id for the '<em><b>Parent Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__PARENT_NODE = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__CASES = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Active Case</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING__ACTIVE_CASE = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Enumeration Switch Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING_FEATURE_COUNT = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING___BIND = ABSTRACT_TOPOLOGY_BINDING___BIND;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING___UNBIND = ABSTRACT_TOPOLOGY_BINDING___UNBIND;

  /**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING___CLONE__MAP = ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP;

  /**
	 * The number of operations of the '<em>Enumeration Switch Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_SWITCH_BINDING_OPERATION_COUNT = ABSTRACT_TOPOLOGY_BINDING_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationCaseImpl <em>Enumeration Case</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationCaseImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getEnumerationCase()
	 * @generated
	 */
  int ENUMERATION_CASE = 5;

  /**
	 * The feature id for the '<em><b>Enumeration Literals</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_CASE__ENUMERATION_LITERALS = 0;

  /**
	 * The feature id for the '<em><b>Topology Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_CASE__TOPOLOGY_ROOT = 1;

  /**
	 * The number of structural features of the '<em>Enumeration Case</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_CASE_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Enumeration Case</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENUMERATION_CASE_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsListImpl <em>Bindings List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsListImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getBindingsList()
	 * @generated
	 */
  int BINDINGS_LIST = 6;

  /**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_LIST__BINDINGS = 0;

  /**
	 * The number of structural features of the '<em>Bindings List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_LIST_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Bindings List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_LIST_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.FeatureRootsListImpl <em>Feature Roots List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.FeatureRootsListImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getFeatureRootsList()
	 * @generated
	 */
  int FEATURE_ROOTS_LIST = 7;

  /**
	 * The feature id for the '<em><b>Feature Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_ROOTS_LIST__FEATURE_ROOTS = 0;

  /**
	 * The number of structural features of the '<em>Feature Roots List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_ROOTS_LIST_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Feature Roots List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_ROOTS_LIST_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsSetImpl <em>Bindings Set</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsSetImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getBindingsSet()
	 * @generated
	 */
  int BINDINGS_SET = 8;

  /**
	 * The feature id for the '<em><b>Feature Roots List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_SET__FEATURE_ROOTS_LIST = 0;

  /**
	 * The feature id for the '<em><b>Bindings List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_SET__BINDINGS_LIST = 1;

  /**
	 * The number of structural features of the '<em>Bindings Set</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_SET_FEATURE_COUNT = 2;

  /**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_SET___BIND = 0;

  /**
	 * The operation id for the '<em>Unbind</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_SET___UNBIND = 1;

  /**
	 * The number of operations of the '<em>Bindings Set</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BINDINGS_SET_OPERATION_COUNT = 2;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getApogyCommonTopologyBindingsFacade()
	 * @generated
	 */
	int APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE = 9;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP = 0;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE_OPERATION_COUNT = 1;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.Axis <em>Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.Axis
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 10;

		/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getMap()
	 * @generated
	 */
  int MAP = 11;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding <em>Abstract Topology Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Topology Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding
	 * @generated
	 */
  EClass getAbstractTopologyBinding();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#isBinded <em>Binded</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binded</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#isBinded()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EAttribute getAbstractTopologyBinding_Binded();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getDescription()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EAttribute getAbstractTopologyBinding_Description();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getName()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EAttribute getAbstractTopologyBinding_Name();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getSource()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EReference getAbstractTopologyBinding_Source();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getFeatureNode()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EReference getAbstractTopologyBinding_FeatureNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getFeatureNodeAdapter <em>Feature Node Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Node Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getFeatureNodeAdapter()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EReference getAbstractTopologyBinding_FeatureNodeAdapter();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#bind() <em>Bind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#bind()
	 * @generated
	 */
  EOperation getAbstractTopologyBinding__Bind();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#unbind() <em>Unbind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unbind</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#unbind()
	 * @generated
	 */
  EOperation getAbstractTopologyBinding__Unbind();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#clone(java.util.Map) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#clone(java.util.Map)
	 * @generated
	 */
  EOperation getAbstractTopologyBinding__Clone__Map();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding <em>Rotation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding
	 * @generated
	 */
  EClass getRotationBinding();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationNode <em>Rotation Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rotation Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationNode()
	 * @see #getRotationBinding()
	 * @generated
	 */
  EReference getRotationBinding_RotationNode();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationAxis <em>Rotation Axis</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Axis</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding#getRotationAxis()
	 * @see #getRotationBinding()
	 * @generated
	 */
  EAttribute getRotationBinding_RotationAxis();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding <em>Translation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding
	 * @generated
	 */
  EClass getTranslationBinding();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getTranslationAxis <em>Translation Axis</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation Axis</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getTranslationAxis()
	 * @see #getTranslationBinding()
	 * @generated
	 */
  EAttribute getTranslationBinding_TranslationAxis();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getPositionNode <em>Position Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getPositionNode()
	 * @see #getTranslationBinding()
	 * @generated
	 */
  EReference getTranslationBinding_PositionNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding <em>Transform Matrix Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Matrix Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding
	 * @generated
	 */
  EClass getTransformMatrixBinding();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding#getTransformNode <em>Transform Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding#getTransformNode()
	 * @see #getTransformMatrixBinding()
	 * @generated
	 */
  EReference getTransformMatrixBinding_TransformNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding <em>Enumeration Switch Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Switch Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding
	 * @generated
	 */
  EClass getEnumerationSwitchBinding();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getParentNode()
	 * @see #getEnumerationSwitchBinding()
	 * @generated
	 */
  EReference getEnumerationSwitchBinding_ParentNode();

  /**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getCases()
	 * @see #getEnumerationSwitchBinding()
	 * @generated
	 */
  EReference getEnumerationSwitchBinding_Cases();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getActiveCase <em>Active Case</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Case</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getActiveCase()
	 * @see #getEnumerationSwitchBinding()
	 * @generated
	 */
  EReference getEnumerationSwitchBinding_ActiveCase();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase <em>Enumeration Case</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Case</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase
	 * @generated
	 */
  EClass getEnumerationCase();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase#getEnumerationLiterals <em>Enumeration Literals</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enumeration Literals</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase#getEnumerationLiterals()
	 * @see #getEnumerationCase()
	 * @generated
	 */
  EReference getEnumerationCase_EnumerationLiterals();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase#getTopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Root</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase#getTopologyRoot()
	 * @see #getEnumerationCase()
	 * @generated
	 */
  EReference getEnumerationCase_TopologyRoot();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList <em>Bindings List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindings List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList
	 * @generated
	 */
  EClass getBindingsList();

  /**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList#getBindings()
	 * @see #getBindingsList()
	 * @generated
	 */
  EReference getBindingsList_Bindings();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList <em>Feature Roots List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Roots List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList
	 * @generated
	 */
  EClass getFeatureRootsList();

  /**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList#getFeatureRoots <em>Feature Roots</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Roots</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList#getFeatureRoots()
	 * @see #getFeatureRootsList()
	 * @generated
	 */
  EReference getFeatureRootsList_FeatureRoots();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet <em>Bindings Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindings Set</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet
	 * @generated
	 */
  EClass getBindingsSet();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getFeatureRootsList <em>Feature Roots List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Roots List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getFeatureRootsList()
	 * @see #getBindingsSet()
	 * @generated
	 */
  EReference getBindingsSet_FeatureRootsList();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getBindingsList <em>Bindings List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindings List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getBindingsList()
	 * @see #getBindingsSet()
	 * @generated
	 */
  EReference getBindingsSet_BindingsList();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#bind() <em>Bind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#bind()
	 * @generated
	 */
  EOperation getBindingsSet__Bind();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#unbind() <em>Unbind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unbind</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#unbind()
	 * @generated
	 */
  EOperation getBindingsSet__Unbind();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade
	 * @generated
	 */
	EClass getApogyCommonTopologyBindingsFacade();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade#copy(ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding, java.util.Map) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade#copy(ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding, java.util.Map)
	 * @generated
	 */
	EOperation getApogyCommonTopologyBindingsFacade__Copy__AbstractTopologyBinding_Map();

		/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.topology.bindings.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.Axis
	 * @generated
	 */
	EEnum getAxis();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonTopologyBindingsFactory getApogyCommonTopologyBindingsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.AbstractTopologyBindingImpl <em>Abstract Topology Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.AbstractTopologyBindingImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getAbstractTopologyBinding()
		 * @generated
		 */
    EClass ABSTRACT_TOPOLOGY_BINDING = eINSTANCE.getAbstractTopologyBinding();

    /**
		 * The meta object literal for the '<em><b>Binded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TOPOLOGY_BINDING__BINDED = eINSTANCE.getAbstractTopologyBinding_Binded();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION = eINSTANCE.getAbstractTopologyBinding_Description();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_TOPOLOGY_BINDING__NAME = eINSTANCE.getAbstractTopologyBinding_Name();

    /**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_TOPOLOGY_BINDING__SOURCE = eINSTANCE.getAbstractTopologyBinding_Source();

    /**
		 * The meta object literal for the '<em><b>Feature Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE = eINSTANCE.getAbstractTopologyBinding_FeatureNode();

    /**
		 * The meta object literal for the '<em><b>Feature Node Adapter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER = eINSTANCE.getAbstractTopologyBinding_FeatureNodeAdapter();

    /**
		 * The meta object literal for the '<em><b>Bind</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_TOPOLOGY_BINDING___BIND = eINSTANCE.getAbstractTopologyBinding__Bind();

    /**
		 * The meta object literal for the '<em><b>Unbind</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_TOPOLOGY_BINDING___UNBIND = eINSTANCE.getAbstractTopologyBinding__Unbind();

    /**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP = eINSTANCE.getAbstractTopologyBinding__Clone__Map();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.RotationBindingImpl <em>Rotation Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.RotationBindingImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getRotationBinding()
		 * @generated
		 */
    EClass ROTATION_BINDING = eINSTANCE.getRotationBinding();

    /**
		 * The meta object literal for the '<em><b>Rotation Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ROTATION_BINDING__ROTATION_NODE = eINSTANCE.getRotationBinding_RotationNode();

    /**
		 * The meta object literal for the '<em><b>Rotation Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROTATION_BINDING__ROTATION_AXIS = eINSTANCE.getRotationBinding_RotationAxis();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.TranslationBindingImpl <em>Translation Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.TranslationBindingImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getTranslationBinding()
		 * @generated
		 */
    EClass TRANSLATION_BINDING = eINSTANCE.getTranslationBinding();

    /**
		 * The meta object literal for the '<em><b>Translation Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TRANSLATION_BINDING__TRANSLATION_AXIS = eINSTANCE.getTranslationBinding_TranslationAxis();

    /**
		 * The meta object literal for the '<em><b>Position Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TRANSLATION_BINDING__POSITION_NODE = eINSTANCE.getTranslationBinding_PositionNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.TransformMatrixBindingImpl <em>Transform Matrix Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.TransformMatrixBindingImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getTransformMatrixBinding()
		 * @generated
		 */
    EClass TRANSFORM_MATRIX_BINDING = eINSTANCE.getTransformMatrixBinding();

    /**
		 * The meta object literal for the '<em><b>Transform Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE = eINSTANCE.getTransformMatrixBinding_TransformNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationSwitchBindingImpl <em>Enumeration Switch Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationSwitchBindingImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getEnumerationSwitchBinding()
		 * @generated
		 */
    EClass ENUMERATION_SWITCH_BINDING = eINSTANCE.getEnumerationSwitchBinding();

    /**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENUMERATION_SWITCH_BINDING__PARENT_NODE = eINSTANCE.getEnumerationSwitchBinding_ParentNode();

    /**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENUMERATION_SWITCH_BINDING__CASES = eINSTANCE.getEnumerationSwitchBinding_Cases();

    /**
		 * The meta object literal for the '<em><b>Active Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENUMERATION_SWITCH_BINDING__ACTIVE_CASE = eINSTANCE.getEnumerationSwitchBinding_ActiveCase();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationCaseImpl <em>Enumeration Case</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationCaseImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getEnumerationCase()
		 * @generated
		 */
    EClass ENUMERATION_CASE = eINSTANCE.getEnumerationCase();

    /**
		 * The meta object literal for the '<em><b>Enumeration Literals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENUMERATION_CASE__ENUMERATION_LITERALS = eINSTANCE.getEnumerationCase_EnumerationLiterals();

    /**
		 * The meta object literal for the '<em><b>Topology Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ENUMERATION_CASE__TOPOLOGY_ROOT = eINSTANCE.getEnumerationCase_TopologyRoot();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsListImpl <em>Bindings List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsListImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getBindingsList()
		 * @generated
		 */
    EClass BINDINGS_LIST = eINSTANCE.getBindingsList();

    /**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BINDINGS_LIST__BINDINGS = eINSTANCE.getBindingsList_Bindings();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.FeatureRootsListImpl <em>Feature Roots List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.FeatureRootsListImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getFeatureRootsList()
		 * @generated
		 */
    EClass FEATURE_ROOTS_LIST = eINSTANCE.getFeatureRootsList();

    /**
		 * The meta object literal for the '<em><b>Feature Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FEATURE_ROOTS_LIST__FEATURE_ROOTS = eINSTANCE.getFeatureRootsList_FeatureRoots();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsSetImpl <em>Bindings Set</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsSetImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getBindingsSet()
		 * @generated
		 */
    EClass BINDINGS_SET = eINSTANCE.getBindingsSet();

    /**
		 * The meta object literal for the '<em><b>Feature Roots List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BINDINGS_SET__FEATURE_ROOTS_LIST = eINSTANCE.getBindingsSet_FeatureRootsList();

    /**
		 * The meta object literal for the '<em><b>Bindings List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference BINDINGS_SET__BINDINGS_LIST = eINSTANCE.getBindingsSet_BindingsList();

    /**
		 * The meta object literal for the '<em><b>Bind</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation BINDINGS_SET___BIND = eINSTANCE.getBindingsSet__Bind();

    /**
		 * The meta object literal for the '<em><b>Unbind</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation BINDINGS_SET___UNBIND = eINSTANCE.getBindingsSet__Unbind();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getApogyCommonTopologyBindingsFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE = eINSTANCE.getApogyCommonTopologyBindingsFacade();

				/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP = eINSTANCE.getApogyCommonTopologyBindingsFacade__Copy__AbstractTopologyBinding_Map();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.Axis <em>Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.Axis
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getAxis()
		 * @generated
		 */
		EEnum AXIS = eINSTANCE.getAxis();

				/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsPackageImpl#getMap()
		 * @generated
		 */
    EDataType MAP = eINSTANCE.getMap();

  }

} //ApogyCommonTopologyBindingsPackage
