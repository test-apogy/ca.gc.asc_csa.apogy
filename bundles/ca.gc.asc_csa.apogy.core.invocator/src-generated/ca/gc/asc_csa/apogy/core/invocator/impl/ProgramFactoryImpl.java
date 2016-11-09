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

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactory;
import ca.gc.asc_csa.apogy.core.invocator.ProgramSettings;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ProgramFactoryImpl extends MinimalEObjectImpl.Container implements ProgramFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.PROGRAM_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public Program createProgram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void applySettings(Program program, ProgramSettings settings) {
		program.setName(settings.getName());
		if(settings.getDescription() != null){
			program.setDescription(settings.getDescription());
		}
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORY___CREATE_PROGRAM:
				return createProgram();
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORY___APPLY_SETTINGS__PROGRAM_PROGRAMSETTINGS:
				applySettings((Program)arguments.get(0), (ProgramSettings)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProgramFactoryImpl
