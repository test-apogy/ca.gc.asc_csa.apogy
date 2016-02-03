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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Line Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getSimpleLineRangeScanner()
 * @model
 * @generated
 */
public interface SimpleLineRangeScanner extends LineRangeScanner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that performs the acquisition of one scan.
	 * Upon successful completion of the scan acquisition,
	 * the scanData should be updated with the latest scan
	 * and the method should return true. If the acquisition
	 * fails to complete properly, false should be returned.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean acquireScan();

} // SimpleLineRangeScanner
