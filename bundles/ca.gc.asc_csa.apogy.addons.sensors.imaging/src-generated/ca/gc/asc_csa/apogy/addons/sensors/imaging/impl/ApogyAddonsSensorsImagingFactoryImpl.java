package ca.gc.asc_csa.apogy.addons.sensors.imaging.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.awt.Color;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsImagingFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsImagingFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyAddonsSensorsImagingFactory init()
  {
		try {
			ApogyAddonsSensorsImagingFactory theApogyAddonsSensorsImagingFactory = (ApogyAddonsSensorsImagingFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsImagingPackage.eNS_URI);
			if (theApogyAddonsSensorsImagingFactory != null) {
				return theApogyAddonsSensorsImagingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsImagingFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsSensorsImagingFactoryImpl()
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
			case ApogyAddonsSensorsImagingPackage.IMAGE_SNAPSHOT: return createImageSnapshot();
			case ApogyAddonsSensorsImagingPackage.RECTIFIED_IMAGE_SNAPSHOT: return createRectifiedImageSnapshot();
			case ApogyAddonsSensorsImagingPackage.IMAGING_UTILITIES: return createImagingUtilities();
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
			case ApogyAddonsSensorsImagingPackage.AZIMUTH_DIRECTION:
				return createAzimuthDirectionFromString(eDataType, initialValue);
			case ApogyAddonsSensorsImagingPackage.ELEVATION_DIRECTION:
				return createElevationDirectionFromString(eDataType, initialValue);
			case ApogyAddonsSensorsImagingPackage.COLOR:
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
			case ApogyAddonsSensorsImagingPackage.AZIMUTH_DIRECTION:
				return convertAzimuthDirectionToString(eDataType, instanceValue);
			case ApogyAddonsSensorsImagingPackage.ELEVATION_DIRECTION:
				return convertElevationDirectionToString(eDataType, instanceValue);
			case ApogyAddonsSensorsImagingPackage.COLOR:
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
	public ApogyAddonsSensorsImagingPackage getApogyAddonsSensorsImagingPackage() {
		return (ApogyAddonsSensorsImagingPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyAddonsSensorsImagingPackage getPackage()
  {
		return ApogyAddonsSensorsImagingPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsImagingFactoryImpl
