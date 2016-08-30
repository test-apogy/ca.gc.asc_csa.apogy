package ca.gc.asc_csa.apogy.examples.satellite;
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
 * A representation of the model object '<em><b>Orbital Image Constellation Downlink Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a {@link AbstractDownlinkItem} that contains an {@link OrbitalImage}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem#getImageURL <em>Image URL</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getOrbitalImageConstellationDownlinkItem()
 * @model
 * @generated
 */
public interface OrbitalImageConstellationDownlinkItem extends AbstractConstellationDownlinkItem {
	/**
	 * Returns the value of the '<em><b>Image URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image URL</em>' attribute.
	 * @see #setImageURL(String)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getOrbitalImageConstellationDownlinkItem_ImageURL()
	 * @model unique="false"
	 * @generated
	 */
	String getImageURL();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem#getImageURL <em>Image URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image URL</em>' attribute.
	 * @see #getImageURL()
	 * @generated
	 */
	void setImageURL(String value);

} // OrbitalImageConstellationDownlinkItem
