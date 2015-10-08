/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
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
public interface PolygonSamplingShape<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends SamplingShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" polygonUnique="false"
	 * @generated
	 */
	boolean isPolygonInside(PolygonType polygon);

} // PolygonSamplingShape
