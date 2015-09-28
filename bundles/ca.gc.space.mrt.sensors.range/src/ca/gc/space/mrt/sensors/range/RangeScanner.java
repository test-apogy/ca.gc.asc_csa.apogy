/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeScanner.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;

import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.geometry.data25d.VolumetricCoordinatesSet25D;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRangeScanner()
 * @model
 * @generated
 */
public interface RangeScanner<InputType> extends RangeSensor, Processor<InputType, VolumetricCoordinatesSet25D> {
} // RangeScanner
