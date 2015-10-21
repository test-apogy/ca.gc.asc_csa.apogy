/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.sensors.range.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeFactoryImpl extends EFactoryImpl implements RangeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeFactory init() {
		try {
			RangeFactory theRangeFactory = (RangeFactory)EPackage.Registry.INSTANCE.getEFactory(RangePackage.eNS_URI);
			if (theRangeFactory != null) {
				return theRangeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RangeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeFactoryImpl() {
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
			case RangePackage.RAY_DATA: return createRayData();
			case RangePackage.RASTER_SCAN_SETTINGS: return createRasterScanSettings();
			case RangePackage.RANGE_SENSOR: return createRangeSensor();
			case RangePackage.CONTACT_SENSOR: return createContactSensor();
			case RangePackage.SIMPLE_RANGE_SENSOR: return createSimpleRangeSensor();
			case RangePackage.SIMPLE_SONAR: return createSimpleSonar();
			case RangePackage.LINE_RANGE_SCANNER: return createLineRangeScanner();
			case RangePackage.SIMPLE_LINE_RANGE_SCANNER: return createSimpleLineRangeScanner();
			case RangePackage.RANGE_SCANNER: return createRangeScanner();
			case RangePackage.RASTER_SCAN_RANGE_SENSOR: return createRasterScanRangeSensor();
			case RangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER: return createSimpleRasterScanRangeScanner();
			case RangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR: return createSimpleRasterScanRangeScannerSimulator();
			case RangePackage.RASTER_SCAN_DATA: return createRasterScanData();
			case RangePackage.SENSORS_RANGE_FACADE: return createSensorsRangeFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RangePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case RangePackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case RangePackage.VECTOR3D:
				return createVector3dFromString(eDataType, initialValue);
			case RangePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RangePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case RangePackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case RangePackage.VECTOR3D:
				return convertVector3dToString(eDataType, instanceValue);
			case RangePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RayData createRayData() {
		RayDataImpl rayData = new RayDataImpl();
		return rayData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterScanSettings createRasterScanSettings() {
		RasterScanSettingsImpl rasterScanSettings = new RasterScanSettingsImpl();
		return rasterScanSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSensor createRangeSensor() {
		RangeSensorImpl rangeSensor = new RangeSensorImpl();
		return rangeSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactSensor createContactSensor() {
		ContactSensorImpl contactSensor = new ContactSensorImpl();
		return contactSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRangeSensor createSimpleRangeSensor() {
		SimpleRangeSensorImpl simpleRangeSensor = new SimpleRangeSensorImpl();
		return simpleRangeSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSonar createSimpleSonar() {
		SimpleSonarImpl simpleSonar = new SimpleSonarImpl();
		return simpleSonar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineRangeScanner createLineRangeScanner() {
		LineRangeScannerImpl lineRangeScanner = new LineRangeScannerImpl();
		return lineRangeScanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLineRangeScanner createSimpleLineRangeScanner() {
		SimpleLineRangeScannerImpl simpleLineRangeScanner = new SimpleLineRangeScannerImpl();
		return simpleLineRangeScanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <InputType> RangeScanner<InputType> createRangeScanner() {
		RangeScannerImpl<InputType> rangeScanner = new RangeScannerImpl<InputType>();
		return rangeScanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterScanRangeSensor createRasterScanRangeSensor() {
		RasterScanRangeSensorImpl rasterScanRangeSensor = new RasterScanRangeSensorImpl();
		return rasterScanRangeSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRasterScanRangeScanner createSimpleRasterScanRangeScanner() {
		SimpleRasterScanRangeScannerImpl simpleRasterScanRangeScanner = new SimpleRasterScanRangeScannerImpl();
		return simpleRasterScanRangeScanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRasterScanRangeScannerSimulator createSimpleRasterScanRangeScannerSimulator() {
		SimpleRasterScanRangeScannerSimulatorImpl simpleRasterScanRangeScannerSimulator = new SimpleRasterScanRangeScannerSimulatorImpl();
		return simpleRasterScanRangeScannerSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterScanData createRasterScanData() {
		RasterScanDataImpl rasterScanData = new RasterScanDataImpl();
		return rasterScanData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsRangeFacade createSensorsRangeFacade() {
		SensorsRangeFacadeImpl sensorsRangeFacade = new SensorsRangeFacadeImpl();
		return sensorsRangeFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d createPoint3dFromString(EDataType eDataType, String initialValue) {
		return (Point3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d createVector3dFromString(EDataType eDataType, String initialValue) {
		return (Vector3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangePackage getRangePackage() {
		return (RangePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RangePackage getPackage() {
		return RangePackage.eINSTANCE;
	}

} //RangeFactoryImpl