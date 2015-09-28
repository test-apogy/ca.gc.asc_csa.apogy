/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.symphony.environment.orbit.impl.OrbitFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A class providing ustilities methods for Orbits.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage#getOrbitFacade()
 * @model
 * @generated
 */
public interface OrbitFacade extends EObject 
{
	public static OrbitFacade INSTANCE = OrbitFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalOrbitModelUnique="false"
	 * @generated
	 */
	OrbitModel createOrbitModelCopy(OrbitModel originalOrbitModel);

} // OrbitFacade
