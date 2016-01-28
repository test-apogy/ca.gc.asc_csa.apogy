/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.antenna.Symphony__ExamplesAntennaFactory;
import org.eclipse.symphony.examples.antenna.Symphony__ExamplesAntennaPackage;
import org.eclipse.symphony.examples.antenna.PTUDishAntenna;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaSimulated;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesAntennaFactoryImpl extends EFactoryImpl implements Symphony__ExamplesAntennaFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__ExamplesAntennaFactory init()
	{
		try {
			Symphony__ExamplesAntennaFactory theSymphony__ExamplesAntennaFactory = (Symphony__ExamplesAntennaFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesAntennaPackage.eNS_URI);
			if (theSymphony__ExamplesAntennaFactory != null) {
				return theSymphony__ExamplesAntennaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesAntennaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesAntennaFactoryImpl()
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
			case Symphony__ExamplesAntennaPackage.PTU_DISH_ANTENNA_STUB: return createPTUDishAntennaStub();
			case Symphony__ExamplesAntennaPackage.PTU_DISH_ANTENNA_SIMULATED: return createPTUDishAntennaSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * Returns a new PTUDishAntenna object, which has the same type as
	 * the given PTU dish antenna.
	 * 
	 * @param ptuDishAntenna The PTU dish antenna with a particular implementation. 
	 * @return The new power system, which has the same type as the old one
	 * @generated_NOT
	 */
	@Override
	public PTUDishAntenna makePTUDishAntennaSameType(PTUDishAntenna ptuDishAntenna)
	{
		// Used to store the resulting PTU dish antenna
		PTUDishAntenna newPtuDishAntenna = null;
		
		// If the given PTU dish antenna is a stub implementation
		if (ptuDishAntenna instanceof PTUDishAntennaSimulated)
		{
			// Create a simulated implementation instance accordingly
			newPtuDishAntenna = eINSTANCE.createPTUDishAntennaSimulated();
		}
		// If the given PTU dish antenna is a stub implementation
		else if (ptuDishAntenna instanceof PTUDishAntennaStub)
		{
			// Create a stub implementation instance accordingly
			newPtuDishAntenna = eINSTANCE.createPTUDishAntennaStub();
		}
		
		// Return the new instance
		return newPtuDishAntenna;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUDishAntennaStub createPTUDishAntennaStub() {
		PTUDishAntennaStubImpl ptuDishAntennaStub = new PTUDishAntennaStubImpl();
		return ptuDishAntennaStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUDishAntennaSimulated createPTUDishAntennaSimulated() {
		PTUDishAntennaSimulatedImpl ptuDishAntennaSimulated = new PTUDishAntennaSimulatedImpl();
		return ptuDishAntennaSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesAntennaPackage getSymphony__ExamplesAntennaPackage() {
		return (Symphony__ExamplesAntennaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__ExamplesAntennaPackage getPackage()
	{
		return Symphony__ExamplesAntennaPackage.eINSTANCE;
	}

} //Symphony__ExamplesAntennaFactoryImpl
