/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage
 * @generated
 */
public interface ApogyCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	ApogyCoreFactory eINSTANCE = ca.gc.asc_csa.apogy.core.impl.ApogyCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreFacade createApogyCoreFacade();

	/**
	 * Returns a new object of class '<em>Apogy Environment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Apogy Environment</em>'.
	 * @generated
	 */
	ApogyEnvironment createApogyEnvironment();

	/**
	 * Returns a new object of class '<em>Time Sources List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Sources List</em>'.
	 * @generated
	 */
	TimeSourcesList createTimeSourcesList();

	/**
	 * Returns a new object of class '<em>Apogy Topology</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Apogy Topology</em>'.
	 * @generated
	 */
	ApogyTopology createApogyTopology();

	/**
	 * Returns a new object of class '<em>Apogy System</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Apogy System</em>'.
	 * @generated
	 */
	ApogySystem createApogySystem();

	/**
	 * Returns a new object of class '<em>Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy System Api Adapter</em>'.
	 * @generated
	 */
  ApogySystemApiAdapter createApogySystemApiAdapter();

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
	 * Returns a new object of class '<em>Apogy Initialization Data</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Initialization Data</em>'.
	 * @generated
	 */
	ApogyInitializationData createApogyInitializationData();

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
	ApogyCorePackage getApogyCorePackage();

} // ApogyCoreFactory
