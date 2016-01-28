/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range;

import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;

import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getRangeScanner()
 * @model
 * @generated
 */
public interface RangeScanner<InputType> extends RangeSensor, Processor<InputType, VolumetricCoordinatesSet25D> {
} // RangeScanner
