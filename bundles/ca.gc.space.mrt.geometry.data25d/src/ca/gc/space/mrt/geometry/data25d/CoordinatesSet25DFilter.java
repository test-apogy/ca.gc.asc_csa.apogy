/**
 * Canadian Space Agency 2007.
 *
 * $Id: CoordinatesSet25DFilter.java,v 1.4.4.2 2015/05/21 15:51:20 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data25d;

import ca.gc.space.mrt.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set25 DFilter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getCoordinatesSet25DFilter()
 * @model abstract="true"
 * @generated
 */
public interface CoordinatesSet25DFilter<T extends CoordinatesSet25D> extends Processor<T, T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	T createCoordinatesSet25D();

} // CoordinatesSet25DFilter
