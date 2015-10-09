/**
 * Canadian Space Agency 2008.
 *
 * $Id: SimplePathPlannerWithExclusionZone.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Path Planner With Exclusion Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.SimplePathPlannerWithExclusionZone#getExclusionZonesCostFunction <em>Exclusion Zones Cost Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getSimplePathPlannerWithExclusionZone()
 * @model
 * @generated
 */
public interface SimplePathPlannerWithExclusionZone extends SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Exclusion Zones Cost Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusion Zones Cost Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Zones Cost Function</em>' reference.
	 * @see #setExclusionZonesCostFunction(ExclusionZonesCostFunction)
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getSimplePathPlannerWithExclusionZone_ExclusionZonesCostFunction()
	 * @model
	 * @generated
	 */
	ExclusionZonesCostFunction getExclusionZonesCostFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.SimplePathPlannerWithExclusionZone#getExclusionZonesCostFunction <em>Exclusion Zones Cost Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusion Zones Cost Function</em>' reference.
	 * @see #getExclusionZonesCostFunction()
	 * @generated
	 */
	void setExclusionZonesCostFunction(ExclusionZonesCostFunction value);

} // SimplePathPlannerWithExclusionZone
