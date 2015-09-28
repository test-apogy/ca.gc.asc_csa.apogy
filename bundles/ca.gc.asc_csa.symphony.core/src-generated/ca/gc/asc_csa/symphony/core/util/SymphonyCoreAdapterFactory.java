/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractType;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter;
import ca.gc.asc_csa.symphony.core.*;
import ca.gc.asc_csa.symphony.core.AbsolutePoseProvider;
import ca.gc.asc_csa.symphony.core.AbstractWorksite;
import ca.gc.asc_csa.symphony.core.AssemblyLink;
import ca.gc.asc_csa.symphony.core.AssemblyLinksList;
import ca.gc.asc_csa.symphony.core.ConnectionPoint;
import ca.gc.asc_csa.symphony.core.ConnectionPointsList;
import ca.gc.asc_csa.symphony.core.FeatureOfInterest;
import ca.gc.asc_csa.symphony.core.FeatureOfInterestList;
import ca.gc.asc_csa.symphony.core.FeatureOfInterestListNode;
import ca.gc.asc_csa.symphony.core.FeatureOfInterestNode;
import ca.gc.asc_csa.symphony.core.OperationCallPositionedResult;
import ca.gc.asc_csa.symphony.core.PoseCorrector;
import ca.gc.asc_csa.symphony.core.PoseProvider;
import ca.gc.asc_csa.symphony.core.Positioned;
import ca.gc.asc_csa.symphony.core.PositionedResult;
import ca.gc.asc_csa.symphony.core.ResultNode;
import ca.gc.asc_csa.symphony.core.ResultsListNode;
import ca.gc.asc_csa.symphony.core.SymphonyCoreFacade;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonyEnvironment;
import ca.gc.asc_csa.symphony.core.SymphonyInitializationData;
import ca.gc.asc_csa.symphony.core.SymphonySystem;
import ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.core.SymphonyTopology;
import ca.gc.asc_csa.symphony.core.TopologyRoot;
import ca.gc.asc_csa.symphony.core.UserDefinedResult;
import ca.gc.asc_csa.symphony.core.WorksitesList;
import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.PositionNode;
import ca.gc.space.topology.RotationNode;
import ca.gc.space.topology.TransformNode;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage
 * @generated
 */
