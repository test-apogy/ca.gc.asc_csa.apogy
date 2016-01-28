/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

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
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList#getDownlinks <em>Downlinks</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationDownlinksList()
 * @model
 * @generated
 */
public interface ConstellationDownlinksList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Downlinks</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downlinks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downlinks</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationDownlinksList_Downlinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstellationDownlink> getDownlinks();

} // ConstellationDownlinksList
