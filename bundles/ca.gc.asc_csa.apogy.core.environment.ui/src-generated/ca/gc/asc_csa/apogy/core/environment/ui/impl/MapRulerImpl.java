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

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point2d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.environment.ui.MapRuler;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.jfree.ui.TextAnchor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Ruler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapRulerImpl#getRulerColor <em>Ruler Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapRulerImpl extends MapToolImpl implements MapRuler
{
	/**
	 * The default value of the '{@link #getRulerColor() <em>Ruler Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRulerColor()
	 * @generated
	 * @ordered
	 */
  protected static final Color3f RULER_COLOR_EDEFAULT = (Color3f)ApogyCoreEnvironmentUIFactory.eINSTANCE.createFromString(ApogyCoreEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");
  /**
	 * The cached value of the '{@link #getRulerColor() <em>Ruler Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRulerColor()
	 * @generated
	 * @ordered
	 */
  protected Color3f rulerColor = RULER_COLOR_EDEFAULT;
  
  public static final String DEGREE_STRING = 	"\u00b0";
  public static final double FEATURE_RADIUS = 0.25;
  public static final double ARROW_HEAD_LENGTH = 2.0;
  public static final double ARROW_HEAD_ANGLE_RADIANS = Math.toRadians(45.0);

  private XYShapeAnnotation line = null;
  private XYTextAnnotation lengthText = null;	
  private XYShapeAnnotation annotation0 = null;
  private XYShapeAnnotation annotation1 = null;
  private XYShapeAnnotation p1Arrow1 = null;
  private XYShapeAnnotation p1Arrow2 = null;
	
  private Point2d p0 = null;
  private Point2d p1 = null;

	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapRulerImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreEnvironmentUIPackage.Literals.MAP_RULER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Color3f getRulerColor()
  {
		return rulerColor;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setRulerColor(Color3f newRulerColor)
  {
	  setRulerColorGen(newRulerColor);
	  updateRuler();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRulerColorGen(Color3f newRulerColor)
  {
		Color3f oldRulerColor = rulerColor;
		rulerColor = newRulerColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.MAP_RULER__RULER_COLOR, oldRulerColor, rulerColor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
				return getRulerColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
				setRulerColor((Color3f)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
				setRulerColor(RULER_COLOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
				return RULER_COLOR_EDEFAULT == null ? rulerColor != null : !RULER_COLOR_EDEFAULT.equals(rulerColor);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rulerColor: ");
		result.append(rulerColor);
		result.append(')');
		return result.toString();
	}

  @Override
  public List<AbstractXYAnnotation> getXYShapeAnnotation() 
  {
	  List<AbstractXYAnnotation> annotations = new ArrayList<AbstractXYAnnotation>();
	  
	  if(isVisible())
	  {
		  if(line != null) annotations.add(line);
		  if(lengthText != null) annotations.add(lengthText);
		  if(annotation0 != null) annotations.add(annotation0);
		  if(annotation1 != null) annotations.add(annotation1);
		  if(p1Arrow1 != null) annotations.add(p1Arrow1);
		  if(p1Arrow2 != null) annotations.add(p1Arrow2);
	  }
	  
	  return annotations;
  }
  
  @Override
  public void initialize(ChartComposite composite, JFreeChart chart) 
  {	
  }
  
  @Override
  public void positionSelected(int mouseButton, double x, double y) 
  {
	  if(isActive())
	  {
		  switch(mouseButton)
		  {
			  	case java.awt.event.MouseEvent.BUTTON1:
				{			    			    		
					if(p0 == null)
					{
						p0 = new Point2d(x,y);			    					    			
					}
					else if(p1 == null)
					{			    				
						p1 = new Point2d(x,y);						    				
					}
					else 
					{
						p0 = p1;
						p1 = new Point2d(x,y);
					}
				}
				break;
				case java.awt.event.MouseEvent.BUTTON2:
				{			    						    			
					p0 = null;
					p1 = null;		    				
				}
				break;
		  }
		  updateRuler();
	  }
  }
      
  protected double getArrowHeadLength(double rulerLength)
  {
	  if(rulerLength >= 2 * ARROW_HEAD_LENGTH)
	  {
		  return ARROW_HEAD_LENGTH;
	  }
	  else
	  {
		  return rulerLength / 5.0;
	  }
  }
  
  protected Color getRulerColorAWT()
  {
	  return new Color(getRulerColor().getX(), getRulerColor().getY(), getRulerColor().getZ());
  }
  
  protected void updateRuler()
  {
	  if(p0 != null)
	  {
		  Ellipse2D e = new Ellipse2D.Double(p0.x - FEATURE_RADIUS, p0.y - FEATURE_RADIUS, 2 * FEATURE_RADIUS, 2 * FEATURE_RADIUS);
		  annotation0 = new XYShapeAnnotation(e, new BasicStroke(1f), getRulerColorAWT());	
	  }
	  else
	  {
		  annotation0 = null;
	  }
		  
	  if(p1 != null)
	  {
		 Ellipse2D e = new Ellipse2D.Double(p1.x - FEATURE_RADIUS, p1.y - FEATURE_RADIUS, 2 * FEATURE_RADIUS, 2 * FEATURE_RADIUS);
		 annotation1 = new XYShapeAnnotation(e, new BasicStroke(1f), getRulerColorAWT());												
	  }
	  else
	  {
		  annotation1 = null;
	  }
	  
	  if(p0 != null && p1 != null)
	  {
		  Line2D line2D = new Line2D.Double(p0.x, p0.y, p1.x, p1.y);
  		  line = new XYShapeAnnotation(line2D, new BasicStroke(1.0f), getRulerColorAWT());					   	     	
 	     	
  		  double length = p0.distance(p1);
  		  DecimalFormat decimalFormat = new DecimalFormat("0.0");
 	     	
  		  double xCenter = (p0.x + p1.x) / 2.0;
  		  double yCenter = (p0.y + p1.y) / 2.0;
 	     						   	     		   	     			
  		  double heading = Math.atan2(p1.y - p0.y, p1.x - p0.x);	
  		  DecimalFormat headingFormat = new DecimalFormat("0.0");
  		  lengthText = new XYTextAnnotation(" " + decimalFormat.format(length) + " m (" + headingFormat.format(Math.toDegrees(heading)) + DEGREE_STRING + ") ", xCenter, yCenter);
 	     	
  		  lengthText.setFont(new Font("SansSerif", Font.BOLD, 11));
  		  lengthText.setPaint(getRulerColorAWT());
  		  lengthText.setTextAnchor(TextAnchor.HALF_ASCENT_RIGHT);
  		  lengthText.setRotationAnchor(TextAnchor.HALF_ASCENT_RIGHT);
 	     	
  		  // Adds the arrow head
  		  double offsetAngle = Math.PI - (ARROW_HEAD_ANGLE_RADIANS / 2.0);
 		
  		  double xEnd = p1.x;
  		  double yEnd = p1.y;
	   		  
  		  double thetha = Math.atan2(p1.y - p0.y, p1.x - p0.x);
	   		
  		  double xArrow1 = xEnd + getArrowHeadLength(length) * Math.cos(thetha + offsetAngle);
  		  double yArrow1 = yEnd + getArrowHeadLength(length) * Math.sin(thetha + offsetAngle);
  		  Line2D arrow1 = new Line2D.Double(xEnd, yEnd, xArrow1, yArrow1);
  		  p1Arrow1 = new XYShapeAnnotation(arrow1, new BasicStroke(1.0f), getRulerColorAWT());
	   		    
  		  double xArrow2 = xEnd + getArrowHeadLength(length) * Math.cos(thetha - offsetAngle);
  		  double yArrow2 = yEnd + getArrowHeadLength(length) * Math.sin(thetha - offsetAngle);
  		  Line2D arrow2 = new Line2D.Double(xEnd, yEnd, xArrow2, yArrow2);
  		  p1Arrow2 = new XYShapeAnnotation(arrow2, new BasicStroke(1.0f), getRulerColorAWT());
	   	     	
  		  double textAngle = Math.toRadians(90.0) - thetha;			   	     	
  		  if(Math.abs(textAngle) >= Math.toRadians(90))
  		  {
  			  textAngle += Math.toRadians(180);		
  		  }
  		  lengthText.setRotationAngle(textAngle);	
	  }
	  else
	  {
		  line = null;
		  lengthText = null;
		  p1Arrow1 = null;
		  p1Arrow2 = null;				  
	  }	  
  } 
} //MapRulerImpl
