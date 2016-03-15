package ca.gc.asc_csa.apogy.core.invocator.delegates;
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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

public interface InvocatorDelegate
{	
	/**
	 * Perform the required steps to instantiate the specified Variable.
	 * @param environment The ExecutionEnvironment that will make use of the EObject.
	 * @param variable Variable to instantiate.
	 */
	public void newInstance(Environment environment, Variable variable);

	/**
	 * Creates a new instance of {@link AbstractTypeImplementation}.
	 * @param environment
	 * @param type
	 * @param typeImplementation
	 */
	public void newInstance(Environment environment, AbstractTypeImplementation typeImplementation);	
	
	/**
	 * Apply the initialization data to the specified Variable.
	 * @param variable Variable to initialize.
	 */
	public void applyInitializationData(Variable variable);	
		
	/**
	 * Apply the initialization data to the specified Type Implementation.
	 * @param typeImplementation Type implementation to initialize.
	 */	
	public void applyInitializationData(AbstractTypeImplementation typeImplementation);	

	/**
	 * Apply the initialization data to the specified Variable.
	 * @param variable Variable to initialize.
	 */
	public void collectInitializationData(Variable variable);	
		
	/**
	 * Apply the initialization data to the specified Type Implementation.
	 * @param typeImplementation Type implementation to initialize.
	 */	
	public void collectInitializationData(AbstractTypeImplementation typeImplementation);	
	
	
	/**
	 * Perform the required steps to cleanup the specified Variable before it being disposed.
	 * @param environment The ExecutionEnvironment currently making use of the Variable.
	 * @param variable The specified Variable
	 */
	public void dispose(Environment environment, Variable variable);
		
	/** 
	 * Disposes the {@link TypeImplementation}.
	 * @param typeImplementation Type implementation to dispose.
	 */
	public void dispose(AbstractTypeImplementation typeImplementation);
	
	/**
	 * Invokes the specified OperationCall and returns the Result
	 * @param instance The object onto which to call the operation.	
	 * @param operationCall The specified OperationCall
	 * @param saveResult If true then the result will be stored.
	 * @param Reference to the result.
	 */
	public OperationCallResult execute(EObject instance, OperationCall operationCall, boolean saveResult);	
	
	/**
	 * Returns the {@link Type} class handled by this InvocatorDelegate.
	 * @return the class that is adapted by this adapter.
	 */
	Class<? extends Type> getHandledTypeClass();
	
	/**
	 * Creates and returns a new {@link TypeApiAdapter}.
	 * @return New instance of {@link TypeApiAdapter}.
	 */
	TypeApiAdapter newDefaultTypeApiAdapter();	
}