/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimum Distance Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter#getMinimumDistance <em>Minimum Distance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getMinimumDistanceFilter()
 * @model
 * @generated
 */
public interface MinimumDistanceFilter extends WayPointPathFilter {
	/**
	 * Returns the value of the '<em><b>Minimum Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Distance</em>' attribute.
	 * @see #setMinimumDistance(double)
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getMinimumDistanceFilter_MinimumDistance()
	 * @model unique="false"
	 * @generated
	 */
	double getMinimumDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter#getMinimumDistance <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Distance</em>' attribute.
	 * @see #getMinimumDistance()
	 * @generated
	 */
	void setMinimumDistance(double value);

} // MinimumDistanceFilter
