package ca.gc.asc_csa.apogy.addons.util;
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

import ca.gc.asc_csa.apogy.addons.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.addons.AbstractTool;
import ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.apogy.addons.FeatureOfInterestPickingTool;
import ca.gc.asc_csa.apogy.addons.Ruler3DTool;
import ca.gc.asc_csa.apogy.addons.Ruler3dToolNode;
import ca.gc.asc_csa.apogy.addons.Simple3DTool;
import ca.gc.asc_csa.apogy.addons.SimpleTool;
import ca.gc.asc_csa.apogy.addons.SimpleToolList;
import ca.gc.asc_csa.apogy.addons.SunVector3DTool;
import ca.gc.asc_csa.apogy.addons.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.Trajectory3DTool;
import ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage
 * @generated
 */
public class ApogyAddonsSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyAddonsPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ApogyAddonsPackage.ABSTRACT_TOOL: {
				AbstractTool abstractTool = (AbstractTool)theEObject;
				T result = caseAbstractTool(abstractTool);
				if (result == null) result = caseNamed(abstractTool);
				if (result == null) result = caseDescribed(abstractTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST: {
				SimpleToolList simpleToolList = (SimpleToolList)theEObject;
				T result = caseSimpleToolList(simpleToolList);
				if (result == null) result = caseAbstractToolsListContainer(simpleToolList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.SIMPLE_TOOL: {
				SimpleTool simpleTool = (SimpleTool)theEObject;
				T result = caseSimpleTool(simpleTool);
				if (result == null) result = caseAbstractTool(simpleTool);
				if (result == null) result = caseNamed(simpleTool);
				if (result == null) result = caseDescribed(simpleTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.SIMPLE3_DTOOL: {
				Simple3DTool simple3DTool = (Simple3DTool)theEObject;
				T result = caseSimple3DTool(simple3DTool);
				if (result == null) result = caseSimpleTool(simple3DTool);
				if (result == null) result = caseAbstractTool(simple3DTool);
				if (result == null) result = caseNamed(simple3DTool);
				if (result == null) result = caseDescribed(simple3DTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.ABSTRACT_TWO_POINTS3_DTOOL: {
				AbstractTwoPoints3DTool abstractTwoPoints3DTool = (AbstractTwoPoints3DTool)theEObject;
				T result = caseAbstractTwoPoints3DTool(abstractTwoPoints3DTool);
				if (result == null) result = caseSimple3DTool(abstractTwoPoints3DTool);
				if (result == null) result = caseSimpleTool(abstractTwoPoints3DTool);
				if (result == null) result = caseAbstractTool(abstractTwoPoints3DTool);
				if (result == null) result = caseNamed(abstractTwoPoints3DTool);
				if (result == null) result = caseDescribed(abstractTwoPoints3DTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.RULER3_DTOOL: {
				Ruler3DTool ruler3DTool = (Ruler3DTool)theEObject;
				T result = caseRuler3DTool(ruler3DTool);
				if (result == null) result = caseAbstractTwoPoints3DTool(ruler3DTool);
				if (result == null) result = caseSimple3DTool(ruler3DTool);
				if (result == null) result = caseSimpleTool(ruler3DTool);
				if (result == null) result = caseAbstractTool(ruler3DTool);
				if (result == null) result = caseNamed(ruler3DTool);
				if (result == null) result = caseDescribed(ruler3DTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.RULER3D_TOOL_NODE: {
				Ruler3dToolNode ruler3dToolNode = (Ruler3dToolNode)theEObject;
				T result = caseRuler3dToolNode(ruler3dToolNode);
				if (result == null) result = caseNode(ruler3dToolNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL: {
				FeatureOfInterestPickingTool featureOfInterestPickingTool = (FeatureOfInterestPickingTool)theEObject;
				T result = caseFeatureOfInterestPickingTool(featureOfInterestPickingTool);
				if (result == null) result = caseSimple3DTool(featureOfInterestPickingTool);
				if (result == null) result = caseSimpleTool(featureOfInterestPickingTool);
				if (result == null) result = caseAbstractTool(featureOfInterestPickingTool);
				if (result == null) result = caseNamed(featureOfInterestPickingTool);
				if (result == null) result = caseDescribed(featureOfInterestPickingTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL: {
				SunVector3DTool sunVector3DTool = (SunVector3DTool)theEObject;
				T result = caseSunVector3DTool(sunVector3DTool);
				if (result == null) result = caseAbstractTwoPoints3DTool(sunVector3DTool);
				if (result == null) result = caseSimple3DTool(sunVector3DTool);
				if (result == null) result = caseSimpleTool(sunVector3DTool);
				if (result == null) result = caseAbstractTool(sunVector3DTool);
				if (result == null) result = caseNamed(sunVector3DTool);
				if (result == null) result = caseDescribed(sunVector3DTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL_NODE: {
				SunVector3DToolNode sunVector3DToolNode = (SunVector3DToolNode)theEObject;
				T result = caseSunVector3DToolNode(sunVector3DToolNode);
				if (result == null) result = caseNode(sunVector3DToolNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL: {
				TrajectoryPickingTool trajectoryPickingTool = (TrajectoryPickingTool)theEObject;
				T result = caseTrajectoryPickingTool(trajectoryPickingTool);
				if (result == null) result = caseSimple3DTool(trajectoryPickingTool);
				if (result == null) result = caseSimpleTool(trajectoryPickingTool);
				if (result == null) result = caseAbstractTool(trajectoryPickingTool);
				if (result == null) result = caseNamed(trajectoryPickingTool);
				if (result == null) result = caseDescribed(trajectoryPickingTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE: {
				TrajectoryPickingToolNode trajectoryPickingToolNode = (TrajectoryPickingToolNode)theEObject;
				T result = caseTrajectoryPickingToolNode(trajectoryPickingToolNode);
				if (result == null) result = caseAggregateGroupNode(trajectoryPickingToolNode);
				if (result == null) result = caseGroupNode(trajectoryPickingToolNode);
				if (result == null) result = caseNode(trajectoryPickingToolNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL: {
				Trajectory3DTool trajectory3DTool = (Trajectory3DTool)theEObject;
				T result = caseTrajectory3DTool(trajectory3DTool);
				if (result == null) result = caseSimple3DTool(trajectory3DTool);
				if (result == null) result = caseSimpleTool(trajectory3DTool);
				if (result == null) result = caseAbstractTool(trajectory3DTool);
				if (result == null) result = caseNamed(trajectory3DTool);
				if (result == null) result = caseDescribed(trajectory3DTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL_NODE: {
				Trajectory3DToolNode trajectory3DToolNode = (Trajectory3DToolNode)theEObject;
				T result = caseTrajectory3DToolNode(trajectory3DToolNode);
				if (result == null) result = caseAggregateGroupNode(trajectory3DToolNode);
				if (result == null) result = caseGroupNode(trajectory3DToolNode);
				if (result == null) result = caseNode(trajectory3DToolNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL: {
				GeometryPlacementAtFeatureOfInterestTool geometryPlacementAtFeatureOfInterestTool = (GeometryPlacementAtFeatureOfInterestTool)theEObject;
				T result = caseGeometryPlacementAtFeatureOfInterestTool(geometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseSimple3DTool(geometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseSimpleTool(geometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseAbstractTool(geometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseNamed(geometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseDescribed(geometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL: {
				URLNodeGeometryPlacementAtFeatureOfInterestTool urlNodeGeometryPlacementAtFeatureOfInterestTool = (URLNodeGeometryPlacementAtFeatureOfInterestTool)theEObject;
				T result = caseURLNodeGeometryPlacementAtFeatureOfInterestTool(urlNodeGeometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseGeometryPlacementAtFeatureOfInterestTool(urlNodeGeometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseSimple3DTool(urlNodeGeometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseSimpleTool(urlNodeGeometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseAbstractTool(urlNodeGeometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseNamed(urlNodeGeometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = caseDescribed(urlNodeGeometryPlacementAtFeatureOfInterestTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractTool(AbstractTool object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Tool List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Tool List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleToolList(SimpleToolList object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTool(SimpleTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple3DTool(Simple3DTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Two Points3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Two Points3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTwoPoints3DTool(AbstractTwoPoints3DTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruler3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruler3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuler3DTool(Ruler3DTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruler3d Tool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruler3d Tool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuler3dToolNode(Ruler3dToolNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Of Interest Picking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Of Interest Picking Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOfInterestPickingTool(FeatureOfInterestPickingTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Vector3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Vector3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSunVector3DTool(SunVector3DTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSunVector3DToolNode(SunVector3DToolNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory Picking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory Picking Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoryPickingTool(TrajectoryPickingTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory Picking Tool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory Picking Tool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoryPickingToolNode(TrajectoryPickingToolNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory3 DTool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory3 DTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectory3DTool(Trajectory3DTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory3 DTool Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory3 DTool Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectory3DToolNode(Trajectory3DToolNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Placement At Feature Of Interest Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Placement At Feature Of Interest Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryPlacementAtFeatureOfInterestTool(GeometryPlacementAtFeatureOfInterestTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Node Geometry Placement At Feature Of Interest Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Node Geometry Placement At Feature Of Interest Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLNodeGeometryPlacementAtFeatureOfInterestTool(URLNodeGeometryPlacementAtFeatureOfInterestTool object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractToolsListContainer(AbstractToolsListContainer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupNode(GroupNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ApogyAddonsSwitch
