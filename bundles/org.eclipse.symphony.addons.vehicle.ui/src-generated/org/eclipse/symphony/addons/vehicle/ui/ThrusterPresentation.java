/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.ui;

import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thruster Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible <em>Plume Envelope Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLenght <em>Plume Envelope Lenght</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIPackage#getThrusterPresentation()
 * @model
 * @generated
 */
public interface ThrusterPresentation extends NodePresentation
{

	/**
	 * Returns the value of the '<em><b>Plume Envelope Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plume Envelope Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether or not the plume envelope is visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plume Envelope Visible</em>' attribute.
	 * @see #setPlumeEnvelopeVisible(boolean)
	 * @see org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIPackage#getThrusterPresentation_PlumeEnvelopeVisible()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='false' propertyCategory='PLUME_INFO'"
	 * @generated
	 */
	boolean isPlumeEnvelopeVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible <em>Plume Envelope Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plume Envelope Visible</em>' attribute.
	 * @see #isPlumeEnvelopeVisible()
	 * @generated
	 */
	void setPlumeEnvelopeVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Plume Envelope Lenght</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The length of the cone used to represent the plume envelope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plume Envelope Lenght</em>' attribute.
	 * @see #setPlumeEnvelopeLenght(double)
	 * @see org.eclipse.symphony.addons.vehicle.ui.Symphony__AddonsVehicleUIPackage#getThrusterPresentation_PlumeEnvelopeLenght()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='false' propertyCategory='PLUME_INFO'"
	 * @generated
	 */
	double getPlumeEnvelopeLenght();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLenght <em>Plume Envelope Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plume Envelope Lenght</em>' attribute.
	 * @see #getPlumeEnvelopeLenght()
	 * @generated
	 */
	void setPlumeEnvelopeLenght(double value);
} // ThrusterPresentation
