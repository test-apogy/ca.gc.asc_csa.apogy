/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Downlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A {@link ConstellationDownlink} class contains the {@link AbstractConstellationDownlinkItem}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ConstellationDownlink#getDownlinkItems <em>Downlink Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationDownlink()
 * @model
 * @generated
 */
public interface ConstellationDownlink extends EObject {
	/**
	 * Returns the value of the '<em><b>Downlink Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.AbstractConstellationDownlinkItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downlink Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downlink Items</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationDownlink_DownlinkItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConstellationDownlinkItem> getDownlinkItems();

} // ConstellationDownlink
