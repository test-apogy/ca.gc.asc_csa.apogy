/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaData;
import org.eclipse.symphony.examples.antenna.symphony.PTUDishAntennaSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.antenna.symphony.Symphony__ExamplesAntennaSymphonyFactory;
import org.eclipse.symphony.examples.antenna.symphony.Symphony__ExamplesAntennaSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesAntennaSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesAntennaSymphonyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__ExamplesAntennaSymphonyFactory init()
  {
		try {
			Symphony__ExamplesAntennaSymphonyFactory theSymphony__ExamplesAntennaSymphonyFactory = (Symphony__ExamplesAntennaSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesAntennaSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesAntennaSymphonyFactory != null) {
				return theSymphony__ExamplesAntennaSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesAntennaSymphonyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesAntennaSymphonyFactoryImpl()
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
			case Symphony__ExamplesAntennaSymphonyPackage.PTU_DISH_ANTENNA_SYMPHONY_SYSTEM_API_ADAPTER: return createPTUDishAntennaSymphonySystemApiAdapter();
			case Symphony__ExamplesAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA: return createPTUDishAntennaData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PTUDishAntennaSymphonySystemApiAdapter createPTUDishAntennaSymphonySystemApiAdapter()
  {
		PTUDishAntennaSymphonySystemApiAdapterImpl ptuDishAntennaSymphonySystemApiAdapter = new PTUDishAntennaSymphonySystemApiAdapterImpl();
		return ptuDishAntennaSymphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PTUDishAntennaData createPTUDishAntennaData()
  {
		PTUDishAntennaDataImpl ptuDishAntennaData = new PTUDishAntennaDataImpl();
		return ptuDishAntennaData;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesAntennaSymphonyPackage getSymphony__ExamplesAntennaSymphonyPackage() {
		return (Symphony__ExamplesAntennaSymphonyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__ExamplesAntennaSymphonyPackage getPackage()
  {
		return Symphony__ExamplesAntennaSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesAntennaSymphonyFactoryImpl
