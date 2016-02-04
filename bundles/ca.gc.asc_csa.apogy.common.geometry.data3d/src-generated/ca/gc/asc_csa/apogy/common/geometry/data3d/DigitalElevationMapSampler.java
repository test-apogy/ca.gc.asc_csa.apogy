package ca.gc.asc_csa.apogy.common.geometry.data3d;
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

import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Elevation Map Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A sampler that resamples a DEM based on a configurable resolution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler#getTargetResolution <em>Target Resolution</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getDigitalElevationMapSampler()
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
	 * <!-- begin-model-doc -->
	 * *
	 * The target resolution of the DEM the sampler will return.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Resolution</em>' attribute.
	 * @see #setTargetResolution(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getDigitalElevationMapSampler_TargetResolution()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getTargetResolution();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler#getTargetResolution <em>Target Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Resolution</em>' attribute.
	 * @see #getTargetResolution()
	 * @generated
	 */
	void setTargetResolution(double value);

} // DigitalElevationMapSampler
