/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.mobile_platform.symphony.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesMobilePlatformSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesMobilePlatformSymphonyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__ExamplesMobilePlatformSymphonyFactory init()
  {
		try {
			Symphony__ExamplesMobilePlatformSymphonyFactory theSymphony__ExamplesMobilePlatformSymphonyFactory = (Symphony__ExamplesMobilePlatformSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesMobilePlatformSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesMobilePlatformSymphonyFactory != null) {
				return theSymphony__ExamplesMobilePlatformSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesMobilePlatformSymphonyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesMobilePlatformSymphonyFactoryImpl()
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
			case Symphony__ExamplesMobilePlatformSymphonyPackage.MOBILE_PLATFORM_SYMPHONY_SYSTEM_API_ADAPTER: return createMobilePlatformSymphonySystemApiAdapter();
			case Symphony__ExamplesMobilePlatformSymphonyPackage.MOBILE_PLATFORM_DATA: return createMobilePlatformData();
			case Symphony__ExamplesMobilePlatformSymphonyPackage.MOBILE_PLATFORM_SYMPHONY_SYSTEM_ANNOTATION: return createMobilePlatformSymphonySystemAnnotation();
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
	public Symphony__ExamplesMobilePlatformSymphonyPackage getSymphony__ExamplesMobilePlatformSymphonyPackage() {
		return (Symphony__ExamplesMobilePlatformSymphonyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__ExamplesMobilePlatformSymphonyPackage getPackage()
  {
		return Symphony__ExamplesMobilePlatformSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesMobilePlatformSymphonyFactoryImpl
