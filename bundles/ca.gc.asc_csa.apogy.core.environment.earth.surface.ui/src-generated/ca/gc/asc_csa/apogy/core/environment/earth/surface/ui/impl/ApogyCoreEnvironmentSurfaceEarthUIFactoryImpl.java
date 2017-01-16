/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl;

import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DTool;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.SunVector3DToolNodePresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentSurfaceEarthUIFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentSurfaceEarthUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentSurfaceEarthUIFactory init() {
		try {
			ApogyCoreEnvironmentSurfaceEarthUIFactory theApogyCoreEnvironmentSurfaceEarthUIFactory = (ApogyCoreEnvironmentSurfaceEarthUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentSurfaceEarthUIPackage.eNS_URI);
			if (theApogyCoreEnvironmentSurfaceEarthUIFactory != null) {
				return theApogyCoreEnvironmentSurfaceEarthUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentSurfaceEarthUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUIFactoryImpl() {
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
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION: return createEarthSurfaceWorksitePresentation();
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SKY_PRESENTATION: return createEarthSkyPresentation();
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.MOON_PRESENTATION: return createMoonPresentation();
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.SUN_VECTOR3_DTOOL: return createSunVector3DTool();
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.SUN_VECTOR3_DTOOL_NODE: return createSunVector3DToolNode();
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.SUN_VECTOR3_DTOOL_NODE_PRESENTATION: return createSunVector3DToolNodePresentation();
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_UI_UTILITIES: return createEarthSurfaceUIUtilities();
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
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.POINT3F:
				return createPoint3fFromString(eDataType, initialValue);
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
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.POINT3F:
				return convertPoint3fToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceWorksitePresentation createEarthSurfaceWorksitePresentation() {
		EarthSurfaceWorksitePresentationImpl earthSurfaceWorksitePresentation = new EarthSurfaceWorksitePresentationImpl();
		return earthSurfaceWorksitePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSkyPresentation createEarthSkyPresentation() {
		EarthSkyPresentationImpl earthSkyPresentation = new EarthSkyPresentationImpl();
		return earthSkyPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoonPresentation createMoonPresentation() {
		MoonPresentationImpl moonPresentation = new MoonPresentationImpl();
		return moonPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DTool createSunVector3DTool() {
		SunVector3DToolImpl sunVector3DTool = new SunVector3DToolImpl();
		return sunVector3DTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolNode createSunVector3DToolNode() {
		SunVector3DToolNodeImpl sunVector3DToolNode = new SunVector3DToolNodeImpl();
		return sunVector3DToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolNodePresentation createSunVector3DToolNodePresentation() {
		SunVector3DToolNodePresentationImpl sunVector3DToolNodePresentation = new SunVector3DToolNodePresentationImpl();
		return sunVector3DToolNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceUIUtilities createEarthSurfaceUIUtilities() {
		EarthSurfaceUIUtilitiesImpl earthSurfaceUIUtilities = new EarthSurfaceUIUtilitiesImpl();
		return earthSurfaceUIUtilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Color3f createColor3fFromString(EDataType eDataType, String initialValue) 
	{
		String[] rgb = initialValue.split(",");
		float r = Float.parseFloat(rgb[0]);
		float g = Float.parseFloat(rgb[1]);
		float b = Float.parseFloat(rgb[2]);
		
		Color3f color = new Color3f(r, g, b);
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String convertColor3fToString(EDataType eDataType, Object instanceValue) 
	{
		Color3f color = (Color3f) instanceValue;
		String string = color.toString();
		string = string.replace("(", "");
		string = string.replace(")", "");
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3f createPoint3fFromString(EDataType eDataType, String initialValue) {
		return (Point3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUIPackage getApogyCoreEnvironmentSurfaceEarthUIPackage() {
		return (ApogyCoreEnvironmentSurfaceEarthUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentSurfaceEarthUIPackage getPackage() {
		return ApogyCoreEnvironmentSurfaceEarthUIPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentSurfaceEarthUIFactoryImpl
