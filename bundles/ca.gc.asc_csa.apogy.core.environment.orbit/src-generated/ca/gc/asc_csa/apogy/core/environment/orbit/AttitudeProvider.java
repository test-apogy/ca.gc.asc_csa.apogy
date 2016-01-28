/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attitude Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This interface represents an attitude provider.
 * An attitude provider provides a way to compute an Attitude from an date and position-velocity local provider.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getAttitudeProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AttitudeProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pvProviderUnique="false" dateUnique="false" frameUnique="false"
	 * @generated
	 */
	SpacecraftAttitude getAttitude(PVCoordinatesProviderProvider pvProvider, Date date, AbstractFrame frame);

} // AttitudeProvider
