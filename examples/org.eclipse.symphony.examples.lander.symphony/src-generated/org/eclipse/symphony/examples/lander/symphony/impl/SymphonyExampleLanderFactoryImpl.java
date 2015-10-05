/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.lander.symphony.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleLanderFactoryImpl extends EFactoryImpl implements SymphonyExampleLanderFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyExampleLanderFactory init()
  {
		try {
			SymphonyExampleLanderFactory theSymphonyExampleLanderFactory = (SymphonyExampleLanderFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyExampleLanderPackage.eNS_URI);
			if (theSymphonyExampleLanderFactory != null) {
				return theSymphonyExampleLanderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyExampleLanderFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleLanderFactoryImpl()
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
			case SymphonyExampleLanderPackage.LANDER_SYMPHONY_SYSTEM_API_ADAPTER: return createLanderSymphonySystemApiAdapter();
			case SymphonyExampleLanderPackage.LANDER_DATA: return createLanderData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LanderSymphonySystemApiAdapter createLanderSymphonySystemApiAdapter()
  {
		LanderSymphonySystemApiAdapterImpl landerSymphonySystemApiAdapter = new LanderSymphonySystemApiAdapterImpl();
		return landerSymphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderData createLanderData() {
		LanderDataImpl landerData = new LanderDataImpl();
		return landerData;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleLanderPackage getSymphonyExampleLanderPackage()
  {
		return (SymphonyExampleLanderPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyExampleLanderPackage getPackage()
  {
		return SymphonyExampleLanderPackage.eINSTANCE;
	}

} //SymphonyExampleLanderFactoryImpl
