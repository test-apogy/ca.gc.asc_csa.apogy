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
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.VehicleVariableAnnotation;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.ui.TextAnchor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Vehicle Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.VehicleVariableAnnotationImpl#getVehicleLength <em>Vehicle Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.VehicleVariableAnnotationImpl#getVehicleWidth <em>Vehicle Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleVariableAnnotationImpl extends PoseVariableAnnotationImpl implements VehicleVariableAnnotation
{
	private XYShapeAnnotation vehicleAnnotation = null;
	
  /**
	 * The default value of the '{@link #getVehicleLength() <em>Vehicle Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVehicleLength()
	 * @generated
	 * @ordered
	 */
  protected static final double VEHICLE_LENGTH_EDEFAULT = 1.0;

  /**
	 * The cached value of the '{@link #getVehicleLength() <em>Vehicle Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVehicleLength()
	 * @generated
	 * @ordered
	 */
  protected double vehicleLength = VEHICLE_LENGTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getVehicleWidth() <em>Vehicle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVehicleWidth()
	 * @generated
	 * @ordered
	 */
  protected static final double VEHICLE_WIDTH_EDEFAULT = 0.5;

  /**
	 * The cached value of the '{@link #getVehicleWidth() <em>Vehicle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVehicleWidth()
	 * @generated
	 * @ordered
	 */
  protected double vehicleWidth = VEHICLE_WIDTH_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VehicleVariableAnnotationImpl()
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
		return ApogyCoreEnvironmentUIPackage.Literals.VEHICLE_VARIABLE_ANNOTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getVehicleLength()
  {
		return vehicleLength;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setVehicleLength(double newVehicleLength)
  {
	  setVehicleLengthGen(newVehicleLength);
//	  
//	  if(getTrajectoryProvider() != null && getTrajectoryProvider().getLatestPosition() != null)
//	  {
//			double newAzimuth = getTrajectoryProvider().getAzimuthAngle();								
//			double x = getTrajectoryProvider().getLatestPosition().getXValue();
//			double y = getTrajectoryProvider().getLatestPosition().getYValue();		
//			updatePointer(x, y, newAzimuth);
//	  }
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVehicleLengthGen(double newVehicleLength)
  {
		double oldVehicleLength = vehicleLength;
		vehicleLength = newVehicleLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH, oldVehicleLength, vehicleLength));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getVehicleWidth()
  {
		return vehicleWidth;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setVehicleWidth(double newVehicleWidth)
  {
	  setVehicleWidthGen(newVehicleWidth);
	  
//	  if(getLatestPosition() != null)
//	  {
//			double newAzimuth = getTrajectoryProvider().getAzimuthAngle();								
//			double x = getTrajectoryProvider().getLatestPosition().getXValue();
//			double y = getTrajectoryProvider().getLatestPosition().getYValue();		
//			updatePointer(x, y, newAzimuth);
//	  }
  }
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVehicleWidthGen(double newVehicleWidth)
  {
		double oldVehicleWidth = vehicleWidth;
		vehicleWidth = newVehicleWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH, oldVehicleWidth, vehicleWidth));
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
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				return getVehicleLength();
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				return getVehicleWidth();
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
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				setVehicleLength((Double)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				setVehicleWidth((Double)newValue);
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
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				setVehicleLength(VEHICLE_LENGTH_EDEFAULT);
				return;
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				setVehicleWidth(VEHICLE_WIDTH_EDEFAULT);
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
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH:
				return vehicleLength != VEHICLE_LENGTH_EDEFAULT;
			case ApogyCoreEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH:
				return vehicleWidth != VEHICLE_WIDTH_EDEFAULT;
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
		result.append(" (vehicleLength: ");
		result.append(vehicleLength);
		result.append(", vehicleWidth: ");
		result.append(vehicleWidth);
		result.append(')');
		return result.toString();
	}

  @Override
  public void updatePose(double x, double y, double zRotation) 
  {	
		super.updatePose(x, y, zRotation);
		
		// Update vehicle.
		Color vehicleColor = new Color(getVectorColor().x, getVectorColor().y, getVectorColor().z);  
		Rectangle2D rectangle = new Rectangle2D.Double(x - getVehicleLength() / 2.0 , y - getVehicleWidth() / 2.0, getVehicleLength(), getVehicleWidth());			
		
		final Shape shape = org.jfree.util.ShapeUtilities.rotateShape(rectangle, zRotation, (float) x, (float) y);	
	
		vehicleAnnotation = new XYShapeAnnotation(shape, new BasicStroke(1.0f), vehicleColor, vehicleColor);		
  }
 
  @Override
  protected void positionAndOrientPointerCoordinatesText(double x, double y, double zRotation, XYTextAnnotation xyTextAnnotation) 
  {
	  double vehiculeRadius = 1.5 * Math.sqrt(Math.pow(getVehicleWidth() / 2.0, 2.0) + Math.pow(getVehicleLength() / 2.0, 2.0));	 
	  
	  if(Math.cos(zRotation) > 0)
	  {
		  xyTextAnnotation.setTextAnchor(TextAnchor.HALF_ASCENT_RIGHT);
		  xyTextAnnotation.setRotationAnchor(TextAnchor.HALF_ASCENT_RIGHT);		  		  		 		  
		  xyTextAnnotation.setX(x - vehiculeRadius);
	  }
	  else
	  {
		  xyTextAnnotation.setTextAnchor(TextAnchor.HALF_ASCENT_LEFT);
		  xyTextAnnotation.setRotationAnchor(TextAnchor.HALF_ASCENT_LEFT);
		  xyTextAnnotation.setX(x + vehiculeRadius);
	  }		 
	  xyTextAnnotation.setRotationAngle(Math.toRadians(0));
	  
  }
  
  @Override
  public List<AbstractXYAnnotation> getXYShapeAnnotation() 
  {	
	  List<AbstractXYAnnotation> list = super.getXYShapeAnnotation();
	  	
	  if(vehicleAnnotation != null) list.add(vehicleAnnotation);
	  	
	  return list;
  }
  
} //DefaultVehicleVariableAnnotationImpl
