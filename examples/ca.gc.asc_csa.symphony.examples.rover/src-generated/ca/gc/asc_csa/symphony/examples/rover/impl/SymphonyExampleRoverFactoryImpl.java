/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.rover.impl;

import ca.gc.asc_csa.symphony.examples.rover.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.symphony.examples.rover.SymphonyExampleRoverFactory;
import ca.gc.asc_csa.symphony.examples.rover.SymphonyExampleRoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleRoverFactoryImpl extends EFactoryImpl implements SymphonyExampleRoverFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyExampleRoverFactory init()
  {
		try {
			SymphonyExampleRoverFactory theSymphonyExampleRoverFactory = (SymphonyExampleRoverFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyExampleRoverPackage.eNS_URI);
			if (theSymphonyExampleRoverFactory != null) {
				return theSymphonyExampleRoverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyExampleRoverFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleRoverFactoryImpl()
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
			case SymphonyExampleRoverPackage.ROVER_SYMPHONY_SYSTEM_API_ADAPTER: return createRoverSymphonySystemApiAdapter();
			case SymphonyExampleRoverPackage.ROVER_DATA: return createRoverData();
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
  public SymphonyExampleRoverPackage getSymphonyExampleRoverPackage()
  {
		return (SymphonyExampleRoverPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyExampleRoverPackage getPackage()
  {
		return SymphonyExampleRoverPackage.eINSTANCE;
	}

} //SymphonyExampleRoverFactoryImpl
