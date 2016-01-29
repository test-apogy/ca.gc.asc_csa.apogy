/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion Zones Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction#getExclusionZones <em>Exclusion Zones</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getExclusionZonesCostFunction()
 * @model
 * @generated
 */
public interface ExclusionZonesCostFunction extends DisplacementCostFunction {
	/**
	 * Returns the value of the '<em><b>Exclusion Zones</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ExclusionZone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Zones</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getExclusionZonesCostFunction_ExclusionZones()
	 * @model
	 * @generated
	 */
	EList<ExclusionZone> getExclusionZones();

} // ExclusionZonesCostFunction
