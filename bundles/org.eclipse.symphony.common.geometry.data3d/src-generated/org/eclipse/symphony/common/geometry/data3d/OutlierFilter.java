/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outlier Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.OutlierFilter#getMaxDistance <em>Max Distance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getOutlierFilter()
 * @model
 * @generated
 */
public interface OutlierFilter extends Processor<CartesianCoordinatesSet, CartesianCoordinatesSet> {
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getOutlierFilter_MaxDistance()
	 * @model unique="false"
	 * @generated
	 */
	double getMaxDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data3d.OutlierFilter#getMaxDistance <em>Max Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Distance</em>' attribute.
	 * @see #getMaxDistance()
	 * @generated
	 */
	void setMaxDistance(double value);

} // OutlierFilter
