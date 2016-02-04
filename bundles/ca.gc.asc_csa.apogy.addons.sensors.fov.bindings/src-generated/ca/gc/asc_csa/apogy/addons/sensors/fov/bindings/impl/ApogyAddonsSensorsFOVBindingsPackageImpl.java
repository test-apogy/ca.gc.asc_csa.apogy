package ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ConicalFieldOfViewBinding;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsFOVBindingsPackageImpl extends EPackageImpl implements ApogyAddonsSensorsFOVBindingsPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass circularSectorFieldOfViewBindingEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass conicalFieldOfViewBindingEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rectangularFrustrumFieldOfViewBindingEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyAddonsSensorsFOVBindingsPackageImpl()
  {
		super(eNS_URI, ApogyAddonsSensorsFOVBindingsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsSensorsFOVBindingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyAddonsSensorsFOVBindingsPackage init()
  {
		if (isInited) return (ApogyAddonsSensorsFOVBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVBindingsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsSensorsFOVBindingsPackageImpl theApogyAddonsSensorsFOVBindingsPackage = (ApogyAddonsSensorsFOVBindingsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsSensorsFOVBindingsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsSensorsFOVBindingsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyBindingsPackage.eINSTANCE.eClass();
		ApogyAddonsSensorsFOVPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsSensorsFOVBindingsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsSensorsFOVBindingsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsSensorsFOVBindingsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsSensorsFOVBindingsPackage.eNS_URI, theApogyAddonsSensorsFOVBindingsPackage);
		return theApogyAddonsSensorsFOVBindingsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCircularSectorFieldOfViewBinding()
  {
		return circularSectorFieldOfViewBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCircularSectorFieldOfViewBinding_Fov()
  {
		return (EReference)circularSectorFieldOfViewBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getConicalFieldOfViewBinding()
  {
		return conicalFieldOfViewBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getConicalFieldOfViewBinding_Fov()
  {
		return (EReference)conicalFieldOfViewBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRectangularFrustrumFieldOfViewBinding()
  {
		return rectangularFrustrumFieldOfViewBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRectangularFrustrumFieldOfViewBinding_Fov()
  {
		return (EReference)rectangularFrustrumFieldOfViewBindingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsFOVBindingsFactory getApogyAddonsSensorsFOVBindingsFactory() {
		return (ApogyAddonsSensorsFOVBindingsFactory)getEFactoryInstance();
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
		circularSectorFieldOfViewBindingEClass = createEClass(CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING);
		createEReference(circularSectorFieldOfViewBindingEClass, CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV);

		conicalFieldOfViewBindingEClass = createEClass(CONICAL_FIELD_OF_VIEW_BINDING);
		createEReference(conicalFieldOfViewBindingEClass, CONICAL_FIELD_OF_VIEW_BINDING__FOV);

		rectangularFrustrumFieldOfViewBindingEClass = createEClass(RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING);
		createEReference(rectangularFrustrumFieldOfViewBindingEClass, RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV);
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
		ApogyCommonTopologyBindingsPackage theApogyCommonTopologyBindingsPackage = (ApogyCommonTopologyBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyBindingsPackage.eNS_URI);
		ApogyAddonsSensorsFOVPackage theApogyAddonsSensorsFOVPackage = (ApogyAddonsSensorsFOVPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsSensorsFOVPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		circularSectorFieldOfViewBindingEClass.getESuperTypes().add(theApogyCommonTopologyBindingsPackage.getAbstractTopologyBinding());
		conicalFieldOfViewBindingEClass.getESuperTypes().add(theApogyCommonTopologyBindingsPackage.getAbstractTopologyBinding());
		rectangularFrustrumFieldOfViewBindingEClass.getESuperTypes().add(theApogyCommonTopologyBindingsPackage.getAbstractTopologyBinding());

		// Initialize classes, features, and operations; add parameters
		initEClass(circularSectorFieldOfViewBindingEClass, CircularSectorFieldOfViewBinding.class, "CircularSectorFieldOfViewBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircularSectorFieldOfViewBinding_Fov(), theApogyAddonsSensorsFOVPackage.getCircularSectorFieldOfView(), null, "fov", null, 0, 1, CircularSectorFieldOfViewBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conicalFieldOfViewBindingEClass, ConicalFieldOfViewBinding.class, "ConicalFieldOfViewBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConicalFieldOfViewBinding_Fov(), theApogyAddonsSensorsFOVPackage.getConicalFieldOfView(), null, "fov", null, 0, 1, ConicalFieldOfViewBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangularFrustrumFieldOfViewBindingEClass, RectangularFrustrumFieldOfViewBinding.class, "RectangularFrustrumFieldOfViewBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangularFrustrumFieldOfViewBinding_Fov(), theApogyAddonsSensorsFOVPackage.getRectangularFrustrumFieldOfView(), null, "fov", null, 0, 1, RectangularFrustrumFieldOfViewBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsSensorsFOVBindingsPackageImpl
