/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.topology;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;
import ca.gc.asc_csa.symphony.core.SymphonyEnvironment;
import ca.gc.asc_csa.symphony.topology.impl.SymphonyTopologyFacadeImpl;
import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * SymphonyTopologyFacade
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage#getSymphonyTopologyFacade()
 * @model
 * @generated
 */
public interface SymphonyTopologyFacade extends EObject
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
	public static SymphonyTopologyFacade INSTANCE = SymphonyTopologyFacadeImpl.getInstance();
	
} // SymphonyTopologyFacade
