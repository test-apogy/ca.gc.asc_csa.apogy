/**
 * Canadian Space Agency 2008.
 *
 * $Id: OutlierFilter.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outlier Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.OutlierFilter#getMaxDistance <em>Max Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getOutlierFilter()
 * @model
 * @generated
 */
public interface OutlierFilter extends Processor<CartesianCoordinatesSet, CartesianCoordinatesSet> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Max Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Distance</em>' attribute.
	 * @see #setMaxDistance(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getOutlierFilter_MaxDistance()
	 * @model
	 * @generated
	 */
	double getMaxDistance();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.OutlierFilter#getMaxDistance <em>Max Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Distance</em>' attribute.
	 * @see #getMaxDistance()
	 * @generated
	 */
	void setMaxDistance(double value);

} // OutlierFilter
