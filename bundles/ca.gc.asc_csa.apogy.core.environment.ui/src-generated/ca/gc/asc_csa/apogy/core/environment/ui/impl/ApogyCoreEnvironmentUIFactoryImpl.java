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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.experimental.chart.swt.ChartComposite;

import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentUIFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCoreEnvironmentUIFactory init()
  {
		try {
			ApogyCoreEnvironmentUIFactory theApogyCoreEnvironmentUIFactory = (ApogyCoreEnvironmentUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentUIPackage.eNS_URI);
			if (theApogyCoreEnvironmentUIFactory != null) {
				return theApogyCoreEnvironmentUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreEnvironmentUIFactoryImpl()
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
			case ApogyCoreEnvironmentUIPackage.STAR_FIELD_PRESENTATION: return createStarFieldPresentation();
			case ApogyCoreEnvironmentUIPackage.SUN_PRESENTATION: return createSunPresentation();
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
			case ApogyCoreEnvironmentUIPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.POINT2D:
				return createPoint2dFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.POINT3F:
				return createPoint3fFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.XY_SERIES:
				return createXYSeriesFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.XY_PLOT:
				return createXYPlotFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.XY_DATA_ITEM:
				return createXYDataItemFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_XY_ANNOTATION:
				return createAbstractXYAnnotationFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.CHART_COMPOSITE:
				return createChartCompositeFromString(eDataType, initialValue);
			case ApogyCoreEnvironmentUIPackage.JFREE_CHART:
				return createJFreeChartFromString(eDataType, initialValue);
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
			case ApogyCoreEnvironmentUIPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.POINT2D:
				return convertPoint2dToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.POINT3F:
				return convertPoint3fToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.XY_SERIES:
				return convertXYSeriesToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.XY_PLOT:
				return convertXYPlotToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.XY_DATA_ITEM:
				return convertXYDataItemToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_XY_ANNOTATION:
				return convertAbstractXYAnnotationToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.CHART_COMPOSITE:
				return convertChartCompositeToString(eDataType, instanceValue);
			case ApogyCoreEnvironmentUIPackage.JFREE_CHART:
				return convertJFreeChartToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StarFieldPresentation createStarFieldPresentation()
  {
		StarFieldPresentationImpl starFieldPresentation = new StarFieldPresentationImpl();
		return starFieldPresentation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SunPresentation createSunPresentation()
  {
		SunPresentationImpl sunPresentation = new SunPresentationImpl();
		return sunPresentation;
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
   * @generated_NOT
   */
  public Point2d createPoint2dFromString(EDataType eDataType, String initialValue)
  {
	  String[] values = initialValue.split(",");
	  
	  double x = Double.parseDouble(values[0]);
	  double y = Double.parseDouble(values[1]);
	  
	  return new Point2d(x, y);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertPoint2dToString(EDataType eDataType, Object instanceValue)
  {
	  Point2d point2d = (Point2d) instanceValue;
	  
	  return point2d.x + "," + point2d.y;
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
   * @generated_NOT
   */
  public Point3f createPoint3fFromString(EDataType eDataType, String initialValue)
  {
	  Point3f point3f =  new Point3f();
	  
	  String[] values = initialValue.split(",");
	  
	  point3f.x = Float.parseFloat(values[0]);
	  point3f.y = Float.parseFloat(values[1]);
	  point3f.z = Float.parseFloat(values[2]);
	  
	  return point3f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertPoint3fToString(EDataType eDataType, Object instanceValue)
  {
	  Point3f point3f = (Point3f) instanceValue;
	  
	  String string = point3f.x + "," + point3f.y + "," + point3f.z;
	  
	  return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public XYSeries createXYSeriesFromString(EDataType eDataType, String initialValue)
  {
	  XYSeries xySeries = new XYSeries("Unamed", false, true); 		
	  
	  String[] values = initialValue.split(",");
	  
	  int i = 0;
	  while(i+1 < values.length)
	  {
		  
		  
		  double x = Double.parseDouble(values[i]);
		  double y = Double.parseDouble(values[i+1]);
		  
		  XYDataItem xyDataItem = new XYDataItem(x, y);
		  xySeries.add(xyDataItem);
		  
		  i+=2;		  
	  }
	  
	  return xySeries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertXYSeriesToString(EDataType eDataType, Object instanceValue)
  {
	  String string = new String();
	  
	  XYSeries xySeries = (XYSeries) instanceValue;
	  
	  for(int i = 0; i < xySeries.getItemCount(); i++)
	  {
		  XYDataItem xyDataItem = xySeries.getDataItem(i);
		  
		  string += xyDataItem.getX() + "," + xyDataItem.getY();
		  
		  if(i+1 < xySeries.getItemCount()) string += ",";
	  }
	  
	  return string;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public XYPlot createXYPlotFromString(EDataType eDataType, String initialValue)
  {
		return (XYPlot)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertXYPlotToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public XYDataItem createXYDataItemFromString(EDataType eDataType, String initialValue)
  {
		return (XYDataItem)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertXYDataItemToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractXYAnnotation createAbstractXYAnnotationFromString(EDataType eDataType, String initialValue)
  {
		return (AbstractXYAnnotation)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertAbstractXYAnnotationToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChartComposite createChartCompositeFromString(EDataType eDataType, String initialValue)
  {
		return (ChartComposite)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertChartCompositeToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JFreeChart createJFreeChartFromString(EDataType eDataType, String initialValue)
  {
		return (JFreeChart)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertJFreeChartToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentUIPackage getApogyCoreEnvironmentUIPackage() {
		return (ApogyCoreEnvironmentUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCoreEnvironmentUIPackage getPackage()
  {
		return ApogyCoreEnvironmentUIPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentUIFactoryImpl
