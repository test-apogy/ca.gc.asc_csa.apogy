/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.jme3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3Package
 * @generated
 */
public interface JME3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JME3Factory eINSTANCE = org.eclipse.symphony.common.topology.ui.jme3.impl.JME3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Factory</em>'.
	 * @generated
	 */
	JME3TypeFactory createJME3TypeFactory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JME3Package getJME3Package();

} //JME3Factory
