/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsListFactory;
import ca.gc.asc_csa.apogy.core.invocator.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Calls List Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OperationCallsListFactoryImpl extends ProgramFactoryImpl implements OperationCallsListFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallsListFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.OPERATION_CALLS_LIST_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Program createProgram() {
		return ApogyCoreInvocatorFactory.eINSTANCE.createOperationCallsList();
	}

} //OperationCallsListFactoryImpl
