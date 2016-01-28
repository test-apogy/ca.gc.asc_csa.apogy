/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.lander.symphony.LanderData;
import org.eclipse.symphony.examples.lander.symphony.LanderSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyFactory;
import org.eclipse.symphony.examples.lander.symphony.Symphony__ExamplesLanderSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesLanderSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesLanderSymphonyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__ExamplesLanderSymphonyFactory init()
  {
		try {
			Symphony__ExamplesLanderSymphonyFactory theSymphony__ExamplesLanderSymphonyFactory = (Symphony__ExamplesLanderSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesLanderSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesLanderSymphonyFactory != null) {
				return theSymphony__ExamplesLanderSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesLanderSymphonyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesLanderSymphonyFactoryImpl()
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
			case Symphony__ExamplesLanderSymphonyPackage.LANDER_SYMPHONY_SYSTEM_API_ADAPTER: return createLanderSymphonySystemApiAdapter();
			case Symphony__ExamplesLanderSymphonyPackage.LANDER_DATA: return createLanderData();
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
	public Symphony__ExamplesLanderSymphonyPackage getSymphony__ExamplesLanderSymphonyPackage() {
		return (Symphony__ExamplesLanderSymphonyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__ExamplesLanderSymphonyPackage getPackage()
  {
		return Symphony__ExamplesLanderSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesLanderSymphonyFactoryImpl
