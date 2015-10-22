/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.WatchesListsContainer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Watches Lists Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WatchesListsContainerTest extends AbstractToolsListContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WatchesListsContainerTest.class);
	}

	/**
	 * Constructs a new Watches Lists Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WatchesListsContainerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Watches Lists Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WatchesListsContainer getFixture() {
		return (WatchesListsContainer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EMFEcoreInvocatorFactory.eINSTANCE.createWatchesListsContainer());
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

} //WatchesListsContainerTest
