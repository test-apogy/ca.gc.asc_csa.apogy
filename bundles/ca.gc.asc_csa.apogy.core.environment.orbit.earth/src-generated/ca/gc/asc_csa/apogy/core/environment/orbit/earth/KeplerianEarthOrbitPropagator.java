/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import ca.gc.asc_csa.apogy.core.environment.orbit.InitialOrbitContainer;
import java.util.Date;
import org.orekit.propagation.analytical.KeplerianPropagator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keplerian Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Simple keplerian orbit propagator for Earth orbits.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator#getValidToDate <em>Valid To Date</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbitPropagator()
 * @model
 * @generated
 */
public interface KeplerianEarthOrbitPropagator extends EarthOrbitPropagator, InitialOrbitContainer {
	/**
	 * Returns the value of the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the earliest data for which the propagator is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid From Date</em>' attribute.
	 * @see #setValidFromDate(Date)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbitPropagator_ValidFromDate()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Date getValidFromDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator#getValidFromDate <em>Valid From Date</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbitPropagator_ValidToDate()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Date getValidToDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator#getValidToDate <em>Valid To Date</em>}' attribute.
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
	 * Gets the underlying OreKit KeplerianPropagator used to do computations.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitKeplerianPropagator" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	KeplerianPropagator getOreKitKeplerianPropagator();

} // KeplerianEarthOrbitPropagator
