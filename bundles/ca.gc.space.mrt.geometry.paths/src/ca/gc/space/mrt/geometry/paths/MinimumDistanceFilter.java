/**
 * Canadian Space Agency 2007.
 *
 * $Id: MinimumDistanceFilter.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.space.mrt.geometry.paths;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minimum Distance Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.paths.MinimumDistanceFilter#getMinimumDistance <em>Minimum Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.paths.PathsPackage#getMinimumDistanceFilter()
 * @model
 * @generated
 */
public interface MinimumDistanceFilter extends WayPointPathFilter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.geometry.paths.PathsPackage#getMinimumDistanceFilter_MinimumDistance()
	 * @model
	 * @generated
	 */
	double getMinimumDistance();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.paths.MinimumDistanceFilter#getMinimumDistance <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Distance</em>' attribute.
	 * @see #getMinimumDistance()
	 * @generated
	 */
	void setMinimumDistance(double value);

} // MinimumDistanceFilter
