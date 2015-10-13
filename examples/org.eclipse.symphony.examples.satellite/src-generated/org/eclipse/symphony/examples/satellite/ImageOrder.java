/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ImageOrder#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ImageOrder#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ImageOrder#getImageCenter <em>Image Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ImageOrder#getCommandedZoom <em>Commanded Zoom</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getImageOrder()
 * @model
 * @generated
 */
public interface ImageOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(int)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getImageOrder_OrderId()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getOrderId();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getImageOrder_Priority()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Image Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Center</em>' containment reference.
	 * @see #setImageCenter(GeographicCoordinates)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getImageOrder_ImageCenter()
	 * @model containment="true"
	 * @generated
	 */
	GeographicCoordinates getImageCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getImageCenter <em>Image Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Center</em>' containment reference.
	 * @see #getImageCenter()
	 * @generated
	 */
	void setImageCenter(GeographicCoordinates value);

	/**
	 * Returns the value of the '<em><b>Commanded Zoom</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commanded Zoom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commanded Zoom</em>' attribute.
	 * @see #setCommandedZoom(double)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getImageOrder_CommandedZoom()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getCommandedZoom();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.ImageOrder#getCommandedZoom <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Zoom</em>' attribute.
	 * @see #getCommandedZoom()
	 * @generated
	 */
	void setCommandedZoom(double value);

} // ImageOrder
