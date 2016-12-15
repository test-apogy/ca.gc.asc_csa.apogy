package ca.gc.asc_csa.apogy.core.impl;
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

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.core.AbsolutePoseProvider;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyInitializationData;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.AssemblyLink;
import ca.gc.asc_csa.apogy.core.AssemblyLinksList;
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestList;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;
import ca.gc.asc_csa.apogy.core.OperationCallPositionedResult;
import ca.gc.asc_csa.apogy.core.PoseCorrector;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.Positioned;
import ca.gc.asc_csa.apogy.core.PositionedResult;
import ca.gc.asc_csa.apogy.core.ResultNode;
import ca.gc.asc_csa.apogy.core.ResultsListNode;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.Updatable;
import ca.gc.asc_csa.apogy.core.UserDefinedResult;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ApogyCorePackageImpl extends EPackageImpl implements
		ApogyCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCoreFacadeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyTopologyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogySystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass apogySystemApiAdapterEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointsListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyLinkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyLinksListEClass = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass poseProviderEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absolutePoseProviderEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass poseCorrectorEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyInitializationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOfInterestListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOfInterestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallPositionedResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedResultEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultNodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultsListNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOfInterestNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOfInterestListNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCorePackageImpl() {
		super(eNS_URI, ApogyCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ApogyCorePackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCorePackage init() {
		if (isInited) return (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);

		// Obtain or create and register package
		ApogyCorePackageImpl theApogyCorePackage = (ApogyCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreInvocatorPackage.eINSTANCE.eClass();
		ApogyCommonTopologyBindingsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCorePackage.createPackageContents();

		// Initialize created meta-data
		theApogyCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCorePackage.eNS_URI, theApogyCorePackage);
		return theApogyCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreFacade() {
		return apogyCoreFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreFacade__ComputeAbsolutePoseMatrix__ApogySystem_Matrix4x4() {
		return apogyCoreFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreFacade__CreateResultNode__PositionedResult() {
		return apogyCoreFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreFacade__GetApogySystem__Environment_String() {
		return apogyCoreFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreFacade__LoadFeatureOfInterestFromFile__String() {
		return apogyCoreFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreFacade__SaveFeatureOfInterestToFile__String_List() {
		return apogyCoreFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyTopology() {
		return apogyTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyTopology_RootNode() {
		return (EReference)apogyTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogySystem() {
		return apogySystemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogySystem_TopologyRoot() {
		return (EReference)apogySystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogySystem_BindingSet() {
		return (EReference)apogySystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogySystem_ConnectionPointsList() {
		return (EReference)apogySystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogySystem_AssemblyLinksList() {
		return (EReference)apogySystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogySystem_PoseProvider()
  {
		return (EReference)apogySystemEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogySystem_PoseProviderInstance()
  {
		return (EReference)apogySystemEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getApogySystemApiAdapter()
  {
		return apogySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogySystemApiAdapter_PoseCorrector()
  {
		return (EReference)apogySystemApiAdapterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getApogySystemApiAdapter_ApogySystem()
  {
		return (EReference)apogySystemApiAdapterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getApogySystemApiAdapter__CreateResultMatrix__OperationCall()
  {
		return apogySystemApiAdapterEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPointsList() {
		return connectionPointsListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointsList_ApogySystem() {
		return (EReference)connectionPointsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointsList_ConnectionPoints() {
		return (EReference)connectionPointsListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPoint() {
		return connectionPointEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_PointsList() {
		return (EReference)connectionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPoint_Node() {
		return (EReference)connectionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyLink() {
		return assemblyLinkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLink_SubSystemTypeMember() {
		return (EReference)assemblyLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLink_ParentTypeMember() {
		return (EReference)assemblyLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLink_ParentConnectionPoint() {
		return (EReference)assemblyLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLink_TransformationMatrix() {
		return (EReference)assemblyLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLink_GeometryNode() {
		return (EReference)assemblyLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLink_ParentInstance() {
		return (EReference)assemblyLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLink_SubSystemInstance() {
		return (EReference)assemblyLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblyLinksList() {
		return assemblyLinksListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblyLinksList_AssemblyLinks() {
		return (EReference)assemblyLinksListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPoseProvider()
  {
		return poseProviderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPoseProvider_PoseTransform()
  {
		return (EReference)poseProviderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsolutePoseProvider() {
		return absolutePoseProviderEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPoseCorrector()
  {
		return poseCorrectorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPoseCorrector_ApogySystemApiAdapter()
  {
		return (EReference)poseCorrectorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPoseCorrector_Enabled()
  {
		return (EAttribute)poseCorrectorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPoseCorrector__ApplyCorrection__Matrix4x4()
  {
		return poseCorrectorEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyInitializationData() {
		return apogyInitializationDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyInitializationData_InitialPoseTransform() {
		return (EReference)apogyInitializationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositioned() {
		return positionedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositioned_Pose() {
		return (EReference)positionedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyRoot() {
		return topologyRootEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyRoot_OriginNode() {
		return (EReference)topologyRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOfInterestList() {
		return featureOfInterestListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestList_FeaturesOfInterest() {
		return (EReference)featureOfInterestListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOfInterest() {
		return featureOfInterestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionedResult() {
		return positionedResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationCallPositionedResult() {
		return operationCallPositionedResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCallPositionedResult_RelativePose() {
		return (EReference)operationCallPositionedResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedResult() {
		return userDefinedResultEClass;
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultNode() {
		return resultNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultNode_Result() {
		return (EReference)resultNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultsListNode() {
		return resultsListNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultsListNode_ResultsList() {
		return (EReference)resultsListNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOfInterestNode() {
		return featureOfInterestNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestNode_FeatureOfInterest() {
		return (EReference)featureOfInterestNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOfInterestListNode() {
		return featureOfInterestListNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOfInterestListNode_FeatureOfInterestList() {
		return (EReference)featureOfInterestListNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdatable() {
		return updatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatable_Updating() {
		return (EAttribute)updatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatable_AutoUpdateEnabled() {
		return (EAttribute)updatableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUpdatable__GetDefaultAutoUpdateEnabled() {
		return updatableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUpdatable__Update() {
		return updatableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreFactory getApogyCoreFactory() {
		return (ApogyCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		apogyCoreFacadeEClass = createEClass(APOGY_CORE_FACADE);
		createEOperation(apogyCoreFacadeEClass, APOGY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__APOGYSYSTEM_MATRIX4X4);
		createEOperation(apogyCoreFacadeEClass, APOGY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT);
		createEOperation(apogyCoreFacadeEClass, APOGY_CORE_FACADE___GET_APOGY_SYSTEM__ENVIRONMENT_STRING);
		createEOperation(apogyCoreFacadeEClass, APOGY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING);
		createEOperation(apogyCoreFacadeEClass, APOGY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST);

		apogyTopologyEClass = createEClass(APOGY_TOPOLOGY);
		createEReference(apogyTopologyEClass, APOGY_TOPOLOGY__ROOT_NODE);

		apogySystemEClass = createEClass(APOGY_SYSTEM);
		createEReference(apogySystemEClass, APOGY_SYSTEM__TOPOLOGY_ROOT);
		createEReference(apogySystemEClass, APOGY_SYSTEM__BINDING_SET);
		createEReference(apogySystemEClass, APOGY_SYSTEM__CONNECTION_POINTS_LIST);
		createEReference(apogySystemEClass, APOGY_SYSTEM__ASSEMBLY_LINKS_LIST);
		createEReference(apogySystemEClass, APOGY_SYSTEM__POSE_PROVIDER);
		createEReference(apogySystemEClass, APOGY_SYSTEM__POSE_PROVIDER_INSTANCE);

		apogySystemApiAdapterEClass = createEClass(APOGY_SYSTEM_API_ADAPTER);
		createEReference(apogySystemApiAdapterEClass, APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR);
		createEReference(apogySystemApiAdapterEClass, APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM);
		createEOperation(apogySystemApiAdapterEClass, APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL);

		connectionPointsListEClass = createEClass(CONNECTION_POINTS_LIST);
		createEReference(connectionPointsListEClass, CONNECTION_POINTS_LIST__APOGY_SYSTEM);
		createEReference(connectionPointsListEClass, CONNECTION_POINTS_LIST__CONNECTION_POINTS);

		connectionPointEClass = createEClass(CONNECTION_POINT);
		createEReference(connectionPointEClass, CONNECTION_POINT__POINTS_LIST);
		createEReference(connectionPointEClass, CONNECTION_POINT__NODE);

		assemblyLinkEClass = createEClass(ASSEMBLY_LINK);
		createEReference(assemblyLinkEClass, ASSEMBLY_LINK__PARENT_TYPE_MEMBER);
		createEReference(assemblyLinkEClass, ASSEMBLY_LINK__SUB_SYSTEM_TYPE_MEMBER);
		createEReference(assemblyLinkEClass, ASSEMBLY_LINK__PARENT_CONNECTION_POINT);
		createEReference(assemblyLinkEClass, ASSEMBLY_LINK__TRANSFORMATION_MATRIX);
		createEReference(assemblyLinkEClass, ASSEMBLY_LINK__GEOMETRY_NODE);
		createEReference(assemblyLinkEClass, ASSEMBLY_LINK__PARENT_INSTANCE);
		createEReference(assemblyLinkEClass, ASSEMBLY_LINK__SUB_SYSTEM_INSTANCE);

		assemblyLinksListEClass = createEClass(ASSEMBLY_LINKS_LIST);
		createEReference(assemblyLinksListEClass, ASSEMBLY_LINKS_LIST__ASSEMBLY_LINKS);

		poseProviderEClass = createEClass(POSE_PROVIDER);
		createEReference(poseProviderEClass, POSE_PROVIDER__POSE_TRANSFORM);

		absolutePoseProviderEClass = createEClass(ABSOLUTE_POSE_PROVIDER);

		poseCorrectorEClass = createEClass(POSE_CORRECTOR);
		createEReference(poseCorrectorEClass, POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER);
		createEAttribute(poseCorrectorEClass, POSE_CORRECTOR__ENABLED);
		createEOperation(poseCorrectorEClass, POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4);

		apogyInitializationDataEClass = createEClass(APOGY_INITIALIZATION_DATA);
		createEReference(apogyInitializationDataEClass, APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM);

		positionedEClass = createEClass(POSITIONED);
		createEReference(positionedEClass, POSITIONED__POSE);

		featureOfInterestEClass = createEClass(FEATURE_OF_INTEREST);

		featureOfInterestListEClass = createEClass(FEATURE_OF_INTEREST_LIST);
		createEReference(featureOfInterestListEClass, FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST);

		topologyRootEClass = createEClass(TOPOLOGY_ROOT);
		createEReference(topologyRootEClass, TOPOLOGY_ROOT__ORIGIN_NODE);

		positionedResultEClass = createEClass(POSITIONED_RESULT);

		operationCallPositionedResultEClass = createEClass(OPERATION_CALL_POSITIONED_RESULT);
		createEReference(operationCallPositionedResultEClass, OPERATION_CALL_POSITIONED_RESULT__RELATIVE_POSE);

		userDefinedResultEClass = createEClass(USER_DEFINED_RESULT);

		resultNodeEClass = createEClass(RESULT_NODE);
		createEReference(resultNodeEClass, RESULT_NODE__RESULT);

		resultsListNodeEClass = createEClass(RESULTS_LIST_NODE);
		createEReference(resultsListNodeEClass, RESULTS_LIST_NODE__RESULTS_LIST);

		featureOfInterestNodeEClass = createEClass(FEATURE_OF_INTEREST_NODE);
		createEReference(featureOfInterestNodeEClass, FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST);

		featureOfInterestListNodeEClass = createEClass(FEATURE_OF_INTEREST_LIST_NODE);
		createEReference(featureOfInterestListNodeEClass, FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST);

		updatableEClass = createEClass(UPDATABLE);
		createEAttribute(updatableEClass, UPDATABLE__UPDATING);
		createEAttribute(updatableEClass, UPDATABLE__AUTO_UPDATE_ENABLED);
		createEOperation(updatableEClass, UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED);
		createEOperation(updatableEClass, UPDATABLE___UPDATE);

		// Create data types
		mapEDataType = createEDataType(MAP);
		listEDataType = createEDataType(LIST);
		collectionEDataType = createEDataType(COLLECTION);
		exceptionEDataType = createEDataType(EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCommonTopologyBindingsPackage theApogyCommonTopologyBindingsPackage = (ApogyCommonTopologyBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyBindingsPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(listEDataType, "T");
		addETypeParameter(collectionEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		apogySystemEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getType());
		apogySystemApiAdapterEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getTypeApiAdapter());
		apogySystemApiAdapterEClass.getESuperTypes().add(this.getPoseProvider());
		connectionPointEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		connectionPointEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		assemblyLinkEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		assemblyLinkEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		absolutePoseProviderEClass.getESuperTypes().add(this.getPoseProvider());
		apogyInitializationDataEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getInitializationData());
		featureOfInterestEClass.getESuperTypes().add(this.getPositioned());
		featureOfInterestEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		featureOfInterestEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		featureOfInterestListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		featureOfInterestListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		positionedResultEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getAbstractResult());
		positionedResultEClass.getESuperTypes().add(this.getPositioned());
		operationCallPositionedResultEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getOperationCallResult());
		operationCallPositionedResultEClass.getESuperTypes().add(this.getPositionedResult());
		userDefinedResultEClass.getESuperTypes().add(this.getPositionedResult());
		userDefinedResultEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		userDefinedResultEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		resultNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		resultsListNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		featureOfInterestNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getTransformNode());
		featureOfInterestListNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCoreFacadeEClass, ApogyCoreFacade.class, "ApogyCoreFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCoreFacade__ComputeAbsolutePoseMatrix__ApogySystem_Matrix4x4(), theApogyCommonMathPackage.getMatrix4x4(), "computeAbsolutePoseMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getApogySystem(), "apogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getMatrix4x4(), "relativePose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreFacade__CreateResultNode__PositionedResult(), this.getResultNode(), "createResultNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPositionedResult(), "result", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreFacade__GetApogySystem__Environment_String(), this.getApogySystem(), "getApogySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fullyQualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreFacade__LoadFeatureOfInterestFromFile__String(), null, "loadFeatureOfInterestFromFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getFeatureOfInterest());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreFacade__SaveFeatureOfInterestToFile__String_List(), null, "saveFeatureOfInterestToFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getFeatureOfInterest());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "foiList", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(apogyTopologyEClass, ApogyTopology.class, "ApogyTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApogyTopology_RootNode(), theApogyCommonTopologyPackage.getGroupNode(), null, "rootNode", null, 0, 1, ApogyTopology.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(apogySystemEClass, ApogySystem.class, "ApogySystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApogySystem_TopologyRoot(), this.getTopologyRoot(), null, "topologyRoot", null, 0, 1, ApogySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogySystem_BindingSet(), theApogyCommonTopologyBindingsPackage.getBindingsSet(), null, "bindingSet", null, 0, 1, ApogySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogySystem_ConnectionPointsList(), this.getConnectionPointsList(), this.getConnectionPointsList_ApogySystem(), "connectionPointsList", null, 0, 1, ApogySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogySystem_AssemblyLinksList(), this.getAssemblyLinksList(), null, "assemblyLinksList", null, 0, 1, ApogySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogySystem_PoseProvider(), theApogyCoreInvocatorPackage.getAbstractType(), null, "poseProvider", null, 0, 1, ApogySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogySystem_PoseProviderInstance(), this.getPoseProvider(), null, "poseProviderInstance", null, 0, 1, ApogySystem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogySystemApiAdapterEClass, ApogySystemApiAdapter.class, "ApogySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApogySystemApiAdapter_PoseCorrector(), this.getPoseCorrector(), this.getPoseCorrector_ApogySystemApiAdapter(), "poseCorrector", null, 0, 1, ApogySystemApiAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogySystemApiAdapter_ApogySystem(), this.getApogySystem(), null, "apogySystem", null, 0, 1, ApogySystemApiAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getApogySystemApiAdapter__CreateResultMatrix__OperationCall(), theApogyCommonMathPackage.getMatrix4x4(), "createResultMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(connectionPointsListEClass, ConnectionPointsList.class, "ConnectionPointsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPointsList_ApogySystem(), this.getApogySystem(), this.getApogySystem_ConnectionPointsList(), "apogySystem", null, 1, 1, ConnectionPointsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPointsList_ConnectionPoints(), this.getConnectionPoint(), this.getConnectionPoint_PointsList(), "connectionPoints", null, 0, -1, ConnectionPointsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionPointEClass, ConnectionPoint.class, "ConnectionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPoint_PointsList(), this.getConnectionPointsList(), this.getConnectionPointsList_ConnectionPoints(), "pointsList", null, 1, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPoint_Node(), theApogyCommonTopologyPackage.getGroupNode(), null, "node", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyLinkEClass, AssemblyLink.class, "AssemblyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyLink_ParentTypeMember(), theApogyCoreInvocatorPackage.getTypeMember(), null, "parentTypeMember", null, 0, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_SubSystemTypeMember(), theApogyCoreInvocatorPackage.getTypeMember(), null, "subSystemTypeMember", null, 1, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_ParentConnectionPoint(), this.getConnectionPoint(), null, "parentConnectionPoint", null, 1, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_TransformationMatrix(), theApogyCommonMathPackage.getMatrix4x4(), null, "transformationMatrix", null, 0, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_GeometryNode(), theApogyCommonTopologyPackage.getNode(), null, "geometryNode", null, 0, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_ParentInstance(), this.getApogySystem(), null, "parentInstance", null, 0, 1, AssemblyLink.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_SubSystemInstance(), this.getApogySystem(), null, "subSystemInstance", null, 0, 1, AssemblyLink.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyLinksListEClass, AssemblyLinksList.class, "AssemblyLinksList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyLinksList_AssemblyLinks(), this.getAssemblyLink(), null, "assemblyLinks", null, 0, -1, AssemblyLinksList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseProviderEClass, PoseProvider.class, "PoseProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoseProvider_PoseTransform(), theApogyCommonMathPackage.getMatrix4x4(), null, "poseTransform", null, 0, 1, PoseProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absolutePoseProviderEClass, AbsolutePoseProvider.class, "AbsolutePoseProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poseCorrectorEClass, PoseCorrector.class, "PoseCorrector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoseCorrector_ApogySystemApiAdapter(), this.getApogySystemApiAdapter(), this.getApogySystemApiAdapter_PoseCorrector(), "apogySystemApiAdapter", null, 0, 1, PoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoseCorrector_Enabled(), theEcorePackage.getEBoolean(), "enabled", "false", 0, 1, PoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseCorrector__ApplyCorrection__Matrix4x4(), theApogyCommonMathPackage.getMatrix4x4(), "applyCorrection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getMatrix4x4(), "originalPose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apogyInitializationDataEClass, ApogyInitializationData.class, "ApogyInitializationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApogyInitializationData_InitialPoseTransform(), theApogyCommonMathPackage.getMatrix4x4(), null, "initialPoseTransform", null, 0, 1, ApogyInitializationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionedEClass, Positioned.class, "Positioned", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositioned_Pose(), theApogyCommonMathPackage.getMatrix4x4(), null, "pose", null, 1, 1, Positioned.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOfInterestEClass, FeatureOfInterest.class, "FeatureOfInterest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureOfInterestListEClass, FeatureOfInterestList.class, "FeatureOfInterestList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOfInterestList_FeaturesOfInterest(), this.getFeatureOfInterest(), null, "featuresOfInterest", null, 0, -1, FeatureOfInterestList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyRootEClass, TopologyRoot.class, "TopologyRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyRoot_OriginNode(), theApogyCommonTopologyPackage.getNode(), null, "originNode", null, 0, 1, TopologyRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionedResultEClass, PositionedResult.class, "PositionedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationCallPositionedResultEClass, OperationCallPositionedResult.class, "OperationCallPositionedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCallPositionedResult_RelativePose(), theApogyCommonMathPackage.getMatrix4x4(), null, "relativePose", null, 1, 1, OperationCallPositionedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedResultEClass, UserDefinedResult.class, "UserDefinedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultNodeEClass, ResultNode.class, "ResultNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultNode_Result(), this.getPositionedResult(), null, "result", null, 0, 1, ResultNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsListNodeEClass, ResultsListNode.class, "ResultsListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultsListNode_ResultsList(), theApogyCoreInvocatorPackage.getResultsList(), null, "resultsList", null, 0, 1, ResultsListNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOfInterestNodeEClass, FeatureOfInterestNode.class, "FeatureOfInterestNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOfInterestNode_FeatureOfInterest(), this.getFeatureOfInterest(), null, "featureOfInterest", null, 0, 1, FeatureOfInterestNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOfInterestListNodeEClass, FeatureOfInterestListNode.class, "FeatureOfInterestListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOfInterestListNode_FeatureOfInterestList(), this.getFeatureOfInterestList(), null, "featureOfInterestList", null, 0, 1, FeatureOfInterestListNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updatableEClass, Updatable.class, "Updatable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdatable_Updating(), theEcorePackage.getEBoolean(), "updating", "false", 0, 1, Updatable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdatable_AutoUpdateEnabled(), theEcorePackage.getEBoolean(), "autoUpdateEnabled", null, 0, 1, Updatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUpdatable__GetDefaultAutoUpdateEnabled(), theEcorePackage.getEBoolean(), "getDefaultAutoUpdateEnabled", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUpdatable__Update(), null, "update", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		// Initialize data types
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ApogyCorePackageImpl
