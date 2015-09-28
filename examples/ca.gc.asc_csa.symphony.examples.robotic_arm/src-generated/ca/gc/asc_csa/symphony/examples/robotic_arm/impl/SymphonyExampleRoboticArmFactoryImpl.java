/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.robotic_arm.impl;

import ca.gc.asc_csa.symphony.examples.robotic_arm.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmSymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmFactory;
import ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleRoboticArmFactoryImpl extends EFactoryImpl implements SymphonyExampleRoboticArmFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyExampleRoboticArmFactory init()
  {
		try {
			SymphonyExampleRoboticArmFactory theSymphonyExampleRoboticArmFactory = (SymphonyExampleRoboticArmFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyExampleRoboticArmPackage.eNS_URI);
			if (theSymphonyExampleRoboticArmFactory != null) {
				return theSymphonyExampleRoboticArmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyExampleRoboticArmFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleRoboticArmFactoryImpl()
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
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER: return createRoboticArmSymphonySystemApiAdapter();
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_DATA: return createRoboticArmData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RoboticArmSymphonySystemApiAdapter createRoboticArmSymphonySystemApiAdapter()
  {
		RoboticArmSymphonySystemApiAdapterImpl roboticArmSymphonySystemApiAdapter = new RoboticArmSymphonySystemApiAdapterImpl();
		return roboticArmSymphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RoboticArmData createRoboticArmData()
  {
		RoboticArmDataImpl roboticArmData = new RoboticArmDataImpl();
		return roboticArmData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleRoboticArmPackage getSymphonyExampleRoboticArmPackage()
  {
		return (SymphonyExampleRoboticArmPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyExampleRoboticArmPackage getPackage()
  {
		return SymphonyExampleRoboticArmPackage.eINSTANCE;
	}

} //SymphonyExampleRoboticArmFactoryImpl
