/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.invocator.AttributeResultValue;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Result Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeResultValueTest extends AbstractResultValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeResultValueTest.class);
	}

	/**
	 * Constructs a new Attribute Result Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeResultValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Result Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeResultValue getFixture() {
		return (AttributeResultValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EMFEcoreInvocatorFactory.eINSTANCE.createAttributeResultValue());
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

} //AttributeResultValueTest
