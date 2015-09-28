/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth;

import ca.gc.asc_csa.symphony.environment.orbit.AbstractFrame;

import org.orekit.frames.Frame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ore Kit Backed Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getOreKitBackedFrame()
 * @model
 * @generated
 */
public interface OreKitBackedFrame extends AbstractFrame {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.symphony.environment.orbit.earth.OreKitFrame" unique="false"
	 * @generated
	 */
	Frame getOreKitFrame();

} // OreKitBackedFrame
