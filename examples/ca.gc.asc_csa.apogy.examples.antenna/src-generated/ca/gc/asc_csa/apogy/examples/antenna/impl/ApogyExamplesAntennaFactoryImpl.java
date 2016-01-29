/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.antenna.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaFactory;
import ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaPackage;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaSimulated;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesAntennaFactoryImpl extends EFactoryImpl implements ApogyExamplesAntennaFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesAntennaFactory init()
	{
		try {
			ApogyExamplesAntennaFactory theApogyExamplesAntennaFactory = (ApogyExamplesAntennaFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesAntennaPackage.eNS_URI);
			if (theApogyExamplesAntennaFactory != null) {
				return theApogyExamplesAntennaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesAntennaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesAntennaFactoryImpl()
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
			case ApogyExamplesAntennaPackage.PTU_DISH_ANTENNA_STUB: return createPTUDishAntennaStub();
			case ApogyExamplesAntennaPackage.PTU_DISH_ANTENNA_SIMULATED: return createPTUDishAntennaSimulated();
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
	public ApogyExamplesAntennaPackage getApogyExamplesAntennaPackage() {
		return (ApogyExamplesAntennaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesAntennaPackage getPackage()
	{
		return ApogyExamplesAntennaPackage.eINSTANCE;
	}

} //ApogyExamplesAntennaFactoryImpl
