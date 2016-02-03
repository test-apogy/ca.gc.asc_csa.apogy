package ca.gc.asc_csa.apogy.addons.telecoms;
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

import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Antenna Radiation Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract class defining a antenna radiation pattern, which is the directional (angular) dependence of
 * the strength of the radio waves from the antenna or other source.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getAbstractAntennaRadiationPattern()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAntennaRadiationPattern extends Node, Named {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the gain of the antenna in the direction specified by a vector.
	 * @param theta The angle between the z axis and the direction vector, in radians.
	 * @param phi The angle between the x axis and the projection of the point in the x-y plane, in radians
	 * @return The gain, in dBi (decibels isotropic or dBi) associated with the radiation pattern in the specified direction.
	 * <!-- end-model-doc -->
	 * @model unique="false" thetaUnique="false"
	 *        thetaAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'" phiUnique="false"
	 *        phiAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='dB'"
	 * @generated
	 */
	double computeGain(double theta, double phi);

} // AbstractAntennaRadiationPattern
