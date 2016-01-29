/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.rover.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.rover.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesRoverFactoryImpl extends EFactoryImpl implements ApogyExamplesRoverFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesRoverFactory init()
	{
		try {
			ApogyExamplesRoverFactory theApogyExamplesRoverFactory = (ApogyExamplesRoverFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesRoverPackage.eNS_URI);
			if (theApogyExamplesRoverFactory != null) {
				return theApogyExamplesRoverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesRoverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesRoverFactoryImpl()
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
			case ApogyExamplesRoverPackage.BATTERY: return createBattery();
			case ApogyExamplesRoverPackage.POWER_SYSTEM: return createPowerSystem();
			case ApogyExamplesRoverPackage.ROVER_STUB: return createRoverStub();
			case ApogyExamplesRoverPackage.ROVER_SIMULATED: return createRoverSimulated();
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
	public ApogyExamplesRoverPackage getApogyExamplesRoverPackage() {
		return (ApogyExamplesRoverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesRoverPackage getPackage()
	{
		return ApogyExamplesRoverPackage.eINSTANCE;
	}

} //ApogyExamplesRoverFactoryImpl
