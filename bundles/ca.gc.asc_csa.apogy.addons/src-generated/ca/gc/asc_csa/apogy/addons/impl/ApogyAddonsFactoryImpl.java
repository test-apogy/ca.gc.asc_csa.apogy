package ca.gc.asc_csa.apogy.addons.impl;
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
import javax.vecmath.Color3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.FeatureOfInterestPickingTool;
import ca.gc.asc_csa.apogy.addons.Ruler3DTool;
import ca.gc.asc_csa.apogy.addons.Ruler3dToolNode;
import ca.gc.asc_csa.apogy.addons.SimpleToolList;
import ca.gc.asc_csa.apogy.addons.SunVector3DTool;
import ca.gc.asc_csa.apogy.addons.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsFactory;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.Trajectory3DTool;
import ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsFactoryImpl extends EFactoryImpl implements ApogyAddonsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyAddonsFactory init()
  {
		try {
			ApogyAddonsFactory theApogyAddonsFactory = (ApogyAddonsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsPackage.eNS_URI);
			if (theApogyAddonsFactory != null) {
				return theApogyAddonsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST: return createSimpleToolList();
			case ApogyAddonsPackage.RULER3_DTOOL: return createRuler3DTool();
			case ApogyAddonsPackage.RULER3D_TOOL_NODE: return createRuler3dToolNode();
			case ApogyAddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL: return createFeatureOfInterestPickingTool();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL: return createSunVector3DTool();
			case ApogyAddonsPackage.SUN_VECTOR3_DTOOL_NODE: return createSunVector3DToolNode();
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL: return createTrajectoryPickingTool();
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE: return createTrajectoryPickingToolNode();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL: return createTrajectory3DTool();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL_NODE: return createTrajectory3DToolNode();
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL: return createURLNodeGeometryPlacementAtFeatureOfInterestTool();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case ApogyAddonsPackage.NODE_SELECTION:
				return createNodeSelectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyAddonsPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case ApogyAddonsPackage.NODE_SELECTION:
				return convertNodeSelectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleToolList createSimpleToolList() {
		SimpleToolListImpl simpleToolList = new SimpleToolListImpl();
		return simpleToolList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3DTool createRuler3DTool() {
		Ruler3DToolImpl ruler3DTool = new Ruler3DToolImpl();
		return ruler3DTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3dToolNode createRuler3dToolNode() {
		Ruler3dToolNodeImpl ruler3dToolNode = new Ruler3dToolNodeImpl();
		return ruler3dToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestPickingTool createFeatureOfInterestPickingTool() {
		FeatureOfInterestPickingToolImpl featureOfInterestPickingTool = new FeatureOfInterestPickingToolImpl();
		return featureOfInterestPickingTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DTool createSunVector3DTool() {
		SunVector3DToolImpl sunVector3DTool = new SunVector3DToolImpl();
		return sunVector3DTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolNode createSunVector3DToolNode() {
		SunVector3DToolNodeImpl sunVector3DToolNode = new SunVector3DToolNodeImpl();
		return sunVector3DToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingTool createTrajectoryPickingTool() {
		TrajectoryPickingToolImpl trajectoryPickingTool = new TrajectoryPickingToolImpl();
		return trajectoryPickingTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingToolNode createTrajectoryPickingToolNode() {
		TrajectoryPickingToolNodeImpl trajectoryPickingToolNode = new TrajectoryPickingToolNodeImpl();
		return trajectoryPickingToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DTool createTrajectory3DTool() {
		Trajectory3DToolImpl trajectory3DTool = new Trajectory3DToolImpl();
		return trajectory3DTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DToolNode createTrajectory3DToolNode() {
		Trajectory3DToolNodeImpl trajectory3DToolNode = new Trajectory3DToolNodeImpl();
		return trajectory3DToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNodeGeometryPlacementAtFeatureOfInterestTool createURLNodeGeometryPlacementAtFeatureOfInterestTool() {
		URLNodeGeometryPlacementAtFeatureOfInterestToolImpl urlNodeGeometryPlacementAtFeatureOfInterestTool = new URLNodeGeometryPlacementAtFeatureOfInterestToolImpl();
		return urlNodeGeometryPlacementAtFeatureOfInterestTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Color3f createColor3fFromString(EDataType eDataType, String initialValue) 
	{
		  Color3f color3f = new Color3f();
		  
		  String[] values = initialValue.split(",");
		  
		  color3f.x = Float.parseFloat(values[0]);
		  color3f.y = Float.parseFloat(values[1]);
		  color3f.z = Float.parseFloat(values[2]);

		  return color3f;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String convertColor3fToString(EDataType eDataType, Object instanceValue) 
	{
		  Color3f color3f = (Color3f) instanceValue;		 
		  String string = color3f.x + "," + color3f.y + "," + color3f.z;		  
		  return string;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelection createNodeSelectionFromString(EDataType eDataType, String initialValue) {
		return (NodeSelection)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeSelectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsPackage getApogyAddonsPackage() {
		return (ApogyAddonsPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyAddonsPackage getPackage()
  {
		return ApogyAddonsPackage.eINSTANCE;
	}

} //ApogyAddonsFactoryImpl
