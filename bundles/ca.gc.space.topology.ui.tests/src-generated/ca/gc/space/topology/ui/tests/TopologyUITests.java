/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ui</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyUITests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TopologyUITests("ui Tests");
		suite.addTestSuite(TopologyPresentationRegistryTest.class);
		suite.addTestSuite(GraphicsContextTest.class);
		suite.addTestSuite(TopologyPresentationSetTest.class);
		suite.addTestSuite(NodePresentationTest.class);
		suite.addTestSuite(TransformNodePresentationTest.class);
		suite.addTestSuite(RotationNodePresentationTest.class);
		suite.addTestSuite(PositionNodePresentationTest.class);
		suite.addTestSuite(URLNodePresentationTest.class);
		suite.addTestSuite(TopologyUIFacadeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyUITests(String name) {
		super(name);
	}

} //TopologyUITests