public class SymphonyCoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyCorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public SymphonyCoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SymphonyCorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SymphonyCoreSwitch<Adapter> modelSwitch = new SymphonyCoreSwitch<Adapter>() {
			@Override
			public Adapter caseSymphonyCoreFacade(SymphonyCoreFacade object) {
				return createSymphonyCoreFacadeAdapter();
			}
			@Override
			public Adapter caseSymphonyEnvironment(SymphonyEnvironment object) {
				return createSymphonyEnvironmentAdapter();
			}
			@Override
			public Adapter caseSymphonyTopology(SymphonyTopology object) {
				return createSymphonyTopologyAdapter();
			}
			@Override
			public Adapter caseSymphonySystem(SymphonySystem object) {
				return createSymphonySystemAdapter();
			}
			@Override
			public Adapter caseSymphonySystemApiAdapter(SymphonySystemApiAdapter object) {
				return createSymphonySystemApiAdapterAdapter();
			}
			@Override
			public Adapter caseConnectionPointsList(ConnectionPointsList object) {
				return createConnectionPointsListAdapter();
			}
			@Override
			public Adapter caseConnectionPoint(ConnectionPoint object) {
				return createConnectionPointAdapter();
			}
			@Override
			public Adapter caseAssemblyLink(AssemblyLink object) {
				return createAssemblyLinkAdapter();
			}
			@Override
			public Adapter caseAssemblyLinksList(AssemblyLinksList object) {
				return createAssemblyLinksListAdapter();
			}
			@Override
			public Adapter casePoseProvider(PoseProvider object) {
				return createPoseProviderAdapter();
			}
			@Override
			public Adapter caseAbsolutePoseProvider(AbsolutePoseProvider object) {
				return createAbsolutePoseProviderAdapter();
			}
			@Override
			public Adapter casePoseCorrector(PoseCorrector object) {
				return createPoseCorrectorAdapter();
			}
			@Override
			public Adapter caseSymphonyInitializationData(SymphonyInitializationData object) {
				return createSymphonyInitializationDataAdapter();
			}
			@Override
			public Adapter caseWorksitesList(WorksitesList object) {
				return createWorksitesListAdapter();
			}
			@Override
			public Adapter caseAbstractWorksite(AbstractWorksite object) {
				return createAbstractWorksiteAdapter();
			}
			@Override
			public Adapter caseOrbitModelsList(OrbitModelsList object) {
				return createOrbitModelsListAdapter();
			}
			@Override
			public Adapter caseAbstractOrbitModel(AbstractOrbitModel object) {
				return createAbstractOrbitModelAdapter();
			}
			@Override
			public Adapter casePositioned(Positioned object) {
				return createPositionedAdapter();
			}
			@Override
			public Adapter caseFeatureOfInterest(FeatureOfInterest object) {
				return createFeatureOfInterestAdapter();
			}
			@Override
			public Adapter caseFeatureOfInterestList(FeatureOfInterestList object) {
				return createFeatureOfInterestListAdapter();
			}
			@Override
			public Adapter caseTopologyRoot(TopologyRoot object) {
				return createTopologyRootAdapter();
			}
			@Override
			public Adapter casePositionedResult(PositionedResult object) {
				return createPositionedResultAdapter();
			}
			@Override
			public Adapter caseOperationCallPositionedResult(OperationCallPositionedResult object) {
				return createOperationCallPositionedResultAdapter();
			}
			@Override
			public Adapter caseUserDefinedResult(UserDefinedResult object) {
				return createUserDefinedResultAdapter();
			}
			@Override
			public Adapter caseResultNode(ResultNode object) {
				return createResultNodeAdapter();
			}
			@Override
			public Adapter caseResultsListNode(ResultsListNode object) {
				return createResultsListNodeAdapter();
			}
			@Override
			public Adapter caseFeatureOfInterestNode(FeatureOfInterestNode object) {
				return createFeatureOfInterestNodeAdapter();
			}
			@Override
			public Adapter caseFeatureOfInterestListNode(FeatureOfInterestListNode object) {
				return createFeatureOfInterestListNodeAdapter();
			}
			@Override
			public Adapter caseUpdatable(Updatable object) {
				return createUpdatableAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeApiAdapter(TypeApiAdapter object) {
				return createTypeApiAdapterAdapter();
			}
			@Override
			public Adapter caseAbstractInitializationData(AbstractInitializationData object) {
				return createAbstractInitializationDataAdapter();
			}
			@Override
			public Adapter caseInitializationData(InitializationData object) {
				return createInitializationDataAdapter();
			}
			@Override
			public Adapter caseAbstractResult(AbstractResult object) {
				return createAbstractResultAdapter();
			}
			@Override
			public Adapter caseOperationCallContainer(OperationCallContainer object) {
				return createOperationCallContainerAdapter();
			}
			@Override
			public Adapter caseOperationCallResult(OperationCallResult object) {
				return createOperationCallResultAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public Adapter caseAggregateGroupNode(AggregateGroupNode object) {
				return createAggregateGroupNodeAdapter();
			}
			@Override
			public Adapter casePositionNode(PositionNode object) {
				return createPositionNodeAdapter();
			}
			@Override
			public Adapter caseRotationNode(RotationNode object) {
				return createRotationNodeAdapter();
			}
			@Override
			public Adapter caseTransformNode(TransformNode object) {
				return createTransformNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonyEnvironment <em>Symphony Environment</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyEnvironment
	 * @generated
	 */
	public Adapter createSymphonyEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonyTopology <em>Symphony Topology</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyTopology
	 * @generated
	 */
	public Adapter createSymphonyTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonySystem <em>Symphony System</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystem
	 * @generated
	 */
	public Adapter createSymphonySystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter
	 * @generated
	 */
  public Adapter createSymphonySystemApiAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.ConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPointsList
	 * @generated
	 */
	public Adapter createConnectionPointsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPoint
	 * @generated
	 */
	public Adapter createConnectionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.AssemblyLink <em>Assembly Link</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLink
	 * @generated
	 */
	public Adapter createAssemblyLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.AssemblyLinksList <em>Assembly Links List</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.AssemblyLinksList
	 * @generated
	 */
	public Adapter createAssemblyLinksListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.PoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.PoseProvider
	 * @generated
	 */
  public Adapter createPoseProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.AbsolutePoseProvider <em>Absolute Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.AbsolutePoseProvider
	 * @generated
	 */
	public Adapter createAbsolutePoseProviderAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.PoseCorrector <em>Pose Corrector</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.PoseCorrector
	 * @generated
	 */
  public Adapter createPoseCorrectorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonyInitializationData <em>Symphony Initialization Data</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyInitializationData
	 * @generated
	 */
	public Adapter createSymphonyInitializationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.WorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.WorksitesList
	 * @generated
	 */
	public Adapter createWorksitesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.AbstractWorksite
	 * @generated
	 */
	public Adapter createAbstractWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.OrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.OrbitModelsList
	 * @generated
	 */
	public Adapter createOrbitModelsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.AbstractOrbitModel <em>Abstract Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.AbstractOrbitModel
	 * @generated
	 */
	public Adapter createAbstractOrbitModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.Positioned
	 * @generated
	 */
	public Adapter createPositionedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.TopologyRoot <em>Topology Root</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.TopologyRoot
	 * @generated
	 */
	public Adapter createTopologyRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestList <em>Feature Of Interest List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestList
	 * @generated
	 */
	public Adapter createFeatureOfInterestListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterest <em>Feature Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterest
	 * @generated
	 */
	public Adapter createFeatureOfInterestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.PositionedResult <em>Positioned Result</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.PositionedResult
	 * @generated
	 */
	public Adapter createPositionedResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.OperationCallPositionedResult <em>Operation Call Positioned Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.OperationCallPositionedResult
	 * @generated
	 */
	public Adapter createOperationCallPositionedResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.UserDefinedResult <em>User Defined Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.UserDefinedResult
	 * @generated
	 */
	public Adapter createUserDefinedResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonyCoreFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCoreFacade
	 * @generated
	 */
	public Adapter createSymphonyCoreFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.ResultNode <em>Result Node</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.ResultNode
	 * @generated
	 */
	public Adapter createResultNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.ResultsListNode <em>Results List Node</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.ResultsListNode
	 * @generated
	 */
	public Adapter createResultsListNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestNode <em>Feature Of Interest Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestNode
	 * @generated
	 */
	public Adapter createFeatureOfInterestNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestListNode <em>Feature Of Interest List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.FeatureOfInterestListNode
	 * @generated
	 */
	public Adapter createFeatureOfInterestListNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.Updatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.Updatable
	 * @generated
	 */
	public Adapter createUpdatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link ca.gc.asc_csa.eclipse.emf.ecore.Named <em>Named</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Described <em>Described</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Timed
	 * @generated
	 */
	public Adapter createTimedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractType
	 * @generated
	 */
  public Adapter createAbstractTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type <em>Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter <em>Type Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter
	 * @generated
	 */
  public Adapter createTypeApiAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData
	 * @generated
	 */
	public Adapter createAbstractInitializationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData <em>Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData
	 * @generated
	 */
  public Adapter createInitializationDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult <em>Abstract Result</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult
	 * @generated
	 */
	public Adapter createAbstractResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer
	 * @generated
	 */
	public Adapter createOperationCallContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult <em>Operation Call Result</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult
	 * @generated
	 */
	public Adapter createOperationCallResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link ca.gc.space.topology.GroupNode <em>Group Node</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see ca.gc.space.topology.GroupNode
	 * @generated
	 */
	public Adapter createGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.AggregateGroupNode
	 * @generated
	 */
	public Adapter createAggregateGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.PositionNode <em>Position Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.PositionNode
	 * @generated
	 */
	public Adapter createPositionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.RotationNode <em>Rotation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.RotationNode
	 * @generated
	 */
	public Adapter createRotationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.TransformNode <em>Transform Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.TransformNode
	 * @generated
	 */
	public Adapter createTransformNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // SymphonyCoreAdapterFactory
