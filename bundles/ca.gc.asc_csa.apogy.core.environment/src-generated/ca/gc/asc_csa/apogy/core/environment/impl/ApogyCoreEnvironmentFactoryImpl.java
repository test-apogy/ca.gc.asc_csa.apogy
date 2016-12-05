package ca.gc.asc_csa.apogy.core.environment.impl;
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

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import javax.vecmath.Color3f;
import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.Earth;
import ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList;
import ca.gc.asc_csa.apogy.core.environment.TimeSourcesList;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.WorksitesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCoreEnvironmentFactory init()
  {
		try {
			ApogyCoreEnvironmentFactory theApogyCoreEnvironmentFactory = (ApogyCoreEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentPackage.eNS_URI);
			if (theApogyCoreEnvironmentFactory != null) {
				return theApogyCoreEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreEnvironmentFactoryImpl()
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
			case ApogyCoreEnvironmentPackage.APOGY_ENVIRONMENT: return createApogyEnvironment();
			case ApogyCoreEnvironmentPackage.TIME_SOURCES_LIST: return createTimeSourcesList();
			case ApogyCoreEnvironmentPackage.WORKSITES_LIST: return createWorksitesList();
			case ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST: return createSurfaceLocationsList();
			case ApogyCoreEnvironmentPackage.SKY: return createSky();
			case ApogyCoreEnvironmentPackage.SUN: return createSun();
			case ApogyCoreEnvironmentPackage.EARTH: return createEarth();
			case ApogyCoreEnvironmentPackage.MOON: return createMoon();
			case ApogyCoreEnvironmentPackage.ENVIRONMENT_UTILITIES: return createEnvironmentUtilities();
			case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE: return createApogyCoreEnvironmentFacade();
			case ApogyCoreEnvironmentPackage.STAR: return createStar();
			case ApogyCoreEnvironmentPackage.STAR_FIELD: return createStarField();
			case ApogyCoreEnvironmentPackage.EQUATORIAL_COORDINATES: return createEquatorialCoordinates();
			case ApogyCoreEnvironmentPackage.WORKSITE_NODE: return createWorksiteNode();
			case ApogyCoreEnvironmentPackage.SKY_NODE: return createSkyNode();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreEnvironmentPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreEnvironmentPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment createApogyEnvironment() {
		ApogyEnvironmentImpl apogyEnvironment = new ApogyEnvironmentImpl();
		return apogyEnvironment;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSourcesList createTimeSourcesList() {
		TimeSourcesListImpl timeSourcesList = new TimeSourcesListImpl();
		return timeSourcesList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorksitesList createWorksitesList() {
		WorksitesListImpl worksitesList = new WorksitesListImpl();
		return worksitesList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceLocationsList createSurfaceLocationsList() {
		SurfaceLocationsListImpl surfaceLocationsList = new SurfaceLocationsListImpl();
		return surfaceLocationsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EquatorialCoordinates createEquatorialCoordinates()
  {
		EquatorialCoordinatesImpl equatorialCoordinates = new EquatorialCoordinatesImpl();
		return equatorialCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sky createSky()
  {
		SkyImpl sky = new SkyImpl();
		return sky;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sun createSun()
  {
		SunImpl sun = new SunImpl();
		return sun;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Earth createEarth() {
		EarthImpl earth = new EarthImpl();
		return earth;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Moon createMoon()
  {
		MoonImpl moon = new MoonImpl();
		return moon;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnvironmentUtilities createEnvironmentUtilities()
  {
		EnvironmentUtilitiesImpl environmentUtilities = new EnvironmentUtilitiesImpl();
		return environmentUtilities;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentFacade createApogyCoreEnvironmentFacade() {
		ApogyCoreEnvironmentFacadeImpl apogyCoreEnvironmentFacade = new ApogyCoreEnvironmentFacadeImpl();
		return apogyCoreEnvironmentFacade;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Star createStar()
  {
		StarImpl star = new StarImpl();
		return star;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StarField createStarField()
  {
		StarFieldImpl starField = new StarFieldImpl();
		return starField;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode createWorksiteNode()
  {
		WorksiteNodeImpl worksiteNode = new WorksiteNodeImpl();
		return worksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SkyNode createSkyNode()
  {
		SkyNodeImpl skyNode = new SkyNodeImpl();
		return skyNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<?> createListFromString(EDataType eDataType, String initialValue)
  {
		return (List<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertListToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date createDateFromString(EDataType eDataType, String initialValue)
  {
		return (Date)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDateToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Point3d createPoint3dFromString(EDataType eDataType, String initialValue)
  {
		return (Point3d)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPoint3dToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Color3f createColor3fFromString(EDataType eDataType, String initialValue)
  {
	  Color3f color3f = new Color3f();
	  
	  String[] values = initialValue.split(",");
	  
	  color3f.x = Float.parseFloat(values[0]);
	  color3f.y = Float.parseFloat(values[1]);
	  color3f.z = Float.parseFloat(values[2]);

	  return color3f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertColor3fToString(EDataType eDataType, Object instanceValue)
  {
	  Color3f color3f = (Color3f) instanceValue;
	  
	  String string = color3f.x + "," + color3f.y + "," + color3f.z;
	  
	  return string;
  }


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentPackage getApogyCoreEnvironmentPackage() {
		return (ApogyCoreEnvironmentPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCoreEnvironmentPackage getPackage()
  {
		return ApogyCoreEnvironmentPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentFactoryImpl
