package ca.gc.asc_csa.apogy.addons.sensors.range;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
