/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station Visibility Pass View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getOrbitModels <em>Orbit Models</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getGroundStations <em>Ground Stations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfiguration()
 * @model
 * @generated
 */
public interface GroundStationVisibilityPassViewConfiguration extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Configurations List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations List</em>' container reference.
	 * @see #setConfigurationsList(GroundStationVisibilityPassViewConfigurationList)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfiguration_ConfigurationsList()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfigurationList#getConfigurations
	 * @model opposite="configurations" transient="false"
	 * @generated
	 */
	GroundStationVisibilityPassViewConfigurationList getConfigurationsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations List</em>' container reference.
	 * @see #getConfigurationsList()
	 * @generated
	 */
	void setConfigurationsList(GroundStationVisibilityPassViewConfigurationList value);

	/**
	 * Returns the value of the '<em><b>Orbit Models</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbit Models</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfiguration_OrbitModels()
	 * @model
	 * @generated
	 */
	EList<OrbitModel> getOrbitModels();

	/**
	 * Returns the value of the '<em><b>Ground Stations</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Stations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Stations</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfiguration_GroundStations()
	 * @model
	 * @generated
	 */
	EList<GroundStation> getGroundStations();

} // GroundStationVisibilityPassViewConfiguration
