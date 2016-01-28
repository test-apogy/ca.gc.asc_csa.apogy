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
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingFactory;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage;
import org.eclipse.symphony.addons.sensors.imaging.RectifiedImageSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsImagingFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsImagingFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__AddonsSensorsImagingFactory init()
  {
		try {
			Symphony__AddonsSensorsImagingFactory theSymphony__AddonsSensorsImagingFactory = (Symphony__AddonsSensorsImagingFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsImagingPackage.eNS_URI);
			if (theSymphony__AddonsSensorsImagingFactory != null) {
				return theSymphony__AddonsSensorsImagingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsImagingFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__AddonsSensorsImagingFactoryImpl()
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
			case Symphony__AddonsSensorsImagingPackage.IMAGE_SNAPSHOT: return createImageSnapshot();
			case Symphony__AddonsSensorsImagingPackage.RECTIFIED_IMAGE_SNAPSHOT: return createRectifiedImageSnapshot();
			case Symphony__AddonsSensorsImagingPackage.IMAGING_UTILITIES: return createImagingUtilities();
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
			case Symphony__AddonsSensorsImagingPackage.AZIMUTH_DIRECTION:
				return createAzimuthDirectionFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsImagingPackage.ELEVATION_DIRECTION:
				return createElevationDirectionFromString(eDataType, initialValue);
			case Symphony__AddonsSensorsImagingPackage.COLOR:
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
			case Symphony__AddonsSensorsImagingPackage.AZIMUTH_DIRECTION:
				return convertAzimuthDirectionToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsImagingPackage.ELEVATION_DIRECTION:
				return convertElevationDirectionToString(eDataType, instanceValue);
			case Symphony__AddonsSensorsImagingPackage.COLOR:
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
	public Symphony__AddonsSensorsImagingPackage getSymphony__AddonsSensorsImagingPackage() {
		return (Symphony__AddonsSensorsImagingPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__AddonsSensorsImagingPackage getPackage()
  {
		return Symphony__AddonsSensorsImagingPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsImagingFactoryImpl
