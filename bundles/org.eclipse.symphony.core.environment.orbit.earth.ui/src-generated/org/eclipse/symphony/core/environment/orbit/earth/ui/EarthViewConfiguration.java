/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfiguration#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getEarthViewConfiguration()
 * @model
 * @generated
 */
public interface EarthViewConfiguration extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * List of Maps being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getEarthViewConfiguration_Layers()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	EList<AbstractWorldWindLayer> getLayers();

} // EarthViewConfiguration
