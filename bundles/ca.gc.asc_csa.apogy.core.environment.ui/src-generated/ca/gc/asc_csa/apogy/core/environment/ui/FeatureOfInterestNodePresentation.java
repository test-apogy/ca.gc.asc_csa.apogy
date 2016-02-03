package ca.gc.asc_csa.apogy.core.environment.ui;
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

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation#getPoleHeight <em>Pole Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation#isFlagVisible <em>Flag Visible</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getFeatureOfInterestNodePresentation()
 * @model
 * @generated
 */
public interface FeatureOfInterestNodePresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Pole Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pole Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pole Height</em>' attribute.
	 * @see #setPoleHeight(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getFeatureOfInterestNodePresentation_PoleHeight()
	 * @model unique="false"
	 * @generated
	 */
	double getPoleHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation#getPoleHeight <em>Pole Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pole Height</em>' attribute.
	 * @see #getPoleHeight()
	 * @generated
	 */
	void setPoleHeight(double value);

	/**
	 * Returns the value of the '<em><b>Flag Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag Visible</em>' attribute.
	 * @see #setFlagVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getFeatureOfInterestNodePresentation_FlagVisible()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isFlagVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation#isFlagVisible <em>Flag Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag Visible</em>' attribute.
	 * @see #isFlagVisible()
	 * @generated
	 */
	void setFlagVisible(boolean value);

} // FeatureOfInterestNodePresentation
