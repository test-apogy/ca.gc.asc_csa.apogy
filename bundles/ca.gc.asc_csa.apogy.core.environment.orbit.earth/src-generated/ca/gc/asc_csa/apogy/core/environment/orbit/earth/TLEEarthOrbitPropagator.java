/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import java.util.Date;
import org.orekit.propagation.analytical.tle.TLEPropagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLE Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getTle <em>Tle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getValidToDate <em>Valid To Date</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitPropagator()
 * @model
 * @generated
 */
public interface TLEEarthOrbitPropagator extends EarthOrbitPropagator {
	/**
	 * Returns the value of the '<em><b>Tle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Two-Line Elements used by this propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tle</em>' containment reference.
	 * @see #setTle(TLE)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitPropagator_Tle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TLE getTle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getTle <em>Tle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tle</em>' containment reference.
	 * @see #getTle()
	 * @generated
	 */
	void setTle(TLE value);

	/**
	 * Returns the value of the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the earliest data for which the propagator is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid From Date</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitPropagator_ValidFromDate()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getValidFromDate();

	/**
	 * Returns the value of the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the latest data for which the propagator is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid To Date</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitPropagator_ValidToDate()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getValidToDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitTLEPropagator" unique="false"
	 * @generated
	 */
	TLEPropagator getOreKitTLEPropagator();

} // TLEEarthOrbitPropagator
