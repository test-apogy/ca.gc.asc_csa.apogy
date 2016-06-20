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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Downlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A {@link ConstellationDownlink} class contains the {@link AbstractConstellationDownlinkItem}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink#getConstellationDownlinksList <em>Constellation Downlinks List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink#getDownlinkItems <em>Downlink Items</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationDownlink()
 * @model
 * @generated
 */
public interface ConstellationDownlink extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Downlinks List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList#getDownlinks <em>Downlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers he container {@link ConstellationDownlinksList}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Downlinks List</em>' container reference.
	 * @see #setConstellationDownlinksList(ConstellationDownlinksList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationDownlink_ConstellationDownlinksList()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList#getDownlinks
	 * @model opposite="downlinks" transient="false"
	 * @generated
	 */
	ConstellationDownlinksList getConstellationDownlinksList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink#getConstellationDownlinksList <em>Constellation Downlinks List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Downlinks List</em>' container reference.
	 * @see #getConstellationDownlinksList()
	 * @generated
	 */
	void setConstellationDownlinksList(ConstellationDownlinksList value);

	/**
	 * Returns the value of the '<em><b>Downlink Items</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Downlink Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the {@link AbstractConstellationDownlinkItem}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Downlink Items</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationDownlink_DownlinkItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConstellationDownlinkItem> getDownlinkItems();

} // ConstellationDownlink
