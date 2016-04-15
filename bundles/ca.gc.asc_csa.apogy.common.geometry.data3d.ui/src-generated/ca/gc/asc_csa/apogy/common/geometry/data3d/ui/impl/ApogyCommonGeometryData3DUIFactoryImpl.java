package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DUIFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryData3DUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryData3DUIFactory init() {
		try {
			ApogyCommonGeometryData3DUIFactory theApogyCommonGeometryData3DUIFactory = (ApogyCommonGeometryData3DUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryData3DUIPackage.eNS_URI);
			if (theApogyCommonGeometryData3DUIFactory != null) {
				return theApogyCommonGeometryData3DUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryData3DUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DUIFactoryImpl() {
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
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION: return createCartesianCoordinatesSetPresentation();
			case ApogyCommonGeometryData3DUIPackage.COLORED_CARTESIAN_COORDINATES_SET_PRESENTATION: return createColoredCartesianCoordinatesSetPresentation();
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION: return createCartesianTriangularMeshPresentation();
			case ApogyCommonGeometryData3DUIPackage.COLORED_TRIANGULAR_MESH_PRESENTATION: return createColoredTriangularMeshPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetPresentation createCartesianCoordinatesSetPresentation() {
		CartesianCoordinatesSetPresentationImpl cartesianCoordinatesSetPresentation = new CartesianCoordinatesSetPresentationImpl();
		return cartesianCoordinatesSetPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredCartesianCoordinatesSetPresentation createColoredCartesianCoordinatesSetPresentation() {
		ColoredCartesianCoordinatesSetPresentationImpl coloredCartesianCoordinatesSetPresentation = new ColoredCartesianCoordinatesSetPresentationImpl();
		return coloredCartesianCoordinatesSetPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshPresentation createCartesianTriangularMeshPresentation() {
		CartesianTriangularMeshPresentationImpl cartesianTriangularMeshPresentation = new CartesianTriangularMeshPresentationImpl();
		return cartesianTriangularMeshPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredTriangularMeshPresentation createColoredTriangularMeshPresentation() {
		ColoredTriangularMeshPresentationImpl coloredTriangularMeshPresentation = new ColoredTriangularMeshPresentationImpl();
		return coloredTriangularMeshPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DUIPackage getApogyCommonGeometryData3DUIPackage() {
		return (ApogyCommonGeometryData3DUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryData3DUIPackage getPackage() {
		return ApogyCommonGeometryData3DUIPackage.eINSTANCE;
	}

} //ApogyCommonGeometryData3DUIFactoryImpl
