/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

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
import org.eclipse.symphony.core.environment.ui.MapRuler;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIFactory;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;
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
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.MapRulerImpl#getRulerColor <em>Ruler Color</em>}</li>
 * </ul>
 * </p>
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
  protected static final Color3f RULER_COLOR_EDEFAULT = (Color3f)SymphonyEnvironmentUIFactory.eINSTANCE.createFromString(SymphonyEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");
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
  public static final double ARROW_HEAD_LENGHT = 2.0;
  public static final double ARROW_HEAD_ANGLE_RADIANS = Math.toRadians(45.0);

  private XYShapeAnnotation line = null;
  private XYTextAnnotation lenghtText = null;	
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
		return SymphonyEnvironmentUIPackage.Literals.MAP_RULER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.MAP_RULER__RULER_COLOR, oldRulerColor, rulerColor));
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
			case SymphonyEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
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
			case SymphonyEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
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
			case SymphonyEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
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
			case SymphonyEnvironmentUIPackage.MAP_RULER__RULER_COLOR:
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
		  if(lenghtText != null) annotations.add(lenghtText);
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
	  if(rulerLength >= 2 * ARROW_HEAD_LENGHT)
	  {
		  return ARROW_HEAD_LENGHT;
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
 	     	
  		  double lenght = p0.distance(p1);
  		  DecimalFormat decimalFormat = new DecimalFormat("0.0");
 	     	
  		  double xCenter = (p0.x + p1.x) / 2.0;
  		  double yCenter = (p0.y + p1.y) / 2.0;
 	     						   	     		   	     			
  		  double heading = Math.atan2(p1.y - p0.y, p1.x - p0.x);	
  		  DecimalFormat headingFormat = new DecimalFormat("0.0");
  		  lenghtText = new XYTextAnnotation(" " + decimalFormat.format(lenght) + " m (" + headingFormat.format(Math.toDegrees(heading)) + DEGREE_STRING + ") ", xCenter, yCenter);
 	     	
  		  lenghtText.setFont(new Font("SansSerif", Font.BOLD, 11));
  		  lenghtText.setPaint(getRulerColorAWT());
  		  lenghtText.setTextAnchor(TextAnchor.HALF_ASCENT_RIGHT);
  		  lenghtText.setRotationAnchor(TextAnchor.HALF_ASCENT_RIGHT);
 	     	
  		  // Adds the arrow head
  		  double offsetAngle = Math.PI - (ARROW_HEAD_ANGLE_RADIANS / 2.0);
 		
  		  double xEnd = p1.x;
  		  double yEnd = p1.y;
	   		  
  		  double thetha = Math.atan2(p1.y - p0.y, p1.x - p0.x);
	   		
  		  double xArrow1 = xEnd + getArrowHeadLength(lenght) * Math.cos(thetha + offsetAngle);
  		  double yArrow1 = yEnd + getArrowHeadLength(lenght) * Math.sin(thetha + offsetAngle);
  		  Line2D arrow1 = new Line2D.Double(xEnd, yEnd, xArrow1, yArrow1);
  		  p1Arrow1 = new XYShapeAnnotation(arrow1, new BasicStroke(1.0f), getRulerColorAWT());
	   		    
  		  double xArrow2 = xEnd + getArrowHeadLength(lenght) * Math.cos(thetha - offsetAngle);
  		  double yArrow2 = yEnd + getArrowHeadLength(lenght) * Math.sin(thetha - offsetAngle);
  		  Line2D arrow2 = new Line2D.Double(xEnd, yEnd, xArrow2, yArrow2);
  		  p1Arrow2 = new XYShapeAnnotation(arrow2, new BasicStroke(1.0f), getRulerColorAWT());
	   	     	
  		  double textAngle = Math.toRadians(90.0) - thetha;			   	     	
  		  if(Math.abs(textAngle) >= Math.toRadians(90))
  		  {
  			  textAngle += Math.toRadians(180);		
  		  }
  		  lenghtText.setRotationAngle(textAngle);	
	  }
	  else
	  {
		  line = null;
		  lenghtText = null;
		  p1Arrow1 = null;
		  p1Arrow2 = null;				  
	  }	  
  } 
} //MapRulerImpl
