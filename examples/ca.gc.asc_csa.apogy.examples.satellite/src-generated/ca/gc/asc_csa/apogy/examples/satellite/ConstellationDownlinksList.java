/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Downlinks List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a list of {@link ConstellationDownlink}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ConstellationDownlinksList#getDownlinks <em>Downlinks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationDownlinksList()
 * @model
 * @generated
 */
public interface ConstellationDownlinksList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Downlinks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.ConstellationDownlink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downlinks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downlinks</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationDownlinksList_Downlinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstellationDownlink> getDownlinks();

} // ConstellationDownlinksList
