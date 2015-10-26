/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.jfree.data.xy.XYDataItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Variable Trajectory Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl#getDistanceThreshold <em>Distance Threshold</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl#getAzimuthThreshold <em>Azimuth Threshold</em>}</li>
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
		return SymphonyEnvironmentUIPackage.Literals.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD, oldDistanceThreshold, distanceThreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD, oldAzimuthThreshold, azimuthThreshold));
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
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				return getDistanceThreshold();
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
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
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				setDistanceThreshold((Double)newValue);
				return;
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
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
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				setDistanceThreshold(DISTANCE_THRESHOLD_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
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
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD:
				return distanceThreshold != DISTANCE_THRESHOLD_EDEFAULT;
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD:
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
			  AbstractTypeImplementation abstractTypeImplementation = EMFEcoreInvocatorFacade.INSTANCE.getTypeImplementation(getVariableAnnotation().getVariable());			  
			  if(abstractTypeImplementation.getAdapterInstance() instanceof SymphonySystemApiAdapter)
			  {
				  SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter) abstractTypeImplementation.getAdapterInstance();
				  setPoseProvider(symphonySystemApiAdapter);
				  
				  // Resets pose and azimuth,						 
				  previousPosition = null;
				  previousAzimuth = Double.NaN;
				  if(symphonySystemApiAdapter.getPoseTransform() != null)
				  {
					  updatePose(symphonySystemApiAdapter.getPoseTransform());
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
	  Tuple3d position = MathFacade.INSTANCE.extractPosition(newPose);
	  Tuple3d orientation = MathFacade.INSTANCE.extractOrientation(newPose);	
	  
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
				  if(msg.getFeatureID(PoseProvider.class) == SymphonyCorePackage.POSE_PROVIDER__POSE_TRANSFORM)
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
