/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class providing utilities methods for Orbits.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getApogyCoreEnvironmentOrbitFacade()
 * @model
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitFacade extends EObject 
{
	public static ApogyCoreEnvironmentOrbitFacade INSTANCE = ApogyCoreEnvironmentOrbitFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalOrbitModelUnique="false"
	 * @generated
	 */
	OrbitModel createOrbitModelCopy(OrbitModel originalOrbitModel);

} // ApogyCoreEnvironmentOrbitFacade
