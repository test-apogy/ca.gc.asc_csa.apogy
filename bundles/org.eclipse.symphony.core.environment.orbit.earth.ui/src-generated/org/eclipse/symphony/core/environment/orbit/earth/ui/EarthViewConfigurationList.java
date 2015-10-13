/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfigurationList#getEarthViewConfigurations <em>Earth View Configurations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getEarthViewConfigurationList()
 * @model
 * @generated
 */
public interface EarthViewConfigurationList extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Earth View Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earth View Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earth View Configurations</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getEarthViewConfigurationList_EarthViewConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EarthViewConfiguration> getEarthViewConfigurations();

} // EarthViewConfigurationList
