/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.topology.SymphonyEnvironmentNode;
import org.eclipse.symphony.core.topology.SymphonyTopologyFacade;
import org.eclipse.symphony.core.topology.SymphonyTopologyFactory;
import org.eclipse.symphony.core.topology.SymphonyTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SymphonyTopologyFacadeImpl extends MinimalEObjectImpl.Container implements SymphonyTopologyFacade
{
	
	private static SymphonyTopologyFacade instance = null;
	
	public static SymphonyTopologyFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new SymphonyTopologyFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyTopologyFacadeImpl()
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
		return SymphonyTopologyPackage.Literals.SYMPHONY_TOPOLOGY_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Node getVariableOriginNode(Variable variable) 
	{
		Node node = null;
		
		AbstractTypeImplementation ati = EMFEcoreInvocatorFacade.INSTANCE.getTypeImplementation(variable);
		if(ati instanceof VariableImplementation)
		{
			VariableImplementation va = (VariableImplementation) ati;
			if(va.getAdapterInstance() instanceof SymphonySystemApiAdapter)
			{
				SymphonySystemApiAdapter ssaa = (SymphonySystemApiAdapter) va.getAdapterInstance();
				
				if(ssaa.getSymphonySystem() != null && ssaa.getSymphonySystem().getTopologyRoot() != null)
				{
					node = ssaa.getSymphonySystem().getTopologyRoot().getOriginNode();
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
			root = SymphonyTopologyFacade.INSTANCE.getVariableOriginNode(vi.getVariable());
		}		
		return root;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SymphonyEnvironmentNode createSymphonyEnvironmentNode(SymphonyEnvironment symphonyEnvironment) 
	{
		SymphonyEnvironmentNode symphonyEnvironmentNode = SymphonyTopologyFactory.eINSTANCE.createSymphonyEnvironmentNode();						
		symphonyEnvironmentNode.setSymphonyEnvironment(symphonyEnvironment);										
		
		// Forces the update of the child nodes.
		symphonyEnvironmentNode.getSymphonySystemAPIsNode();
		symphonyEnvironmentNode.getWorksiteNode();		
		symphonyEnvironmentNode.getResultsListNode();
		
		return symphonyEnvironmentNode;

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
			case SymphonyTopologyPackage.SYMPHONY_TOPOLOGY_FACADE___GET_VARIABLE_ORIGIN_NODE__VARIABLE:
				return getVariableOriginNode((Variable)arguments.get(0));
			case SymphonyTopologyPackage.SYMPHONY_TOPOLOGY_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_ORIGIN_NODE__ABSTRACTTYPEIMPLEMENTATION:
				return getAbstractTypeImplementationOriginNode((AbstractTypeImplementation)arguments.get(0));
			case SymphonyTopologyPackage.SYMPHONY_TOPOLOGY_FACADE___CREATE_SYMPHONY_ENVIRONMENT_NODE__SYMPHONYENVIRONMENT:
				return createSymphonyEnvironmentNode((SymphonyEnvironment)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}




} //SymphonyTopologyFacadeImpl
