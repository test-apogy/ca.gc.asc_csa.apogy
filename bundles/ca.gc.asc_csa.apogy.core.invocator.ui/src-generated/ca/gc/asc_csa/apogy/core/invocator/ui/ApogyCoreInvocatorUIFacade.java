package ca.gc.asc_csa.apogy.core.invocator.ui;
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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
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
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getApogyCoreInvocatorUIFacade()
 * @model
 * @generated
 */
public interface ApogyCoreInvocatorUIFacade extends EObject {

	public static ApogyCoreInvocatorUIFacade INSTANCE = ApogyCoreInvocatorUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies the Initialization Data.
	 * @param source Reference to the source context.
	 * @param destination Reference to the destination context.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" sourceUnique="false" destinationUnique="false"
	 * @generated
	 */
	void copyInitializationData(Context source, Context destination) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies the Initialization Data.
	 * @param source Reference to the source implementation.
	 * @param destination Reference to the destination implementation.
	 * @param command Reference to the stack command.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" sourceUnique="false" destinationUnique="false" commandDataType="ca.gc.asc_csa.apogy.core.invocator.ui.CompoundCommand" commandUnique="false"
	 * @generated
	 */
	void copyInitializationData(AbstractTypeImplementation source, AbstractTypeImplementation destination, CompoundCommand command) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializes the active session.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void initSession();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disposes the active session.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void disposeSession();
} // ApogyCoreInvocatorUIFacade
