/**
 * Canadian Space Agency 2008
 *
 * $Id: PolygonSamplingShape.java,v 1.4.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getPolygonSamplingShape()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PolygonSamplingShape<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends SamplingShape
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isPolygonInside(PolygonType polygon);

} // PolygonSamplingShape
