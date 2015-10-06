/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.lidar.EMFEcoreExampleLidarPackage
 * @generated
 */
public interface EMFEcoreExampleLidarFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreExampleLidarFactory eINSTANCE = org.eclipse.symphony.examples.lidar.impl.EMFEcoreExampleLidarFactoryImpl.init();

	/**
	 * Returns a new Lidar object, which has the same type as
	 * the given Lidar unit.
	 * 
	 * @param lidar The Lidar unit with a particular implementation. 
	 * @return The new Lidar instance, which has the same type as the other one
	 * @generated_NOT
	 */
	Lidar makeLidarSameType(Lidar lidar);
	
	/**
	 * Returns a new object of class '<em>Lidar Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lidar Stub</em>'.
	 * @generated
	 */
	LidarStub createLidarStub();

	/**
	 * Returns a new object of class '<em>Lidar Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lidar Simulated</em>'.
	 * @generated
	 */
	LidarSimulated createLidarSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMFEcoreExampleLidarPackage getEMFEcoreExampleLidarPackage();

} //EMFEcoreExampleLidarFactory
