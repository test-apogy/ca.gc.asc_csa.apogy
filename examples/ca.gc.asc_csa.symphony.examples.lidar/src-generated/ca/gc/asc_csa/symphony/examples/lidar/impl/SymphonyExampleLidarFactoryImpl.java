/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.lidar.impl;

import ca.gc.asc_csa.symphony.examples.lidar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleLidarFactoryImpl extends EFactoryImpl implements SymphonyExampleLidarFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyExampleLidarFactory init()
  {
		try {
			SymphonyExampleLidarFactory theSymphonyExampleLidarFactory = (SymphonyExampleLidarFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyExampleLidarPackage.eNS_URI);
			if (theSymphonyExampleLidarFactory != null) {
				return theSymphonyExampleLidarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyExampleLidarFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleLidarFactoryImpl()
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
			case SymphonyExampleLidarPackage.LIDAR_SYMPHONY_SYSTEM_API_ADAPTER: return createLidarSymphonySystemApiAdapter();
			case SymphonyExampleLidarPackage.LIDAR_DATA: return createLidarData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarSymphonySystemApiAdapter createLidarSymphonySystemApiAdapter() {
		LidarSymphonySystemApiAdapterImpl lidarSymphonySystemApiAdapter = new LidarSymphonySystemApiAdapterImpl();
		return lidarSymphonySystemApiAdapter;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LidarData createLidarData() {
		LidarDataImpl lidarData = new LidarDataImpl();
		return lidarData;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleLidarPackage getSymphonyExampleLidarPackage()
  {
		return (SymphonyExampleLidarPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyExampleLidarPackage getPackage()
  {
		return SymphonyExampleLidarPackage.eINSTANCE;
	}

} //SymphonyExampleLidarFactoryImpl
