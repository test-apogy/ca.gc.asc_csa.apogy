/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeScanner.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.processors.Processor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRangeScanner()
 * @model
 * @generated
 */
public interface RangeScanner<InputType> extends RangeSensor, Processor<InputType, VolumetricCoordinatesSet25D> {
} // RangeScanner
