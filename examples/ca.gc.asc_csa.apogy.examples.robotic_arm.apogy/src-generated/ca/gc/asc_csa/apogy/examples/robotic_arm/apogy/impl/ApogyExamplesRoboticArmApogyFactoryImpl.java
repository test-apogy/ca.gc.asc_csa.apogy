/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyFactory;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesRoboticArmApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesRoboticArmApogyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyExamplesRoboticArmApogyFactory init()
  {
		try {
			ApogyExamplesRoboticArmApogyFactory theApogyExamplesRoboticArmApogyFactory = (ApogyExamplesRoboticArmApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesRoboticArmApogyPackage.eNS_URI);
			if (theApogyExamplesRoboticArmApogyFactory != null) {
				return theApogyExamplesRoboticArmApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesRoboticArmApogyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesRoboticArmApogyFactoryImpl()
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
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER: return createRoboticArmApogySystemApiAdapter();
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA: return createRoboticArmData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RoboticArmApogySystemApiAdapter createRoboticArmApogySystemApiAdapter()
  {
		RoboticArmApogySystemApiAdapterImpl roboticArmApogySystemApiAdapter = new RoboticArmApogySystemApiAdapterImpl();
		return roboticArmApogySystemApiAdapter;
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
	public ApogyExamplesRoboticArmApogyPackage getApogyExamplesRoboticArmApogyPackage() {
		return (ApogyExamplesRoboticArmApogyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyExamplesRoboticArmApogyPackage getPackage()
  {
		return ApogyExamplesRoboticArmApogyPackage.eINSTANCE;
	}

} //ApogyExamplesRoboticArmApogyFactoryImpl
