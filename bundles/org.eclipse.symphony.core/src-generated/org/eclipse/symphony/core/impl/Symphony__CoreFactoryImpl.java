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
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.Symphony__CorePackage;
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
public class Symphony__CoreFactoryImpl extends EFactoryImpl implements
		Symphony__CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static Symphony__CoreFactory init() {
		try {
			Symphony__CoreFactory theSymphony__CoreFactory = (Symphony__CoreFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CorePackage.eNS_URI);
			if (theSymphony__CoreFactory != null) {
				return theSymphony__CoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__CorePackage.SYMPHONY_CORE_FACADE: return createSymphonyCoreFacade();
			case Symphony__CorePackage.SYMPHONY_ENVIRONMENT: return createSymphonyEnvironment();
			case Symphony__CorePackage.SYMPHONY_TOPOLOGY: return createSymphonyTopology();
			case Symphony__CorePackage.SYMPHONY_SYSTEM: return createSymphonySystem();
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER: return createSymphonySystemApiAdapter();
			case Symphony__CorePackage.CONNECTION_POINTS_LIST: return createConnectionPointsList();
			case Symphony__CorePackage.CONNECTION_POINT: return createConnectionPoint();
			case Symphony__CorePackage.ASSEMBLY_LINK: return createAssemblyLink();
			case Symphony__CorePackage.ASSEMBLY_LINKS_LIST: return createAssemblyLinksList();
			case Symphony__CorePackage.POSE_PROVIDER: return createPoseProvider();
			case Symphony__CorePackage.ABSOLUTE_POSE_PROVIDER: return createAbsolutePoseProvider();
			case Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA: return createSymphonyInitializationData();
			case Symphony__CorePackage.WORKSITES_LIST: return createWorksitesList();
			case Symphony__CorePackage.ORBIT_MODELS_LIST: return createOrbitModelsList();
			case Symphony__CorePackage.POSITIONED: return createPositioned();
			case Symphony__CorePackage.FEATURE_OF_INTEREST: return createFeatureOfInterest();
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST: return createFeatureOfInterestList();
			case Symphony__CorePackage.TOPOLOGY_ROOT: return createTopologyRoot();
			case Symphony__CorePackage.POSITIONED_RESULT: return createPositionedResult();
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT: return createOperationCallPositionedResult();
			case Symphony__CorePackage.USER_DEFINED_RESULT: return createUserDefinedResult();
			case Symphony__CorePackage.RESULT_NODE: return createResultNode();
			case Symphony__CorePackage.RESULTS_LIST_NODE: return createResultsListNode();
			case Symphony__CorePackage.FEATURE_OF_INTEREST_NODE: return createFeatureOfInterestNode();
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST_NODE: return createFeatureOfInterestListNode();
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
			case Symphony__CorePackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case Symphony__CorePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__CorePackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case Symphony__CorePackage.EXCEPTION:
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
			case Symphony__CorePackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case Symphony__CorePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__CorePackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case Symphony__CorePackage.EXCEPTION:
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CorePackage getSymphony__CorePackage() {
		return (Symphony__CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CorePackage getPackage() {
		return Symphony__CorePackage.eINSTANCE;
	}

} // Symphony__CoreFactoryImpl
