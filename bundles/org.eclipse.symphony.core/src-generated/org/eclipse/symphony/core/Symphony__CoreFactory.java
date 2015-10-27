/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.Symphony__CorePackage
 * @generated
 */
public interface Symphony__CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	Symphony__CoreFactory eINSTANCE = org.eclipse.symphony.core.impl.Symphony__CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__CoreFacade createSymphony__CoreFacade();

	/**
	 * Returns a new object of class '<em>Symphony Environment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Symphony Environment</em>'.
	 * @generated
	 */
	SymphonyEnvironment createSymphonyEnvironment();

	/**
	 * Returns a new object of class '<em>Symphony Topology</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Symphony Topology</em>'.
	 * @generated
	 */
	SymphonyTopology createSymphonyTopology();

	/**
	 * Returns a new object of class '<em>Symphony System</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Symphony System</em>'.
	 * @generated
	 */
	SymphonySystem createSymphonySystem();

	/**
	 * Returns a new object of class '<em>Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symphony System Api Adapter</em>'.
	 * @generated
	 */
  SymphonySystemApiAdapter createSymphonySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Connection Points List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Connection Points List</em>'.
	 * @generated
	 */
	ConnectionPointsList createConnectionPointsList();

	/**
	 * Returns a new object of class '<em>Connection Point</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Connection Point</em>'.
	 * @generated
	 */
	ConnectionPoint createConnectionPoint();

	/**
	 * Returns a new object of class '<em>Assembly Link</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assembly Link</em>'.
	 * @generated
	 */
	AssemblyLink createAssemblyLink();

	/**
	 * Returns a new object of class '<em>Assembly Links List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Assembly Links List</em>'.
	 * @generated
	 */
	AssemblyLinksList createAssemblyLinksList();

	/**
	 * Returns a new object of class '<em>Pose Provider</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pose Provider</em>'.
	 * @generated
	 */
  PoseProvider createPoseProvider();

  /**
	 * Returns a new object of class '<em>Absolute Pose Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Pose Provider</em>'.
	 * @generated
	 */
	AbsolutePoseProvider createAbsolutePoseProvider();

		/**
	 * Returns a new object of class '<em>Symphony Initialization Data</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Symphony Initialization Data</em>'.
	 * @generated
	 */
	SymphonyInitializationData createSymphonyInitializationData();

	/**
	 * Returns a new object of class '<em>Worksites List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Worksites List</em>'.
	 * @generated
	 */
	WorksitesList createWorksitesList();

	/**
	 * Returns a new object of class '<em>Orbit Models List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbit Models List</em>'.
	 * @generated
	 */
	OrbitModelsList createOrbitModelsList();

	/**
	 * Returns a new object of class '<em>Positioned</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Positioned</em>'.
	 * @generated
	 */
	Positioned createPositioned();

	/**
	 * Returns a new object of class '<em>Topology Root</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Topology Root</em>'.
	 * @generated
	 */
	TopologyRoot createTopologyRoot();

	/**
	 * Returns a new object of class '<em>Feature Of Interest List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Of Interest List</em>'.
	 * @generated
	 */
	FeatureOfInterestList createFeatureOfInterestList();

	/**
	 * Returns a new object of class '<em>Feature Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Of Interest</em>'.
	 * @generated
	 */
	FeatureOfInterest createFeatureOfInterest();

	/**
	 * Returns a new object of class '<em>Positioned Result</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Positioned Result</em>'.
	 * @generated
	 */
	PositionedResult createPositionedResult();

	/**
	 * Returns a new object of class '<em>Operation Call Positioned Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call Positioned Result</em>'.
	 * @generated
	 */
	OperationCallPositionedResult createOperationCallPositionedResult();

	/**
	 * Returns a new object of class '<em>User Defined Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Result</em>'.
	 * @generated
	 */
	UserDefinedResult createUserDefinedResult();

	/**
	 * Returns a new object of class '<em>Result Node</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Node</em>'.
	 * @generated
	 */
	ResultNode createResultNode();

	/**
	 * Returns a new object of class '<em>Results List Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Results List Node</em>'.
	 * @generated
	 */
	ResultsListNode createResultsListNode();

	/**
	 * Returns a new object of class '<em>Feature Of Interest Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Of Interest Node</em>'.
	 * @generated
	 */
	FeatureOfInterestNode createFeatureOfInterestNode();

	/**
	 * Returns a new object of class '<em>Feature Of Interest List Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Of Interest List Node</em>'.
	 * @generated
	 */
	FeatureOfInterestListNode createFeatureOfInterestListNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CorePackage getSymphony__CorePackage();

} // Symphony__CoreFactory
