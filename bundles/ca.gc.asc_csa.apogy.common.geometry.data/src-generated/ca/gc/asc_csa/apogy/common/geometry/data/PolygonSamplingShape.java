/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getPolygonSamplingShape()
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
