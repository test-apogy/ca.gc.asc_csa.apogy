package ca.gc.asc_csa.apogy.addons.actuators.impl;
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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator;
import ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus;
import ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsFactory;
import ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage;
import ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsActuatorsPackageImpl extends EPackageImpl implements ApogyAddonsActuatorsPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractActuatorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass panTiltUnitEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum actuatorStatusEEnum = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyAddonsActuatorsPackageImpl()
  {
		super(eNS_URI, ApogyAddonsActuatorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsActuatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyAddonsActuatorsPackage init()
  {
		if (isInited) return (ApogyAddonsActuatorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsActuatorsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsActuatorsPackageImpl theApogyAddonsActuatorsPackage = (ApogyAddonsActuatorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsActuatorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsActuatorsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsActuatorsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsActuatorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsActuatorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsActuatorsPackage.eNS_URI, theApogyAddonsActuatorsPackage);
		return theApogyAddonsActuatorsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractActuator()
  {
		return abstractActuatorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractActuator_Moving()
  {
		return (EAttribute)abstractActuatorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractActuator_ActuatorStatus()
  {
		return (EAttribute)abstractActuatorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPanTiltUnit()
  {
		return panTiltUnitEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPanTiltUnit_CurrentPanAngle()
  {
		return (EAttribute)panTiltUnitEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPanTiltUnit_CurrentTiltAngle()
  {
		return (EAttribute)panTiltUnitEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPanTiltUnit_CommandedPanAngle()
  {
		return (EAttribute)panTiltUnitEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPanTiltUnit_CommandedTiltAngle()
  {
		return (EAttribute)panTiltUnitEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__GetMaximumPanAngle()
  {
		return panTiltUnitEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__GetMinimumPanAngle()
  {
		return panTiltUnitEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__GetMaximumTiltAngle()
  {
		return panTiltUnitEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__GetMinimumTiltAngle()
  {
		return panTiltUnitEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__MoveToPanTilt__double_double()
  {
		return panTiltUnitEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__MoveToPan__double()
  {
		return panTiltUnitEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__MoveToTilt__double()
  {
		return panTiltUnitEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__MoveByPanTilt__double_double()
  {
		return panTiltUnitEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__MoveByPan__double()
  {
		return panTiltUnitEClass.getEOperations().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__MoveByTilt__double()
  {
		return panTiltUnitEClass.getEOperations().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPanTiltUnit__StopMotion()
  {
		return panTiltUnitEClass.getEOperations().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getActuatorStatus()
  {
		return actuatorStatusEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsActuatorsFactory getApogyAddonsActuatorsFactory() {
		return (ApogyAddonsActuatorsFactory)getEFactoryInstance();
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
		abstractActuatorEClass = createEClass(ABSTRACT_ACTUATOR);
		createEAttribute(abstractActuatorEClass, ABSTRACT_ACTUATOR__MOVING);
		createEAttribute(abstractActuatorEClass, ABSTRACT_ACTUATOR__ACTUATOR_STATUS);

		panTiltUnitEClass = createEClass(PAN_TILT_UNIT);
		createEAttribute(panTiltUnitEClass, PAN_TILT_UNIT__CURRENT_PAN_ANGLE);
		createEAttribute(panTiltUnitEClass, PAN_TILT_UNIT__CURRENT_TILT_ANGLE);
		createEAttribute(panTiltUnitEClass, PAN_TILT_UNIT__COMMANDED_PAN_ANGLE);
		createEAttribute(panTiltUnitEClass, PAN_TILT_UNIT__COMMANDED_TILT_ANGLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___GET_MAXIMUM_PAN_ANGLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___GET_MINIMUM_PAN_ANGLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___GET_MAXIMUM_TILT_ANGLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___GET_MINIMUM_TILT_ANGLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___MOVE_TO_PAN__DOUBLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___MOVE_TO_TILT__DOUBLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___MOVE_BY_PAN__DOUBLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___MOVE_BY_TILT__DOUBLE);
		createEOperation(panTiltUnitEClass, PAN_TILT_UNIT___STOP_MOTION);

		// Create enums
		actuatorStatusEEnum = createEEnum(ACTUATOR_STATUS);
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
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractActuatorEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getNode());
		panTiltUnitEClass.getESuperTypes().add(this.getAbstractActuator());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractActuatorEClass, AbstractActuator.class, "AbstractActuator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractActuator_Moving(), theEcorePackage.getEBoolean(), "moving", "false", 0, 1, AbstractActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActuator_ActuatorStatus(), this.getActuatorStatus(), "actuatorStatus", null, 0, 1, AbstractActuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(panTiltUnitEClass, PanTiltUnit.class, "PanTiltUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanTiltUnit_CurrentPanAngle(), theEcorePackage.getEDouble(), "currentPanAngle", "0.0", 0, 1, PanTiltUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanTiltUnit_CurrentTiltAngle(), theEcorePackage.getEDouble(), "currentTiltAngle", "0.0", 0, 1, PanTiltUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanTiltUnit_CommandedPanAngle(), theEcorePackage.getEDouble(), "commandedPanAngle", "0.0", 0, 1, PanTiltUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPanTiltUnit_CommandedTiltAngle(), theEcorePackage.getEDouble(), "commandedTiltAngle", "0.0", 0, 1, PanTiltUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPanTiltUnit__GetMaximumPanAngle(), theEcorePackage.getEDouble(), "getMaximumPanAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPanTiltUnit__GetMinimumPanAngle(), theEcorePackage.getEDouble(), "getMinimumPanAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPanTiltUnit__GetMaximumTiltAngle(), theEcorePackage.getEDouble(), "getMaximumTiltAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPanTiltUnit__GetMinimumTiltAngle(), theEcorePackage.getEDouble(), "getMinimumTiltAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPanTiltUnit__MoveToPanTilt__double_double(), theEcorePackage.getEBoolean(), "moveToPanTilt", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "panAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tiltAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPanTiltUnit__MoveToPan__double(), theEcorePackage.getEBoolean(), "moveToPan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "panAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPanTiltUnit__MoveToTilt__double(), theEcorePackage.getEBoolean(), "moveToTilt", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tiltAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPanTiltUnit__MoveByPanTilt__double_double(), theEcorePackage.getEBoolean(), "moveByPanTilt", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "panAngleDelta", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tiltAngleDelta", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPanTiltUnit__MoveByPan__double(), theEcorePackage.getEBoolean(), "moveByPan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "panAngleDelta", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPanTiltUnit__MoveByTilt__double(), theEcorePackage.getEBoolean(), "moveByTilt", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "tiltAngleDelta", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPanTiltUnit__StopMotion(), theEcorePackage.getEBoolean(), "stopMotion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actuatorStatusEEnum, ActuatorStatus.class, "ActuatorStatus");
		addEEnumLiteral(actuatorStatusEEnum, ActuatorStatus.OFF);
		addEEnumLiteral(actuatorStatusEEnum, ActuatorStatus.READY);
		addEEnumLiteral(actuatorStatusEEnum, ActuatorStatus.BUSY);
		addEEnumLiteral(actuatorStatusEEnum, ActuatorStatus.FAILED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

  /**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyAddonsActuators",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "modelName", "ApogyAddonsActuators",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons.actuators/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.actuators.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.addons"
		   });	
		addAnnotation
		  (getAbstractActuator_Moving(), 
		   source, 
		   new String[] {
			 "documentation", "*\nWhether or not the actuator is moving.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "ACTUATOR_INFORMATION"
		   });	
		addAnnotation
		  (getAbstractActuator_ActuatorStatus(), 
		   source, 
		   new String[] {
			 "documentation", "*\nCurrent state of the actuator.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "ACTUATOR_INFORMATION"
		   });	
		addAnnotation
		  (getPanTiltUnit__GetMaximumPanAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Return the maximum pan angle.\n@return The maximum pan angle,in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__GetMinimumPanAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Return the minimum pan angle.\n@return The minimum pan angle,in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__GetMaximumTiltAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Return the maximum tilt angle.\n@return The maximum tilt angle,in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__GetMinimumTiltAngle(), 
		   source, 
		   new String[] {
			 "documentation", "Return the minimum tilt angle.\n@return The minimum tilt angle,in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__MoveToPanTilt__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Commands the PTU to move to absolute pan and tilt angle.\n@param panAngle The commanded pan angle, in radians.\n@param tiltAngle The commanded tilt angle, in radians.\n@return True of successful, false otherwise."
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveToPanTilt__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveToPanTilt__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__MoveToPan__double(), 
		   source, 
		   new String[] {
			 "documentation", "Commands the PTU to move to absolute pan angle.\n@param panAngle The commanded pan angle, in radians.\n@return True of successful, false otherwise."
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveToPan__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__MoveToTilt__double(), 
		   source, 
		   new String[] {
			 "documentation", "Commands the PTU to move to absolute tilt angle.\n@param tiltAngle The commanded tilt angle, in radians.\n@return True of successful, false otherwise."
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveToTilt__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__MoveByPanTilt__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Commands the PTU to move by to relative pan and tilt angle.\n@param panAngleDelta The commanded pan angle delta, in radians.\n@param tiltAngleDelta The commanded tilt angle delta, in radians.\n@return True of successful, false otherwise."
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveByPanTilt__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveByPanTilt__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__MoveByPan__double(), 
		   source, 
		   new String[] {
			 "documentation", "Commands the PTU to move by to a relative pan angle.\n@param panAngleDelta The commanded pan angle delta, in radians.\n@return True of successful, false otherwise."
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveByPan__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__MoveByTilt__double(), 
		   source, 
		   new String[] {
			 "documentation", "Commands the PTU to move by to a relative tilt angle.\n@param tiltAngleDelta The commanded tilt angle delta, in radians.\n@return True of successful, false otherwise."
		   });	
		addAnnotation
		  ((getPanTiltUnit__MoveByTilt__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit__StopMotion(), 
		   source, 
		   new String[] {
			 "documentation", "Commands the PTU to stop moving.\n@return True of successful, false otherwise."
		   });	
		addAnnotation
		  (getPanTiltUnit_CurrentPanAngle(), 
		   source, 
		   new String[] {
			 "documentation", " Current pan angle, in radians.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "ACTUATOR_INFORMATION",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit_CurrentTiltAngle(), 
		   source, 
		   new String[] {
			 "documentation", " Current tilt angle, in radians.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "ACTUATOR_INFORMATION",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit_CommandedPanAngle(), 
		   source, 
		   new String[] {
			 "documentation", " Last commanded pan angle, in radians.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "ACTUATOR_INFORMATION",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPanTiltUnit_CommandedTiltAngle(), 
		   source, 
		   new String[] {
			 "documentation", " Last commanded tilt angle, in radians.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "ACTUATOR_INFORMATION",
			 "apogy_units", "rad"
		   });
	}

} //ApogyAddonsActuatorsPackageImpl
