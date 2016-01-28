/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIPackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.RasterScanDataPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.SimpleSonarPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsRangeUIFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsRangeUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsSensorsRangeUIFactory init() {
		try {
			ApogyAddonsSensorsRangeUIFactory theApogyAddonsSensorsRangeUIFactory = (ApogyAddonsSensorsRangeUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsRangeUIPackage.eNS_URI);
			if (theApogyAddonsSensorsRangeUIFactory != null) {
				return theApogyAddonsSensorsRangeUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsRangeUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsRangeUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION: return createRasterScanDataPresentation();
			case ApogyAddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION: return createSimpleSonarPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterScanDataPresentation createRasterScanDataPresentation() {
		RasterScanDataPresentationImpl rasterScanDataPresentation = new RasterScanDataPresentationImpl();
		return rasterScanDataPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSonarPresentation createSimpleSonarPresentation() {
		SimpleSonarPresentationImpl simpleSonarPresentation = new SimpleSonarPresentationImpl();
		return simpleSonarPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsRangeUIPackage getApogyAddonsSensorsRangeUIPackage() {
		return (ApogyAddonsSensorsRangeUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsSensorsRangeUIPackage getPackage() {
		return ApogyAddonsSensorsRangeUIPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsRangeUIFactoryImpl
