/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

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
 *   <li>{@link org.eclipse.symphony.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID <em>Request UID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAbstractConstellationDownlinkItem()
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
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAbstractConstellationDownlinkItem_RequestUID()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getRequestUID();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.AbstractConstellationDownlinkItem#getRequestUID <em>Request UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request UID</em>' attribute.
	 * @see #getRequestUID()
	 * @generated
	 */
	void setRequestUID(long value);

} // AbstractConstellationDownlinkItem
