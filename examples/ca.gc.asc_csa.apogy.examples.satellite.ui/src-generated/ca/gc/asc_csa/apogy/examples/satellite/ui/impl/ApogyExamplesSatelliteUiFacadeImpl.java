package ca.gc.asc_csa.apogy.examples.satellite.ui.impl;
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

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiFacadeImpl#getConstellationVariableName <em>Constellation Variable Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyExamplesSatelliteUiFacadeImpl extends MinimalEObjectImpl.Container implements ApogyExamplesSatelliteUiFacade {

	/**
	 * The default value of the '{@link #getConstellationVariableName() <em>Constellation Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTELLATION_VARIABLE_NAME_EDEFAULT = "constellation";

	/**
	 * The cached value of the '{@link #getConstellationVariableName() <em>Constellation Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationVariableName()
	 * @generated
	 * @ordered
	 */
	protected String constellationVariableName = CONSTELLATION_VARIABLE_NAME_EDEFAULT;

	private static ApogyExamplesSatelliteUiFacade instance = null;

	public static ApogyExamplesSatelliteUiFacade getInstance() {
		if (instance == null) {
			instance = new ApogyExamplesSatelliteUiFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyExamplesSatelliteUiFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatelliteUiPackage.Literals.APOGY_EXAMPLES_SATELLITE_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstellationVariableName() {
		return constellationVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Variable getConstellationVariable() {
		List<Variable> variables = ApogyCoreInvocatorFacade.INSTANCE.getVariableByName(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession(), getConstellationVariableName());		
		return variables.isEmpty() ? null : variables.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public OperationCallResultsList getOperationCallResultsList() {
		OperationCallResultsList operationCallResultsList = null;
		
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session != null){
			Environment environment = session.getEnvironment();
			if (environment != null){
				Context context = environment.getActiveContext();
				if (context != null){
					DataProductsList dataProductsList = context.getDataProductsList();
					if (dataProductsList != null){
						operationCallResultsList = dataProductsList.getOperationCallResultsList();
					}
				}
			}
		}
		
		return operationCallResultsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatelliteUiPackage.APOGY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME:
				return getConstellationVariableName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyExamplesSatelliteUiPackage.APOGY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME:
				return CONSTELLATION_VARIABLE_NAME_EDEFAULT == null ? constellationVariableName != null : !CONSTELLATION_VARIABLE_NAME_EDEFAULT.equals(constellationVariableName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesSatelliteUiPackage.APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE:
				return getConstellationVariable();
			case ApogyExamplesSatelliteUiPackage.APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST:
				return getOperationCallResultsList();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constellationVariableName: ");
		result.append(constellationVariableName);
		result.append(')');
		return result.toString();
	}

} //ApogyExamplesSatelliteUiFacadeImpl
