package ca.gc.asc_csa.apogy.core.topology.impl;
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFactory;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCoreTopologyFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreTopologyFacade
{
	
	private static ApogyCoreTopologyFacade instance = null;
	
	public static ApogyCoreTopologyFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogyCoreTopologyFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyCoreTopologyFacadeImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreTopologyPackage.Literals.APOGY_CORE_TOPOLOGY_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Node getVariableOriginNode(Variable variable) 
	{
		Node node = null;
		
		AbstractTypeImplementation ati = ApogyCoreInvocatorFacade.INSTANCE.getTypeImplementation(variable);
		if(ati instanceof VariableImplementation)
		{
			VariableImplementation va = (VariableImplementation) ati;
			if(va.getAdapterInstance() instanceof ApogySystemApiAdapter)
			{
				ApogySystemApiAdapter ssaa = (ApogySystemApiAdapter) va.getAdapterInstance();
				
				if(ssaa.getApogySystem() != null && ssaa.getApogySystem().getTopologyRoot() != null)
				{
					node = ssaa.getApogySystem().getTopologyRoot().getOriginNode();
				}
			}
		}
		
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public Node getAbstractTypeImplementationOriginNode(AbstractTypeImplementation abstractTypeImplementation) 
	{
		Node root = null;		
		
		VariableImplementation vi = resolveVariableImplementation(abstractTypeImplementation);
		if(vi != null)
		{
			root = ApogyCoreTopologyFacade.INSTANCE.getVariableOriginNode(vi.getVariable());
		}		
		return root;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ApogyEnvironmentNode createApogyEnvironmentNode(ApogyEnvironment apogyEnvironment) 
	{
		ApogyEnvironmentNode apogyEnvironmentNode = ApogyCoreTopologyFactory.eINSTANCE.createApogyEnvironmentNode();						
		apogyEnvironmentNode.setApogyEnvironment(apogyEnvironment);										
		
		// Forces the update of the child nodes.
		apogyEnvironmentNode.getApogySystemAPIsNode();
		apogyEnvironmentNode.getWorksiteNode();		
		apogyEnvironmentNode.getResultsListNode();
		
		return apogyEnvironmentNode;

	}

	/**
	 * Attempts to find the VariableImplementation ultimately defining the specified AbstractTypeImplementation.
	 * @param ati The AbstractTypeImplementation for which to find the declaring Variable.
	 * @return The VariableImplementation associated with the AbstractTypeImplementation, null is none is found.
	 */
	private VariableImplementation resolveVariableImplementation(AbstractTypeImplementation ati)
	{
		if(ati instanceof VariableImplementation)
		{
			return (VariableImplementation) ati;
		}
		else if(ati.eContainer() instanceof VariableImplementation)
		{
			return (VariableImplementation) ati.eContainer();
		}
		else if(eContainer instanceof AbstractTypeImplementation)
		{
			AbstractTypeImplementation atiContainer = (AbstractTypeImplementation) ati.eContainer();
			return resolveVariableImplementation(atiContainer);
		}
		else
		{
			return null;
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
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE:
				return getVariableOriginNode((Variable)arguments.get(0));
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION:
				return getAbstractTypeImplementationOriginNode((AbstractTypeImplementation)arguments.get(0));
			case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE___CREATE_APOGY_ENVIRONMENT_NODE__APOGYENVIRONMENT:
				return createApogyEnvironmentNode((ApogyEnvironment)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}




} //ApogyCoreTopologyFacadeImpl
