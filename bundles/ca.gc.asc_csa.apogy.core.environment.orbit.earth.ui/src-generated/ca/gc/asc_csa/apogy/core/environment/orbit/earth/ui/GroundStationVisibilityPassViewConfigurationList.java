/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station Visibility Pass View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Visibility Passes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfigurationList()
 * @model
 * @generated
 */
public interface GroundStationVisibilityPassViewConfigurationList extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfigurationList_Configurations()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList
	 * @model opposite="configurationsList" containment="true"
	 * @generated
	 */
	EList<GroundStationVisibilityPassViewConfiguration> getConfigurations();

} // GroundStationVisibilityPassViewConfigurationList
