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

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.environment.ui.DefaultVariableTrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import org.jfree.data.xy.XYDataItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Variable Trajectory Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl#getDistanceThreshold <em>Distance Threshold</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl#getAzimuthThreshold <em>Azimuth Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultVariableTrajectoryProviderImpl extends VariableTrajectoryProviderImpl implements DefaultVariableTrajectoryProvider
{
  private Adapter poseProviderAdapter = null;  
  private Point3d previousPosition = null; 
  private double previousAzimuth = Double.NaN;
	
  /**
	 * The default value of the '{@link #getDistanceThreshold() <em>Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDistanceThreshold()
	 * @generated
	 * @ordered
	 */
  protected static final double DISTANCE_THRESHOLD_EDEFAULT = 0.5;

  /**
	 * The cached value of the '{@link #getDistanceThreshold() <em>Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDistanceThreshold()
	 * @generated
	 * @ordered
	 */
  protected double distanceThreshold = DISTANCE_THRESHOLD_EDEFAULT;

  /**
	 * The default value of the '{@link #getAzimuthThreshold() <em>Azimuth Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAzimuthThreshold()
	 * @generated
	 * @ordered
	 */
  protected static final double AZIMUTH_THRESHOLD_EDEFAULT = 0.017;

  /**
	 * The cached value of the '{@link #getAzimuthThreshold() <em>Azimuth Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAzimuthThreshold()
	 * @generated
	 * @ordered
	 */
  protected double azimuthThreshold = AZIMUTH_THRESHOLD_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DefaultVariableTrajectoryProviderImpl()
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
		return ApogyCoreEnvironmentUIPackage.Literals.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setPoseProvider(PoseProvider newPoseProvider)
  {
	  if(poseProvider != null)
	  {
		  poseProvider.eAdapters().remove(getPoseProviderAdapter());
	  }
	  
	  super.setPoseProvider(newPoseProvider);
	  
	  if(newPoseProvider != null)
	  {
		  newPoseProvider.eAdapters().add(getPoseProviderAdapter());
	  }
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getDistanceThreshold()
  {
		return distanceThreshold;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDistanceThreshold(double newDistanceThreshold)
  {
		double oldDistanceThreshold = distanceThreshold;
		distanceThreshold = newDistanceThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD, oldDistanceThreshold, distanceThreshold));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getAzimuthThreshold()
  {
		return azimuthThreshold;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAzimuthThreshold(double newAzimuthThreshold)
  {
		double oldAzimuthThreshold = azimuthThreshold;
		azimuthThreshold = newAzimuthThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD, oldAzimuthThreshold, azimuthThreshold));
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
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				return getDistanceThreshold();
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
				return getAzimuthThreshold();
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
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				setDistanceThreshold((Double)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
				setAzimuthThreshold((Double)newValue);
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
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				setDistanceThreshold(DISTANCE_THRESHOLD_EDEFAULT);
				return;
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
				setAzimuthThreshold(AZIMUTH_THRESHOLD_EDEFAULT);
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
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				return distanceThreshold != DISTANCE_THRESHOLD_EDEFAULT;
			case ApogyCoreEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
				return azimuthThreshold != AZIMUTH_THRESHOLD_EDEFAULT;
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
		result.append(" (distanceThreshold: ");
		result.append(distanceThreshold);
		result.append(", azimuthThreshold: ");
		result.append(azimuthThreshold);
		result.append(')');
		return result.toString();
	}
  
  @Override
  public void initialize() 
  {
	  super.initialize();
	  if(getVariableAnnotation() != null && getVariableAnnotation().getVariable() != null)
	  {
		  try
		  {
			  AbstractTypeImplementation abstractTypeImplementation = ApogyCoreInvocatorFacade.INSTANCE.getTypeImplementation(getVariableAnnotation().getVariable());			  
			  if(abstractTypeImplementation.getAdapterInstance() instanceof ApogySystemApiAdapter)
			  {
				  ApogySystemApiAdapter apogySystemApiAdapter = (ApogySystemApiAdapter) abstractTypeImplementation.getAdapterInstance();
				  setPoseProvider(apogySystemApiAdapter);
				  
				  // Resets pose and azimuth,						 
				  previousPosition = null;
				  previousAzimuth = Double.NaN;
				  if(apogySystemApiAdapter.getPoseTransform() != null)
				  {
					  updatePose(apogySystemApiAdapter.getPoseTransform());
				  }
			  }
		  }
		  catch(Throwable t)
		  {			 
		  }		  		  
	  }
	  
	  setTrajectoryLength(0);
  }

  protected void updatePosition(Tuple3d newPosition)
  {
	  XYDataItem xyDataItem = new XYDataItem(newPosition.getX(), newPosition.getY());
	  getXYSeries().add(xyDataItem);
	  
	  setLatestPosition(xyDataItem);	  	  	  
	  previousPosition = new Point3d(newPosition.asTuple3d());
  }
  
  protected void updateAzimuth(double newAzimuth)
  {
	  // Updates azimuth
	  setAzimuthAngle(newAzimuth);							 			 
	  previousAzimuth = newAzimuth;
  }
  
  /**
   * Updates the trajectory using the new pose and based on the current thresholds for position and azimuth.
   * @param newPose The new pose.
   */
  protected void updatePose(Matrix4x4 newPose)
  {
	  Tuple3d position = ApogyCommonMathFacade.INSTANCE.extractPosition(newPose);
	  Tuple3d orientation = ApogyCommonMathFacade.INSTANCE.extractOrientation(newPose);	
	  
	  if(previousPosition == null)
	  {
		  updatePosition(position);
	  }
	  else
	  {
		  Point3d currentPosition = new Point3d(position.asTuple3d());		  
		  double distance = previousPosition.distance(currentPosition);		  
		  if(distance >= getDistanceThreshold())
		  {
			  setTrajectoryLength(getTrajectoryLength() + distance); 
			  updatePosition(position);
		  }
	  }	
	  
	  double currentAzimuth = orientation.getZ();
	  if(Double.isNaN(previousAzimuth) || Math.abs(previousAzimuth - currentAzimuth) > Math.abs(getAzimuthThreshold()))
	  {
		  updateAzimuth(currentAzimuth);
	 }	  
  }
  
  protected Adapter getPoseProviderAdapter()
  {
	  if(poseProviderAdapter == null)
	  {
		  poseProviderAdapter = new AdapterImpl()
		  {
			  @Override
			  public void notifyChanged(Notification msg) 
			  {
				  if(msg.getFeatureID(PoseProvider.class) == ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM)
				  {					  					  
					  if(msg.getNewValue() instanceof Matrix4x4)
					  {
						  Matrix4x4 newPose = (Matrix4x4) msg.getNewValue();
						  						 				
						  updatePose(newPose);
					  }
				  }					  
			  }  
		  };
	  }
	  
	  return poseProviderAdapter;
  }
} //DefaultVariableTrajectoryProviderImpl
