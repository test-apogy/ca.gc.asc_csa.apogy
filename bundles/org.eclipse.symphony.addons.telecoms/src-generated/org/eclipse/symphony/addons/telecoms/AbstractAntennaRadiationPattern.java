/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms;

import ca.gc.asc_csa.eclipse.emf.ecore.Named;

import ca.gc.space.topology.Node;

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
 * @see org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage#getAbstractAntennaRadiationPattern()
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
	 *        thetaAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" phiUnique="false"
	 *        phiAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='dB'"
	 * @generated
	 */
	double computeGain(double theta, double phi);

} // AbstractAntennaRadiationPattern
