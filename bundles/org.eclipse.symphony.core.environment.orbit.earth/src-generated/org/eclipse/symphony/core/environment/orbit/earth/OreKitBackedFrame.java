/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.symphony.core.environment.orbit.AbstractFrame;
import org.orekit.frames.Frame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ore Kit Backed Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getOreKitBackedFrame()
 * @model
 * @generated
 */
public interface OreKitBackedFrame extends AbstractFrame {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.environment.orbit.earth.OreKitFrame" unique="false"
	 * @generated
	 */
	Frame getOreKitFrame();

} // OreKitBackedFrame
