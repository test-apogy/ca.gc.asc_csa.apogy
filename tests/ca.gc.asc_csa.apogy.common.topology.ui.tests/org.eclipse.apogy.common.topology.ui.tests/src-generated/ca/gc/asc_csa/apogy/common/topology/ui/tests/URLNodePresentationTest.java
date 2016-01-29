/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui.tests;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>URL Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class URLNodePresentationTest extends NodePresentationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(URLNodePresentationTest.class);
	}

	/**
	 * Constructs a new URL Node Presentation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNodePresentationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this URL Node Presentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected URLNodePresentation getFixture() {
		return (URLNodePresentation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonTopologyUIFactory.eINSTANCE.createURLNodePresentation());
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

} //URLNodePresentationTest