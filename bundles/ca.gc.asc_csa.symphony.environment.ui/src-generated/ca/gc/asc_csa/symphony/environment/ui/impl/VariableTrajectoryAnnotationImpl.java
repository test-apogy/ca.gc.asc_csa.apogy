/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point2d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;

import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIFactory;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import ca.gc.asc_csa.symphony.environment.ui.TrajectoryProvider;
import ca.gc.asc_csa.symphony.environment.ui.VariableTrajectoryAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.VariableTrajectoryProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Trajectory Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.VariableTrajectoryAnnotationImpl#getLatestPosition <em>Latest Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.VariableTrajectoryAnnotationImpl#getAzimuthAngle <em>Azimuth Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.VariableTrajectoryAnnotationImpl#getTrajectoryLength <em>Trajectory Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.VariableTrajectoryAnnotationImpl#getTrajectoryColor <em>Trajectory Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.VariableTrajectoryAnnotationImpl#getTrajectoryProvider <em>Trajectory Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableTrajectoryAnnotationImpl extends AbstractVariableAnnotationImpl implements VariableTrajectoryAnnotation
{
  protected Adapter variableTrajectoryProviderAdapter = null;
	
  /**
	 * The default value of the '{@link #getLatestPosition() <em>Latest Position</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatestPosition()
	 * @generated
	 * @ordered
	 */
  protected static final XYDataItem LATEST_POSITION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLatestPosition() <em>Latest Position</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatestPosition()
	 * @generated
	 * @ordered
	 */
  protected XYDataItem latestPosition = LATEST_POSITION_EDEFAULT;

  /**
	 * The default value of the '{@link #getAzimuthAngle() <em>Azimuth Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAzimuthAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double AZIMUTH_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getAzimuthAngle() <em>Azimuth Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAzimuthAngle()
	 * @generated
	 * @ordered
	 */
  protected double azimuthAngle = AZIMUTH_ANGLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getTrajectoryLength() <em>Trajectory Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrajectoryLength()
	 * @generated
	 * @ordered
	 */
  protected static final double TRAJECTORY_LENGTH_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getTrajectoryLength() <em>Trajectory Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrajectoryLength()
	 * @generated
	 * @ordered
	 */
  protected double trajectoryLength = TRAJECTORY_LENGTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getTrajectoryColor() <em>Trajectory Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrajectoryColor()
	 * @generated
	 * @ordered
	 */
  protected static final Color3f TRAJECTORY_COLOR_EDEFAULT = (Color3f)SymphonyEnvironmentUIFactory.eINSTANCE.createFromString(SymphonyEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");

  /**
	 * The cached value of the '{@link #getTrajectoryColor() <em>Trajectory Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrajectoryColor()
	 * @generated
	 * @ordered
	 */
  protected Color3f trajectoryColor = TRAJECTORY_COLOR_EDEFAULT;

  /**
	 * The cached value of the '{@link #getTrajectoryProvider() <em>Trajectory Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrajectoryProvider()
	 * @generated
	 * @ordered
	 */
  protected VariableTrajectoryProvider trajectoryProvider;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableTrajectoryAnnotationImpl()
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
		return SymphonyEnvironmentUIPackage.Literals.VARIABLE_TRAJECTORY_ANNOTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public XYDataItem getLatestPosition()
  {
		return latestPosition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLatestPosition(XYDataItem newLatestPosition)
  {
		XYDataItem oldLatestPosition = latestPosition;
		latestPosition = newLatestPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION, oldLatestPosition, latestPosition));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getAzimuthAngle()
  {
		return azimuthAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAzimuthAngle(double newAzimuthAngle)
  {
		double oldAzimuthAngle = azimuthAngle;
		azimuthAngle = newAzimuthAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE, oldAzimuthAngle, azimuthAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getTrajectoryLength()
  {
		return trajectoryLength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTrajectoryLength(double newTrajectoryLength)
  {
		double oldTrajectoryLength = trajectoryLength;
		trajectoryLength = newTrajectoryLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH, oldTrajectoryLength, trajectoryLength));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableTrajectoryProvider getTrajectoryProvider()
  {
		return trajectoryProvider;
	}

  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTrajectoryProvider(VariableTrajectoryProvider newTrajectoryProvider, NotificationChain msgs)
  {
		VariableTrajectoryProvider oldTrajectoryProvider = trajectoryProvider;
		trajectoryProvider = newTrajectoryProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER, oldTrajectoryProvider, newTrajectoryProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setTrajectoryProvider(VariableTrajectoryProvider newTrajectoryProvider)
  {
	  if(getTrajectoryProvider() != null)
	  {
		  getTrajectoryProvider().eAdapters().remove(getVariableTrajectoryProviderAdapter());		  		 
	  }
	  
	  setTrajectoryProviderGen(newTrajectoryProvider);
	  
	  if(newTrajectoryProvider != null)
	  {
		  newTrajectoryProvider.eAdapters().add(getVariableTrajectoryProviderAdapter());
		  setLatestPosition(newTrajectoryProvider.getLatestPosition());
		  setTrajectoryLength(newTrajectoryProvider.getTrajectoryLength());
		  setAzimuthAngle(newTrajectoryProvider.getAzimuthAngle());
	  }
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTrajectoryProviderGen(VariableTrajectoryProvider newTrajectoryProvider)
  {
		if (newTrajectoryProvider != trajectoryProvider) {
			NotificationChain msgs = null;
			if (trajectoryProvider != null)
				msgs = ((InternalEObject)trajectoryProvider).eInverseRemove(this, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION, VariableTrajectoryProvider.class, msgs);
			if (newTrajectoryProvider != null)
				msgs = ((InternalEObject)newTrajectoryProvider).eInverseAdd(this, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION, VariableTrajectoryProvider.class, msgs);
			msgs = basicSetTrajectoryProvider(newTrajectoryProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER, newTrajectoryProvider, newTrajectoryProvider));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void initialize()
  {
	  if(getTrajectoryProvider() != null)
	  {
		  getTrajectoryProvider().initialize();
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void clear()
  {
	  if(getTrajectoryProvider() != null)
	  {
		  getTrajectoryProvider().clear();
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public List<Point2d> asListOfPoint2d()
  {
	  if(getTrajectoryProvider() != null)
	  {
		  return getTrajectoryProvider().asListOfPoint2d();
	  }
	  else
	  {
		  return new ArrayList<Point2d>();		  
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public XYSeries getXYSeries()
  {
	  if(getTrajectoryProvider() != null)
	  {
		  return getTrajectoryProvider().getXYSeries();
	  }
	  else
	  {
		  return null;		  
	  }
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Color3f getTrajectoryColor()
  {
		return trajectoryColor;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setTrajectoryColor(Color3f newTrajectoryColor)
  {
	  setTrajectoryColorGen(newTrajectoryColor);
	  
	  if(getTrajectoryProvider() != null)
	  {
		  getTrajectoryProvider().setTrajectoryColor(newTrajectoryColor);
	  }
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTrajectoryColorGen(Color3f newTrajectoryColor)
  {
		Color3f oldTrajectoryColor = trajectoryColor;
		trajectoryColor = newTrajectoryColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR, oldTrajectoryColor, trajectoryColor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER:
				if (trajectoryProvider != null)
					msgs = ((InternalEObject)trajectoryProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER, null, msgs);
				return basicSetTrajectoryProvider((VariableTrajectoryProvider)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER:
				return basicSetTrajectoryProvider(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION:
				return getLatestPosition();
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE:
				return getAzimuthAngle();
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH:
				return getTrajectoryLength();
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR:
				return getTrajectoryColor();
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER:
				return getTrajectoryProvider();
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION:
				setLatestPosition((XYDataItem)newValue);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE:
				setAzimuthAngle((Double)newValue);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH:
				setTrajectoryLength((Double)newValue);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR:
				setTrajectoryColor((Color3f)newValue);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER:
				setTrajectoryProvider((VariableTrajectoryProvider)newValue);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION:
				setLatestPosition(LATEST_POSITION_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE:
				setAzimuthAngle(AZIMUTH_ANGLE_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH:
				setTrajectoryLength(TRAJECTORY_LENGTH_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR:
				setTrajectoryColor(TRAJECTORY_COLOR_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER:
				setTrajectoryProvider((VariableTrajectoryProvider)null);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION:
				return LATEST_POSITION_EDEFAULT == null ? latestPosition != null : !LATEST_POSITION_EDEFAULT.equals(latestPosition);
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE:
				return azimuthAngle != AZIMUTH_ANGLE_EDEFAULT;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH:
				return trajectoryLength != TRAJECTORY_LENGTH_EDEFAULT;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR:
				return TRAJECTORY_COLOR_EDEFAULT == null ? trajectoryColor != null : !TRAJECTORY_COLOR_EDEFAULT.equals(trajectoryColor);
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER:
				return trajectoryProvider != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == TrajectoryProvider.class) {
			switch (derivedFeatureID) {
				case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION: return SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION;
				case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE: return SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE;
				case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH: return SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH;
				case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR: return SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == TrajectoryProvider.class) {
			switch (baseFeatureID) {
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION;
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE;
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH;
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
		if (baseClass == TrajectoryProvider.class) {
			switch (baseOperationID) {
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER___INITIALIZE: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___INITIALIZE;
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER___CLEAR: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___CLEAR;
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___AS_LIST_OF_POINT2D;
				case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER___GET_XY_SERIES: return SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___GET_XY_SERIES;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___INITIALIZE:
				initialize();
				return null;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___CLEAR:
				clear();
				return null;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___AS_LIST_OF_POINT2D:
				return asListOfPoint2d();
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION___GET_XY_SERIES:
				return getXYSeries();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (latestPosition: ");
		result.append(latestPosition);
		result.append(", azimuthAngle: ");
		result.append(azimuthAngle);
		result.append(", trajectoryLength: ");
		result.append(trajectoryLength);
		result.append(", trajectoryColor: ");
		result.append(trajectoryColor);
		result.append(')');
		return result.toString();
	}  
  
  @Override
  public void setSymphonySystemApiAdapter(SymphonySystemApiAdapter newSymphonySystemApiAdapter) 
  {
	  super.setSymphonySystemApiAdapter(newSymphonySystemApiAdapter);
	  if(getTrajectoryProvider() != null)
	  {
		  getTrajectoryProvider().setPoseProvider(newSymphonySystemApiAdapter);
	  }
  }

  @Override
  public List<AbstractXYAnnotation> getXYShapeAnnotation() 
  {
	  return new ArrayList<AbstractXYAnnotation>();
  }
  
  @Override
  public void updatePose(Matrix4x4 newPose) 
  {	
	  // Nothing to do here.
  }
    
  
  private Adapter getVariableTrajectoryProviderAdapter() 
  {
	  if(variableTrajectoryProviderAdapter == null)
	  {
		  variableTrajectoryProviderAdapter = new AdapterImpl()
		  {
			@Override
			public void notifyChanged(Notification msg)
			{
				if(msg.getFeatureID(TrajectoryProvider.class) == SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION)
				{
					setLatestPosition((XYDataItem) msg.getNewValue());
				}
				else if(msg.getFeatureID(TrajectoryProvider.class) == SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH)
				{
					setTrajectoryLength(msg.getNewDoubleValue());
				}
				else if(msg.getFeatureID(TrajectoryProvider.class) == SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE)
				{
					setAzimuthAngle(msg.getNewDoubleValue());
				}
			}  
		  };
	  }
	  return variableTrajectoryProviderAdapter;
  }
  
  
} //VariableTrajectoryAnnotationImpl
