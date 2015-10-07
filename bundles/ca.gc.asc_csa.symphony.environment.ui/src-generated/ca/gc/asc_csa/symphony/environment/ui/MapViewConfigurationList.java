/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfigurationList#getMapViewConfigurations <em>Map View Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfigurationList()
 * @model
 * @generated
 */
public interface MapViewConfigurationList extends AbstractToolsListContainer
{
  /**
	 * Returns the value of the '<em><b>Map View Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map View Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Map View Configurations</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfigurationList_MapViewConfigurations()
	 * @model containment="true"
	 * @generated
	 */
  EList<MapViewConfiguration> getMapViewConfigurations();

} // MapViewConfigurationList
