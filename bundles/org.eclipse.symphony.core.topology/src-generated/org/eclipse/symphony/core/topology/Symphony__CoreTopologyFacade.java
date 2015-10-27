/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.topology.impl.Symphony__CoreTopologyFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Symphony__CoreTopologyFacade
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage#getSymphony__CoreTopologyFacade()
 * @model
 * @generated
 */
public interface Symphony__CoreTopologyFacade extends EObject
{

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false"
	 * @generated
	 */
	Node getVariableOriginNode(Variable variable);
	
	 /**
	 * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
	 * @model unique="false" abstractTypeImplementationUnique="false"
	 * @generated
	 */
	Node getAbstractTypeImplementationOriginNode(AbstractTypeImplementation abstractTypeImplementation);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" symphonyEnvironmentUnique="false"
	 * @generated
	 */
	SymphonyEnvironmentNode createSymphonyEnvironmentNode(SymphonyEnvironment symphonyEnvironment);

	/**
    * @generated_NOT
	*/
	public static Symphony__CoreTopologyFacade INSTANCE = Symphony__CoreTopologyFacadeImpl.getInstance();
	
} // Symphony__CoreTopologyFacade
