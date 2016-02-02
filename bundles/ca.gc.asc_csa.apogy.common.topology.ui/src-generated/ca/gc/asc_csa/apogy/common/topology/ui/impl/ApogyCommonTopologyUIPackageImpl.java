package ca.gc.asc_csa.apogy.common.topology.ui.impl;
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

import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyUIPackageImpl extends EPackageImpl implements ApogyCommonTopologyUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyPresentationRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyPresentationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformNodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotationNodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionNodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlNodePresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonTopologyUIFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shadowModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum meshPresentationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rgbEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sceneObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType notificationEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonTopologyUIPackageImpl() {
		super(eNS_URI, ApogyCommonTopologyUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonTopologyUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonTopologyUIPackage init() {
		if (isInited) return (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonTopologyUIPackageImpl theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonTopologyUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonTopologyUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonTopologyUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonTopologyUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonTopologyUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonTopologyUIPackage.eNS_URI, theApogyCommonTopologyUIPackage);
		return theApogyCommonTopologyUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyPresentationRegistry() {
		return topologyPresentationRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyPresentationRegistry_TopologyPresentationSetList() {
		return (EReference)topologyPresentationRegistryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyPresentationRegistry_NodePresentationList() {
		return (EReference)topologyPresentationRegistryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyPresentationRegistry__CreateTopologyPresentationSet__Node() {
		return topologyPresentationRegistryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyPresentationRegistry__Release__TopologyPresentationSet() {
		return topologyPresentationRegistryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyPresentationRegistry__GetPresentationNode__Node() {
		return topologyPresentationRegistryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicsContext() {
		return graphicsContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicsContext_Topology() {
		return (EReference)graphicsContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicsContext_TopologyPresentationSet() {
		return (EReference)graphicsContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraphicsContext__Dispose() {
		return graphicsContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeSelection() {
		return nodeSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSelection_TopologyPresentationSet() {
		return (EReference)nodeSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSelection_SelectedNode() {
		return (EReference)nodeSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeSelection_NodePresentation() {
		return (EReference)nodeSelectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSelection_RelativeIntersectionPoint() {
		return (EAttribute)nodeSelectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSelection_AbsoluteIntersectionPoint() {
		return (EAttribute)nodeSelectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSelection_RelativeIntersectionNormal() {
		return (EAttribute)nodeSelectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeSelection_AbsoluteIntersectionNormal() {
		return (EAttribute)nodeSelectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyPresentationSet() {
		return topologyPresentationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyPresentationSet_TopologyPresentationRegistry() {
		return (EReference)topologyPresentationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyPresentationSet_GraphicsContext() {
		return (EReference)topologyPresentationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyPresentationSet_NodePresentationList() {
		return (EReference)topologyPresentationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyPresentationSet__GetPresentationNode__Node() {
		return topologyPresentationSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTopologyPresentationSet__GetNodes() {
		return topologyPresentationSetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodePresentation() {
		return nodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePresentation_TopologyPresentationSet() {
		return (EReference)nodePresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePresentation_Node() {
		return (EReference)nodePresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_Color() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_Visible() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_ShadowMode() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_UseInBoundingCalculation() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePresentation_Centroid() {
		return (EReference)nodePresentationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePresentation_Min() {
		return (EReference)nodePresentationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodePresentation_Max() {
		return (EReference)nodePresentationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_XRange() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_YRange() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_ZRange() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodePresentation_SceneObject() {
		return (EAttribute)nodePresentationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformNodePresentation() {
		return transformNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformNodePresentation_AxisVisible() {
		return (EAttribute)transformNodePresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformNodePresentation_AxisLength() {
		return (EAttribute)transformNodePresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotationNodePresentation() {
		return rotationNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotationNodePresentation_AxisVisible() {
		return (EAttribute)rotationNodePresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotationNodePresentation_AxisLength() {
		return (EAttribute)rotationNodePresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionNodePresentation() {
		return positionNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionNodePresentation_AxisVisible() {
		return (EAttribute)positionNodePresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionNodePresentation_AxisLength() {
		return (EAttribute)positionNodePresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLNodePresentation() {
		return urlNodePresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLNodePresentation_AxisVisible() {
		return (EAttribute)urlNodePresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLNodePresentation_AxisLength() {
		return (EAttribute)urlNodePresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLNodePresentation_PresentationMode() {
		return (EAttribute)urlNodePresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonTopologyUIFacade() {
		return apogyCommonTopologyUIFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyUIFacade__CreateGraphicsContext__Node() {
		return apogyCommonTopologyUIFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyUIFacade__FindExtent__Node_TopologyPresentationSet_Tuple3d_Tuple3d() {
		return apogyCommonTopologyUIFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_NodePresentation_Point3d() {
		return apogyCommonTopologyUIFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_Node_Point3d_Vector3f() {
		return apogyCommonTopologyUIFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShadowMode() {
		return shadowModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeshPresentationMode() {
		return meshPresentationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRGB() {
		return rgbEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3d() {
		return point3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3f() {
		return vector3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSceneObject() {
		return sceneObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNotification() {
		return notificationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyUIFactory getApogyCommonTopologyUIFactory() {
		return (ApogyCommonTopologyUIFactory)getEFactoryInstance();
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
		topologyPresentationRegistryEClass = createEClass(TOPOLOGY_PRESENTATION_REGISTRY);
		createEReference(topologyPresentationRegistryEClass, TOPOLOGY_PRESENTATION_REGISTRY__TOPOLOGY_PRESENTATION_SET_LIST);
		createEReference(topologyPresentationRegistryEClass, TOPOLOGY_PRESENTATION_REGISTRY__NODE_PRESENTATION_LIST);
		createEOperation(topologyPresentationRegistryEClass, TOPOLOGY_PRESENTATION_REGISTRY___CREATE_TOPOLOGY_PRESENTATION_SET__NODE);
		createEOperation(topologyPresentationRegistryEClass, TOPOLOGY_PRESENTATION_REGISTRY___RELEASE__TOPOLOGYPRESENTATIONSET);
		createEOperation(topologyPresentationRegistryEClass, TOPOLOGY_PRESENTATION_REGISTRY___GET_PRESENTATION_NODE__NODE);

		graphicsContextEClass = createEClass(GRAPHICS_CONTEXT);
		createEReference(graphicsContextEClass, GRAPHICS_CONTEXT__TOPOLOGY);
		createEReference(graphicsContextEClass, GRAPHICS_CONTEXT__TOPOLOGY_PRESENTATION_SET);
		createEOperation(graphicsContextEClass, GRAPHICS_CONTEXT___DISPOSE);

		nodeSelectionEClass = createEClass(NODE_SELECTION);
		createEReference(nodeSelectionEClass, NODE_SELECTION__TOPOLOGY_PRESENTATION_SET);
		createEReference(nodeSelectionEClass, NODE_SELECTION__SELECTED_NODE);
		createEReference(nodeSelectionEClass, NODE_SELECTION__NODE_PRESENTATION);
		createEAttribute(nodeSelectionEClass, NODE_SELECTION__RELATIVE_INTERSECTION_POINT);
		createEAttribute(nodeSelectionEClass, NODE_SELECTION__ABSOLUTE_INTERSECTION_POINT);
		createEAttribute(nodeSelectionEClass, NODE_SELECTION__RELATIVE_INTERSECTION_NORMAL);
		createEAttribute(nodeSelectionEClass, NODE_SELECTION__ABSOLUTE_INTERSECTION_NORMAL);

		topologyPresentationSetEClass = createEClass(TOPOLOGY_PRESENTATION_SET);
		createEReference(topologyPresentationSetEClass, TOPOLOGY_PRESENTATION_SET__TOPOLOGY_PRESENTATION_REGISTRY);
		createEReference(topologyPresentationSetEClass, TOPOLOGY_PRESENTATION_SET__GRAPHICS_CONTEXT);
		createEReference(topologyPresentationSetEClass, TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST);
		createEOperation(topologyPresentationSetEClass, TOPOLOGY_PRESENTATION_SET___GET_PRESENTATION_NODE__NODE);
		createEOperation(topologyPresentationSetEClass, TOPOLOGY_PRESENTATION_SET___GET_NODES);

		nodePresentationEClass = createEClass(NODE_PRESENTATION);
		createEReference(nodePresentationEClass, NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET);
		createEReference(nodePresentationEClass, NODE_PRESENTATION__NODE);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__COLOR);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__VISIBLE);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__SHADOW_MODE);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION);
		createEReference(nodePresentationEClass, NODE_PRESENTATION__CENTROID);
		createEReference(nodePresentationEClass, NODE_PRESENTATION__MIN);
		createEReference(nodePresentationEClass, NODE_PRESENTATION__MAX);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__XRANGE);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__YRANGE);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__ZRANGE);
		createEAttribute(nodePresentationEClass, NODE_PRESENTATION__SCENE_OBJECT);

		transformNodePresentationEClass = createEClass(TRANSFORM_NODE_PRESENTATION);
		createEAttribute(transformNodePresentationEClass, TRANSFORM_NODE_PRESENTATION__AXIS_VISIBLE);
		createEAttribute(transformNodePresentationEClass, TRANSFORM_NODE_PRESENTATION__AXIS_LENGTH);

		rotationNodePresentationEClass = createEClass(ROTATION_NODE_PRESENTATION);
		createEAttribute(rotationNodePresentationEClass, ROTATION_NODE_PRESENTATION__AXIS_VISIBLE);
		createEAttribute(rotationNodePresentationEClass, ROTATION_NODE_PRESENTATION__AXIS_LENGTH);

		positionNodePresentationEClass = createEClass(POSITION_NODE_PRESENTATION);
		createEAttribute(positionNodePresentationEClass, POSITION_NODE_PRESENTATION__AXIS_VISIBLE);
		createEAttribute(positionNodePresentationEClass, POSITION_NODE_PRESENTATION__AXIS_LENGTH);

		urlNodePresentationEClass = createEClass(URL_NODE_PRESENTATION);
		createEAttribute(urlNodePresentationEClass, URL_NODE_PRESENTATION__AXIS_VISIBLE);
		createEAttribute(urlNodePresentationEClass, URL_NODE_PRESENTATION__AXIS_LENGTH);
		createEAttribute(urlNodePresentationEClass, URL_NODE_PRESENTATION__PRESENTATION_MODE);

		apogyCommonTopologyUIFacadeEClass = createEClass(APOGY_COMMON_TOPOLOGY_UI_FACADE);
		createEOperation(apogyCommonTopologyUIFacadeEClass, APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_GRAPHICS_CONTEXT__NODE);
		createEOperation(apogyCommonTopologyUIFacadeEClass, APOGY_COMMON_TOPOLOGY_UI_FACADE___FIND_EXTENT__NODE_TOPOLOGYPRESENTATIONSET_TUPLE3D_TUPLE3D);
		createEOperation(apogyCommonTopologyUIFacadeEClass, APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODEPRESENTATION_POINT3D);
		createEOperation(apogyCommonTopologyUIFacadeEClass, APOGY_COMMON_TOPOLOGY_UI_FACADE___CREATE_NODE_SELECTION__TOPOLOGYPRESENTATIONSET_NODE_POINT3D_VECTOR3F);

		// Create enums
		shadowModeEEnum = createEEnum(SHADOW_MODE);
		meshPresentationModeEEnum = createEEnum(MESH_PRESENTATION_MODE);

		// Create data types
		listEDataType = createEDataType(LIST);
		rgbEDataType = createEDataType(RGB);
		point3dEDataType = createEDataType(POINT3D);
		vector3fEDataType = createEDataType(VECTOR3F);
		sceneObjectEDataType = createEDataType(SCENE_OBJECT);
		notificationEDataType = createEDataType(NOTIFICATION);
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
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		transformNodePresentationEClass.getESuperTypes().add(this.getNodePresentation());
		rotationNodePresentationEClass.getESuperTypes().add(this.getNodePresentation());
		positionNodePresentationEClass.getESuperTypes().add(this.getNodePresentation());
		urlNodePresentationEClass.getESuperTypes().add(this.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(topologyPresentationRegistryEClass, TopologyPresentationRegistry.class, "TopologyPresentationRegistry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyPresentationRegistry_TopologyPresentationSetList(), this.getTopologyPresentationSet(), this.getTopologyPresentationSet_TopologyPresentationRegistry(), "topologyPresentationSetList", null, 0, -1, TopologyPresentationRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyPresentationRegistry_NodePresentationList(), this.getNodePresentation(), null, "nodePresentationList", null, 0, -1, TopologyPresentationRegistry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTopologyPresentationRegistry__CreateTopologyPresentationSet__Node(), this.getTopologyPresentationSet(), "createTopologyPresentationSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "topologyRoot", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyPresentationRegistry__Release__TopologyPresentationSet(), null, "release", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTopologyPresentationSet(), "topologyPresentationSet", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyPresentationRegistry__GetPresentationNode__Node(), this.getNodePresentation(), "getPresentationNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(graphicsContextEClass, GraphicsContext.class, "GraphicsContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicsContext_Topology(), theApogyCommonTopologyPackage.getNode(), null, "topology", null, 0, 1, GraphicsContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphicsContext_TopologyPresentationSet(), this.getTopologyPresentationSet(), this.getTopologyPresentationSet_GraphicsContext(), "topologyPresentationSet", null, 0, 1, GraphicsContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGraphicsContext__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(nodeSelectionEClass, NodeSelection.class, "NodeSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeSelection_TopologyPresentationSet(), this.getTopologyPresentationSet(), null, "topologyPresentationSet", null, 0, 1, NodeSelection.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSelection_SelectedNode(), theApogyCommonTopologyPackage.getNode(), null, "selectedNode", null, 0, 1, NodeSelection.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeSelection_NodePresentation(), this.getNodePresentation(), null, "nodePresentation", null, 0, 1, NodeSelection.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSelection_RelativeIntersectionPoint(), this.getPoint3d(), "relativeIntersectionPoint", null, 0, 1, NodeSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSelection_AbsoluteIntersectionPoint(), this.getPoint3d(), "absoluteIntersectionPoint", null, 0, 1, NodeSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSelection_RelativeIntersectionNormal(), this.getVector3f(), "relativeIntersectionNormal", null, 0, 1, NodeSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeSelection_AbsoluteIntersectionNormal(), this.getVector3f(), "absoluteIntersectionNormal", null, 0, 1, NodeSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyPresentationSetEClass, TopologyPresentationSet.class, "TopologyPresentationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyPresentationSet_TopologyPresentationRegistry(), this.getTopologyPresentationRegistry(), this.getTopologyPresentationRegistry_TopologyPresentationSetList(), "topologyPresentationRegistry", null, 0, 1, TopologyPresentationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyPresentationSet_GraphicsContext(), this.getGraphicsContext(), this.getGraphicsContext_TopologyPresentationSet(), "graphicsContext", null, 0, 1, TopologyPresentationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyPresentationSet_NodePresentationList(), this.getNodePresentation(), this.getNodePresentation_TopologyPresentationSet(), "nodePresentationList", null, 0, -1, TopologyPresentationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTopologyPresentationSet__GetPresentationNode__Node(), this.getNodePresentation(), "getPresentationNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTopologyPresentationSet__GetNodes(), null, "getNodes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(theApogyCommonTopologyPackage.getNode());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(nodePresentationEClass, NodePresentation.class, "NodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodePresentation_TopologyPresentationSet(), this.getTopologyPresentationSet(), this.getTopologyPresentationSet_NodePresentationList(), "topologyPresentationSet", null, 0, -1, NodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodePresentation_Node(), theApogyCommonTopologyPackage.getNode(), null, "node", null, 0, 1, NodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_Color(), this.getRGB(), "color", null, 0, 1, NodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, NodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_ShadowMode(), this.getShadowMode(), "shadowMode", null, 0, 1, NodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_UseInBoundingCalculation(), theEcorePackage.getEBoolean(), "useInBoundingCalculation", "true", 0, 1, NodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodePresentation_Centroid(), theApogyCommonMathPackage.getTuple3d(), null, "centroid", null, 0, 1, NodePresentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodePresentation_Min(), theApogyCommonMathPackage.getTuple3d(), null, "min", null, 0, 1, NodePresentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNodePresentation_Max(), theApogyCommonMathPackage.getTuple3d(), null, "max", null, 0, 1, NodePresentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_XRange(), theEcorePackage.getEDouble(), "xRange", null, 0, 1, NodePresentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_YRange(), theEcorePackage.getEDouble(), "yRange", null, 0, 1, NodePresentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_ZRange(), theEcorePackage.getEDouble(), "zRange", null, 0, 1, NodePresentation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodePresentation_SceneObject(), this.getSceneObject(), "sceneObject", null, 0, 1, NodePresentation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformNodePresentationEClass, TransformNodePresentation.class, "TransformNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformNodePresentation_AxisVisible(), theEcorePackage.getEBoolean(), "axisVisible", "false", 0, 1, TransformNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformNodePresentation_AxisLength(), theEcorePackage.getEDouble(), "axisLength", "1.0", 0, 1, TransformNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotationNodePresentationEClass, RotationNodePresentation.class, "RotationNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotationNodePresentation_AxisVisible(), theEcorePackage.getEBoolean(), "axisVisible", "false", 0, 1, RotationNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotationNodePresentation_AxisLength(), theEcorePackage.getEDouble(), "axisLength", "1.0", 0, 1, RotationNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionNodePresentationEClass, PositionNodePresentation.class, "PositionNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionNodePresentation_AxisVisible(), theEcorePackage.getEBoolean(), "axisVisible", "false", 0, 1, PositionNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionNodePresentation_AxisLength(), theEcorePackage.getEDouble(), "axisLength", "1.0", 0, 1, PositionNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlNodePresentationEClass, URLNodePresentation.class, "URLNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLNodePresentation_AxisVisible(), theEcorePackage.getEBoolean(), "axisVisible", "false", 0, 1, URLNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLNodePresentation_AxisLength(), theEcorePackage.getEDouble(), "axisLength", "1.0", 0, 1, URLNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLNodePresentation_PresentationMode(), this.getMeshPresentationMode(), "presentationMode", "SURFACE", 0, 1, URLNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyCommonTopologyUIFacadeEClass, ApogyCommonTopologyUIFacade.class, "ApogyCommonTopologyUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyCommonTopologyUIFacade__CreateGraphicsContext__Node(), this.getGraphicsContext(), "createGraphicsContext", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "topologyRoot", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyUIFacade__FindExtent__Node_TopologyPresentationSet_Tuple3d_Tuple3d(), null, "findExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTopologyPresentationSet(), "topologyPresentationSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "min", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "max", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_NodePresentation_Point3d(), this.getNodeSelection(), "createNodeSelection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTopologyPresentationSet(), "topologyPresentationSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNodePresentation(), "nodePresentation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "relativePosition", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyUIFacade__CreateNodeSelection__TopologyPresentationSet_Node_Point3d_Vector3f(), this.getNodeSelection(), "createNodeSelection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTopologyPresentationSet(), "topologyPresentationSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "relativePosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector3f(), "relativeNormal", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(shadowModeEEnum, ShadowMode.class, "ShadowMode");
		addEEnumLiteral(shadowModeEEnum, ShadowMode.INHERIT);
		addEEnumLiteral(shadowModeEEnum, ShadowMode.OFF);
		addEEnumLiteral(shadowModeEEnum, ShadowMode.CAST);
		addEEnumLiteral(shadowModeEEnum, ShadowMode.RECEIVE);
		addEEnumLiteral(shadowModeEEnum, ShadowMode.CAST_AND_RECEIVE);

		initEEnum(meshPresentationModeEEnum, MeshPresentationMode.class, "MeshPresentationMode");
		addEEnumLiteral(meshPresentationModeEEnum, MeshPresentationMode.POINTS);
		addEEnumLiteral(meshPresentationModeEEnum, MeshPresentationMode.SURFACE);
		addEEnumLiteral(meshPresentationModeEEnum, MeshPresentationMode.WIREFRAME);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rgbEDataType, org.eclipse.swt.graphics.RGB.class, "RGB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3fEDataType, Vector3f.class, "Vector3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sceneObjectEDataType, SceneObject.class, "SceneObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(notificationEDataType, Notification.class, "Notification", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonTopologyUIPackageImpl
