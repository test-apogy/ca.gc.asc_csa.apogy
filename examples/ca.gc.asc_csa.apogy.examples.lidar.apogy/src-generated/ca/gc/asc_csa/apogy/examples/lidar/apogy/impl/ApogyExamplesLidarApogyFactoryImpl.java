/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.lidar.symphony.LidarData;
import org.eclipse.symphony.examples.lidar.symphony.LidarSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.lidar.symphony.Symphony__ExamplesLidarSymphonyFactory;
import org.eclipse.symphony.examples.lidar.symphony.Symphony__ExamplesLidarSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesLidarSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesLidarSymphonyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__ExamplesLidarSymphonyFactory init()
  {
		try {
			Symphony__ExamplesLidarSymphonyFactory theSymphony__ExamplesLidarSymphonyFactory = (Symphony__ExamplesLidarSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesLidarSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesLidarSymphonyFactory != null) {
				return theSymphony__ExamplesLidarSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesLidarSymphonyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesLidarSymphonyFactoryImpl()
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
			case Symphony__ExamplesLidarSymphonyPackage.LIDAR_SYMPHONY_SYSTEM_API_ADAPTER: return createLidarSymphonySystemApiAdapter();
			case Symphony__ExamplesLidarSymphonyPackage.LIDAR_DATA: return createLidarData();
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
	public Symphony__ExamplesLidarSymphonyPackage getSymphony__ExamplesLidarSymphonyPackage() {
		return (Symphony__ExamplesLidarSymphonyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__ExamplesLidarSymphonyPackage getPackage()
  {
		return Symphony__ExamplesLidarSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesLidarSymphonyFactoryImpl
