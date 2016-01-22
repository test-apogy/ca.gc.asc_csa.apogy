/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constellation Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is used to model Constellation Request such as {@link ImageConstellationRequest}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getOrderPriority <em>Order Priority</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getOrderStatus <em>Order Status</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getSatelliteCommand <em>Satellite Command</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAbstractConstellationRequest()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request Unique Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(long)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAbstractConstellationRequest_Uid()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long getUid();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(long value);

	/**
	 * Returns the value of the '<em><b>Order Priority</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.examples.satellite.ConstellationRequestPriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request Priority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Priority</em>' attribute.
	 * @see org.eclipse.symphony.examples.satellite.ConstellationRequestPriority
	 * @see #setOrderPriority(ConstellationRequestPriority)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAbstractConstellationRequest_OrderPriority()
	 * @model default="NORMAL" unique="false"
	 * @generated
	 */
	ConstellationRequestPriority getOrderPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getOrderPriority <em>Order Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Priority</em>' attribute.
	 * @see org.eclipse.symphony.examples.satellite.ConstellationRequestPriority
	 * @see #getOrderPriority()
	 * @generated
	 */
	void setOrderPriority(ConstellationRequestPriority value);

	/**
	 * Returns the value of the '<em><b>Order Status</b></em>' attribute.
	 * The default value is <code>"NEW"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.examples.satellite.ConstellationRequestStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order Status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Status</em>' attribute.
	 * @see org.eclipse.symphony.examples.satellite.ConstellationRequestStatus
	 * @see #setOrderStatus(ConstellationRequestStatus)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAbstractConstellationRequest_OrderStatus()
	 * @model default="NEW" unique="false"
	 * @generated
	 */
	ConstellationRequestStatus getOrderStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getOrderStatus <em>Order Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Status</em>' attribute.
	 * @see org.eclipse.symphony.examples.satellite.ConstellationRequestStatus
	 * @see #getOrderStatus()
	 * @generated
	 */
	void setOrderStatus(ConstellationRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Satellite Command</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.examples.satellite.AbstractSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the {@link AbstractSatelliteCommand} associated to the {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite Command</em>' containment reference.
	 * @see #setSatelliteCommand(AbstractSatelliteCommand)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAbstractConstellationRequest_SatelliteCommand()
	 * @see org.eclipse.symphony.examples.satellite.AbstractSatelliteCommand#getConstellationRequest
	 * @model opposite="constellationRequest" containment="true"
	 * @generated
	 */
	AbstractSatelliteCommand getSatelliteCommand();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest#getSatelliteCommand <em>Satellite Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite Command</em>' containment reference.
	 * @see #getSatelliteCommand()
	 * @generated
	 */
	void setSatelliteCommand(AbstractSatelliteCommand value);

} // AbstractConstellationRequest