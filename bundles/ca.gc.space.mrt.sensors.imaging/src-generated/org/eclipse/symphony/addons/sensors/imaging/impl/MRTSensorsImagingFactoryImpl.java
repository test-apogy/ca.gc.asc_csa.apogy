/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.impl;

import java.awt.Color;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.imaging.AzimuthDirection;
import org.eclipse.symphony.addons.sensors.imaging.ElevationDirection;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.ImagingUtilities;
import org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingFactory;
import org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage;
import org.eclipse.symphony.addons.sensors.imaging.RectifiedImageSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRTSensorsImagingFactoryImpl extends EFactoryImpl implements MRTSensorsImagingFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static MRTSensorsImagingFactory init()
  {
		try {
			MRTSensorsImagingFactory theMRTSensorsImagingFactory = (MRTSensorsImagingFactory)EPackage.Registry.INSTANCE.getEFactory(MRTSensorsImagingPackage.eNS_URI);
			if (theMRTSensorsImagingFactory != null) {
				return theMRTSensorsImagingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MRTSensorsImagingFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTSensorsImagingFactoryImpl()
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
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT: return createImageSnapshot();
			case MRTSensorsImagingPackage.RECTIFIED_IMAGE_SNAPSHOT: return createRectifiedImageSnapshot();
			case MRTSensorsImagingPackage.IMAGING_UTILITIES: return createImagingUtilities();
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
			case MRTSensorsImagingPackage.AZIMUTH_DIRECTION:
				return createAzimuthDirectionFromString(eDataType, initialValue);
			case MRTSensorsImagingPackage.ELEVATION_DIRECTION:
				return createElevationDirectionFromString(eDataType, initialValue);
			case MRTSensorsImagingPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
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
			case MRTSensorsImagingPackage.AZIMUTH_DIRECTION:
				return convertAzimuthDirectionToString(eDataType, instanceValue);
			case MRTSensorsImagingPackage.ELEVATION_DIRECTION:
				return convertElevationDirectionToString(eDataType, instanceValue);
			case MRTSensorsImagingPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageSnapshot createImageSnapshot()
  {
		ImageSnapshotImpl imageSnapshot = new ImageSnapshotImpl();
		return imageSnapshot;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectifiedImageSnapshot createRectifiedImageSnapshot()
  {
		RectifiedImageSnapshotImpl rectifiedImageSnapshot = new RectifiedImageSnapshotImpl();
		return rectifiedImageSnapshot;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingUtilities createImagingUtilities() {
		ImagingUtilitiesImpl imagingUtilities = new ImagingUtilitiesImpl();
		return imagingUtilities;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzimuthDirection createAzimuthDirectionFromString(EDataType eDataType, String initialValue) {
		AzimuthDirection result = AzimuthDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAzimuthDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevationDirection createElevationDirectionFromString(EDataType eDataType, String initialValue) {
		ElevationDirection result = ElevationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElevationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTSensorsImagingPackage getMRTSensorsImagingPackage()
  {
		return (MRTSensorsImagingPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static MRTSensorsImagingPackage getPackage()
  {
		return MRTSensorsImagingPackage.eINSTANCE;
	}

} //MRTSensorsImagingFactoryImpl
