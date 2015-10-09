/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d;

import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set25 DFilter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data25d.Data25dPackage#getCoordinatesSet25DFilter()
 * @model abstract="true"
 * @generated
 */
public interface CoordinatesSet25DFilter<T extends CoordinatesSet25D> extends Processor<T, T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	T createCoordinatesSet25D();

} // CoordinatesSet25DFilter
