/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData;
import org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.robotic_arm.symphony.Symphony__ExamplesRoboticArmSymphonyFactory;
import org.eclipse.symphony.examples.robotic_arm.symphony.Symphony__ExamplesRoboticArmSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesRoboticArmSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesRoboticArmSymphonyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__ExamplesRoboticArmSymphonyFactory init()
  {
		try {
			Symphony__ExamplesRoboticArmSymphonyFactory theSymphony__ExamplesRoboticArmSymphonyFactory = (Symphony__ExamplesRoboticArmSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesRoboticArmSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesRoboticArmSymphonyFactory != null) {
				return theSymphony__ExamplesRoboticArmSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesRoboticArmSymphonyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesRoboticArmSymphonyFactoryImpl()
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
			case Symphony__ExamplesRoboticArmSymphonyPackage.ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER: return createRoboticArmSymphonySystemApiAdapter();
			case Symphony__ExamplesRoboticArmSymphonyPackage.ROBOTIC_ARM_DATA: return createRoboticArmData();
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
	public Symphony__ExamplesRoboticArmSymphonyPackage getSymphony__ExamplesRoboticArmSymphonyPackage() {
		return (Symphony__ExamplesRoboticArmSymphonyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__ExamplesRoboticArmSymphonyPackage getPackage()
  {
		return Symphony__ExamplesRoboticArmSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesRoboticArmSymphonyFactoryImpl
