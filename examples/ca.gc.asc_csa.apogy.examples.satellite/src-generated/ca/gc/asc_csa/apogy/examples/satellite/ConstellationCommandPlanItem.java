/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Command Plan Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specifies the link between an {@link AbstractConstellationRequest} and a {@link AbstractSatelliteCommand}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getRequest <em>Request</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getSatelliteCommand <em>Satellite Command</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlanItem()
 * @model
 * @generated
 */
public interface ConstellationCommandPlanItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(AbstractConstellationRequest)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlanItem_Request()
	 * @model required="true"
	 * @generated
	 */
	AbstractConstellationRequest getRequest();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(AbstractConstellationRequest value);

	/**
	 * Returns the value of the '<em><b>Satellite Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the {@link AbstractSatelliteCommand} used/required to service the {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite Command</em>' containment reference.
	 * @see #setSatelliteCommand(AbstractSatelliteCommand)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlanItem_SatelliteCommand()
	 * @model containment="true"
	 * @generated
	 */
	AbstractSatelliteCommand getSatelliteCommand();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem#getSatelliteCommand <em>Satellite Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite Command</em>' containment reference.
	 * @see #getSatelliteCommand()
	 * @generated
	 */
	void setSatelliteCommand(AbstractSatelliteCommand value);

} // ConstellationCommandPlanItem