package ca.gc.asc_csa.apogy.core.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.AbsolutePoseProvider;
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
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyInitializationData;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.Updatable;
import ca.gc.asc_csa.apogy.core.UserDefinedResult;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.AbstractType;
import ca.gc.asc_csa.apogy.core.invocator.InitializationData;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage
 * @generated
 */
public class ApogyCoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ApogyCoreSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCorePackage.eINSTANCE;
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
			case ApogyCorePackage.APOGY_CORE_FACADE: {
				ApogyCoreFacade apogyCoreFacade = (ApogyCoreFacade)theEObject;
				T result = caseApogyCoreFacade(apogyCoreFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.APOGY_TOPOLOGY: {
				ApogyTopology apogyTopology = (ApogyTopology)theEObject;
				T result = caseApogyTopology(apogyTopology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.APOGY_SYSTEM: {
				ApogySystem apogySystem = (ApogySystem)theEObject;
				T result = caseApogySystem(apogySystem);
				if (result == null) result = caseType(apogySystem);
				if (result == null) result = caseNamed(apogySystem);
				if (result == null) result = caseAbstractType(apogySystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER: {
				ApogySystemApiAdapter apogySystemApiAdapter = (ApogySystemApiAdapter)theEObject;
				T result = caseApogySystemApiAdapter(apogySystemApiAdapter);
				if (result == null) result = caseTypeApiAdapter(apogySystemApiAdapter);
				if (result == null) result = casePoseProvider(apogySystemApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.CONNECTION_POINTS_LIST: {
				ConnectionPointsList connectionPointsList = (ConnectionPointsList)theEObject;
				T result = caseConnectionPointsList(connectionPointsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.CONNECTION_POINT: {
				ConnectionPoint connectionPoint = (ConnectionPoint)theEObject;
				T result = caseConnectionPoint(connectionPoint);
				if (result == null) result = caseNamed(connectionPoint);
				if (result == null) result = caseDescribed(connectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.ASSEMBLY_LINK: {
				AssemblyLink assemblyLink = (AssemblyLink)theEObject;
				T result = caseAssemblyLink(assemblyLink);
				if (result == null) result = caseNamed(assemblyLink);
				if (result == null) result = caseDescribed(assemblyLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.ASSEMBLY_LINKS_LIST: {
				AssemblyLinksList assemblyLinksList = (AssemblyLinksList)theEObject;
				T result = caseAssemblyLinksList(assemblyLinksList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.POSE_PROVIDER: {
				PoseProvider poseProvider = (PoseProvider)theEObject;
				T result = casePoseProvider(poseProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.ABSOLUTE_POSE_PROVIDER: {
				AbsolutePoseProvider absolutePoseProvider = (AbsolutePoseProvider)theEObject;
				T result = caseAbsolutePoseProvider(absolutePoseProvider);
				if (result == null) result = casePoseProvider(absolutePoseProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.POSE_CORRECTOR: {
				PoseCorrector poseCorrector = (PoseCorrector)theEObject;
				T result = casePoseCorrector(poseCorrector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.APOGY_INITIALIZATION_DATA: {
				ApogyInitializationData apogyInitializationData = (ApogyInitializationData)theEObject;
				T result = caseApogyInitializationData(apogyInitializationData);
				if (result == null) result = caseInitializationData(apogyInitializationData);
				if (result == null) result = caseAbstractInitializationData(apogyInitializationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.POSITIONED: {
				Positioned positioned = (Positioned)theEObject;
				T result = casePositioned(positioned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.FEATURE_OF_INTEREST: {
				FeatureOfInterest featureOfInterest = (FeatureOfInterest)theEObject;
				T result = caseFeatureOfInterest(featureOfInterest);
				if (result == null) result = casePositioned(featureOfInterest);
				if (result == null) result = caseNamed(featureOfInterest);
				if (result == null) result = caseDescribed(featureOfInterest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST: {
				FeatureOfInterestList featureOfInterestList = (FeatureOfInterestList)theEObject;
				T result = caseFeatureOfInterestList(featureOfInterestList);
				if (result == null) result = caseNamed(featureOfInterestList);
				if (result == null) result = caseDescribed(featureOfInterestList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.TOPOLOGY_ROOT: {
				TopologyRoot topologyRoot = (TopologyRoot)theEObject;
				T result = caseTopologyRoot(topologyRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.POSITIONED_RESULT: {
				PositionedResult positionedResult = (PositionedResult)theEObject;
				T result = casePositionedResult(positionedResult);
				if (result == null) result = caseAbstractResult(positionedResult);
				if (result == null) result = casePositioned(positionedResult);
				if (result == null) result = caseTimed(positionedResult);
				if (result == null) result = caseDescribed(positionedResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT: {
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
			case ApogyCorePackage.USER_DEFINED_RESULT: {
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
			case ApogyCorePackage.RESULT_NODE: {
				ResultNode resultNode = (ResultNode)theEObject;
				T result = caseResultNode(resultNode);
				if (result == null) result = caseAggregateGroupNode(resultNode);
				if (result == null) result = caseGroupNode(resultNode);
				if (result == null) result = caseNode(resultNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.RESULTS_LIST_NODE: {
				ResultsListNode resultsListNode = (ResultsListNode)theEObject;
				T result = caseResultsListNode(resultsListNode);
				if (result == null) result = caseAggregateGroupNode(resultsListNode);
				if (result == null) result = caseGroupNode(resultsListNode);
				if (result == null) result = caseNode(resultsListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.FEATURE_OF_INTEREST_NODE: {
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
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE: {
				FeatureOfInterestListNode featureOfInterestListNode = (FeatureOfInterestListNode)theEObject;
				T result = caseFeatureOfInterestListNode(featureOfInterestListNode);
				if (result == null) result = caseAggregateGroupNode(featureOfInterestListNode);
				if (result == null) result = caseGroupNode(featureOfInterestListNode);
				if (result == null) result = caseNode(featureOfInterestListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCorePackage.UPDATABLE: {
				Updatable updatable = (Updatable)theEObject;
				T result = caseUpdatable(updatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyCoreFacade(ApogyCoreFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apogy Topology</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyTopology(ApogyTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apogy System</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogySystem(ApogySystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseApogySystemApiAdapter(ApogySystemApiAdapter object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Apogy Initialization Data</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyInitializationData(ApogyInitializationData object) {
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

} // ApogyCoreSwitch
