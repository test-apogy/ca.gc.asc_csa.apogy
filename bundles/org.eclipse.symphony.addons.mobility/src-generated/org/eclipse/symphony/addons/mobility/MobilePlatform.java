/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility;

import org.eclipse.symphony.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobile Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.MobilePlatform#isMoving <em>Moving</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.MobilePlatform#getMobilePlatformStatus <em>Mobile Platform Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getMobilePlatform()
 * @model
 * @generated
 */
public interface MobilePlatform extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moving</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moving</em>' attribute.
	 * @see #setMoving(boolean)
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getMobilePlatform_Moving()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMoving();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.MobilePlatform#isMoving <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving</em>' attribute.
	 * @see #isMoving()
	 * @generated
	 */
	void setMoving(boolean value);

	/**
	 * Returns the value of the '<em><b>Mobile Platform Status</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.mobility.MobilePlatformStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile Platform Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Platform Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlatformStatus
	 * @see #setMobilePlatformStatus(MobilePlatformStatus)
	 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage#getMobilePlatform_MobilePlatformStatus()
	 * @model default="OFF" unique="false"
	 * @generated
	 */
	MobilePlatformStatus getMobilePlatformStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.MobilePlatform#getMobilePlatformStatus <em>Mobile Platform Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Platform Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlatformStatus
	 * @see #getMobilePlatformStatus()
	 * @generated
	 */
	void setMobilePlatformStatus(MobilePlatformStatus value);

} // MobilePlatform
