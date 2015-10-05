/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.range.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIFactory;
import ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIPackage;
import ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation;
import ca.gc.space.mrt.sensors.range.ui.SimpleSonarPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeSensorsUIFactoryImpl extends EFactoryImpl implements RangeSensorsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeSensorsUIFactory init() {
		try {
			RangeSensorsUIFactory theRangeSensorsUIFactory = (RangeSensorsUIFactory)EPackage.Registry.INSTANCE.getEFactory(RangeSensorsUIPackage.eNS_URI);
			if (theRangeSensorsUIFactory != null) {
				return theRangeSensorsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RangeSensorsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSensorsUIFactoryImpl() {
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
			case RangeSensorsUIPackage.RASTER_SCAN_DATA_PRESENTATION: return createRasterScanDataPresentation();
			case RangeSensorsUIPackage.SIMPLE_SONAR_PRESENTATION: return createSimpleSonarPresentation();
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
	public RangeSensorsUIPackage getRangeSensorsUIPackage() {
		return (RangeSensorsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RangeSensorsUIPackage getPackage() {
		return RangeSensorsUIPackage.eINSTANCE;
	}

} //RangeSensorsUIFactoryImpl
