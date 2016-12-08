/**
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
package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.swt.widgets.Composite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEMFUiEMFFormsFactoryImpl extends EFactoryImpl implements ApogyCommonEMFUiEMFFormsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonEMFUiEMFFormsFactory init() {
		try {
			ApogyCommonEMFUiEMFFormsFactory theApogyCommonEMFUiEMFFormsFactory = (ApogyCommonEMFUiEMFFormsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonEMFUiEMFFormsPackage.eNS_URI);
			if (theApogyCommonEMFUiEMFFormsFactory != null) {
				return theApogyCommonEMFUiEMFFormsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonEMFUiEMFFormsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFUiEMFFormsFactoryImpl() {
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
			case ApogyCommonEMFUiEMFFormsPackage.APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE: return createApogyCommonEMFUiEMFFormsFacade();
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
			case ApogyCommonEMFUiEMFFormsPackage.COMPOSITE:
				return createCompositeFromString(eDataType, initialValue);
			case ApogyCommonEMFUiEMFFormsPackage.VVIEW:
				return createVViewFromString(eDataType, initialValue);
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
			case ApogyCommonEMFUiEMFFormsPackage.COMPOSITE:
				return convertCompositeToString(eDataType, instanceValue);
			case ApogyCommonEMFUiEMFFormsPackage.VVIEW:
				return convertVViewToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFUiEMFFormsFacade createApogyCommonEMFUiEMFFormsFacade() {
		ApogyCommonEMFUiEMFFormsFacadeImpl apogyCommonEMFUiEMFFormsFacade = new ApogyCommonEMFUiEMFFormsFacadeImpl();
		return apogyCommonEMFUiEMFFormsFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createCompositeFromString(EDataType eDataType, String initialValue) {
		return (Composite)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompositeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VView createVViewFromString(EDataType eDataType, String initialValue) {
		return (VView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFUiEMFFormsPackage getApogyCommonEMFUiEMFFormsPackage() {
		return (ApogyCommonEMFUiEMFFormsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonEMFUiEMFFormsPackage getPackage() {
		return ApogyCommonEMFUiEMFFormsPackage.eINSTANCE;
	}

} //ApogyCommonEMFUiEMFFormsFactoryImpl
