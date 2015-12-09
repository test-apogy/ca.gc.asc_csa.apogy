/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Location World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getEarthSurfaceLocation <em>Earth Surface Location</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getTargetRadius <em>Target Radius</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage#getEarthSurfaceLocationWorldWindLayer()
 * @model
 * @generated
 */
public interface EarthSurfaceLocationWorldWindLayer extends AbstractWorldWindLayer {
	/**
	 * Returns the value of the '<em><b>Earth Surface Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earth Surface Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earth Surface Location</em>' reference.
	 * @see #setEarthSurfaceLocation(EarthSurfaceLocation)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage#getEarthSurfaceLocationWorldWindLayer_EarthSurfaceLocation()
	 * @model
	 * @generated
	 */
	EarthSurfaceLocation getEarthSurfaceLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getEarthSurfaceLocation <em>Earth Surface Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Surface Location</em>' reference.
	 * @see #getEarthSurfaceLocation()
	 * @generated
	 */
	void setEarthSurfaceLocation(EarthSurfaceLocation value);

	/**
	 * Returns the value of the '<em><b>Target Radius</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The radius of the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Radius</em>' attribute.
	 * @see #setTargetRadius(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage#getEarthSurfaceLocationWorldWindLayer_TargetRadius()
	 * @model default="50" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISUALS' symphony_units='km'"
	 * @generated
	 */
	double getTargetRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getTargetRadius <em>Target Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Radius</em>' attribute.
	 * @see #getTargetRadius()
	 * @generated
	 */
	void setTargetRadius(double value);

} // EarthSurfaceLocationWorldWindLayer
