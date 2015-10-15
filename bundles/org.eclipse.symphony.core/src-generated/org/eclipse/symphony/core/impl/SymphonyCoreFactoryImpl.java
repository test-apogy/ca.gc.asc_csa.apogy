/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.AbsolutePoseProvider;
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
import org.eclipse.symphony.core.UserDefinedResult;
import org.eclipse.symphony.core.WorksitesList;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class SymphonyCoreFactoryImpl extends EFactoryImpl implements
		SymphonyCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SymphonyCoreFactory init() {
		try {
			SymphonyCoreFactory theSymphonyCoreFactory = (SymphonyCoreFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyCorePackage.eNS_URI);
			if (theSymphonyCoreFactory != null) {
				return theSymphonyCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public SymphonyCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SymphonyCorePackage.SYMPHONY_CORE_FACADE: return createSymphonyCoreFacade();
			case SymphonyCorePackage.SYMPHONY_ENVIRONMENT: return createSymphonyEnvironment();
			case SymphonyCorePackage.SYMPHONY_TOPOLOGY: return createSymphonyTopology();
			case SymphonyCorePackage.SYMPHONY_SYSTEM: return createSymphonySystem();
			case SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER: return createSymphonySystemApiAdapter();
			case SymphonyCorePackage.CONNECTION_POINTS_LIST: return createConnectionPointsList();
			case SymphonyCorePackage.CONNECTION_POINT: return createConnectionPoint();
			case SymphonyCorePackage.ASSEMBLY_LINK: return createAssemblyLink();
			case SymphonyCorePackage.ASSEMBLY_LINKS_LIST: return createAssemblyLinksList();
			case SymphonyCorePackage.POSE_PROVIDER: return createPoseProvider();
			case SymphonyCorePackage.ABSOLUTE_POSE_PROVIDER: return createAbsolutePoseProvider();
			case SymphonyCorePackage.SYMPHONY_INITIALIZATION_DATA: return createSymphonyInitializationData();
			case SymphonyCorePackage.WORKSITES_LIST: return createWorksitesList();
			case SymphonyCorePackage.ORBIT_MODELS_LIST: return createOrbitModelsList();
			case SymphonyCorePackage.POSITIONED: return createPositioned();
			case SymphonyCorePackage.FEATURE_OF_INTEREST: return createFeatureOfInterest();
			case SymphonyCorePackage.FEATURE_OF_INTEREST_LIST: return createFeatureOfInterestList();
			case SymphonyCorePackage.TOPOLOGY_ROOT: return createTopologyRoot();
			case SymphonyCorePackage.POSITIONED_RESULT: return createPositionedResult();
			case SymphonyCorePackage.OPERATION_CALL_POSITIONED_RESULT: return createOperationCallPositionedResult();
			case SymphonyCorePackage.USER_DEFINED_RESULT: return createUserDefinedResult();
			case SymphonyCorePackage.RESULT_NODE: return createResultNode();
			case SymphonyCorePackage.RESULTS_LIST_NODE: return createResultsListNode();
			case SymphonyCorePackage.FEATURE_OF_INTEREST_NODE: return createFeatureOfInterestNode();
			case SymphonyCorePackage.FEATURE_OF_INTEREST_LIST_NODE: return createFeatureOfInterestListNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SymphonyCorePackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case SymphonyCorePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case SymphonyCorePackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case SymphonyCorePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SymphonyCorePackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case SymphonyCorePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case SymphonyCorePackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case SymphonyCorePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEnvironment createSymphonyEnvironment() {
		SymphonyEnvironmentImpl symphonyEnvironment = new SymphonyEnvironmentImpl();
		return symphonyEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTopology createSymphonyTopology() {
		SymphonyTopologyImpl symphonyTopology = new SymphonyTopologyImpl();
		return symphonyTopology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem createSymphonySystem() {
		SymphonySystemImpl symphonySystem = new SymphonySystemImpl();
		return symphonySystem;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemApiAdapter createSymphonySystemApiAdapter()
  {
		SymphonySystemApiAdapterImpl symphonySystemApiAdapter = new SymphonySystemApiAdapterImpl();
		return symphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointsList createConnectionPointsList() {
		ConnectionPointsListImpl connectionPointsList = new ConnectionPointsListImpl();
		return connectionPointsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPoint createConnectionPoint() {
		ConnectionPointImpl connectionPoint = new ConnectionPointImpl();
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyLink createAssemblyLink() {
		AssemblyLinkImpl assemblyLink = new AssemblyLinkImpl();
		return assemblyLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyLinksList createAssemblyLinksList() {
		AssemblyLinksListImpl assemblyLinksList = new AssemblyLinksListImpl();
		return assemblyLinksList;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PoseProvider createPoseProvider()
  {
		PoseProviderImpl poseProvider = new PoseProviderImpl();
		return poseProvider;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsolutePoseProvider createAbsolutePoseProvider() {
		AbsolutePoseProviderImpl absolutePoseProvider = new AbsolutePoseProviderImpl();
		return absolutePoseProvider;
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyInitializationData createSymphonyInitializationData() {
		SymphonyInitializationDataImpl symphonyInitializationData = new SymphonyInitializationDataImpl();
		return symphonyInitializationData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WorksitesList createWorksitesList() {
		WorksitesListImpl worksitesList = new WorksitesListImpl();
		return worksitesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModelsList createOrbitModelsList() {
		OrbitModelsListImpl orbitModelsList = new OrbitModelsListImpl();
		return orbitModelsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positioned createPositioned() {
		PositionedImpl positioned = new PositionedImpl();
		return positioned;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyRoot createTopologyRoot() {
		TopologyRootImpl topologyRoot = new TopologyRootImpl();
		return topologyRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestList createFeatureOfInterestList() {
		FeatureOfInterestListImpl featureOfInterestList = new FeatureOfInterestListImpl();
		return featureOfInterestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterest createFeatureOfInterest() {
		FeatureOfInterestImpl featureOfInterest = new FeatureOfInterestImpl();
		return featureOfInterest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PositionedResult createPositionedResult() {
		PositionedResultImpl positionedResult = new PositionedResultImpl();
		return positionedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallPositionedResult createOperationCallPositionedResult() {
		OperationCallPositionedResultImpl operationCallPositionedResult = new OperationCallPositionedResultImpl();
		return operationCallPositionedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedResult createUserDefinedResult() {
		UserDefinedResultImpl userDefinedResult = new UserDefinedResultImpl();
		return userDefinedResult;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyCoreFacade createSymphonyCoreFacade() {
		SymphonyCoreFacadeImpl symphonyCoreFacade = new SymphonyCoreFacadeImpl();
		return symphonyCoreFacade;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultNode createResultNode() {
		ResultNodeImpl resultNode = new ResultNodeImpl();
		return resultNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsListNode createResultsListNode() {
		ResultsListNodeImpl resultsListNode = new ResultsListNodeImpl();
		return resultsListNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestNode createFeatureOfInterestNode() {
		FeatureOfInterestNodeImpl featureOfInterestNode = new FeatureOfInterestNodeImpl();
		return featureOfInterestNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestListNode createFeatureOfInterestListNode() {
		FeatureOfInterestListNodeImpl featureOfInterestListNode = new FeatureOfInterestListNodeImpl();
		return featureOfInterestListNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType,
			String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyCorePackage getSymphonyCorePackage() {
		return (SymphonyCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymphonyCorePackage getPackage() {
		return SymphonyCorePackage.eINSTANCE;
	}

} // SymphonyCoreFactoryImpl
