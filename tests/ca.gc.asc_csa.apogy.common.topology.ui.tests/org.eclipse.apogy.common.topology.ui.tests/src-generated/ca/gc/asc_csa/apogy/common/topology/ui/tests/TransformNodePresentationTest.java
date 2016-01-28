/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.tests;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transform Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformNodePresentationTest extends NodePresentationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransformNodePresentationTest.class);
	}

	/**
	 * Constructs a new Transform Node Presentation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformNodePresentationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transform Node Presentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransformNodePresentation getFixture() {
		return (TransformNodePresentation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonTopologyUIFactory.eINSTANCE.createTransformNodePresentation());
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

} //TransformNodePresentationTest
