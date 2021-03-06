package ca.gc.asc_csa.apogy.core.environment.ui;
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
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getLatestPosition <em>Latest Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getAzimuthAngle <em>Azimuth Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getTrajectoryLength <em>Trajectory Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getTrajectoryColor <em>Trajectory Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getTrajectoryProvider()
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
	 * Latest x coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latest Position</em>' attribute.
	 * @see #setLatestPosition(XYDataItem)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getTrajectoryProvider_LatestPosition()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.ui.XYDataItem" transient="true"
	 * @generated
	 */
  XYDataItem getLatestPosition();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getLatestPosition <em>Latest Position</em>}' attribute.
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
	 * The azimuth of the latest position, in radians, as measured relative to the x axis, positive clockwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth Angle</em>' attribute.
	 * @see #setAzimuthAngle(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getTrajectoryProvider_AzimuthAngle()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
  double getAzimuthAngle();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getAzimuthAngle <em>Azimuth Angle</em>}' attribute.
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
	 * The current length of the trajectory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory Length</em>' attribute.
	 * @see #setTrajectoryLength(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getTrajectoryProvider_TrajectoryLength()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'"
	 * @generated
	 */
  double getTrajectoryLength();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getTrajectoryLength <em>Trajectory Length</em>}' attribute.
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
	 * The color of the ruler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory Color</em>' attribute.
	 * @see #setTrajectoryColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getTrajectoryProvider_TrajectoryColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.ui.Color3f"
	 * @generated
	 */
  Color3f getTrajectoryColor();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider#getTrajectoryColor <em>Trajectory Color</em>}' attribute.
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
	 * Re-initialize the TrajectoryProvider.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void initialize();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clears the list of points and associated trajectory.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void clear();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the current trajectory as a list of Point2d.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.ui.List<ca.gc.asc_csa.apogy.core.environment.ui.Point2d>" unique="false" many="false"
	 * @generated
	 */
  List<Point2d> asListOfPoint2d();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The XYSeries containing the trajectory data to be displayed.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.ui.XYSeries" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  XYSeries getXYSeries();

} // TrajectoryProvider
