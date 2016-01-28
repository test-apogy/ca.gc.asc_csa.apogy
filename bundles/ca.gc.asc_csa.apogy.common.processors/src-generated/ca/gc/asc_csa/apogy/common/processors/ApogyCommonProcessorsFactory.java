/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.processors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage
 * @generated
 */
public interface ApogyCommonProcessorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonProcessorsFactory eINSTANCE = ca.gc.asc_csa.apogy.common.processors.impl.ApogyCommonProcessorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processors Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processors Chain</em>'.
	 * @generated
	 */
	<I, O> ProcessorsChain<I, O> createProcessorsChain();

	/**
	 * Returns a new object of class '<em>Job Processors Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Processors Chain</em>'.
	 * @generated
	 */
	<I, O> JobProcessorsChain<I, O> createJobProcessorsChain();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonProcessorsPackage getApogyCommonProcessorsPackage();

} //ApogyCommonProcessorsFactory
