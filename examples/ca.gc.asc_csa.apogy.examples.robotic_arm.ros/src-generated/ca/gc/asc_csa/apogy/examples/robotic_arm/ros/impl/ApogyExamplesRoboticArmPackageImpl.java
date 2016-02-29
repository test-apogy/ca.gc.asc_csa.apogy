/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2016
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl;

import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage;

import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmFactory;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmPackage;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesRoboticArmPackageImpl extends EPackageImpl implements ApogyExamplesRoboticArmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roboticArmROSEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyExamplesRoboticArmPackageImpl() {
		super(eNS_URI, ApogyExamplesRoboticArmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesRoboticArmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyExamplesRoboticArmPackage init() {
		if (isInited) return (ApogyExamplesRoboticArmPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesRoboticArmPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesRoboticArmPackageImpl theApogyExamplesRoboticArmPackage = (ApogyExamplesRoboticArmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesRoboticArmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesRoboticArmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmPackage.eINSTANCE.eClass();
		ApogyAddonsROSPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesRoboticArmPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesRoboticArmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesRoboticArmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesRoboticArmPackage.eNS_URI, theApogyExamplesRoboticArmPackage);
		return theApogyExamplesRoboticArmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoboticArmROS() {
		return roboticArmROSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoboticArmROS_RobotiocArmRosNode() {
		return (EReference)roboticArmROSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesRoboticArmFactory getApogyExamplesRoboticArmFactory() {
		return (ApogyExamplesRoboticArmFactory)getEFactoryInstance();
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
		roboticArmROSEClass = createEClass(ROBOTIC_ARM_ROS);
		createEReference(roboticArmROSEClass, ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE);
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

		// Obtain other dependent packages
		ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmPackage theApogyExamplesRoboticArmPackage_1 = (ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmPackage)EPackage.Registry.INSTANCE.getEPackage(ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmPackage.eNS_URI);
		ApogyAddonsROSPackage theApogyAddonsROSPackage = (ApogyAddonsROSPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsROSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roboticArmROSEClass.getESuperTypes().add(theApogyExamplesRoboticArmPackage_1.getRoboticArm());
		roboticArmROSEClass.getESuperTypes().add(theApogyAddonsROSPackage.getROSInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(roboticArmROSEClass, RoboticArmROS.class, "RoboticArmROS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoboticArmROS_RobotiocArmRosNode(), theApogyAddonsROSPackage.getROSNode(), null, "robotiocArmRosNode", null, 0, 1, RoboticArmROS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyExamplesRoboticArm",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyExamplesRoboticArm",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.robotic_arm.ros/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.robotic_arm.edit.ros/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples.robotic_arm"
		   });
	}

} //ApogyExamplesRoboticArmPackageImpl