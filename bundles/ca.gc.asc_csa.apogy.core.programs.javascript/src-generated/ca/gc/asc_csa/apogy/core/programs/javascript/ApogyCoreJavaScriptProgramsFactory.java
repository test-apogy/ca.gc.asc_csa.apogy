/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.javascript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage
 * @generated
 */
public interface ApogyCoreJavaScriptProgramsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreJavaScriptProgramsFactory eINSTANCE = ca.gc.asc_csa.apogy.core.programs.javascript.impl.ApogyCoreJavaScriptProgramsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Script Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script Program</em>'.
	 * @generated
	 */
	JavaScriptProgram createJavaScriptProgram();

	/**
	 * Returns a new object of class '<em>Java Script Program Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Script Program Factory</em>'.
	 * @generated
	 */
	JavaScriptProgramFactory createJavaScriptProgramFactory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreJavaScriptProgramsPackage getApogyCoreJavaScriptProgramsPackage();

} //ApogyCoreJavaScriptProgramsFactory
