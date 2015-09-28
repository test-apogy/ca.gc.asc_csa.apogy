/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft Visibility Pass View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a list of configuration for the view that shows the visibility of spacecraft from ground stations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftVisibilityPassViewConfigurationList()
 * @model
 * @generated
 */
public interface SpacecraftVisibilityPassViewConfigurationList extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftVisibilityPassViewConfigurationList_Configurations()
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList
	 * @model opposite="configurationsList" containment="true"
	 * @generated
	 */
	EList<SpacecraftVisibilityPassViewConfiguration> getConfigurations();

} // SpacecraftVisibilityPassViewConfigurationList
