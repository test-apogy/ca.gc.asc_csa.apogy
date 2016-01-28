/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit;

import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a class that propagate an initial orbit through time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getReferenceFrame <em>Reference Frame</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getAttitudeProvider <em>Attitude Provider</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getInitialOrbit <em>Initial Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidToDate <em>Valid To Date</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getAbstractOrbitPropagator()
 * @model abstract="true"
 * @generated
 */
public interface AbstractOrbitPropagator extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frame in which the orbit is propagated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference.
	 * @see #setReferenceFrame(AbstractFrame)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getAbstractOrbitPropagator_ReferenceFrame()
	 * @model containment="true"
	 * @generated
	 */
	AbstractFrame getReferenceFrame();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getReferenceFrame <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' containment reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(AbstractFrame value);

	/**
	 * Returns the value of the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attitude provider. Can be used to specify an attitude control law.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attitude Provider</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getAbstractOrbitPropagator_AttitudeProvider()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttitudeProvider> getAttitudeProvider();

	/**
	 * Returns the value of the '<em><b>Initial Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial orbit to propagate in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Orbit</em>' reference.
	 * @see #setInitialOrbit(Orbit)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getAbstractOrbitPropagator_InitialOrbit()
	 * @model required="true"
	 * @generated
	 */
	Orbit getInitialOrbit();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getInitialOrbit <em>Initial Orbit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Orbit</em>' reference.
	 * @see #getInitialOrbit()
	 * @generated
	 */
	void setInitialOrbit(Orbit value);

	/**
	 * Returns the value of the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the earliest data for which the propagator is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid From Date</em>' attribute.
	 * @see #setValidFromDate(Date)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getAbstractOrbitPropagator_ValidFromDate()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Date getValidFromDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidFromDate <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From Date</em>' attribute.
	 * @see #getValidFromDate()
	 * @generated
	 */
	void setValidFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the latest data for which the propagator is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid To Date</em>' attribute.
	 * @see #setValidToDate(Date)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getAbstractOrbitPropagator_ValidToDate()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Date getValidToDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidToDate <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To Date</em>' attribute.
	 * @see #getValidToDate()
	 * @generated
	 */
	void setValidToDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Propagate the current orbit to a specified time to get a Spacecraft state.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.Exception" targetDateUnique="false"
	 * @generated
	 */
	SpacecraftState propagate(Date targetDate) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of SpacecraftState from startDate to endDate at time interval of timeInterval.
	 * @param timeInterval The time interval to get spacecraft states, in seconds.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.List<ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.Exception" startDateUnique="false" endDateUnique="false" timeIntervalUnique="false"
	 *        timeIntervalAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='s'"
	 * @generated
	 */
	List<SpacecraftState> getSpacecraftStates(Date startDate, Date endDate, double timeInterval) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns wether or not a specified date falls within the validity range of the propagator.
	 * <!-- end-model-doc -->
	 * @model unique="false" dateUnique="false"
	 * @generated
	 */
	boolean isDateInValidRange(Date date);

} // AbstractOrbitPropagator
