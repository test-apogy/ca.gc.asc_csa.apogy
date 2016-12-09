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

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.AbstractTool;
import ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.apogy.addons.AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.addons.FeatureOfInterestPickingTool;
import ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.addons.Ruler3DTool;
import ca.gc.asc_csa.apogy.addons.Ruler3dToolNode;
import ca.gc.asc_csa.apogy.addons.Simple3DTool;
import ca.gc.asc_csa.apogy.addons.SimpleTool;
import ca.gc.asc_csa.apogy.addons.SimpleToolList;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsFactory;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.Trajectory3DTool;
import ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode;
import ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsPackageImpl extends EPackageImpl implements ApogyAddonsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleToolListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTwoPoints3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruler3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruler3dToolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOfInterestPickingToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectoryPickingToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectoryPickingToolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectory3DToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectory3DToolNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryPlacementAtFeatureOfInterestToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlNodeGeometryPlacementAtFeatureOfInterestToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeSelectionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyAddonsPackageImpl() {
		super(eNS_URI, ApogyAddonsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyAddonsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyAddonsPackage init() {
		if (isInited) return (ApogyAddonsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyAddonsPackageImpl theApogyAddonsPackage = (ApogyAddonsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyAddonsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyAddonsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCorePackage.eINSTANCE.eClass();
		ApogyAddonsGeometryPathsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyAddonsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyAddonsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyAddonsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyAddonsPackage.eNS_URI, theApogyAddonsPackage);
		return theApogyAddonsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTool() {
		return abstractToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleToolList() {
		return simpleToolListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleToolList_SimpleTools() {
		return (EReference)simpleToolListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTool() {
		return simpleToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTool_ToolList() {
		return (EReference)simpleToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTool_Active() {
		return (EAttribute)simpleToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTool_Disposed() {
		return (EAttribute)simpleToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleTool__Initialise() {
		return simpleToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleTool__Dispose() {
		return simpleToolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple3DTool() {
		return simple3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimple3DTool_Visible() {
		return (EAttribute)simple3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple3DTool_RootNode() {
		return (EReference)simple3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimple3DTool__SelectionChanged__NodeSelection() {
		return simple3DToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTwoPoints3DTool() {
		return abstractTwoPoints3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_FromAbsolutePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_FromRelativePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_FromNode() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTwoPoints3DTool_FromNodeLock() {
		return (EAttribute)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_ToAbsolutePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_ToRelativePosition() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTwoPoints3DTool_ToNode() {
		return (EReference)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTwoPoints3DTool_ToNodeLock() {
		return (EAttribute)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTwoPoints3DTool_Distance() {
		return (EAttribute)abstractTwoPoints3DToolEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d() {
		return abstractTwoPoints3DToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuler3DTool() {
		return ruler3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_RulerColor() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_ExtremitiesRadius() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MinorTickColor() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MinorTickSpacing() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MinorTickLength() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MajorTickColor() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MajorTickSpacing() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuler3DTool_MajorTickLength() {
		return (EAttribute)ruler3DToolEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuler3DTool_Ruler3dToolNode() {
		return (EReference)ruler3DToolEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuler3dToolNode() {
		return ruler3dToolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuler3dToolNode_Ruler3DTool() {
		return (EReference)ruler3dToolNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOfInterestPickingTool() {
		return featureOfInterestPickingToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_FeatureOfInterestList() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickAbsolutePosition() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickRelativePosition() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickedNode() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickAbsoluteNormal() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestPickingTool_PickRelativeNormal() {
		return (EReference)featureOfInterestPickingToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectoryPickingTool() {
		return trajectoryPickingToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectoryPickingTool_AltitudeOffset() {
		return (EAttribute)trajectoryPickingToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectoryPickingTool_Paths() {
		return (EReference)trajectoryPickingToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectoryPickingTool_ActivePath() {
		return (EReference)trajectoryPickingToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectoryPickingTool_TrajectoryPickingToolNode() {
		return (EReference)trajectoryPickingToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrajectoryPickingTool__ClearActivePath() {
		return trajectoryPickingToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectoryPickingToolNode() {
		return trajectoryPickingToolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectoryPickingToolNode_TrajectoryPickingTool() {
		return (EReference)trajectoryPickingToolNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectory3DTool() {
		return trajectory3DToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectory3DTool_PenDown() {
		return (EAttribute)trajectory3DToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_Variable() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectory3DTool_DistanceThreshold() {
		return (EAttribute)trajectory3DToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectory3DTool_TotalDistance() {
		return (EAttribute)trajectory3DToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_Paths() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_PoseProvider() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DTool_Trajectory3DToolNode() {
		return (EReference)trajectory3DToolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectory3DToolNode() {
		return trajectory3DToolNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory3DToolNode_Trajectory3DTool() {
		return (EReference)trajectory3DToolNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryPlacementAtFeatureOfInterestTool() {
		return geometryPlacementAtFeatureOfInterestToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterest() {
		return (EReference)geometryPlacementAtFeatureOfInterestToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterestNode() {
		return (EReference)geometryPlacementAtFeatureOfInterestToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryPlacementAtFeatureOfInterestTool_TransformNode() {
		return (EReference)geometryPlacementAtFeatureOfInterestToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeometryPlacementAtFeatureOfInterestTool__LoadGeometry() {
		return geometryPlacementAtFeatureOfInterestToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool() {
		return abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_CadTransformNode() {
		return (EReference)abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_UrlNode() {
		return (EReference)abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool__GetGeometryOffsets() {
		return abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool__GetGeometryURL() {
		return abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLNodeGeometryPlacementAtFeatureOfInterestTool() {
		return urlNodeGeometryPlacementAtFeatureOfInterestToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLNodeGeometryPlacementAtFeatureOfInterestTool_URL() {
		return (EAttribute)urlNodeGeometryPlacementAtFeatureOfInterestToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getURLNodeGeometryPlacementAtFeatureOfInterestTool_CadToToolTransform() {
		return (EReference)urlNodeGeometryPlacementAtFeatureOfInterestToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeSelection() {
		return nodeSelectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsFactory getApogyAddonsFactory() {
		return (ApogyAddonsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractToolEClass = createEClass(ABSTRACT_TOOL);

		simpleToolListEClass = createEClass(SIMPLE_TOOL_LIST);
		createEReference(simpleToolListEClass, SIMPLE_TOOL_LIST__SIMPLE_TOOLS);

		simpleToolEClass = createEClass(SIMPLE_TOOL);
		createEReference(simpleToolEClass, SIMPLE_TOOL__TOOL_LIST);
		createEAttribute(simpleToolEClass, SIMPLE_TOOL__ACTIVE);
		createEAttribute(simpleToolEClass, SIMPLE_TOOL__DISPOSED);
		createEOperation(simpleToolEClass, SIMPLE_TOOL___INITIALISE);
		createEOperation(simpleToolEClass, SIMPLE_TOOL___DISPOSE);

		simple3DToolEClass = createEClass(SIMPLE3_DTOOL);
		createEAttribute(simple3DToolEClass, SIMPLE3_DTOOL__VISIBLE);
		createEReference(simple3DToolEClass, SIMPLE3_DTOOL__ROOT_NODE);
		createEOperation(simple3DToolEClass, SIMPLE3_DTOOL___SELECTION_CHANGED__NODESELECTION);

		abstractTwoPoints3DToolEClass = createEClass(ABSTRACT_TWO_POINTS3_DTOOL);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_ABSOLUTE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_RELATIVE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE);
		createEAttribute(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__FROM_NODE_LOCK);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_ABSOLUTE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_RELATIVE_POSITION);
		createEReference(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE);
		createEAttribute(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__TO_NODE_LOCK);
		createEAttribute(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL__DISTANCE);
		createEOperation(abstractTwoPoints3DToolEClass, ABSTRACT_TWO_POINTS3_DTOOL___POINTS_RELATIVE_POSE_CHANGED__MATRIX4D);

		ruler3DToolEClass = createEClass(RULER3_DTOOL);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__RULER_COLOR);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__EXTREMITIES_RADIUS);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MINOR_TICK_COLOR);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MINOR_TICK_SPACING);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MINOR_TICK_LENGTH);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MAJOR_TICK_COLOR);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MAJOR_TICK_SPACING);
		createEAttribute(ruler3DToolEClass, RULER3_DTOOL__MAJOR_TICK_LENGTH);
		createEReference(ruler3DToolEClass, RULER3_DTOOL__RULER3D_TOOL_NODE);

		ruler3dToolNodeEClass = createEClass(RULER3D_TOOL_NODE);
		createEReference(ruler3dToolNodeEClass, RULER3D_TOOL_NODE__RULER3_DTOOL);

		featureOfInterestPickingToolEClass = createEClass(FEATURE_OF_INTEREST_PICKING_TOOL);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__FEATURE_OF_INTEREST_LIST);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_POSITION);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_POSITION);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICKED_NODE);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_ABSOLUTE_NORMAL);
		createEReference(featureOfInterestPickingToolEClass, FEATURE_OF_INTEREST_PICKING_TOOL__PICK_RELATIVE_NORMAL);

		trajectoryPickingToolEClass = createEClass(TRAJECTORY_PICKING_TOOL);
		createEAttribute(trajectoryPickingToolEClass, TRAJECTORY_PICKING_TOOL__ALTITUDE_OFFSET);
		createEReference(trajectoryPickingToolEClass, TRAJECTORY_PICKING_TOOL__PATHS);
		createEReference(trajectoryPickingToolEClass, TRAJECTORY_PICKING_TOOL__ACTIVE_PATH);
		createEReference(trajectoryPickingToolEClass, TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE);
		createEOperation(trajectoryPickingToolEClass, TRAJECTORY_PICKING_TOOL___CLEAR_ACTIVE_PATH);

		trajectoryPickingToolNodeEClass = createEClass(TRAJECTORY_PICKING_TOOL_NODE);
		createEReference(trajectoryPickingToolNodeEClass, TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL);

		trajectory3DToolEClass = createEClass(TRAJECTORY3_DTOOL);
		createEAttribute(trajectory3DToolEClass, TRAJECTORY3_DTOOL__PEN_DOWN);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__VARIABLE);
		createEAttribute(trajectory3DToolEClass, TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD);
		createEAttribute(trajectory3DToolEClass, TRAJECTORY3_DTOOL__TOTAL_DISTANCE);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__PATHS);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__POSE_PROVIDER);
		createEReference(trajectory3DToolEClass, TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE);

		trajectory3DToolNodeEClass = createEClass(TRAJECTORY3_DTOOL_NODE);
		createEReference(trajectory3DToolNodeEClass, TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL);

		geometryPlacementAtFeatureOfInterestToolEClass = createEClass(GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL);
		createEReference(geometryPlacementAtFeatureOfInterestToolEClass, GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST);
		createEReference(geometryPlacementAtFeatureOfInterestToolEClass, GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST_NODE);
		createEReference(geometryPlacementAtFeatureOfInterestToolEClass, GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__TRANSFORM_NODE);
		createEOperation(geometryPlacementAtFeatureOfInterestToolEClass, GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL___LOAD_GEOMETRY);

		abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass = createEClass(ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL);
		createEReference(abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass, ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__CAD_TRANSFORM_NODE);
		createEReference(abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass, ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE);
		createEOperation(abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass, ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL___GET_GEOMETRY_OFFSETS);
		createEOperation(abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass, ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL___GET_GEOMETRY_URL);

		urlNodeGeometryPlacementAtFeatureOfInterestToolEClass = createEClass(URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL);
		createEAttribute(urlNodeGeometryPlacementAtFeatureOfInterestToolEClass, URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL);
		createEReference(urlNodeGeometryPlacementAtFeatureOfInterestToolEClass, URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__CAD_TO_TOOL_TRANSFORM);

		// Create data types
		color3fEDataType = createEDataType(COLOR3F);
		nodeSelectionEDataType = createEDataType(NODE_SELECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyAddonsGeometryPathsPackage theApogyAddonsGeometryPathsPackage = (ApogyAddonsGeometryPathsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsGeometryPathsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractToolEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractToolEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		simpleToolListEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getAbstractToolsListContainer());
		simpleToolEClass.getESuperTypes().add(this.getAbstractTool());
		simple3DToolEClass.getESuperTypes().add(this.getSimpleTool());
		abstractTwoPoints3DToolEClass.getESuperTypes().add(this.getSimple3DTool());
		ruler3DToolEClass.getESuperTypes().add(this.getAbstractTwoPoints3DTool());
		ruler3dToolNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getNode());
		featureOfInterestPickingToolEClass.getESuperTypes().add(this.getSimple3DTool());
		trajectoryPickingToolEClass.getESuperTypes().add(this.getSimple3DTool());
		trajectoryPickingToolNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		trajectory3DToolEClass.getESuperTypes().add(this.getSimple3DTool());
		trajectory3DToolNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		geometryPlacementAtFeatureOfInterestToolEClass.getESuperTypes().add(this.getSimple3DTool());
		abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass.getESuperTypes().add(this.getGeometryPlacementAtFeatureOfInterestTool());
		urlNodeGeometryPlacementAtFeatureOfInterestToolEClass.getESuperTypes().add(this.getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractToolEClass, AbstractTool.class, "AbstractTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleToolListEClass, SimpleToolList.class, "SimpleToolList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleToolList_SimpleTools(), this.getSimpleTool(), this.getSimpleTool_ToolList(), "simpleTools", null, 0, -1, SimpleToolList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleToolEClass, SimpleTool.class, "SimpleTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTool_ToolList(), this.getSimpleToolList(), this.getSimpleToolList_SimpleTools(), "toolList", null, 0, 1, SimpleTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTool_Active(), theEcorePackage.getEBoolean(), "active", "false", 0, 1, SimpleTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTool_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, SimpleTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSimpleTool__Initialise(), null, "initialise", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getSimpleTool__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(simple3DToolEClass, Simple3DTool.class, "Simple3DTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimple3DTool_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, Simple3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimple3DTool_RootNode(), theApogyCommonTopologyPackage.getNode(), null, "rootNode", null, 0, 1, Simple3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSimple3DTool__SelectionChanged__NodeSelection(), null, "selectionChanged", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNodeSelection(), "nodeSelection", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractTwoPoints3DToolEClass, AbstractTwoPoints3DTool.class, "AbstractTwoPoints3DTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTwoPoints3DTool_FromAbsolutePosition(), theApogyCommonMathPackage.getTuple3d(), null, "fromAbsolutePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_FromRelativePosition(), theApogyCommonMathPackage.getTuple3d(), null, "fromRelativePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_FromNode(), theApogyCommonTopologyPackage.getNode(), null, "fromNode", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTwoPoints3DTool_FromNodeLock(), theEcorePackage.getEBoolean(), "fromNodeLock", "false", 0, 1, AbstractTwoPoints3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_ToAbsolutePosition(), theApogyCommonMathPackage.getTuple3d(), null, "toAbsolutePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_ToRelativePosition(), theApogyCommonMathPackage.getTuple3d(), null, "toRelativePosition", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTwoPoints3DTool_ToNode(), theApogyCommonTopologyPackage.getNode(), null, "toNode", null, 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTwoPoints3DTool_ToNodeLock(), theEcorePackage.getEBoolean(), "toNodeLock", "false", 0, 1, AbstractTwoPoints3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTwoPoints3DTool_Distance(), theEcorePackage.getEDouble(), "distance", "0", 0, 1, AbstractTwoPoints3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d(), null, "pointsRelativePoseChanged", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getMatrix4d(), "newPose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(ruler3DToolEClass, Ruler3DTool.class, "Ruler3DTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuler3DTool_RulerColor(), this.getColor3f(), "rulerColor", "0.0,1.0,0.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_ExtremitiesRadius(), theEcorePackage.getEDouble(), "extremitiesRadius", "0.01", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MinorTickColor(), this.getColor3f(), "minorTickColor", "0.0,1.0,0.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MinorTickSpacing(), theEcorePackage.getEDouble(), "minorTickSpacing", "0.1", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MinorTickLength(), theEcorePackage.getEDouble(), "minorTickLength", "0.1", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MajorTickColor(), this.getColor3f(), "majorTickColor", "0.0,1.0,0.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MajorTickSpacing(), theEcorePackage.getEDouble(), "majorTickSpacing", "1.0", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuler3DTool_MajorTickLength(), theEcorePackage.getEDouble(), "majorTickLength", "0.2", 0, 1, Ruler3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuler3DTool_Ruler3dToolNode(), this.getRuler3dToolNode(), this.getRuler3dToolNode_Ruler3DTool(), "ruler3dToolNode", null, 0, 1, Ruler3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruler3dToolNodeEClass, Ruler3dToolNode.class, "Ruler3dToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuler3dToolNode_Ruler3DTool(), this.getRuler3DTool(), this.getRuler3DTool_Ruler3dToolNode(), "ruler3DTool", null, 0, 1, Ruler3dToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOfInterestPickingToolEClass, FeatureOfInterestPickingTool.class, "FeatureOfInterestPickingTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOfInterestPickingTool_FeatureOfInterestList(), theApogyCorePackage.getFeatureOfInterestList(), null, "featureOfInterestList", null, 0, 1, FeatureOfInterestPickingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickAbsolutePosition(), theApogyCommonMathPackage.getTuple3d(), null, "pickAbsolutePosition", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickRelativePosition(), theApogyCommonMathPackage.getTuple3d(), null, "pickRelativePosition", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickedNode(), theApogyCommonTopologyPackage.getNode(), null, "pickedNode", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickAbsoluteNormal(), theApogyCommonMathPackage.getTuple3d(), null, "pickAbsoluteNormal", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureOfInterestPickingTool_PickRelativeNormal(), theApogyCommonMathPackage.getTuple3d(), null, "pickRelativeNormal", null, 0, 1, FeatureOfInterestPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectoryPickingToolEClass, TrajectoryPickingTool.class, "TrajectoryPickingTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrajectoryPickingTool_AltitudeOffset(), theEcorePackage.getEDouble(), "altitudeOffset", "0", 0, 1, TrajectoryPickingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectoryPickingTool_Paths(), theApogyAddonsGeometryPathsPackage.getWayPointPath(), null, "paths", null, 1, -1, TrajectoryPickingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectoryPickingTool_ActivePath(), theApogyAddonsGeometryPathsPackage.getWayPointPath(), null, "activePath", null, 1, 1, TrajectoryPickingTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectoryPickingTool_TrajectoryPickingToolNode(), this.getTrajectoryPickingToolNode(), this.getTrajectoryPickingToolNode_TrajectoryPickingTool(), "trajectoryPickingToolNode", null, 0, 1, TrajectoryPickingTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTrajectoryPickingTool__ClearActivePath(), null, "clearActivePath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(trajectoryPickingToolNodeEClass, TrajectoryPickingToolNode.class, "TrajectoryPickingToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrajectoryPickingToolNode_TrajectoryPickingTool(), this.getTrajectoryPickingTool(), this.getTrajectoryPickingTool_TrajectoryPickingToolNode(), "trajectoryPickingTool", null, 0, 1, TrajectoryPickingToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectory3DToolEClass, Trajectory3DTool.class, "Trajectory3DTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrajectory3DTool_PenDown(), theEcorePackage.getEBoolean(), "penDown", "true", 0, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_Variable(), theApogyCoreInvocatorPackage.getVariable(), null, "variable", null, 1, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrajectory3DTool_DistanceThreshold(), theEcorePackage.getEDouble(), "distanceThreshold", "0.01", 0, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrajectory3DTool_TotalDistance(), theEcorePackage.getEDouble(), "totalDistance", "0.0", 0, 1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_Paths(), theApogyAddonsGeometryPathsPackage.getWayPointPath(), null, "paths", null, 0, -1, Trajectory3DTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_PoseProvider(), theApogyCorePackage.getPoseProvider(), null, "poseProvider", null, 0, 1, Trajectory3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory3DTool_Trajectory3DToolNode(), this.getTrajectory3DToolNode(), this.getTrajectory3DToolNode_Trajectory3DTool(), "trajectory3DToolNode", null, 0, 1, Trajectory3DTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectory3DToolNodeEClass, Trajectory3DToolNode.class, "Trajectory3DToolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrajectory3DToolNode_Trajectory3DTool(), this.getTrajectory3DTool(), this.getTrajectory3DTool_Trajectory3DToolNode(), "trajectory3DTool", null, 0, 1, Trajectory3DToolNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryPlacementAtFeatureOfInterestToolEClass, GeometryPlacementAtFeatureOfInterestTool.class, "GeometryPlacementAtFeatureOfInterestTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterest(), theApogyCorePackage.getFeatureOfInterest(), null, "featureOfInterest", null, 0, 1, GeometryPlacementAtFeatureOfInterestTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterestNode(), theApogyCorePackage.getFeatureOfInterestNode(), null, "featureOfInterestNode", null, 0, 1, GeometryPlacementAtFeatureOfInterestTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeometryPlacementAtFeatureOfInterestTool_TransformNode(), theApogyCommonTopologyPackage.getTransformNode(), null, "transformNode", null, 0, 1, GeometryPlacementAtFeatureOfInterestTool.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGeometryPlacementAtFeatureOfInterestTool__LoadGeometry(), theApogyCommonTopologyPackage.getNode(), "loadGeometry", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass, AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool.class, "AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_CadTransformNode(), theApogyCommonTopologyPackage.getTransformNode(), null, "cadTransformNode", null, 0, 1, AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_UrlNode(), theApogyCommonTopologyPackage.getURLNode(), null, "urlNode", null, 0, 1, AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool__GetGeometryOffsets(), theApogyCommonMathPackage.getMatrix4x4(), "getGeometryOffsets", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool__GetGeometryURL(), theEcorePackage.getEString(), "getGeometryURL", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(urlNodeGeometryPlacementAtFeatureOfInterestToolEClass, URLNodeGeometryPlacementAtFeatureOfInterestTool.class, "URLNodeGeometryPlacementAtFeatureOfInterestTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLNodeGeometryPlacementAtFeatureOfInterestTool_URL(), theEcorePackage.getEString(), "URL", null, 0, 1, URLNodeGeometryPlacementAtFeatureOfInterestTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getURLNodeGeometryPlacementAtFeatureOfInterestTool_CadToToolTransform(), theApogyCommonMathPackage.getMatrix4x4(), null, "cadToToolTransform", null, 0, 1, URLNodeGeometryPlacementAtFeatureOfInterestTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeSelectionEDataType, NodeSelection.class, "NodeSelection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyAddons",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "modelName", "ApogyAddons",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.addons/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.addons.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy"
		   });	
		addAnnotation
		  (getSimpleToolList_SimpleTools(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getSimpleTool__Initialise(), 
		   source, 
		   new String[] {
			 "documentation", "*\nMethod called when the tool is added to its toolList."
		   });	
		addAnnotation
		  (getSimpleTool__Dispose(), 
		   source, 
		   new String[] {
			 "documentation", "*\nMethod called when the tool is remove from its toolList."
		   });	
		addAnnotation
		  (getSimpleTool_ToolList(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe SimpleToolList containing the tool."
		   });	
		addAnnotation
		  (getSimpleTool_Active(), 
		   source, 
		   new String[] {
			 "documentation", "*\nWhether or  not the tool is active."
		   });	
		addAnnotation
		  (getSimpleTool_Disposed(), 
		   source, 
		   new String[] {
			 "documentation", "*\nWhether or  not the tool is disposed.",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getSimple3DTool__SelectionChanged__NodeSelection(), 
		   source, 
		   new String[] {
			 "documentation", "* Method called upon a user selection in the 3D viewer. Sub-classes should implement."
		   });	
		addAnnotation
		  (getSimple3DTool_Visible(), 
		   source, 
		   new String[] {
			 "documentation", "*\nWhether or  not the tool is visible."
		   });	
		addAnnotation
		  (getSimple3DTool_RootNode(), 
		   source, 
		   new String[] {
			 "documentation", "* The root node of the current topology. Is set automatically by Apogy after the tool is registered."
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool__PointsRelativePoseChanged__Matrix4d(), 
		   source, 
		   new String[] {
			 "documentation", " Method called when the pose between from and to changes."
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromAbsolutePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromRelativePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_FromNodeLock(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "FROM_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToAbsolutePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToRelativePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_ToNodeLock(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "TO_NODE"
		   });	
		addAnnotation
		  (getAbstractTwoPoints3DTool_Distance(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (ruler3DToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "A 3D tool used to measure distance between two points."
		   });	
		addAnnotation
		  (getRuler3DTool_RulerColor(), 
		   source, 
		   new String[] {
			 "documentation", " The ruler color.",
			 "propertyCategory", "RULER_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_ExtremitiesRadius(), 
		   source, 
		   new String[] {
			 "documentation", " Radius of sphere used as ruler end points.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "RULER_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MinorTickColor(), 
		   source, 
		   new String[] {
			 "documentation", " Minor tick color.",
			 "propertyCategory", "MINOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MinorTickSpacing(), 
		   source, 
		   new String[] {
			 "documentation", " Spacing between minor tick mark.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "MINOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MinorTickLength(), 
		   source, 
		   new String[] {
			 "documentation", " Length of the minor tick marks as displayed on the ruler.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "MINOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MajorTickColor(), 
		   source, 
		   new String[] {
			 "documentation", " Major tick color.",
			 "propertyCategory", "MAJOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MajorTickSpacing(), 
		   source, 
		   new String[] {
			 "documentation", " Spacing between major tick mark.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "MAJOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_MajorTickLength(), 
		   source, 
		   new String[] {
			 "documentation", " Length of the major tick marks as displayed on the ruler.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "MAJOR_TICKS_PROPERTIES"
		   });	
		addAnnotation
		  (getRuler3DTool_Ruler3dToolNode(), 
		   source, 
		   new String[] {
			 "documentation", " Topology Node associated with the tool.",
			 "notify", "true",
			 "children", "true",
			 "property", "Readonly",
			 "propertyCategory", "RULER_PROPERTIES"
		   });	
		addAnnotation
		  (featureOfInterestPickingToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "A 3D tool used to create FeatureOfInterest."
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_FeatureOfInterestList(), 
		   source, 
		   new String[] {
			 "documentation", " List of Feature Of Interest where to add Feature Of Interest.",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickAbsolutePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickRelativePosition(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickedNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickAbsoluteNormal(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (getFeatureOfInterestPickingTool_PickRelativeNormal(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "propertyCategory", "PICKED_NODE"
		   });	
		addAnnotation
		  (trajectoryPickingToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA 3D tool used to define trajectories by piking point in the 3D world.\nThe tool support the creation of multiple path."
		   });	
		addAnnotation
		  (getTrajectoryPickingTool__ClearActivePath(), 
		   source, 
		   new String[] {
			 "documentation", "*\nClears all points from the active path."
		   });	
		addAnnotation
		  (getTrajectoryPickingTool_AltitudeOffset(), 
		   source, 
		   new String[] {
			 "documentation", "* Offset to apply to the point to keep a wyapoint path above ground.",
			 "notify", "true",
			 "apogy_units", "m",
			 "propertyCategory", "TRAJECTORY_PICKING_TOOL"
		   });	
		addAnnotation
		  (getTrajectoryPickingTool_Paths(), 
		   source, 
		   new String[] {
			 "documentation", "* All the  WayPointPath created with this tool.",
			 "notify", "true",
			 "propertyCategory", "TRAJECTORY_PICKING_TOOL"
		   });	
		addAnnotation
		  (getTrajectoryPickingTool_ActivePath(), 
		   source, 
		   new String[] {
			 "documentation", "* The WayPointPath to which selected points are to be added.",
			 "notify", "true",
			 "propertyCategory", "TRAJECTORY_PICKING_TOOL"
		   });	
		addAnnotation
		  (getTrajectoryPickingTool_TrajectoryPickingToolNode(), 
		   source, 
		   new String[] {
			 "documentation", "* The node representing the tool in the topology.",
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TRAJECTORY_PICKING_TOOL"
		   });	
		addAnnotation
		  (trajectoryPickingToolNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nNode representing the TrajectoryPickingTool in the topology."
		   });	
		addAnnotation
		  (getTrajectoryPickingToolNode_TrajectoryPickingTool(), 
		   source, 
		   new String[] {
			 "documentation", "* The  TrajectoryPickingTool associated with this node."
		   });	
		addAnnotation
		  (trajectory3DToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA 3D tool used to trace the trajectory of a Variable."
		   });	
		addAnnotation
		  (getTrajectory3DTool_PenDown(), 
		   source, 
		   new String[] {
			 "documentation", "* Whether of not the trajectory is traced.",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (getTrajectory3DTool_Variable(), 
		   source, 
		   new String[] {
			 "documentation", " The Apogy System being displayed.",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (getTrajectory3DTool_DistanceThreshold(), 
		   source, 
		   new String[] {
			 "documentation", "* Minimum distance used to trigger a new point being accepted.",
			 "propertyCategory", "TRAJECTORY_3D_TOOL",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getTrajectory3DTool_TotalDistance(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "TRAJECTORY_3D_TOOL",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getTrajectory3DTool_Paths(), 
		   source, 
		   new String[] {
			 "documentation", "* The  WayPointPath currently recorded."
		   });	
		addAnnotation
		  (getTrajectory3DTool_PoseProvider(), 
		   source, 
		   new String[] {
			 "documentation", "* The pose provide providing pose data.",
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (getTrajectory3DTool_Trajectory3DToolNode(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "TRAJECTORY_3D_TOOL"
		   });	
		addAnnotation
		  (trajectory3DToolNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nNode representing the Trajectory3DTool in the topology."
		   });	
		addAnnotation
		  (geometryPlacementAtFeatureOfInterestToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA tool that allows a user to attach a geometry at a specified FeatureOfInterest"
		   });	
		addAnnotation
		  (getGeometryPlacementAtFeatureOfInterestTool__LoadGeometry(), 
		   source, 
		   new String[] {
			 "documentation", "*\nOperations that load the geometry. The resulting node is attached under the transformNode.\nSub-classes should overwrite this method."
		   });	
		addAnnotation
		  (getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterest(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe selected feature of interest."
		   });	
		addAnnotation
		  (getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterestNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe FeatureOfInterestNode associated with the FeatureOfInterest. Updated whenever\nthe featureOfInterest is changed.",
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getGeometryPlacementAtFeatureOfInterestTool_TransformNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe TransformNode between the geometry and the selected feature of interest.",
			 "notify", "true",
			 "children", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (abstractURLNodeGeometryPlacementAtFeatureOfInterestToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nSpecialization of GeometryPlacementAtFeatureOfInterestTool that attaches a geometry to the specified FOI."
		   });	
		addAnnotation
		  (getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool__GetGeometryOffsets(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the offset transformation to be applied between the transformNode and the geometry."
		   });	
		addAnnotation
		  (getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool__GetGeometryURL(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the URL where the geometry is to be found."
		   });	
		addAnnotation
		  (getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_CadTransformNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe TransformNode applying the geometry offsets between the tool transform and the geometry.",
			 "notify", "true",
			 "children", "false",
			 "property", "None"
		   });	
		addAnnotation
		  (getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_UrlNode(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe URLNode containing the geometry.",
			 "notify", "true",
			 "children", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (urlNodeGeometryPlacementAtFeatureOfInterestToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA simple GeometryPlacementAtFeatureOfInterestTool that contains attributes that are returned by the\ngetGeometryOffsets() and getGeometryURL() methods."
		   });	
		addAnnotation
		  (getURLNodeGeometryPlacementAtFeatureOfInterestTool_URL(), 
		   source, 
		   new String[] {
			 "documentation", "*\nURL to the file containing the geometry to be displayed."
		   });	
		addAnnotation
		  (getURLNodeGeometryPlacementAtFeatureOfInterestTool_CadToToolTransform(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe transform required between the tool transformNode and the URLNode.This can be used to offset the\ngeometry on the URLNode to center it on the tool origin."
		   });
	}

} //ApogyAddonsPackageImpl
