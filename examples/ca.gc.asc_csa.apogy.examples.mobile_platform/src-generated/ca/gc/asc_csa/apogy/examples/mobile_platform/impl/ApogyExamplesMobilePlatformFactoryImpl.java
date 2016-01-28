/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.mobile_platform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesMobilePlatformFactoryImpl extends EFactoryImpl implements Symphony__ExamplesMobilePlatformFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__ExamplesMobilePlatformFactory init()
	{
		try {
			Symphony__ExamplesMobilePlatformFactory theSymphony__ExamplesMobilePlatformFactory = (Symphony__ExamplesMobilePlatformFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesMobilePlatformPackage.eNS_URI);
			if (theSymphony__ExamplesMobilePlatformFactory != null) {
				return theSymphony__ExamplesMobilePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesMobilePlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesMobilePlatformFactoryImpl()
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
			case Symphony__ExamplesMobilePlatformPackage.POSITION: return createPosition();
			case Symphony__ExamplesMobilePlatformPackage.NAMED_POSITION: return createNamedPosition();
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM_STUB: return createMobilePlatformStub();
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM_SIMULATED: return createMobilePlatformSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * Returns a new Position object, which has the same type as
	 * the given position.
	 * 
	 * @param position The position with a particular implementation. 
	 * @return The new Position instance, which has the same type as the other one.
	 * @generated_NOT
	 */
	@Override
	public Position makePositionSameType(Position position)
	{
		// Used to keep track of the new position object
		Position newPosition = null;
		
		// If the position is a named position
		if (position instanceof NamedPosition)
		{
			// Create the named position
			newPosition = eINSTANCE.createNamedPosition();
		}
		// Otherwise if it's just a regular position
		else if (position instanceof Position)
		{
			// Create the regular position
			newPosition = eINSTANCE.createPosition();
		}
		
		// Just return the position
		return newPosition;
	}
	
	/**
	 * Returns a new Mobile Platform object, which has the same type as
	 * the given platform.
	 * 
	 * @param mobilePlatform The mobile platform with a particular implementation. 
	 * @return The new mobile platform instance, which has the same type as the other one.
	 * @generated_NOT
	 */
	@Override
	public MobilePlatform makeMobilePlatformSameType(MobilePlatform mobilePlatform)
	{
		// Used to keep track of the new mobile platform instance
		MobilePlatform newMobilePlatform = null;
		
		// If the given mobile platform has a simulated implementation
		if (mobilePlatform instanceof MobilePlatformSimulated)
		{
			// Create a simulated mobile platform
			newMobilePlatform = eINSTANCE.createMobilePlatformSimulated();
		}
		// Else if the given mobile platform has a stub implementation
		else if (mobilePlatform instanceof MobilePlatformStub)
		{
			// Create a stub mobile platform
			newMobilePlatform = eINSTANCE.createMobilePlatformStub();
		}
		
		// Return the newly created mobile platform
		return newMobilePlatform;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition()
	{
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedPosition createNamedPosition()
	{
		NamedPositionImpl namedPosition = new NamedPositionImpl();
		return namedPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformStub createMobilePlatformStub()
	{
		MobilePlatformStubImpl mobilePlatformStub = new MobilePlatformStubImpl();
		return mobilePlatformStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformSimulated createMobilePlatformSimulated() {
		MobilePlatformSimulatedImpl mobilePlatformSimulated = new MobilePlatformSimulatedImpl();
		return mobilePlatformSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesMobilePlatformPackage getSymphony__ExamplesMobilePlatformPackage() {
		return (Symphony__ExamplesMobilePlatformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__ExamplesMobilePlatformPackage getPackage()
	{
		return Symphony__ExamplesMobilePlatformPackage.eINSTANCE;
	}

} //Symphony__ExamplesMobilePlatformFactoryImpl
