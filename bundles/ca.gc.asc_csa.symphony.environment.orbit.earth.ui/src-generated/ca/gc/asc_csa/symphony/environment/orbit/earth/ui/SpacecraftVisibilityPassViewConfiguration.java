/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SpacecraftsVisibilitySet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft Visibility Pass View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the configuration for the view that shows the visibility of spacecraft from ground stations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getVisibilitySet <em>Visibility Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftVisibilityPassViewConfiguration()
 * @model
 * @generated
 */
public interface SpacecraftVisibilityPassViewConfiguration extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Configurations List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations List</em>' container reference.
	 * @see #setConfigurationsList(SpacecraftVisibilityPassViewConfigurationList)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList()
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList#getConfigurations
	 * @model opposite="configurations" transient="false"
	 * @generated
	 */
	SpacecraftVisibilityPassViewConfigurationList getConfigurationsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations List</em>' container reference.
	 * @see #getConfigurationsList()
	 * @generated
	 */
	void setConfigurationsList(SpacecraftVisibilityPassViewConfigurationList value);

	/**
	 * Returns the value of the '<em><b>Visibility Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Set</em>' containment reference.
	 * @see #setVisibilitySet(SpacecraftsVisibilitySet)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftVisibilityPassViewConfiguration_VisibilitySet()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' chilrend='true' property='None'"
	 * @generated
	 */
	SpacecraftsVisibilitySet getVisibilitySet();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getVisibilitySet <em>Visibility Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Set</em>' containment reference.
	 * @see #getVisibilitySet()
	 * @generated
	 */
	void setVisibilitySet(SpacecraftsVisibilitySet value);

} // SpacecraftVisibilityPassViewConfiguration
