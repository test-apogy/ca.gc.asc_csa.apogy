/**
 * Canadian Space Agency 2007.
 *
 * $Id: MobilityFactory.java,v 1.2.4.2 2015/05/21 15:51:26 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.MobilityPackage
 * @generated
 */
public interface MobilityFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobilityFactory eINSTANCE = org.eclipse.symphony.addons.mobility.impl.MobilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mobile Plateform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Plateform</em>'.
	 * @generated
	 */
	MobilePlateform createMobilePlateform();

	/**
	 * Returns a new object of class '<em>Skid Steered Mobile Plateform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skid Steered Mobile Plateform</em>'.
	 * @generated
	 */
	SkidSteeredMobilePlateform createSkidSteeredMobilePlateform();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MobilityPackage getMobilityPackage();

} //MobilityFactory
