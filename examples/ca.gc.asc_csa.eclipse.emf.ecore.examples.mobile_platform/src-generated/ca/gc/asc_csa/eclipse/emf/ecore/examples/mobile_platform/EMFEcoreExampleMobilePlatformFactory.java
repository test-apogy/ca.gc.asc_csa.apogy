/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage
 * @generated
 */
public interface EMFEcoreExampleMobilePlatformFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreExampleMobilePlatformFactory eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.impl.EMFEcoreExampleMobilePlatformFactoryImpl.init();

	/**
	 * Returns a new Position object, which has the same type as
	 * the given position.
	 * 
	 * @param position The position with a particular implementation. 
	 * @return The new Position instance, which has the same type as the other one.
	 * @generated_NOT
	 */
	Position makePositionSameType(Position position);
	
	/**
	 * Returns a new Mobile Platform object, which has the same type as
	 * the given platform.
	 * 
	 * @param mobilePlatform The mobile platform with a particular implementation. 
	 * @return The new mobile platform instance, which has the same type as the other one.
	 * @generated_NOT
	 */
	MobilePlatform makeMobilePlatformSameType(MobilePlatform mobilePlatform);	
	
	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Named Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Position</em>'.
	 * @generated
	 */
	NamedPosition createNamedPosition();

	/**
	 * Returns a new object of class '<em>Mobile Platform Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Stub</em>'.
	 * @generated
	 */
	MobilePlatformStub createMobilePlatformStub();

	/**
	 * Returns a new object of class '<em>Mobile Platform Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Simulated</em>'.
	 * @generated
	 */
	MobilePlatformSimulated createMobilePlatformSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMFEcoreExampleMobilePlatformPackage getEMFEcoreExampleMobilePlatformPackage();

} //EMFEcoreExampleMobilePlatformFactory
