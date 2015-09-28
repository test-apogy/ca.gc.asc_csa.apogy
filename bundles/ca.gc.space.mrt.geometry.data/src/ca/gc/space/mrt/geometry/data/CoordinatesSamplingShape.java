/**
 * Canadian Space Agency 2008
 *
 * $Id: CoordinatesSamplingShape.java,v 1.4.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getCoordinatesSamplingShape()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CoordinatesSamplingShape<T extends Coordinates> extends SamplingShape
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isInside(T point);

} // CoordinatesSamplingShape
