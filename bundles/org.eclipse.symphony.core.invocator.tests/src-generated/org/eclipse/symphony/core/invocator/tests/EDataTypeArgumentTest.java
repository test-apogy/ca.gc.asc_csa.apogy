/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.invocator.EDataTypeArgument;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EData Type Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDataTypeArgumentTest extends ArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EDataTypeArgumentTest.class);
	}

	/**
	 * Constructs a new EData Type Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataTypeArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EData Type Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EDataTypeArgument getFixture() {
		return (EDataTypeArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EMFEcoreInvocatorFactory.eINSTANCE.createEDataTypeArgument());
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

} //EDataTypeArgumentTest
