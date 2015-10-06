/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.lidar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleLidarFactoryImpl extends EFactoryImpl implements EMFEcoreExampleLidarFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFEcoreExampleLidarFactory init()
	{
		try {
			EMFEcoreExampleLidarFactory theEMFEcoreExampleLidarFactory = (EMFEcoreExampleLidarFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreExampleLidarPackage.eNS_URI);
			if (theEMFEcoreExampleLidarFactory != null) {
				return theEMFEcoreExampleLidarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreExampleLidarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleLidarFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case EMFEcoreExampleLidarPackage.LIDAR_STUB: return createLidarStub();
			case EMFEcoreExampleLidarPackage.LIDAR_SIMULATED: return createLidarSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * Returns a new Lidar object, which has the same type as
	 * the given Lidar unit.
	 * 
	 * @param lidar The Lidar unit with a particular implementation. 
	 * @return The new Lidar instance, which has the same type as the other one
	 * @generated_NOT
	 */
	@Override
	public Lidar makeLidarSameType(Lidar lidar)
	{
		// Used to keep track of the new Lidar unit instance
		Lidar newLidar = null;
		
		// If the given Lidar object has a simulated implementation
		if (lidar instanceof LidarSimulated)
		{
			// Create a simulated Lidar object
			newLidar = eINSTANCE.createLidarSimulated();
		}
		// Else if the given Lidar object has a stub implementation
		else if (lidar instanceof LidarStub)
		{
			// Create a stub Lidar object
			newLidar = eINSTANCE.createLidarStub();
		}
		
		// Return the new Lidar instance
		return newLidar;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarStub createLidarStub()
	{
		LidarStubImpl lidarStub = new LidarStubImpl();
		return lidarStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarSimulated createLidarSimulated() {
		LidarSimulatedImpl lidarSimulated = new LidarSimulatedImpl();
		return lidarSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleLidarPackage getEMFEcoreExampleLidarPackage()
	{
		return (EMFEcoreExampleLidarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFEcoreExampleLidarPackage getPackage()
	{
		return EMFEcoreExampleLidarPackage.eINSTANCE;
	}

} //EMFEcoreExampleLidarFactoryImpl
