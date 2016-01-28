/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewConfigurationList#getMapViewConfigurations <em>Map View Configurations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage#getMapViewConfigurationList()
 * @model
 * @generated
 */
public interface MapViewConfigurationList extends AbstractToolsListContainer
{
  /**
	 * Returns the value of the '<em><b>Map View Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map View Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Map View Configurations</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage#getMapViewConfigurationList_MapViewConfigurations()
	 * @model containment="true"
	 * @generated
	 */
  EList<MapViewConfiguration> getMapViewConfigurations();

} // MapViewConfigurationList
