package ca.gc.asc_csa.apogy.common.emf.ui.impl;
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

import ca.gc.asc_csa.apogy.common.emf.Named;
import java.util.List;
import javax.measure.unit.Unit;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Color;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFactory;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEMFUIFactoryImpl extends EFactoryImpl implements ApogyCommonEMFUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCommonEMFUIFactory init()
  {
		try {
			ApogyCommonEMFUIFactory theApogyCommonEMFUIFactory = (ApogyCommonEMFUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonEMFUIPackage.eNS_URI);
			if (theApogyCommonEMFUIFactory != null) {
				return theApogyCommonEMFUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonEMFUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCommonEMFUIFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ApogyCommonEMFUIPackage.APOGY_COMMON_EMFUI_FACADE: return createApogyCommonEMFUIFacade();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonEMFUIPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case ApogyCommonEMFUIPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case ApogyCommonEMFUIPackage.LIST:
				return createListFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonEMFUIPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case ApogyCommonEMFUIPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case ApogyCommonEMFUIPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFUIFacade createApogyCommonEMFUIFacade() {
		ApogyCommonEMFUIFacadeImpl apogyCommonEMFUIFacade = new ApogyCommonEMFUIFacadeImpl();
		return apogyCommonEMFUIFacade;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
		return (Color)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
		public Unit<?> createUnitFromString(EDataType eDataType, String initialValue)
  {
		return (Unit<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertUnitToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<? extends Named> createListFromString(EDataType eDataType, String initialValue) {
		return (List<? extends Named>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFUIPackage getApogyCommonEMFUIPackage() {
		return (ApogyCommonEMFUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCommonEMFUIPackage getPackage()
  {
		return ApogyCommonEMFUIPackage.eINSTANCE;
	}

} //ApogyCommonEMFUIFactoryImpl
