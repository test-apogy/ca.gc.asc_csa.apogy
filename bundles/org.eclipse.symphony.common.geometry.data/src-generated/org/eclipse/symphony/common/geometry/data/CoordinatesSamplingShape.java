/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getCoordinatesSamplingShape()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CoordinatesSamplingShape<T extends Coordinates> extends SamplingShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointUnique="false"
	 * @generated
	 */
	boolean isInside(T point);

} // CoordinatesSamplingShape
