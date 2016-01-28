/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesMobilePlatformApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesMobilePlatformApogyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyExamplesMobilePlatformApogyFactory init()
  {
		try {
			ApogyExamplesMobilePlatformApogyFactory theApogyExamplesMobilePlatformApogyFactory = (ApogyExamplesMobilePlatformApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesMobilePlatformApogyPackage.eNS_URI);
			if (theApogyExamplesMobilePlatformApogyFactory != null) {
				return theApogyExamplesMobilePlatformApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesMobilePlatformApogyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesMobilePlatformApogyFactoryImpl()
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
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_APOGY_SYSTEM_API_ADAPTER: return createMobilePlatformApogySystemApiAdapter();
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_DATA: return createMobilePlatformData();
			case ApogyExamplesMobilePlatformApogyPackage.MOBILE_PLATFORM_APOGY_SYSTEM_ANNOTATION: return createMobilePlatformApogySystemAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformApogySystemApiAdapter createMobilePlatformApogySystemApiAdapter() {
		MobilePlatformApogySystemApiAdapterImpl mobilePlatformApogySystemApiAdapter = new MobilePlatformApogySystemApiAdapterImpl();
		return mobilePlatformApogySystemApiAdapter;
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
	public MobilePlatformApogySystemAnnotation createMobilePlatformApogySystemAnnotation() {
		MobilePlatformApogySystemAnnotationImpl mobilePlatformApogySystemAnnotation = new MobilePlatformApogySystemAnnotationImpl();
		return mobilePlatformApogySystemAnnotation;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesMobilePlatformApogyPackage getApogyExamplesMobilePlatformApogyPackage() {
		return (ApogyExamplesMobilePlatformApogyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyExamplesMobilePlatformApogyPackage getPackage()
  {
		return ApogyExamplesMobilePlatformApogyPackage.eINSTANCE;
	}

} //ApogyExamplesMobilePlatformApogyFactoryImpl
