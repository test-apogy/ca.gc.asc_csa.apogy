/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.CoordinatesSetShapesSampler#getCoordinatesSamplingShapes <em>Coordinates Sampling Shapes</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.CoordinatesSetShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getCoordinatesSetShapesSampler()
 * @model
 * @generated
 */
public interface CoordinatesSetShapesSampler<T extends Coordinates> extends Processor<CoordinatesSet<T>, CoordinatesSet<T>> {
	/**
	 * Returns the value of the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape}&lt;T>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates Sampling Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates Sampling Shapes</em>' reference list.
	 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getCoordinatesSetShapesSampler_CoordinatesSamplingShapes()
	 * @model
	 * @generated
	 */
	EList<CoordinatesSamplingShape<T>> getCoordinatesSamplingShapes();

	/**
	 * Returns the value of the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * The default value is <code>"UNION"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.geometry.data.ShapeSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data.ShapeSamplingMode
	 * @see #setShapeSamplingMode(ShapeSamplingMode)
	 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getCoordinatesSetShapesSampler_ShapeSamplingMode()
	 * @model default="UNION" unique="false" required="true"
	 * @generated
	 */
	ShapeSamplingMode getShapeSamplingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data.CoordinatesSetShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data.ShapeSamplingMode
	 * @see #getShapeSamplingMode()
	 * @generated
	 */
	void setShapeSamplingMode(ShapeSamplingMode value);

} // CoordinatesSetShapesSampler
