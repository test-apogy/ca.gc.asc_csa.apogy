/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.symphony.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station Visibility Pass View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getOrbitModels <em>Orbit Models</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getGroundStations <em>Ground Stations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationVisibilityPassViewConfiguration()
 * @model
 * @generated
 */
public interface GroundStationVisibilityPassViewConfiguration extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Configurations List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations List</em>' container reference.
	 * @see #setConfigurationsList(GroundStationVisibilityPassViewConfigurationList)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationVisibilityPassViewConfiguration_ConfigurationsList()
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfigurationList#getConfigurations
	 * @model opposite="configurations" transient="false"
	 * @generated
	 */
	GroundStationVisibilityPassViewConfigurationList getConfigurationsList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations List</em>' container reference.
	 * @see #getConfigurationsList()
	 * @generated
	 */
	void setConfigurationsList(GroundStationVisibilityPassViewConfigurationList value);

	/**
	 * Returns the value of the '<em><b>Orbit Models</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.orbit.OrbitModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbit Models</em>' reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationVisibilityPassViewConfiguration_OrbitModels()
	 * @model
	 * @generated
	 */
	EList<OrbitModel> getOrbitModels();

	/**
	 * Returns the value of the '<em><b>Ground Stations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.GroundStation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Stations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Stations</em>' reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationVisibilityPassViewConfiguration_GroundStations()
	 * @model
	 * @generated
	 */
	EList<GroundStation> getGroundStations();

} // GroundStationVisibilityPassViewConfiguration
