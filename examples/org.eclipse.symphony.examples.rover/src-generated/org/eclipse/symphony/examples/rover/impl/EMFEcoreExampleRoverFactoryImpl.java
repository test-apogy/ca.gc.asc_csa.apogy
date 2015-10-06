/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.rover.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleRoverFactoryImpl extends EFactoryImpl implements EMFEcoreExampleRoverFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFEcoreExampleRoverFactory init()
	{
		try {
			EMFEcoreExampleRoverFactory theEMFEcoreExampleRoverFactory = (EMFEcoreExampleRoverFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreExampleRoverPackage.eNS_URI);
			if (theEMFEcoreExampleRoverFactory != null) {
				return theEMFEcoreExampleRoverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreExampleRoverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleRoverFactoryImpl()
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
			case EMFEcoreExampleRoverPackage.BATTERY: return createBattery();
			case EMFEcoreExampleRoverPackage.POWER_SYSTEM: return createPowerSystem();
			case EMFEcoreExampleRoverPackage.ROVER_STUB: return createRoverStub();
			case EMFEcoreExampleRoverPackage.ROVER_SIMULATED: return createRoverSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery createBattery() {
		BatteryImpl battery = new BatteryImpl();
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystem createPowerSystem() {
		PowerSystemImpl powerSystem = new PowerSystemImpl();
		return powerSystem;
	}

	/**
	 * Returns a new Rover object, which has the same type as
	 * the given rover arm.
	 * 
	 * @param rover The rover with a particular implementation. 
	 * @return The new rover, which has the same type as the old one
	 * @generated_NOT
	 */
	public Rover makeRoverSameType(Rover rover)
	{
		// Used to keep track of the new rover instance
		Rover newRover = null;
		
		// If the given rover has a simulated implementation
		if (rover instanceof RoverSimulated)
		{
			// Create a simulated rover
			newRover = eINSTANCE.createRoverSimulated();
		}
		// Else if the given rover has a stub implementation
		else if (rover instanceof RoverStub)
		{
			// Create a stub rover
			newRover = eINSTANCE.createRoverStub();
		}
		
		// Return the new rover
		return newRover;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverStub createRoverStub()
	{
		RoverStubImpl roverStub = new RoverStubImpl();
		return roverStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverSimulated createRoverSimulated() {
		RoverSimulatedImpl roverSimulated = new RoverSimulatedImpl();
		return roverSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleRoverPackage getEMFEcoreExampleRoverPackage()
	{
		return (EMFEcoreExampleRoverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFEcoreExampleRoverPackage getPackage()
	{
		return EMFEcoreExampleRoverPackage.eINSTANCE;
	}

} //EMFEcoreExampleRoverFactoryImpl
