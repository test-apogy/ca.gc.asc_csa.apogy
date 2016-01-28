/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.topology;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * ApogyCoreTopologyFacade
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyCoreTopologyFacade()
 * @model
 * @generated
 */
public interface ApogyCoreTopologyFacade extends EObject
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
	 * @model unique="false" apogyEnvironmentUnique="false"
	 * @generated
	 */
	ApogyEnvironmentNode createApogyEnvironmentNode(ApogyEnvironment apogyEnvironment);

	/**
    * @generated_NOT
	*/
	public static ApogyCoreTopologyFacade INSTANCE = ApogyCoreTopologyFacadeImpl.getInstance();
	
} // ApogyCoreTopologyFacade
