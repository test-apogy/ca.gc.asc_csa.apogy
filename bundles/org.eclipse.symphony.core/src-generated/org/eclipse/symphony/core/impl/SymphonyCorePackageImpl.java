/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

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
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.core.AbsolutePoseProvider;
import org.eclipse.symphony.core.AbstractOrbitModel;
import org.eclipse.symphony.core.AbstractWorksite;
import org.eclipse.symphony.core.AssemblyLink;
import org.eclipse.symphony.core.AssemblyLinksList;
import org.eclipse.symphony.core.ConnectionPoint;
import org.eclipse.symphony.core.ConnectionPointsList;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.FeatureOfInterestList;
import org.eclipse.symphony.core.FeatureOfInterestListNode;
import org.eclipse.symphony.core.FeatureOfInterestNode;
import org.eclipse.symphony.core.OperationCallPositionedResult;
import org.eclipse.symphony.core.OrbitModelsList;
import org.eclipse.symphony.core.PoseCorrector;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.Positioned;
import org.eclipse.symphony.core.PositionedResult;
import org.eclipse.symphony.core.ResultNode;
import org.eclipse.symphony.core.ResultsListNode;
import org.eclipse.symphony.core.SymphonyCoreFacade;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.SymphonyInitializationData;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.SymphonyTopology;
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.UserDefinedResult;
import org.eclipse.symphony.core.WorksitesList;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class SymphonyCorePackageImpl extends EPackageImpl implements
		SymphonyCorePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphonyEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphonyTopologyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphonySystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass symphonySystemApiAdapterEClass = null;

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
	private EClass symphonyInitializationDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worksitesListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractWorksiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbitModelsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOrbitModelEClass = null;

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
	private EClass symphonyCoreFacadeEClass = null;

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
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymphonyCorePackageImpl() {
		super(eNS_URI, SymphonyCoreFactory.eINSTANCE);
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
	 * This method is used to initialize {@link SymphonyCorePackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymphonyCorePackage init() {
		if (isInited) return (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);

		// Obtain or create and register package
		SymphonyCorePackageImpl theSymphonyCorePackage = (SymphonyCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyCorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyBindingsPackage.eINSTANCE.eClass();
		EMFEcoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyCorePackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyCorePackage.eNS_URI, theSymphonyCorePackage);
		return theSymphonyCorePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphonyEnvironment() {
		return symphonyEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonyEnvironment_WorksitesList() {
		return (EReference)symphonyEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonyEnvironment_ActiveWorksite() {
		return (EReference)symphonyEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonyEnvironment_SymphonyTopology() {
		return (EReference)symphonyEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonyEnvironment_TimeSourcesList() {
		return (EReference)symphonyEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonyEnvironment_ActiveTimeSource() {
		return (EReference)symphonyEnvironmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphonyTopology() {
		return symphonyTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonyTopology_RootNode() {
		return (EReference)symphonyTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphonySystem() {
		return symphonySystemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonySystem_TopologyRoot() {
		return (EReference)symphonySystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonySystem_BindingSet() {
		return (EReference)symphonySystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonySystem_ConnectionPointsList() {
		return (EReference)symphonySystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonySystem_AssemblyLinksList() {
		return (EReference)symphonySystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonySystem_PoseProvider()
  {
		return (EReference)symphonySystemEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonySystem_PoseProviderInstance()
  {
		return (EReference)symphonySystemEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSymphonySystemApiAdapter()
  {
		return symphonySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonySystemApiAdapter_PoseCorrector()
  {
		return (EReference)symphonySystemApiAdapterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSymphonySystemApiAdapter_SymphonySystem()
  {
		return (EReference)symphonySystemApiAdapterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSymphonySystemApiAdapter__CreateResultMatrix__OperationCall()
  {
		return symphonySystemApiAdapterEClass.getEOperations().get(0);
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
	public EReference getConnectionPointsList_SymphonySystem() {
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
  public EReference getPoseCorrector_SymphonySystemApiAdapter()
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
	public EClass getSymphonyInitializationData() {
		return symphonyInitializationDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymphonyInitializationData_InitialPoseTransform() {
		return (EReference)symphonyInitializationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorksitesList() {
		return worksitesListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorksitesList_Worksites() {
		return (EReference)worksitesListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorksitesList_OrbitsModels() {
		return (EReference)worksitesListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractWorksite() {
		return abstractWorksiteEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractWorksite_WorksitesList() {
		return (EReference)abstractWorksiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrbitModelsList() {
		return orbitModelsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitModelsList_OrbitModels() {
		return (EReference)orbitModelsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOrbitModel() {
		return abstractOrbitModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOrbitModel_OrbitModelsList() {
		return (EReference)abstractOrbitModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOrbitModel_VariableFeatureReference() {
		return (EReference)abstractOrbitModelEClass.getEStructuralFeatures().get(1);
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
	public EClass getSymphonyCoreFacade() {
		return symphonyCoreFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSymphonyCoreFacade__ComputeAbsolutePoseMatrix__SymphonySystem_Matrix4x4()
  {
		return symphonyCoreFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreFacade__CreateResultNode__PositionedResult() {
		return symphonyCoreFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreFacade__CreateSymphonySession__boolean_boolean_boolean_boolean() {
		return symphonyCoreFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSymphonyCoreFacade__GetSymphonySystem__Environment_String()
  {
		return symphonyCoreFacadeEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreFacade__LoadFeatureOfInterestFromFile__String() {
		return symphonyCoreFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphonyCoreFacade__SaveFeatureOfInterestToFile__String_List() {
		return symphonyCoreFacadeEClass.getEOperations().get(5);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyCoreFactory getSymphonyCoreFactory() {
		return (SymphonyCoreFactory)getEFactoryInstance();
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
		symphonyCoreFacadeEClass = createEClass(SYMPHONY_CORE_FACADE);
		createEOperation(symphonyCoreFacadeEClass, SYMPHONY_CORE_FACADE___COMPUTE_ABSOLUTE_POSE_MATRIX__SYMPHONYSYSTEM_MATRIX4X4);
		createEOperation(symphonyCoreFacadeEClass, SYMPHONY_CORE_FACADE___CREATE_RESULT_NODE__POSITIONEDRESULT);
		createEOperation(symphonyCoreFacadeEClass, SYMPHONY_CORE_FACADE___CREATE_SYMPHONY_SESSION__BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN);
		createEOperation(symphonyCoreFacadeEClass, SYMPHONY_CORE_FACADE___GET_SYMPHONY_SYSTEM__ENVIRONMENT_STRING);
		createEOperation(symphonyCoreFacadeEClass, SYMPHONY_CORE_FACADE___LOAD_FEATURE_OF_INTEREST_FROM_FILE__STRING);
		createEOperation(symphonyCoreFacadeEClass, SYMPHONY_CORE_FACADE___SAVE_FEATURE_OF_INTEREST_TO_FILE__STRING_LIST);

		symphonyEnvironmentEClass = createEClass(SYMPHONY_ENVIRONMENT);
		createEReference(symphonyEnvironmentEClass, SYMPHONY_ENVIRONMENT__WORKSITES_LIST);
		createEReference(symphonyEnvironmentEClass, SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE);
		createEReference(symphonyEnvironmentEClass, SYMPHONY_ENVIRONMENT__SYMPHONY_TOPOLOGY);
		createEReference(symphonyEnvironmentEClass, SYMPHONY_ENVIRONMENT__TIME_SOURCES_LIST);
		createEReference(symphonyEnvironmentEClass, SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE);

		symphonyTopologyEClass = createEClass(SYMPHONY_TOPOLOGY);
		createEReference(symphonyTopologyEClass, SYMPHONY_TOPOLOGY__ROOT_NODE);

		symphonySystemEClass = createEClass(SYMPHONY_SYSTEM);
		createEReference(symphonySystemEClass, SYMPHONY_SYSTEM__TOPOLOGY_ROOT);
		createEReference(symphonySystemEClass, SYMPHONY_SYSTEM__BINDING_SET);
		createEReference(symphonySystemEClass, SYMPHONY_SYSTEM__CONNECTION_POINTS_LIST);
		createEReference(symphonySystemEClass, SYMPHONY_SYSTEM__ASSEMBLY_LINKS_LIST);
		createEReference(symphonySystemEClass, SYMPHONY_SYSTEM__POSE_PROVIDER);
		createEReference(symphonySystemEClass, SYMPHONY_SYSTEM__POSE_PROVIDER_INSTANCE);

		symphonySystemApiAdapterEClass = createEClass(SYMPHONY_SYSTEM_API_ADAPTER);
		createEReference(symphonySystemApiAdapterEClass, SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR);
		createEReference(symphonySystemApiAdapterEClass, SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM);
		createEOperation(symphonySystemApiAdapterEClass, SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL);

		connectionPointsListEClass = createEClass(CONNECTION_POINTS_LIST);
		createEReference(connectionPointsListEClass, CONNECTION_POINTS_LIST__SYMPHONY_SYSTEM);
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
		createEReference(poseCorrectorEClass, POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER);
		createEAttribute(poseCorrectorEClass, POSE_CORRECTOR__ENABLED);
		createEOperation(poseCorrectorEClass, POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4);

		symphonyInitializationDataEClass = createEClass(SYMPHONY_INITIALIZATION_DATA);
		createEReference(symphonyInitializationDataEClass, SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM);

		worksitesListEClass = createEClass(WORKSITES_LIST);
		createEReference(worksitesListEClass, WORKSITES_LIST__WORKSITES);
		createEReference(worksitesListEClass, WORKSITES_LIST__ORBITS_MODELS);

		abstractWorksiteEClass = createEClass(ABSTRACT_WORKSITE);
		createEReference(abstractWorksiteEClass, ABSTRACT_WORKSITE__WORKSITES_LIST);

		orbitModelsListEClass = createEClass(ORBIT_MODELS_LIST);
		createEReference(orbitModelsListEClass, ORBIT_MODELS_LIST__ORBIT_MODELS);

		abstractOrbitModelEClass = createEClass(ABSTRACT_ORBIT_MODEL);
		createEReference(abstractOrbitModelEClass, ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST);
		createEReference(abstractOrbitModelEClass, ABSTRACT_ORBIT_MODEL__VARIABLE_FEATURE_REFERENCE);

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
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		TopologyBindingsPackage theTopologyBindingsPackage = (TopologyBindingsPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyBindingsPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(listEDataType, "T");
		addETypeParameter(collectionEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		symphonyEnvironmentEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getEnvironment());
		symphonyEnvironmentEClass.getESuperTypes().add(theEMFEcorePackage.getTimed());
		symphonySystemEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getType());
		symphonySystemApiAdapterEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getTypeApiAdapter());
		symphonySystemApiAdapterEClass.getESuperTypes().add(this.getPoseProvider());
		connectionPointEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		connectionPointEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		assemblyLinkEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		assemblyLinkEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		absolutePoseProviderEClass.getESuperTypes().add(this.getPoseProvider());
		symphonyInitializationDataEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getInitializationData());
		worksitesListEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		worksitesListEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		abstractWorksiteEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		abstractWorksiteEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		abstractWorksiteEClass.getESuperTypes().add(theEMFEcorePackage.getTimed());
		orbitModelsListEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		orbitModelsListEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		abstractOrbitModelEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		abstractOrbitModelEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		featureOfInterestEClass.getESuperTypes().add(this.getPositioned());
		featureOfInterestEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		featureOfInterestEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		featureOfInterestListEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		featureOfInterestListEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		positionedResultEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractResult());
		positionedResultEClass.getESuperTypes().add(this.getPositioned());
		operationCallPositionedResultEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getOperationCallResult());
		operationCallPositionedResultEClass.getESuperTypes().add(this.getPositionedResult());
		userDefinedResultEClass.getESuperTypes().add(this.getPositionedResult());
		userDefinedResultEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		userDefinedResultEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		resultNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		resultsListNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		featureOfInterestNodeEClass.getESuperTypes().add(theTopologyPackage.getTransformNode());
		featureOfInterestListNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(symphonyCoreFacadeEClass, SymphonyCoreFacade.class, "SymphonyCoreFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphonyCoreFacade__ComputeAbsolutePoseMatrix__SymphonySystem_Matrix4x4(), theMathPackage.getMatrix4x4(), "computeAbsolutePoseMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSymphonySystem(), "symphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getMatrix4x4(), "relativePose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreFacade__CreateResultNode__PositionedResult(), this.getResultNode(), "createResultNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPositionedResult(), "result", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreFacade__CreateSymphonySession__boolean_boolean_boolean_boolean(), theEMFEcoreInvocatorPackage.getInvocatorSession(), "createSymphonySession", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createEnvironment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createPrograms", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createDataProducts", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "createTools", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreFacade__GetSymphonySystem__Environment_String(), this.getSymphonySystem(), "getSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fullyQualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphonyCoreFacade__LoadFeatureOfInterestFromFile__String(), null, "loadFeatureOfInterestFromFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "url", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getFeatureOfInterest());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphonyCoreFacade__SaveFeatureOfInterestToFile__String_List(), null, "saveFeatureOfInterestToFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getFeatureOfInterest());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "foiList", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(symphonyEnvironmentEClass, SymphonyEnvironment.class, "SymphonyEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonyEnvironment_WorksitesList(), this.getWorksitesList(), null, "worksitesList", null, 0, 1, SymphonyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironment_ActiveWorksite(), this.getAbstractWorksite(), null, "activeWorksite", null, 0, 1, SymphonyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironment_SymphonyTopology(), this.getSymphonyTopology(), null, "symphonyTopology", null, 0, 1, SymphonyEnvironment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironment_TimeSourcesList(), theEMFEcorePackage.getTimeSourcesList(), null, "timeSourcesList", null, 0, 1, SymphonyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonyEnvironment_ActiveTimeSource(), theEMFEcorePackage.getTimeSource(), null, "activeTimeSource", null, 0, 1, SymphonyEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphonyTopologyEClass, SymphonyTopology.class, "SymphonyTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonyTopology_RootNode(), theTopologyPackage.getGroupNode(), null, "rootNode", null, 0, 1, SymphonyTopology.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(symphonySystemEClass, SymphonySystem.class, "SymphonySystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonySystem_TopologyRoot(), this.getTopologyRoot(), null, "topologyRoot", null, 0, 1, SymphonySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonySystem_BindingSet(), theTopologyBindingsPackage.getBindingsSet(), null, "bindingSet", null, 0, 1, SymphonySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonySystem_ConnectionPointsList(), this.getConnectionPointsList(), this.getConnectionPointsList_SymphonySystem(), "connectionPointsList", null, 0, 1, SymphonySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonySystem_AssemblyLinksList(), this.getAssemblyLinksList(), null, "assemblyLinksList", null, 0, 1, SymphonySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonySystem_PoseProvider(), theEMFEcoreInvocatorPackage.getAbstractType(), null, "poseProvider", null, 0, 1, SymphonySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonySystem_PoseProviderInstance(), this.getPoseProvider(), null, "poseProviderInstance", null, 0, 1, SymphonySystem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symphonySystemApiAdapterEClass, SymphonySystemApiAdapter.class, "SymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonySystemApiAdapter_PoseCorrector(), this.getPoseCorrector(), this.getPoseCorrector_SymphonySystemApiAdapter(), "poseCorrector", null, 0, 1, SymphonySystemApiAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymphonySystemApiAdapter_SymphonySystem(), this.getSymphonySystem(), null, "symphonySystem", null, 0, 1, SymphonySystemApiAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSymphonySystemApiAdapter__CreateResultMatrix__OperationCall(), theMathPackage.getMatrix4x4(), "createResultMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(connectionPointsListEClass, ConnectionPointsList.class, "ConnectionPointsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPointsList_SymphonySystem(), this.getSymphonySystem(), this.getSymphonySystem_ConnectionPointsList(), "symphonySystem", null, 1, 1, ConnectionPointsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPointsList_ConnectionPoints(), this.getConnectionPoint(), this.getConnectionPoint_PointsList(), "connectionPoints", null, 0, -1, ConnectionPointsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionPointEClass, ConnectionPoint.class, "ConnectionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPoint_PointsList(), this.getConnectionPointsList(), this.getConnectionPointsList_ConnectionPoints(), "pointsList", null, 1, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionPoint_Node(), theTopologyPackage.getGroupNode(), null, "node", null, 0, 1, ConnectionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyLinkEClass, AssemblyLink.class, "AssemblyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyLink_ParentTypeMember(), theEMFEcoreInvocatorPackage.getTypeMember(), null, "parentTypeMember", null, 0, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_SubSystemTypeMember(), theEMFEcoreInvocatorPackage.getTypeMember(), null, "subSystemTypeMember", null, 1, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_ParentConnectionPoint(), this.getConnectionPoint(), null, "parentConnectionPoint", null, 1, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_TransformationMatrix(), theMathPackage.getMatrix4x4(), null, "transformationMatrix", null, 0, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_GeometryNode(), theTopologyPackage.getNode(), null, "geometryNode", null, 0, 1, AssemblyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_ParentInstance(), this.getSymphonySystem(), null, "parentInstance", null, 0, 1, AssemblyLink.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblyLink_SubSystemInstance(), this.getSymphonySystem(), null, "subSystemInstance", null, 0, 1, AssemblyLink.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assemblyLinksListEClass, AssemblyLinksList.class, "AssemblyLinksList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblyLinksList_AssemblyLinks(), this.getAssemblyLink(), null, "assemblyLinks", null, 0, -1, AssemblyLinksList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseProviderEClass, PoseProvider.class, "PoseProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoseProvider_PoseTransform(), theMathPackage.getMatrix4x4(), null, "poseTransform", null, 0, 1, PoseProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absolutePoseProviderEClass, AbsolutePoseProvider.class, "AbsolutePoseProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poseCorrectorEClass, PoseCorrector.class, "PoseCorrector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoseCorrector_SymphonySystemApiAdapter(), this.getSymphonySystemApiAdapter(), this.getSymphonySystemApiAdapter_PoseCorrector(), "symphonySystemApiAdapter", null, 0, 1, PoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoseCorrector_Enabled(), theEcorePackage.getEBoolean(), "enabled", "false", 0, 1, PoseCorrector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseCorrector__ApplyCorrection__Matrix4x4(), theMathPackage.getMatrix4x4(), "applyCorrection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getMatrix4x4(), "originalPose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(symphonyInitializationDataEClass, SymphonyInitializationData.class, "SymphonyInitializationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymphonyInitializationData_InitialPoseTransform(), theMathPackage.getMatrix4x4(), null, "initialPoseTransform", null, 0, 1, SymphonyInitializationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worksitesListEClass, WorksitesList.class, "WorksitesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorksitesList_Worksites(), this.getAbstractWorksite(), this.getAbstractWorksite_WorksitesList(), "worksites", null, 0, -1, WorksitesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorksitesList_OrbitsModels(), this.getOrbitModelsList(), null, "orbitsModels", null, 1, 1, WorksitesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractWorksiteEClass, AbstractWorksite.class, "AbstractWorksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractWorksite_WorksitesList(), this.getWorksitesList(), this.getWorksitesList_Worksites(), "worksitesList", null, 0, 1, AbstractWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbitModelsListEClass, OrbitModelsList.class, "OrbitModelsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitModelsList_OrbitModels(), this.getAbstractOrbitModel(), this.getAbstractOrbitModel_OrbitModelsList(), "orbitModels", null, 0, -1, OrbitModelsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractOrbitModelEClass, AbstractOrbitModel.class, "AbstractOrbitModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractOrbitModel_OrbitModelsList(), this.getOrbitModelsList(), this.getOrbitModelsList_OrbitModels(), "orbitModelsList", null, 0, 1, AbstractOrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractOrbitModel_VariableFeatureReference(), theEMFEcoreInvocatorPackage.getVariableFeatureReference(), null, "variableFeatureReference", null, 0, 1, AbstractOrbitModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionedEClass, Positioned.class, "Positioned", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositioned_Pose(), theMathPackage.getMatrix4x4(), null, "pose", null, 1, 1, Positioned.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOfInterestEClass, FeatureOfInterest.class, "FeatureOfInterest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureOfInterestListEClass, FeatureOfInterestList.class, "FeatureOfInterestList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOfInterestList_FeaturesOfInterest(), this.getFeatureOfInterest(), null, "featuresOfInterest", null, 0, -1, FeatureOfInterestList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyRootEClass, TopologyRoot.class, "TopologyRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyRoot_OriginNode(), theTopologyPackage.getNode(), null, "originNode", null, 0, 1, TopologyRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionedResultEClass, PositionedResult.class, "PositionedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationCallPositionedResultEClass, OperationCallPositionedResult.class, "OperationCallPositionedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCallPositionedResult_RelativePose(), theMathPackage.getMatrix4x4(), null, "relativePose", null, 1, 1, OperationCallPositionedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedResultEClass, UserDefinedResult.class, "UserDefinedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultNodeEClass, ResultNode.class, "ResultNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultNode_Result(), this.getPositionedResult(), null, "result", null, 0, 1, ResultNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsListNodeEClass, ResultsListNode.class, "ResultsListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultsListNode_ResultsList(), theEMFEcoreInvocatorPackage.getResultsList(), null, "resultsList", null, 0, 1, ResultsListNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} // SymphonyCorePackageImpl
