/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

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
 * @see org.eclipse.symphony.addons.Symphony__AddonsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__Addons' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)' modelName='Symphony__Addons' complianceLevel='6.0' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.addons/src-generated' editDirectory='/org.eclipse.symphony.addons.edit/src-generated' basePackage='org.eclipse.symphony'"
 * @generated
 */
public interface Symphony__AddonsPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "addons";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.addons";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "addons";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__AddonsPackage eINSTANCE = org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.AbstractToolImpl <em>Abstract Tool</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.AbstractToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getAbstractTool()
	 * @generated
	 */
  int ABSTRACT_TOOL = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOOL__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOOL__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Abstract Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOOL_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Abstract Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TOOL_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.SimpleToolListImpl <em>Simple Tool List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.SimpleToolListImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSimpleToolList()
	 * @generated
	 */
	int SIMPLE_TOOL_LIST = 1;

		/**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL_LIST__TOOLS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

		/**
	 * The feature id for the '<em><b>Simple Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL_LIST__SIMPLE_TOOLS = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Simple Tool List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL_LIST_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

		/**
	 * The number of operations of the '<em>Simple Tool List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL_LIST_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.SimpleToolImpl <em>Simple Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.SimpleToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSimpleTool()
	 * @generated
	 */
	int SIMPLE_TOOL = 2;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL__NAME = ABSTRACT_TOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL__DESCRIPTION = ABSTRACT_TOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL__TOOL_LIST = ABSTRACT_TOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL__ACTIVE = ABSTRACT_TOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL__DISPOSED = ABSTRACT_TOOL_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Simple Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL_FEATURE_COUNT = ABSTRACT_TOOL_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL___DISPOSE = ABSTRACT_TOOL_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Simple Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOOL_OPERATION_COUNT = ABSTRACT_TOOL_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.Simple3DToolImpl <em>Simple3 DTool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.Simple3DToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSimple3DTool()
	 * @generated
	 */
	int SIMPLE3_DTOOL = 3;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL__NAME = SIMPLE_TOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL__DESCRIPTION = SIMPLE_TOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL__TOOL_LIST = SIMPLE_TOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL__ACTIVE = SIMPLE_TOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL__DISPOSED = SIMPLE_TOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL__VISIBLE = SIMPLE_TOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL__ROOT_NODE = SIMPLE_TOOL_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Simple3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL_FEATURE_COUNT = SIMPLE_TOOL_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL___DISPOSE = SIMPLE_TOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION = SIMPLE_TOOL_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Simple3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE3_DTOOL_OPERATION_COUNT = SIMPLE_TOOL_OPERATION_COUNT + 1;


		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl <em>Abstract Two Points3 DTool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getAbstractTwoPoints3DTool()
	 * @generated
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL = 4;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__NAME = SIMPLE3_DTOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__DESCRIPTION = SIMPLE3_DTOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__TOOL_LIST = SIMPLE3_DTOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__ACTIVE = SIMPLE3_DTOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__DISPOSED = SIMPLE3_DTOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__VISIBLE = SIMPLE3_DTOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__ROOT_NODE = SIMPLE3_DTOOL__ROOT_NODE;

		/**
	 * The feature id for the '<em><b>From Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION = SIMPLE3_DTOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>From Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION = SIMPLE3_DTOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE = SIMPLE3_DTOOL_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>From Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK = SIMPLE3_DTOOL_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>To Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION = SIMPLE3_DTOOL_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>To Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION = SIMPLE3_DTOOL_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE = SIMPLE3_DTOOL_FEATURE_COUNT + 6;

		/**
	 * The feature id for the '<em><b>To Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK = SIMPLE3_DTOOL_FEATURE_COUNT + 7;

		/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE = SIMPLE3_DTOOL_FEATURE_COUNT + 8;

		/**
	 * The number of structural features of the '<em>Abstract Two Points3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT = SIMPLE3_DTOOL_FEATURE_COUNT + 9;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL___DISPOSE = SIMPLE3_DTOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL___SELECTION_CHANGED__NODESELECTION = SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION;

		/**
	 * The operation id for the '<em>Points Relative Pose Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D = SIMPLE3_DTOOL_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Abstract Two Points3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TWO_POINTS3_DTOOL_OPERATION_COUNT = SIMPLE3_DTOOL_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl <em>Ruler3 DTool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.Ruler3DToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getRuler3DTool()
	 * @generated
	 */
	int RULER3_DTOOL = 5;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__NAME = ABSTRACT_TWO_POINTS3_DTOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__DESCRIPTION = ABSTRACT_TWO_POINTS3_DTOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__TOOL_LIST = ABSTRACT_TWO_POINTS3_DTOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__ACTIVE = ABSTRACT_TWO_POINTS3_DTOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__DISPOSED = ABSTRACT_TWO_POINTS3_DTOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__VISIBLE = ABSTRACT_TWO_POINTS3_DTOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__ROOT_NODE = ABSTRACT_TWO_POINTS3_DTOOL__ROOT_NODE;

		/**
	 * The feature id for the '<em><b>From Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__FROM_ABSOLUTE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>From Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__FROM_RELATIVE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__FROM_NODE = ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE;

		/**
	 * The feature id for the '<em><b>From Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__FROM_NODE_LOCK = ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>To Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__TO_ABSOLUTE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>To Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__TO_RELATIVE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__TO_NODE = ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE;

		/**
	 * The feature id for the '<em><b>To Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__TO_NODE_LOCK = ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__DISTANCE = ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE;

		/**
	 * The feature id for the '<em><b>Ruler Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__RULER_COLOR = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Extremities Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__EXTREMITIES_RADIUS = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Minor Tick Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__MINOR_TICK_COLOR = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Minor Tick Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__MINOR_TICK_SPACING = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Minor Tick Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__MINOR_TICK_LENGHT = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Major Tick Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__MAJOR_TICK_COLOR = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Major Tick Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__MAJOR_TICK_SPACING = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 6;

		/**
	 * The feature id for the '<em><b>Major Tick Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__MAJOR_TICK_LENGHT = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 7;

		/**
	 * The feature id for the '<em><b>Ruler3d Tool Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL__RULER3D_TOOL_NODE = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 8;

		/**
	 * The number of structural features of the '<em>Ruler3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL_FEATURE_COUNT = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 9;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL___DISPOSE = ABSTRACT_TWO_POINTS3_DTOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL___SELECTION_CHANGED__NODESELECTION = ABSTRACT_TWO_POINTS3_DTOOL___SELECTION_CHANGED__NODESELECTION;

		/**
	 * The operation id for the '<em>Points Relative Pose Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D = ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D;

		/**
	 * The number of operations of the '<em>Ruler3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3_DTOOL_OPERATION_COUNT = ABSTRACT_TWO_POINTS3_DTOOL_OPERATION_COUNT + 0;


		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.Ruler3dToolNodeImpl <em>Ruler3d Tool Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.Ruler3dToolNodeImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getRuler3dToolNode()
	 * @generated
	 */
	int RULER3D_TOOL_NODE = 6;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3D_TOOL_NODE__PARENT = Symphony__CommonTopologyPackage.NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3D_TOOL_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3D_TOOL_NODE__NODE_ID = Symphony__CommonTopologyPackage.NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Ruler3 DTool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3D_TOOL_NODE__RULER3_DTOOL = Symphony__CommonTopologyPackage.NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Ruler3d Tool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3D_TOOL_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3D_TOOL_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Ruler3d Tool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULER3D_TOOL_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.NODE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl <em>Feature Of Interest Picking Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getFeatureOfInterestPickingTool()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL = 7;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__NAME = SIMPLE3_DTOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__DESCRIPTION = SIMPLE3_DTOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__TOOL_LIST = SIMPLE3_DTOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__ACTIVE = SIMPLE3_DTOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__DISPOSED = SIMPLE3_DTOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__VISIBLE = SIMPLE3_DTOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__ROOT_NODE = SIMPLE3_DTOOL__ROOT_NODE;

		/**
	 * The feature id for the '<em><b>Feature Of Interest List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST = SIMPLE3_DTOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Pick Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION = SIMPLE3_DTOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Pick Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION = SIMPLE3_DTOOL_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Picked Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE = SIMPLE3_DTOOL_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Pick Absolute Normal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL = SIMPLE3_DTOOL_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Pick Relative Normal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL = SIMPLE3_DTOOL_FEATURE_COUNT + 5;

		/**
	 * The number of structural features of the '<em>Feature Of Interest Picking Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL_FEATURE_COUNT = SIMPLE3_DTOOL_FEATURE_COUNT + 6;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL___DISPOSE = SIMPLE3_DTOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL___SELECTION_CHANGED__NODESELECTION = SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION;

		/**
	 * The number of operations of the '<em>Feature Of Interest Picking Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_PICKING_TOOL_OPERATION_COUNT = SIMPLE3_DTOOL_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.SunVector3DToolImpl <em>Sun Vector3 DTool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.SunVector3DToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSunVector3DTool()
	 * @generated
	 */
	int SUN_VECTOR3_DTOOL = 8;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__NAME = ABSTRACT_TWO_POINTS3_DTOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__DESCRIPTION = ABSTRACT_TWO_POINTS3_DTOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__TOOL_LIST = ABSTRACT_TWO_POINTS3_DTOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__ACTIVE = ABSTRACT_TWO_POINTS3_DTOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__DISPOSED = ABSTRACT_TWO_POINTS3_DTOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__VISIBLE = ABSTRACT_TWO_POINTS3_DTOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__ROOT_NODE = ABSTRACT_TWO_POINTS3_DTOOL__ROOT_NODE;

		/**
	 * The feature id for the '<em><b>From Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__FROM_ABSOLUTE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>From Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__FROM_RELATIVE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>From Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__FROM_NODE = ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE;

		/**
	 * The feature id for the '<em><b>From Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__FROM_NODE_LOCK = ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>To Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__TO_ABSOLUTE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION;

		/**
	 * The feature id for the '<em><b>To Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__TO_RELATIVE_POSITION = ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION;

		/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__TO_NODE = ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE;

		/**
	 * The feature id for the '<em><b>To Node Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__TO_NODE_LOCK = ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK;

		/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__DISTANCE = ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE;

		/**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__VECTOR_COLOR = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Vector Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__VECTOR_LENGTH = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>End Point Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__END_POINT_RADIUS = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Sun Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__SUN_INTENSITY = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Current Day Maximum Sun Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Current Sun Intensity Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Sun Vector3 DTool Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 6;

		/**
	 * The number of structural features of the '<em>Sun Vector3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_FEATURE_COUNT = ABSTRACT_TWO_POINTS3_DTOOL_FEATURE_COUNT + 7;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL___DISPOSE = ABSTRACT_TWO_POINTS3_DTOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL___SELECTION_CHANGED__NODESELECTION = ABSTRACT_TWO_POINTS3_DTOOL___SELECTION_CHANGED__NODESELECTION;

		/**
	 * The operation id for the '<em>Points Relative Pose Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D = ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D;

		/**
	 * The number of operations of the '<em>Sun Vector3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_OPERATION_COUNT = ABSTRACT_TWO_POINTS3_DTOOL_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.SunVector3DToolNodeImpl <em>Sun Vector3 DTool Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.SunVector3DToolNodeImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSunVector3DToolNode()
	 * @generated
	 */
	int SUN_VECTOR3_DTOOL_NODE = 9;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_NODE__PARENT = Symphony__CommonTopologyPackage.NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_NODE__NODE_ID = Symphony__CommonTopologyPackage.NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Sun Vector3 DTool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL = Symphony__CommonTopologyPackage.NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Sun Vector3 DTool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Sun Vector3 DTool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_VECTOR3_DTOOL_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.NODE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl <em>Trajectory3 DTool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.Trajectory3DToolImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getTrajectory3DTool()
	 * @generated
	 */
	int TRAJECTORY3_DTOOL = 10;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__NAME = SIMPLE3_DTOOL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__DESCRIPTION = SIMPLE3_DTOOL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__TOOL_LIST = SIMPLE3_DTOOL__TOOL_LIST;

		/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__ACTIVE = SIMPLE3_DTOOL__ACTIVE;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__DISPOSED = SIMPLE3_DTOOL__DISPOSED;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__VISIBLE = SIMPLE3_DTOOL__VISIBLE;

		/**
	 * The feature id for the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__ROOT_NODE = SIMPLE3_DTOOL__ROOT_NODE;

		/**
	 * The feature id for the '<em><b>Pen Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__PEN_DOWN = SIMPLE3_DTOOL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__VARIABLE = SIMPLE3_DTOOL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Distance Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD = SIMPLE3_DTOOL_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Total Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__TOTAL_DISTANCE = SIMPLE3_DTOOL_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__PATHS = SIMPLE3_DTOOL_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__POSE_PROVIDER = SIMPLE3_DTOOL_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Trajectory3 DTool Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE = SIMPLE3_DTOOL_FEATURE_COUNT + 6;

		/**
	 * The number of structural features of the '<em>Trajectory3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_FEATURE_COUNT = SIMPLE3_DTOOL_FEATURE_COUNT + 7;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL___DISPOSE = SIMPLE3_DTOOL___DISPOSE;

		/**
	 * The operation id for the '<em>Selection Changed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL___SELECTION_CHANGED__NODESELECTION = SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION;

		/**
	 * The number of operations of the '<em>Trajectory3 DTool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_OPERATION_COUNT = SIMPLE3_DTOOL_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.impl.Trajectory3DToolNodeImpl <em>Trajectory3 DTool Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.impl.Trajectory3DToolNodeImpl
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getTrajectory3DToolNode()
	 * @generated
	 */
	int TRAJECTORY3_DTOOL_NODE = 11;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE__PARENT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE__DESCRIPTION = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE__NODE_ID = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE__CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE__AGGREGATED_CHILDREN = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Trajectory3 DTool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Trajectory3 DTool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE_FEATURE_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE___ACCEPT__INODEVISITOR = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Trajectory3 DTool Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY3_DTOOL_NODE_OPERATION_COUNT = Symphony__CommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 12;


		/**
	 * The meta object id for the '<em>Node Selection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection
	 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getNodeSelection()
	 * @generated
	 */
	int NODE_SELECTION = 13;


		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.AbstractTool <em>Abstract Tool</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Tool</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTool
	 * @generated
	 */
  EClass getAbstractTool();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.SimpleToolList <em>Simple Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Tool List</em>'.
	 * @see org.eclipse.symphony.addons.SimpleToolList
	 * @generated
	 */
	EClass getSimpleToolList();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.SimpleToolList#getSimpleTools <em>Simple Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Tools</em>'.
	 * @see org.eclipse.symphony.addons.SimpleToolList#getSimpleTools()
	 * @see #getSimpleToolList()
	 * @generated
	 */
	EReference getSimpleToolList_SimpleTools();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.SimpleTool <em>Simple Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Tool</em>'.
	 * @see org.eclipse.symphony.addons.SimpleTool
	 * @generated
	 */
	EClass getSimpleTool();

		/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.SimpleTool#getToolList <em>Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tool List</em>'.
	 * @see org.eclipse.symphony.addons.SimpleTool#getToolList()
	 * @see #getSimpleTool()
	 * @generated
	 */
	EReference getSimpleTool_ToolList();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SimpleTool#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.eclipse.symphony.addons.SimpleTool#isActive()
	 * @see #getSimpleTool()
	 * @generated
	 */
	EAttribute getSimpleTool_Active();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SimpleTool#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see org.eclipse.symphony.addons.SimpleTool#isDisposed()
	 * @see #getSimpleTool()
	 * @generated
	 */
	EAttribute getSimpleTool_Disposed();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.SimpleTool#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.addons.SimpleTool#dispose()
	 * @generated
	 */
	EOperation getSimpleTool__Dispose();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.Simple3DTool <em>Simple3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.Simple3DTool
	 * @generated
	 */
	EClass getSimple3DTool();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Simple3DTool#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.symphony.addons.Simple3DTool#isVisible()
	 * @see #getSimple3DTool()
	 * @generated
	 */
	EAttribute getSimple3DTool_Visible();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.Simple3DTool#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Node</em>'.
	 * @see org.eclipse.symphony.addons.Simple3DTool#getRootNode()
	 * @see #getSimple3DTool()
	 * @generated
	 */
	EReference getSimple3DTool_RootNode();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.Simple3DTool#selectionChanged(org.eclipse.symphony.common.topology.ui.NodeSelection) <em>Selection Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Selection Changed</em>' operation.
	 * @see org.eclipse.symphony.addons.Simple3DTool#selectionChanged(org.eclipse.symphony.common.topology.ui.NodeSelection)
	 * @generated
	 */
	EOperation getSimple3DTool__SelectionChanged__NodeSelection();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool <em>Abstract Two Points3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Two Points3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool
	 * @generated
	 */
	EClass getAbstractTwoPoints3DTool();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromAbsolutePosition <em>From Absolute Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Absolute Position</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromAbsolutePosition()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EReference getAbstractTwoPoints3DTool_FromAbsolutePosition();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromRelativePosition <em>From Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Relative Position</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromRelativePosition()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EReference getAbstractTwoPoints3DTool_FromRelativePosition();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Node</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getFromNode()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EReference getAbstractTwoPoints3DTool_FromNode();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isFromNodeLock <em>From Node Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Node Lock</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isFromNodeLock()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EAttribute getAbstractTwoPoints3DTool_FromNodeLock();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToAbsolutePosition <em>To Absolute Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Absolute Position</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToAbsolutePosition()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EReference getAbstractTwoPoints3DTool_ToAbsolutePosition();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToRelativePosition <em>To Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Relative Position</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToRelativePosition()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EReference getAbstractTwoPoints3DTool_ToRelativePosition();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Node</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getToNode()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EReference getAbstractTwoPoints3DTool_ToNode();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isToNodeLock <em>To Node Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Node Lock</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#isToNodeLock()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EAttribute getAbstractTwoPoints3DTool_ToNodeLock();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#getDistance()
	 * @see #getAbstractTwoPoints3DTool()
	 * @generated
	 */
	EAttribute getAbstractTwoPoints3DTool_Distance();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.AbstractTwoPoints3DTool#pointsRelativePoseChanged(javax.vecmath.Matrix4d) <em>Points Relative Pose Changed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Points Relative Pose Changed</em>' operation.
	 * @see org.eclipse.symphony.addons.AbstractTwoPoints3DTool#pointsRelativePoseChanged(javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.Ruler3DTool <em>Ruler3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruler3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool
	 * @generated
	 */
	EClass getRuler3DTool();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.Ruler3DTool#getRuler3dToolNode <em>Ruler3d Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ruler3d Tool Node</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getRuler3dToolNode()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EReference getRuler3DTool_Ruler3dToolNode();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.Ruler3dToolNode <em>Ruler3d Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruler3d Tool Node</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3dToolNode
	 * @generated
	 */
	EClass getRuler3dToolNode();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.Ruler3dToolNode#getRuler3DTool <em>Ruler3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ruler3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3dToolNode#getRuler3DTool()
	 * @see #getRuler3dToolNode()
	 * @generated
	 */
	EReference getRuler3dToolNode_Ruler3DTool();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool <em>Feature Of Interest Picking Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest Picking Tool</em>'.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool
	 * @generated
	 */
	EClass getFeatureOfInterestPickingTool();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getFeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Of Interest List</em>'.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getFeatureOfInterestList()
	 * @see #getFeatureOfInterestPickingTool()
	 * @generated
	 */
	EReference getFeatureOfInterestPickingTool_FeatureOfInterestList();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsolutePosition <em>Pick Absolute Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pick Absolute Position</em>'.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsolutePosition()
	 * @see #getFeatureOfInterestPickingTool()
	 * @generated
	 */
	EReference getFeatureOfInterestPickingTool_PickAbsolutePosition();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativePosition <em>Pick Relative Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pick Relative Position</em>'.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativePosition()
	 * @see #getFeatureOfInterestPickingTool()
	 * @generated
	 */
	EReference getFeatureOfInterestPickingTool_PickRelativePosition();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickedNode <em>Picked Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Picked Node</em>'.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickedNode()
	 * @see #getFeatureOfInterestPickingTool()
	 * @generated
	 */
	EReference getFeatureOfInterestPickingTool_PickedNode();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsoluteNormal <em>Pick Absolute Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pick Absolute Normal</em>'.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsoluteNormal()
	 * @see #getFeatureOfInterestPickingTool()
	 * @generated
	 */
	EReference getFeatureOfInterestPickingTool_PickAbsoluteNormal();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativeNormal <em>Pick Relative Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pick Relative Normal</em>'.
	 * @see org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativeNormal()
	 * @see #getFeatureOfInterestPickingTool()
	 * @generated
	 */
	EReference getFeatureOfInterestPickingTool_PickRelativeNormal();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.SunVector3DTool <em>Sun Vector3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sun Vector3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool
	 * @generated
	 */
	EClass getSunVector3DTool();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SunVector3DTool#getVectorColor <em>Vector Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Color</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getVectorColor()
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	EAttribute getSunVector3DTool_VectorColor();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SunVector3DTool#getVectorLength <em>Vector Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Length</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getVectorLength()
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	EAttribute getSunVector3DTool_VectorLength();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SunVector3DTool#getEndPointRadius <em>End Point Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point Radius</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getEndPointRadius()
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	EAttribute getSunVector3DTool_EndPointRadius();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SunVector3DTool#getSunIntensity <em>Sun Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sun Intensity</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getSunIntensity()
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	EAttribute getSunVector3DTool_SunIntensity();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SunVector3DTool#getCurrentDayMaximumSunIntensity <em>Current Day Maximum Sun Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Day Maximum Sun Intensity</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getCurrentDayMaximumSunIntensity()
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	EAttribute getSunVector3DTool_CurrentDayMaximumSunIntensity();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.SunVector3DTool#getCurrentSunIntensityPercentage <em>Current Sun Intensity Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Sun Intensity Percentage</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getCurrentSunIntensityPercentage()
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	EAttribute getSunVector3DTool_CurrentSunIntensityPercentage();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.SunVector3DTool#getSunVector3DToolNode <em>Sun Vector3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sun Vector3 DTool Node</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DTool#getSunVector3DToolNode()
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	EReference getSunVector3DTool_SunVector3DToolNode();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.SunVector3DToolNode <em>Sun Vector3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sun Vector3 DTool Node</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DToolNode
	 * @generated
	 */
	EClass getSunVector3DToolNode();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.SunVector3DToolNode#getSunVector3DTool <em>Sun Vector3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sun Vector3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.SunVector3DToolNode#getSunVector3DTool()
	 * @see #getSunVector3DToolNode()
	 * @generated
	 */
	EReference getSunVector3DToolNode_SunVector3DTool();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.Trajectory3DTool <em>Trajectory3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool
	 * @generated
	 */
	EClass getTrajectory3DTool();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Trajectory3DTool#isPenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pen Down</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#isPenDown()
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	EAttribute getTrajectory3DTool_PenDown();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.Trajectory3DTool#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#getVariable()
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	EReference getTrajectory3DTool_Variable();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Trajectory3DTool#getDistanceThreshold <em>Distance Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Threshold</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#getDistanceThreshold()
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	EAttribute getTrajectory3DTool_DistanceThreshold();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Trajectory3DTool#getTotalDistance <em>Total Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Distance</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#getTotalDistance()
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	EAttribute getTrajectory3DTool_TotalDistance();

		/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.Trajectory3DTool#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#getPaths()
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	EReference getTrajectory3DTool_Paths();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.Trajectory3DTool#getPoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#getPoseProvider()
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	EReference getTrajectory3DTool_PoseProvider();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.Trajectory3DTool#getTrajectory3DToolNode <em>Trajectory3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trajectory3 DTool Node</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DTool#getTrajectory3DToolNode()
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	EReference getTrajectory3DTool_Trajectory3DToolNode();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.Trajectory3DToolNode <em>Trajectory3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory3 DTool Node</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DToolNode
	 * @generated
	 */
	EClass getTrajectory3DToolNode();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.addons.Trajectory3DToolNode#getTrajectory3DTool <em>Trajectory3 DTool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trajectory3 DTool</em>'.
	 * @see org.eclipse.symphony.addons.Trajectory3DToolNode#getTrajectory3DTool()
	 * @see #getTrajectory3DToolNode()
	 * @generated
	 */
	EReference getTrajectory3DToolNode_Trajectory3DTool();

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
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.topology.ui.NodeSelection <em>Node Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Selection</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.NodeSelection
	 * @model instanceClass="org.eclipse.symphony.common.topology.ui.NodeSelection"
	 * @generated
	 */
	EDataType getNodeSelection();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__AddonsFactory getSymphony__AddonsFactory();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getRulerColor <em>Ruler Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruler Color</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getRulerColor()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_RulerColor();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getExtremitiesRadius <em>Extremities Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extremities Radius</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getExtremitiesRadius()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_ExtremitiesRadius();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getMinorTickColor <em>Minor Tick Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Tick Color</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getMinorTickColor()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_MinorTickColor();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getMinorTickSpacing <em>Minor Tick Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Tick Spacing</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getMinorTickSpacing()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_MinorTickSpacing();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getMinorTickLenght <em>Minor Tick Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor Tick Lenght</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getMinorTickLenght()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_MinorTickLenght();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getMajorTickColor <em>Major Tick Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Tick Color</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getMajorTickColor()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_MajorTickColor();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getMajorTickSpacing <em>Major Tick Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Tick Spacing</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getMajorTickSpacing()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_MajorTickSpacing();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.Ruler3DTool#getMajorTickLenght <em>Major Tick Lenght</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major Tick Lenght</em>'.
	 * @see org.eclipse.symphony.addons.Ruler3DTool#getMajorTickLenght()
	 * @see #getRuler3DTool()
	 * @generated
	 */
	EAttribute getRuler3DTool_MajorTickLenght();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.AbstractToolImpl <em>Abstract Tool</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.AbstractToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getAbstractTool()
		 * @generated
		 */
    EClass ABSTRACT_TOOL = eINSTANCE.getAbstractTool();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.SimpleToolListImpl <em>Simple Tool List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.SimpleToolListImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSimpleToolList()
		 * @generated
		 */
		EClass SIMPLE_TOOL_LIST = eINSTANCE.getSimpleToolList();
				/**
		 * The meta object literal for the '<em><b>Simple Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TOOL_LIST__SIMPLE_TOOLS = eINSTANCE.getSimpleToolList_SimpleTools();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.SimpleToolImpl <em>Simple Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.SimpleToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSimpleTool()
		 * @generated
		 */
		EClass SIMPLE_TOOL = eINSTANCE.getSimpleTool();
				/**
		 * The meta object literal for the '<em><b>Tool List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TOOL__TOOL_LIST = eINSTANCE.getSimpleTool_ToolList();
				/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TOOL__ACTIVE = eINSTANCE.getSimpleTool_Active();
				/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TOOL__DISPOSED = eINSTANCE.getSimpleTool_Disposed();
				/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_TOOL___DISPOSE = eINSTANCE.getSimpleTool__Dispose();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.Simple3DToolImpl <em>Simple3 DTool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.Simple3DToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSimple3DTool()
		 * @generated
		 */
		EClass SIMPLE3_DTOOL = eINSTANCE.getSimple3DTool();
				/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE3_DTOOL__VISIBLE = eINSTANCE.getSimple3DTool_Visible();
				/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE3_DTOOL__ROOT_NODE = eINSTANCE.getSimple3DTool_RootNode();
				/**
		 * The meta object literal for the '<em><b>Selection Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION = eINSTANCE.getSimple3DTool__SelectionChanged__NodeSelection();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl <em>Abstract Two Points3 DTool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getAbstractTwoPoints3DTool()
		 * @generated
		 */
		EClass ABSTRACT_TWO_POINTS3_DTOOL = eINSTANCE.getAbstractTwoPoints3DTool();
				/**
		 * The meta object literal for the '<em><b>From Absolute Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION = eINSTANCE.getAbstractTwoPoints3DTool_FromAbsolutePosition();
				/**
		 * The meta object literal for the '<em><b>From Relative Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION = eINSTANCE.getAbstractTwoPoints3DTool_FromRelativePosition();
				/**
		 * The meta object literal for the '<em><b>From Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE = eINSTANCE.getAbstractTwoPoints3DTool_FromNode();
				/**
		 * The meta object literal for the '<em><b>From Node Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK = eINSTANCE.getAbstractTwoPoints3DTool_FromNodeLock();
				/**
		 * The meta object literal for the '<em><b>To Absolute Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION = eINSTANCE.getAbstractTwoPoints3DTool_ToAbsolutePosition();
				/**
		 * The meta object literal for the '<em><b>To Relative Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION = eINSTANCE.getAbstractTwoPoints3DTool_ToRelativePosition();
				/**
		 * The meta object literal for the '<em><b>To Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE = eINSTANCE.getAbstractTwoPoints3DTool_ToNode();
				/**
		 * The meta object literal for the '<em><b>To Node Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK = eINSTANCE.getAbstractTwoPoints3DTool_ToNodeLock();
				/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE = eINSTANCE.getAbstractTwoPoints3DTool_Distance();
				/**
		 * The meta object literal for the '<em><b>Points Relative Pose Changed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D = eINSTANCE.getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl <em>Ruler3 DTool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.Ruler3DToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getRuler3DTool()
		 * @generated
		 */
		EClass RULER3_DTOOL = eINSTANCE.getRuler3DTool();
				/**
		 * The meta object literal for the '<em><b>Ruler3d Tool Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULER3_DTOOL__RULER3D_TOOL_NODE = eINSTANCE.getRuler3DTool_Ruler3dToolNode();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.Ruler3dToolNodeImpl <em>Ruler3d Tool Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.Ruler3dToolNodeImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getRuler3dToolNode()
		 * @generated
		 */
		EClass RULER3D_TOOL_NODE = eINSTANCE.getRuler3dToolNode();
				/**
		 * The meta object literal for the '<em><b>Ruler3 DTool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULER3D_TOOL_NODE__RULER3_DTOOL = eINSTANCE.getRuler3dToolNode_Ruler3DTool();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl <em>Feature Of Interest Picking Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.FeatureOfInterestPickingToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getFeatureOfInterestPickingTool()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_PICKING_TOOL = eINSTANCE.getFeatureOfInterestPickingTool();
				/**
		 * The meta object literal for the '<em><b>Feature Of Interest List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST = eINSTANCE.getFeatureOfInterestPickingTool_FeatureOfInterestList();
				/**
		 * The meta object literal for the '<em><b>Pick Absolute Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION = eINSTANCE.getFeatureOfInterestPickingTool_PickAbsolutePosition();
				/**
		 * The meta object literal for the '<em><b>Pick Relative Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION = eINSTANCE.getFeatureOfInterestPickingTool_PickRelativePosition();
				/**
		 * The meta object literal for the '<em><b>Picked Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE = eINSTANCE.getFeatureOfInterestPickingTool_PickedNode();
				/**
		 * The meta object literal for the '<em><b>Pick Absolute Normal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL = eINSTANCE.getFeatureOfInterestPickingTool_PickAbsoluteNormal();
				/**
		 * The meta object literal for the '<em><b>Pick Relative Normal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL = eINSTANCE.getFeatureOfInterestPickingTool_PickRelativeNormal();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.SunVector3DToolImpl <em>Sun Vector3 DTool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.SunVector3DToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSunVector3DTool()
		 * @generated
		 */
		EClass SUN_VECTOR3_DTOOL = eINSTANCE.getSunVector3DTool();
				/**
		 * The meta object literal for the '<em><b>Vector Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_VECTOR3_DTOOL__VECTOR_COLOR = eINSTANCE.getSunVector3DTool_VectorColor();
				/**
		 * The meta object literal for the '<em><b>Vector Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_VECTOR3_DTOOL__VECTOR_LENGTH = eINSTANCE.getSunVector3DTool_VectorLength();
				/**
		 * The meta object literal for the '<em><b>End Point Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_VECTOR3_DTOOL__END_POINT_RADIUS = eINSTANCE.getSunVector3DTool_EndPointRadius();
				/**
		 * The meta object literal for the '<em><b>Sun Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_VECTOR3_DTOOL__SUN_INTENSITY = eINSTANCE.getSunVector3DTool_SunIntensity();
				/**
		 * The meta object literal for the '<em><b>Current Day Maximum Sun Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_VECTOR3_DTOOL__CURRENT_DAY_MAXIMUM_SUN_INTENSITY = eINSTANCE.getSunVector3DTool_CurrentDayMaximumSunIntensity();
				/**
		 * The meta object literal for the '<em><b>Current Sun Intensity Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUN_VECTOR3_DTOOL__CURRENT_SUN_INTENSITY_PERCENTAGE = eINSTANCE.getSunVector3DTool_CurrentSunIntensityPercentage();
				/**
		 * The meta object literal for the '<em><b>Sun Vector3 DTool Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE = eINSTANCE.getSunVector3DTool_SunVector3DToolNode();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.SunVector3DToolNodeImpl <em>Sun Vector3 DTool Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.SunVector3DToolNodeImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getSunVector3DToolNode()
		 * @generated
		 */
		EClass SUN_VECTOR3_DTOOL_NODE = eINSTANCE.getSunVector3DToolNode();
				/**
		 * The meta object literal for the '<em><b>Sun Vector3 DTool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL = eINSTANCE.getSunVector3DToolNode_SunVector3DTool();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl <em>Trajectory3 DTool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.Trajectory3DToolImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getTrajectory3DTool()
		 * @generated
		 */
		EClass TRAJECTORY3_DTOOL = eINSTANCE.getTrajectory3DTool();
				/**
		 * The meta object literal for the '<em><b>Pen Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY3_DTOOL__PEN_DOWN = eINSTANCE.getTrajectory3DTool_PenDown();
				/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY3_DTOOL__VARIABLE = eINSTANCE.getTrajectory3DTool_Variable();
				/**
		 * The meta object literal for the '<em><b>Distance Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD = eINSTANCE.getTrajectory3DTool_DistanceThreshold();
				/**
		 * The meta object literal for the '<em><b>Total Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY3_DTOOL__TOTAL_DISTANCE = eINSTANCE.getTrajectory3DTool_TotalDistance();
				/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY3_DTOOL__PATHS = eINSTANCE.getTrajectory3DTool_Paths();
				/**
		 * The meta object literal for the '<em><b>Pose Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY3_DTOOL__POSE_PROVIDER = eINSTANCE.getTrajectory3DTool_PoseProvider();
				/**
		 * The meta object literal for the '<em><b>Trajectory3 DTool Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE = eINSTANCE.getTrajectory3DTool_Trajectory3DToolNode();
				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.impl.Trajectory3DToolNodeImpl <em>Trajectory3 DTool Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.impl.Trajectory3DToolNodeImpl
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getTrajectory3DToolNode()
		 * @generated
		 */
		EClass TRAJECTORY3_DTOOL_NODE = eINSTANCE.getTrajectory3DToolNode();
				/**
		 * The meta object literal for the '<em><b>Trajectory3 DTool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL = eINSTANCE.getTrajectory3DToolNode_Trajectory3DTool();
				/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();
				/**
		 * The meta object literal for the '<em>Node Selection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.NodeSelection
		 * @see org.eclipse.symphony.addons.impl.Symphony__AddonsPackageImpl#getNodeSelection()
		 * @generated
		 */
		EDataType NODE_SELECTION = eINSTANCE.getNodeSelection();
				/**
		 * The meta object literal for the '<em><b>Ruler Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__RULER_COLOR = eINSTANCE.getRuler3DTool_RulerColor();
				/**
		 * The meta object literal for the '<em><b>Extremities Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__EXTREMITIES_RADIUS = eINSTANCE.getRuler3DTool_ExtremitiesRadius();
				/**
		 * The meta object literal for the '<em><b>Minor Tick Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__MINOR_TICK_COLOR = eINSTANCE.getRuler3DTool_MinorTickColor();
				/**
		 * The meta object literal for the '<em><b>Minor Tick Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__MINOR_TICK_SPACING = eINSTANCE.getRuler3DTool_MinorTickSpacing();
				/**
		 * The meta object literal for the '<em><b>Minor Tick Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__MINOR_TICK_LENGHT = eINSTANCE.getRuler3DTool_MinorTickLenght();
				/**
		 * The meta object literal for the '<em><b>Major Tick Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__MAJOR_TICK_COLOR = eINSTANCE.getRuler3DTool_MajorTickColor();
				/**
		 * The meta object literal for the '<em><b>Major Tick Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__MAJOR_TICK_SPACING = eINSTANCE.getRuler3DTool_MajorTickSpacing();
				/**
		 * The meta object literal for the '<em><b>Major Tick Lenght</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULER3_DTOOL__MAJOR_TICK_LENGHT = eINSTANCE.getRuler3DTool_MajorTickLenght();

  }

} //Symphony__AddonsPackage
