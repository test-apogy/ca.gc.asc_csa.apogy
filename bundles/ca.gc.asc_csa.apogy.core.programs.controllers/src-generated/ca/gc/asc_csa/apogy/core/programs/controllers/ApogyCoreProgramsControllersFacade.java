package ca.gc.asc_csa.apogy.core.programs.controllers;
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

import java.util.List;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import ca.gc.asc_csa.apogy.core.programs.controllers.impl.ApogyCoreProgramsControllersFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Utilities
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getApogyCoreProgramsControllersFacade()
 * @model
 * @generated
 */
public interface ApogyCoreProgramsControllersFacade extends EObject
{
  public static ApogyCoreProgramsControllersFacade INSTANCE = ApogyCoreProgramsControllersFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eParameterUnique="false" valueUnique="false"
	 * @generated
	 */
  Object createValue(EParameter eParameter, float value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.programs.controllers.TreeSet<ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint>" unique="false" pointsDataType="ca.gc.asc_csa.apogy.core.programs.controllers.List<ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	TreeSet<CustomInputConditioningPoint> sortCustomInputConditioningPoint(List<CustomInputConditioningPoint> points);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" inputValueUnique="false" outputValueUnique="false"
	 * @generated
	 */
	CustomInputConditioningPoint createCustomInputConditioningPoint(double inputValue, double outputValue);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activates/Deactivates the controllerConfiguration and makes sure there is only one active configuration.
	 * @param controllersConfiguration Reference to the ControllersConfiguration to activate.
	 * @param active Value to set
	 * <!-- end-model-doc -->
	 * @model controllersConfigurationUnique="false" activeUnique="false"
	 * @generated
	 */
	void setActiveControllersConfiguration(ControllersConfiguration controllersConfiguration, Boolean active);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" toggleValueSourceUnique="false"
	 * @generated
	 */
	String getToggleValueSourceString(ToggleValueSource toggleValueSource);

} // ApogyCoreProgramsControllersFacade
