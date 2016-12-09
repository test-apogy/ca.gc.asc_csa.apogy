package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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

import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point2d;
import javax.vecmath.Point3f;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentUIPackageImpl extends EPackageImpl implements ApogyCoreEnvironmentUIPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass starFieldPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sunPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType listEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType point2dEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType color3fEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType point3fEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType xySeriesEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType xyPlotEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType xyDataItemEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType abstractXYAnnotationEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType chartCompositeEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType jFreeChartEDataType = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyCoreEnvironmentUIPackageImpl()
  {
		super(eNS_URI, ApogyCoreEnvironmentUIFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyCoreEnvironmentUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyCoreEnvironmentUIPackage init()
  {
		if (isInited) return (ApogyCoreEnvironmentUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreEnvironmentUIPackageImpl theApogyCoreEnvironmentUIPackage = (ApogyCoreEnvironmentUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreEnvironmentUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreEnvironmentUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreEnvironmentUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreEnvironmentUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreEnvironmentUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreEnvironmentUIPackage.eNS_URI, theApogyCoreEnvironmentUIPackage);
		return theApogyCoreEnvironmentUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStarFieldPresentation()
  {
		return starFieldPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStarFieldPresentation_CutOffMagnitude()
  {
		return (EAttribute)starFieldPresentationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSunPresentation()
  {
		return sunPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getList()
  {
		return listEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint2d()
  {
		return point2dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getColor3f()
  {
		return color3fEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint3f()
  {
		return point3fEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getXYSeries()
  {
		return xySeriesEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getXYPlot()
  {
		return xyPlotEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getXYDataItem()
  {
		return xyDataItemEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getAbstractXYAnnotation()
  {
		return abstractXYAnnotationEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getChartComposite()
  {
		return chartCompositeEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getJFreeChart()
  {
		return jFreeChartEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentUIFactory getApogyCoreEnvironmentUIFactory() {
		return (ApogyCoreEnvironmentUIFactory)getEFactoryInstance();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		starFieldPresentationEClass = createEClass(STAR_FIELD_PRESENTATION);
		createEAttribute(starFieldPresentationEClass, STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE);

		sunPresentationEClass = createEClass(SUN_PRESENTATION);

		// Create data types
		listEDataType = createEDataType(LIST);
		point2dEDataType = createEDataType(POINT2D);
		color3fEDataType = createEDataType(COLOR3F);
		point3fEDataType = createEDataType(POINT3F);
		xySeriesEDataType = createEDataType(XY_SERIES);
		xyPlotEDataType = createEDataType(XY_PLOT);
		xyDataItemEDataType = createEDataType(XY_DATA_ITEM);
		abstractXYAnnotationEDataType = createEDataType(ABSTRACT_XY_ANNOTATION);
		chartCompositeEDataType = createEDataType(CHART_COMPOSITE);
		jFreeChartEDataType = createEDataType(JFREE_CHART);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		starFieldPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		sunPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());

		// Initialize classes, features, and operations; add parameters
		initEClass(starFieldPresentationEClass, StarFieldPresentation.class, "StarFieldPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStarFieldPresentation_CutOffMagnitude(), theEcorePackage.getEFloat(), "cutOffMagnitude", "6.0", 0, 1, StarFieldPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sunPresentationEClass, SunPresentation.class, "SunPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point2dEDataType, Point2d.class, "Point2d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3fEDataType, Point3f.class, "Point3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xySeriesEDataType, XYSeries.class, "XYSeries", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xyPlotEDataType, XYPlot.class, "XYPlot", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xyDataItemEDataType, XYDataItem.class, "XYDataItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(abstractXYAnnotationEDataType, AbstractXYAnnotation.class, "AbstractXYAnnotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chartCompositeEDataType, ChartComposite.class, "ChartComposite", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jFreeChartEDataType, JFreeChart.class, "JFreeChart", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

  /**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCoreEnvironmentUI",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironmentUI",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.ui/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.ui/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment"
		   });
	}

} //ApogyCoreEnvironmentUIPackageImpl
