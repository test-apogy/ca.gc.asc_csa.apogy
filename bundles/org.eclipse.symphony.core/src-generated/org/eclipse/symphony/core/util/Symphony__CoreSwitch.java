/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.TransformNode;
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
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.SymphonyInitializationData;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.SymphonyTopology;
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.UserDefinedResult;
import org.eclipse.symphony.core.WorksitesList;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.AbstractType;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.InitializationData;
import org.eclipse.symphony.core.invocator.OperationCallContainer;
import org.eclipse.symphony.core.invocator.OperationCallResult;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.Symphony__CorePackage
 * @generated
 */
public class Symphony__CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = Symphony__CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Symphony__CorePackage.SYMPHONY_CORE_FACADE: {
				SymphonyCoreFacade symphonyCoreFacade = (SymphonyCoreFacade)theEObject;
				T result = caseSymphonyCoreFacade(symphonyCoreFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.SYMPHONY_ENVIRONMENT: {
				SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment)theEObject;
				T result = caseSymphonyEnvironment(symphonyEnvironment);
				if (result == null) result = caseEnvironment(symphonyEnvironment);
				if (result == null) result = caseTimed(symphonyEnvironment);
				if (result == null) result = caseNamed(symphonyEnvironment);
				if (result == null) result = caseDescribed(symphonyEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.SYMPHONY_TOPOLOGY: {
				SymphonyTopology symphonyTopology = (SymphonyTopology)theEObject;
				T result = caseSymphonyTopology(symphonyTopology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.SYMPHONY_SYSTEM: {
				SymphonySystem symphonySystem = (SymphonySystem)theEObject;
				T result = caseSymphonySystem(symphonySystem);
				if (result == null) result = caseType(symphonySystem);
				if (result == null) result = caseNamed(symphonySystem);
				if (result == null) result = caseAbstractType(symphonySystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER: {
				SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter)theEObject;
				T result = caseSymphonySystemApiAdapter(symphonySystemApiAdapter);
				if (result == null) result = caseTypeApiAdapter(symphonySystemApiAdapter);
				if (result == null) result = casePoseProvider(symphonySystemApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.CONNECTION_POINTS_LIST: {
				ConnectionPointsList connectionPointsList = (ConnectionPointsList)theEObject;
				T result = caseConnectionPointsList(connectionPointsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.CONNECTION_POINT: {
				ConnectionPoint connectionPoint = (ConnectionPoint)theEObject;
				T result = caseConnectionPoint(connectionPoint);
				if (result == null) result = caseNamed(connectionPoint);
				if (result == null) result = caseDescribed(connectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.ASSEMBLY_LINK: {
				AssemblyLink assemblyLink = (AssemblyLink)theEObject;
				T result = caseAssemblyLink(assemblyLink);
				if (result == null) result = caseNamed(assemblyLink);
				if (result == null) result = caseDescribed(assemblyLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.ASSEMBLY_LINKS_LIST: {
				AssemblyLinksList assemblyLinksList = (AssemblyLinksList)theEObject;
				T result = caseAssemblyLinksList(assemblyLinksList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.POSE_PROVIDER: {
				PoseProvider poseProvider = (PoseProvider)theEObject;
				T result = casePoseProvider(poseProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.ABSOLUTE_POSE_PROVIDER: {
				AbsolutePoseProvider absolutePoseProvider = (AbsolutePoseProvider)theEObject;
				T result = caseAbsolutePoseProvider(absolutePoseProvider);
				if (result == null) result = casePoseProvider(absolutePoseProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.POSE_CORRECTOR: {
				PoseCorrector poseCorrector = (PoseCorrector)theEObject;
				T result = casePoseCorrector(poseCorrector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA: {
				SymphonyInitializationData symphonyInitializationData = (SymphonyInitializationData)theEObject;
				T result = caseSymphonyInitializationData(symphonyInitializationData);
				if (result == null) result = caseInitializationData(symphonyInitializationData);
				if (result == null) result = caseAbstractInitializationData(symphonyInitializationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.WORKSITES_LIST: {
				WorksitesList worksitesList = (WorksitesList)theEObject;
				T result = caseWorksitesList(worksitesList);
				if (result == null) result = caseNamed(worksitesList);
				if (result == null) result = caseDescribed(worksitesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.ABSTRACT_WORKSITE: {
				AbstractWorksite abstractWorksite = (AbstractWorksite)theEObject;
				T result = caseAbstractWorksite(abstractWorksite);
				if (result == null) result = caseNamed(abstractWorksite);
				if (result == null) result = caseDescribed(abstractWorksite);
				if (result == null) result = caseTimed(abstractWorksite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.ORBIT_MODELS_LIST: {
				OrbitModelsList orbitModelsList = (OrbitModelsList)theEObject;
				T result = caseOrbitModelsList(orbitModelsList);
				if (result == null) result = caseNamed(orbitModelsList);
				if (result == null) result = caseDescribed(orbitModelsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.ABSTRACT_ORBIT_MODEL: {
				AbstractOrbitModel abstractOrbitModel = (AbstractOrbitModel)theEObject;
				T result = caseAbstractOrbitModel(abstractOrbitModel);
				if (result == null) result = caseNamed(abstractOrbitModel);
				if (result == null) result = caseDescribed(abstractOrbitModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.POSITIONED: {
				Positioned positioned = (Positioned)theEObject;
				T result = casePositioned(positioned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.FEATURE_OF_INTEREST: {
				FeatureOfInterest featureOfInterest = (FeatureOfInterest)theEObject;
				T result = caseFeatureOfInterest(featureOfInterest);
				if (result == null) result = casePositioned(featureOfInterest);
				if (result == null) result = caseNamed(featureOfInterest);
				if (result == null) result = caseDescribed(featureOfInterest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST: {
				FeatureOfInterestList featureOfInterestList = (FeatureOfInterestList)theEObject;
				T result = caseFeatureOfInterestList(featureOfInterestList);
				if (result == null) result = caseNamed(featureOfInterestList);
				if (result == null) result = caseDescribed(featureOfInterestList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.TOPOLOGY_ROOT: {
				TopologyRoot topologyRoot = (TopologyRoot)theEObject;
				T result = caseTopologyRoot(topologyRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.POSITIONED_RESULT: {
				PositionedResult positionedResult = (PositionedResult)theEObject;
				T result = casePositionedResult(positionedResult);
				if (result == null) result = caseAbstractResult(positionedResult);
				if (result == null) result = casePositioned(positionedResult);
				if (result == null) result = caseTimed(positionedResult);
				if (result == null) result = caseDescribed(positionedResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.OPERATION_CALL_POSITIONED_RESULT: {
				OperationCallPositionedResult operationCallPositionedResult = (OperationCallPositionedResult)theEObject;
				T result = caseOperationCallPositionedResult(operationCallPositionedResult);
				if (result == null) result = caseOperationCallResult(operationCallPositionedResult);
				if (result == null) result = casePositionedResult(operationCallPositionedResult);
				if (result == null) result = caseAbstractResult(operationCallPositionedResult);
				if (result == null) result = caseOperationCallContainer(operationCallPositionedResult);
				if (result == null) result = casePositioned(operationCallPositionedResult);
				if (result == null) result = caseTimed(operationCallPositionedResult);
				if (result == null) result = caseDescribed(operationCallPositionedResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.USER_DEFINED_RESULT: {
				UserDefinedResult userDefinedResult = (UserDefinedResult)theEObject;
				T result = caseUserDefinedResult(userDefinedResult);
				if (result == null) result = casePositionedResult(userDefinedResult);
				if (result == null) result = caseNamed(userDefinedResult);
				if (result == null) result = caseAbstractResult(userDefinedResult);
				if (result == null) result = casePositioned(userDefinedResult);
				if (result == null) result = caseTimed(userDefinedResult);
				if (result == null) result = caseDescribed(userDefinedResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.RESULT_NODE: {
				ResultNode resultNode = (ResultNode)theEObject;
				T result = caseResultNode(resultNode);
				if (result == null) result = caseAggregateGroupNode(resultNode);
				if (result == null) result = caseGroupNode(resultNode);
				if (result == null) result = caseNode(resultNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.RESULTS_LIST_NODE: {
				ResultsListNode resultsListNode = (ResultsListNode)theEObject;
				T result = caseResultsListNode(resultsListNode);
				if (result == null) result = caseAggregateGroupNode(resultsListNode);
				if (result == null) result = caseGroupNode(resultsListNode);
				if (result == null) result = caseNode(resultsListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.FEATURE_OF_INTEREST_NODE: {
				FeatureOfInterestNode featureOfInterestNode = (FeatureOfInterestNode)theEObject;
				T result = caseFeatureOfInterestNode(featureOfInterestNode);
				if (result == null) result = caseTransformNode(featureOfInterestNode);
				if (result == null) result = casePositionNode(featureOfInterestNode);
				if (result == null) result = caseRotationNode(featureOfInterestNode);
				if (result == null) result = caseAggregateGroupNode(featureOfInterestNode);
				if (result == null) result = caseGroupNode(featureOfInterestNode);
				if (result == null) result = caseNode(featureOfInterestNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.FEATURE_OF_INTEREST_LIST_NODE: {
				FeatureOfInterestListNode featureOfInterestListNode = (FeatureOfInterestListNode)theEObject;
				T result = caseFeatureOfInterestListNode(featureOfInterestListNode);
				if (result == null) result = caseAggregateGroupNode(featureOfInterestListNode);
				if (result == null) result = caseGroupNode(featureOfInterestListNode);
				if (result == null) result = caseNode(featureOfInterestListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CorePackage.UPDATABLE: {
				Updatable updatable = (Updatable)theEObject;
				T result = caseUpdatable(updatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Environment</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphonyEnvironment(SymphonyEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Topology</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphonyTopology(SymphonyTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony System</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphonySystem(SymphonySystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonySystemApiAdapter(SymphonySystemApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Points List</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Points List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointsList(ConnectionPointsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPoint(ConnectionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Link</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyLink(AssemblyLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assembly Links List</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assembly Links List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssemblyLinksList(AssemblyLinksList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePoseProvider(PoseProvider object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute Pose Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute Pose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsolutePoseProvider(AbsolutePoseProvider object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Corrector</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Corrector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePoseCorrector(PoseCorrector object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Initialization Data</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphonyInitializationData(SymphonyInitializationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Worksites List</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Worksites List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorksitesList(WorksitesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Worksite</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Worksite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWorksite(AbstractWorksite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orbit Models List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orbit Models List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbitModelsList(OrbitModelsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Orbit Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Orbit Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOrbitModel(AbstractOrbitModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositioned(Positioned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Root</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyRoot(TopologyRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Of Interest List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Of Interest List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOfInterestList(FeatureOfInterestList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Of Interest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOfInterest(FeatureOfInterest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioned Result</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionedResult(PositionedResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Positioned Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Positioned Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallPositionedResult(OperationCallPositionedResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedResult(UserDefinedResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Core Facade</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Core Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphonyCoreFacade(SymphonyCoreFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Node</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultNode(ResultNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results List Node</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results List Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsListNode(ResultsListNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Of Interest Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Of Interest Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOfInterestNode(FeatureOfInterestNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Of Interest List Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Of Interest List Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOfInterestListNode(FeatureOfInterestListNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Updatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatable(Updatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimed(Timed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractType(AbstractType object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeApiAdapter(TypeApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInitializationData(AbstractInitializationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInitializationData(InitializationData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Result</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResult(AbstractResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallContainer(OperationCallContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Result</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallResult(OperationCallResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Node</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionNode(PositionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationNode(RotationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformNode(TransformNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // Symphony__CoreSwitch
