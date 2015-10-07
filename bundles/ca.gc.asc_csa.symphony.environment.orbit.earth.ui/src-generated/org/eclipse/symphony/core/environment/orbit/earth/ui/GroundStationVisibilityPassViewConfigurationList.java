/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

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
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationVisibilityPassViewConfigurationList()
 * @model
 * @generated
 */
public interface GroundStationVisibilityPassViewConfigurationList extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getGroundStationVisibilityPassViewConfigurationList_Configurations()
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList
	 * @model opposite="configurationsList" containment="true"
	 * @generated
	 */
	EList<GroundStationVisibilityPassViewConfiguration> getConfigurations();

} // GroundStationVisibilityPassViewConfigurationList
