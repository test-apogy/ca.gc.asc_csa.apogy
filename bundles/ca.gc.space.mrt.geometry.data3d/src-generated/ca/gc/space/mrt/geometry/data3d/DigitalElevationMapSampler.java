/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

import ca.gc.space.mrt.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Elevation Map Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMapSampler#getTargetResolution <em>Target Resolution</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDigitalElevationMapSampler()
 * @model
 * @generated
 */
public interface DigitalElevationMapSampler extends Processor<DigitalElevationMap, DigitalElevationMap> {
	/**
	 * Returns the value of the '<em><b>Target Resolution</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Resolution</em>' attribute.
	 * @see #setTargetResolution(double)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getDigitalElevationMapSampler_TargetResolution()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getTargetResolution();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.DigitalElevationMapSampler#getTargetResolution <em>Target Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Resolution</em>' attribute.
	 * @see #getTargetResolution()
	 * @generated
	 */
	void setTargetResolution(double value);

} // DigitalElevationMapSampler