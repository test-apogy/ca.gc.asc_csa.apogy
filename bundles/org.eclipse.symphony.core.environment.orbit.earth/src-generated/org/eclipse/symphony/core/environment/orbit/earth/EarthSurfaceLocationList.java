/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Location List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocationList#getEarthSurfaceLocations <em>Earth Surface Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthSurfaceLocationList()
 * @model
 * @generated
 */
public interface EarthSurfaceLocationList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Earth Surface Locations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earth Surface Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earth Surface Locations</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthSurfaceLocationList_EarthSurfaceLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EarthSurfaceLocation> getEarthSurfaceLocations();

} // EarthSurfaceLocationList
