/**
 * Canadian Space Agency 2007.
 *
 * $Id: MobilePlateform.java,v 1.4.4.2 2015/05/21 15:51:26 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility;

import org.eclipse.symphony.common.topology.AggregateGroupNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobile Plateform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a generic mobile plateform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.MobilePlateform#isMoving <em>Moving</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.MobilePlateform#getMobilePlateformStatus <em>Mobile Plateform Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getMobilePlateform()
 * @model
 * @generated
 */
public interface MobilePlateform extends AggregateGroupNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getMobilePlateform_Moving()
	 * @model
	 * @generated
	 */
	boolean isMoving();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.MobilePlateform#isMoving <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving</em>' attribute.
	 * @see #isMoving()
	 * @generated
	 */
	void setMoving(boolean value);

	/**
	 * Returns the value of the '<em><b>Mobile Plateform Status</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.mobility.MobilePlateformStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile Plateform Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile Plateform Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlateformStatus
	 * @see #setMobilePlateformStatus(MobilePlateformStatus)
	 * @see org.eclipse.symphony.addons.mobility.MobilityPackage#getMobilePlateform_MobilePlateformStatus()
	 * @model default="OFF"
	 * @generated
	 */
	MobilePlateformStatus getMobilePlateformStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.MobilePlateform#getMobilePlateformStatus <em>Mobile Plateform Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile Plateform Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlateformStatus
	 * @see #getMobilePlateformStatus()
	 * @generated
	 */
	void setMobilePlateformStatus(MobilePlateformStatus value);

} // MobilePlateform
