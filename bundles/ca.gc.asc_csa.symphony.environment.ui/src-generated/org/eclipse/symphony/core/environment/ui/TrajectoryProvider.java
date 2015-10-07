/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point2d;

import org.eclipse.emf.ecore.EObject;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for classes providing a trajectory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getLatestPosition <em>Latest Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getAzimuthAngle <em>Azimuth Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryLength <em>Trajectory Length</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryColor <em>Trajectory Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getTrajectoryProvider()
 * @model abstract="true"
 * @generated
 */
public interface TrajectoryProvider extends EObject
{
  /**
	 * Returns the value of the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Latest x coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latest Position</em>' attribute.
	 * @see #setLatestPosition(XYDataItem)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getTrajectoryProvider_LatestPosition()
	 * @model unique="false" dataType="org.eclipse.symphony.core.environment.ui.XYDataItem" transient="true"
	 * @generated
	 */
  XYDataItem getLatestPosition();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getLatestPosition <em>Latest Position</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Position</em>' attribute.
	 * @see #getLatestPosition()
	 * @generated
	 */
  void setLatestPosition(XYDataItem value);

  /**
	 * Returns the value of the '<em><b>Azimuth Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The azimuth of the latest position, in radians, as measured relative to the x axis, positive clockwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth Angle</em>' attribute.
	 * @see #setAzimuthAngle(double)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getTrajectoryProvider_AzimuthAngle()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getAzimuthAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getAzimuthAngle <em>Azimuth Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Angle</em>' attribute.
	 * @see #getAzimuthAngle()
	 * @generated
	 */
  void setAzimuthAngle(double value);

  /**
	 * Returns the value of the '<em><b>Trajectory Length</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The current length of the trajectory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory Length</em>' attribute.
	 * @see #setTrajectoryLength(double)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getTrajectoryProvider_TrajectoryLength()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
  double getTrajectoryLength();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryLength <em>Trajectory Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory Length</em>' attribute.
	 * @see #getTrajectoryLength()
	 * @generated
	 */
  void setTrajectoryLength(double value);

  /**
	 * Returns the value of the '<em><b>Trajectory Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The color of the ruler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory Color</em>' attribute.
	 * @see #setTrajectoryColor(Color3f)
	 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getTrajectoryProvider_TrajectoryColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="org.eclipse.symphony.core.environment.ui.Color3f"
	 * @generated
	 */
  Color3f getTrajectoryColor();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryColor <em>Trajectory Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory Color</em>' attribute.
	 * @see #getTrajectoryColor()
	 * @generated
	 */
  void setTrajectoryColor(Color3f value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Re-initialize the TrajectoryProvider.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void initialize();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Clears the list of points and associated trajectory.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void clear();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Returns the current trajectory as a list of Point2d.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.ui.List<org.eclipse.symphony.core.environment.ui.Point2d>" unique="false" many="false"
	 * @generated
	 */
  List<Point2d> asListOfPoint2d();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The XYSeries containing the trajectory data to be displayed.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.environment.ui.XYSeries" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  XYSeries getXYSeries();

} // TrajectoryProvider
