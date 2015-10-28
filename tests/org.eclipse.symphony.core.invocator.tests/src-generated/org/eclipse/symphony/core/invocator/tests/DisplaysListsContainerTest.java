/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import org.eclipse.symphony.core.invocator.DisplaysListsContainer;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Displays Lists Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisplaysListsContainerTest extends AbstractToolsListContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisplaysListsContainerTest.class);
	}

	/**
	 * Constructs a new Displays Lists Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplaysListsContainerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Displays Lists Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DisplaysListsContainer getFixture() {
		return (DisplaysListsContainer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreInvocatorFactory.eINSTANCE.createDisplaysListsContainer());
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

} //DisplaysListsContainerTest
