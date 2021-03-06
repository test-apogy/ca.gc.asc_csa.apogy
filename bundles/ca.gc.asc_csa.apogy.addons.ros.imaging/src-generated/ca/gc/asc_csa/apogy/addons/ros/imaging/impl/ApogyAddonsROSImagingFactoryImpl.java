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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.addons.ros.imaging.*;

import org.ros.node.ConnectedNode;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsROSImagingFactoryImpl extends EFactoryImpl implements ApogyAddonsROSImagingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsROSImagingFactory init() {
		try {
			ApogyAddonsROSImagingFactory theApogyAddonsROSImagingFactory = (ApogyAddonsROSImagingFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsROSImagingPackage.eNS_URI);
			if (theApogyAddonsROSImagingFactory != null) {
				return theApogyAddonsROSImagingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsROSImagingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSImagingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyAddonsROSImagingPackage.APOGY_ADDONS_ROS_IMAGING_FACADE: return createApogyAddonsROSImagingFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsROSImagingPackage.IMAGE:
				return createImageFromString(eDataType, initialValue);
			case ApogyAddonsROSImagingPackage.COMPRESSED_IMAGE:
				return createCompressedImageFromString(eDataType, initialValue);
			case ApogyAddonsROSImagingPackage.CONNECTED_NODE:
				return createConnectedNodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsROSImagingPackage.IMAGE:
				return convertImageToString(eDataType, instanceValue);
			case ApogyAddonsROSImagingPackage.COMPRESSED_IMAGE:
				return convertCompressedImageToString(eDataType, instanceValue);
			case ApogyAddonsROSImagingPackage.CONNECTED_NODE:
				return convertConnectedNodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSImagingFacade createApogyAddonsROSImagingFacade() {
		ApogyAddonsROSImagingFacadeImpl apogyAddonsROSImagingFacade = new ApogyAddonsROSImagingFacadeImpl();
		return apogyAddonsROSImagingFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImageFromString(EDataType eDataType, String initialValue) {
		return (Image)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressedImage createCompressedImageFromString(EDataType eDataType, String initialValue) {
		return (CompressedImage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressedImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedNode createConnectedNodeFromString(EDataType eDataType, String initialValue) {
		return (ConnectedNode)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectedNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSImagingPackage getApogyAddonsROSImagingPackage() {
		return (ApogyAddonsROSImagingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsROSImagingPackage getPackage() {
		return ApogyAddonsROSImagingPackage.eINSTANCE;
	}

} //ApogyAddonsROSImagingFactoryImpl
