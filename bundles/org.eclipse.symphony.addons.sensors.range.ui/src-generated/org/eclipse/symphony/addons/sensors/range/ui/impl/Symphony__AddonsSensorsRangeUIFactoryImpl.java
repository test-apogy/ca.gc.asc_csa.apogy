/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.range.ui.*;
import org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIFactory;
import org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage;
import org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation;
import org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsRangeUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsRangeUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsSensorsRangeUIFactory init() {
		try {
			Symphony__AddonsSensorsRangeUIFactory theSymphony__AddonsSensorsRangeUIFactory = (Symphony__AddonsSensorsRangeUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsRangeUIPackage.eNS_URI);
			if (theSymphony__AddonsSensorsRangeUIFactory != null) {
				return theSymphony__AddonsSensorsRangeUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsRangeUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsRangeUIFactoryImpl() {
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
			case Symphony__AddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION: return createRasterScanDataPresentation();
			case Symphony__AddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION: return createSimpleSonarPresentation();
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
	public Symphony__AddonsSensorsRangeUIPackage getSymphony__AddonsSensorsRangeUIPackage() {
		return (Symphony__AddonsSensorsRangeUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsSensorsRangeUIPackage getPackage() {
		return Symphony__AddonsSensorsRangeUIPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsRangeUIFactoryImpl
