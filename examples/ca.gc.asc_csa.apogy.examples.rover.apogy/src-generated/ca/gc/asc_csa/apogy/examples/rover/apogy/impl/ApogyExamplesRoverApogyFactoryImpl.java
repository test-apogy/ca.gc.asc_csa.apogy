/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.rover.symphony.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesRoverSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesRoverSymphonyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__ExamplesRoverSymphonyFactory init()
  {
		try {
			Symphony__ExamplesRoverSymphonyFactory theSymphony__ExamplesRoverSymphonyFactory = (Symphony__ExamplesRoverSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesRoverSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesRoverSymphonyFactory != null) {
				return theSymphony__ExamplesRoverSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesRoverSymphonyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesRoverSymphonyFactoryImpl()
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
			case Symphony__ExamplesRoverSymphonyPackage.ROVER_SYMPHONY_SYSTEM_API_ADAPTER: return createRoverSymphonySystemApiAdapter();
			case Symphony__ExamplesRoverSymphonyPackage.ROVER_DATA: return createRoverData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RoverSymphonySystemApiAdapter createRoverSymphonySystemApiAdapter()
  {
		RoverSymphonySystemApiAdapterImpl roverSymphonySystemApiAdapter = new RoverSymphonySystemApiAdapterImpl();
		return roverSymphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverData createRoverData() {
		RoverDataImpl roverData = new RoverDataImpl();
		return roverData;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesRoverSymphonyPackage getSymphony__ExamplesRoverSymphonyPackage() {
		return (Symphony__ExamplesRoverSymphonyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__ExamplesRoverSymphonyPackage getPackage()
  {
		return Symphony__ExamplesRoverSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesRoverSymphonyFactoryImpl
