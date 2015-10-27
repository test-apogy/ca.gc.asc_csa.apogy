/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elevation Mask</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getElevationMask()
 * @model abstract="true"
 * @generated
 */
public interface ElevationMask extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" azimuthUnique="false"
	 * @generated
	 */
	double getElevation(double azimuth);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.environment.orbit.earth.OreKitElevationMask" unique="false"
	 * @generated
	 */
	org.orekit.utils.ElevationMask getOreKitElevationMask();

} // ElevationMask
