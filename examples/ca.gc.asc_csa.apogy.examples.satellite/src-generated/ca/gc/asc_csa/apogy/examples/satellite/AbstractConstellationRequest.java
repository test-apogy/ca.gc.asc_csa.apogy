package ca.gc.asc_csa.apogy.examples.satellite;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getUid <em>Uid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderPriority <em>Order Priority</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderStatus <em>Order Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getSatelliteCommand <em>Satellite Command</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationRequest()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellationRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request Unique Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(UID)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationRequest_Uid()
	 * @model containment="true"
	 * @generated
	 */
	UID getUid();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(UID value);

	/**
	 * Returns the value of the '<em><b>Order Priority</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request Priority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Priority</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority
	 * @see #setOrderPriority(ConstellationRequestPriority)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationRequest_OrderPriority()
	 * @model default="NORMAL" unique="false"
	 * @generated
	 */
	ConstellationRequestPriority getOrderPriority();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderPriority <em>Order Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Priority</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority
	 * @see #getOrderPriority()
	 * @generated
	 */
	void setOrderPriority(ConstellationRequestPriority value);

	/**
	 * Returns the value of the '<em><b>Order Status</b></em>' attribute.
	 * The default value is <code>"NEW"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order Status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Status</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus
	 * @see #setOrderStatus(ConstellationRequestStatus)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationRequest_OrderStatus()
	 * @model default="NEW" unique="false"
	 * @generated
	 */
	ConstellationRequestStatus getOrderStatus();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getOrderStatus <em>Order Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Status</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus
	 * @see #getOrderStatus()
	 * @generated
	 */
	void setOrderStatus(ConstellationRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Satellite Command</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the {@link AbstractSatelliteCommand} associated to the {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite Command</em>' containment reference.
	 * @see #setSatelliteCommand(AbstractSatelliteCommand)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationRequest_SatelliteCommand()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getConstellationRequest
	 * @model opposite="constellationRequest" containment="true"
	 * @generated
	 */
	AbstractSatelliteCommand getSatelliteCommand();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getSatelliteCommand <em>Satellite Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite Command</em>' containment reference.
	 * @see #getSatelliteCommand()
	 * @generated
	 */
	void setSatelliteCommand(AbstractSatelliteCommand value);

} // AbstractConstellationRequest
