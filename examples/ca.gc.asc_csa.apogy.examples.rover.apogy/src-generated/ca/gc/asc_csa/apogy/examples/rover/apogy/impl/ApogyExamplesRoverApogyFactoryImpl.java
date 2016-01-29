/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.rover.apogy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.rover.apogy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesRoverApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesRoverApogyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyExamplesRoverApogyFactory init()
  {
		try {
			ApogyExamplesRoverApogyFactory theApogyExamplesRoverApogyFactory = (ApogyExamplesRoverApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesRoverApogyPackage.eNS_URI);
			if (theApogyExamplesRoverApogyFactory != null) {
				return theApogyExamplesRoverApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesRoverApogyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesRoverApogyFactoryImpl()
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
			case ApogyExamplesRoverApogyPackage.ROVER_APOGY_SYSTEM_API_ADAPTER: return createRoverApogySystemApiAdapter();
			case ApogyExamplesRoverApogyPackage.ROVER_DATA: return createRoverData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RoverApogySystemApiAdapter createRoverApogySystemApiAdapter()
  {
		RoverApogySystemApiAdapterImpl roverApogySystemApiAdapter = new RoverApogySystemApiAdapterImpl();
		return roverApogySystemApiAdapter;
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
	public ApogyExamplesRoverApogyPackage getApogyExamplesRoverApogyPackage() {
		return (ApogyExamplesRoverApogyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyExamplesRoverApogyPackage getPackage()
  {
		return ApogyExamplesRoverApogyPackage.eINSTANCE;
	}

} //ApogyExamplesRoverApogyFactoryImpl
