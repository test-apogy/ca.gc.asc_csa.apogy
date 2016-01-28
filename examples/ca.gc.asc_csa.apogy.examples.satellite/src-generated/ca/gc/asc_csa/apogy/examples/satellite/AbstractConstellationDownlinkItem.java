/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constellation Downlink Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an item in a {@link ConstellationDownlink}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID <em>Request UID</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationDownlinkItem()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellationDownlinkItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Request UID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique {@link AbstractConstellationRequest} identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request UID</em>' attribute.
	 * @see #setRequestUID(long)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationDownlinkItem_RequestUID()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getRequestUID();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID <em>Request UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request UID</em>' attribute.
	 * @see #getRequestUID()
	 * @generated
	 */
	void setRequestUID(long value);

} // AbstractConstellationDownlinkItem
