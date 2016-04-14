package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl;
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

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.*;
import gov.nasa.worldwind.layers.RenderableLayer;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jface.viewers.ISelection;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfigurationList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentOrbitEarthUIFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentOrbitEarthUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentOrbitEarthUIFactory init() {
		try {
			ApogyCoreEnvironmentOrbitEarthUIFactory theApogyCoreEnvironmentOrbitEarthUIFactory = (ApogyCoreEnvironmentOrbitEarthUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentOrbitEarthUIPackage.eNS_URI);
			if (theApogyCoreEnvironmentOrbitEarthUIFactory != null) {
				return theApogyCoreEnvironmentOrbitEarthUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentOrbitEarthUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitEarthUIFactoryImpl() {
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST: return createEarthViewConfigurationList();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION: return createEarthViewConfiguration();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER: return createSpacecraftLocationWorldWindLayer();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER: return createOrbitModelWorldWindLayer();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER: return createSpacecraftSwathWorldWindLayer();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER: return createEarthSurfaceLocationWorldWindLayer();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER: return createGroundStationWorldWindLayer();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER: return createGeographicCoordinatesWorldWindLayer();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST: return createSpacecraftVisibilityPassViewConfigurationList();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION: return createSpacecraftVisibilityPassViewConfiguration();
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_UTILITIES: return createEarthViewUtilities();
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.RENDERABLE_LAYER:
				return createRenderableLayerFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthUIPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ISELECTION:
				return createISelectionFromString(eDataType, initialValue);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.RENDERABLE_LAYER:
				return convertRenderableLayerToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthUIPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentOrbitEarthUIPackage.ISELECTION:
				return convertISelectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthViewConfigurationList createEarthViewConfigurationList() {
		EarthViewConfigurationListImpl earthViewConfigurationList = new EarthViewConfigurationListImpl();
		return earthViewConfigurationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthViewConfiguration createEarthViewConfiguration() {
		EarthViewConfigurationImpl earthViewConfiguration = new EarthViewConfigurationImpl();
		return earthViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftLocationWorldWindLayer createSpacecraftLocationWorldWindLayer() {
		SpacecraftLocationWorldWindLayerImpl spacecraftLocationWorldWindLayer = new SpacecraftLocationWorldWindLayerImpl();
		return spacecraftLocationWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModelWorldWindLayer createOrbitModelWorldWindLayer() {
		OrbitModelWorldWindLayerImpl orbitModelWorldWindLayer = new OrbitModelWorldWindLayerImpl();
		return orbitModelWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftSwathWorldWindLayer createSpacecraftSwathWorldWindLayer() {
		SpacecraftSwathWorldWindLayerImpl spacecraftSwathWorldWindLayer = new SpacecraftSwathWorldWindLayerImpl();
		return spacecraftSwathWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocationWorldWindLayer createEarthSurfaceLocationWorldWindLayer() {
		EarthSurfaceLocationWorldWindLayerImpl earthSurfaceLocationWorldWindLayer = new EarthSurfaceLocationWorldWindLayerImpl();
		return earthSurfaceLocationWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStationWorldWindLayer createGroundStationWorldWindLayer() {
		GroundStationWorldWindLayerImpl groundStationWorldWindLayer = new GroundStationWorldWindLayerImpl();
		return groundStationWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinatesWorldWindLayer createGeographicCoordinatesWorldWindLayer() {
		GeographicCoordinatesWorldWindLayerImpl geographicCoordinatesWorldWindLayer = new GeographicCoordinatesWorldWindLayerImpl();
		return geographicCoordinatesWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftVisibilityPassViewConfigurationList createSpacecraftVisibilityPassViewConfigurationList() {
		SpacecraftVisibilityPassViewConfigurationListImpl spacecraftVisibilityPassViewConfigurationList = new SpacecraftVisibilityPassViewConfigurationListImpl();
		return spacecraftVisibilityPassViewConfigurationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftVisibilityPassViewConfiguration createSpacecraftVisibilityPassViewConfiguration() {
		SpacecraftVisibilityPassViewConfigurationImpl spacecraftVisibilityPassViewConfiguration = new SpacecraftVisibilityPassViewConfigurationImpl();
		return spacecraftVisibilityPassViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthViewUtilities createEarthViewUtilities() {
		EarthViewUtilitiesImpl earthViewUtilities = new EarthViewUtilitiesImpl();
		return earthViewUtilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderableLayer createRenderableLayerFromString(EDataType eDataType, String initialValue) {
		return (RenderableLayer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderableLayerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISelection createISelectionFromString(EDataType eDataType, String initialValue) {
		return (ISelection)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertISelectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitEarthUIPackage getApogyCoreEnvironmentOrbitEarthUIPackage() {
		return (ApogyCoreEnvironmentOrbitEarthUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentOrbitEarthUIPackage getPackage() {
		return ApogyCoreEnvironmentOrbitEarthUIPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentOrbitEarthUIFactoryImpl
