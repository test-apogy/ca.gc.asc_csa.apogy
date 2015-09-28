/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.mobile_platform.impl;

import ca.gc.asc_csa.symphony.examples.mobile_platform.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.symphony.examples.mobile_platform.SymphonyExampleMobilePlatformFactory;
import ca.gc.asc_csa.symphony.examples.mobile_platform.SymphonyExampleMobilePlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleMobilePlatformFactoryImpl extends EFactoryImpl implements SymphonyExampleMobilePlatformFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyExampleMobilePlatformFactory init()
  {
		try {
			SymphonyExampleMobilePlatformFactory theSymphonyExampleMobilePlatformFactory = (SymphonyExampleMobilePlatformFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyExampleMobilePlatformPackage.eNS_URI);
			if (theSymphonyExampleMobilePlatformFactory != null) {
				return theSymphonyExampleMobilePlatformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyExampleMobilePlatformFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleMobilePlatformFactoryImpl()
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
			case SymphonyExampleMobilePlatformPackage.MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER: return createMobilePlatformSymphonySystemApiAdapter();
			case SymphonyExampleMobilePlatformPackage.MOBILE_PLATFORM_DATA: return createMobilePlatformData();
			case SymphonyExampleMobilePlatformPackage.MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION: return createMobilePlatformSymphonySystemAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformSymphonySystemApiAdapter createMobilePlatformSymphonySystemApiAdapter() {
		MobilePlatformSymphonySystemApiAdapterImpl mobilePlatformSymphonySystemApiAdapter = new MobilePlatformSymphonySystemApiAdapterImpl();
		return mobilePlatformSymphonySystemApiAdapter;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformData createMobilePlatformData() {
		MobilePlatformDataImpl mobilePlatformData = new MobilePlatformDataImpl();
		return mobilePlatformData;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformSymphonySystemAnnotation createMobilePlatformSymphonySystemAnnotation() {
		MobilePlatformSymphonySystemAnnotationImpl mobilePlatformSymphonySystemAnnotation = new MobilePlatformSymphonySystemAnnotationImpl();
		return mobilePlatformSymphonySystemAnnotation;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleMobilePlatformPackage getSymphonyExampleMobilePlatformPackage()
  {
		return (SymphonyExampleMobilePlatformPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyExampleMobilePlatformPackage getPackage()
  {
		return SymphonyExampleMobilePlatformPackage.eINSTANCE;
	}

} //SymphonyExampleMobilePlatformFactoryImpl
