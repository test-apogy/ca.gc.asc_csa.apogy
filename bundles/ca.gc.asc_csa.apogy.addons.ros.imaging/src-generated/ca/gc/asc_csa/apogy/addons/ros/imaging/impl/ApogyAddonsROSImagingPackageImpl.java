package ca.gc.asc_csa.apogy.addons.ros.imaging.impl;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFacade;
import ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingFactory;
import ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingPackage;

import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage;

import org.ros.node.ConnectedNode;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsROSImagingPackageImpl extends EPackageImpl implements ApogyAddonsROSImagingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyAddonsROSImagingFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compressedImageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectedNodeEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsROSImagingPackageImpl() {
		super(eNS_URI, ApogyAddonsROSImagingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyAddonsROSImagingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsROSImagingPackage init() {
		if (isInited) return (ApogyAddonsROSImagingPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsROSImagingPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsROSImagingPackageImpl theApogyAddonsROSImagingPackage = (ApogyAddonsROSImagingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsROSImagingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsROSImagingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonImagesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsROSImagingPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsROSImagingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsROSImagingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsROSImagingPackage.eNS_URI, theApogyAddonsROSImagingPackage);
		return theApogyAddonsROSImagingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyAddonsROSImagingFacade() {
		return apogyAddonsROSImagingFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSImagingFacade__ConvertToEImage__Image() {
		return apogyAddonsROSImagingFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSImagingFacade__ConvertToEImage__CompressedImage() {
		return apogyAddonsROSImagingFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSImagingFacade__ConvertToCompressedImage__EImage_ConnectedNode() {
		return apogyAddonsROSImagingFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyAddonsROSImagingFacade__ConvertToCompressedImage__ImageData_ConnectedNode() {
		return apogyAddonsROSImagingFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImage() {
		return imageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompressedImage() {
		return compressedImageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectedNode() {
		return connectedNodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSImagingFactory getApogyAddonsROSImagingFactory() {
		return (ApogyAddonsROSImagingFactory)getEFactoryInstance();
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
		apogyAddonsROSImagingFacadeEClass = createEClass(APOGY_ADDONS_ROS_IMAGING_FACADE);
		createEOperation(apogyAddonsROSImagingFacadeEClass, APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__IMAGE);
		createEOperation(apogyAddonsROSImagingFacadeEClass, APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_EIMAGE__COMPRESSEDIMAGE);
		createEOperation(apogyAddonsROSImagingFacadeEClass, APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__EIMAGE_CONNECTEDNODE);
		createEOperation(apogyAddonsROSImagingFacadeEClass, APOGY_ADDONS_ROS_IMAGING_FACADE___CONVERT_TO_COMPRESSED_IMAGE__IMAGEDATA_CONNECTEDNODE);

		// Create data types
		imageEDataType = createEDataType(IMAGE);
		compressedImageEDataType = createEDataType(COMPRESSED_IMAGE);
		connectedNodeEDataType = createEDataType(CONNECTED_NODE);
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
		ApogyCommonImagesPackage theApogyCommonImagesPackage = (ApogyCommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonImagesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyAddonsROSImagingFacadeEClass, ApogyAddonsROSImagingFacade.class, "ApogyAddonsROSImagingFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyAddonsROSImagingFacade__ConvertToEImage__Image(), theApogyCommonImagesPackage.getEImage(), "convertToEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImage(), "rosImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSImagingFacade__ConvertToEImage__CompressedImage(), theApogyCommonImagesPackage.getEImage(), "convertToEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompressedImage(), "compressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSImagingFacade__ConvertToCompressedImage__EImage_ConnectedNode(), this.getCompressedImage(), "convertToCompressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonImagesPackage.getEImage(), "eImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyAddonsROSImagingFacade__ConvertToCompressedImage__ImageData_ConnectedNode(), this.getCompressedImage(), "convertToCompressedImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonImagesPackage.getImageData(), "imageData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectedNode(), "connectedNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(imageEDataType, Image.class, "Image", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(compressedImageEDataType, CompressedImage.class, "CompressedImage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectedNodeEDataType, ConnectedNode.class, "ConnectedNode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyAddonsROSImagingPackageImpl
