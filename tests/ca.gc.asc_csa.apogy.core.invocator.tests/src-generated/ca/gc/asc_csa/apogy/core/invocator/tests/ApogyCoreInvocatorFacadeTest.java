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

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Exec</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall, boolean) <em>Exec</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCallsList) <em>Exec</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createAbstractResultValue(java.lang.Object) <em>Create Abstract Result Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Resolve Watch</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement) <em>Resolve Watch</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getValue(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Instance Class</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeApiAdapter(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Type Api Adapter</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeMemberInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Type Member Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getEMFFeatureValue(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get EMF Feature Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Instance Class</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement) <em>Get Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Get Type Implementation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable, ca.gc.asc_csa.apogy.core.invocator.AbstractType) <em>Get Type Implementation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Type Implementation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberReferences(ca.gc.asc_csa.apogy.core.invocator.TypeMember[]) <em>Create Type Member References</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Environment, java.lang.String) <em>Get Type Implementation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement) <em>Get Fully Qualified Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Fully Qualified Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberImplementations(ca.gc.asc_csa.apogy.core.invocator.Type) <em>Create Type Member Implementations</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#initVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Init Variable Instances</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#disposeVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Dispose Variable Instances</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getOperationCallContainer(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement) <em>Get Operation Call Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Apply Initialization Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Collect Initialization Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Apply Initialization Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Collect Initialization Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#loadRegisteredTypes(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession) <em>Load Registered Types</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getAllTypes(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get All Types</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ApogyCoreInvocatorFacadeTest extends TestCase {

	/**
	 * The fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreInvocatorFacade fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApogyCoreInvocatorFacadeTest.class);
	}

	/**
	 * Constructs a new Facade test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorFacadeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApogyCoreInvocatorFacade fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreInvocatorFacade getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCoreInvocatorFactory.eINSTANCE.createApogyCoreInvocatorFacade());
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

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	public void testExec__OperationCall() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall, boolean) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall, boolean)
	 * @generated
	 */
	public void testExec__OperationCall_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCallsList) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCallsList)
	 * @generated
	 */
	public void testExec__OperationCallsList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createAbstractResultValue(java.lang.Object) <em>Create Abstract Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createAbstractResultValue(java.lang.Object)
	 * @generated
	 */
	public void testCreateAbstractResultValue__Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Resolve Watch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	public void testResolveWatch__AbstractFeatureNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement) <em>Resolve Watch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
	public void testResolveWatch__TypeMemberReferenceTreeElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getValue(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getValue(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	public void testGetValue__AbstractFeatureNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	public void testGetInstance__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	public void testGetInstanceClass__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeApiAdapter(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Type Api Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeApiAdapter(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetTypeApiAdapter__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetInstance__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeMemberInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Type Member Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeMemberInstance(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetTypeMemberInstance__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getEMFFeatureValue(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get EMF Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getEMFFeatureValue(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetEMFFeatureValue__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstanceClass(ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetInstanceClass__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInstance(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
	public void testGetInstance__TypeMemberReferenceTreeElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	public void testGetTypeImplementation__OperationCall() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable, ca.gc.asc_csa.apogy.core.invocator.AbstractType) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable, ca.gc.asc_csa.apogy.core.invocator.AbstractType)
	 * @generated
	 */
	public void testGetTypeImplementation__Variable_AbstractType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	public void testGetTypeImplementation__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberReferences(ca.gc.asc_csa.apogy.core.invocator.TypeMember[]) <em>Create Type Member References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberReferences(ca.gc.asc_csa.apogy.core.invocator.TypeMember[])
	 * @generated
	 */
	public void testCreateTypeMemberReferences__TypeMember() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Environment, java.lang.String) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getTypeImplementation(ca.gc.asc_csa.apogy.core.invocator.Environment, java.lang.String)
	 * @generated
	 */
	public void testGetTypeImplementation__Environment_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
	public void testGetFullyQualifiedName__TypeMemberReferenceTreeElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	public void testGetFullyQualifiedName__AbstractFeatureNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberImplementations(ca.gc.asc_csa.apogy.core.invocator.Type) <em>Create Type Member Implementations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#createTypeMemberImplementations(ca.gc.asc_csa.apogy.core.invocator.Type)
	 * @generated
	 */
	public void testCreateTypeMemberImplementations__Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#initVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Init Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#initVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testInitVariableInstances__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#disposeVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Dispose Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#disposeVariableInstances(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testDisposeVariableInstances__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getOperationCallContainer(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement) <em>Get Operation Call Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getOperationCallContainer(ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement)
	 * @generated
	 */
	public void testGetOperationCallContainer__TypeMemberReferenceListElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testApplyInitializationData__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testCollectInitializationData__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#applyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	public void testApplyInitializationData__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#collectInitializationData(ca.gc.asc_csa.apogy.core.invocator.Variable)
	 * @generated
	 */
	public void testCollectInitializationData__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#loadRegisteredTypes(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession) <em>Load Registered Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#loadRegisteredTypes(ca.gc.asc_csa.apogy.core.invocator.InvocatorSession)
	 * @generated
	 */
	public void testLoadRegisteredTypes__InvocatorSession() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getAllTypes(ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get All Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getAllTypes(ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetAllTypes__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ApogyCoreInvocatorFacadeTest
