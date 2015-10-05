/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.impl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Line2D;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.ui.TextAnchor;

import ca.gc.asc_csa.symphony.core.PoseProvider;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.environment.ui.PoseVariableAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIFactory;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.PoseVariableAnnotationImpl#getVectorlength <em>Vectorlength</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.PoseVariableAnnotationImpl#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.PoseVariableAnnotationImpl#isShowPose <em>Show Pose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PoseVariableAnnotationImpl extends AbstractVariableAnnotationImpl implements PoseVariableAnnotation
{	
  private Adapter poseProviderAdapter = null;  
	
  public static final String DEGREE_STRING = 	"\u00b0";
	
  private XYShapeAnnotation pointerLine = null;
  private XYShapeAnnotation pointerArrowHead1 = null;
  private XYShapeAnnotation pointerArrowHead2 = null;
  private XYTextAnnotation pointerCoordinatesText = null;
	  
  public static final double ARROW_HEAD_LENGHT = 2.0;
  public static final double ARROW_HEAD_ANGLE_RADIANS = Math.toRadians(45.0);	
  
  private DecimalFormat positionDecimalFormat = new DecimalFormat("0.00");
  private DecimalFormat azimuthDecimalFormat = new DecimalFormat("0.0");

  /**
	 * The default value of the '{@link #getVectorlength() <em>Vectorlength</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVectorlength()
	 * @generated
	 * @ordered
	 */
  protected static final double VECTORLENGTH_EDEFAULT = 10.0;

  /**
	 * The cached value of the '{@link #getVectorlength() <em>Vectorlength</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVectorlength()
	 * @generated
	 * @ordered
	 */
  protected double vectorlength = VECTORLENGTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
  protected static final Color3f VECTOR_COLOR_EDEFAULT = (Color3f)SymphonyEnvironmentUIFactory.eINSTANCE.createFromString(SymphonyEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,0.0,1.0");

  /**
	 * The cached value of the '{@link #getVectorColor() <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVectorColor()
	 * @generated
	 * @ordered
	 */
  protected Color3f vectorColor = VECTOR_COLOR_EDEFAULT;

  /**
	 * The default value of the '{@link #isShowPose() <em>Show Pose</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isShowPose()
	 * @generated
	 * @ordered
	 */
  protected static final boolean SHOW_POSE_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isShowPose() <em>Show Pose</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isShowPose()
	 * @generated
	 * @ordered
	 */
  protected boolean showPose = SHOW_POSE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PoseVariableAnnotationImpl()
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
		return SymphonyEnvironmentUIPackage.Literals.POSE_VARIABLE_ANNOTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getVectorlength()
  {
		return vectorlength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVectorlength(double newVectorlength)
  {
		double oldVectorlength = vectorlength;
		vectorlength = newVectorlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH, oldVectorlength, vectorlength));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Color3f getVectorColor()
  {
		return vectorColor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVectorColor(Color3f newVectorColor)
  {
		Color3f oldVectorColor = vectorColor;
		vectorColor = newVectorColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR, oldVectorColor, vectorColor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isShowPose()
  {
		return showPose;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setShowPose(boolean newShowPose)
  {
	  setShowPoseGen(newShowPose);
	  
	  // TODO Update pointer
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setShowPoseGen(boolean newShowPose)
  {
		boolean oldShowPose = showPose;
		showPose = newShowPose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE, oldShowPose, showPose));
	}

   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void updatePose(double x, double y, double zRotation) 
	{
		  double thetha = zRotation;
			 
		  // Bug at theta = 0.0;
		  if(thetha == 0)
		  {
			  // thetha = (Math.PI / 2.0) + Math.toRadians(0.1);
			  thetha +=Math.toRadians(0.1);
		  }				  
			 
		  // If the pointer lengh is not zero, draws it.
		  if(getVectorlength() > 0)
		  {
			  double xEnd = x + getVectorlength() * Math.cos(thetha);
			  double yEnd = y + getVectorlength() * Math.sin(thetha);
			
			  Color vectorColor = new Color(getVectorColor().x, getVectorColor().y, getVectorColor().z);  	  	  
			  Line2D line = new Line2D.Double(x,y, xEnd, yEnd);		  	  
			  pointerLine = new XYShapeAnnotation(line, new BasicStroke(1.0f), vectorColor);		  
			     
			  //Adds the Arrow head
			  double offsetAngle = Math.PI - (ARROW_HEAD_ANGLE_RADIANS / 2.0);
			
			  double xArrow1 = xEnd + ARROW_HEAD_LENGHT * Math.cos(thetha + offsetAngle);
			  double yArrow1 = yEnd + ARROW_HEAD_LENGHT * Math.sin(thetha + offsetAngle);
			  Line2D arrow1 = new Line2D.Double(xEnd, yEnd, xArrow1, yArrow1);
			  pointerArrowHead1 = new XYShapeAnnotation(arrow1, new BasicStroke(1.0f), vectorColor);
			    
			  double xArrow2 = xEnd + ARROW_HEAD_LENGHT * Math.cos(thetha - offsetAngle);
			  double yArrow2 = yEnd + ARROW_HEAD_LENGHT * Math.sin(thetha - offsetAngle);
			  Line2D arrow2 = new Line2D.Double(xEnd, yEnd, xArrow2, yArrow2);
			  pointerArrowHead2 = new XYShapeAnnotation(arrow2, new BasicStroke(1.0f), vectorColor);
		  }
		  else
		  {
			  pointerLine = null;
			  pointerArrowHead1 = null;
			  pointerArrowHead2 = null;
		  }
		  
		  // Coordinates text.
		  if(isShowPose())
		  {
			  pointerCoordinatesText = createPointerCoordinatesText(x,y,zRotation);
			  positionAndOrientPointerCoordinatesText(x,y,zRotation, pointerCoordinatesText);
		  }
		  else
		  {
			  pointerCoordinatesText = null;
		  }
		  
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
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				return getVectorlength();
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				return getVectorColor();
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				return isShowPose();
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
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				setVectorlength((Double)newValue);
				return;
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				setVectorColor((Color3f)newValue);
				return;
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				setShowPose((Boolean)newValue);
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
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				setVectorlength(VECTORLENGTH_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				setVectorColor(VECTOR_COLOR_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				setShowPose(SHOW_POSE_EDEFAULT);
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
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTORLENGTH:
				return vectorlength != VECTORLENGTH_EDEFAULT;
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__VECTOR_COLOR:
				return VECTOR_COLOR_EDEFAULT == null ? vectorColor != null : !VECTOR_COLOR_EDEFAULT.equals(vectorColor);
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION__SHOW_POSE:
				return showPose != SHOW_POSE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE:
				updatePose((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
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
		result.append(" (vectorlength: ");
		result.append(vectorlength);
		result.append(", vectorColor: ");
		result.append(vectorColor);
		result.append(", showPose: ");
		result.append(showPose);
		result.append(')');
		return result.toString();
	}
  
  @Override
  public List<AbstractXYAnnotation> getXYShapeAnnotation() 
  {	  
	  List<AbstractXYAnnotation> list = new ArrayList<AbstractXYAnnotation>();
	  
	  if(pointerLine != null) list.add(pointerLine);
	  if(pointerArrowHead1 != null) list.add(pointerArrowHead1);
	  if(pointerArrowHead2 != null) list.add(pointerArrowHead2);
	  if(pointerCoordinatesText != null) list.add(pointerCoordinatesText);
	  
	  return list;
  } 
  
  @Override
  public void updatePose(Matrix4x4 newPose) 
  {
	  Tuple3d position = MathFacade.INSTANCE.extractPosition(newPose);
	  Tuple3d orientation = MathFacade.INSTANCE.extractOrientation(newPose);		  
	  double currentAzimuth = orientation.getZ();
	 
	  updatePose(position.getX(), position.getY(), currentAzimuth);
  }
  
  @Override
  public void setSymphonySystemApiAdapter(SymphonySystemApiAdapter newSymphonySystemApiAdapter) 
  {	
	  super.setSymphonySystemApiAdapter(newSymphonySystemApiAdapter);
	
	  // Updates pose to show the initial position.
	  if(newSymphonySystemApiAdapter != null)
	  {
		  if(newSymphonySystemApiAdapter.getPoseTransform() != null)
		  {
			  updatePose(newSymphonySystemApiAdapter.getPoseTransform());
		  }
	  }
  }
  
  /**
   * Creates the XYTextAnnotation representing the position and orientation of the TrajectoryProvider.
   * @param x The X position coordinates, in meters.
   * @param y The Y position coordinates, in meters.
   * @param zRotation The Z orientation, in radians.
   * @return The XYTextAnnotation.
   */
  protected XYTextAnnotation createPointerCoordinatesText(final double x, final double y, final double zRotation)
  {	  
	  XYTextAnnotation xyTextAnnotation = new XYTextAnnotation("(" + positionDecimalFormat.format(x) + "m , " + 
				positionDecimalFormat.format(y) + "m , " + 
				azimuthDecimalFormat.format(Math.toDegrees(zRotation)) + DEGREE_STRING +")",
				x, y);
	
	  Color vectorColor = new Color(getVectorColor().x, getVectorColor().y, getVectorColor().z);  
	  
	  xyTextAnnotation.setFont(new Font("SansSerif", Font.BOLD, 11));
	  xyTextAnnotation.setPaint(vectorColor);
	  	  
	  return xyTextAnnotation;
  }
  
  /**
   * Position and orient the XYTextAnnotation representing the position and orientation of the TrajectoryProvider.
   * @param x The X position coordinates, in meters.
   * @param y The Y position coordinates, in meters.
   * @param zRotation The Z orientation, in radians.
   * @param xyTextAnnotation The XYTextAnnotation representing the position and orientation of the TrajectoryProvider, should not be null.
   */
  protected void positionAndOrientPointerCoordinatesText(final double x, final double y, final double zRotation, final XYTextAnnotation xyTextAnnotation)
  {
	  if(Math.cos(zRotation) > 0)
	  {
		  xyTextAnnotation.setTextAnchor(TextAnchor.HALF_ASCENT_RIGHT);
		  xyTextAnnotation.setRotationAnchor(TextAnchor.HALF_ASCENT_RIGHT);
	  }
	  else
	  {
		  xyTextAnnotation.setTextAnchor(TextAnchor.HALF_ASCENT_LEFT);
		  xyTextAnnotation.setRotationAnchor(TextAnchor.HALF_ASCENT_LEFT);
	  }		 
	  xyTextAnnotation.setRotationAngle(Math.toRadians(0));
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
} //PoseVariableAnnotationImpl
