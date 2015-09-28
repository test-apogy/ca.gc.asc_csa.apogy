/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.EMFEcoreExampleAntennaFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.EMFEcoreExampleAntennaPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.PTUDishAntenna;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.PTUDishAntennaSimulated;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.PTUDishAntennaStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleAntennaFactoryImpl extends EFactoryImpl implements EMFEcoreExampleAntennaFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFEcoreExampleAntennaFactory init()
	{
		try {
			EMFEcoreExampleAntennaFactory theEMFEcoreExampleAntennaFactory = (EMFEcoreExampleAntennaFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreExampleAntennaPackage.eNS_URI);
			if (theEMFEcoreExampleAntennaFactory != null) {
				return theEMFEcoreExampleAntennaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreExampleAntennaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleAntennaFactoryImpl()
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
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA_STUB: return createPTUDishAntennaStub();
			case EMFEcoreExampleAntennaPackage.PTU_DISH_ANTENNA_SIMULATED: return createPTUDishAntennaSimulated();
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
	public EMFEcoreExampleAntennaPackage getEMFEcoreExampleAntennaPackage()
	{
		return (EMFEcoreExampleAntennaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFEcoreExampleAntennaPackage getPackage()
	{
		return EMFEcoreExampleAntennaPackage.eINSTANCE;
	}

} //EMFEcoreExampleAntennaFactoryImpl
