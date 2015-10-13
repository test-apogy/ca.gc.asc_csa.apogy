/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyFactory;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyPackage;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributor;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributors;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorProvider;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentContributor;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentContributors;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfUiPropertyPackageImpl extends EPackageImpl implements EmfUiPropertyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCellEditorContributorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCellEditorContributorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCellViewerContentContributorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCellViewerContentContributorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyCellEditorProviderEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyCellViewerContentProviderEDataType = null;

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
	 * @see org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfUiPropertyPackageImpl() {
		super(eNS_URI, EmfUiPropertyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EmfUiPropertyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfUiPropertyPackage init() {
		if (isInited) return (EmfUiPropertyPackage)EPackage.Registry.INSTANCE.getEPackage(EmfUiPropertyPackage.eNS_URI);

		// Obtain or create and register package
		EmfUiPropertyPackageImpl theEmfUiPropertyPackage = (EmfUiPropertyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfUiPropertyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfUiPropertyPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEmfUiPropertyPackage.createPackageContents();

		// Initialize created meta-data
		theEmfUiPropertyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfUiPropertyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfUiPropertyPackage.eNS_URI, theEmfUiPropertyPackage);
		return theEmfUiPropertyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCellEditorContributor() {
		return propertyCellEditorContributorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCellEditorContributor_Target() {
		return (EAttribute)propertyCellEditorContributorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCellEditorContributor_CellEditorProvider() {
		return (EAttribute)propertyCellEditorContributorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCellEditorContributors() {
		return propertyCellEditorContributorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCellEditorContributors_List() {
		return (EReference)propertyCellEditorContributorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCellViewerContentContributor() {
		return propertyCellViewerContentContributorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCellViewerContentContributor_Target() {
		return (EAttribute)propertyCellViewerContentContributorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyCellViewerContentContributor_CellViewerContentProvider() {
		return (EAttribute)propertyCellViewerContentContributorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyCellViewerContentContributors() {
		return propertyCellViewerContentContributorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyCellViewerContentContributors_List() {
		return (EReference)propertyCellViewerContentContributorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyCellEditorProvider() {
		return propertyCellEditorProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyCellViewerContentProvider() {
		return propertyCellViewerContentProviderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfUiPropertyFactory getEmfUiPropertyFactory() {
		return (EmfUiPropertyFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		propertyCellEditorContributorEClass = createEClass(PROPERTY_CELL_EDITOR_CONTRIBUTOR);
		createEAttribute(propertyCellEditorContributorEClass, PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET);
		createEAttribute(propertyCellEditorContributorEClass, PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER);

		propertyCellEditorContributorsEClass = createEClass(PROPERTY_CELL_EDITOR_CONTRIBUTORS);
		createEReference(propertyCellEditorContributorsEClass, PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST);

		propertyCellViewerContentContributorEClass = createEClass(PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR);
		createEAttribute(propertyCellViewerContentContributorEClass, PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET);
		createEAttribute(propertyCellViewerContentContributorEClass, PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER);

		propertyCellViewerContentContributorsEClass = createEClass(PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS);
		createEReference(propertyCellViewerContentContributorsEClass, PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST);

		// Create data types
		propertyCellEditorProviderEDataType = createEDataType(PROPERTY_CELL_EDITOR_PROVIDER);
		propertyCellViewerContentProviderEDataType = createEDataType(PROPERTY_CELL_VIEWER_CONTENT_PROVIDER);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(propertyCellEditorContributorEClass, PropertyCellEditorContributor.class, "PropertyCellEditorContributor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getPropertyCellEditorContributor_Target(), g1, "target", null, 0, 1, PropertyCellEditorContributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyCellEditorContributor_CellEditorProvider(), this.getPropertyCellEditorProvider(), "cellEditorProvider", null, 0, 1, PropertyCellEditorContributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCellEditorContributorsEClass, PropertyCellEditorContributors.class, "PropertyCellEditorContributors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyCellEditorContributors_List(), this.getPropertyCellEditorContributor(), null, "list", null, 0, -1, PropertyCellEditorContributors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCellViewerContentContributorEClass, PropertyCellViewerContentContributor.class, "PropertyCellViewerContentContributor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getPropertyCellViewerContentContributor_Target(), g1, "target", null, 0, 1, PropertyCellViewerContentContributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyCellViewerContentContributor_CellViewerContentProvider(), this.getPropertyCellViewerContentProvider(), "cellViewerContentProvider", null, 0, 1, PropertyCellViewerContentContributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCellViewerContentContributorsEClass, PropertyCellViewerContentContributors.class, "PropertyCellViewerContentContributors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyCellViewerContentContributors_List(), this.getPropertyCellViewerContentContributor(), null, "list", null, 0, -1, PropertyCellViewerContentContributors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(propertyCellEditorProviderEDataType, PropertyCellEditorProvider.class, "PropertyCellEditorProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyCellViewerContentProviderEDataType, PropertyCellViewerContentProvider.class, "PropertyCellViewerContentProvider", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EmfUiPropertyPackageImpl
