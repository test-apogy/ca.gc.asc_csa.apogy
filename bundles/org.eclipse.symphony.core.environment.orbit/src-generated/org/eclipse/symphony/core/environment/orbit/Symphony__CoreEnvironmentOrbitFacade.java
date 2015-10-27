/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitFacadeImpl;

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
 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getSymphony__CoreEnvironmentOrbitFacade()
 * @model
 * @generated
 */
public interface Symphony__CoreEnvironmentOrbitFacade extends EObject 
{
	public static Symphony__CoreEnvironmentOrbitFacade INSTANCE = Symphony__CoreEnvironmentOrbitFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalOrbitModelUnique="false"
	 * @generated
	 */
	OrbitModel createOrbitModelCopy(OrbitModel originalOrbitModel);

} // Symphony__CoreEnvironmentOrbitFacade
