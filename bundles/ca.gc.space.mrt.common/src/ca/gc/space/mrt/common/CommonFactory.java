/**
 * Canadian Space Agency 2008.
 *
 * $Id: CommonFactory.java,v 1.4.4.2 2015/05/21 15:50:23 pallard Exp $
 */
package ca.gc.space.mrt.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFactory eINSTANCE = ca.gc.space.mrt.common.impl.CommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Tagged Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Tagged Element</em>'.
	 * @generated
	 */
	TimeTaggedElement createTimeTaggedElement();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Startable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Startable</em>'.
	 * @generated
	 */
	Startable createStartable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonPackage getCommonPackage();

} //CommonFactory
