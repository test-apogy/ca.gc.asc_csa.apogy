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
package ca.gc.asc_csa.apogy.core.environment.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreEnvironmentUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreEnvironmentUI' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment'"
 * @generated
 */
public interface ApogyCoreEnvironmentUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreEnvironmentUIPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.StarFieldPresentationImpl <em>Star Field Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.StarFieldPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getStarFieldPresentation()
	 * @generated
	 */
	int STAR_FIELD_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Cut Off Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Star Field Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Star Field Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.SunPresentationImpl <em>Sun Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.SunPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getSunPresentation()
	 * @generated
	 */
	int SUN_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The number of structural features of the '<em>Sun Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sun Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getList()
	 * @generated
	 */
	int LIST = 2;

	/**
	 * The meta object id for the '<em>Point2d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point2d
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getPoint2d()
	 * @generated
	 */
	int POINT2D = 3;

	/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 4;

	/**
	 * The meta object id for the '<em>Point3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3f
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getPoint3f()
	 * @generated
	 */
	int POINT3F = 5;

	/**
	 * The meta object id for the '<em>XY Series</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.data.xy.XYSeries
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getXYSeries()
	 * @generated
	 */
	int XY_SERIES = 6;

	/**
	 * The meta object id for the '<em>XY Plot</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.chart.plot.XYPlot
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getXYPlot()
	 * @generated
	 */
	int XY_PLOT = 7;

	/**
	 * The meta object id for the '<em>XY Data Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.data.xy.XYDataItem
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getXYDataItem()
	 * @generated
	 */
	int XY_DATA_ITEM = 8;

	/**
	 * The meta object id for the '<em>Abstract XY Annotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.chart.annotations.AbstractXYAnnotation
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getAbstractXYAnnotation()
	 * @generated
	 */
	int ABSTRACT_XY_ANNOTATION = 9;

	/**
	 * The meta object id for the '<em>Chart Composite</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.experimental.chart.swt.ChartComposite
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getChartComposite()
	 * @generated
	 */
	int CHART_COMPOSITE = 10;

	/**
	 * The meta object id for the '<em>JFree Chart</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jfree.chart.JFreeChart
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getJFreeChart()
	 * @generated
	 */
	int JFREE_CHART = 11;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation <em>Star Field Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star Field Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation
	 * @generated
	 */
	EClass getStarFieldPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation#getCutOffMagnitude <em>Cut Off Magnitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Off Magnitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation#getCutOffMagnitude()
	 * @see #getStarFieldPresentation()
	 * @generated
	 */
	EAttribute getStarFieldPresentation_CutOffMagnitude();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation <em>Sun Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sun Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation
	 * @generated
	 */
	EClass getSunPresentation();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point2d <em>Point2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point2d</em>'.
	 * @see javax.vecmath.Point2d
	 * @model instanceClass="javax.vecmath.Point2d"
	 * @generated
	 */
	EDataType getPoint2d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Color3f <em>Color3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color3f</em>'.
	 * @see javax.vecmath.Color3f
	 * @model instanceClass="javax.vecmath.Color3f"
	 * @generated
	 */
	EDataType getColor3f();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3f <em>Point3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3f</em>'.
	 * @see javax.vecmath.Point3f
	 * @model instanceClass="javax.vecmath.Point3f"
	 * @generated
	 */
	EDataType getPoint3f();

	/**
	 * Returns the meta object for data type '{@link org.jfree.data.xy.XYSeries <em>XY Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Series</em>'.
	 * @see org.jfree.data.xy.XYSeries
	 * @model instanceClass="org.jfree.data.xy.XYSeries"
	 * @generated
	 */
	EDataType getXYSeries();

	/**
	 * Returns the meta object for data type '{@link org.jfree.chart.plot.XYPlot <em>XY Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Plot</em>'.
	 * @see org.jfree.chart.plot.XYPlot
	 * @model instanceClass="org.jfree.chart.plot.XYPlot"
	 * @generated
	 */
	EDataType getXYPlot();

	/**
	 * Returns the meta object for data type '{@link org.jfree.data.xy.XYDataItem <em>XY Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Data Item</em>'.
	 * @see org.jfree.data.xy.XYDataItem
	 * @model instanceClass="org.jfree.data.xy.XYDataItem"
	 * @generated
	 */
	EDataType getXYDataItem();

	/**
	 * Returns the meta object for data type '{@link org.jfree.chart.annotations.AbstractXYAnnotation <em>Abstract XY Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstract XY Annotation</em>'.
	 * @see org.jfree.chart.annotations.AbstractXYAnnotation
	 * @model instanceClass="org.jfree.chart.annotations.AbstractXYAnnotation"
	 * @generated
	 */
	EDataType getAbstractXYAnnotation();

	/**
	 * Returns the meta object for data type '{@link org.jfree.experimental.chart.swt.ChartComposite <em>Chart Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Chart Composite</em>'.
	 * @see org.jfree.experimental.chart.swt.ChartComposite
	 * @model instanceClass="org.jfree.experimental.chart.swt.ChartComposite"
	 * @generated
	 */
	EDataType getChartComposite();

	/**
	 * Returns the meta object for data type '{@link org.jfree.chart.JFreeChart <em>JFree Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JFree Chart</em>'.
	 * @see org.jfree.chart.JFreeChart
	 * @model instanceClass="org.jfree.chart.JFreeChart"
	 * @generated
	 */
	EDataType getJFreeChart();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreEnvironmentUIFactory getApogyCoreEnvironmentUIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.StarFieldPresentationImpl <em>Star Field Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.StarFieldPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getStarFieldPresentation()
		 * @generated
		 */
		EClass STAR_FIELD_PRESENTATION = eINSTANCE.getStarFieldPresentation();

		/**
		 * The meta object literal for the '<em><b>Cut Off Magnitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE = eINSTANCE.getStarFieldPresentation_CutOffMagnitude();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.SunPresentationImpl <em>Sun Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.SunPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getSunPresentation()
		 * @generated
		 */
		EClass SUN_PRESENTATION = eINSTANCE.getSunPresentation();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Point2d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point2d
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getPoint2d()
		 * @generated
		 */
		EDataType POINT2D = eINSTANCE.getPoint2d();

		/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();

		/**
		 * The meta object literal for the '<em>Point3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3f
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getPoint3f()
		 * @generated
		 */
		EDataType POINT3F = eINSTANCE.getPoint3f();

		/**
		 * The meta object literal for the '<em>XY Series</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.data.xy.XYSeries
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getXYSeries()
		 * @generated
		 */
		EDataType XY_SERIES = eINSTANCE.getXYSeries();

		/**
		 * The meta object literal for the '<em>XY Plot</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.chart.plot.XYPlot
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getXYPlot()
		 * @generated
		 */
		EDataType XY_PLOT = eINSTANCE.getXYPlot();

		/**
		 * The meta object literal for the '<em>XY Data Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.data.xy.XYDataItem
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getXYDataItem()
		 * @generated
		 */
		EDataType XY_DATA_ITEM = eINSTANCE.getXYDataItem();

		/**
		 * The meta object literal for the '<em>Abstract XY Annotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.chart.annotations.AbstractXYAnnotation
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getAbstractXYAnnotation()
		 * @generated
		 */
		EDataType ABSTRACT_XY_ANNOTATION = eINSTANCE.getAbstractXYAnnotation();

		/**
		 * The meta object literal for the '<em>Chart Composite</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.experimental.chart.swt.ChartComposite
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getChartComposite()
		 * @generated
		 */
		EDataType CHART_COMPOSITE = eINSTANCE.getChartComposite();

		/**
		 * The meta object literal for the '<em>JFree Chart</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jfree.chart.JFreeChart
		 * @see ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIPackageImpl#getJFreeChart()
		 * @generated
		 */
		EDataType JFREE_CHART = eINSTANCE.getJFreeChart();

	}

} //ApogyCoreEnvironmentUIPackage
