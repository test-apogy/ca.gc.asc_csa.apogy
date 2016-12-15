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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.Positioned;
import ca.gc.asc_csa.apogy.core.PositionedResult;
import ca.gc.asc_csa.apogy.core.ResultNode;
import ca.gc.asc_csa.apogy.core.ResultsListNode;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.UserDefinedResult;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ApogyCoreFactoryImpl extends EFactoryImpl implements
		ApogyCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreFactory init() {
		try {
			ApogyCoreFactory theApogyCoreFactory = (ApogyCoreFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCorePackage.eNS_URI);
			if (theApogyCoreFactory != null) {
				return theApogyCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ApogyCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyCorePackage.APOGY_CORE_FACADE: return createApogyCoreFacade();
			case ApogyCorePackage.APOGY_TOPOLOGY: return createApogyTopology();
			case ApogyCorePackage.APOGY_SYSTEM: return createApogySystem();
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER: return createApogySystemApiAdapter();
			case ApogyCorePackage.CONNECTION_POINTS_LIST: return createConnectionPointsList();
			case ApogyCorePackage.CONNECTION_POINT: return createConnectionPoint();
			case ApogyCorePackage.ASSEMBLY_LINK: return createAssemblyLink();
			case ApogyCorePackage.ASSEMBLY_LINKS_LIST: return createAssemblyLinksList();
			case ApogyCorePackage.POSE_PROVIDER: return createPoseProvider();
			case ApogyCorePackage.ABSOLUTE_POSE_PROVIDER: return createAbsolutePoseProvider();
			case ApogyCorePackage.APOGY_INITIALIZATION_DATA: return createApogyInitializationData();
			case ApogyCorePackage.POSITIONED: return createPositioned();
			case ApogyCorePackage.FEATURE_OF_INTEREST: return createFeatureOfInterest();
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST: return createFeatureOfInterestList();
			case ApogyCorePackage.TOPOLOGY_ROOT: return createTopologyRoot();
			case ApogyCorePackage.POSITIONED_RESULT: return createPositionedResult();
			case ApogyCorePackage.OPERATION_CALL_POSITIONED_RESULT: return createOperationCallPositionedResult();
			case ApogyCorePackage.USER_DEFINED_RESULT: return createUserDefinedResult();
			case ApogyCorePackage.RESULT_NODE: return createResultNode();
			case ApogyCorePackage.RESULTS_LIST_NODE: return createResultsListNode();
			case ApogyCorePackage.FEATURE_OF_INTEREST_NODE: return createFeatureOfInterestNode();
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE: return createFeatureOfInterestListNode();
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
			case ApogyCorePackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case ApogyCorePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCorePackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case ApogyCorePackage.EXCEPTION:
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
			case ApogyCorePackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case ApogyCorePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCorePackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case ApogyCorePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreFacade createApogyCoreFacade() {
		ApogyCoreFacadeImpl apogyCoreFacade = new ApogyCoreFacadeImpl();
		return apogyCoreFacade;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyTopology createApogyTopology() {
		ApogyTopologyImpl apogyTopology = new ApogyTopologyImpl();
		return apogyTopology;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySystem createApogySystem() {
		ApogySystemImpl apogySystem = new ApogySystemImpl();
		return apogySystem;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogySystemApiAdapter createApogySystemApiAdapter()
  {
		ApogySystemApiAdapterImpl apogySystemApiAdapter = new ApogySystemApiAdapterImpl();
		return apogySystemApiAdapter;
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
	public ApogyInitializationData createApogyInitializationData() {
		ApogyInitializationDataImpl apogyInitializationData = new ApogyInitializationDataImpl();
		return apogyInitializationData;
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
	public ApogyCorePackage getApogyCorePackage() {
		return (ApogyCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCorePackage getPackage() {
		return ApogyCorePackage.eINSTANCE;
	}

} // ApogyCoreFactoryImpl
