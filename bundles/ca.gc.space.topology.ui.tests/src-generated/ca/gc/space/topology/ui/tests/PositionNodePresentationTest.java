/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.topology.ui.tests;

import ca.gc.space.topology.ui.PositionNodePresentation;
import ca.gc.space.topology.ui.TopologyUIFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Position Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PositionNodePresentationTest extends NodePresentationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PositionNodePresentationTest.class);
	}

	/**
	 * Constructs a new Position Node Presentation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionNodePresentationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Position Node Presentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PositionNodePresentation getFixture() {
		return (PositionNodePresentation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TopologyUIFactory.eINSTANCE.createPositionNodePresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PositionNodePresentationTest
