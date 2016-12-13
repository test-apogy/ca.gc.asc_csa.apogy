/**
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.impl;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyEarthSurfaceEnvironmentFactoryImpl extends EFactoryImpl implements ApogyEarthSurfaceEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyEarthSurfaceEnvironmentFactory init() {
		try {
			ApogyEarthSurfaceEnvironmentFactory theApogyEarthSurfaceEnvironmentFactory = (ApogyEarthSurfaceEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyEarthSurfaceEnvironmentPackage.eNS_URI);
			if (theApogyEarthSurfaceEnvironmentFactory != null) {
				return theApogyEarthSurfaceEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyEarthSurfaceEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthSurfaceEnvironmentFactoryImpl() {
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
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE: return createEarthSurfaceWorksite();
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SKY: return createEarthSky();
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE: return createEarthSurfaceWorksiteNode();
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SKY_NODE: return createEarthSkyNode();
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE: return createApogyEarthSurfaceEnvironmentFacade();
			case ApogyEarthSurfaceEnvironmentPackage.ATMOSPHERE_UTILS: return createAtmosphereUtils();
			case ApogyEarthSurfaceEnvironmentPackage.ASTRONOMY_UTILS: return createAstronomyUtils();
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
			case ApogyEarthSurfaceEnvironmentPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
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
			case ApogyEarthSurfaceEnvironmentPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceWorksite createEarthSurfaceWorksite() {
		EarthSurfaceWorksiteImpl earthSurfaceWorksite = new EarthSurfaceWorksiteImpl();
		return earthSurfaceWorksite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSky createEarthSky() {
		EarthSkyImpl earthSky = new EarthSkyImpl();
		return earthSky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceWorksiteNode createEarthSurfaceWorksiteNode() {
		EarthSurfaceWorksiteNodeImpl earthSurfaceWorksiteNode = new EarthSurfaceWorksiteNodeImpl();
		return earthSurfaceWorksiteNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSkyNode createEarthSkyNode() {
		EarthSkyNodeImpl earthSkyNode = new EarthSkyNodeImpl();
		return earthSkyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEarthSurfaceEnvironmentFacade createApogyEarthSurfaceEnvironmentFacade() {
		ApogyEarthSurfaceEnvironmentFacadeImpl apogyEarthSurfaceEnvironmentFacade = new ApogyEarthSurfaceEnvironmentFacadeImpl();
		return apogyEarthSurfaceEnvironmentFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtmosphereUtils createAtmosphereUtils() {
		AtmosphereUtilsImpl atmosphereUtils = new AtmosphereUtilsImpl();
		return atmosphereUtils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstronomyUtils createAstronomyUtils() {
		AstronomyUtilsImpl astronomyUtils = new AstronomyUtilsImpl();
		return astronomyUtils;
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
	public ApogyEarthSurfaceEnvironmentPackage getApogyEarthSurfaceEnvironmentPackage() {
		return (ApogyEarthSurfaceEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyEarthSurfaceEnvironmentPackage getPackage() {
		return ApogyEarthSurfaceEnvironmentPackage.eINSTANCE;
	}

} //ApogyEarthSurfaceEnvironmentFactoryImpl
