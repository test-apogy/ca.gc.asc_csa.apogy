/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PV Coordinates Provider Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This interface represents a PVCoordinates provider.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage#getPVCoordinatesProviderProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PVCoordinatesProviderProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" dateUnique="false" frameUnique="false"
	 * @generated
	 */
	TimedStampedPVACoordinates getPVCoordinates(Date date, AbstractFrame frame);

} // PVCoordinatesProviderProvider
