/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.AngleUnits;
import org.eclipse.symphony.common.topology.bindings.Axis;
import org.eclipse.symphony.common.topology.bindings.BindingsList;
import org.eclipse.symphony.common.topology.bindings.BindingsSet;
import org.eclipse.symphony.common.topology.bindings.EnumerationCase;
import org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding;
import org.eclipse.symphony.common.topology.bindings.FeatureRootsList;
import org.eclipse.symphony.common.topology.bindings.RotationBinding;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsFacade;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsFactory;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage;
import org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding;
import org.eclipse.symphony.common.topology.bindings.TranslationBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyBindingsPackageImpl extends EPackageImpl implements Symphony__CommonTopologyBindingsPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractTopologyBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rotationBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass translationBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass transformMatrixBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumerationSwitchBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumerationCaseEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass bindingsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass featureRootsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass bindingsSetEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CommonTopologyBindingsFacadeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum axisEEnum = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum angleUnitsEEnum = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType mapEDataType = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__CommonTopologyBindingsPackageImpl()
  {
		super(eNS_URI, Symphony__CommonTopologyBindingsFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Symphony__CommonTopologyBindingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__CommonTopologyBindingsPackage init()
  {
		if (isInited) return (Symphony__CommonTopologyBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyBindingsPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonTopologyBindingsPackageImpl theSymphony__CommonTopologyBindingsPackage = (Symphony__CommonTopologyBindingsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonTopologyBindingsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonTopologyBindingsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonTopologyPackage.eINSTANCE.eClass();
		Symphony__CommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonTopologyBindingsPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonTopologyBindingsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonTopologyBindingsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonTopologyBindingsPackage.eNS_URI, theSymphony__CommonTopologyBindingsPackage);
		return theSymphony__CommonTopologyBindingsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractTopologyBinding()
  {
		return abstractTopologyBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTopologyBinding_Binded()
  {
		return (EAttribute)abstractTopologyBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTopologyBinding_Description()
  {
		return (EAttribute)abstractTopologyBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractTopologyBinding_Name()
  {
		return (EAttribute)abstractTopologyBindingEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTopologyBinding_Source()
  {
		return (EReference)abstractTopologyBindingEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTopologyBinding_FeatureNode()
  {
		return (EReference)abstractTopologyBindingEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTopologyBinding_FeatureNodeAdapter()
  {
		return (EReference)abstractTopologyBindingEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractTopologyBinding__Bind()
  {
		return abstractTopologyBindingEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractTopologyBinding__Unbind()
  {
		return abstractTopologyBindingEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractTopologyBinding__Clone__Map()
  {
		return abstractTopologyBindingEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRotationBinding()
  {
		return rotationBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRotationBinding_RotationNode()
  {
		return (EReference)rotationBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRotationBinding_RotationAxis()
  {
		return (EAttribute)rotationBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRotationBinding_RotationUnits()
  {
		return (EAttribute)rotationBindingEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTranslationBinding()
  {
		return translationBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTranslationBinding_TranslationAxis()
  {
		return (EAttribute)translationBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTranslationBinding_PositionNode()
  {
		return (EReference)translationBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTransformMatrixBinding()
  {
		return transformMatrixBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTransformMatrixBinding_TransformNode()
  {
		return (EReference)transformMatrixBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnumerationSwitchBinding()
  {
		return enumerationSwitchBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumerationSwitchBinding_ParentNode()
  {
		return (EReference)enumerationSwitchBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumerationSwitchBinding_Cases()
  {
		return (EReference)enumerationSwitchBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumerationSwitchBinding_ActiveCase()
  {
		return (EReference)enumerationSwitchBindingEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnumerationCase()
  {
		return enumerationCaseEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumerationCase_EnumerationLiterals()
  {
		return (EReference)enumerationCaseEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumerationCase_TopologyRoot()
  {
		return (EReference)enumerationCaseEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBindingsList()
  {
		return bindingsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getBindingsList_Bindings()
  {
		return (EReference)bindingsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFeatureRootsList()
  {
		return featureRootsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFeatureRootsList_FeatureRoots()
  {
		return (EReference)featureRootsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBindingsSet()
  {
		return bindingsSetEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getBindingsSet_FeatureRootsList()
  {
		return (EReference)bindingsSetEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getBindingsSet_BindingsList()
  {
		return (EReference)bindingsSetEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getBindingsSet__Bind()
  {
		return bindingsSetEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getBindingsSet__Unbind()
  {
		return bindingsSetEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CommonTopologyBindingsFacade() {
		return symphony__CommonTopologyBindingsFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonTopologyBindingsFacade__Copy__AbstractTopologyBinding_Map() {
		return symphony__CommonTopologyBindingsFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAxis() {
		return axisEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAngleUnits() {
		return angleUnitsEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getMap()
  {
		return mapEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyBindingsFactory getSymphony__CommonTopologyBindingsFactory() {
		return (Symphony__CommonTopologyBindingsFactory)getEFactoryInstance();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractTopologyBindingEClass = createEClass(ABSTRACT_TOPOLOGY_BINDING);
		createEAttribute(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING__BINDED);
		createEAttribute(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING__DESCRIPTION);
		createEAttribute(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING__NAME);
		createEReference(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING__SOURCE);
		createEReference(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE);
		createEReference(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING__FEATURE_NODE_ADAPTER);
		createEOperation(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING___BIND);
		createEOperation(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING___UNBIND);
		createEOperation(abstractTopologyBindingEClass, ABSTRACT_TOPOLOGY_BINDING___CLONE__MAP);

		rotationBindingEClass = createEClass(ROTATION_BINDING);
		createEReference(rotationBindingEClass, ROTATION_BINDING__ROTATION_NODE);
		createEAttribute(rotationBindingEClass, ROTATION_BINDING__ROTATION_AXIS);
		createEAttribute(rotationBindingEClass, ROTATION_BINDING__ROTATION_UNITS);

		translationBindingEClass = createEClass(TRANSLATION_BINDING);
		createEReference(translationBindingEClass, TRANSLATION_BINDING__POSITION_NODE);
		createEAttribute(translationBindingEClass, TRANSLATION_BINDING__TRANSLATION_AXIS);

		transformMatrixBindingEClass = createEClass(TRANSFORM_MATRIX_BINDING);
		createEReference(transformMatrixBindingEClass, TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE);

		enumerationSwitchBindingEClass = createEClass(ENUMERATION_SWITCH_BINDING);
		createEReference(enumerationSwitchBindingEClass, ENUMERATION_SWITCH_BINDING__PARENT_NODE);
		createEReference(enumerationSwitchBindingEClass, ENUMERATION_SWITCH_BINDING__CASES);
		createEReference(enumerationSwitchBindingEClass, ENUMERATION_SWITCH_BINDING__ACTIVE_CASE);

		enumerationCaseEClass = createEClass(ENUMERATION_CASE);
		createEReference(enumerationCaseEClass, ENUMERATION_CASE__ENUMERATION_LITERALS);
		createEReference(enumerationCaseEClass, ENUMERATION_CASE__TOPOLOGY_ROOT);

		bindingsListEClass = createEClass(BINDINGS_LIST);
		createEReference(bindingsListEClass, BINDINGS_LIST__BINDINGS);

		featureRootsListEClass = createEClass(FEATURE_ROOTS_LIST);
		createEReference(featureRootsListEClass, FEATURE_ROOTS_LIST__FEATURE_ROOTS);

		bindingsSetEClass = createEClass(BINDINGS_SET);
		createEReference(bindingsSetEClass, BINDINGS_SET__FEATURE_ROOTS_LIST);
		createEReference(bindingsSetEClass, BINDINGS_SET__BINDINGS_LIST);
		createEOperation(bindingsSetEClass, BINDINGS_SET___BIND);
		createEOperation(bindingsSetEClass, BINDINGS_SET___UNBIND);

		symphony__CommonTopologyBindingsFacadeEClass = createEClass(SYMPHONY_COMMON_TOPOLOGY_BINDINGS_FACADE);
		createEOperation(symphony__CommonTopologyBindingsFacadeEClass, SYMPHONY_COMMON_TOPOLOGY_BINDINGS_FACADE___COPY__ABSTRACTTOPOLOGYBINDING_MAP);

		// Create enums
		axisEEnum = createEEnum(AXIS);
		angleUnitsEEnum = createEEnum(ANGLE_UNITS);

		// Create data types
		mapEDataType = createEDataType(MAP);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		Symphony__CommonTopologyPackage theSymphony__CommonTopologyPackage = (Symphony__CommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes
		rotationBindingEClass.getESuperTypes().add(this.getAbstractTopologyBinding());
		translationBindingEClass.getESuperTypes().add(this.getAbstractTopologyBinding());
		transformMatrixBindingEClass.getESuperTypes().add(this.getAbstractTopologyBinding());
		enumerationSwitchBindingEClass.getESuperTypes().add(this.getAbstractTopologyBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractTopologyBindingEClass, AbstractTopologyBinding.class, "AbstractTopologyBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTopologyBinding_Binded(), theEcorePackage.getEBoolean(), "binded", null, 0, 1, AbstractTopologyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTopologyBinding_Description(), theEcorePackage.getEString(), "description", null, 0, 1, AbstractTopologyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTopologyBinding_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractTopologyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTopologyBinding_Source(), theEcorePackage.getEObject(), null, "source", null, 0, 1, AbstractTopologyBinding.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTopologyBinding_FeatureNode(), theSymphony__CommonEMFPackage.getAbstractFeatureNode(), null, "featureNode", null, 0, 1, AbstractTopologyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTopologyBinding_FeatureNodeAdapter(), theSymphony__CommonEMFPackage.getFeatureNodeAdapter(), null, "featureNodeAdapter", null, 0, 1, AbstractTopologyBinding.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractTopologyBinding__Bind(), null, "bind", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractTopologyBinding__Unbind(), null, "unbind", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAbstractTopologyBinding__Clone__Map(), this.getAbstractTopologyBinding(), "clone", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getMap());
		EGenericType g2 = createEGenericType(theSymphony__CommonTopologyPackage.getNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSymphony__CommonTopologyPackage.getNode());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "originalToCopyNodeMap", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rotationBindingEClass, RotationBinding.class, "RotationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRotationBinding_RotationNode(), theSymphony__CommonTopologyPackage.getRotationNode(), null, "rotationNode", null, 0, 1, RotationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotationBinding_RotationAxis(), this.getAxis(), "rotationAxis", "X_AXIS", 0, 1, RotationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotationBinding_RotationUnits(), this.getAngleUnits(), "rotationUnits", "DEGREES", 0, 1, RotationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translationBindingEClass, TranslationBinding.class, "TranslationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTranslationBinding_PositionNode(), theSymphony__CommonTopologyPackage.getPositionNode(), null, "positionNode", null, 0, 1, TranslationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslationBinding_TranslationAxis(), this.getAxis(), "translationAxis", "X_AXIS", 0, 1, TranslationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformMatrixBindingEClass, TransformMatrixBinding.class, "TransformMatrixBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformMatrixBinding_TransformNode(), theSymphony__CommonTopologyPackage.getTransformNode(), null, "transformNode", null, 0, 1, TransformMatrixBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationSwitchBindingEClass, EnumerationSwitchBinding.class, "EnumerationSwitchBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationSwitchBinding_ParentNode(), theSymphony__CommonTopologyPackage.getGroupNode(), null, "parentNode", null, 1, 1, EnumerationSwitchBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationSwitchBinding_Cases(), this.getEnumerationCase(), null, "cases", null, 1, -1, EnumerationSwitchBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationSwitchBinding_ActiveCase(), this.getEnumerationCase(), null, "activeCase", null, 0, 1, EnumerationSwitchBinding.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationCaseEClass, EnumerationCase.class, "EnumerationCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationCase_EnumerationLiterals(), theEcorePackage.getEEnumLiteral(), null, "enumerationLiterals", null, 1, -1, EnumerationCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationCase_TopologyRoot(), theSymphony__CommonTopologyPackage.getNode(), null, "topologyRoot", null, 0, 1, EnumerationCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingsListEClass, BindingsList.class, "BindingsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingsList_Bindings(), this.getAbstractTopologyBinding(), null, "bindings", null, 0, -1, BindingsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureRootsListEClass, FeatureRootsList.class, "FeatureRootsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureRootsList_FeatureRoots(), theSymphony__CommonEMFPackage.getTreeRootNode(), null, "featureRoots", null, 0, -1, FeatureRootsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingsSetEClass, BindingsSet.class, "BindingsSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingsSet_FeatureRootsList(), this.getFeatureRootsList(), null, "featureRootsList", null, 1, 1, BindingsSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingsSet_BindingsList(), this.getBindingsList(), null, "bindingsList", null, 1, 1, BindingsSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBindingsSet__Bind(), null, "bind", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBindingsSet__Unbind(), null, "unbind", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(symphony__CommonTopologyBindingsFacadeEClass, Symphony__CommonTopologyBindingsFacade.class, "Symphony__CommonTopologyBindingsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSymphony__CommonTopologyBindingsFacade__Copy__AbstractTopologyBinding_Map(), this.getAbstractTopologyBinding(), "copy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTopologyBinding(), "originalBinding", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theSymphony__CommonTopologyPackage.getNode());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theSymphony__CommonTopologyPackage.getNode());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "originalToCopyNodeMap", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(axisEEnum, Axis.class, "Axis");
		addEEnumLiteral(axisEEnum, Axis.XAXIS);
		addEEnumLiteral(axisEEnum, Axis.YAXIS);
		addEEnumLiteral(axisEEnum, Axis.ZAXIS);
		addEEnumLiteral(axisEEnum, Axis.MINUS_XAXIS);
		addEEnumLiteral(axisEEnum, Axis.MINUS_YAXIS);
		addEEnumLiteral(axisEEnum, Axis.MINUS_ZAXIS);

		initEEnum(angleUnitsEEnum, AngleUnits.class, "AngleUnits");
		addEEnumLiteral(angleUnitsEEnum, AngleUnits.RADIANS);
		addEEnumLiteral(angleUnitsEEnum, AngleUnits.DEGREES);

		// Initialize data types
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonTopologyBindingsPackageImpl