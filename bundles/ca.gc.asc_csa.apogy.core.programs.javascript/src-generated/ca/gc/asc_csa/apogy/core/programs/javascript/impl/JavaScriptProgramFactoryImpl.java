/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.javascript.impl;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.impl.ProgramFactoryImpl;

import ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgramFactory;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Script Program Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaScriptProgramFactoryImpl extends ProgramFactoryImpl implements JavaScriptProgramFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptProgramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreJavaScriptProgramsPackage.Literals.JAVA_SCRIPT_PROGRAM_FACTORY;
	}

	/**
	 * @generated_NOT
	 */
	@Override
	public Program createProgram() {
		return ApogyCoreInvocatorFactory.eINSTANCE.createOperationCallsList();
	}

} //JavaScriptProgramFactoryImpl
