/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings;

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
 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='TopologyBindings' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)' modelName='TopologyBindings' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.common.topology.bindings/src-generated' editDirectory='/org.eclipse.symphony.common.topology.bindings.edit/src-generated' basePackage='ca.gc.asc_csa.topology'"
 * @generated
 */
public interface TopologyBindingsPackage extends EPackage
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
  String eNS_URI = "org.eclipse.symphony.common.topology.bindings";

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
  TopologyBindingsPackage eINSTANCE = org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl <em>Abstract Topology Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getAbstractTopologyBinding()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.RotationBindingImpl <em>Rotation Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.RotationBindingImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getRotationBinding()
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
	 * The feature id for the '<em><b>Rotation Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING__ROTATION_UNITS = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Rotation Binding</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROTATION_BINDING_FEATURE_COUNT = ABSTRACT_TOPOLOGY_BINDING_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl <em>Translation Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getTranslationBinding()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.TransformMatrixBindingImpl <em>Transform Matrix Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TransformMatrixBindingImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getTransformMatrixBinding()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.EnumerationSwitchBindingImpl <em>Enumeration Switch Binding</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.EnumerationSwitchBindingImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getEnumerationSwitchBinding()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.EnumerationCaseImpl <em>Enumeration Case</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.EnumerationCaseImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getEnumerationCase()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.BindingsListImpl <em>Bindings List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.BindingsListImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getBindingsList()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.FeatureRootsListImpl <em>Feature Roots List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.FeatureRootsListImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getFeatureRootsList()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.BindingsSetImpl <em>Bindings Set</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.BindingsSetImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getBindingsSet()
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
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsFacadeImpl
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getTopologyBindingsFacade()
	 * @generated
	 */
  int TOPOLOGY_BINDINGS_FACADE = 9;

  /**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOPOLOGY_BINDINGS_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP = 0;

  /**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TOPOLOGY_BINDINGS_FACADE_OPERATION_COUNT = 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.AXIS <em>AXIS</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.AXIS
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getAXIS()
	 * @generated
	 */
  int AXIS = 10;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.bindings.ANGLE_UNITS <em>ANGLE UNITS</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.bindings.ANGLE_UNITS
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getANGLE_UNITS()
	 * @generated
	 */
  int ANGLE_UNITS = 11;


  /**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getMap()
	 * @generated
	 */
  int MAP = 12;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding <em>Abstract Topology Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Topology Binding</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding
	 * @generated
	 */
  EClass getAbstractTopologyBinding();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#isBinded <em>Binded</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binded</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#isBinded()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EAttribute getAbstractTopologyBinding_Binded();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getDescription()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EAttribute getAbstractTopologyBinding_Description();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getName()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EAttribute getAbstractTopologyBinding_Name();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getSource()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EReference getAbstractTopologyBinding_Source();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Node</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getFeatureNode()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EReference getAbstractTopologyBinding_FeatureNode();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getFeatureNodeAdapter <em>Feature Node Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Node Adapter</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#getFeatureNodeAdapter()
	 * @see #getAbstractTopologyBinding()
	 * @generated
	 */
  EReference getAbstractTopologyBinding_FeatureNodeAdapter();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#bind() <em>Bind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind</em>' operation.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#bind()
	 * @generated
	 */
  EOperation getAbstractTopologyBinding__Bind();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#unbind() <em>Unbind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unbind</em>' operation.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#unbind()
	 * @generated
	 */
  EOperation getAbstractTopologyBinding__Unbind();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#clone(java.util.Map) <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding#clone(java.util.Map)
	 * @generated
	 */
  EOperation getAbstractTopologyBinding__Clone__Map();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.RotationBinding <em>Rotation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation Binding</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.RotationBinding
	 * @generated
	 */
  EClass getRotationBinding();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.RotationBinding#getRotationNode <em>Rotation Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rotation Node</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.RotationBinding#getRotationNode()
	 * @see #getRotationBinding()
	 * @generated
	 */
  EReference getRotationBinding_RotationNode();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.bindings.RotationBinding#getRotationAxis <em>Rotation Axis</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Axis</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.RotationBinding#getRotationAxis()
	 * @see #getRotationBinding()
	 * @generated
	 */
  EAttribute getRotationBinding_RotationAxis();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.bindings.RotationBinding#getRotationUnits <em>Rotation Units</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation Units</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.RotationBinding#getRotationUnits()
	 * @see #getRotationBinding()
	 * @generated
	 */
  EAttribute getRotationBinding_RotationUnits();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding <em>Translation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation Binding</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.TranslationBinding
	 * @generated
	 */
  EClass getTranslationBinding();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding#getTranslationAxis <em>Translation Axis</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation Axis</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.TranslationBinding#getTranslationAxis()
	 * @see #getTranslationBinding()
	 * @generated
	 */
  EAttribute getTranslationBinding_TranslationAxis();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.TranslationBinding#getPositionNode <em>Position Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position Node</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.TranslationBinding#getPositionNode()
	 * @see #getTranslationBinding()
	 * @generated
	 */
  EReference getTranslationBinding_PositionNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding <em>Transform Matrix Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform Matrix Binding</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding
	 * @generated
	 */
  EClass getTransformMatrixBinding();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding#getTransformNode <em>Transform Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Node</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding#getTransformNode()
	 * @see #getTransformMatrixBinding()
	 * @generated
	 */
  EReference getTransformMatrixBinding_TransformNode();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding <em>Enumeration Switch Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Switch Binding</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding
	 * @generated
	 */
  EClass getEnumerationSwitchBinding();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Node</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding#getParentNode()
	 * @see #getEnumerationSwitchBinding()
	 * @generated
	 */
  EReference getEnumerationSwitchBinding_ParentNode();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding#getCases()
	 * @see #getEnumerationSwitchBinding()
	 * @generated
	 */
  EReference getEnumerationSwitchBinding_Cases();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding#getActiveCase <em>Active Case</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Case</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding#getActiveCase()
	 * @see #getEnumerationSwitchBinding()
	 * @generated
	 */
  EReference getEnumerationSwitchBinding_ActiveCase();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.EnumerationCase <em>Enumeration Case</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Case</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationCase
	 * @generated
	 */
  EClass getEnumerationCase();

  /**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.topology.bindings.EnumerationCase#getEnumerationLiterals <em>Enumeration Literals</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enumeration Literals</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationCase#getEnumerationLiterals()
	 * @see #getEnumerationCase()
	 * @generated
	 */
  EReference getEnumerationCase_EnumerationLiterals();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.common.topology.bindings.EnumerationCase#getTopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Root</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.EnumerationCase#getTopologyRoot()
	 * @see #getEnumerationCase()
	 * @generated
	 */
  EReference getEnumerationCase_TopologyRoot();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.BindingsList <em>Bindings List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindings List</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsList
	 * @generated
	 */
  EClass getBindingsList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.topology.bindings.BindingsList#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsList#getBindings()
	 * @see #getBindingsList()
	 * @generated
	 */
  EReference getBindingsList_Bindings();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.FeatureRootsList <em>Feature Roots List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Roots List</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.FeatureRootsList
	 * @generated
	 */
  EClass getFeatureRootsList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.common.topology.bindings.FeatureRootsList#getFeatureRoots <em>Feature Roots</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Roots</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.FeatureRootsList#getFeatureRoots()
	 * @see #getFeatureRootsList()
	 * @generated
	 */
  EReference getFeatureRootsList_FeatureRoots();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.BindingsSet <em>Bindings Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bindings Set</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsSet
	 * @generated
	 */
  EClass getBindingsSet();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.common.topology.bindings.BindingsSet#getFeatureRootsList <em>Feature Roots List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Roots List</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsSet#getFeatureRootsList()
	 * @see #getBindingsSet()
	 * @generated
	 */
  EReference getBindingsSet_FeatureRootsList();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.common.topology.bindings.BindingsSet#getBindingsList <em>Bindings List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bindings List</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsSet#getBindingsList()
	 * @see #getBindingsSet()
	 * @generated
	 */
  EReference getBindingsSet_BindingsList();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.bindings.BindingsSet#bind() <em>Bind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind</em>' operation.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsSet#bind()
	 * @generated
	 */
  EOperation getBindingsSet__Bind();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.bindings.BindingsSet#unbind() <em>Unbind</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unbind</em>' operation.
	 * @see org.eclipse.symphony.common.topology.bindings.BindingsSet#unbind()
	 * @generated
	 */
  EOperation getBindingsSet__Unbind();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.bindings.TopologyBindingsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsFacade
	 * @generated
	 */
  EClass getTopologyBindingsFacade();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.bindings.TopologyBindingsFacade#copy(org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding, java.util.Map) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsFacade#copy(org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding, java.util.Map)
	 * @generated
	 */
  EOperation getTopologyBindingsFacade__Copy__AbstractTopologyBinding_Map();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.topology.bindings.AXIS <em>AXIS</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AXIS</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.AXIS
	 * @generated
	 */
  EEnum getAXIS();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.topology.bindings.ANGLE_UNITS <em>ANGLE UNITS</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ANGLE UNITS</em>'.
	 * @see org.eclipse.symphony.common.topology.bindings.ANGLE_UNITS
	 * @generated
	 */
  EEnum getANGLE_UNITS();

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
  TopologyBindingsFactory getTopologyBindingsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl <em>Abstract Topology Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getAbstractTopologyBinding()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.RotationBindingImpl <em>Rotation Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.RotationBindingImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getRotationBinding()
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
		 * The meta object literal for the '<em><b>Rotation Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROTATION_BINDING__ROTATION_UNITS = eINSTANCE.getRotationBinding_RotationUnits();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl <em>Translation Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getTranslationBinding()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.TransformMatrixBindingImpl <em>Transform Matrix Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TransformMatrixBindingImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getTransformMatrixBinding()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.EnumerationSwitchBindingImpl <em>Enumeration Switch Binding</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.EnumerationSwitchBindingImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getEnumerationSwitchBinding()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.EnumerationCaseImpl <em>Enumeration Case</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.EnumerationCaseImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getEnumerationCase()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.BindingsListImpl <em>Bindings List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.BindingsListImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getBindingsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.FeatureRootsListImpl <em>Feature Roots List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.FeatureRootsListImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getFeatureRootsList()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.BindingsSetImpl <em>Bindings Set</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.BindingsSetImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getBindingsSet()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsFacadeImpl
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getTopologyBindingsFacade()
		 * @generated
		 */
    EClass TOPOLOGY_BINDINGS_FACADE = eINSTANCE.getTopologyBindingsFacade();

    /**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP = eINSTANCE.getTopologyBindingsFacade__Copy__AbstractTopologyBinding_Map();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.AXIS <em>AXIS</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.AXIS
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getAXIS()
		 * @generated
		 */
    EEnum AXIS = eINSTANCE.getAXIS();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.bindings.ANGLE_UNITS <em>ANGLE UNITS</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.bindings.ANGLE_UNITS
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getANGLE_UNITS()
		 * @generated
		 */
    EEnum ANGLE_UNITS = eINSTANCE.getANGLE_UNITS();

    /**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsPackageImpl#getMap()
		 * @generated
		 */
    EDataType MAP = eINSTANCE.getMap();

  }

} //TopologyBindingsPackage
