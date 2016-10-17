package ca.gc.asc_csa.apogy.core.invocator.tests;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>invocator</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreInvocatorTests extends TestSuite {

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
		TestSuite suite = new ApogyCoreInvocatorTests("invocator Tests");
		suite.addTestSuite(ApogyCoreInvocatorFacadeTest.class);
		suite.addTestSuite(DataProductsListTest.class);
		suite.addTestSuite(RegisteredTypesListTest.class);
		suite.addTestSuite(TypeApiAdapterTest.class);
		suite.addTestSuite(TypeMemberReferenceListElementTest.class);
		suite.addTestSuite(TypeMemberReferenceTreeElementTest.class);
		suite.addTestSuite(VariableTest.class);
		suite.addTestSuite(ContextTest.class);
		suite.addTestSuite(VariableImplementationsListTest.class);
		suite.addTestSuite(VariableImplementationTest.class);
		suite.addTestSuite(TypeMemberImplementationTest.class);
		suite.addTestSuite(OperationCallsListTest.class);
		suite.addTestSuite(OperationCallTest.class);
		suite.addTestSuite(ArgumentsListTest.class);
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
	public ApogyCoreInvocatorTests(String name) {
		super(name);
	}

} //ApogyCoreInvocatorTests
