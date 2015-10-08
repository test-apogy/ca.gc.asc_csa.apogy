/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall) <em>Exec</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall, boolean) <em>Exec</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCallsList) <em>Exec</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createAbstractResultValue(java.lang.Object) <em>Create Abstract Result Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode) <em>Resolve Watch</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Resolve Watch</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getValue(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode) <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.Variable) <em>Get Instance</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.Variable) <em>Get Instance Class</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeApiAdapter(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Type Api Adapter</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Instance</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeMemberInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Type Member Instance</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getEMFFeatureValue(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get EMF Feature Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Instance Class</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Get Instance</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.OperationCall) <em>Get Type Implementation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable, org.eclipse.symphony.core.invocator.AbstractType) <em>Get Type Implementation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable) <em>Get Type Implementation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberReferences(org.eclipse.symphony.core.invocator.TypeMember[]) <em>Create Type Member References</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Environment, java.lang.String) <em>Get Type Implementation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Get Fully Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode) <em>Get Fully Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberImplementations(org.eclipse.symphony.core.invocator.Type) <em>Create Type Member Implementations</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#initVariableInstances(org.eclipse.symphony.core.invocator.Environment) <em>Init Variable Instances</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#disposeVariableInstances(org.eclipse.symphony.core.invocator.Environment) <em>Dispose Variable Instances</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getOperationCallContainer(org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement) <em>Get Operation Call Container</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Environment) <em>Apply Initialization Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Environment) <em>Collect Initialization Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Variable) <em>Apply Initialization Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Variable) <em>Collect Initialization Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#loadRegisteredTypes(org.eclipse.symphony.core.invocator.InvocatorSession) <em>Load Registered Types</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getAllTypes(org.eclipse.symphony.core.invocator.Environment) <em>Get All Types</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EMFEcoreInvocatorFacadeTest extends TestCase {

	/**
	 * The fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFEcoreInvocatorFacade fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EMFEcoreInvocatorFacadeTest.class);
	}

	/**
	 * Constructs a new Facade test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreInvocatorFacadeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EMFEcoreInvocatorFacade fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFEcoreInvocatorFacade getFixture() {
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
		setFixture(EMFEcoreInvocatorFactory.eINSTANCE.createEMFEcoreInvocatorFacade());
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
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall)
	 * @generated
	 */
	public void testExec__OperationCall() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall, boolean) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCall, boolean)
	 * @generated
	 */
	public void testExec__OperationCall_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCallsList) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#exec(org.eclipse.symphony.core.invocator.OperationCallsList)
	 * @generated
	 */
	public void testExec__OperationCallsList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createAbstractResultValue(java.lang.Object) <em>Create Abstract Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createAbstractResultValue(java.lang.Object)
	 * @generated
	 */
	public void testCreateAbstractResultValue__Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode) <em>Resolve Watch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode)
	 * @generated
	 */
	public void testResolveWatch__AbstractFeatureNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Resolve Watch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#resolveWatch(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
	public void testResolveWatch__TypeMemberReferenceTreeElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getValue(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode) <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getValue(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode)
	 * @generated
	 */
	public void testGetValue__AbstractFeatureNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.Variable) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
	public void testGetInstance__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.Variable) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
	public void testGetInstanceClass__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeApiAdapter(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Type Api Adapter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeApiAdapter(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetTypeApiAdapter__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetInstance__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeMemberInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Type Member Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeMemberInstance(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetTypeMemberInstance__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getEMFFeatureValue(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get EMF Feature Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getEMFFeatureValue(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetEMFFeatureValue__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.VariableFeatureReference) <em>Get Instance Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstanceClass(org.eclipse.symphony.core.invocator.VariableFeatureReference)
	 * @generated
	 */
	public void testGetInstanceClass__VariableFeatureReference() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getInstance(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
	public void testGetInstance__TypeMemberReferenceTreeElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.OperationCall) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.OperationCall)
	 * @generated
	 */
	public void testGetTypeImplementation__OperationCall() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable, org.eclipse.symphony.core.invocator.AbstractType) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable, org.eclipse.symphony.core.invocator.AbstractType)
	 * @generated
	 */
	public void testGetTypeImplementation__Variable_AbstractType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
	public void testGetTypeImplementation__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberReferences(org.eclipse.symphony.core.invocator.TypeMember[]) <em>Create Type Member References</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberReferences(org.eclipse.symphony.core.invocator.TypeMember[])
	 * @generated
	 */
	public void testCreateTypeMemberReferences__TypeMember() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Environment, java.lang.String) <em>Get Type Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getTypeImplementation(org.eclipse.symphony.core.invocator.Environment, java.lang.String)
	 * @generated
	 */
	public void testGetTypeImplementation__Environment_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement)
	 * @generated
	 */
	public void testGetFullyQualifiedName__TypeMemberReferenceTreeElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode) <em>Get Fully Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getFullyQualifiedName(ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode)
	 * @generated
	 */
	public void testGetFullyQualifiedName__AbstractFeatureNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberImplementations(org.eclipse.symphony.core.invocator.Type) <em>Create Type Member Implementations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#createTypeMemberImplementations(org.eclipse.symphony.core.invocator.Type)
	 * @generated
	 */
	public void testCreateTypeMemberImplementations__Type() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#initVariableInstances(org.eclipse.symphony.core.invocator.Environment) <em>Init Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#initVariableInstances(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testInitVariableInstances__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#disposeVariableInstances(org.eclipse.symphony.core.invocator.Environment) <em>Dispose Variable Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#disposeVariableInstances(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testDisposeVariableInstances__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getOperationCallContainer(org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement) <em>Get Operation Call Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getOperationCallContainer(org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement)
	 * @generated
	 */
	public void testGetOperationCallContainer__TypeMemberReferenceListElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Environment) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testApplyInitializationData__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Environment) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testCollectInitializationData__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Variable) <em>Apply Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#applyInitializationData(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
	public void testApplyInitializationData__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Variable) <em>Collect Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#collectInitializationData(org.eclipse.symphony.core.invocator.Variable)
	 * @generated
	 */
	public void testCollectInitializationData__Variable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#loadRegisteredTypes(org.eclipse.symphony.core.invocator.InvocatorSession) <em>Load Registered Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#loadRegisteredTypes(org.eclipse.symphony.core.invocator.InvocatorSession)
	 * @generated
	 */
	public void testLoadRegisteredTypes__InvocatorSession() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getAllTypes(org.eclipse.symphony.core.invocator.Environment) <em>Get All Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getAllTypes(org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetAllTypes__Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //EMFEcoreInvocatorFacadeTest
