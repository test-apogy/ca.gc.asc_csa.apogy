/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.impl;

import javax.vecmath.Matrix3d;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.lander.Symphony__ExamplesLanderFactory;
import org.eclipse.symphony.examples.lander.Symphony__ExamplesLanderPackage;
import org.eclipse.symphony.examples.lander.Lander;
import org.eclipse.symphony.examples.lander.LanderLegExtension;
import org.eclipse.symphony.examples.lander.LanderSimulated;
import org.eclipse.symphony.examples.lander.LanderStub;
import org.eclipse.symphony.examples.lander.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesLanderFactoryImpl extends EFactoryImpl implements Symphony__ExamplesLanderFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__ExamplesLanderFactory init()
	{
		try {
			Symphony__ExamplesLanderFactory theSymphony__ExamplesLanderFactory = (Symphony__ExamplesLanderFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesLanderPackage.eNS_URI);
			if (theSymphony__ExamplesLanderFactory != null) {
				return theSymphony__ExamplesLanderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesLanderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesLanderFactoryImpl()
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
			case Symphony__ExamplesLanderPackage.POSITION: return createPosition();
			case Symphony__ExamplesLanderPackage.LANDER_STUB: return createLanderStub();
			case Symphony__ExamplesLanderPackage.LANDER_SIMULATED: return createLanderSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case Symphony__ExamplesLanderPackage.LANDER_LEG_EXTENSION:
				return createLanderLegExtensionFromString(eDataType, initialValue);
			case Symphony__ExamplesLanderPackage.MATRIX3D:
				return createMatrix3dFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case Symphony__ExamplesLanderPackage.LANDER_LEG_EXTENSION:
				return convertLanderLegExtensionToString(eDataType, instanceValue);
			case Symphony__ExamplesLanderPackage.MATRIX3D:
				return convertMatrix3dToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * Returns a new Lander object, which has the same type as
	 * the given lander.
	 * 
	 * @param lander The lander with a particular implementation. 
	 * @return The new lander, which has the same type as the other one
	 * @generated_NOT
	 */
	@Override
	public Lander makeLanderSameType(Lander lander)
	{
		// Keep track of the new lander instance
		Lander newLander = null;
		
		// If the given lander had a simulated implementation
		if (lander instanceof LanderSimulated)
		{
			// Create a simulated lander
			newLander = eINSTANCE.createLanderSimulated();
		}
		// Else if the given lander had a stub implementation
		else if (lander instanceof LanderStub)
		{
			// Create a stub lander
			newLander = eINSTANCE.createLanderStub();
		}
		
		// Return the new lander
		return newLander;
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
	public LanderStub createLanderStub() {
		LanderStubImpl landerStub = new LanderStubImpl();
		return landerStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderSimulated createLanderSimulated() {
		LanderSimulatedImpl landerSimulated = new LanderSimulatedImpl();
		return landerSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderLegExtension createLanderLegExtensionFromString(EDataType eDataType, String initialValue)
	{
		LanderLegExtension result = LanderLegExtension.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanderLegExtensionToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3d createMatrix3dFromString(EDataType eDataType, String initialValue)
	{
		return (Matrix3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrix3dToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesLanderPackage getSymphony__ExamplesLanderPackage() {
		return (Symphony__ExamplesLanderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__ExamplesLanderPackage getPackage()
	{
		return Symphony__ExamplesLanderPackage.eINSTANCE;
	}

} //Symphony__ExamplesLanderFactoryImpl
