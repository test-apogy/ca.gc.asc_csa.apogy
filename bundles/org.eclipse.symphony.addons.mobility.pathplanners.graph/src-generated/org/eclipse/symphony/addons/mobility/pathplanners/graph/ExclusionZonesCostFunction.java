/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion Zones Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction#getExclusionZones <em>Exclusion Zones</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getExclusionZonesCostFunction()
 * @model
 * @generated
 */
public interface ExclusionZonesCostFunction extends DisplacementCostFunction {
	/**
	 * Returns the value of the '<em><b>Exclusion Zones</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.mobility.pathplanners.ExclusionZone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Zones</em>' reference list.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getExclusionZonesCostFunction_ExclusionZones()
	 * @model
	 * @generated
	 */
	EList<ExclusionZone> getExclusionZones();

} // ExclusionZonesCostFunction
