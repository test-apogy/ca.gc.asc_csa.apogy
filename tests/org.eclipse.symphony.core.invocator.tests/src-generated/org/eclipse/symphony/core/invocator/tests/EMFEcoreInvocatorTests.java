/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>invocator</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorTests extends TestSuite {

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
		TestSuite suite = new EMFEcoreInvocatorTests("invocator Tests");
		suite.addTestSuite(EMFEcoreInvocatorFacadeTest.class);
		suite.addTestSuite(DataProductsListTest.class);
		suite.addTestSuite(RegisteredTypesListTest.class);
		suite.addTestSuite(TypeApiAdapterTest.class);
		suite.addTestSuite(TypeMemberReferenceListElementTest.class);
		suite.addTestSuite(TypeMemberReferenceTreeElementTest.class);
		suite.addTestSuite(VariableTest.class);
		suite.addTestSuite(BasicContextTest.class);
		suite.addTestSuite(VariableImplementationsListTest.class);
		suite.addTestSuite(VariableImplementationTest.class);
		suite.addTestSuite(TypeMemberImplementationTest.class);
		suite.addTestSuite(OperationCallsListTest.class);
		suite.addTestSuite(OperationCallTest.class);
		suite.addTestSuite(ArgumentsListTest.class);
		suite.addTestSuite(EDataTypeArgumentTest.class);
		suite.addTestSuite(EEnumArgumentTest.class);
		suite.addTestSuite(EClassArgumentTest.class);
		suite.addTestSuite(OperationCallResultsListTest.class);
		suite.addTestSuite(RecordingResultsListTest.class);
		suite.addTestSuite(OperationCallResultTest.class);
		suite.addTestSuite(OperationCallResultsListTimeSourceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreInvocatorTests(String name) {
		super(name);
	}

} //EMFEcoreInvocatorTests
